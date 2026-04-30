public class Cofrinho {
    String dono;
    double saldo;
    boolean quebrado;

    public Cofrinho() {
        this.saldo = 0.0;
        this.quebrado = false;
    }

    public void depositar(Double valor) {
        if (!this.quebrado) {
            this.saldo += valor;
            System.out.println("R$ " + valor + " depositados no cofrinho");
        } else {
            System.out.println("Você não pode adicionar dinheiro ao cofrinho, ele está quebrado...");
        }

    }
    public Double sacar (Double valor) {
        if (!this.quebrado && this.saldo >= valor) {
            this.saldo -= valor;
            return valor;
        } else {
            return 0.0;
        }
    }

    public Double quebrar () {
        this.quebrado = true;
        System.out.println("Cofrinho quebrado... seu sem coração!");
        System.out.println("Seu saldo é de: R$ " + this.saldo);
        this.saldo = 0.0;
        return saldo;
    }

    public Double sacudir () {
        if (this.quebrado || this.saldo <= 0.0) {
            return 0.0;
        }
        double dinheiroCofre = Math.random() * this.saldo;
        this.saldo -= dinheiroCofre;
        return dinheiroCofre;
    }

    public Boolean isMaiorQue(Cofrinho cofrinho){
        if (this.saldo > cofrinho.saldo) {
            return true;
        } else {
            return false;
        }
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isQuebrado() {
        return quebrado;
    }
}


