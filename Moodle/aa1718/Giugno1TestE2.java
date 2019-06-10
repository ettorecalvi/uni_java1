import java.util.Arrays;

public class Giugno1TestE2 {
	public static void main(String[] args) {
		int[] a0 = null;
		int[] b0 = null;
		int[] a1 = {};
		int[] b1 = {};
		int[] a2 = {1};
		int[] b2 = {2};
		int[] b2Modificata = {1};
		int[] a3 = {0,1};
		int[] b3 = {1};
		int[] b3Modificata = {1};
		int[] a4 = {0};
		int[] b4 = {2,1};
		int[] b4Modificata = {0,1};
		int[] a5 = {0,1,0,3};
		int[] b5 = {1,2,3,4,5};
		int[] b5Modificata = {1,1,3,3,5};
		int[] a6 = {0,1,0,3,0};
		int[] b6 = {2,3,4,5};
		int[] b6Modificata = {0,3,0,5};

		System.out.println(Arrays.equals(Giugno1e.e2(a0, b0),b0));/* Atteso true: b e' null. */
		System.out.println(Arrays.equals(Giugno1e.e2(a1, b0),b0));/* Atteso true: a e' vuoto. */
		System.out.println(Arrays.equals(Giugno1e.e2(a0, b1),b1));/* Atteso true: b e' vuoto. */
		System.out.println(Arrays.equals(Giugno1e.e2(a1, b1),b1));/* Atteso true: b e' vuoto. */
		System.out.println(Arrays.equals(Giugno1e.e2(a2, b2),b2Modificata));
		/* Atteso true: valore di a2[0] sostituito a quello di b2[0]. */
		System.out.println(Arrays.equals(Giugno1e.e2(a3, b3),b3Modificata));
		/* Atteso true: nessun valore di a3[0] sostituito. */
		System.out.println(Arrays.equals(Giugno1e.e2(a4, b4),b4Modificata));
		/* Atteso true: valore di a4[0] sostituito a quello di b3[0]. */
		System.out.println(Arrays.equals(Giugno1e.e2(a5, b5),b5Modificata));
		/* Atteso true: valori di a[1] e a[3] sostituiti a quelli di b[1] e b[3]. */
		System.out.println(Arrays.equals(Giugno1e.e2(a6, b6),b6Modificata));
		/* Atteso true: valori di a[0] e a[2] sostituiti a quelli di b[0] e b[2]. */
	}
}