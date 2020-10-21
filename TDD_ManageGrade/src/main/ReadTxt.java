package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadTxt implements ReadTxt_Interface{
	
	ReadTxt_Interface rti;
	public void set_ReadTxt_Interface(ReadTxt_Interface rti) {
		this.rti = rti;
	}
	
	@Override	
	public String[][] reader(String name) {
			
			String[][] ss = new String[4][4];//四维数组读取成绩
			try {
				File file = new File(name);
				InputStreamReader input = new InputStreamReader(new FileInputStream(file));
				BufferedReader bf = new BufferedReader(input);
				// 按行读取字符串
				String[] words3 = bf.readLine().split("\\,");
				String[] words4 = bf.readLine().split("\\,");
				String[] words5 = bf.readLine().split("\\,");
				String[] words6 = bf.readLine().split("\\,");
				ss[0] = words3;
				ss[1] = words4;
				ss[2] = words5;
				ss[3] = words6;
				
				bf.close();
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	
			return ss;	
		}
}
