//Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
//Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
//*Напишите программу, чтобы перевернуть строку с помощью рекурсии.
//Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
//Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
//*Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
//**Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.

import org.w3c.dom.ls.LSOutput;

public class lesson2 {
    public static void main(String[] args) {
        String stroka = "geekbrains";
        String symbol = "geekbrains";
        System.out.println((stroka.contains(symbol)));
        StringBuilder name = new StringBuilder("geekbrains");
        System.out.println(name.reverse());
        StringBuilder sb = new StringBuilder();

        int a = 3;
        int b = 56;
        StringBuilder sum = new StringBuilder();
        sum.append(a).append(" + ").append(b).append(" = ").append(a + b);
        System.out.println(sum);
        sum.deleteCharAt(7);
        System.out.println(sum.insert(7, "РАВНО"));
        //System.out.println(sum.replace(7, 9, "равно "));

        StringBuilder dif = new StringBuilder();
        dif.append(a).append(" - ").append(b).append(" = ").append(a - b);
        System.out.println(dif);
        dif.deleteCharAt(7);
        System.out.println(dif.insert(7, "РАВНО"));
        //System.out.println(dif.replace(7, 9, "равно "));

        Long s = System.currentTimeMillis();
        StringBuilder mult = new StringBuilder();
        mult.append(a).append(" * ").append(b).append(" = ").append(a * b);
        System.out.println(mult);
        mult.deleteCharAt(7);
        System.out.println(mult.insert(7, "РАВНО"));
        //System.out.println(mult.replace(7, 9, "равно "));
        Long e = System.currentTimeMillis();
        System.out.println(e - s);


        Long start = System.currentTimeMillis();
        String str = "";
        for (int i =0; i < 10000; i++) {
            str += "=";
        }
        System.out.println(str);
        Long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}