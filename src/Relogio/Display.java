package Relogio;

public class Display {
    private Numero horas;
    private Numero minutos;
    private String stringDisplay;

    public Display(int horas, int minutos) {
        this.horas = new Numero(24);
        this.minutos = new Numero(60);
        setHora(horas, minutos);
    }
    
    public String getHora() {
        return stringDisplay;
    }
    
    public void setHora(int h, int m) {
        horas.setValor(h);
        minutos.setValor(m);
    }
    public void updateDisplay() {
        stringDisplay = horas.getValorDisplay() +":"+ minutos.getValorDisplay();
    }
    public void tiqueTaque() {
        minutos.incremento();
        if(minutos.getValor() == 0) {
            horas.incremento();
        }
        updateDisplay();
    }
}
