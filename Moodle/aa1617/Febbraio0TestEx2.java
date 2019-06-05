public class Febbraio0TestEx2 {
	public static void main(String[] args) {
		int[] a0 = null;
		int[] a1 = {};
		int[] a2 = {0};
		int[] a3 = {5};
		int[] a4 = {5,0,0,0,5};
		int[] a5 = {5,5,5,0,5,0};
		int[] a6 = {5,0,5,0,5,0,5};
				
		System.out.println(Febbraio0.ex2(a0,5)==false); // atteso true perche':
		// a0 non ha elementi
		System.out.println(Febbraio0.ex2(a1,5)==false); // atteso true perche':
		// a1 non ha elementi
		System.out.println(Febbraio0.ex2(a2,5)==false); // atteso true perche':
		// l'unico elemento in posizione pari di a2 e' diverso da 5
		System.out.println(Febbraio0.ex2(a3,5)==true ); // atteso true perche':
		// l'unico elemento in posizione pari di a2 e' uguale a 5
		System.out.println(Febbraio0.ex2(a4,5)==false); // atteso true perche':
		// ad esempio a4[2] non contiene 5
		System.out.println(Febbraio0.ex2(a5,5)==true ); // atteso true perche':
		// a5[0], a5[2] e a5[4] contengono 5
		System.out.println(Febbraio0.ex2(a6,5)==true ); // atteso true perche':
		// a5[0], a5[2] e a5[4] contengono 5
	}
}
