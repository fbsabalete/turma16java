package aulas;

import java.io.IOException;
import java.util.Scanner;

public class ReadingTXT {
	public static void main(String[] args) {
		Scanner sc = null;
		
			sc = new Scanner("C:\\temp\\Lista.txt");
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		
	}
}
