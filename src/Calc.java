import java.util.Scanner;

public class Calc {

    public static void main(String[] args) throws Exception {

        Scanner qq = new Scanner(System.in);
        String pp = qq.nextLine();
        calc(pp);
    }


    public static String calc(String input) throws Exception {

        String[] zz = input.split(" ");
        int first;
        String operation = zz[1];
        int second;

        if (zz.length > 3) {
            throw new Exception("Вы ввели больше двух чисел");
        }

        boolean t = true;

        try {
            first = Integer.parseInt(zz[0]);
            second = Integer.parseInt(zz[2]);
        } catch (NumberFormatException e) {
            Rome romeX = Rome.valueOf(zz[0]);
            first = romeX.resoult1();
            Rome romeY = Rome.valueOf(zz[2]);
            second = romeY.resoult1();
            t = false;
        }

        int calc = calcul(first, operation, second);

        if (t) {
            System.out.println(calc);
        }

        if (!t) {
            System.out.println(ResoultArabRome.arabicToRimsk(calc));
        }


        return input;
    }

    public static int calcul(int first, String operation, int second) throws Exception {

        int result = 0;


        if (first >= 11 || second >= 11 || first <= 0 || second <= 0) {

            throw new Exception("Не корректное число");

        }


        switch (operation) {

            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                result = first / second;
                break;

        }


        return result;
    }
}
