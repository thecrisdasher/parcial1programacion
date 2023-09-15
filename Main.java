public class Main {
    public static void main(String[] args) {
        LibrosDeTexto libre1 = new LibrosXD("Programa con Abel", "The Weeknd", "Programación", "Ciencias de la Computación");
        Novelas libre2 = new Novelas("La Melancolia De Los Feos", "Mario Mendoza", "Realista");

        libre1.imprimir();
        libre2.imprimir();
    }
}