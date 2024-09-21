package HomeWork;

public class hw5 {
    public static void main(String[] args) {
//        Задание 1.	Написать код, который подсчитывает количество букв и цифр в строке (как на занятии) – с циклом, методом charAt(индекс) и Character.isLetter/isDigit,
//        a.	но добавить еще условие, чтобы подсчитывались отдельно цифры от 0 до 4, отдельно от 5 до 9
//        b.	для букв так же – считать отдельно большие буквы и маленькие (поищите в классе Character подходящие методы, подсказка – они тоже начинаются на is)
//        c.	(т.е. должно быть четыре счетчика – два для букв и два для цифр)

                String text = "01234aBCd789";


        int countLetter = 0;
        int upperLetter = 0;
        int lowerLetter = 0;
        int countDigit = 0;
        int countDigit0_4 = 0;
        int countDigit5_9 = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                countLetter++;
            } else if (Character.isDigit(text.charAt(i))) {
                countDigit++;
            }
        }
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                upperLetter++;
            } else if (Character.isLowerCase(text.charAt(i))) {
                lowerLetter++;
            }
        }
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= '0' && text.charAt(i) <= '4') {
                countDigit0_4++;
            }
            if (text.charAt(i) >= '5' && text.charAt(i) <= '9') {
                countDigit5_9++;
            }
        }


        System.out.println("Общее кол-во букв " + countLetter);
        System.out.println("Общее кол-во цифр " + countDigit);
        System.out.println("Общее кол-во больших букв " + upperLetter);
        System.out.println("Общее кол-во маленьких букв " + lowerLetter);
        System.out.println("Общее кол-во цифр от 0 до 4 " + countDigit0_4);
        System.out.println("Общее кол-во цифр от 5 до 9 " + countDigit5_9);


//      Задание   2.	Написать любую строку на ваш вкус (можно “I like Java!!!”), далее

        String text2 = "I like Java!!!";
//        a.	Распечатать последний символ строки. Используем метод String.charAt().
        System.out.println(text2.charAt(text2.length()-1));
//        b.	Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
        System.out.println(text2.endsWith("!!!"));
//        c.	Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
        System.out.println(text2.startsWith("I like"));
//        d.	Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        System.out.println(text2.contains("Java"));
//        e.	Найти позицию подстроки “Java” в строке “I like Java!!!”.
        System.out.println(text2.indexOf("Java"));

//        f.	Заменить все символы “а” на “о”.
        System.out.println(text2.replaceAll("a", "o"));

//        g.	Преобразуйте строку к верхнему регистру.
        System.out.println(text2.toUpperCase());

//         h.	Преобразуйте строку к нижнему регистру.
        System.out.println(text2.toLowerCase());


//    Задание 3.	Даны строки разной длины (длина - четное число), необходимо вернуть два средних знака.
//    Hапример, если дана строка "string" –  результат будет "ri", для строки "code" результат "od",  для "Practice" результат "ct"
//    (тут надо взять длину и поиграться с индексами, чтобы взять тот кусок, который нужен, ну и применять метод substring).
//        Проверьте алгоритм на нескольких строках разной длины

        String text3 = "Practitioner model";

        System.out.println(text3.substring(5, 17));
        System.out.println(text3.substring(1, 11));
        System.out.println(text3.substring(15, 18));
        System.out.println(text3.substring(text3.length() / 2 - 1, text3.length() / 2 + 1));



    }
}
