1. Написать метод, который сможет вернуть все цифры из строки:
   «Today my 17th lesson. I'm the best 1! Find me on inst: @teachmeskills».

2. Написать метод, который сможет заменить КАЖДУЮ букву на знак & в строке из 1
   задания.

3. Написать метод который сможет вернуть инсту в строке из 1 задания.

4. Написать метод, который возвращает true, если строка имеет вид «null».

5. В строке «Hello \n world \n !!!» заменить \n на «» используя классы Pattern и Matcher.

6. В строке «Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!»
   найти имя и фамилию человека и вывести на экран.

















1. Вот метод, который вернет все цифры из строки, используя регулярные выражения:

java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public static String getDigitsFromString(String str) {
Pattern pattern = Pattern.compile("\\d");
Matcher matcher = pattern.matcher(str);
StringBuilder digits = new StringBuilder();
while (matcher.find()) {
digits.append(matcher.group());
}
return digits.toString();
}


Пример использования:

java
String str = "Today my 17th lesson. I'm the best 1! Find me on inst: @teachmeskills";
String digits = getDigitsFromString(str);
System.out.println(digits); // Выводит: 171


2. Вот метод, который заменит КАЖДУЮ букву на знак & в строке из предыдущего задания, используя регулярные выражения:

java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public static String replaceLettersWithAmpersand(String str) {
Pattern pattern = Pattern.compile("\\p{L}");
Matcher matcher = pattern.matcher(str);
return matcher.replaceAll("&");
}


Пример использования:

java
String str = "Today my 17th lesson. I'm the best 1! Find me on inst: @teachmeskills";
String replacedStr = replaceLettersWithAmpersand(str);
System.out.println(replacedStr); // Выводит: &&&&& ## ##th ######. #'# ### #### #! #### ## ##st: @##########s


3. Вот метод, который вернет инсту в строке из первого задания, используя регулярные выражения:

java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public static String findInstagramUsername(String str) {
Pattern pattern = Pattern.compile("@\\w+");
Matcher matcher = pattern.matcher(str);
if (matcher.find()) {
return matcher.group();
}
return "";
}


Пример использования:

java
String str = "Today my 17th lesson. I'm the best 1! Find me on inst: @teachmeskills";
String instagramUsername = findInstagramUsername(str);
System.out.println(instagramUsername); // Выводит: @teachmeskills


4. Вот метод, который вернет true, если строка имеет вид "null", используя регулярные выражения:

java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public static boolean isNullString(String str) {
Pattern pattern = Pattern.compile("^null$");
Matcher matcher = pattern.matcher(str);
return matcher.matches();
}


Пример использования:

java
String str1 = "null";
String str2 = "not null";
System.out.println(isNullString(str1)); // Выводит: true
System.out.println(isNullString(str2)); // Выводит: false


5. Вот метод, который заменит \n на пустую строку в данной строке, используя регулярные выражения:

java
public static String replaceNewLines(String str) {
return str.replaceAll("\\\\n", "");
}


Пример использования:

java
String str = "Hello \\n world \\n !!!";
String replacedStr = replaceNewLines(str);
System.out.println(replacedStr); // Выводит: Hello  world  !!!


6. Вот метод, который найдет имя и фамилию человека в данной строке и выведет на экран, используя регулярные выражения:

java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public static void findNameAndSurname(String str) {
Pattern pattern = Pattern.compile("Меня зовут (\\p{L}+) (\\p{L}+)");
Matcher matcher = pattern.matcher(str);
if (matcher.find()) {
String name = matcher.group(1);
String surname = matcher.group(2);
System.out.println("Имя: " + name);
System.out.println("Фамилия: " + surname);
}
}


Пример использования:

java
String str = "Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!";
findNameAndSurname(str);
// Выводит:
// Имя: Билл
// Фамилия: Гейтс