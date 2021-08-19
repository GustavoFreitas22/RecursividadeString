package Controller;

public class PalavraController {

	public PalavraController() {
		super();
	}

	public String inverter(String palavra, int tamanho, String resultado) {
		//Condicao de parada e <= 1 pois o usuario pode inserir 0 que nao deve entrar na multiplicacao
		// e o numero 1 retorna ele mesmo nao devendo executar o valor--
		if (tamanho == 0 ) {
			return " ";
		} else{
			resultado = palavra.substring(tamanho - 1, tamanho);
			return resultado + inverter(palavra, tamanho - 1, resultado );
		}
	}
}


