package edu.tallerweb.pptls;

import static org.junit.Assert.*;
import org.junit.Test;

public class PartidaTests {

	@Test
	public void queSpockVaporizaPiedra() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Spock vaporiza piedra",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
      	}
	

   @Test
   public void queLagartoComePapel(){
	   
	   Mano jugadorUno = new Mano(Forma.PAPEL);
	   Mano jugadorDos = new Mano(Forma.LAGARTO);
	  
	   assertEquals("Lagarto come papel",
			 Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));
	     }
	
   @Test 
   public void quePapelEnvuelvaPapel(){

     Mano jugadorUno = new Mano(Forma.PAPEL);
     Mano jugadorDos = new Mano(Forma.PAPEL);
   
     assertEquals("Papel envuelva papel",
     		Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));
      }
   
   @Test
   public void quePiedraAplasteTijera(){

	  Mano jugadorUno = new Mano(Forma.TIJERA);
	  Mano jugadorDos = new Mano(Forma.PIEDRA);
	  
	  assertEquals("Piedra aplaste tijera",
			  Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));
   }
         }