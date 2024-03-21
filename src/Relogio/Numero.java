package Relogio;

public class Numero {
    private int limite;
    private int valor;

    public Numero(int limite) {
        this.limite = limite;
        this.valor = 0;
    }
    
    public void incremento() {
        this.valor = (this.valor + 1) % limite;
    }
    
    public String getValorDisplay() {
        if (this.valor < 10) {
            return "0" + this.valor;
        }else {
            return "" + this.valor;
        }
    } 

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
