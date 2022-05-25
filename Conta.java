
package contabancaria;

public class Conta {
    private int cpf;
    private String nome;
    private double saldo; 
    private double limite;

    
    public Conta(String nome, int cpf, double limite){
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0.0;
        this.limite = limite;
    }
    
    public void deposito(double deposito){
        
        this.saldo += deposito;
    }
    
    public void saque(double saque){
        
    }
    
    private boolean checa(double saque){
        return false;
    }
    
    private void calcJuros(int qtdMes){
        if(saldo < 0)
            System.out.println((saldo * 0.2) * qtdMes);
    }
    
    
    
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
}
