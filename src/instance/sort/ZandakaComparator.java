package instance.sort;

import instance.equals.Account;

import java.util.Comparator;

// コンパレータの実装
public class ZandakaComparator implements Comparator<Account> {
    public int compare(Account x, Account y) {
        return (x.zandaka - y.zandaka);
    }
}
