public class Giugno0TestEx1 {
	public static void main(String[] args) {
		int[][] a0 = null;
		int[][] a1 = {};
		int[][] b0 = null;
		int[][] b1 = {};
		System.out.println(Giugno0.ex1(a0,b0)==false); // atteso true perche':
		// nessuno tra a0 e b0 contiene elementi.
		
		System.out.println(Giugno0.ex1(a0,b1)==false); // atteso true perche':
		// nessuno tra a0 e b1 contiene elementi.
		
		System.out.println(Giugno0.ex1(a1,b0)==false); // atteso true perche':
		// nessuno tra a1 e b0 contiene elementi.
		
		System.out.println(Giugno0.ex1(a1,b1)==false); // atteso true perche':
		// nessuno tra a1 e b1 contiene elementi.

		int[][] a2 = {{0, 2, 3},{4, 5, 6},{1, 1, 1}};
		int[][] b2 = {{3, 2, 0},{1, 1, 1},{6, 5, 4}};
		System.out.println(Giugno0.ex1(a2,b2)==true ); // atteso true perche':
		// a2[2] == b2[1].
		
		int[][] a3 = {{0, 2, 3},{1, 1, 1},{4, 5, 6}};
		int[][] b3 = {{3, 2, 0},{6, 5, 4},{1, 1, 0}};
		System.out.println(Giugno0.ex1(a3,b3)==false); // atteso true perche':
		// nessuna riga di a3 è identica ad una riga di b3.
		
		int[][] a4 = {{1, 1, 1},{0, 2, 3},{4, 5, 6}};
		int[][] b4 = {{3, 2, 0},{6, 5, 4},{0, 1, 1}};
		System.out.println(Giugno0.ex1(a4,b4)==false); // atteso true perche':
		// nessuna riga di a4 è identica ad una riga di b4. 
		
		int[][] a5 = {{1, 1, 1},{0, 2, 3},{4, 5, 6}};
		int[][] b5 = {{1, 1, 0},{1, 1, 1},{6, 5, 4}};
		System.out.println(Giugno0.ex1(a5,b5)==true ); // atteso true perche':
		// a5[0] == b5[1].
		
		int[][] a6 = {{0, 2, 3},{1, 1, 1},{4, 5, 6}};
		int[][] b6 = {{1, 1, 0},{1, 1, 0},{1, 1, 1}};
		System.out.println(Giugno0.ex1(a6,b6)==true ); // atteso true perche':
		// a6[1] == b6[2].
	}
}
