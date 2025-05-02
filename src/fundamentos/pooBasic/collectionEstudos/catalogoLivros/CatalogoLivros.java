package fundamentos.pooBasic.collectionEstudos.catalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listLivro;

    public CatalogoLivros() {
        this.listLivro = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listLivro.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> LivroPesquisa = new ArrayList<>();

        if(!listLivro.isEmpty()){
            for(Livro l : listLivro){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    LivroPesquisa.add(l);
                }
            }
        }
        return LivroPesquisa;
    }

    public List<Livro> pesquisarPorIntervalo(int anoInicial, int anoFinal){
        List<Livro> IntervaloAnos = new ArrayList<>();

        if(!listLivro.isEmpty()){
            for(Livro l : listLivro){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() >= anoFinal){
                    IntervaloAnos.add(l);
                }
            }
        }
        return IntervaloAnos;
    }

    public List<Livro> pesquisarPorTitulo(String titulo){
        List<Livro> LivroTitulo = new ArrayList<>();

        if(!listLivro.isEmpty()){
            for(Livro l : listLivro){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    LivroTitulo.add(l);
                    break;
                }
            }
        }
        return LivroTitulo;
    }


    public static void main (String [] args){

        var cl = new CatalogoLivros();

        cl.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        cl.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        cl.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        cl.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);


        // Exibindo livros pelo mesmo autor
        System.out.println(cl.pesquisarPorAutor("Robert C. Martin"));

        // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
        System.out.println(cl.pesquisarPorAutor("Autor Inexistente"));

        // Exibindo livros dentro de um intervalo de anos
        System.out.println(cl.pesquisarPorIntervalo(2010, 2022));

        // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
        System.out.println(cl.pesquisarPorIntervalo(2025, 2030));

        // Exibindo livros por título
        System.out.println(cl.pesquisarPorTitulo("Java Guia do Programador"));


    }
}
