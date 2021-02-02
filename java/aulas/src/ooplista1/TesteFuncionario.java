package ooplista1;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		
		func.setId(0001);
		func.setNome("Fernando");
		func.setSalario(1500);
		
		System.out.println(func.getId());
		System.out.println(func.getNome());
		System.out.println(func.getSalario());
	}
}
