import java.time.LocalDate;

public class Main {

	public static void main(String[] args) throws SaldoInsuficienteException, TempoInsuficienteException {

		Cliente carlos = new Cliente("Carlos", "332355225-54");
		
		Conta cc = new ContaCorrente(carlos);
		Conta poupanca = new ContaPoupanca(carlos);

		cc.depositar(200);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		TituloDeCapitalizacao t1 = new TituloDeCapitalizacao();
		t1.contratarInvestimento(poupanca, 250.00,
				LocalDate.parse("2022-05-30"),
				LocalDate.parse("2023-08-30"));

		System.out.println(t1.resgatarInvestimento());
		System.out.println();

	}

}
