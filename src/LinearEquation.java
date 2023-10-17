import java.util.Scanner;

public class LinearEquationLogic {
    private Scanner myScanner;
    private LinearEquation linearEquation;
    public LinearEquationLogic() {
        linearEquation = null;
        myScanner = new Scanner(System.in);

    }
    public void start() {
            GetInfo();

    }
    private void GetInfo() {
        String x = "y";
        while (x.contains("y")) {
            System.out.println("Welcome to the Linear equation calculator");
            System.out.print("Enter coordinate one: ");
            String pointOne = myScanner.nextLine();
            System.out.print("Enter coordinate two: ");
            String pointTwo = myScanner.nextLine();
            String sub1 = pointOne.substring(1, 2);
            String sub2 = pointOne.substring(3, 4);
            String sub3 = pointTwo.substring(1, 2);
            String sub4 = pointTwo.substring(3, 4);
            int x1 = Integer.parseInt(sub1);
            int y1 = Integer.parseInt(sub2);
            int x2 = Integer.parseInt(sub3);
            int y2 = Integer.parseInt(sub4);
            linearEquation = new LinearEquation(x1, y1, x2, y2);
            System.out.println(linearEquation.LineInfo());
            System.out.println("");
            if (x1 != x2) {
                System.out.print("Enter a value for x: ");
                int newX = myScanner.nextInt();
                System.out.println(linearEquation.coordinateForX(newX));
            }
            System.out.print("Would you like to enter another pair of coordinates? y/n: ");
            x = myScanner.nextLine();

        }
    }
