import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Banco {

	private String nome;
	private List<Conta> contas;
	private List<Cliente> clientes;


	public void listarClientes(List<Cliente> clientes){

		for(Cliente cliente: clientes){
			System.out.printf("Cliente: "+ cliente.getNome());
			}
	};

}


