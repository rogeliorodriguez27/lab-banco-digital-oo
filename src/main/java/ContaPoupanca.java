import java.util.Scanner;

public class ContaPoupanca extends Conta {
	protected int limiteSaque;
	public ContaPoupanca(Cliente cliente, int limiteSaque) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}

	public void sacarContaPoupanca(double valor) {
		if (limiteSaque>=1){
			super.sacar(valor);
			this.limiteSaque -=limiteSaque;
		}else {
			System.out.print("Saques maximos realizados");

		}
	}
	public void crearCaxinha(double valor) {
		System.out.print("Digite o nome da caixinha");
		String scanner = String.valueOf(new Scanner(System.in));
		String nome = scanner;
		super.sacar(valor);
		Caxinha nuevaCaxinha = new Caxinha(nome,valor);
	}

}



