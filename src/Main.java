import claseAnonime.*;

public class Main {

    public static void main(String[] args) {


       /* Figura dreptunghi = new Figura() {
            @Override
            public void deseneazaAria() {
                System.out.println("Deseneaza aria unui dreptunghi");
            }

            @Override
            public void afiseazaFigura() {

            }
        };
        dreptunghi.deseneazaAria();
        dreptunghi.afiseazaFigura();

        Figura cerc =  new Cerc();
        cerc.deseneazaAria();

        Persoana ion = new Ion();
        ion.afiseazaAmprenta();

        Persoana andrei = () ->{ System.out.println("Amprenta lui Andrei");  //lambda
            System.out.println("Amprenta este buna");
        };
        andrei.afiseazaAmprenta(); */

     //   Persoana vlad = () -> System.out.println("Amprenta lui Vlad");
        //vlad.afiseazaAmprenta();

        /*PersoanaService persoanaService = new PersoanaService();
        persoanaService.afisarePersoana(new Ion());
        persoanaService.afisarePersoana(() -> System.out.println("Amprenta lui Vlad")); //lambda
        persoanaService.afisarePersoana(() -> System.out.println("Amprenta lui Andrei"));

        String[] array = new String[] {"Alexei", "Vasile", "Nicolae", "Dumitru"};

        for (int i = 0; i < array.length; i++) {
          final  int finalI = i;
            persoanaService.afisarePersoana(() -> System.out.println("Amprenta lui:" + array[finalI]));



        } */

       Device iphone = new Iphone();
        iphone.setPret("Iphone", 200);

        Device appleWatch = (String denDevice, int pret) -> System.out.println("Pretul pentru " + denDevice + " este: " + pret);
        appleWatch.setPret("AppleWatch", 350);

        Comanda cola = new Comanda() {
            @Override
            public String elibereazaComada(int cantitate) {
                return  cantitate + " Cola";
            }
        };
        cola.elibereazaComada(5);

        Comanda hamburgher = new Hamburgher();
        hamburgher.elibereazaComada(2);

        Comanda nughets = (int cantitate) -> cantitate + " nughets";
        nughets.elibereazaComada(3);

        MacDriveService macDriveService = new MacDriveService();
        macDriveService.elibereazaComanda((int catitate) -> catitate + " Inghetata", 2);  // polimorfism
        macDriveService.elibereazaComanda(hamburgher, 3);

        String[] array = new String[] {"Nughets", "Pepsy", "Cartofi", "Salata"};

        for (int i = 0; i < array.length; i++) {
            final int finalI = i;
            macDriveService.elibereazaComanda((int cantitate) ->cantitate + " "  + array[finalI], 2);

        }

    }
}
