package test;

import java.util.Arrays;
import java.util.Scanner;

import main.AverageMax;
import main.ReadTxt;
import main.ReadTxt_Interface;
import main.Select;
import main.Select_Interface;
import main.Sort;
import main.Sort_Interface;

public class test {
	static String name = "E:\\data\\data_managegrade.txt";

	public static void main(String[] args) {

		// 读取出成绩文件
		ReadTxt_Interface rei = new ReadTxt();
		String data[][] = rei.reader(name);
		// 计算平均值与最大值
		AverageMax am = new AverageMax();
		String avenum = am.ave(data);
		System.out.println(avenum);
		String maxnum = am.max(data);
		System.out.println(maxnum);

		// 计算总成绩并且按总成绩排序
		Sort_Interface si = new Sort();
		double[] sumGrade = si.getSumGrage(data);
		// for(double i :sumGrade){
		// System.out.println(i);
		// }
		System.out.println();
		String[][] str = si.sort_Sum(sumGrade, data);
		System.out.println("排序后的名单为：");
		prinAttr(str);

		// 根据学号查询学生成绩
		Select_Interface sli = new Select();
		Scanner sc = new Scanner(System.in);// 键盘录入学生学号，学号定义为String 类型
		System.out.println("请输入学生学号：");
		String no = sc.next();
		String[] student = sli.Select_No(no,str);
		System.out.println("学号为" + no + "的学生的各科成绩为：" + Arrays.toString(student) );
			
	}

	public static void prinAttr(String[][] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.println(Arrays.toString(data[i]));
		}
	}

}
