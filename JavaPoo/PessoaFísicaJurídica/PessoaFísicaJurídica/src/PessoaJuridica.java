import javax.swing.JOptionPane;
public class PessoaJuridica extends Main{
	private String cnpj;
	
	public String getCnpj() {
		return this.cnpj;
	}
	
	public void setCnpj(String _cnpj) {
		this.cnpj = _cnpj;
	}
	
	public void RPessoaJuridica() {
		JOptionPane.showMessageDialog(null, "CNPJ: "+getCnpj()+"\nNome: "+getNome()+"\nData cria��o: "+getDataCriacao()+"\nRua: "+getRua()+"\nN�mero: "
		+getNum()+"\nTelefone: "+getTelefone());
	}
}
