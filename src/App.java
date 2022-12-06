import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
            Kunde k1 = new Kunde("Franz", "Meier", 12, 2345);


            if(k1.getAlter()){
                System.out.println("Darf er 5 Medien ausleihen");
            } else{
                System.out.println("ist er zu Jung und er darf nicht");
            }



            ArrayList<Medium> medien = new ArrayList<>();

            medien.add(new blueray("Sony 3x", 18, 23, false));
            medien.add( new Schallplatte("Sony xblack", 16, 23, true));
            medien.add(new CD("3???", 12, 12, false, true));


    }
}
