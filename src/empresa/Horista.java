package empresa;

public class Horista extends Funcionario {
    private int qtdHoras;
    private double valorHora;

    public Horista(int qtdHoras, double valorHora, String nome, Cargo cargo) {
        super(nome, cargo);
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    @Override
    public double calculaSalario() {
        return qtdHoras * valorHora;
    }
    
    
    
}
