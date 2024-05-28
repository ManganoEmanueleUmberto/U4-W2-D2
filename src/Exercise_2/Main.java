package Exercise_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> list = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Quanti numeri vuoi generare?");
        n = Integer.parseInt(sc.nextLine());
        list = NewList(n);
        List<Integer> reverseList = ReverseList(list);
        System.out.println("Lista iniziale: " + list);
        System.out.println("Lista iniziale + Lista reverse: " + reverseList);
    }

    public static TreeSet<Integer> NewList(int n) {
        Random rnd = new Random();
        TreeSet<Integer> list = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            list.add(rnd.nextInt(0, 100));
        }
        return list;
    }

    public static List<Integer> ReverseList(TreeSet<Integer> list) {

        TreeSet<Integer> reverseTree = new TreeSet<>(Comparator.reverseOrder());
        List<Integer> combinedTree = new ArrayList<>();
        reverseTree.addAll(list);
        combinedTree.addAll(list);
        combinedTree.addAll(reverseTree);
        return combinedTree;


    }
}
