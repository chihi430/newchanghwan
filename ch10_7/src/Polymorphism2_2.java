// 마이크로소프트사 : 컬러로 인쇄를 할 경우에는 다음의 규격으로 만들어 주세요.
//						ColorPrintable 을 구현해 주세요
// 아래한글, MS Word : 구형 프로그램 : print 호출
//					 : 신형 프로그램 : printCMKY 호출

// 삼성, 엡손 : 구형 프로그램 : print 호출
//			  : 신형 프로그램 : printCMKY 호출

interface ColorPrintable extends Printable{
	void printCMYK(String doc);
}

class PrnColorDrvSamsung implements ColorPrintable{
	public void print(String doc) {
		System.out.println(doc+ "\nForm Samsung(2) : Black-White Ver");
	}
	public void printCMYK(String doc) {
		System.out.println(doc+ "\nForm Samsung(2): Color Ver");
	}
}	
class PrnColorDrvEpson implements ColorPrintable{
	public void print(String doc) {
		System.out.println(doc+ "\nForm Epson(2) : Black-White Ver");
	}
	public void printCMYK(String doc) {
		System.out.println(doc+ "\nForm Epson(2) : Color Ver");
	}
}


public class Polymorphism2_2 {
	
	public static void main(String[] args) {
		String doc = "프린터로 출력을 합니다.";
		
		Printable prn1 = new PrnDrvSamsung();
		prn1.print(doc);
		System.out.println("------------------------");
		
		
		ColorPrintable prn2 = new PrnColorDrvSamsung();
		prn2.print(doc);
		prn2.printCMYK(doc);
		System.out.println("------------------------");
		
		ColorPrintable prn3 = new PrnColorDrvEpson();
		prn3.print(doc);
		prn3.printCMYK(doc);
		
	}

}
