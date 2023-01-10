
import java.util.ArrayList;
public class Cofrinho {
    //lista de moedas
	ArrayList<Moeda> listaMoedas  = new ArrayList<Moeda>();
	
	//funções
	public void adicionar(Moeda v){
		System.out.println("A moeda foi adicionada");
		listaMoedas.add(v);
		
	}
	public void remover(Moeda v){
		listaMoedas.remove(v);
	}
	public void listagemMoeda() {
		for (Moeda v : listaMoedas) {
			System.out.println(v);
		}
	}
	public void totalConvertido() {
		
		
	}
}
