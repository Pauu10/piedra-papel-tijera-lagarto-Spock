package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {
   private final Integer forma;
   private final Resultado [][] opciones = {
		                                     {Resultado.EMPATA, Resultado.PIERDE, Resultado.PIERDE, 
		                                      Resultado.GANA, Resultado.GANA},
			                                 {Resultado.GANA, Resultado.EMPATA, Resultado.PIERDE, 
		                                      Resultado.PIERDE, Resultado.GANA},
			                                 {Resultado.GANA, Resultado.GANA, Resultado.EMPATA, 
		                                      Resultado.PIERDE, Resultado.PIERDE},
			                                 {Resultado.PIERDE, Resultado.GANA, Resultado.GANA,
		                                      Resultado.EMPATA, Resultado.PIERDE},
			                                 {Resultado.PIERDE, Resultado.PIERDE, Resultado.GANA, 
		                                      Resultado.GANA, Resultado.EMPATA}};

	public Mano(final Forma forma) {
	  this.forma = forma.getValor();
	}

	public Resultado jugarCon(final Mano otra) {
		return opciones[this.forma][otra.forma];
		}
           }
