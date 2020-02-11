import INput.Input;
import Operation.Operate;

public class Driver {
    public static void main(String[] args) {

        Input in =  new Input();
        Operate op = new Operate();

        while(true){
            System.out.println("Input the query in the format :- Num1 operator num2  Use 'e' in operator to exit");
            in.getInput();
            op.operate(in.getNum1(),in.getNum2(),in.getOperator());
            System.out.println("Result = " + op.getResult());
        }


    }
}
