public class ResoultArabRome {
    public static String arabicToRimsk(int number){
        boolean t = true;
        String[] romanDigit ={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] romanDecimal = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};
        int arabicDigit = number%10;
        int arabicDecimal = number/10;
        return romanDecimal[arabicDecimal]+romanDigit[arabicDigit];
    }
}
