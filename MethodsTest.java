package lifegame;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class MethodsTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCheck() {
		Methods me = new Methods();
		String[][] teststr = {{"●","●","○","○"},{"○","○","○","○"},{"●","○","●","○"},{"○","●","●","○"}};
		int[] exp_result = {1,1,0,0,3,0,0,0,1,0,2,0,0,2,2,0};
		assertEquals(true, Arrays.equals(exp_result, me.check(teststr)));
	}

	@Test
	public void testGetNext() {
		Methods me = new Methods();
		String[][] teststr2 = {{"●","●","○","○"},{"○","○","○","○"},{"●","○","●","○"},{"○","●","●","○"}};
		int[] point = {1,1,0,0,3,0,0,0,1,0,2,0,0,2,2,0};
		String[][] exp_str = {{"○","○","○","○"},{"●","○","○","○"},{"○","○","●","○"},{"○","●","●","○"}};
		me.getNext(teststr2, point);
		int c = 0;
		for(int m = 0; m < 4; m++) {
			for(int n = 0; n < 4; n++) {
				if(exp_str[m][n].equals(teststr2[m][n])) c++;
			}
		} //判断生成串是否与期望串相等
		assertEquals(16, c);
	}
}
