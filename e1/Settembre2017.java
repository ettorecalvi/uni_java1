/**
 * ESAME PROGRAMMAZIONE 1 
 * Matricola: SCRIVERLA ORA!!!
 * Cognome: SCRIVERLO ORA!!!
 * Nome: SCRIVERLO ORA!!!
 * Corso: SCRIVERLO ORA!!!
 * Inoltre, SCRIVERE ORA nome, cognome, matricola, corso, NUMERO DEL PC sul foglio distribuito.
 * PER CONSEGNARE/RITIRARSI chiamare un docente.
 */
public class Settembre2017 {
		/* ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo iterativo di nome ex1 con le seguenti caratteristiche:
	 * --) 	ex1 ha due parametri formali di nome a e b. Entrambi sono riferimenti (puntatori, reference) 
	 * 	a matrici di interi. Si assuma che il numero di righe in a sia identico a quello di b e che
	 *      il numero di colonne di a sia identico a quello di b.
	 *      Non e' detto che a e b siano matrici quadrate.
	 * --) 	ex1 restituisce true se ogni riga di b che contenga almeno un elemento e' maggiore o uguale 
	 *      alla corrispondente riga di a.
	 *      Per definizione, una riga di b e' maggiore o uguale alla corrispondente riga di a 
	 *      se ogni elemento della riga in b e' maggiore o uguale al corrispondente elemento in a.
     *      In ogni altro caso il risultato e' false. 
	 * La classe SettembreTestEx1 puo' essere usata per il testing di ex1, contenendo esempi sul 
	 * funzionamento atteso per ex1. 
	 * DOVE SCRIVERE ex1: qui sotto, immediatamente al di fuori di questo commento.  
	 */
	 
	 /* ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	  * Scrivere un metodo ricorsivo di nome ex2 con le seguenti caratteristiche:
	  * --) ex2 ha come unico parametro formale un riferimento (puntatore, reference) 
	  * 	ad un array di interi di nome a;
	  * --) ex2 non restituisce nulla, ma modifica a come segue: 
	  *     se a non e' ne' vuoto, ne' nullo, ogni elemento di posizione 
	  *     pari di a e' scambiato col successivo di posizione dispari, ammesso che 
	  *     quest'ultimo esista;
	  * --) ex2 richiama un metodo ricorsivo di nome 'scambia' che visiti l'array a dicotomicamente, 
	  *     ovvero che, ad ogni chiamata, suddivida a in due parti di lunghezza essenzialmente identica.	  
	 * La classe SettembreTestEx2 puo' essere usata per il testing di ex2, 
	 * contenendo esempi sul funzionamento atteso. 
	 * DOVE SCRIVERE ex2: immediatamente al di sotto di questo commento.  
	  */
	  
	 /* ESERCIZIO 3 (Massimo 2 + 2 + 3 + 3 punti -- da consegnare a mano).
	  * Sia dato il metodo ex3 qui sotto definito. 
	  * Assumendo che il parametro formale a sia sempre attualizzato su valori diversi da null, 
	  * lo scopo e' dimostrare per induzione sul valore i che il predicato:
	  *  
	  *    P(i) <==>  perogni k. 0 <= k < i ==> a[k + 1] == a[k] + 6 
	  * 
	  * E' un possibile invariante di ciclo. Ovvero:
	  * 1) scrivere esplicitamente il caso base per la dimostrazione (2 punti);
	  * 2) scrivere esplicitamente il caso induttivo per la dimostrazione (2 punti);
	  * 3) dimostrare che il caso base della dimostrazione per induzione e' vero (3 punti);
	  * 4) dimostrare che il caso induttivo della dimostrazione per induzione e' vero (3 punti).
	  * E' possibile inframezzare i punti 1, 2, 3 e 4 al codice del metodo, se ritenuto piu' semplice.
	  */ 	 
	 static void ex3(int[] a){
		int i = 0; // (A)
		while (i < a.length - 1) {
			a[i+1] = a[i] + 6;    // (B)
			i = i + 1;
		}		
	} // (C)
	 	 
	 /* ESERCIZIO 4 (Massimo 8 punti -- da consegnare a mano).
	  * Scrivere lo stato della memoria della JVM alla riga col commento // (B),
	  * ovvero giusto prima della disallocazione del frame relativo ad x.
	  */
	 public static void x(int[][] m, int[] a) {
		 int i;
		 for(i = 0; i < a.length + 2; i++) {
			 m[i] = a;
			 m = new int[i+2][];
		 }
		 // (B)
	 }
	 public static void main(String[] args) {
		 int [] a = {};
		 int[][] m = new int[1][];
		 x(m,a);       // usare (A) come indirizzo per questa istruzione
	 }
}
