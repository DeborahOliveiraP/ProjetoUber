package entities.model;

import java.util.ArrayList;
import java.util.List;

 public class Cliente extends Usuario {

	 private String destinoPassageiro;
     private List<Destino> destino;
    
    private void mostreDestino(Destino destino) {
    	if (destino == null) {
    		throw new NullPointerException(" Viagem aceita");
    	}
    	
    	//if (destino.Destino = null) {
    		//throw new NullPointerException(" Viagem aceita");
    	//}
    	getDestino().add(destino);
    }
    
    private List<Destino> getDestino() {
    	if (destino == null) {
    		destino =  new ArrayList<Destino>();
    	}
    	return destino;
    	
    }
    
 }