package Operation;

public class Operate {
    double result;
    public void operate(double num1, double num2, String operate){
        switch(operate.charAt(0)){
            case('+'):{
                result = num1 + num2;
                break;
            }
            case('-'):{
                result = num1 - num2;
                break;
            }
            case('*'):{
                result = num1 * num2;
                break;
            }
            case('/'):{
                result = num1 / num2;
                break;
            }
            case('e'):{

                    System.exit(1);
            }
            default:{
                System.out.println("Not a Valid Operation");
            }
        }
    }
    public double getResult() {
        return result;
    }
}
