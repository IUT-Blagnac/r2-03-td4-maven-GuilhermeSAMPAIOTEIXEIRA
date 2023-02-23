
public class Main{
    /*
     * Main
     */
    public static void main(String args[]) {
        Pile maPile = new Pile(10);
        if (!maPile.est_vide()) System.out.println("NOK");

        maPile.empiler(5);
        if (maPile.est_vide()) System.out.println("NOK");
        
        try {
        	int element = maPile.depiler();
        	System.out.println(element);
        	if (!maPile.est_vide()) System.out.println("NOK");
            if (element != 5) System.out.println("NOK");
        } catch(Exception e) {
        	System.out.println(e);
        }
        
    }
}