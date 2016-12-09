package entidade;

public class Equipamento extends TipoRecurso{
	
	private int codigoTipo;
	private String descricao;
	
	Equipamento(int i, String s){
		codigoTipo = i;
		descricao = s;
	}
	
	
	
	public void setCodigoTipo(int i)
	{
		codigoTipo = i;
	}
	public int getCodigoTipo()
	{
		return codigoTipo;
	}
	
	public void setDescricao(String s)
	{
		descricao = s;
	}
	public String getDescricao()
	{
		return descricao;
	}

}
