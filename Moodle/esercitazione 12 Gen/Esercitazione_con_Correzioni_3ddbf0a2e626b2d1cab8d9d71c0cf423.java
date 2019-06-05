/**
 * ESAME PROGRAMMAZIONE 1 -- Giugno 2016
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

	/* POSSIBILE SOLUZIONE ad exUno. */
	public static void exUno(int[] a, int l) {
		if (a != null) {
			int i = l + 1; // i punta al primo elemento di a cui applicare P
			while (i < a.length) {
				if (P(a[i])) {
					int tmp = a[i];
					int k = i;
					while (k > l) {
						a[k] = a[k - 1];
						k--;
					}
					a[l] = tmp;
					l++;
				}
				i++;
			}
		}
	}

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

    /* POSSIBILE SOLUZIONE ad exDue. */
	static void exDue(int[] a, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			exDue(a, l    , m);
			exDue(a, m + 1, r);
		}
		else 
			if (P(a[l]))
				a[l] = 1;
			else 
				a[l] = 0; 
	}

	static void exDue(int[] a, int l, int r) {
		if (l < a.length && l == r) {
			if (P(a[l]))
				a[l] = 1;
			else 
				a[l] = 0;
		} else {
			int m = (l + r) / 2;
			exDue(a, l    , m);
			exDue(a, m + 1, r);
		}
	}
		
	public static void exDueWrap(int[] a) {
		if (a != null && a.length != 0)
			exDue(a, 0, a.length - 1);
	}

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

	/* POSSIBILE SOLUZIONE ad exTre.
	 * 1) Dimostrare che, per ogni k >= 0, vale il predicato
	 *       P(k) = (se i_k pari, allora r_k == 1) && (se i_k dispari, allora r_k == 2)
	 * dove i_k ed r_k sono i valori di i ed r dopo la k-esima iterazione.
	 * Equivalentemente, dimostrare che il predicato 
	 *       P(k) = (se i pari, allora r == 1) && (se i dispari, allora r == 2), vale dopo la k-esima iterazione del ciclo, 
	 * per ogni valore naturale di k. 
	 * 2) P(0) = (se i_0 pari, allora r_0 == 1) && (se i_0 dispari, allora r_0 == 2).
	 * 3) Per ogni k, se P(k) allora P(k+1) 
	 *        = Per ogni k, se (se i_k pari, allora r_k == 1) && (se i_k dispari, allora r_k == 2),
	 *                      allora (se i_{k+1} pari, allora r_{k+1} == 1) && (se i_{k+1} dispari, allora r_{k+1} == 2).
	 * 4) P(0) = (se i_0 pari, allora r_0 == 1) && (se i_0 dispari, allora r_0 == 2) vero sse
	 *           (se   0 pari, allora   1 == 1) && (se   0 dispari, allora   1 == 2) vero sse
	 *           (se    vero , allora   vero  ) && (se   falso    , allora    falso) vero sse
	 *                                     vero && vero                              vero sse
	 *                                         vero.
	 * 5) P(k+1) = (se i_{k+1} pari, allora r_{k+1} == 1) && (se i_{k+1} dispari, allora r_{k+1} == 2) vero sse
	 *             (se i_k + 1 pari, allora 2/i_k   == 1) && (se i_k + 1 dispari, allora 2/i_k   == 2) vero sse
	 *             (se i_k  dispari, allora i_k     == 2) && (se i_k        pari, allora i_k     == 1) vero sse
	 *             (se i_k     pari, allora i_k     == 1) && (se i_k     dispari, allora i_k     == 2) vero per
	 *             ipotesi induttiva.
	 */

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
	/**	int[][] a = new int[2][];
		for (idx = 0; idx < 2; idx++)
			x(idx + 1, a); // usare (A) come indirizzo di rientro
	*/
	int[] a1 = {0,2,5,1,4,6};
	exUno(a1,2);
	for (int i = 0; i < a1.length; i++)
		System.out.println(a1[i]);
	System.out.println();
	int[] a2 = {0, 2, 5, 1, 4, 6};//exUno(b, 1) restituisce b=={0, 4, 6, 2, 5, 1}
	exUno(a2,2);
	for (int i = 0; i < a2.length; i++)
		System.out.println(a2[i]);
	System.out.println();
	int[] b1 = {0, 2, 5, 1, 4}; // exDue(b) restituisce b=={0, 3, 6, 1, 4}. 
	int[] b2 = {2, 5, 8}; // exUno(b) restituisce b=={3, 6, 9}.
	int[] b3 = {2}; // exUno(b) restituisce b=={3}.
	int[] b4 = {1}; // exUno(b) restituisce b=={1}.
	int[] b5 = {}; // exUno(b) restituisce b=={}.
	exDueWrap(b1);
	for (int i = 0; i < b1.length; i++)
		System.out.println(b1[i]);
	System.out.println();
	exDueWrap(b2);
	for (int i = 0; i < b2.length; i++)
		System.out.println(b2[i]);
	System.out.println();
	exDueWrap(b3);
	for (int i = 0; i < b3.length; i++)
		System.out.println(b3[i]);
	System.out.println();
	exDueWrap(b4);
	for (int i = 0; i < b4.length; i++)
		System.out.println(b4[i]);
	System.out.println();
	exDueWrap(b5);
	for (int i = 0; i < b5.length; i++)
		System.out.println(b5[i]);
	}

}
