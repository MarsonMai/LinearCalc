import java.util.Scanner;

public class LinearEquationLogic {
    private Scanner myScanner;
    private LinearEquation linearEquation;
    public LinearEquationLogic() {
        linearEquation = null;
        myScanner = new Scanner(System.in);

    }
    public void start() {

    }
    private void GetInfo() {
        System.out.println("Welcome to the Linear equation calculator");
        System.out.println("Enter coordinate one: ");
        String pointOne = myScanner.nextLine();
        System.out.println("Enter coordinate one: ");
        String pointTwo = myScanner.nextLine();
        int strInt1 = Integer.parseInt(pointOne);
        int strInt2 = Integer.parseInt(pointTwo);
        //linearEquation = new LinearEquation(strInt1,strInt2)
    }

}
