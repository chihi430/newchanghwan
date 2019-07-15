import java.util.Arrays;
import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {

		// 성적관리 프로그램을 작성한다.
		// 국어, 영어, 수학, 국사 4과목이고
		// 학생은 이순신, 강감찬, 을지문덕, 권율 4명이다.
		// 4 by 4 배열을 선언하고 사용자로부터 4사람의
		// 4과목 점수를 입력받아 다음의 형태로 값을 저장하고
		int arr[] = new int[10];

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 입력하세요");
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("입력된값 : ");
		for (int j = 0; j < 5; j++) {
			System.out.print(arr[j] + ",");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int sort = arr[i];
					arr[i] = arr[j];
					arr[j] = sort;
				}
			}
		}
		System.out.print("오름차순 출력 : ");
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int sort = arr[i];
					arr[i] = arr[j];
					arr[j] = sort;
				}
			}
		}
		System.out.print("내림차순 출력 : ");
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();
	}
}
