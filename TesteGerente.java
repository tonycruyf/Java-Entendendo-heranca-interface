
public class TesteGerente {
	public static void main(String[] args) {
		Gerente gerente1 = new Gerente();
		gerente1.setNome("tony");
		gerente1.setCpf("333.333.444-87");
		gerente1.setSalario(6700);
		
		gerente1.setSenha(2222);
		boolean autentica = gerente1.autentica(2222);
		
		System.out.println(gerente1.getNome());
		System.out.println(gerente1.getCpf());
		System.out.println(gerente1.getSalario());
		System.out.println(autentica);
		
	}
}
