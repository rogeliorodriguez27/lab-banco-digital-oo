import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Banco {

	private String nome;
	private List<Conta> contas;
	private List<Cliente> clientes;
	private double intereses = 0.10;
	private double chequeEspecial = 100;



	public void listarClientes(List<Cliente> clientes){

		for(Cliente cliente: clientes){
			System.out.printf("Cliente: "+ cliente.getNome());
			}
	};

	public void habilitarChequeEspecial(ContaCorrente contaCorrente){
		System.out.println("Cheque especial habilitado");
		if (contaCorrente.saldo==0) {
            contaCorrente.saldo = chequeEspecial;
        }

	}

	public void calcularIntereses(ContaPoupanca contaPoupanca){
		System.out.println("Cheque especial habilitado");
		if (contaPoupanca.saldo>0) {
			contaPoupanca.saldo = chequeEspecial* 1;
		}

	}


}


