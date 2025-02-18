public class LTCODE019 {
    public static boolean isNumber(String s) {
        return s.matches("^[+-]?(\\d+(\\.\\d*)?|\\.\\d+)([eE][+-]?\\d+)?$");
    }

    public static void main(String[] args) {
        System.out.println(isNumber("0")); 
        System.out.println(isNumber("e")); 
        System.out.println(isNumber(".")); 
        System.out.println(isNumber("2e10"));
        System.out.println(isNumber("-123.456e789")); 
        }
}

