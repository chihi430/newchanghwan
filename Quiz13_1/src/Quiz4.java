import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int[] inputnum = new int[10];
		
		

		while (true) {
			System.out.println("정수를 입력하시오");
			inputnum[num] = sc.nextInt();
			num++;
			System.out.println("증가"+num);
			if (num == 10) {
				break;
			}
		}		
		
		for (int i = 0; i < inputnum.length; i++) {
			
			if (inputnum[i] % 2 == 1) {
				System.out.print(inputnum[i]);
			}
		}
		for (int i = 9; i >= 0; i--) {
			if (inputnum[i] % 2 == 0) {
				System.out.print(inputnum[i]);
			}
		}
	}
}
