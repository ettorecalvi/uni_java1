import java.util.Arrays;

public class Settembre1TestE2 {
	public static void main(String[] args) {

		 char[] a0 = null;
		 char[] b0 = null;
		 System.out.println(Arrays.equals(Settembre1.e2(a0),b0)); /* Atteso true. */
		 char[] a1 = {};
		 char[] b1 = {};
		 System.out.println(Arrays.equals(Settembre1.e2(a1),b1)); /* Atteso true. */
		 char[] a2 = {'a'};
		 char[] b2 = {'a'};
		 System.out.println(Arrays.equals(Settembre1.e2(a2),b2)); /* Atteso true. */
		 char[] a3 = {'a','a'};
		 char[] b3 = {'a','a'};
		 System.out.println(Arrays.equals(Settembre1.e2(a3),b3)); /* Atteso true. */
		 char[] a4 = {'a','b'};
		 char[] b4 = {'b','a'};
		 System.out.println(Arrays.equals(Settembre1.e2(a4),b4)); /* Atteso true. */
		 char[] a5 = {'a','b','c'};
		 char[] b5 = {'c','b','a'};
		 System.out.println(Arrays.equals(Settembre1.e2(a5),b5)); /* Atteso true. */
		 char[] a6 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
		 char[] b6 = {'d', 'l', 'r', 'o', 'w', ' ', 'o', 'l', 'l', 'e', 'h'};
		 System.out.println(Arrays.equals(Settembre1.e2(a6),b6)); /* Atteso true. */
	}
}
