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
 * SE QUESTA CLASSE NON COMPILA È INUTILE CONSEGANRE.
 */

public class Febbraio3 {
	/* ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo iterativo di nome eUno con le seguenti caratteristiche:
	 * --) eUno ha tre parametri formali di nome a, b, c.
	 *     Ciascuno di essi e' un riferimento (puntatore) ad array di interi
	 * --) eUno restituisce la somma di tutti gli elementi e di a che siano maggiori
	 *     di ogni elemento di b ed inferiori ad almeno un elemento di c.
	 * La classe Febbraio3TestExUno puo' essere usata per il testing di eUno, 
	 * contenendo esempi sul funzionamento atteso per eUno. 
	 * SCRIVERE eUno immediatamente al di sotto di questo commento.  
	 */

	 /*
	 public static int eUno(int[] a, int[] b, int[] c){
		int e=0; 
		int e1=0; 
		boolean ok = false;
		
		if((a == null || b == null || c == null) || (a.length == 0 || b.length ==0 || c.length ==0)){
			return 0;
		} else {
			boolean found = false;
			for(int j=0; j<b.length && !found; j++){
				int h = j; 
				int count =0;
				for(int i=0; i<a[h].length; i++){
					int k = i;
					if(a[k]>b[h]){
					found = true;
					count++;
					}
					int found2 = 0;
					 
					if(j<c[k].length && a[k]>c[k] && found2==0){
						found2 += +1; 
					}
					if(count==b.length && found2!= 0){
						e += a[k];
					}
				}
			}
		}
		 return e; 
		}
		*/ 

	/* ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
	 * Scrivere un metodo di nome eDue con le seguenti caratteristiche:
	 * --) eDue ha due parametri formali. Entrambi sono riferimenti (puntatori) 
	 *     ad array di booleani ed hanno nome a e b;
	 * --) Ammesso che a e b esistano ed abbiano almeno un elemento,
	 *     per ogni posizione i, eDue restituisce la disgiunzione delle congiunzioni 
	 *     tra a[i] e b[i], a patto che l'indice i sia pari.
	 *     Altrimenti, restituisce false;
	 * --) eDue richiama un metodo ricorsivo contro-variante (indice che guida la 
	 *     ricorsione cresce con la semplificazione del problema) che esegue 
	 *     effettivamente la disgiunzione delle congiunzioni.
	 * La classe Febbraio3TestExDue puo' essere usata per il testing di eDue.
	 * SCRIVERE eDue immediatamente al di sotto di questo commento.
	 */

		public static boolean eDue(boolean[] a, boolean[] b){

			boolean ris=false; 
			if((a != null && b != null)&&(a.length !=0 && b.length !=0)){
				ris =	contro_variante(a, b, 0, ris);
			} 
			return ris; 
		}

		private static boolean contro_variante (boolean[] a, boolean[] b, int  i, boolean ris){

			boolean tmp;
				if((i%2)==0){
					if(a[i] && b[i]){
						tmp = true; 
						ris = tmp || ris;
					 
					if(a.length > i+1 && b.length > i+1){
						return contro_variante(a, b, i+1, ris);
				} else {
					return ris; 
				} 
			}else {
					return ris; 
				}
			} else {
				return ris; 
			}
		}	

	/* ESERCIZIO 3 (Massimo 2 + 2 + 3 + 3 punti -- da consegnare a mano).
	 * Sia dato il metodo eTre qui sotto definito.
	 * Assumiamo che il parametro formale a non sia null.
	 * Definiamo il predicato:
	 * 
	 *    P(i) <==> (eTre(a,v,i) == cardinalita' {j | j < i && v < a[j]})
	 *  
	 * Per dimostrare per induzione su i che il predicato appena definito e' vero:
	 * 1) scrivere esplicitamente il caso base P(0) per la dimostrazione per induzione, (2 punti)
	 * 2) scrivere esplicitamente il caso induttivo per la dimostrazione per induzione, (2 punti)
	 * 3) dimostrare che il caso base P(0) della dimostrazione per induzione e' vero, (3 punti)
	 * 4) dimostrare che il caso induttivo della dimostrazione per induzione e' vero. (3 punti)
	 */
	 
	public static int eTre(int[] a, int v, int i) {
		if (i == 0) 
		    return 0;
		else 
		    if (v < a[i - 1])
		      return  1 + eTre(a, v, i - 1);
		    else
		      return  0 + eTre(a, v, i - 1);
	}

     /* ESERCIZIO 4 (Massimo 8 punti -- da consegnare a mano).
	  * Scrivere lo stato della memoria della JVM alla riga col commento // (B),
	  * ovvero giusto prima della disallocazione del frame relativo ad x.
	  */
     public static void main (String[] args){
		 int [] a = {1,2,3};
		 int [][] m = new int[a.length][];
		 x(a,m);       // (A)
	 }
	 
	 public static void x(int[] a,int[][] m){
		 int i; int j;
		 for (i = 0; i < m.length; i++){
			 m[i] = new int[i+2];
			 for (j = 0; j < m[i].length; j++)
			    m[i][j] = a[i];
		 } // (B)
	 }
}
