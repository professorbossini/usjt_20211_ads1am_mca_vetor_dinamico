package TesteVetorDinamicoAdicionarRemover;

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
    
    public boolean estaVazio (){
        return this.quantidade == 0;
    }
    
    public void remover (){
        if (!this.estaVazio()){
            this.quantidade--;
            if (this.capacidade > 4 && this.quantidade <= this.capacidade / 4){
                //this.reduzirCapacidade();
                this.redimensionar(0.5);
            }
        }
    }
    
    
    
    
    public void adicionarSemAumentar (int elemento) {
        if (!this.estaCheio()) {
            this.elementos[this.quantidade] = elemento;
            this.quantidade++;
        }
    }
    
    public void redimensionar (double valor){
        int [] aux = new int[(int)(this.capacidade * valor)];
        for (int i = 0; i < this.quantidade; i++){
            aux[i] = this.elementos[i];
        }
        this.elementos = aux;
        this.capacidade = (int)(this.capacidade * valor);
    }
    
    //aumentar a capacidade do vetor dinâmico
    //método interno da classe
//    private void aumentarCapacidade () {
//        int[] aux = new int[this.capacidade * 2];
//        for (int i = 0; i < this.capacidade; i++) {
//            aux[i] = this.elementos[i];
//        }
//        //adicionar o novo elemento ao nosso vetor dinâmico
//        this.elementos = aux;
//        //ajustar a capacidade do novo vetor
//        this.capacidade = this.capacidade * 2;
//    }    
//    private void reduzirCapacidade(){
//        int [] aux = new int [this.capacidade / 2];
//        for (int i = 0; i < this.quantidade; i++){
//            aux[i] = this.elementos[i];
//        }
//        this.elementos = aux;
//        this.capacidade /= 2; // this.capacidade = this.capacidade / 2;        
//    }
       
    
    
    public void adicionar (int elemento) {
        if (this.estaCheio()) {
            this.redimensionar(2);
            //this.aumentarCapacidade();
            //JOptionPane.showMessageDialog(null, "dobrou, capacidade = " + this.capacidade);
        }
        this.elementos[this.quantidade] = elemento;
        this.quantidade++;
    }
    public void exibir() {
        System.out.println ("capacidade atual: " + this.capacidade);
        System.out.println ("quantidade atual: " + this.quantidade);
        for (int i = 0; i < this.quantidade; i++) {
            System.out.print (this.elementos[i] + " ");
        }
        System.out.println();
    }
}