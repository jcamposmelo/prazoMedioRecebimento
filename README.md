# prazoMedioRecebimento
Conhecido também como PMR, o prazo médio de recebimento é o tempo médio, em dias, entre a venda feita e o recebimento do dinheiro. Ou seja, é o tempo que a empresa vai demorar para receber o dinheiro.

```
public class prazoMedioRecebimento {
	public static void main(String[] args) {
		double duplicatasReceber = 5789000;
		double receitaBruta = 128550000;

		double prazoMedioRecebimento;

		prazoMedioRecebimento = (duplicatasReceber / receitaBruta)*360;

		System.out.println("O Prazo Médio de Recebimento é?  " + 
				prazoMedioRecebimento + " dias ");
	}

}
