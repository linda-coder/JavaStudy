package main;


public class AverageMax implements AverageMax_Interface{

	public String ave(String[][] str) {
		String [][]array = str;
		double avedatamath = 0;
		double avedatacha = 0;
		double avedataeng = 0;
		double num;
		//数学
		num = 0;
		for(int i = 0;i<array.length;i++) {
			num = Integer.parseInt(array[i][2]) + num;
			avedatamath = num/array.length;
		}
		//语文
		num = 0;
		for(int i = 0;i<array.length;i++) {
			num = Integer.parseInt(array[i][3]) + num;
			avedatacha = num/array.length;
		}
		//英语
		num = 0;
		for(int i = 0;i<array.length;i++) {
			num = Integer.parseInt(array[i][4]) + num;
			avedataeng = num/array.length;
		}
		return"数学平均分为"+avedatamath+",语文平均分为"+avedatacha+",英语平均分为"+avedataeng;
	}
	public String max(String[][] str) {
		String [][]array = str;
		int tempmath = 0;
		int tempcha = 0;
		int tempeng = 0;
		//数学
		for(int i = 0;i<array.length;i++) {
			if(tempmath< Integer.parseInt(array[i][2])) {
				tempmath = Integer.parseInt(array[i][2]);
			}
			
		}
		//语文
		for(int i = 0;i<array.length;i++) {
			if(tempcha< Integer.parseInt(array[i][2])) {
				tempcha = Integer.parseInt(array[i][2]);
			}
			
		}
		//英语
		for(int i = 0;i<array.length;i++) {
			if(tempeng< Integer.parseInt(array[i][2])) {
				tempeng = Integer.parseInt(array[i][2]);
			}
			
		}
		return"数学最高分为"+tempmath+",语文最高分为"+tempcha+",英语最高分为"+tempeng;
	}
	
}
