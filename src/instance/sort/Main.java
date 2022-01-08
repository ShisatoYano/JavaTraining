package instance.sort;

import instance.equals.Account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<Account> list = new ArrayList<>();

        // 自然順序で並び替える
        Collections.sort(list);

        // 残高順で並び替える
        Collections.sort(list, new ZandakaComparator());

        // 自然順序で並び替えるTreeSetを生成
        TreeSet<Account> accounts1 = new TreeSet<>();

        // 格納すると残高順で並び替えるTreeSetを生成
        TreeSet<Account> accounts2 = new TreeSet<>(new ZandakaComparator());
    }
}
