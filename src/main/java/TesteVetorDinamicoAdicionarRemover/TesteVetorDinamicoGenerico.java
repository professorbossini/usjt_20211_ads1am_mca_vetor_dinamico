/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteVetorDinamicoAdicionarRemover;

/**
 *
 * @author rodrigo
 */
public class TesteVetorDinamicoGenerico {
    
    public static void main(String[] args) {
        VetorDinamicoGenerico <Integer> vetorDeInts = 
                new VetorDinamicoGenerico<>();
        
        VetorDinamicoGenerico <String> vetorDeStrings = 
                new VetorDinamicoGenerico<>();
        
        //1. construir um vetor de músicas
        VetorDinamicoGenerico <Musica> vetorDeMusicas = 
                new VetorDinamicoGenerico<>();
        //2. Adicionar a música Fade to Black do Metallica
         vetorDeMusicas.adicionar(new Musica("Fade to Black", "Metallica"));
    }
}
//Fade to Black
//Metallica
class Musica{
    private String titulo;
    private String autor;
    public Musica (String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
}
