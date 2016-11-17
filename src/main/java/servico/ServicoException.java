package servico;

public class ServicoException extends Exception {
	private static final long serialVersionUID = 1L;
	
	private Integer codigo;
	private String msg;
	
	public ServicoException (String msg, Integer codigo) {
		super(msg);
		this.codigo = codigo;
	}
	
	public Integer getCodigo() {
		return this.codigo;
	}

	public String getMessage(){return  this.getMessage();}

}
