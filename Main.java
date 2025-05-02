public class Main {
    public static void main(String[] args) {
        Animal meuCachorro = new Cachorro("Rex"); // Objeto
        System.out.println("O nome do cachorro é: " + meuCachorro.getNome());
        meuCachorro.emitirSom(); // Saída: "Au Au!"
    }
}