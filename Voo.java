package  questao01.entities ;

import  java.time.LocalDate ;

public  class  Voo {

	 número inteiro privado ;
	 dados locaisDate privados ;
	 booleano privado [] lugaresOcupados;

	 Voo público ( número inteiro  , dados LocalDate ) { 
		super ();
		isso . numero = numero;
		isso . dados = dados;
		isso . lugaresOcupados =  novo  booleano [ 100 ];
	}

	protegido  de Voo ( Integer  numero , LOCALDATE  dados , booleano [] lugaresOcupados ) {
		este (número, dados);
		isso . lugaresOcupados = lugaresOcupados;
	}

	public  Integer  getNumero () {
		devolva  isso . numero;
	}

	public  LocalDate  getData () {
		devolva  isso . dados;
	}

	public  Integer  proximoLivre () {
		para ( int i =  0 ; i <  this . lugaresOcupados . comprimento; i ++ ) {
			if ( ! isto . lugaresOcupados [i]) {
				return i +  1 ;
			}
		}
		return  null ;
	}

	public  int  vagas () {
		int vagasDisponiveis =  0 ;
		para ( int i =  1 ; i <=  this . lugaresOcupados . comprimento; i ++ ) {
			if ( ! this . verifica (i)) vagasDisponiveis ++ ;
		}
		return vagasDisponiveis;
	}

	 verificação booleana  pública ( int lugar ) { 
		devolva  isso . lugaresOcupados [lugar -  1 ];
	}

	public  Boolean  ocupa ( int  lugar ) {
		se ( isto . verifica (lugar)) retorna  falso ;
		isso . lugaresOcupados [lugar -  1 ] =  verdadeiro ;
		return  true ;
	}

	 Clone público de Voo  () {
		devolver  novo  Voo ( este . numero, este . dados, este . lugaresOcupados);
	}

}