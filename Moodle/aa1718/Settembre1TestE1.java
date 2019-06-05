import java.util.Arrays;

public class Settembre1TestE1 {
	public static void main(String[] args) {

		char[][]  a0 = null;
		boolean[] b0 = null;
		System.out.println(Arrays.equals(Settembre1.e1(a0), b0)); /* Atteso true. Funziona */
		
		char[][]  a1 = {};
		boolean[] b1 = {};
		System.out.println(Arrays.equals(Settembre1.e1(a1), b1)); /* Atteso true. Funziona */


		char[][]  a2 = {{'a'}};
		boolean[] b2 = {true};
		System.out.println(Arrays.equals(Settembre1.e1(a2), b2)); /* Atteso true. /
 
		char[][]  a3 = {{'a'},{'b'}};
		boolean[] b3 = {true, true};
		System.out.println(Arrays.equals(Settembre1.e1(a3), b3)); /* Atteso true. /
		
		char[][]  a4 = {{'a','c'},{'b'}};
		boolean[] b4 = {false, true};
		System.out.println(Arrays.equals(Settembre1.e1(a4), b4)); /* Atteso true. /

		char[][]  a5 = {{'a'},{'c','b'}};
		boolean[] b5 = {true, false};
		System.out.println(Arrays.equals(Settembre1.e1(a5), b5)); /* Atteso true. /

		char[][]  a6 = {{'a','d'},{'c','b'}};
		boolean[] b6 = {false, false};
		System.out.println(Arrays.equals(Settembre1.e1(a6), b6)); /* Atteso true. /

		char[][]  a7 = {{'a','a'},{'b','b'}};
		boolean[] b7 = {true, true};
		System.out.println(Arrays.equals(Settembre1.e1(a7), b7)); /* Atteso true. /

		char[][] a8 = { { 'h', 'e', 'l', 'l', 'o' }, // non palindroma
				      { 'w', 'a', 's', ' ', 'i', ' ', 'e', 'r', 'e', ' ', 'i', ' ', 's', 'a', 'w' }, // palindroma
				      { 'a', 'n', 'i', 'l', 'i', 'n', 'a' }, // palindroma
				      { 'm', 'i', 'c', 'k', 'e', 'y' }, // non palindroma
				      { 'i', 'n', 'g', 'e', 'g', 'n', 'i' }, // palindroma
				      {}, // palindroma
			   	      null };
		boolean[] b8 = {false, true, true, false, true, true, false };
		System.out.println(Arrays.equals(Settembre1.e1(a8), b8)); /* Atteso true. */

		
	}
}
