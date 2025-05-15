package excelpack;

import java.io.IOException;

public class Excel_Ex2 {

	public static void main(String[] args) throws IOException {
		String h=Excel_Ex1.getStringData(1,0);
		System.out.println(h);
		String r=Excel_Ex1.getIntergerData(1, 1);
		System.out.println(r);
		String j=Excel_Ex1.getStringData(2, 0);
		String m=Excel_Ex1.getFloatData(2, 1);
		System.out.println(j+"\n"+m);

	}

}
