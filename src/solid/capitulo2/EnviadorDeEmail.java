package solid.capitulo2;

public class EnviadorDeEmail implements AcaoAposGerarNota{

	public void executa(NotaFiscal nf) {
		System.out.println("Envia email da NF " + nf.getId());
	}

}
