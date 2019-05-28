/**
 * ESAME PROGRAMMAZIONE 1
 * Matricola: SCRIVERLA ORA!!!
 * Cognome: SCRIVERLO ORA!!!
 * Nome: SCRIVERLO ORA!!!
 * Corso: SCRIVERLO ORA!!!
 * 
 * Se non ancora fatto, SCRIVERE ORA nome, cognome, matricola, corso, NUMERO DEL PC sui fogli distribuiti.
 * 
 * PER CONSEGNARE/RITIRARSI chiamare un docente.
 * SE QUESTA CLASSE NON COMPILA E' INUTILE CONSEGANRE.
 */

public class Esame {

	/* ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo iterativo e1 con le seguenti caratteristiche: 
	 * a) e1 ha due parametri formali con nome a e b, rispettivamente,
	 *    entrambi di tipo (reference ad) array di interi;
	 * b) e1 restituisce true se e solo se, per ogni i,
	 *    a[i] e' multiplo di almeno due elementi di b le cui posizioni 
	 *    siano nell'intervallo di indici da i incluso sino al termine di b.
	 *    Quindi, e1 restituisce false nel caso la condizione descritta non
	 *    valga anche solo per un elemento di a.
	 * Si osservi che i parametri attuali possono avere lunghezze differenti,
	 * o possono non esistere. In qualsiasi caso, e1 non deve generare alcun 
	 * tipo d'errore.
	 * 
	 * Il metodo e1 va scritto immediatamente al di fuori di questo commento. 
	 * L'aggiunta del metodo e1 deve mantenere compilabile la classe.
	 */
        public static boolean e1 (int[] a, int[] b){
			  boolean status = a != null && b != null;
				  	for(int i = 0; status && i < a.length; i++){
						  	int a_che_stiamo =0;
						  	for(int j = 0; !(a_che_stiamo == 2) && j < b.length; j++){
							  if(a[i]%b[j] == 0)
								  a_che_stiamo = a_che_stiamo + 1;
					  		}
					  	status = a_che_stiamo == 2;
				  	}
				return status;
			}

	/*************************************************************************************************/
	/* Metodi privati che DEVONO ESSERE USATI dalla soluzione all'ESERCIZIO 2. */
	  private static boolean t1(int x) {
	     return x >= -1;
	  }
	  private static boolean t2(int x) {
	     return x <= 1;
	  }
	/* ESERCIZIO 2 (Massimo 8 punti -- da consegnare elettronicamente).
	 * 
	 * Scrivere un metodo e2 che, richiamando un metodo ricorsivo e2R, 
	 * rispetti i requisiti riportati.
	 * a) e2 DEVE avere un singolo parametro formale di nome a e di tipo 
	 * reference ad un array di interi; 
	 * b) e2 restituisce il valore intero ottenuto dal metodo ricorsivo 
	 * e2R applicato ad a, se a esiste. Se a non esiste, allora e2 
	 * restituisce 0.
	 * c) e2R e' un metodo ricorsvio che visita a dicotomicamente e 
	 * restituisce la somma di tutti gli elementi di a per i quali esattamente 
	 * uno tra t1 e t2 sia vero.
	 *
	 * La chiamata a e2 non deve generare alcun tipo d'errore.
	 *
	 * Il metodo e2 va scritto immediatamente al di fuori di questo commento. 
	 * L'aggiunta del metodo e2 deve mantenere compilabile la classe.
	 */
	 	 
	 /* ESERCIZIO 3 (Massimo 2 + 2 + 3 + 3 punti -- da consegnare a mano).
	  * Sia n>=0. Dato il metodo e3,
	  * dimostrare per induzione su n che esso soddisfa il predicato:
      *     P(n) <==> (n pari && e3(n) == 1) || (n dispari && e3(n) == 2)
	  * in accordo con i seguenti punti:
	  * 1) formulare esplicitamente e con precisione la base (2 pt.) 
	  * 2) formulare esplicitamente e con precisione il passo induttivo (2 pt.) 
	  * 3) dimostrare che il predicato al punto 1 e' vero (3 pt.)
	  * 4) dimostrare che il predicato al punto 2 e' vero (3 pt.)
	  */

	  public static int e3(int n) {
	     if (n == 0)
	        return 1;
	     else
	        return 2/e3(n - 1);
	    }

	  /* ESERCIZIO 4 (Massimo 8 punti -- da consegnare a mano).
	   * 
	   * Scrivere lo stato della memoria della JVM alla riga col commento // (B),
	   * ovvero giusto prima della disallocazione del frame relativo ad x, quando 
	   * il valore di j nel main e' pari ad 1.
	   */
	   public static void x(int l, boolean[][] a) {
	      boolean[] b = new boolean[l];
	      int i;
	      for (i = l - 1 ; i >= 0 ; i--)
	         b[i] = !(l % 2 == 0);
	      a[l - 1] = b;
	      // (B)
	   }

	  /******************************************/
	   public static void main(String[] args) {
	       boolean[][] a = new boolean[2][];
	       int j;
	       for (j = 0; j < a.length ; j++)
	          x(j + 1, a); // usare (A) come indirizzo di rientro
	   }
}
