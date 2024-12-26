package adventofcode.dia01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.sort;

public class parte02 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        String dadosInput = "/home/luiseduardo/IdeaProjects/codingExercises/src/adventofcode/dia01/input.txt";

        List<Integer> esquerda = new ArrayList<>();
        List<Integer> direita = new ArrayList<>();
        

        Scanner reader = new Scanner(new FileReader(dadosInput));
        while (reader.hasNext()) {
            int esquerdaNumero = reader.nextInt();
            int direitaNumero = reader.nextInt();
            esquerda.add(esquerdaNumero);
            direita.add(direitaNumero);
        }
        System.out.println("desordenado");
        System.out.println("Lista esquerda / Lista Direita");
        for(int i = 0; i < esquerda.size(); i++) {
            System.out.println( + esquerda.get(i) + "\t" + "          " + "\t" + direita.get(i));
        }


        sort(esquerda);
        sort(direita);

        System.out.println("ordenado");

        System.out.println("Lista esquerda / Lista Direita");
        for(int i = 0; i < esquerda.size(); i++) {
            System.out.println( + esquerda.get(i) + "\t" + "          " + "\t" + direita.get(i));
        }
        System.out.println(" ");



        int somaFinal = 0;

        for (int i = 0; i < esquerda.size(); i++) {
            int count = 0;
            for (int j = 0; j < direita.size(); j++) {
                if (esquerda.get(i).equals(direita.get(j))) {
                    count++;
                }
            }
            somaFinal += (esquerda.get(i) * count);

        }


        System.out.println("A soma da distância entre os elementos -> " + somaFinal);
    }
}
