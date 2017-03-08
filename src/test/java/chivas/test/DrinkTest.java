package chivas.test;

import junit.framework.TestCase;
import me.wujl.whiskey.chivas.dao.Drink;

/**
 * @author wujl
 * @version V1.0
 * @Title: chivas-whiskey
 * @Package chivas.test
 * @Description:
 * @date 2017-02-21 17:54
 */

public class DrinkTest extends TestCase {
    public void testDrinkWhiskey() throws Exception {
        Drink d = new Drink();
        d.drinkWhiskey();
    }

}