    public class Pessoa {
        public String nome;
        private String cpf;
        public int idade;
        
        public Pessoa(String nome,int idade){
            this.nome = nome;
            this.idade = idade;
        }
        public String getCpf(){
            return cpf;
        }
        public void setCpf(String cpf){
            this.cpf = cpf;
        }
    }
