/**
 * ESAME PROGRAMMAZIONE 1
 * 
 * Matricola:
 * 
 * Cognome:
 * 
 * Nome:
 *
 * Corso:
 * 
 * ISTRUZIONI DA ESEGUIRE NELL'ORDINE. 
 * 0) Compilare i campi Matricola, Cognome, .... 
 * 1) Ridenominare questo file in accordo col formato:
 *          Cognome_Matricola_PrimoNomeBattesimo.java 
 * 2) Quando richiesto, scrivere direttamente in questo file le soluzioni agli esercizi proposti. 
 * 3) Scrivere ora, se non lo si è ancora fatto: 
 *    nome, cognome, matricola, corso, numero del PC sul foglio distribuito.
 * 
 * PER CONSEGNARE/PER RITIRARSI. 
 * Chiamare un docente.
 */

class Esercitazione {

	/** Metodo privato che deve essere usato dalla soluzione ai primi due esercizi */
    private static boolean P(int x) {
		return (x % 2 == 0);
	}

	/**
	 * ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * 
	 * Scrivere un metodo iterativo exUno con le seguenti caratteristiche: 
	 * a) exUno ha un parametro formale a di tipo reference ad un array di interi
	 * ed un parametro formale l di tipo intero compreso nell'intervallo [0...a.length - 1];
	 * b) exUno modifica l'array a riorganizzandolo in modo che, 
	 * per ogni elemento a[i] a destra di l  
	 * se P(a[i]) e' vero, allora, nell'ordine:
	 *    1) a[i] va spostato alla posizione l, usando ESCLUSIVAMENTE il meccanismo dell'Insertion sort,
	 *    2) l va sposato verso destra di una posizione.
	 *
	 * ESEMPI. 
	 * Se b=={0, 2, 5, 1, 4, 6}, allora exUno(b, 2) restituisce b=={0, 2, 4, 6, 5, 1}. 
	 * Se b=={0, 2, 5, 1, 4, 6}, allora exUno(b, 1) restituisce b=={0, 4, 6, 2, 5, 1}. 
	 * 
	 * DOVE SCRIVERE exUno. 
	 * Il metodo exUno va scritto immediatamente al di fuori di questo commento. L'aggiunta del metodo 
	 * exUno deve mantenere compilabile la classe.
	 */


	/**
	 * ESERCIZIO 2 (Massimo 8 punti -- da consegnare elettronicamente).
	 * 
	 * Scrivere un metodo ricorsivo exDue con le seguenti caratteristiche: 
	 * a) exDue ha un parametro formale a di tipo reference ad un array di interi;
	 * b) exDue restituisce l'array a modificato in modo che: 
	 *    1) tutti e soli gli elementi di a per cui il metodo P dato e' vero siano sostituiti dal valore 1.
	 *       I rimanenti valori, invece, devono essere sostituiti dal valore 0.
	 *    2) la visita dell'array a DEVE procedere suddividendo a in sotto array di lunghezza essenzialmente
	 *    identica, in analogia alla ricerca dicotomica.
	 * 
	 * ESEMPI.
	 * Se b=={0, 2, 5, 1, 4} allora exDue(b) restituisce b=={1,1,0,0,1}. 
	 * Se b=={2, 5, 8} allora exUno(b) restituisce b=={1,0,1}.
	 * Se b=={2} allora exUno(b) restituisce b=={1}.
	 * Se b=={1} allora exUno(b) restituisce b=={0}.
	 * Se b=={} allora exUno(b) restituisce b=={}.
	 * 
	 * DOVE SCRIVERE exDue. 
	 * Il metodo exDue va scritto immediatamente al di fuori di questo commento. 
	 * L'aggiunta del metodo exDue deve mantenere compilabile la classe.
	 */


	/**
	 * ESERCIZIO 3 (Massimo 3 + 1 + 2 + 2 + 2 punti -- da consegnare a mano). 
	 * Dato il metodo exTre, sapendo che al termine del ciclo vale (se n pari, allora r == 1) && (se n dispari, allora r == 2),
	 * dimostrare la correttezza di exTre, sviluppando uno alla volta i seguenti passi:
	 * 1) scrivere formalmente un predicato P che permetta di dimostrare per induzione la correttezza parziale di exTre,
	 * 2) scrivere esplicitamente il caso base per la dimostrazione per induzione,
	 * 3) scrivere esplicitamente il caso induttivo per la dimostrazione per induzione,
	 * 4) dimostrare che il caso base della dimostrazione per induzione e' vero,
	 * 5) dimostrare che il caso induttivo della dimostrazione per induzione e' vero.
	 */

	public static int exTre(int n) {
		int r = 1;
		int i = 0;
		while (i < n) {
			r = 2 / r;   // divisione intera
			i++;
		}
		return r;
	}

	
	/**
	 * ESERCIZIO 4 (Massimo 8 punti -- da consegnare a mano).
	 * 
	 * Scrivere lo stato della memoria della JVM alla riga col commento // (B),
	 * prima della disallocazione del frame relativo ad x, quando idx == 1.
	 */

	public static int idx;

	public static void x(int l, int[][] a) {
		int[] b = new int[l];
		int i;
		for (i = 0; i < l; i++)
			b[i] = i;
		a[idx] = b;
		// (B)
	}

	/******************************************/
	public static void main(String[] args) {
		int[][] a = new int[2][];
		for (idx = 0; idx < 2; idx++)
			x(idx + 1, a); // usare (A) come indirizzo di rientro
	}

}
