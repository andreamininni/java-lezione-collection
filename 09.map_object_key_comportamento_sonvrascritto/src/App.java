import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class App {
    public static void main(String[] args) throws Exception {
        //! dato che non ha senso utilizzare lo stesso oggetto come chiave di un elemento nella map
        //! creiamo una chiave personalizzata

        Map<RubricaKey, Person> rubrica = new HashMap<RubricaKey, Person>();
        //* genero due persone da inserire in rubrica */
        Person andrea = new Person("Andrea", "Mininni", "MNNNDR94L26");
        Person andrea2 = new Person("Andrea", "Mininni", "MNNNDR94L26");
        //* da queste due persone genero due chiavi */
        // RubricaKey key1 = new RubricaKey(andrea.cf, 20);
        // rubrica.put(key1, andrea);

        // RubricaKey key2 = new RubricaKey(andrea2.cf, 20);
        // rubrica.put(key2, andrea2);
        //* agli occhi del linguaggio, anche se le chiavi hanno valori uguali, rimangono due reference diverse quindi aggiunge due elementi alla map */


        RubricaKey key1 = new RubricaKey(andrea.cf, 20);
        RubricaKey key2 = new RubricaKey(andrea2.cf, 20);
        rubrica.put(key1, andrea);
        rubrica.put(key2, andrea2);
        for(RubricaKey key : rubrica.keySet()){
            System.out.println(rubrica.get(key).name);
        }


    }
}
