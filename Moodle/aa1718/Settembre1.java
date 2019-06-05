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
 public class Settembre1 {

    /* ESERCIZIO 1 (Massimo 7 punti -- da consegnare elettronicamente).
     * Per risolvere questo esercizio occorre scrivere due metodi, uno di nome palindromo,
     * l'altro di nome e1, descritti qui di seguito.
     * Il metodo palindromo:
     * - ha un unico parametro formale di nome str e di tipo reference ad array di char;
     * - restituisce true se e solo se la stringa di caratteri memorizzata in str e' palindroma,
     *   assumendo che anche la sequenza con zero caratteri sia palindroma.
     *   Per semplicita', ipotizzare che i caratteri in str siano solo minuscoli.
     * Il metodo e1:
     * - e' iterativo;
     * - ha un unico parametro formale di nome frasi e di tipo riferimento ad array di array di char;
     * - e1 restituisce un array a di boolean tale che:
     *   --) a ha tanti elementi quante sono le righe in frasi
     *   --) a[i]==true se e solo se frasi[i] e' un palindroma;
     * Il metodo e1 deve utilizzare il metodo palindromo.
     * Se frasi e' null il metodo e1 deve restituire null.
     * 
     * La classe Settembre1TestE1 puo' essere usata per il testing, 
     * contenendo esempi sul funzionamento atteso per e1.
     * SCRIVERE e1 immediatamente al di sotto di questo commento.
     */
	 
	 public static boolean palindroma (char[] str){

		boolean control= true; 
		int l =0;
		l = str.length; 
		if (str == null){
			return true;
		} else if(l ==0 || l < 2){
			return true;
		} else for(int s=0; s<l/2; s++){
				if(str[s] == str[l -s -1]){
					control = true; 
				} else control = false; 
			}
		return control;
	}

	

	public static boolean[] e1 (char[][] frasi){

		boolean[] a={};

		if(frasi == null ){
			return a = null; 
		} else {
			for(int i=0; i<frasi.length; i++){
				for(int j=0; j<frasi[i].length; j++){
					//System.out.println(palindroma(frasi[i]));
					//a[i].length = i; 
					if(palindroma(frasi[i])==true){
						a[i] = true; 
					}
				}
			}
		}
		return a; 
	}
	 
	/* ESERCIZIO 2 (Massimo 7 punti -- da consegnare elettronicamente).
     * Per risolvere questo esercizio occorre scrivere i metodi ruota ed e2.
	 * Il metodo ruota deve essere ricorsivo, ha signature:  
	 * 
	 *          private static void ruota(char[] a, int i)
	 * 
	 * modifica a ruotando il suo sotto-array dall'indice i ad a.length-1-i rispetto al punto mediano.
     *						  
	 * Il metodo es2:
	 * -) ha un unico parametro formale di nome str di tipo reference ad array di char;
	 * -) ruota str rispetto alla sua posizione mediana invocando ruota;
	 * -) restituisce il reference all'array str modificato se esso non e' null. 
	 *    Altrimenti, il risultato e' null.
	 *
	 * La classe Settembre1TestE2 puo' essere usata per il testing di e2,
	 * contenendo esempi sul funzionamento atteso per e2. 
	 * SCRIVERE e2 immediatamente al di sotto di questo commento.
	 */

     /* ESERCIZIO 3 (Massimo 2 + 2 + 3 + 3 punti -- da consegnare a mano).
      * Sia e3 il metodo qui sotto definito.
	 * Supponendo che l'array a non sia vuoto, dimostrare per induzione su i che 
	 * 
	 *         e3(a,i) == a[0] * 2^i
	 *
	 * La dimostrazione deve essere strutturata come segue:
	 * 1) scrivere formalmente il caso base (2 punti);
	 * 2) scrivere formalmente il caso induttivo (2 punti);
	 * 3) dimostrare che il caso base P e' vero (3 punti);
	 * 4) dimostrare che il caso induttivo e' vero (3 punti).
	 */
	 
	 public int e3(int[] a, int i) {
		 if (i == 0)
			 return a[0];
		 else 
			return e3(a, i-1) * 2;
	 }
	 
 	 /* ESERCIZIO 4 (Massimo 8 punti -- da consegnare a mano).
 	  * Scrivere lo stato della memoria della JVM giusto prima della disallocazione
 	  * del frame relativo a metodo1.
 	  */
     public static int[] metodo2 (int j) {
    	 return new int[j+1];
     }

     public static int[] metodo1 (int[] m, int i) {
    	 int[] r = null;
    	 for (int j=0; j<i; j++) {
    		 r = metodo2(j); // (B)
    		 r[j] = i;
    	 }
    	 return r;
    }

    public static void main(String[] args) {
    	int i = 0;
    	int[] m = new int[i+1];
    	int[] r = metodo1(m, i +2); // (A)
    }  
}
