package com.ktdsuniversity.edu.generics.hw.hw1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ReserveMain {

	public static void reservation(Map<Integer, List<SitVO>> flight) {
		Scanner sc = new Scanner(System.in);
		reservationFlight(flight, sc);
	}

	private static void reservationFlight(Map<Integer, List<SitVO>> flight, Scanner sc) {
		int flightNum = selectFlight(flight, sc);
		List<SitVO> sits = flight.get(flightNum);

		int availableSeats = printCurrentReservation(flightNum, sits);

		if (availableSeats == 0) {
			System.out.println("예약 가능한 좌석이 없습니다. 다른 비행기 편을 이용해 주세요.");
			reservationFlight(flight, sc);
			return;
		}
		SitVO selectedSit = selectSit(sits, sc);

		reservationSit(flight, flightNum, selectedSit, sc);
	}

	private static int selectFlight(Map<Integer, List<SitVO>> flight, Scanner sc) {
		System.out.println("비행기 편의 이름을 입력하면, 좌석 현황을 볼 수 있습니다.");
		System.out.print("비행기 편의 이름을 입력하세요: ");
		int flightNum = sc.nextInt();

		while (!flight.containsKey(flightNum)) {
			System.out.println("\"" + String.format("%04d", flightNum) + "\" 편은 존재하지 않습니다.");
			System.out.print("다른 비행기 편의 이름을 입력하세요: ");
			flightNum = sc.nextInt();
		}
		return flightNum;
	}

	private static int printCurrentReservation(int flightNum, List<SitVO> sits) {
		int count = 0;
		System.out.println("\"" + String.format("%04d", flightNum) + "\" 편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)");

		for (int i = 0; i < sits.size(); i++) {
			SitVO sit = sits.get(i);
			System.out.print(sit.getSitNum() + ": ");
			if (sit.getIsReserve() == Seat.RESERVATION) {
				System.out.print("X");
			} else {
				System.out.print("O");
			}

			if (i < sits.size() - 1)
				System.out.print(", ");
			if (sit.getIsReserve() == Seat.UNRESERVATION)
				count++;
		}
		System.out.println();
		System.out.println();
		return count;
	}

	private static SitVO selectSit(List<SitVO> sits, Scanner sc) {
		System.out.print("좌석 예약을 하려면 번호를 입력하세요: ");
		while (true) {
			int sitNum = sc.nextInt();
			SitVO findSit = checkSit(sits, sitNum);

			if (findSit == null) {
				System.out.println("존재하지 않는 좌석 번호입니다. 다시 입력하세요.");
			} else if (findSit.getIsReserve() == Seat.RESERVATION) {
				System.out.print("\"" + sitNum + "\"번 좌석은 이미 예약된 좌석입니다. 다른 좌석을 입력하세요: ");
			} else {
				return findSit;
			}
		}
	}

	private static SitVO checkSit(List<SitVO> sits, int sitNum) {
		for (int i = 0; i < sits.size(); i++) {
			SitVO sit = sits.get(i);
			if (sit.getSitNum() == sitNum) {
				return sit;
			}
		}
		return null;
	}

	private static void reservationSit(Map<Integer, List<SitVO>> flight, int flightNum, SitVO sit, Scanner sc) {
		System.out.print(sit.getSitNum() + "번 좌석을 예약하시겠습니까? (y/n): ");
		String yesOrNo = sc.next();

		// equalsIgnoreCase 대소문자 무시
		if (yesOrNo.equalsIgnoreCase("y")) {
			sit.setIsReserve(Seat.RESERVATION);
			System.out.println(sit.getSitNum() + "번 좌석 예약이 완료되었습니다.");
		} else {
			System.out.println(sit.getSitNum() + "번 좌석 예약이 취소되었습니다.");
		}
		System.out.println();

		reservationFlight(flight, sc);
	}

	public static void main(String[] args) {
		List<SitVO> sits1 = new ArrayList<>();
		sits1.add(new SitVO(1, Seat.RESERVATION));
		sits1.add(new SitVO(2, Seat.UNRESERVATION));
		sits1.add(new SitVO(3, Seat.UNRESERVATION));
		sits1.add(new SitVO(4, Seat.RESERVATION));
		sits1.add(new SitVO(5, Seat.UNRESERVATION));
		sits1.add(new SitVO(6, Seat.RESERVATION));
		sits1.add(new SitVO(7, Seat.RESERVATION));
		sits1.add(new SitVO(8, Seat.UNRESERVATION));
		sits1.add(new SitVO(9, Seat.UNRESERVATION));

		List<SitVO> sits2 = new ArrayList<>();
		sits2.add(new SitVO(1, Seat.RESERVATION));
		sits2.add(new SitVO(2, Seat.RESERVATION));
		sits2.add(new SitVO(3, Seat.RESERVATION));
		sits2.add(new SitVO(4, Seat.RESERVATION));
		sits2.add(new SitVO(5, Seat.RESERVATION));
		sits2.add(new SitVO(6, Seat.RESERVATION));
		sits2.add(new SitVO(7, Seat.RESERVATION));
		sits2.add(new SitVO(8, Seat.RESERVATION));
		sits2.add(new SitVO(9, Seat.RESERVATION));

		Map<Integer, List<SitVO>> flight = new HashMap<>();
		flight.put(1, sits1);
		flight.put(2, sits2);

		reservation(flight);

	}
}
