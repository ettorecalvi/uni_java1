public class Febbraio0TestEx1 {
	public static void main(String[] args) {
		int[] a0 = null;
		int[] a1 = {};
		int[] a2 = {10,2};
		int[] a3 = {2,3};
		int[] b0 = null;
		int[] b1 = {};
		int[] b2 = {4,0,-1,1,1};
		int[] b3 = {4,0,-1,1,3};
		
		System.out.println(Febbraio0.ex1(a0,b0)==false); // atteso true perche':
		// nessuno tra a0 e b0 contiene elementi
		System.out.println(Febbraio0.ex1(a0,b1)==false); // atteso true perche':
		// nessuno tra a0 e b0 contiene elementi
		System.out.println(Febbraio0.ex1(a1,b0)==false); // atteso true perche':
		// nessuno tra a0 e b0 contiene elementi
		System.out.println(Febbraio0.ex1(a1,b1)==false); // atteso true perche':
		// nessuno tra a0 e b0 contiene elementi
		System.out.println(Febbraio0.ex1(a2,b0)==false); // atteso true perche':
		// b0 non contiene elementi
		System.out.println(Febbraio0.ex1(a2,b1)==false); // atteso true perche':
		// b1 non ha elementi
		System.out.println(Febbraio0.ex1(a2,b3)==true) ; // atteso true perche':
		// a2[0] e' maggiore di ogni elemento di b2  a partire dall'indice 0 
		System.out.println(Febbraio0.ex1(a3,b2)==true) ; // atteso true perche':
		// a3[1] e' maggiore di tutti gli elementi di b2 a partire dall'indice 1
		System.out.println(Febbraio0.ex1(a3,b3)==false); // atteso true perche':
		// ne' a3[0] e' maggiore di tutti gli elementi in b3 a partire dall'indice 0,
		// ne' a3[1] e' maggiore di tutti gli elementi in b3 a partire dall'indice 1.
	}
}
