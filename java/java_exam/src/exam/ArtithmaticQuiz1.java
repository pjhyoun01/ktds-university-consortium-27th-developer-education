package exam;

public class ArtithmaticQuiz1 {

	public static void main(String[] args) {

		int minutes = 5;
		int seconds= 50;
		int time = 0;
		
//		minutes분 seconds초는 총 몇 초인가?
		time  = minutes * 60 + seconds;
		System.out.println(minutes + "분 " + seconds + "초는 총 " + time + "초 입니다");
	}

}
