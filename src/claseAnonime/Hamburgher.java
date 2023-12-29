package claseAnonime;

public class Hamburgher implements Comanda {


    @Override
    public String elibereazaComada(int cantitate) {
        return cantitate + " hamburgher ";
    }
}
