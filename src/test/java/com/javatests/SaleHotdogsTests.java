package com.javatests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaleHotdogsTests {
    @Test
    public void sell1() {
        assertEquals(100, SaleHotdogs.saleHotdogs(1));
    }
    @Test
    public void sell4() {
        assertEquals(400, SaleHotdogs.saleHotdogs(4));
    }
    @Test
    public void sell5() {
        assertEquals(475,SaleHotdogs.saleHotdogs(5));
    }
    @Test
    public void sell9() {
        assertEquals(855,SaleHotdogs.saleHotdogs(9));
    }
    @Test
    public void sell10() {
        assertEquals(900,SaleHotdogs.saleHotdogs(10));
    }
    @Test
    public void sell100() {
        assertEquals(9000,SaleHotdogs.saleHotdogs(100));
    }

}
