package projeto.repository;
import projeto.model.Produto;

public interface EstoqueRepository {
	

public void listarTodos();
public void buscarComida(int id);
public void buscarBebida(int id);
public void deletarComida(int id);
public void deletarBebida(int id);
public Produto editarComida(int id);
public void editarBebida(String produto);


}

