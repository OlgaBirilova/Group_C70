package Homework10;

public class lesson10_1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String result1 = str1 + str2;
        System.out.println(result1);
        String result2 = str1.concat(str2);
        System.out.println(result2);

//Проверить 2 строки на равенство с и без учета регистра.
        //С учетом регистра:
        String str3 = "Hello";
        String str4 = "hello";
        boolean isEqualWithCase = str3.equals(str4);
        System.out.println(isEqualWithCase);

        //Без учета регистра:
        boolean isEqualIgnoreCase = str3.equalsIgnoreCase(str4);
        System.out.println(isEqualIgnoreCase);

//1.3 Вернуть подстроку с 3-го символа до конца.
        String str = "Hello World";
        String substring = str.substring(2);
        System.out.println(substring);

//1.4 Вывести длину строки
        int length = str.length();
        System.out.println(length);

//1.5 Вывести порядковый номер любого символа в строке.
        char character = 'o';
        int index = str.indexOf(character);
        System.out.println(index);

//1.6 Преобразовать логический тип true в строку.
        boolean bool = true;
        String strBool = String.valueOf(bool);
        System.out.println(strBool);

//1.7 Перевести строку в верхний регистр.
        String uppercase = str.toUpperCase();
        System.out.println(uppercase);

//1.8 Замените «1» в строке на «%».
        String str5 = "Hello 1 World";
        String replaced = str5.replace("1", "%");
        System.out.println(replaced);

//1.9 Убрать все пробелы в строке с двух сторон.
        String str6 = "   Hello World   ";
        String trimmed = str6.trim();
        System.out.println(trimmed);


//1.10 Проверить, пустая ли строка.
        String str7 = "";
        boolean isEmpty = str7.isEmpty();
        System.out.println(isEmpty);


//1.11 Разбить текст на несколько по делителю.
        String[] split = str.split(" ");
        for (String s : split) {
            System.out.println(s);
        }
    }
}
