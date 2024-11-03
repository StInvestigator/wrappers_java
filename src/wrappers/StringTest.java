package wrappers;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        //2
        String s1 = "Hello world";
        String s2 = new String("Hello world");

        char[] chars = new char[]{'H','e','l','l','o',' ','w','o','r','l','d'};
        String s3 = String.valueOf(chars);

        byte[] byteArray = {72, 101, 108, 108, 111}; // байтовое представление строки "Hello"
        String s4 = new String(byteArray);

        StringBuilder builder = new StringBuilder("Hello world");
        String s5 = builder.toString();

        //3
        String fruitsString = "Апельсин,Яблоко,Гранат,Груша";
        String[] fruits = fruitsString.split(",");
        String longest = "";
        for (String fruit : fruits) {
            if(fruit.length() > longest.length()){
                longest = fruit;
            }
        }
        longest = longest.toLowerCase();
        System.out.println("longest - " + longest);
        String shortenLongest = longest.substring(0,3);
        System.out.println("shortenLongest - " + shortenLongest);

        String newString = "   Я_новая_строка      ";
        newString = newString.trim();
        newString = newString.replaceAll("_", " ");
        System.out.println("newString - " + newString);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Вы ввели: ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        if(words[0].equals("Запуск")){
            System.out.println("Запускаем процесс");
        }
        if(words[words.length-1].equals("завершен")){
            System.out.println("Процесс завершен");
        }
        for (String word : words) {
            if(word.equalsIgnoreCase("ошибка")){
                System.out.println("Произошла ошибка");
                break;
            }
        }

        //4
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s1).append(s2).append(s3).append("\n")
                .append(s4).append(s5).append(fruitsString).append("\n")
                .append(longest).append(shortenLongest).append(newString).append("\n")
                .append(input);
        stringBuilder.reverse();
        String stringFromBuilder = stringBuilder.toString();
        System.out.println(stringFromBuilder);
    }
}
