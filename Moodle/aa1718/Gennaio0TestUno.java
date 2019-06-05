public class Gennaio0TestUno {
	public static void main(String[] args) {
		int[][] a0 = null;
		int[][] a1 = {};
		int[]   b0 = null;
		int[]   b1 = {};

		int[][] a2 = {{2, 3, 4}, null, {10, 5}};
		int[][] a3 = {{2, 3, 5}, {}, {10, 17}};
		int[][] a4 = {null, {}, null};
		int[][] a5 = {null, {2, 4, 8}};

		int[]   b2 = {7, 8, 7, 20};
		int[]   b3 = {16, 6};
		
		System.out.println(Gennaio0.eUno(a0,b0)== 0); // atteso true
		System.out.println(Gennaio0.eUno(a1,b0)== 0); // atteso true
		System.out.println(Gennaio0.eUno(a0,b1)== 0); // atteso true
		System.out.println(Gennaio0.eUno(a1,b1)== 0); // atteso true
		System.out.println(Gennaio0.eUno(a2,b1)== 0); // atteso true
		System.out.println(Gennaio0.eUno(a2,b2)==2+4+10+5); // atteso true
		System.out.println(Gennaio0.eUno(a3,b2)==2+5+10); // atteso true
		System.out.println(Gennaio0.eUno(a4,b2)== 0); // atteso true
		System.out.println(Gennaio0.eUno(a5,b3)==2+4+8); // atteso true
	}
}
