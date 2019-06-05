import java.util.Arrays;

public class Luglio1TestE2 {
	public static void main(String[] args) {
		int[] a0 = null;
		int[] b0 = null;
		int[] a1 = {};
		int[] b1 = {};
		int[] a2 = {0};
		int[] b2 = {1};
		int[] b2Modificata = {0};
		int[] a3 = {0,1};
		int[] b3 = {2};
		int[] b3Modificata = {0};
		int[] a4 = {0};
		int[] b4 = {2,1};
		int[] b4Modificata = {0,1};
		int[] a5 = {0,1,0,3};
		int[] b5 = {1,2,3,4,5};
		int[] b5Modificata = {0,2,0,4,5};
		int[] a6 = {0,1,0,3,0};
		int[] b6 = {1,2,3,4};
		int[] b6Modificata = {0,2,0,4};

		System.out.println(Arrays.equals(Luglio1ConSoluzioni.e2(a0, b0),b0));/* Atteso true: b e' null. */
		System.out.println(Arrays.equals(Luglio1ConSoluzioni.e2(a1, b0),b0));/* Atteso true: a e' vuoto. */
		System.out.println(Arrays.equals(Luglio1ConSoluzioni.e2(a0, b1),b1));/* Atteso true: b e' vuoto. */
		System.out.println(Arrays.equals(Luglio1ConSoluzioni.e2(a1, b1),b1));/* Atteso true: b e' vuoto. */
		System.out.println(Arrays.equals(Luglio1ConSoluzioni.e2(a2, b2),b2Modificata));
		/* Atteso true: valore di a2[0] sostituito a quello di b2[0]. */
		System.out.println(Arrays.equals(Luglio1ConSoluzioni.e2(a3, b3),b3Modificata));
		/* Atteso true: valore di a3[0] sostituito a quello di b3[0]. */
		System.out.println(Arrays.equals(Luglio1ConSoluzioni.e2(a4, b4),b4Modificata));
		/* Atteso true: valore di a4[0] sostituito a quello di b4[0]. */
		System.out.println(Arrays.equals(Luglio1ConSoluzioni.e2(a5, b5),b5Modificata));
		/* Atteso true: valori di a5[0], a5[2] sostituiti a quelli di b5[0], b5[2]. */
		System.out.println(Arrays.equals(Luglio1ConSoluzioni.e2(a6, b6),b6Modificata));
		/* Atteso true: valori di a6[0], a6[2] sostituiti a quelli di b6[0], b6[2]. */
	}
}