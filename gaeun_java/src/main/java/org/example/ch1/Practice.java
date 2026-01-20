package org.example.ch1;
import java.util.Scanner;

public class Practice
{
    public static void main(String[] args)
    {
        //사용자의 이름과 국어 수학 영어 점수를 입력 받고 사용자의 총점과 평균점수를 계산해 합격인지 불합격인지 출력하시오

        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하시오. >");
        String name = sc.next();

        System.out.print("국어 점수를 입력하시오. >");
        int Lan = sc.nextInt();
        System.out.print("수학 점수를 입력하시오. >");
        int Math = sc.nextInt();
        System.out.print("영어 점수를 입력하시오. >");
        int Eng = sc.nextInt();

        int total = Lan + Math + Eng;
        float avg = (float)(total/3);

        String isavgpass = avg >= 60 ? "합격" : "불합격";
        String ispass = (Lan >=60 && Math >= 60 && Eng >=60) ? "합격" : "불합격";

        System.out.println("이름은" + name);
        System.out.printf("총점은 %d점, 평균은 %f점 입니다.", total, avg);
        System.out.println("평균은" + isavgpass + "입니다.");
        System.out.println("각 과목별은" + ispass + "입니다.");


    }
}
