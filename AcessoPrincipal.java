public class AcessoPrincipal {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(1713);
        conta.setTitular("Felipe Siqueira Camargo");
        conta.setSaldo(100);

        System.out.println("Saldo atual: "+conta.getSaldo());
        conta.depositarValor(500);
        System.out.println("Saldo atual: "+conta.getSaldo());

        conta.sacaValor(700);
        System.out.println("Saldo atual: "+conta.getSaldo());
    }
}
