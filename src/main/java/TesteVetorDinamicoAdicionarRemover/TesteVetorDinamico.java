package TesteVetorDinamicoAdicionarRemover;


import javax.swing.JOptionPane;

public class TesteVetorDinamico {
    public static void main(String[] args) {
        VetorDinamico vd1 = new VetorDinamico();
        VetorDinamico vd2 = new VetorDinamico(10);
        
        int c = Integer.parseInt(JOptionPane.showInputDialog("digite a capacidade pro seu vetor dinâmico"));
        
        VetorDinamico vd3 = new VetorDinamico(c);
        
        if (vd2.estaCheio()) {
            JOptionPane.showMessageDialog(null, "vetor dinâmico 2 está cheio");
        }
        else {
            JOptionPane.showMessageDialog(null, "vetor dinâmico 2 não está cheio");
        }
        
        for (int i=1; i<=100; i++) {
            vd1.adicionar(i);
        }
        
    }
}
