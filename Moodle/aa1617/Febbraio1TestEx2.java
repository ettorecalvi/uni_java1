public class Febbraio1TestEx2 {
	public static void main(String[] args) {
		int[] a0 = null;
		int[] a1 = {};
		int[] a2 = {0};
		int[] a3 = {5};
		int[] a4 = {0,0,0,0,5};//
		int[] a5 = {0,0,0,0,0,5};
		int[] a6 = {0,0,0,5,0};
		int[] a7 = {0,5,0,0,0,0};
				
		System.out.println(Febbraio1.ex2(a0,5)==false); // atteso true perche':
		// a0 non ha elementi
		System.out.println(Febbraio1.ex2(a1,5)==false); // atteso true perche':
		// a1 non ha elementi
		System.out.println(Febbraio1.ex2(a2,5)==false); // atteso true perche':
		// l'unico elemento in posizione pari di a2 non e' 5
		System.out.println(Febbraio1.ex2(a3,5)==true); // atteso true perche':
		// l'unico elemento in posizione pari di a3 e' 5
		System.out.println(Febbraio1.ex2(a4,5)==true); // atteso true perche':
		// 5 e' in posizione pari 
		System.out.println(Febbraio1.ex2(a5,5)==false); // atteso true perche':
		// 5 non e' in posizione pari
		System.out.println(Febbraio1.ex2(a6,5)==false); // atteso true perche':
		// a6 non contiene 5
		System.out.println(Febbraio1.ex2(a7,5)==false); // atteso true perche':
		// a7 non contiene 5
	}
}
