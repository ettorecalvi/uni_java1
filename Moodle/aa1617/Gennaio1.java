/**
 * ESAME PROGRAMMAZIONE 1 
 * Matricola: SCRIVERLA ORA!!!
 * Cognome: SCRIVERLO ORA!!!
 * Nome: SCRIVERLO ORA!!!
 * Corso: SCRIVERLO ORA!!!
 * 
 * Inoltre, SCRIVERE ORA nome, cognome, matricola, corso, NUMERO DEL PC sul foglio distribuito.
 * 
 * PER CONSEGNARE/RITIRARSI chiamare un docente.
 */

public class Gennaio1 {
	/* ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo iterativo di nome ex1 con le seguenti caratteristiche:
	 * --) ex1 ha due parametri formali. Il primo e' un riferimento (puntatore, reference) 
	 *     ad un array di interi di nome a; il secondo e' un riferimento ad un array di interi di nome b,
	 * --) ex1 restituisce il valore true se nessun elemento di a compare piu' di una volta in b. 
	 *     Il risultato deve essere false in tutti gli altri casi, inclusi quelli in cui almeno
	 *     uno tra a e b sia null o contenga zero elementi. 
	 * La classe Gennaio1TestEx1 può essere usata per il testing di ex1 e, quindi, contiene esempi sul funzionamento 
	 * atteso per ex1. 
	 * DOVE SCRIVERE ex1: immediatamente al di sotto di questo commento.  
	 */
		public static boolean e1 (int[] a, int[] b){
			boolean ok = false;
			int count;
			if((a != null && b != null)&&(a.length !=0 && b.length != 0)){
				for(int i=0; i<a.length; i++){
					count = 0;
					for(int j=0; j<b.length; j++){
						if(a[i] == b[j]){
							count++;
						}
						if(count > 1){
							ok = true;
						}
					}
				}
			}
			return ok;
		}

	/* ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo di nome ex2 con le seguenti caratteristiche:
	 * --) ex2 ha due parametri formali. Il primo e' un riferimento (puntatore, reference) 
	 *     ad un array di interi di nome a; il secondo e' un intero k,
	 * --) ex2 restituisce true se k non ha occorrenze in a. Altrimenti il risultato e' false.
	 * --) ex2 richiama un metodo ricorsivo di nome conta, che visita l'array a dicotomicamente, ovvero suddivide a, 
	 *     ad ogni chiamata, in due parti di lunghezza essenzialmente identica.
	 * La classe Gennaio1TestEx2 può essere usata per il testing di ex2 e, quindi, contiene esempi sul funzionamento 
	 * atteso per ex2. 
	 * DOVE SCRIVERE ex2: immediatamente al di sotto di questo commento.  
	 */
	
	/* ESERCIZIO 3 (Massimo 2 + 2 + 3 + 3 punti -- da consegnare a mano).
	 * Sia dato il metodo ex3 qui sotto definito.
	 * Assumiamo che il parametro formale a abbia sempre almeno due elementi e che i>=2.
	 * Dimostrare che ex3 soddisfa il seguente predicato:
	 * 
	 *    ex3(a,i) == true <==> (per ogni k. 2=<k<=i ==> a[k-2]<=a[k-1])
	 *  
	 * 1) scrivere esplicitamente il caso base P(2) per la dimostrazione per induzione, (2 punti)
	 * 2) scrivere esplicitamente il caso induttivo per la dimostrazione per induzione, (2 punti)
	 * 3) dimostrare che il caso base P(2) della dimostrazione per induzione e' vero, (3 punti)
	 * 4) dimostrare che il caso induttivo della dimostrazione per induzione e' vero. (3 punti)
	 */
	public static boolean ex3 (int[] a, int i) {
		if (i == 2)
			return a[0] <= a[1];
		else
			return ex3(a, i - 1) && a[i-2] <= a[i-1]; 
	}

	 /* ESERCIZIO 4 (Massimo 8 punti -- da consegnare a mano).
	  * Scrivere lo stato della memoria della JVM alla riga col commento // (B),
	  * ovvero giusto prima della disallocazione del frame relativo ad x.
	  */
	 public static void x(int[][] m) {
		 int i;
		 for(i = 0; i < m.length - 1; i++) {
			 m[i+1] = m[i];
			 m[i] = new int[i+1];
		 }
		 // (B)
	 }
	 public static void main(String[] args) {
		 int[][] m = new int[2][];
		 int[] a = {10, 20};
		 int[] b = {30, 40};
		 m[0] = a;
		 m[1] = b;
		 x(m);       // usare (A) come indirizzo per questa istruzione
	 }	 
}
