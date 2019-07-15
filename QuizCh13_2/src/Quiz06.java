
public class Quiz06 {

	public static void main(String[] args) {
		//문제6
		//가로가 9, 세로가 3인 int형 
		//2차원 배열을 선언하여 구구단 중 2, 3, 4단을 저장한다.
		//제대로 저장이 되었는지 확인하기 위해 출력을 하는 프로그램을 작성하라

		int[][] arr = new int[3][9];
		int num = 1;
		for(int i =0; i<3; i++) {
			for(int j=0; j<9; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		
		
		for(int i =2; i<5; i++) {
			System.out.println(i+"단");
			for(int j=1;j<10;j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();	
			System.out.println("--------------------------------------------------------------------");		

		}

	}

}
