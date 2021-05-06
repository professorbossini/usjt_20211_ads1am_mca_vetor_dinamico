/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteVetorDinamicoAdicionarRemover;

import java.util.Random;

/**
 *
 * @author rodrigo
 */
public class TesteVetorDinamicoAdicionarRemover {
    
    public static void main(String[] args) throws InterruptedException {
        VetorDinamico v = new VetorDinamico();
        Random gerador = new Random();
        while (true){
            //int oQueFazer = gerador.nextInt(2);
            double oQueFazer = gerador.nextDouble();
            if (oQueFazer <= 1){
                int elemento = 1 + gerador.nextInt(6);
                v.adicionar(elemento);
                System.out.println("Adicionou");
            }
            else{
                v.remover();
                System.out.println("Removeu");
            }
            v.exibir();
            System.out.println("============================");
            Thread.sleep(5000);
        }
        
        
    }
    
}
