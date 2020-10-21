package main;

public class Select implements Select_Interface {

	@Override
	public String[] Select_No(String no, String[][] data) {
		// TODO Auto-generated method stub
		for (int i = 0; i < data.length; i++) {
			if (data[i][0].equals(no)) {
				return data[i];
			}
		}
		return null;
	}
}
