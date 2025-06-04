package fork.java.list.Pesquisa;

import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {
    private List<Livro> catalogo;

    public CatalogoLivros() {
        this.catalogo = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        this.catalogo.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarAutor(String autor) {
        List<Livro> livroPorAutor = new ArrayList<>();
        if(!this.catalogo.isEmpty()) {
            for (Livro l : catalogo) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livroPorAutor.add(l);
                }
            }
        }

        return livroPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAno(int anoInicio, int anoFim) {
        List<Livro> livroPorIntervaloAno = new ArrayList<>();
        if (!this.catalogo.isEmpty()) {
            for (Livro l : catalogo) {
                if (l.getAnoPublicacao() >= anoInicio && l.getAnoPublicacao() <= anoFim) {
                    livroPorIntervaloAno.add(l);
                }
            }
        }

        return livroPorIntervaloAno;
    }

    public Livro pesquisaPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!this.catalogo.isEmpty()) {
            for (Livro l : catalogo) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
    // Criando uma instância do catálogo de livros
    CatalogoLivros catalogoLivros = new CatalogoLivros();

    // Adicionando livros ao catálogo
    catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
    catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
    catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
    catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

    // Exibindo livros pelo mesmo autor
    System.out.println(catalogoLivros.pesquisarAutor("Robert C. Martin"));

    // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
    System.out.println(catalogoLivros.pesquisarAutor("Autor Inexistente"));

    // Exibindo livros dentro de um intervalo de anos
    System.out.println(catalogoLivros.pesquisaPorIntervaloAno(2010, 2022));

    // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
    System.out.println(catalogoLivros.pesquisaPorIntervaloAno(2025, 2030));

    // Exibindo livros por título
    System.out.println(catalogoLivros.pesquisaPorTitulo("Java Guia do Programador"));

    // Exibindo livros por título (caso em que não há livros com o título especificado)
    System.out.println(catalogoLivros.pesquisaPorTitulo("Título Inexistente"));
  }
}
