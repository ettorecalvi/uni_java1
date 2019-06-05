/**
 * ESAME PROGRAMMAZIONE 1 
 * Matricola: SCRIVERLA ORA!!!
 * Cognome: SCRIVERLO ORA!!!
 * Nome: SCRIVERLO ORA!!!
 * Corso: SCRIVERLO ORA!!!
 * Inoltre, SCRIVERE ORA nome, cognome, matricola, corso, NUMERO DEL PC sul foglio distribuito.
 * PER CONSEGNARE/RITIRARSI chiamare un docente.
 */
public class Luglio2017 {	
	
	/* ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo iterativo di nome ex1 con le seguenti caratteristiche:
	 * --) 	ex1 ha due parametri formali di nome a e b. Entrambi sono riferimenti (puntatori, reference) 
	 * 	    a matrici di interi. Si assuma che il numero di righe e di colonne in a e b coincidano.
	 *      Se a non contiene elementi, nemmeno b puo' contenerne;
	 * --) 	ex1 restituisce true se in a esiste almeno una colonna che sia identica ad
	 *      una colonna di b. In ogni altro caso il risultato e' false. 
	 * La classe LuglioTestEx1 può essere usata per il testing di ex1, contenendo esempi sul 
	 * funzionamento atteso per ex1. 
	 * DOVE SCRIVERE ex1: qui sotto, immediatamente al di fuori di questo commento.  
	 */
	 
	 /* ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	  * Scrivere un metodo ricorsivo di nome ex2 con le seguenti caratteristiche:
	  * --) ex2 ha come unico parametro formale un riferimento (puntatore, reference) 
	  * 	ad un array di booleani di nome a;
	  * --) ex2 non restituisce nulla, ma modifica a come segue: 
	  *     se a non e' ne' vuota, ne' nulla, ogni elemento di posizione 
	  *     dispari di a e' sovrascritto dalla congiunzione tra se stesso e 
	  *     quello di posizione pari che lo precede;
	  * --) ex2 richiama un metodo ricorsivo di nome "sovrascrive" che visita l'array a dicotomicamente, 
	  *     ovvero che, ad ogni chiamata, suddivide a in due parti di lunghezza essenzialmente identica.	  
	 * La classe luglioTestEx2 puo' essere usata per il testing di ex1, contenendo esempi sul funzionamento 
	 * atteso per ex2. 
	 * DOVE SCRIVERE ex2: immediatamente al di sotto di questo commento.  
	  */
	  
	 /* ESERCIZIO 3 (Massimo 2 + 2 + 3 + 3 punti -- da consegnare a mano).
	  * Sia dato il metodo ex3 qui sotto definito. 
	  * Assumendo che il parametro formale a sia sempre diversi da null, lo scopo finale e' dimostrare per induzione 
	  * sul valore i che il predicato:
	  *  
	  *    b <==> esiste k (0 <= k < i && a[k] == true) 
	  * 
	  * che esso sia un possibile invariante di ciclo.
	  * Questo si ottiene strutturando la soluzione in accordo con i seguenti punti:
	  * 1) scrivere esplicitamente il caso base per la dimostrazione (2 punti);
	  * 2) scrivere esplicitamente il caso induttivo per la dimostrazione (2 punti);
	  * 3) dimostrare che il caso base della dimostrazione per induzione e' vero (3 punti);
	  * 4) dimostrare che il caso induttivo della dimostrazione per induzione e' vero (3 punti).
	  * E' possibile inframezzare i punti 1, 2, 3 e 4 al codice del metodo, se ritenuto necessario, o piu' semplice.
	  */	 	 
	 static boolean ex3(boolean[] a){
		int i = 0;		
		boolean b = false;
		while (i < a.length) {
			b = (a[i] == true || b);
			i = i + 1;
		}		
		return b;
	}
		 
	 /* ESERCIZIO 4 (Massimo 8 punti -- da consegnare a mano).
	  * Scrivere lo stato della memoria della JVM alla riga col commento // (B),
	  * ovvero giusto prima della disallocazione del frame relativo ad x.
	  */
	 public static void x(int[][] m,int[] a) {
		 int i;
		 for(i = 0; i < m.length; i++) {
			 m[i] = new int[i+1];
			 m[i][i] = i;
		 }
		 // (B)
	 }
	 public static void main(String[] args) {
		 int [] a = {3,2,1};
		 int[][] m = new int[3][];
		 x(m,a);       // usare (A) come indirizzo per questa istruzione
	 }
}
