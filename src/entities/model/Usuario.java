package entities.model;

public class Usuario {

	private static final int TAMANHO_CNH = 11;
	private static final int TAMANHO_CPF = 10;
	
	private enum TipoUsuario { MOTORISTA, PASSAGEIRO}
	
	private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String documentoId;
    private TipoUsuario tipo;
    
    public String getDocumentoId () {
        return documentoId;
    }
    
    public void setDocumentoId(String documentoId) {
    	if (documentoId == null || documentoId.isEmpty()) {
    	}
    	
    	if(documentoId.length() == TAMANHO_CNH){
    		setDocumentoId(documentoId, tipo = TipoUsuario.MOTORISTA);
    	}else if ( documentoId.length() == TAMANHO_CPF) {
    		setDocumentoId (documentoId , tipo = TipoUsuario.PASSAGEIRO);	
    	}
    	this.documentoId = documentoId;
    }
    private void setDocumentoId(String documentoId, TipoUsuario tipo ) {
    	this.documentoId = documentoId;
    	this.tipo = tipo; 
    }
    
    public TipoUsuario getTipo() {
    	return tipo;
    	
    }
}

