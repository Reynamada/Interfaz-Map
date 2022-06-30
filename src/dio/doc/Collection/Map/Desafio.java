package dio.doc.Collection.Map;
import java.util.*;

//Faça um programa que simule um lançamento de dados.
//Lance o dado 100 veces e armazene
//Depois, mostre quantas veces cada valor foi inserido

public class Desafio {
    public static void main (String[] args){
        Map<Integer, Integer> Dado = new TreeMap<>();
        Random gerador = new Random();
        int num=0;
        int soma1=0;
        int soma2=0;
        int soma3=0;
        int soma4=0;
        int soma5=0;
        int soma6=0;
        int i=1;
        System.out.println("Simulação de lançamento de dados: ");
        while (i<100){
            int cont=0;
            num = gerador.nextInt(7);

            if (Objects.equals(num, 1)) {
                cont++;
                soma1+=cont;
                Dado.put(num,soma1);
                i++;
            }
            if (Objects.equals(num, 2)){
                cont++;
                soma2+=cont;
                Dado.put(num, soma2);
                i++;
            }
            if (Objects.equals(num, 3)){
                cont++;
                soma3+=cont;
                Dado.put(num, soma3);
                i++;
            }
            if (Objects.equals(num, 4)){
                cont++;
                soma4+=cont;
                Dado.put(num, soma4);
                i++;
            }
            if (Objects.equals(num, 5)){
                cont++;
                soma5+=cont;
                Dado.put(num, soma5);
                i++;
            }
            if (Objects.equals(num, 6)){
                cont++;
                soma6+=cont;
                Dado.put(num, soma6);
                i++;
            }

        }
        System.out.println("Valor inserido e quantidade de vezes que apareceu ");
       System.out.println(Dado);

    }
    }


