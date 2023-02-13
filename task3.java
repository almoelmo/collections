package kirill.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(lineToMap(scan.nextLine()));
    }

    public static Map<Character, Integer> lineToMap(String line){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < line.length(); i++) {
            if(map.containsKey(line.charAt(i))){
                map.put(line.charAt(i), map.get(line.charAt(i)) + 1);
            }else{
                map.put(line.charAt(i), 1);
            }
        }
        return map;
    }
}
