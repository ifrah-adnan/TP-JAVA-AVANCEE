package adnan;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class Maps {
    public static void main(String[] args) {
         Map<String,Double> map=new HashMap<>();
         map.put("adnan",19.5);
         map.put("hamid",18.0);
         map.put("soumia",15.0);

        map.put("adnan",20.0);
        System.out.println(map);
         map.remove("soumia");
        System.out.println("la taille est "+map.size());
       double somme=0;
        double moyenne=0;
        double noteMin=Double.MAX_VALUE;
        double noteMax=Double.MIN_VALUE;
        boolean egal20=false;

        for (double note: map.values()

             ) {
            somme=somme+note;
            moyenne=somme/map.size();
            if(note<noteMin){
                noteMin=note;
            }
            if (note>noteMax){
                noteMax=note;
            }
            if(note==20){

                egal20=true;
            }

        }
        System.out.println("la moyenne est :"+moyenne);
        System.out.println("la note maximal est "+noteMax);
        System.out.println("la note minimal est "+noteMin);
    if (egal20){
        System.out.println("yeeeeees");
    }
    else{
        System.out.println("noo");
    }
        System.out.println(map.getOrDefault("adnan",0.0));
    }
}
