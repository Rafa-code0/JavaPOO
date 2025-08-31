public class Aula05 {

    public static void main(String[] args) {
        Contabanco p1 = new Contabanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(300);
        p1.sacar(100);
        p1.pagarMensal();
        p1.fecharConta();
        System.out.println("_____________________________________________");
        System.out.println("Conta " + p1.getNumConta() + " do " + p1.getDono());
        System.out.println("Tipo: " + p1.getTipo());
        System.out.println("Saldo: " + p1.getSaldo());
        System.out.println("Status: " + p1.getStatus());
        

        
        
    }
}
