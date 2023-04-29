public class Registrar {
    public static void main(String[] arg) {

        Fornecedor papelaria = new Fornecedor("Papelaria LTDA");

        papelaria.setCredito(50);
        papelaria.setDivida(30);
        papelaria.setSaldo(0);

        papelaria.nome = "Geovane Fiirst";
        papelaria.idade = 20;
        papelaria.setCpf("111.111.111-11");

        System.out.println(papelaria.nome);
        System.out.println(papelaria.getCpf());
        System.out.println(papelaria.idade);
        System.out.println(papelaria.getCredito());
        System.out.println(papelaria.getDivida());
        System.out.println(papelaria.getSaldo());
    }
}