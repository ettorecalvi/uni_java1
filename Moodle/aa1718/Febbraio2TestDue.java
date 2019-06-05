public class Febbraio2TestDue {
	public static void main(String[] args) {
      int[] a0 = null;
      int[] a1 = {};
      int[] b0 = null;
      int[] b1 = {};
      int[] a3 = {2, 3};
      int[] b3 = {1};
      int[] a4 = {2};
      int[] b4 = {1, 2};
      int[] a5 = {2, 3, 4, 5};
      int[] b5 = {1, 4, 3};
      
      System.out.println(Febbraio2.eDue(a0,b0)==0); // atteso true
      System.out.println(Febbraio2.eDue(a1,b0)==0); // atteso true
      System.out.println(Febbraio2.eDue(a0,b1)==0); // atteso true
      System.out.println(Febbraio2.eDue(a1,b1)==0); // atteso true
      System.out.println(Febbraio2.eDue(a3,b1)==0); // atteso true
      System.out.println(Febbraio2.eDue(b1,a3)==0); // atteso true
      System.out.println(Febbraio2.eDue(a3,b3)==2-1); // atteso true
      System.out.println(Febbraio2.eDue(a4,b4)==2-1); // atteso true
      System.out.println(Febbraio2.eDue(a5,b5)==(2-1)+(4-3)); // atteso true
	}
}
