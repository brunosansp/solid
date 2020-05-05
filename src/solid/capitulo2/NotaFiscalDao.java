package solid.capitulo2;

public class NotaFiscalDao implements AcaoAposGerarNota {

	public void executa(NotaFiscal nf) {
		System.out.println("Salva NF no banco.");
	}

}
