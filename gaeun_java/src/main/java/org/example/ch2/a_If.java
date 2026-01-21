package org.example.ch2;
import java.util.Scanner;

public class a_If
{
    public static void main(String[] args)
    {
        //예제1 나이분류

        int age = 22;

        if (age > 19)
        {
            System.out.println("성인입니다");
        }
        else
        {
            System.out.println("미자입니다");
        }

        // 예제 2 나이분류 (else if)

        if (age > 19)
        {
            System.out.println("성인입니다.");
        }
        else if (age > 13)
        {
            System.out.println("청소년입니다.");
        }
        else
        {
            System.out.println("어린이입니다.");
        }

        // 예제 3 나이분류 (중괄호 생략) => 조건문에서 실행될 코드블럭{}에 코드가 하나의 구문인 경우 {} 생략 가능

        if (age > 19) System.out.println("성인");
        else if (age > 13) System.out.println("청소년");
        else System.out.println("어린이");


        // 코드 컨벤션 //

        //1. 중괄호 내부는 한칸씩 들여쓰기
        //2. 기호와 키워드 사이에는 한칸 띄어쓰기
        //3. 콜론의 경우 'A: B'가 기본

        // 예제 if //


        Scanner sc = new Scanner(System.in);

        // == 풀이 == //
        String functionScope = null; // 스트링과 같은 참조 자료형은 기본값은 null로 표시

        System.out.println("숫자 2개를 입력하시오. >" );
        int x = sc.nextInt(), y = sc.nextInt();

        if (x > 0 && y > 0) {
            functionScope = "1사분면";
//            System.out.println(functionScope);
        } else if (x < 0 && y > 0) {
            functionScope = "2사분면";
//            System.out.println(functionScope);
        } else if (x < 0 && y < 0) {
            functionScope = "3사분면";
//            System.out.println(functionScope);
        } else if (x > 0 && y < 0) {
            functionScope = "4사분면";
//            System.out.println(functionScope);
        } else {
            System.out.println("원점입니다");
        }
        System.out.println(functionScope);
        sc.close();
    }

}
