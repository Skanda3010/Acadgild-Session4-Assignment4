import java.util.Scanner;

public class PrintRevOfStringAssignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReferenceClass refClass = new ReferenceClass();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the string for which the reverse has to be printed");
		refClass.setSomeWord(sc.next());
		sc.close();
		
		refClass.RevofString(refClass.getSomeWord());
		
	}

}
