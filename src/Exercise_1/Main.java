package Exercise_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        String currentWord = "";
        ArrayList<String> words = new ArrayList<>();
        HashSet<String> duplicateWords = new HashSet<>();
        HashSet<String> distinctWords = new HashSet<>();

        System.out.println("Quante parole vuoi inserire? ");
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Inserisci la parola numero " + (i + 1));
            currentWord = sc.nextLine();
            if (i == 0) {
                words.add(currentWord);
                distinctWords.add(currentWord);
                continue;
            }
            if (words.contains(currentWord)) {
                duplicateWords.add(currentWord);
                distinctWords.remove(currentWord);
                words.add(currentWord);
                continue;
            }


            distinctWords.add(currentWord);
            words.add(currentWord);

        }
        System.out.println("All the words -> " + words);
        System.out.println("Duplicate Words -> " + duplicateWords);
        System.out.println("Number of distinct words -> " + distinctWords.size());
        System.out.println("Distinct Words -> " + distinctWords);
    }
}





