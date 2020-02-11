package INput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private double num1;
    private double num2;
    private String operator;
    public void getInput(){
        try{
            Scanner scan = new Scanner(System.in);
            num1 = scan.nextDouble();
            operator = scan.next();
            num2 = scan.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Enter Numbers in correct Format");
        }
    }
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public String getOperator() {
        return operator;
    }
}
