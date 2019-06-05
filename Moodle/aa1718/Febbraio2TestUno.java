public class Febbraio2TestUno {
	public static void main(String[] args) {
		int[]   a0 = null;
		int[]   a1 = {};
		int[]   a2 = {7, 8, 7, 20};
		int[]   a3 = {1, 5};

		int[][] b0 = null;
		int[][] b1 = {};
		int[][] b2 = {{2, 3, 14}, null, {10, 16}};
		int[][] b3 = {{2, 3, 6}, {}, {10, 17}};
		int[][] b4 = {null, {}, null};
		int[][] b5 = {null, {2, 4, 8}};

		System.out.println(Febbraio2.eUno(a0,b0)== 0); // atteso true
		System.out.println(Febbraio2.eUno(a1,b0)== 0); // atteso true
		System.out.println(Febbraio2.eUno(a0,b1)== 0); // atteso true
		System.out.println(Febbraio2.eUno(a1,b1)== 0); // atteso true
		System.out.println(Febbraio2.eUno(a2,b1)== 0); // atteso true
		System.out.println(Febbraio2.eUno(a2,b2)==7+8+7); // atteso true 
		System.out.println(Febbraio2.eUno(a3,b3)==1+5); // atteso true 
		System.out.println(Febbraio2.eUno(a3,b4)==0); // atteso true
		System.out.println(Febbraio2.eUno(a2,b5)==8); // atteso true
	}
}
