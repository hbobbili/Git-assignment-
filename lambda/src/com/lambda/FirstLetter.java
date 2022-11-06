package com.lambda;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
public class FirstLetter {
    List<String> list = Arrays.asList("anusha", "bhargav", "chinnu", "devayani", "eagle", "fathima");
    public static void main(String[] args) {
        FirstLetter FirstLetter = new FirstLetter();
        processWords(FirstLetter.list);
    }

    public static String processWords(List<String> list) {
        StringBuilder words = new StringBuilder();
        Consumer<String> consumer = p-> words.append(p.charAt(0));
        list.stream().forEach(consumer);
        System.out.println(words);
        return  words.toString();
    }
}


