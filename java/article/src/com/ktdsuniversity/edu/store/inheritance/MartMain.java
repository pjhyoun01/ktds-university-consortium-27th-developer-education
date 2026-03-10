package com.ktdsuniversity.edu.store.inheritance;

import com.ktdsuniversity.edu.store.inheritance.VO.CustomerVO;
import com.ktdsuniversity.edu.store.inheritance.VO.ProductVO;
import com.ktdsuniversity.edu.store.inheritance.VO.StoreVO;
import com.ktdsuniversity.edu.store.inheritance.dto.PaymentInfoDTO;
import com.ktdsuniversity.edu.store.inheritance.exceptions.DeficientAmountException;
import com.ktdsuniversity.edu.store.inheritance.exceptions.WrongOrderQuantityException;
import com.ktdsuniversity.edu.store.inheritance.membershiplevel.VIP;
import com.ktdsuniversity.edu.store.inheritance.membershiplevel.VVIP;
import com.ktdsuniversity.edu.store.inheritance.service.imple.BasicStore;
import com.ktdsuniversity.edu.store.inheritance.service.imple.ConvenienceStoreImpl;
import com.ktdsuniversity.edu.store.inheritance.service.imple.DepartmentStoreImpl;
import com.ktdsuniversity.edu.store.inheritance.service.imple.NormalStoreImpl;

public class MartMain {
	public static void main(String[] args) {

		ProductVO[] normProducts = { 
				new ProductVO("새우깡", 1_500), 
				new ProductVO("허니버터칩", 2_300),
				new ProductVO("포카칩", 1_600), 
				new ProductVO("스윙칩", 1_900), 
				new ProductVO("홈런볼", 1_800)};
		
		ProductVO[] convProducts = { 
				new ProductVO("소 갈비", 30_000), 
				new ProductVO("소 안심", 50_000),
				new ProductVO("소 살치", 40_000), 
				new ProductVO("돼지 삼겹", 15_000), 
				new ProductVO("돼지 목살", 17_000)};
		
		ProductVO[] Deptroducts = { 
				new ProductVO("샤넬 코트", 8_300_000), 
				new ProductVO("디올 향수", 420_000),
				new ProductVO("톰브라운 정장", 6_500_000), 
				new ProductVO("롤렉스 시계", 10_300_000), 
				new ProductVO("루이비통 지갑", 740_000)};

		CustomerVO cust1 = new CustomerVO("박재현", 10_000);
		CustomerVO cust2 = new VIP("김재현", 180_000, 3_000);
		CustomerVO cust3 = new VVIP("이재현", 20_000_000, 200_000);
		CustomerVO cust4 = new VVIP("장재현", 20_000_000, 200_000);

		StoreVO store1 = new StoreVO("칠성 슈퍼", 100_000);
		StoreVO store2 = new StoreVO("gs 25", 300_000);
		StoreVO store3 = new StoreVO("김포 현대 아울렛", 30_000_000);

		BasicStore norm = new NormalStoreImpl(store1, normProducts);
		BasicStore conv = new ConvenienceStoreImpl(store2, convProducts);
		BasicStore dept = new DepartmentStoreImpl(store3, Deptroducts);

		try {
			norm.sell(new PaymentInfoDTO(cust1, 4_800, 4, 4));
		} catch (DeficientAmountException dae) {
			System.out.println(dae.getMessage());
		} catch (WrongOrderQuantityException woqe) {
			System.out.println(woqe.getMessage());
		}

		try {
			norm.sell(new PaymentInfoDTO(cust1, 9_700, 2, 2));
		} catch (DeficientAmountException dae) {
			System.out.println(dae.getMessage());
		} catch (WrongOrderQuantityException woqe) {
			System.out.println(woqe.getMessage());
		}

		try {
			conv.sell(new PaymentInfoDTO(cust2, 110_000, 4, 6));
		} catch (DeficientAmountException dae) {
			System.out.println(dae.getMessage());
		} catch (WrongOrderQuantityException woqe) {
			System.out.println(woqe.getMessage());
		}

		try {
			dept.sell(new PaymentInfoDTO(cust3, 18_800_000, 2, 2, 190_000));
		} catch (DeficientAmountException dae) {
			System.out.println(dae.getMessage());
		} catch (WrongOrderQuantityException woqe) {
			System.out.println(woqe.getMessage());
		}
		try {
			dept.sell(new PaymentInfoDTO(cust4, 18_800_000, 2, 2, 210_000));
		} catch (DeficientAmountException dae) {
			System.out.println(dae.getMessage());
		} catch (WrongOrderQuantityException woqe) {
			System.out.println(woqe.getMessage());
		}

	}
}
