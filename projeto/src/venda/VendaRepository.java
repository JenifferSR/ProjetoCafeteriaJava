package venda;

public interface VendaRepository {
	
	public void adicionar(int id);
	
	public void listar();
	
	public void atualizar(int id);
	
	public void deletar(int id);
	
	// Métodos

	public void somaTotal(float preco);

}
