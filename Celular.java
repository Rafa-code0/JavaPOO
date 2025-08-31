public class Celular {
    String modelo;
    String cor;
    float tamanho;
    int bateria;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Bateria: " + this.bateria + "%");

    }

    void estado() {
        if (this.bateria == 100) {
            System.out.println("Celular em ótimo estado para uso");
        } else if (this.bateria <= 90) {
            System.out.println("Celular em bom estado para uso");
        } else if (this.bateria <= 80) {
            System.out.println("Celular em estado razoável para uso");
        } else {
            System.out.println("Celular com pouca bateria, carregue-o!");
        }
    }
}
    
/* 
    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
*/
