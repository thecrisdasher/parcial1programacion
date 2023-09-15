public class Libro {
    private String titulo;
    private String autor;
    private double precio;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = 0.0;
    }

    public void imprimir() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Precio: " + this.precio);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

class LibrosDeTexto extends Libro {
    private String curso;

    public LibrosDeTexto(String titulo, String autor, String curso) {
        super(titulo, autor);
        this.curso = curso;
    }

  
    public void imprimir() {
        super.imprimir();
        System.out.println("Curso: " + this.curso);
    }
}

class LibrosXD extends LibrosDeTexto {
    private String facultad;

    public LibrosXD(String titulo, String autor, String curso, String facultad) {
        super(titulo, autor, curso);
        this.facultad = facultad;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Facultad: " + this.facultad);
    }
}

class Novelas extends Libro {
    private String tipo;

    public Novelas(String titulo, String autor, String tipo) {
        super(titulo, autor);
        this.tipo = tipo;
    }


    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo: " + this.tipo);
    }
}
