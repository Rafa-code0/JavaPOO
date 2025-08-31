public class Aula02 {
    public static void main(String[] args) throws Exception {
        Celular c1 = new Celular();
        c1.modelo = "iPhone 13";
        c1.cor = "Preto";
        c1.tamanho = 6.1f;
        c1.bateria = 86;
        /* 
        c1.tampar();
        c1.rabiscar();
        c1.tampar();
        c1.status();
      
       

        Caneta c2 = new Caneta();
        c2.modelo = "Bic Preta";
        c2.cor = "Preta";
        c2.ponta = 0.7f;
        c2.carga = 50;
        c2.destampar();
        c2.rabiscar();
        */
        c1.status();
        
    }
}
