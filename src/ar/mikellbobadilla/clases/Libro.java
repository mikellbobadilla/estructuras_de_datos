package ar.mikellbobadilla.clases;

import java.util.Objects;

public class Libro {

  private String titulo;
  private String autor;
  private String isbn;

  public Libro(String titulo, String autor, String isbn) {
    this.titulo = titulo;
    this.autor = autor;
    this.isbn = isbn;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Libro libro = (Libro) o;
    return Objects.equals(titulo, libro.titulo)
                          &&
           Objects.equals(autor, libro.autor)
                          &&
           Objects.equals(isbn, libro.isbn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(titulo, autor, isbn);
  }

  @Override
  public String toString() {
    return "Libro{" +
      "titulo='" + titulo + '\'' +
      ", autor='" + autor + '\'' +
      ", isbn='" + isbn + '\'' +
      '}';
  }
}
