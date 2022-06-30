package dio.doc.Collection.Map;

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main (String[] args){
        System.out.println("Ordem aleatória");
        Map<String, livro> meusLivros = new HashMap<>(){{
            put("Hawking,Stephen", new livro("Uma Breve Historia do Tempo",256));
            put("Duhigg, Charles", new livro("O Poder do Hábito",408));
            put("Harari, Yuval Noah", new livro("Uma Breve Historia do Tempo",432));
        }};
        for(Map.Entry<String, livro> livros: meusLivros.entrySet()){
            System.out.println(livros.getKey()+"-"+livros.getValue().getNome());
        }

        System.out.println("Orden de Inserção: ");
        Map<String,livro> meuslivros1 = new LinkedHashMap<>(){{
                put("Hawking,Stephen", new livro("Uma Breve Historia do Tempo",256));
                put("Duhigg, Charles", new livro("O Poder do Hábito",408));
                put("Harari, Yuval Noah", new livro("Uma Breve Historia do Tempo",432));
            }};
            for(Map.Entry<String, livro> livros1: meuslivros1.entrySet()){
            System.out.println(livros1.getKey()+"-"+livros1.getValue().getNome());
        }
        System.out.println("Ordem alfabetica los autores: ");
            Map<String, livro> meuslivros2 = new TreeMap<>(meuslivros1);
            for (Map.Entry<String, livro> livros3 : meuslivros2.entrySet()){
                //getValue(), es el tipo valor, que es paginas y nome
                System.out.println(livros3.getKey()+"-"+livros3.getValue().getNome());
            }

        System.out.println("Ordem alfabetica nome dos livros: ");
       //como é um valor lo que se quiere, se tiene que usar Set
        Set<Map.Entry<String,livro>> meuslivrosNome = new TreeSet<>(new ComparatorNome());
        meuslivrosNome.addAll(meusLivros.entrySet());
        for (Map.Entry<String,livro> livrosNome: meuslivrosNome){
            System.out.println(livrosNome.getKey()+"-"+ livrosNome.getValue().getNome());

        }

        System.out.println("Ordem de paginas ");
        Set<Map.Entry<String,livro>> meuslivrosPag = new TreeSet<>(new ComparatorPag());
        meuslivrosPag.addAll(meuslivros1.entrySet());
        for (Map.Entry<String,livro> livrosPag: meuslivrosPag){
            System.out.println(livrosPag.getKey()+"-"+ livrosPag.getValue().getPaginas());

        }




    }
}

class livro {
    private String nome;
    private Integer paginas;

    public livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        livro livro = (livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
class ComparatorNome implements  Comparator<Map.Entry<String,livro>>{
    @Override
    public int compare(Map.Entry<String, livro> l1, Map.Entry<String, livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}
class ComparatorPag implements Comparator<Map.Entry<String,livro>>{
    @Override
    public int compare(Map.Entry<String, livro> pag1, Map.Entry<String, livro> pag2) {
        return Integer.compare(pag1.getValue().getPaginas(),pag2.getValue().getPaginas());
    }
}
