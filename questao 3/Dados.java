public class Dados {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Geovane");
        
        empregado.nome = "geovane";
        empregado.idade = 20;
        empregado.setCpf("111.111.111-11");
        empregado.setCodigoSetor(1);
        empregado.setImposto(5);
        empregado.setSalarioBase(1350);

        System.out.println("Nome: " + empregado.nome);
        System.out.println("CPF: " + empregado.getCpf());
        System.out.println("Idade: " + empregado.idade);
        System.out.println("Setor: " + empregado.getCodigoSetor());
        System.out.println("Salário Base: " + empregado.getSalarioBase());
        System.out.println("Imposto: " + empregado.getImposto());
        System.out.println("Salário Líquido: " + empregado.calcularSalario());
    }
}