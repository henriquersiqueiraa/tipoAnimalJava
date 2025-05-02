public class Animal {
    private String nome; // Encapsulamento

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void emitirSom() { // Polimorfismo (será sobrescrito)
        System.out.println("Som genérico");
    }
}