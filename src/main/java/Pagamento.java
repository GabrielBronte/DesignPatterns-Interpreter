public class Pagamento {
    private double salarioBase;
    private double ppv;

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getPpv() {
        return ppv;
    }

    public void setPpv(double ppv) {
        this.ppv = ppv;
    }

    public double calcularPagamento() {
        return Formula.calcularPagamento(this.salarioBase, this.ppv );
    }
}