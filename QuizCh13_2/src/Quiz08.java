import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {

		// 성적관리 프로그램을 작성한다. 
		// 국어, 영어, 수학, 국사 4과목이고 
		// 학생은 이순신, 강감찬, 을지문덕, 권율 4명이다. 
		// 4 by 4 배열을  선언하고 사용자로부터 4사람의
		// 4과목 점수를 입력받아 다음의 형태로 값을 저장하고 
		
		Scanner sc = new Scanner(System.in);
		int score =  sc.nextInt();
		 

		int[][] arr = new int[6][6];
		int num = 1;
		int sum =0;
		for(int i =0; i<6; i++) {
			for(int j=0; j<6; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		String[][] arr2 = new String[6][6];
		arr2[0][0] = "구분";
		arr2[0][1] = "이순신";
		arr2[0][2] = "강감찬";
		arr2[0][3] = "강감찬";
		arr2[0][4] = "을지문덕";
		arr2[0][5] = "총점";
		arr2[1][0] = "국어";
		arr2[2][0] = "국어";
		arr2[3][0] = "수학";
		arr2[4][0] = "국사";				
		arr2[5][0] = "총점";
		int num1 = 1;
	
		
		for(int i =1; i<6; i++) {
			for(int j=1; j<6; j++) {
				score = arr2[i][j];
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println("");
		}
	
	}

}
