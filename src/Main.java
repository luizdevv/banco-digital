public class Main {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente();
        contaCorrente.depositar(100.0);

        Conta contaPoupanca = new ContaPoupanca();

        contaCorrente.transferir(100.0, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
