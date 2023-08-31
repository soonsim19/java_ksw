package p0831;

public class Ja0831_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         double d = 1.6;
         int i = (int)d; //int형변환 -정수부분만 입력
         System.out.println(i);
         
         int x =10;
         double d2 =x;//자동형변환, 형변환 생략가능
        System.out.println(d2);		
        
        
        //크기 순서 :char,byte,short -> int-> long ->float->double -> string
        
        
        System.out.println(10/3.0);
        //실수형 값 %f, 정수형 값 %d, 문자열값 %s
        System.out.printf("%.2f\n", 10/3.0); //\n계행,\t:사이띄움
        System.out.println("안녕하셈");
        System.out.printf("%S", "순심이입니다");
        System.out.printf("%,7d\n", 1000000000);//,천단위표시|0->남는자리0으로 채움
        System.out.printf("국어 : %d, 영어 : %d", 100,99);
       
        
	}

}
