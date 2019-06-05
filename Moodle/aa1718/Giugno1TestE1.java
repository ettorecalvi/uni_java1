public class Giugno1TestE1 {
	public static void main(String[] args) {
		int[]   a0 = null;
		int[][] b0 = null;
		int[]   a1 = {};
		int[][] b1 = {};
		int[]   a2 = {2};
		int[][] b2 = {{8,9}};
		int[]   a3 = {2};
		int[][] b3 = {{8,9,10},{8,10}};
		int[]   a4 = {2};
		int[][] b4 = {{8,9,2 },{8,10}};
		int[]   a5 = {2,9,3};
		int[][] b5 = {{8,9,2 },{8,10}};
		int[]   a6 = {2,9,3,11,2}; // 
		int[][] b6 = {{8,9,2 },{3,4},{4,5}};//
		System.out.println(Giugno1.e1(a0, b0)==1);/* Atteso true: a e b sono vuoti. */
		System.out.println(Giugno1.e1(a0, b1)==1);/* Atteso true: a e b sono vuoti. */
		System.out.println(Giugno1.e1(a1, b0)==1);/* Atteso true: a e b sono vuoti. */
		System.out.println(Giugno1.e1(a1, b1)==1);/* Atteso true: a e b sono vuoti. */
		System.out.println(Giugno1.e1(a2, b2)==2);
		/* Atteso true: a2[0] minore di tutti gli elementi in b2[0]. */
		System.out.println(Giugno1.e1(a3, b3)==2);
		/* Atteso true: a3[0] minore di tutti gli elementi in b3[0]. 
		 * Il risultato non deve essere 4 anche se a3[0] è minore di ogni elemento di b3[1] */
		System.out.println(Giugno1.e1(a4, b4)==2);
		/* Atteso true: a4[0] minore di tutti gli elementi in b4[1]. */
		System.out.println(Giugno1.e1(a5, b5)==2*3);
		/* Atteso true: a5[0] e a5[2] minori di tutti gli elementi in b5[1]. */
		System.out.println(Giugno1.e1(a6, b6)==2*3*2);
		/* Atteso true: a6[0] minore di tutti gli elementi in b6[1]
		 * e a6[4] minore di tutti gli elementi in b6[2] */
	}
}