
public class Refaaa {
    public int sou;

    public Refaaa(int losou) {
        sou = losou;
    }

    public boolean EsBonempleat(int Problemes_empleat) {

        final boolean es_bo = true;
        final boolean no_bo = true;

        if(Problemes_empleat == 0)
            return true;
        else if(Problemes_empleat < 3) {
            if(sou < 500)
                return es_bo;
            else
                return no_bo;
        } else if(Problemes_empleat >= 3)
            return no_bo;
        else
            return false;
    }

}Bon dia soc el Dan jajajava
A ver si este va
A ver si este va2
