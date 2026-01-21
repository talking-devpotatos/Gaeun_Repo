package org.example.ch1;

public class f_Conversion
{
    public static void main(String[] args)
    {
        //1. 자동(묵시적) 형 변환
        // 작은 자료형 => 큰 자료형으로 변환 (왼쪽 => 오른쪽으로 진행) * 이건 컴파일러가 함

        byte smallBox = 10;
        int bigBox = 10000;

        bigBox = smallBox;

        System.out.println(bigBox);

        byte a = 30;
        short b = a;
        int c = b;
        long d = c;

        float e = d; // 4바이트 float에 8바이트 long 데이터 삽입 가능

        System.out.println(e);

        //2. 강제(명시적) 형 변환
        // 큰 자료형 => 작은 자료형으로 변환 (오른쪽 => 왼쪽으로 진행) * 이건 JVM이 함

        int intNumber = 1234;
        float floatNumber = intNumber;

        //강제 형 변환 => 작은 타입 변수명 = (작은타입) 큰 데이터값;
        int intNum2 = (int)floatNumber;

        System.out.println(intNum2);

        long aa = 32L;
        int bb = (int)aa;
        short cc = (short)bb;
        byte dd = (byte)cc;

        System.out.println(dd);

        //3. 문자 형 변환
        // 유니코드 라는 것을 이해해야함


        //1) char => 숫자로 변환 -> 문자의 유니코드 값으로 변환한다는 뜻
        char letter = 'A';
        int unicodeLetter = letter;

        System.out.println(unicodeLetter);

        char c1 = 'a';
        char c2 = 97;
        char c3 = '\u0061'; //유니코드 값을 16진수로 변환한거

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        //3가지 다 a를 표현함. char 형에 담기면 유니코드가 단일문자로 변환되어 저장됨


        //2) 숫자를 문자로 변환

        int numberChar = 66; //4바이트 체계
        char letter66 = (char)numberChar; //2바이트 체계 / 이러면 명시적, 강제 형 변환을 해야함

        System.out.println(letter66);
    }
}
