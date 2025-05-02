public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() { // Polimorfismo
        System.out.println("Au Au!");
    }
}