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
//    	assertArrayEquals("��ѧƽ����Ϊ89.5,����ƽ����Ϊ82.75,Ӣ��ƽ����Ϊ86.5", am.ave(str));
	}

}
