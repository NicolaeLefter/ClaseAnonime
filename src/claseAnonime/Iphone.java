package claseAnonime;

public class Iphone implements  Device{
    @Override
    public void setPret(String denDevice, int pret) {
        System.out.println("Pretul pentru " + denDevice + " este: " + pret);
    }
}
