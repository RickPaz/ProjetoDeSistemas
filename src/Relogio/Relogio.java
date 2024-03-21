package Relogio;

public class Relogio {
    public static void main(String[] args) {
        Display relogio = new Display(0, 0);
        
        relogio.tiqueTaque();
        System.out.println("Hora atual " + relogio.getHora());
        
        relogio.tiqueTaque();
        System.out.println("Hora atual " + relogio.getHora());
        
        relogio.tiqueTaque();
        System.out.println("Hora atual " + relogio.getHora());
    }
}
