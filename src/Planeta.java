
public class Planeta extends CuerpoEstelar{
	
	boolean  es_habitable;
	int  especies_conocidas;
	
	
	Planeta( int posicion, int masa, boolean es_habitable, int especies_conocidas){
		
		super(posicion,masa);
		this.  es_habitable = es_habitable;
		this. especies_conocidas = especies_conocidas;
		
	}
	
	
	

}
