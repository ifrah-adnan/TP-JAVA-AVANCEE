package ma;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            Talkative t=new Talkative(i);
            new Thread(t).start();

        }

    }
}