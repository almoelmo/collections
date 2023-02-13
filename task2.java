package kirill.collections;

import java.util.*;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(splitLine(scan.nextLine()));
    }

    public static List<String> splitLine(String line){
        String[] forSplit = line.split(" ");
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        for (int i = 0; i < forSplit.length; i++) {
            hashSet.add(forSplit[i]);
        }
        ArrayList<String> list = new ArrayList<>();
        for (String it : hashSet) {
            list.add(it);
        }
        return list;
    }
}
