package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Autor;
import modelo.Categoria;
import modelo.Editora;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-08T17:22:14")
@StaticMetamodel(Livro.class)
public class Livro_ { 

    public static volatile SingularAttribute<Livro, Autor> idAutor;
    public static volatile SingularAttribute<Livro, String> isbn;
    public static volatile SingularAttribute<Livro, String> imagem;
    public static volatile SingularAttribute<Livro, String> nome;
    public static volatile SingularAttribute<Livro, Integer> id;
    public static volatile SingularAttribute<Livro, String> edicao;
    public static volatile SingularAttribute<Livro, Categoria> idCategoria;
    public static volatile SingularAttribute<Livro, Integer> numPaginas;
    public static volatile SingularAttribute<Livro, Editora> idEditora;

}