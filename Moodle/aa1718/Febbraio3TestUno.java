public class Febbraio3TestUno {
	public static void main(String[] args) {
		int[]   a0 = null;
		int[]   b0 = null;
		int[]   c0 = null;
		int[]   a1 = {};
		int[]   b1 = {};
		int[]   c1 = {};

		int[]   b2 = {0};
		int[]   a2 = {1};
		int[]   c2 = {2};

		int[]   b3 = { 2, 0, 5};
		int[]   a3 = {10, 4,20,30};
		int[]   c3 = {20,40};

		int[]   b4 = {20,10};
		int[]   a4 = {21,25,23};
		int[]   c4 = {20,22,23,24};

		int[]   b5 = {10,20, 9, 24};
		int[]   a5 = {10,25,28};
		int[]   c5 = {30};

		System.out.println(Febbraio3.eUno(a0,b0,c0)== 0); // atteso true
		System.out.println(Febbraio3.eUno(a1,b0,c0)== 0); // atteso true
		System.out.println(Febbraio3.eUno(a1,b1,c0)== 0); // atteso true
		System.out.println(Febbraio3.eUno(a1,b0,c1)== 0); // atteso true
		
		System.out.println(Febbraio3.eUno(a2,b2,c2)==1); // atteso true 
		System.out.println(Febbraio3.eUno(a3,b3,c3)==10+20+30); // atteso true
		System.out.println(Febbraio3.eUno(a4,b4,c4)==21+23); // atteso true
		System.out.println(Febbraio3.eUno(a5,b5,c5)==25+28); // atteso true
	}
}
