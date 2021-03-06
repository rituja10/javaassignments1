package question3;
import java.util.Scanner;
import java.io.File;
public class AssignmentQ3 {
	public static void main(String[] args) {
        File File1 = new File("C:\\Users\\nawal kishor singh\\Documents\\workspace-sts-3.9.12.RELEASE\\assignment4\\src\\question3\\Data.txt");
        try {
            Scanner doubleScanner = new Scanner(File1);
            double bigDouble = Double.MIN_VALUE; 
            double smallDouble = Double.MAX_VALUE; 
            double currentDouble;
            while (doubleScanner.hasNextDouble()) {
                currentDouble = doubleScanner.nextDouble();
                if (currentDouble > bigDouble) {
                    bigDouble = currentDouble; 
                }
                if (currentDouble < smallDouble) {
                    smallDouble = currentDouble; 
                }
            }
            System.out.println("The biggest number is " + bigDouble); 
        } catch (Exception l) {
            System.err.println(l.getMessage());
        }
    }
}
