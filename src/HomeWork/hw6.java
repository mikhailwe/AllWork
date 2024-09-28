package HomeWork;

public class hw6 {
    public static void main(String[] args) {
//        1)	Реализовать проверку строки на палиндром двумя способами:
//        a.	С помощью СтрингБилдера получить реверс строки (строку в обратном порядке символов) и сравнить её с исходной строкой

        String str = "wormsmrow";

        if (str.equals(new StringBuilder(str).reverse().toString())) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }
//        b.	Анализировать посимвольно строку – сравнивать первый символ с последним, второй с предпоследним и т.д.
        String str1 = "radarr";
        boolean isPalidrom = true;
        for (int i = 0; i < (str1.length() / 2); i++) {
            if (str1.charAt(i) != str1.charAt(((str1.length() - 1) - i))) {
                isPalidrom = false;
                break;
            }
        }
        System.out.println(isPalidrom ? str1 + " Это палидрон" : str1 + " Это не палидрон");

        //        c.	* подумать – как можно проверить на палиндром число, например 1234321
        String str3 = "1234321";

        if (str3.equals(new StringBuilder(str3).reverse().toString())) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");


        }
    }
}

