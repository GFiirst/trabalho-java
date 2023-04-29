public class Animais {
    public static void main (String[] arg) {
        Cachorro cachorro = new Cachorro("nao sei se eu comento", 5);
        Cavalo cavalo = new Cavalo("juan", 15);
        Preguica preguica = new Preguica("carlos", 15);

        System.out.println("Nome do cachorro: " + cachorro.getNome());
        System.out.println("Idade do cachorro: " + cachorro.getIdade());
        cachorro.som();
        cachorro.acao();
        
        System.out.println("Nome do cavalo: " + cavalo.getNome());
        System.out.println("Idade do cavalo: " + cavalo.getIdade());
        cavalo.som();
        cavalo.acao();

        System.out.println("Nome da preguiça: " + preguica.getNome());
        System.out.println("Idade da preguiça: " + preguica.getIdade());
        preguica.som();
        preguica.acao();
    }
}