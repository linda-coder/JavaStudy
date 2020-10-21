package main;

import java.util.Arrays;
import java.util.Comparator;

public class Sort implements Sort_Interface {

	@Override
	public double[] getSumGrage(String[][] data) {
		double[] sum = { 0.0, 0.0, 0.0, 0.0 };
		for (int i = 0; i < data.length; i++) {
			sum[i] = Double.parseDouble(data[i][2]) + Double.parseDouble(data[i][3]) + Double.parseDouble(data[i][4]);
		}
		return sum;
	}

	@Override
	public String[][] sort_Sum(double[] grade, String[][] data) {
		for (int i = 0; i < data.length; i++) {
			data[i][5] = String.valueOf(grade[i]);
		}
		sortByColumn(data, new int[] {5,1});
		return data;
	}

	public void prinAttr(String[][] data) {
		for (int i = 0; i < data.length; i++){
			 System.out.println(Arrays.toString(data[i]));
		}
	}
	private static void sortByColumn(String[][] ob, final int[] order) {
        Arrays.sort(ob, new Comparator<Object>() {
            public int compare(Object o1, Object o2) {
            	String[] one = (String[]) o1;
            	String[] two = (String[]) o2;
                for (int i = 0; i < order.length; i++) {
                    int k = order[i];
                    if (one[k].compareTo(two[k])  > 0) { 
                        return 1;
                    } else if (one[k].compareTo(two[k])  < 0) {
                        return -1;
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        });
    }
}
