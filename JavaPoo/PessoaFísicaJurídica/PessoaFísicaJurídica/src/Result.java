import javax.swing.JOptionPane;
public class Result {
	public static void main(String[]args) {
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		pf.setDataCriacao(2003);
		pf.setCpf("535.091.238-08");
		pf.setRg("56.826.012-0");
		pf.setNome("David Avenue");
		pf.setRua("R. Os�rio Franco Vilhena");
		pf.setNum("1305");
		pf.setTelefone("(55)1195764-8755");
		pf.RPessoaFisica();
		
		pj.setDataCriacao(1977);
		pj.setCnpj("236.665.652-35");
		pj.setNome("Cit Industries");
		pj.setRua("R. das Violetas");
		pj.setNum("321");
		pj.setTelefone("(55)2619-6993");
		pj.RPessoaJuridica();
	}
}