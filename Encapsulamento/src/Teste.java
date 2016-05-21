
public class Teste {
	
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.setNome("Eduardo Bernstein");
		f.setSalario(2000);
		System.out.println("Nome: " + f.getNome());
		System.out.println("Salário: " + f.getSalario());
		Conta c = new Conta();
		c.setNumero(123);
		c.setSaldo(540.12);
		c.setLimite(100.0);
		System.out.println("Número:" + c.getNumero());
		System.out.println("Saldo:" + c.getSaldo());
		System.out.println("Limite:" + c.getLimite());
	}
	
}
