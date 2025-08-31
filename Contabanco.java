public class Contabanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");

    }    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro, não posso fechá-la");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito, não posso fechá-la");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque!");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }
    public Contabanco() { //método construtor
        this.saldo = 0;
        this.status = false;
    }
    public int getNumConta() { //getter 
        return numConta;
    }
    public void setNumConta(int numConta) { //setter
        this.numConta = numConta;
    }
    public String getTipo() { //getter
        return tipo;
    }
    public void setTipo(String tipo) { //setter
        this.tipo = tipo;
    }
    public String getDono() { //getter
        return dono;
    }
    public void setDono(String dono) { //setter
        this.dono = dono;
    }
    public float getSaldo() { //getter
        return saldo;
    }
    public void setSaldo(float saldo) { //setter
        this.saldo = saldo;
    }
    public boolean getStatus() { //getter
        return status;
    }
    public void setStatus(boolean status) { //setter
        this.status = status;
    }
    
    
}
