package kirill.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        System.out.println(createAndGetSortedList());
    }

    public static List<Integer> createAndGetSortedList(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() * 100));
        }
        //Collections.sort(list); готовая сортировка
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        return list;
    }
}
