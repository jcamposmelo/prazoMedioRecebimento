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
