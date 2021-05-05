package  questao02.entities ;

public  class  Equipamento {

	 valores inteiros privados ;

	 Equipamento público ( int  numeroEquipamentos ) {
		isso . valores =  novo  número inteiro [numeroEquipamentos];
	}

	public  Integer  getNumeroEquipamentos () {
		devolva  isso . valores . comprimento;
	}

	public  Integer  getValor ( número inteiro  ) {
		devolva  isso . valores [numero];
	}

	pública  vazio  setValor ( Integer  numero , Integer  valor ) {
		isso . valores [numero] = valor;
	}

}