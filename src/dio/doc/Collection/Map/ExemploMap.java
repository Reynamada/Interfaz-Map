package dio.doc.Collection.Map;

import java.util.*;

/*Dado os modelos dos carros e seus respectivos consumos na etrada,
faça:
 modelo= gol - consumo= 14.4km/l
 modelo= uno - consumo= 15.6km/l
 modelo= mobi - consumo= 16.1km/l
 modelo= hb20 - consumo= 14.5km/l
 modelo= kwid - consumo= 15.6km/l
  */
public class ExemploMap {
    public static void main(String[] args){

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrospupulares = new HashMap<>(){{

            put("uno", 15.6);
            put("mobi", 16.1);
            put("gol", 13.4);
            put("hb", 14.5);
            put("kwid", 15.6);

        }};
        System.out.println(carrospupulares);

        System.out.println("Subtitua o consumo do gol por 15,2 km/l: ");
        carrospupulares.put("gol",15.2);
        System.out.println(carrospupulares);

        System.out.println("Confira se o modelo tucson esta no dicionario: " );
        boolean resposta = carrospupulares.containsKey("tucson");
        if (resposta) {
            System.out.println("O modelo existe no dicionario");
        }else  System.out.println("O modelo não se encontra no dicionario");

        System.out.println("Exiba o consumo de uno: ");
        System.out.println("O consumo de uno é: "+carrospupulares.get("uno"));

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrospupulares.keySet();
        for ( String mod: modelos){
        System.out.println(mod);
        }

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumo=carrospupulares.values();
        for(Double consu:consumo){
            System.out.println(consu);
        }

        System.out.println("Exiba o modelo mais economico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrospupulares.values());
        Set<Map.Entry<String, Double>> entries =  carrospupulares.entrySet();
        String modeloMaisEficiente ="";
        for (Map.Entry<String, Double> entry :entries){
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + "  Consumo mais eficiente: " + consumoMaisEficiente);
            }

        }

        System.out.println("Exiba o modelo menos economico e seu consumo: ");
        Double consumoMenosEficiente= Collections.min(carrospupulares.values());
        String modeloMenosEficiente= "";
        //Set<Map.Entry<String, Double>> menosEco = carrospupulares.entrySet();
        for (Map.Entry<String, Double> entry : carrospupulares.entrySet()){
            if (entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("O modelo menos economico é: "+modeloMenosEficiente+ "O consumo menos Eficiente: "+consumoMenosEficiente);
            }
        }
        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrospupulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma +=iterator.next();
        }
        System.out.println("A soma dos consumos é: " +soma);

        System.out.println(" Exiba a média dos consumos deste dicionario de carros: "+soma/carrospupulares.size());

        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 =carrospupulares.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrospupulares);

        System.out.println("Exiba os carros na ordem em que foram informados: ");
        Map<String, Double> carrospupulares2 = new LinkedHashMap<>(){{

            put("uno", 15.6);
            put("mobi", 16.1);
            put("gol", 13.4);
            put("hb", 14.5);
            put("kwid", 15.6);

        }};
        System.out.println(carrospupulares2);

        System.out.println("Exiba o dicionario ordenado pelo modelo: ");
       Map<String,Double> carrospupulares3 = new TreeMap<>(carrospupulares2);
        System.out.println(carrospupulares3.toString());

        System.out.println("Apague o dicionario de carros");
        carrospupulares.clear();

        System.out.println("Confira se o dicionario esta vacio: ");
        if (carrospupulares.isEmpty()) {
            System.out.println("O dicionario esta vacio ");
        }else {
            System.out.println("O dicionario não esta vacio: ");}















    }
}
