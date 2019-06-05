public class Gennaio1TestDue {
	public static void main(String[] args) {
      boolean[] a0 = null;
      boolean[] a1 = {};
      boolean[] b0 = null;
      boolean[] b1 = {};
      boolean[] a3 = {false, false};
      boolean[] b3 = {false};
      boolean[] a4 = {false};
      boolean[] b4 = {false, true};
      boolean[] a5 = {false, true,false,false, false};
      boolean[] b5 = {false,false,false, true};
      
      System.out.println(Gennaio1.eDue(a0,b0)==0); // atteso true
      System.out.println(Gennaio1.eDue(a1,b0)==0); // atteso true
      System.out.println(Gennaio1.eDue(a0,b1)==0); // atteso true
      System.out.println(Gennaio1.eDue(a1,b1)==0); // atteso true
      System.out.println(Gennaio1.eDue(a3,b1)==0); // atteso true
      System.out.println(Gennaio1.eDue(b1,a3)==0); // atteso true
      System.out.println(Gennaio1.eDue(a3,b3)==1); // atteso true
      System.out.println(Gennaio1.eDue(a4,b4)==1); // atteso true
      System.out.println(Gennaio1.eDue(a5,b5)==1+0+1+0); // atteso true
	}
}
