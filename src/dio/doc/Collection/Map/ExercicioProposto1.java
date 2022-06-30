package dio.doc.Collection.Map;

import java.util.*;
import java.util.Collections;



public class ExercicioProposto1 {
    public static void  main (String[] args){
        Map<String,Integer> estadosBr =new HashMap<>(){{
            put ("PE", 9616621);
            put ("AL" ,3351543);
            put ("CE" ,9187103);
            put ("RN" ,3534265);

        }};
        System.out.println("Dicionario dos Estados e suas Populações: ");
        System.out.println(estadosBr);
        System.out.println("");

        System.out.println("Substitua a população do estado do RN por 35344165 ");
        estadosBr.put("RN",35344165);
        System.out.println(estadosBr);
        System.out.println("");

        System.out.println("Confira se o estado PB está no dicionário, caso não adicione: PB -4.039.277 ");
        boolean resposta=estadosBr.containsKey("PB");
        if (resposta) {
            System.out.println("O estado se encontra no dicionario ");
        }else {estadosBr.put("PB",4039277);
            System.out.println(estadosBr);
        }

        System.out.println("");
        System.out.println("Exiba a população de PE");
        System.out.println("A população de PE é: "+estadosBr.get("PE"));
        System.out.println("");

        System.out.println("Exiba todos os estados e suas populações na ordem que foi informado: ");
        Map<String,Integer> estadosLin = new LinkedHashMap<>(){{
            put ("PE", 9616621);
            put ("AL" ,3351543);
            put ("CE" ,9187103);
            put ("RN" ,3534265);

        }};
        System.out.println(estadosLin);
        System.out.println("");

        System.out.println("Exiba os estados e suas populações em ordem alfabética: ");
        Map<String, Integer> estadosT = new TreeMap<>(estadosLin);
        System.out.println(estadosT);
        System.out.println("");

        System.out.println("Exiba o estado com menor população e sua quantidade: ");
        Integer menorPopulacao= Collections.min(estadosLin.values());
        Set<Map.Entry<String, Integer>> estadoMenor= estadosLin.entrySet();
        String estado="";
        for (Map.Entry<String, Integer> estados:estadoMenor){
            if (estados.getValue().equals(menorPopulacao)){
                estado= estados.getKey();
                System.out.println("O estado com menor população é: "+estado +" com uma população de: " +menorPopulacao);
            }
        }
        System.out.println("");

        System.out.println("Exiba o estado com maior população e sua quantidade: ");
        Integer maiorPopulacao= Collections.max(estadosLin.values());
        Set<Map.Entry<String, Integer>> estadoMaior= estadosLin.entrySet();
        String estadomaior="";
        for (Map.Entry<String, Integer> estados2:estadoMaior){
            if (estados2.getValue().equals(maiorPopulacao)){
                estadomaior= estados2.getKey();
                System.out.println("O estado com maior população é: "+estadomaior +" com uma população de: " +maiorPopulacao);
            }
        }
        System.out.println("");

        System.out.println("Exiba a soma da população desses estados: ");
        Iterator<Integer> iterator = estadosLin.values().iterator();
        Integer soma=0;
        while (iterator.hasNext()){
            soma+= iterator.next();
        }
        System.out.println("A soma da população de todos os estados é: "+soma);
        System.out.println("");

        System.out.println("A media da população deste dicionario de estados é: "+soma/estadosLin.size());
        System.out.println("");

        System.out.println("Remova os estados com a população menor que 4.000.000 ");
        Iterator<Integer> iterator1= estadosLin.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next()< 4000000)
                iterator1.remove();
        }
        System.out.println(estadosLin);
        System.out.println("");

        System.out.println("Apague o dicionario de estados ");
        estadosBr.clear();
        System.out.println(estadosBr);

        System.out.println("Confira se o dicionario esta vazio: ");
        if (estadosBr.isEmpty()) System.out.println("O dicionario esta vazio ");
        else System.out.println("O dicionario não esta vazio ");



    }


}

