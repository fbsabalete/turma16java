package ooplista1;

public class TesteCliente {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.setIdade(18);
		cliente.setNome("Robertinho");
		cliente.setSaldo(1800);
		
		System.out.println(cliente.getIdade());
		System.out.println(cliente.getNome());
		System.out.println(cliente.getSaldo());
	}
}
