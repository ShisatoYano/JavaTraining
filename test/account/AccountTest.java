package account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    public void testOwner() {
        Account account = new Account("Minato", 10);
        assertEquals("Minato", account.owner);
    }

    @Test
    public void testZandaka() {
        Account account = new Account("Minato", 10);
        assertEquals(10, account.zandaka);
    }

    @Test
    public void testTransfer() {
        Account account_src = new Account("Minato", 10);
        Account account_dest = new Account("Asakura", 20);
        account_src.transfer(account_dest, 5);
        assertEquals(25, account_dest.zandaka);
        assertEquals(5, account_src.zandaka);
    }
}