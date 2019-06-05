public class Luglio1TestE1 {
	public static void main(String[] args) {
		int[]   a0 = null;
		int[][] b0 = null;
		int[]   a1 = {};
		int[][] b1 = {};
		int[]   a2 = {2};
		int[][] b2 = {{2}
		             ,{9}};
		int[]   a3 = {2};
		int[][] b3 = {{2,1}
		             ,{1,0}
		             ,{0,3}};
		int[]   a4 = {4,2};
		int[][] b4 = {{4,2}
                     ,{1,0}
                     ,{0,3}};
		int[]   a5 = {2,9,3}; 
		int[][] b5 = {{1,9,2}
		             ,{2,8,3}
		             ,{3,7,4}};
		int[]   a6 = {10,2,9,3,2}; 
		int[][] b6 = {{9,2,9}
		             ,{8,3,8}
		             ,{7,4,7}};				
		System.out.println(Luglio1.e1(a0, b0)==0);/* Atteso true: a e b sono vuoti. */
		System.out.println(Luglio1.e1(a0, b1)==0);/* Atteso true: a e b sono vuoti. */
		System.out.println(Luglio1.e1(a1, b0)==0);/* Atteso true: a e b sono vuoti. */
		System.out.println(Luglio1.e1(a1, b1)==0);/* Atteso true: a e b sono vuoti. */
		System.out.println(Luglio1.e1(a2, b2)==2);
		/* Atteso true: a2[0] minore di b2[1][0]. */
		System.out.println(Luglio1.e1(a3, b3)==2);
		/* Atteso true: a3[0] minore di b3[2][1]. */
		System.out.println(Luglio1.e1(a4, b4)==2);
		/* Atteso true: a4[0] non e' minore di alcun elemento nelle colonne di b4.
		 *              a4[1] minore di b4[2][1]. */
		System.out.println(Luglio1.e1(a5, b5)==2+3);
		/* Atteso true: a5[0] e' minore di b5[2][0] e a5[2] e' minore di b5[0][1].
		 *              Invece a5[1] e' maggiore di ogni elemento di ogni colonna. */
		System.out.println(Luglio1.e1(a6, b6)==2+3+2);
		/* Atteso true: a6[1] e a6[4] sono minori di b6[1][1];
		 *              a6[3] e' minore di b6[2][1].
		 *              a6[0] e a6[2] non sono minori di alcun elemento di b6. */
	}
}