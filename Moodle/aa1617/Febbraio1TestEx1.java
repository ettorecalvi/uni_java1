public class Febbraio1TestEx1 {
	public static void main(String[] args) {
		int[] a0 = null;
		int[] a1 = {};
		int[] a2 = {0};
		int[] a3 = {2,3};
		int[] a4 = {3,2};
		int[] a5 = {5,2};//
		int[] b0 = null;
		int[] b1 = {};
		int[] b2 = {4,-1,0,1,1};
		int[] b3 = {4,4,4,4,1};
		int[] b4 = {6,6,6,3,6,4};//
		System.out.println(Febbraio1.ex1(a0,b0)==false); // atteso true perche':
		// nessuno tra a0 e b0 contiene elementi
		System.out.println(Febbraio1.ex1(a0,b1)==false); // atteso true perche':
		// nessuno tra a0 e b0 contiene elementi
		System.out.println(Febbraio1.ex1(a1,b0)==false); // atteso true perche':
		// nessuno tra a0 e b0 contiene elementi
		System.out.println(Febbraio1.ex1(a1,b1)==false); // atteso true perche':
		// nessuno tra a0 e b0 contiene elementi
		System.out.println(Febbraio1.ex1(a2,b0)==false); // atteso true perche':
		// b0 non ha elementi
		System.out.println(Febbraio1.ex1(a2,b2)==true); // atteso true perche':
		// b2[1] e' inferiore ad a2[0] e a2[0] e' l'unico elemento in a2
		System.out.println(Febbraio1.ex1(a3,b3)==true) ; // atteso true perche':
		// per ogni elemento di a3 esiste b3[1] che e' piu' piccolo
		System.out.println(Febbraio1.ex1(a4,b3)==true) ; // atteso true perche':
		// per ogni elemento di a4 esiste b3[1] che e' piu' piccolo
		System.out.println(Febbraio1.ex1(a5,b4)==true); // atteso true perche':
		// esiste un elemento di a5, che e' a5[2],  piu' piccolo di ogni elemento in b4   
	}
}
