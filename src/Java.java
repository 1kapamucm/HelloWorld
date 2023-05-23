import java.util.Scanner;

public class Java {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        calc(in);

    }

    public static String calc(String input) throws Exception {

        String[] hui = input.split(" ");
        int x = Integer.parseInt(hui[0]);
        String operand1 = hui[1];
        int y = Integer.parseInt(hui[2]);

            if (x > 10){
                 throw new Exception("ne ponyal");
            }else if(y > 10){
                throw new Exception("epta");
            }

        switch (operand1){

            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            case "/":
                System.out.println(x / y);
                break;
        }
        return input;
    }
}

