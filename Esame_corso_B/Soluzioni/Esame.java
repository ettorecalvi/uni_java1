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
        
    public static boolean e1 (int[] a, int[] b) {
		boolean perOgni = a != null && b != null;
	    int i = 0;
		while(perOgni && i < a.length) {
			int esistono = 0;
			int j = i;
			while(!(esistono == 2) && j < b.length) {
				if (a[i]%b[j] == 0) 
					 esistono = esistono + 1;
			    j = j + 1;
			}
			perOgni = esistono == 2;
			i = i + 1;
		}
		return perOgni;
	}

	/*************************************************************************************************/
	
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
	 /* Metodi privati che DEVONO ESSERE USATI dalla soluzione all'ESERCIZIO 2. */
	 
	 private static boolean t1(int x) {
		return x >= -1;
	 }
	 private static boolean t2(int x) {
		return x <= 1;
	 }

	 public static int e2 (int[] a){
		 int r =0;
		 if (a != null){
			r = e2R(a, 0, a.length);
		 }
		 return r;
	}

	 private static int e2R(int a[], int l, int r){
		 if(l<r)
			 if(l + 1 == r){
				 if(t1(a[l]) && !t2(a[l]) || !t1(a[l]) && t2(a[l]))
				 	return a[l]; 
				else 
				return 0;
		 } else 
			return e2R(a, l, (l+r)/2) + e2R(a, (l+r)/2, r);
			 else 
			 return 0;
		 
	} 

	 
}
