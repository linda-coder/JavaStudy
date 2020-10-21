package test;

import org.easymock.EasyMock;
import org.junit.Test;
import main.AverageMax;
import main.AverageMax_Interface;
import main.ReadTxt;

public class Test01 {
	
//	@Test
	public void test() {
		ReadTxt rt = new ReadTxt();
		String name  = "E:\\eclipse\\workspace\\TDD_ManageGrade\\src\\data_managegrade.txt";
		String str[][] = rt.reader(name);
		AverageMax am = new AverageMax();
		String avenum = am.ave(str);
		System.out.println(avenum);
		String maxnum = am.max(str);
		System.out.println(maxnum);
		
		
	}
	
//	@Test
	public void testSort() {
		ReadTxt rt = new ReadTxt();
		String name  = "E:\\eclipse\\workspace\\TDD_ManageGrade\\src\\data_managegrade.txt";
		String str[][] = rt.reader(name);
		
		AverageMax_Interface am=EasyMock.createMock(AverageMax_Interface.class);
		AverageMax_Interface am_real=new AverageMax();
    	EasyMock.expect(am.ave(str)).andReturn(am_real.ave(str));
    	EasyMock.replay(am);
//    	assertArrayEquals("数学平均分为89.5,语文平均分为82.75,英语平均分为86.5", am.ave(str));
	}

}
