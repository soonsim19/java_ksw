package home;

import java.util.Scanner;

public class H01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] save = new int[10];
		
		//1.랜덤 숫자 생성
	    int random =(int)(Math.random()*100)+1;
	    
	    int i=0;//초기식
	    //2.while반복문
	    while(i<10) { 
	    	//3.num 숫자 입력받기
	         System.out.println("1-100까지 숫자 중 하나를 입력하세요");
	         int input = scan.nextInt();
	         
	         save[i] = input;
	         //입력한 숫자를 배열에 저장 save[0]=**, save[1]=** etc..
	         //4. if 를 사용해서 random과 input을 비교
	         //5. 큰 수, 작은 수, 정답 - break
	         if (random==input) {
	        	 System.out.println("정댭입니다");
	        	break;
	         }else if(random>input) {
	        	 System.out.println("더 큰 수를 입력하세요");
	         }else {
	        	 System.out.println("더 작은 수를 입력하세요");
	         }
	         if(i==9) {
	        	 break;
	         }
	         
	         i++; //증감
	    	      
	    }//while
		
	   System.out.println("입력한 숫자 :");
	   for(int j = 0 ; j<= i; j++) {
	        System.out.printf("%d  ",save[j]);
	   }
	   System.out.println();
	   
	   System.out.println("랜덤 숫자:"+random);
	}//main

}//class


	


