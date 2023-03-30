package projeto.repository;

public interface EstoqueRepository {
	
public void adicionarComida();
public void adicionarBebida();
public void listarTodos();
public void buscarComida(int id);
public void buscarBebida(int id);
public void deletarComida(int id);
public void deletarBebida(int id);
public void editarComida(String produto);
public void editarBebida(String produto);

}
