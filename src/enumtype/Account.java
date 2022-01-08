package enumtype;

// 列挙型を利用した口座クラス
// 【利用例】 new Account("1732050", AccountType.FUTSU);
public class Account {
    private String accountNo;
    private int zandaka;
    private AccountType accountType;
    public Account(String aNo, AccountType aType) {}
}
