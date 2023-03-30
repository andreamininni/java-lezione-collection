public class RubricaKey {
    String cf;
    int progressivo;
    public RubricaKey(String cf, int progressivo) {
        this.cf = cf;
        this.progressivo = progressivo;
    }

    @Override
    public int hashCode(){
        final int prime = 31; //! -> costante
        int result = 1;
        result = prime * result + ((cf == null) ? 0 : cf.hashCode());
        result = prime * result + progressivo;
        return result;
    }

    @Override
    public boolean equals(Object obj){
        //! return as soon as possible
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        //! controlli se le classi concidono
        RubricaKey other = (RubricaKey) obj;
        //! se il codice fiscale dell'oggeto in cui sono non esiste
        if(cf == null){
            //! controlla se l'altro oggetto ha un codice fiscale
            if(other.cf != null) return false;
        } else if(!cf.equals(other.cf)) return false;
        if(progressivo != other.progressivo) return false;

        return true;

    }

}
