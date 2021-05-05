package  questao01.entities ;

import  java.time.LocalDate ;

public  class  VooFumantes  estende  Voo {

	privadas  inteiros cadeirasFumantes;
	private  Integer maxVagas;

	públicas  VooFumantes ( Integer  numero , LOCALDATE  dados , Integer  maxVagas , Integer  cadeirasFumantes ) {
		super (numero, dados, novo  booleano [maxVagas]);
		isso . maxVagas = maxVagas;
		isso . cadeirasFumantes = cadeirasFumantes;
	}

	public  Integer  maxVagas () {
		devolva  isso . maxVagas;
	}

	público  Integer  cadeirasFumantes () {
		devolva  isso . cadeirasFumantes;
	}

	public  char  tipo ( lugar inteiro  ) {
		int posicaoFumante =  this . maxVagas -  isso . cadeirasFumantes;
		int posicaoLugar = lugar -  1 ;
		return posicaoLugar > = posicaoFumante ?  ' F '  :  ' N ' ;
	}
}