import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        String str1 = input.nextLine();
        String combined1 = "5" + str1;
        int num1 = Integer.parseInt(combined1);
        System.out.print(num1 + 5 + "\n");
	}

	public static void q2() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        String str2 = input.nextLine();
        String combined2 = "4" + str2 + "3";
        double num2 = Double.parseDouble(combined2);
        System.out.print(num2 + 3.4 + "\n");
	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input a boolean: ");
        String str3 = input.nextLine();
        boolean bool1 = Boolean.parseBoolean(str3);
        System.out.print(!bool1 + "\n");
	}

	public static void q4() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        String str4 = input.nextLine();
        String combined4 = str4 + "3";
        int num4 = Integer.parseInt(combined4);
        char ch1 = (char)(num4 + 2);
        System.out.print(ch1 + "\n");
	}

	public static void q5() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        String str5 = input.nextLine();
        String combined5 = str5 + "1";
        int num5 = Integer.parseInt(combined5);
        double result5 = (double)(num5 / 2);
        System.out.print(result5 + "\n");
	}

	public static void q6() {
		Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        String str6 = input.nextLine();
        String combined6 = "1" + str6;
        double num6 = Double.parseDouble(combined6);
        int result6 = (int)num6;
        System.out.print(result6 + "\n");
	}

}
