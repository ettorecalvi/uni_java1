public class Febbraio3TestDue {
	public static void main(String[] args) {
      boolean[] a0 = null;
      boolean[] a1 = {};
      boolean[] b0 = null;
      boolean[] b1 = {};
      boolean[] a3 = {true, false};
      boolean[] b3 = {true};
      boolean[] a4 = {true};
      boolean[] b4 = {true, false};
      boolean[] a5 = {true, true,false,true, false};
      boolean[] b5 = {false,true, true,true};
      
      System.out.println(Febbraio3.eDue(a0,b0)==false); // atteso true
      System.out.println(Febbraio3.eDue(a1,b0)==false); // atteso true
      System.out.println(Febbraio3.eDue(a0,b1)==false); // atteso true
      System.out.println(Febbraio3.eDue(a1,b1)==false); // atteso true
      System.out.println(Febbraio3.eDue(a3,b1)==false); // atteso true
      System.out.println(Febbraio3.eDue(b1,a3)==false); // atteso true
      System.out.println(Febbraio3.eDue(a3,b3)== true); // atteso true
      System.out.println(Febbraio3.eDue(a4,b4)== true); // atteso true
      System.out.println(Febbraio3.eDue(a5,b5)==false); // atteso true
	}
}
