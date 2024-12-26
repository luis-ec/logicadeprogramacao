package adventofcode.dia01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.sort;

public class parte01 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
            String dadosInput = "/home/luiseduardo/IdeaProjects/codingExercises/src/adventofcode/dia01/input.txt";

            List<Integer> esquerda = new ArrayList<>();
            List<Integer> direita = new ArrayList<>();
            List<Integer> soma = new ArrayList<>();

                Scanner reader = new Scanner(new FileReader(dadosInput));
                while (reader.hasNext()) {
                    int esquerdaNumero =  reader.nextInt();
                    int direitaNumero = reader.nextInt();
                    esquerda.add(esquerdaNumero);
                    direita.add(direitaNumero);
                }
                System.out.println("Lista esquerda / Lista Direita");
                for(int i = 0; i < esquerda.size(); i++) {
                System.out.println( + esquerda.get(i) + "\t" + "          " + "\t" + direita.get(i));
                }

        // Ordernar os array agr ne fml gracas a deus nao to em C
        System.out.println("Ordenando...");

          sort(esquerda);
          sort(direita);

        int resultadoSoma;
          for(int a = 0; a < esquerda.size(); a++) {
              if (esquerda.get(a) > direita.get(a)){
                  resultadoSoma = esquerda.get(a) - direita.get(a);
                  soma.add(resultadoSoma);
              } else {
                  resultadoSoma = direita.get(a) - esquerda.get(a);
                  soma.add(resultadoSoma);
              }
          }
        System.out.println("A Distância entre eles -> " + soma);
        System.out.println("Somando...");

        int somaLista = 0;
        for (int numero : soma) {
                somaLista += numero;
        }

        System.out.println("A soma da distância entre os elementos -> " + somaLista);
    }
}


