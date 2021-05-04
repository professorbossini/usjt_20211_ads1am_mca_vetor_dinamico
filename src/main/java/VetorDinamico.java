import javax.swing.JOptionPane;
public class VetorDinamico {
    private int[] elementos;
    private int quantidade;
    private int capacidade;
    //construtores sobrecarregados
    public VetorDinamico() {
        this.capacidade = 4;
        this.quantidade = 0;
        this.elementos = new int[4];
    }
    public VetorDinamico (int capacidade) {
        this.capacidade = capacidade;
        this.quantidade = 0;
        this.elementos = new int[capacidade];
    }
    
    public boolean estaCheio () {
        return this.quantidade == this.capacidade;
    }
    
    public void adicionarSemAumentar (int elemento) {
        if (!this.estaCheio()) {
            this.elementos[this.quantidade] = elemento;
            this.quantidade++;
        }
    }
    
    //aumentar a capacidade do vetor dinâmico
    //método interno da classe
    private void aumentarCapacidade () {
        //alocar um novo vetor com o dobro da capacidade do atual
        int[] aux = new int[this.capacidade*2];
        //copiar todos os elementos para o novo vetor
        for (int i=0; i<this.capacidade; i++) {
            aux[i] = this.elementos[i];
        }
        //adicionar o novo elemento ao nosso vetor dinâmico
        this.elementos = aux;
        //ajustar a capacidade do novo vetor
        this.capacidade = this.capacidade*2;
    }
    public void adicionar (int elemento) {
        if (this.estaCheio()) {
            this.aumentarCapacidade();
            //JOptionPane.showMessageDialog(null, "dobrou, capacidade = " + this.capacidade);
        }
        this.elementos[this.quantidade] = elemento;
        this.quantidade++;
    }
    public void exibir() {
        System.out.println ("capacidade atual: " + this.capacidade);
        System.out.println ("quantidade atual: " + this.quantidade);
        for (int i=0; i<this.quantidade; i++) {
            System.out.print (this.elementos[i] + " ");
        }
        System.out.println();
    }
}