
public class Quiz07 {

	public static void main(String[] args) {

		//문제6
		//가로가 9, 세로가 3인 int형 
		//2차원 배열을 선언하여 구구단 중 2, 3, 4단을 저장한다.
		//제대로 저장이 되었는지 확인하기 위해 출력을 하는 프로그램을 작성하라

		int[][] arr = new int[2][4];
		int num = 1;
		int sum =0;
		for(int i =0; i<2; i++) {
			for(int j=0; j<4; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		
		
		for(int i =0; i<2; i++) {
			for(int j=0;j<4;j++) {
				
				System.out.print(arr[i][j] + "\t");//(0,1)~~~~(3,4)까지				
			}
			System.out.println();		
		}
		
		System.out.println("-----------------------------");
		int[][] arr1 = {
				{1,2},
				{3,4},
				{5,6},
				{7,8}
								
		};
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}
