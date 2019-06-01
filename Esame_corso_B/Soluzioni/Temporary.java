//folgio di appoggio del codice di 2
public static int e2 (int[] a){
		 if (a.length == null){
			 return 0;
		 } else{
			 e2R(a, 0, a.length);
		 }
	 }

	 private static e2R(int a[], int l, int r){
		 if(l<r){
			 if(l + 1 == r){
				 if(t1(a[l] && !t2(a[l]) || !t1(a[l] && t2(a[l]))
				 return a[l]; 
			 }
			 else
			 return 0;
		 }
	 }


     //la mia su


     //la soluzione giu
     public static int e2(int[] a) {
		 int r = 0;
		 if (a != null) {
		     r = e2R(a,0,a.length);
		 }
		 return r;
	 }
     
     private static int e2R(int[] a, int l, int r) {
		 if (l < r) 
			 if(l + 1 == r) {
				 if (( t1(a[l]) && !t2(a[l])) ||
				     (!t1(a[l]) && t2(a[l])) )
				     return a[l];
				 else 
			         return 0;
			 } else 
				 return e2R(a, l, (l+r)/2) + e2R(a, (l+r)/2, r);
		 else
			 return 0;
	 }


	 //il resto degli esercizi sta qua 
	 /* ESERCIZIO 3 (Massimo 2 + 2 + 3 + 3 punti -- da consegnare a mano).
	  * Sia n>=0. Sia dato il predicato P(n):
                (n pari && e3(n) == 1) || (n dispari && e3(n) == 2)
        Dato il metodo e3, dimostrare per induzione su n che esso rende
        vero P(n), per ogni n, in accordo con i seguenti punti:
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
	 /*
	  * 1) P(0):  (0 pari && e3(0) == 1) || (0 dispari && e3(0) == 2)
	  * 2) P(n-1) ==> P(n) <==>
	  * ((n-1 pari && e3(n-1) == 1) || (n-1 dispari && e3(n-1) == 2))
	  *         ==> (n pari && e3(n) == 1) || (n dispari && e3(n) == 2))
	  * 3) P(0) <==> (0 pari && e3(0) == 1) || (0 dispari && e3(0) == 2)
	  *         <==> (true && true) || (false && false)
	  *         <==> true || false
	  *         <==> true
	  * 4) Per ipotesi induttiva assumo che P(n-1) sia vero. 
	  * Due casi possono verificarsi.
	  * 4.a) (n-1 pari && e3(n-1) == 1) e' vero, oppure
	  * 4.b) (n-1 dispari && e3(n-1) == 2) e' vero.
	  * Non e' possibile che entrambi siano veri perche' n o e' pari, o e' dispari.
	  * 
	  * Se 4.a e' vero, allora n e' dispari e 2/e3(n-1) == 2/1 == 2.
	  * Scritto formalmente:
	  *     n dispari && 2/e3(n-1) == 2.
	  * Ma il secondo congiunto coincide con la definizione di e3(n). Quindi:
	  *     n dispari && e3(n) == 2 e' vero, cioe' anche P(n) e' vero.
	  * 
	  * Se 4.b e' vero, allora n e' pari e 2/e3(n-1) == 2/2 == 1.
	  * Scritto formalmente:
	  *     n pari && 2/e3(n-1) == 1.
	  * Ma il secondo congiunto coincide con la definizione di e3(n). Quindi:
	  *     n pari && e3(n) == 1 e' vero, cioe' anche P(n) e' vero.
	  */

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