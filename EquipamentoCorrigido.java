package  questao02.entities ;

 Classe  pública EquipamentoCorrigido  estende  Equipamento {

	private  Integer mesCorrente;
	private  Integer [] mesesCompra;

	public  EquipamentoCorrigido ( Integer  numeroEquipamentos ) {
		super (numeroEquipamentos);
		isso . mesCorrente =  1 ;
		isso . mesesCompra =  novo  Inteiro [numeroEquipamentos];
	}

	public  Integer  getMesCompra ( Integer  numero  / * posicao do vetor * / ) {
		devolva  isso . mesesCompra [numero];
	}

	public  void  setMesCompra ( Integer  numero , Integer  mesCompra ) {
		isso . mesesCompra [numero] = mesCompra;
	}

	 retificação de void  público ( percentual inteiro ) { 
		for ( int i =  0 ; i <  this . mesesCompra . length; i ++ ) {
			if ( this . mesesCompra [i] ==  this . mesCorrente) {
				isso . setValor (i, this . getValor (i) * (percentual /  100 ));
			}
		}

		if ( this . mesCorrente ==  12 ) {
			isso . mesCorrente =  1 ;
		} else {
			isso . mesCorrente ++ ;
		}
	}

	 substitui void  public ( EquipamentoCorrigido outro ) { 
		if ( this . getNumeroEquipamentos () == outro . getNumeroEquipamentos ()) {
			para ( int i =  0 ; i <  this . getNumeroEquipamentos (); i ++ ) {
				isso . setValor (i, outro . getValor (i));
				isso . setMesCompra (i, outro . getMesCompra (i));
			}
		}
	}

}