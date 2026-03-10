package exam;

public class ArtithmaticQuiz2 {
	public static void main(String[] args) {
		int processTime = 145;
		int minutes = 0;
		int seconds = 0;
		
//		processTime을 분, 초를 구하여
//		minutes, seconds 변수에 할당하고 출력하시오
		
		minutes = processTime / 60;
		seconds = processTime % 60;
//		System.out.println(minutes);
//		System.out.println(seconds);
		System.out.println(processTime + "초는 " + minutes + "분 " + seconds + "입니다");
	}
}
