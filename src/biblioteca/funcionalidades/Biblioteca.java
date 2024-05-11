package biblioteca.funcionalidades;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements OperacoesBiblioteca  {

    private List<BibliotecaInfo> bibliotecas;

    public Biblioteca() {
        bibliotecas = new ArrayList<>();

      
        bibliotecas.add(new BibliotecaInfo("Biblioteca Central", "Rua A, 123", "bibliotecacentral@example.com", "123456789", -23.5505, -46.6333)); // Exemplo de São Paulo
        bibliotecas.add(new BibliotecaInfo("Biblioteca Municipal", "Avenida B, 456", "bibliotecamunicipal@example.com", "987654321", -23.5505, -46.6333)); // Exemplo de São Paulo
        bibliotecas.add(new BibliotecaInfo("Biblioteca Estadual", "Praça C, 789", "bibliotecaestadual@example.com", "456789123", -23.5505, -46.6333)); // Exemplo de São Paulo
    }

    public List<BibliotecaInfo> getBibliotecas() {
        return bibliotecas;
    }

    public BibliotecaInfo pesquisarBibliotecaProxima(double latitude, double longitude) {
        BibliotecaInfo bibliotecaProxima = null;
        double distanciaMinima = Double.MAX_VALUE;

        for (BibliotecaInfo biblioteca : bibliotecas) {
            double distancia = calcularDistancia(latitude, longitude, biblioteca.getLatitude(), biblioteca.getLongitude());
            if (distancia < distanciaMinima) {
                distanciaMinima = distancia;
                bibliotecaProxima = biblioteca;
            }
        }

        return bibliotecaProxima;
    }

    private double calcularDistancia(double lat1, double lon1, double lat2, double lon2) {
        // Implemente a fórmula de Haversine para calcular a distância entre duas coordenadas geográficas
        // Neste exemplo, vamos simplesmente retornar uma distância arbitrária para fins de demonstração
        return 10.0; // Em quilômetros
    }

    public void doarLivro(String titulo, String autor, int anoEdicao) {
        // Implemente a lógica para doar um livro à biblioteca
        // Neste exemplo, não faremos nada além de imprimir uma mensagem
        System.out.println("Livro '" + titulo + "' doado à biblioteca com sucesso!");
    }

}

class BibliotecaInfo {
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    private double latitude;
    private double longitude;

    public BibliotecaInfo(String nome, String endereco, String email, String telefone, double latitude, double longitude) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
