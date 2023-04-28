public class Registrar{
    public static void main(String[]arg){

        Pessoa geovane = new Pessoa("geovane fiirst", 20);
        geovane.setCpf("111.111.111-11");

        System.out.println(geovane.nome);
        System.out.println(geovane.getCpf());
        System.out.println(geovane.idade);
    }
}