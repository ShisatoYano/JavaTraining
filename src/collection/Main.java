package collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> points = new ArrayList<Integer>();
        points.add(10);
        points.add(80);
        points.add(75);
        for (int i : points) {
            System.out.println(i);
        }

        ArrayList<String> names = new ArrayList<String>();
        names.add("Minato");
        names.add("Asaka");
        names.add("Sugawara");
        Iterator<String> it = names.iterator();
        while (it.hasNext()) { // 矢印を次に進められるなら繰り返す
            String e = it.next(); // 矢印を次に進め、内容を取り出す
            System.out.println(e);
        }

        Set<String> colors = new HashSet<String>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("red"); // 重複は許さないので無視される
        System.out.println("色は" + colors.size() + "種類");

        Set<String> words = new TreeSet<String>();
        words.add("dog");
        words.add("cat");
        words.add("wolf");
        words.add("panda");
        for (String s : words) {
            System.out.println(s);
        }

        Map<String, Integer> pref = new HashMap<String, Integer>();
        pref.put("Kyoto", 255);
        pref.put("Tokyo", 1261);
        pref.put("Kumamoto", 181);
        int tokyo = pref.get("Tokyo");
        pref.remove("Kyoto");
        pref.put("Kumamoto", 182);
        int kumamoto = pref.get("Kumamoto");
        for (String key : pref.keySet()) {
            int value = pref.get(key);
            System.out.println(key + "の人口は" + value);
        }
    }
}
