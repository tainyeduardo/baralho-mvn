package br.com.cruzvita;

import br.com.cruzvita.entities.Baralho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Baralho baralho = new Baralho(new ArrayList<>());

        int s = 0;
        while(s != 5){
            System.out.println("Selecione a ação que deseja realizar: ");
            System.out.println("[1] Embaralhar");
            System.out.println("[2] Imprimir baralho");
            System.out.println("[3] Dar Carta");
            System.out.println("[4] Verificar se tem cartas");
            System.out.println("[5] Sair\n");
            System.out.print("Opção: ");
            s = sc.nextInt();

            switch (s){
                case 1:
                    baralho.embaralha();
                    System.out.println("baralho embaralhado");
                    break;

                case 2:
                    baralho.mostrar();
                    break;

                case 3:
                    baralho.darCartas();
                    break;

                case 4:
                    if (baralho.temCartas() == true){
                        System.out.println("Ainda há cartas no baralho");
                    }else {
                        System.out.println("Acabaram as cartas do baralho");
                    }
                    break;

                default:
                    break;


                    }
            }
        }


    }
