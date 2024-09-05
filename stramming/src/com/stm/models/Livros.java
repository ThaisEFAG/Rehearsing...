public class Livros {

    private String titulo;
    private String autor;
  
    public void setTitulo(String titulo) {
      this.titulo = titulo;
    }
  
    public void setAutor(String autor) {
      this.autor = autor;
    }
  
    public String getTitulo() {
      return titulo;
    }
  
    public String getAutor() {
      return autor;
    }
  
    void displayDetails() {
      System.out.println("Livro: " + titulo);
      System.out.println("Autor: " + autor);
    }
  }