package lista4;

public class Exerc3 {
	public static void main(String[] args) {
		int n1[][] = new int[4][6];
		int n2[][] = new int[4][6];
		int m1[][] = new int[4][6];
		int m2[][] = new int[4][6];
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
				n1[i][j] = randomInt(0, 10);
				n2[i][j] = randomInt(0, 10);
			}
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
				m1[i][j] = n1[i][j] + n2[i][j];
				m2[i][j] = n1[i][j] - n2[i][j];
				if(m2[i][j] < 0) {
					m2[i][j] = m2[i][j]*(-1);
				}
			}
		}
	}

	public static int randomInt(int min, int max) {
		double x = (int)(Math.random()*((max-min)+1))+min;	
		int y = (int)x;
		return y;
	}
}