import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class App {
    public static void main(String[] args) throws Exception {
        //! una collezione di elementi formati da coppie chiave : valore
        //! ogni elemento della map è accessibile tramite la chiave
        /*
            "MNNNDR94" : { },
            "PCNMRC67" : { }
        */
        // rubrica.get("MNNNDR94") => { }

        //! ogni volta che inserisco una coppia chiave valore in una mappa tramite il metodo
        //! put( key, value ) => la struttura dati ( MAP ) genera un hash della chiave
        //! l'hash viene calcolato in base alle informazione contenute nell'oggetto che utilizziamo come chiave e alla locazione di memoria in cui questa chiave è conservata
        //! l'hash viene calcolato tramite la funzione hashCode

        //! se utilizzo due oggetti dichiarati e inizializzati separatamente con gli stessi valori come chiave,
        Person p1 = new Person("Andrea", "Mininni", "MNNNDR94L26");
        Person p2 = new Person("Andrea", "Mininni", "MNNNDR94L26");
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        Map<Person, Person> rubrica = new HashMap<Person, Person>();
        rubrica.put(p1, p1);
        rubrica.put(p2, p2);
        for(Person key : rubrica.keySet()){
            System.out.println(rubrica.get(key).name);
        }

    }
}
