package org.homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1. Работа с массивом слов");
        List<String> words = Arrays.asList(
                "Массив", "Константа", "Блок", "Библиотека", "Язык", "Блок", "Массив", "Коллекция", "Данные", "Данные",
                "Язык", "Функция", "Метод", "Константа", "Массив", "Функция", "Коллекция", "Блок", "Сборщик", "Код",
                "Коллекция", "Массив", "Идентификатор", "Java", "Метод");

        StringBuilder output = new StringBuilder();

        System.out.println(output.append("Исходный массив слов:\n").append(words).append("\nРазмер массива: ")
                .append(words.size()));
        output.delete(0, output.length());

        System.out.println("\n#1 Поиск уникальных слов в массиве (1 способ - через Set)");
        Set<String> setOfWords = new TreeSet<>(words);
        System.out.println(output.append("Список уникальных слов, входящих в массив:\n").append(setOfWords)
                .append("\nРазмер массива: ").append(setOfWords.size()));
        output.delete(0, output.length());

        System.out.println("\n#1 Поиск уникальных слов в массиве (2 способ - через Stream API)");
        List<String> streamOfWords = words.stream().distinct().toList();
        System.out.println(output.append("Список уникальных слов, входящих в массив:\n").append(streamOfWords)
                .append("\nРазмер массива: ").append(streamOfWords.size()));
        output.delete(0, output.length());

        System.out.println("\nПодсчёт количества каждого из слов в исходном списке:");
        for (String str : setOfWords) {
            System.out.println(output.append("\"").append(str).append("\"").append(" встречается ")
                    .append(Collections.frequency(words, str)).append(" раз(-а)."));
            output.delete(0, output.length());
        }

        System.out.println("\nЗадание №2. Работа с классом \"ТелефонныйСправочник\"");

        PhoneDirectory phoneDirectory = new PhoneDirectory();
        System.out.println("Добавим номера телефонов в телефонный справочник для абонентов с фамилиями: " +
                "Модрич (3 абонента), Кроос (2 абонента), Вальверде (1 абонент) и Куртуа (2 абонента)");

        phoneDirectory.add("Модрич", "+79281252525");
        phoneDirectory.add("Модрич", "+346352321");
        phoneDirectory.add("Вальверде", "+34236562332");
        phoneDirectory.add("Модрич", "+34692725445");
        phoneDirectory.add("Кроос", "+79196543212");
        phoneDirectory.add("Куртуа", "+79282456237");
        phoneDirectory.add("Кроос", "+34263232323");
        phoneDirectory.add("Куртуа", "+34565655656");

        System.out.println("Тестирование метода \"get()\"");
        System.out.println("\nДолжен получиться список из трёх номеров для абонентов по фамилии Модрич: "
                + phoneDirectory.get("Модрич"));

        System.out.println("\nДолжен получиться список из двух номеров для абонентов по фамилии Кроос: "
                + phoneDirectory.get("Кроос"));

        System.out.println("\nДолжен получиться список из одного номера для абонентов по фамилии Вальверде: "
                + phoneDirectory.get("Вальверде"));

        System.out.println("\nДолжен получиться список из двух номеров для абонентов по фамилии Куртуа: "
                + phoneDirectory.get("Куртуа"));

        System.out.println("\nВывод всех абонентов телефонного справочника:");
        phoneDirectory.printBook();
    }
}