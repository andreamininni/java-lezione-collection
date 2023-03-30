import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.LinkedHashMap;
public class App {
    public static void main(String[] args) throws Exception {
        //? Tree -> cose ordinate
        //? Comparator
        //? vogliamo creare una mappa che ordini gli elementi tramite le chiavi RubricaKey in base al progressivo con cui costruiamo una RubicaKey
        // ? se passo nel costruttore della mappa un oggetto di una classe che implementa comparator ( interfaccia ), la mappa capisce che non è un elemento da aggiungere come valore ma un metodo che consentirà di comparare gli elementi che andrò ad inserire nella mappa
        // TreeMap<RubricaKey, Person> rubrica = new TreeMap<RubricaKey, Person>(new RubricaKeyComparator());
        LinkedHashMap<RubricaKey, Person> rubrica = new LinkedHashMap<RubricaKey, Person>();
        //? vediamo se funziona
        Person andrea = new Person("Andrea", "Mininni", "MNNNDR94L26");
        RubricaKey key1 = new RubricaKey(andrea.cf, 8);

        Person ciccio = new Person("Ciccio", "Ciccio", "CCCCCC97L65");
        RubricaKey key2 = new RubricaKey(ciccio.cf, 2);
        rubrica.put(key1, andrea);
        rubrica.put(key2, ciccio);
        for(RubricaKey key : rubrica.keySet()){
            System.out.println(rubrica.get(key).name);
        }
    }
}
