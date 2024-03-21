package empresa;

public class Mensalista extends Funcionario {
    private double salarioBase;

    public Mensalista(double salarioBase, String nome, Cargo cargo) {
        super(nome, cargo);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double calculaSalario() {
        return salarioBase;
    }
    
    
   }
    

