public class SettembreTestEx1 {
	public static void main(String[] args) {
		int[][] a0 = null;
		int[][] b0 = null;

		int[][] a1 = {};
		int[][] b1 = {};
		System.out.println(Settembre2017.ex1(a0,b0)==false); // atteso true perche':
		// nessuno tra a0 e b0 contiene elementi.
		
		System.out.println(Settembre2017.ex1(a0,b1)==false); // atteso true perche':
		// nessuno tra a0 e b1 contiene elementi.
		
		System.out.println(Settembre2017.ex1(a1,b0)==false); // atteso true perche':
		// nessuno tra a1 e b0 contiene elementi.
		
		System.out.println(Settembre2017.ex1(a1,b1)==false); // atteso true perche':
		// nessuno tra a1 e b1 contiene elementi.
		
		
		int[][] a2 = {{2, 1   }
		             ,{3, 10  }
		             ,{4, 100 }};
		int[][] b2 = {{4, 7 }
		             ,{3, 11 }
		             ,{5, 100 }};
		System.out.println(Settembre2017.ex1(a2,b2)==true ); // atteso true perche':
		// ogni riga in b2 >= riga di a2.

		int[][] a3 = {{2, 1  , 5}
		             ,{3, 10 , 6}};
		int[][] b3 = {{4, 1  , 7}
                     ,{3, 10 , 7}};
		System.out.println(Settembre2017.ex1(a3,b3)==true); // atteso true perche':
		// ogni riga in b3 >= riga di a3.

		int[][] a4 = {{2, 1  }
		             ,{3, 10 }
		             ,{4, 100}};
		int[][] b4 = {{2 , 2 }
                     ,{10, 3 }
                     ,{4 ,101 }};
		System.out.println(Settembre2017.ex1(a4,b4)==false); // atteso true perche':
		// b4[1][1] < a4[1][1].

		int[][] a5 = {{1  , 2, 5  }
		             ,{10 , 3, 6  }};
		int[][] b5 = {{1  , 4, 6  }
                     ,{ 9 , 2, 5 }};
		System.out.println(Settembre2017.ex1(a5,b5)==false ); // atteso true perche':
		// tutta la riga b5[1] e' inferiore alla riga a5[1].
	}
}
