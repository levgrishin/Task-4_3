import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AbaString {
    public static void main(String[] args) {
        //Задание 4.3.1
        //Изучите скорость методов класса StringBuilder при помощи эксперимента.
        //Напишите программу, которая будет вызвать каждый метод в цикле большое
        // количество раз и будет вычислять время в миллисекундах на выполнение кода, примерно так:
        /*StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            sb.insert(0, "ABC");
        }
        System.out.println((System.currentTimeMillis() - startTime));*/



        //Задание 4.3.2
        //Напишите регулярку, которая найдет в строке aba aba a!a abba adca abea
        // строки abba adca abea по шаблону: буква a, 2 любых символа, буква a.
        /*String s1 = "aba aba a!a abba adca abea";
        Pattern pattern1 = Pattern.compile("a..a");

                Matcher matcher = pattern1.matcher(s1);
                while (matcher.find()) {
                    int start = matcher.start();
                    int end = matcher.end();
                    System.out.println("Found match\n" + s1.substring(start, end) + "\nfrom " + start + " to " + (end - 1));
                }

                System.out.println("Clean the text");*/



        //Задание 4.3.3
        //Напишите регулярку, которая ищет строки по шаблону: строка ab повторяется 1 или более раз.
        /*String s2 = "aba aba a!a abba adca abab";
        Pattern pattern2 = Pattern.compile("(ab)+");
        Matcher matcher2 = pattern2.matcher(s2);
        while (matcher2.find()) {
            int start = matcher2.start();
            int end = matcher2.end();
            System.out.println("Found match\n" + s2.substring(start, end) + "\nfrom " + start + " to " + (end - 1));
        }
        System.out.println("Clean the text");*/



        //Задание 4.3.4
        //Напишите регулярное выражение, которое находит в тексте все года 21-го столетия.
        // Будем считать, что 2000 год — это нулевой год века.
        /*String s3 = "sdsd 2021 adsdf 2101 asd 200 sdfd 2000 asdad 1200";
        Pattern pattern3 = Pattern.compile("20\\d{2}");
        Matcher matcher3 = pattern3.matcher(s3);
        while (matcher3.find()) {
            int start = matcher3.start();
            int end = matcher3.end();
            System.out.println("Found match\n" + s3.substring(start, end) + "\nfrom " + start + " to " + (end - 1));
        }
        System.out.println("Clean the  text");*/






        //Задание 4.3.5
        //Напишите регулярное выражение, которое находит в тексте
        // все слова на кириллице в звездочках. В строке *-ки *должны* примыкать к *СЛОВУ*)
        // должны быть найдены слова *должны* и *СЛОВУ*.
        /*String s4 = "*-ки *должны* примыкать к *СЛОВУ*";
        Pattern pattern4 = Pattern.compile("\\*[а-яА-Я]{1,}\\*");
        Matcher matcher4 = pattern4.matcher(s4);
        while (matcher4.find()) {
            int start = matcher4.start();
            int end = matcher4.end();
            System.out.println("Found match\n" + s4.substring(start, end) + "\nfrom " + start + " to " + (end - 1));
        }
        System.out.println("Clean the text");*/






        //Задание 4.3.6
        //Напишите регулярное выражение, которое находит все английские слова в тексте,
        // начинающиеся и заканчивающиеся на букву s. Например, в тексте:
        //Regular Expressions or Regex is an API for defining String patterns that can be used for searching,
        // manipulating and editing a text. It is widely used to define a constraint on strings such as a password.
        // Regular Expressions are provided under java.util.regex package.
        //должно быть найдено только слово strings.
        String s5 = "Regular Expressions is an API for defining String patterns that can be used for searching, manipulating and editing a text. It is widely used to define a constraint on strings such as a password. Regular Expressions are provided under java.util.regex package.";
        Pattern pattern5 = Pattern.compile(" [a-zA-Z]{1,}[$s]");
        Matcher matcher5 = pattern5.matcher(s5);
        while (matcher5.find()) {
            int start = matcher5.start();
            int end = matcher5.end();
            System.out.println("Found match\n" + s5.substring(start, end).trim() + "\nfrom " + start + " to " + (end - 1));
        }
        System.out.println("Clean the text 6");




    }


}
