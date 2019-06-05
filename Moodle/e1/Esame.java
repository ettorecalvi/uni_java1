public class Esame{
    public static boolean exUno (int[] a, int[] b){
        boolean ok = a != null && b != null;
        int i =0;
            while(ok && i < a.length){
                int esistono =0;
                int j =0;
                while(!(esistono==2) && j<b.length){
                    if(a[i]%b[j]==0)
                        esistono = esistono +1;
                j++;
                }
                ok = esistono == 2;
                i++;
            }
            return ok;
    }
}