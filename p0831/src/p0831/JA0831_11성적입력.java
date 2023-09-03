package p0831;

import java.util.Scanner;

public class JA0831_11성적입력 {

	public static void main(String[] args) {
		//입력선언
		Scanner scan = new Scanner(System.in);
		
		
		
		//이름, 국어, 영어, 수학, 합계, 평균
		String name = "";
		int kor=0;
		int eng=0;
		int math=0;
		
		//입력부분
		System.out.println("이름을입력하세요");
		name = scan.next();
		System.out.println("국어점수를 입력하세요");
		kor=scan.nextInt();
		System.out.println("영어점수를 입력하세요");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요");
		math=scan.nextInt();
		int total = kor+eng+math;
		double avg = total/3.0;
		
		System.out.printf("이름 : %s\n",name);
		System.out.printf("합계 : %d\n", total);
	    System.out.printf("평균 : %.2f\n", avg);
	
		

				
				

	}

}
