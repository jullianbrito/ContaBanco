import java.util.Scanner;

public final class ContaTerminal {

    private double saldo;
    private String nome;
    private String agencia;
    private  int numero;

//  Construtor

    ContaTerminal(double novoSaldo, String novoNome, String novoAgencia, int novoNumero) {
        this.setSaldo(novoSaldo);
        this.setNome(novoNome);
        this.setAgencia(novoAgencia);
        this.setNumero(novoNumero);
    }

//  Metodo get / set (1)

    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }

//  Metodo get / set (2)

    public String getNome() {
        return this.nome;
    }
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

//  Metodo get / set (3)    

    public String getAgencia() {
        return this.agencia;
    }
    public void setAgencia(String novoAgencia) {
        this.agencia = novoAgencia;
    }

//  Metodo get / set (4)       

    public int getNumero() {
        return this.numero;
    }
    public void setNumero(int novoNumero) {
        this.numero = novoNumero;
    }

//  Metodo de impressao de conta nova
    
    public void contaNova() {
        System.out.println("Olá, " + this.getNome() + "! Obrigado por criar uma conta em nosso banco! Sua agência é " + this.getAgencia() + ", sua conta é " + this.getNumero() + " e seu saldo de R$: " + this.getSaldo() + " já está disponível para saque.");
    }

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            ContaTerminal ct;

            double saldo_1 = 1842.42;
            String cliente_1, agencia_1;
            int numero_1;

            System.out.println("Digite seu nome: ");
            cliente_1 = ler.nextLine();
            System.out.println("Digite sua agência: ");
            agencia_1 = ler.nextLine();
            System.out.println("Digite sua conta: ");
            numero_1 = ler.nextInt();

            ct = new ContaTerminal(saldo_1, cliente_1, agencia_1, numero_1);
            ct.contaNova();
        }
    }
}