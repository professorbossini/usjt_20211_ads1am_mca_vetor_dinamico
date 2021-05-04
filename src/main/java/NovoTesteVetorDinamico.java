
import java.util.Random;

public class NovoTesteVetorDinamico {
    public static void main(String[] args) {
        VetorDinamico vd = new VetorDinamico();
        Random gerador = new Random();
        while (true) {
            int i = 1 + gerador.nextInt(6);
            vd.adicionar(i);
            vd.exibir();
        }
    }
}
