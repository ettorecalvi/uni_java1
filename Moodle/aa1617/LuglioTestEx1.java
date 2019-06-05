public class LuglioTestEx1 {
	public static void main(String[] args) {
		int[][] a0 = null;
		int[][] b0 = null;

		int[][] a1 = {};
		int[][] b1 = {};
		System.out.println(Luglio2017.ex1(a0,b0)==false); // atteso true perche':
		// nessuno tra a0 e b0 contiene elementi.
		
		System.out.println(Luglio2017.ex1(a0,b1)==false); // atteso true perche':
		// nessuno tra a0 e b1 contiene elementi.
		
		System.out.println(Luglio2017.ex1(a1,b0)==false); // atteso true perche':
		// nessuno tra a1 e b0 contiene elementi.
		
		System.out.println(Luglio2017.ex1(a1,b1)==false); // atteso true perche':
		// nessuno tra a1 e b1 contiene elementi.
		
		
		int[][] a2 = {{2, 1  , 5}
		             ,{3, 10 , 6}
		             ,{4, 100, 7}};
		int[][] b2 = {{4, 7 , 1  }
		             ,{3, 5 , 10 }
		             ,{2, 6 , 100}};
		System.out.println(Luglio2017.ex1(a2,b2)==true ); // atteso true perche':
		// colonna 1 in a2 == colonna 2 di b2.

		int[][] a3 = {{2, 1  , 5}
		             ,{3, 10 , 6}
		             ,{4, 100, 7}};
		int[][] b3 = {{4, 1  , 7}
                     ,{3, 10 , 6}
                     ,{2, 0  , 5}};
		System.out.println(Luglio2017.ex1(a3,b3)==false); // atteso true perche':
		// nessuna colonna di a3 e' identica a qualche colonna di b3.

		int[][] a4 = {{2, 1  , 5}
		             ,{3, 10 , 6}
		             ,{4, 100, 7}};
		int[][] b4 = {{1 , 4 , 7}
                     ,{10, 3 , 6}
                     ,{0 , 2 , 5}};
		System.out.println(Luglio2017.ex1(a4,b4)==false); // atteso true perche':
		// nessuna colonna di a4 e' identica a qualche colonna di b4.

		int[][] a5 = {{1  , 2, 5  }
		             ,{10 , 3, 6  }
		             ,{100, 4, 7  }};
		int[][] b5 = {{1  , 4, 1  }
                     ,{10 , 3, 10 }
                     ,{0  , 2, 100}};
		System.out.println(Luglio2017.ex1(a5,b5)==true ); // atteso true perche':
		// colonna 0 in a5 == colonna 2 di b5.

		int[][] a6 = {{1  , 2  , 5}
		             ,{10 , 3  , 6}
		             ,{100, 4  , 7}};
		int[][] b6 = {{1  , 1  , 7}
                     ,{1  , 10 , 6}
                     ,{0  , 100, 5}};		
		System.out.println(Luglio2017.ex1(a6,b6)==true ); // atteso true perche':
		// colonna 0 in a6 == colonna 1 di b6.
	}
}
