/**
 * Classe respons?vel pelo carregamento inicial dos dado.
 * <p>
 * Assim que o programa ? inicializado, os dados s?o carregados automaticamente por interm?dio destes m?todos
 * @author Rodolfo
 * 
 */

package classes;
import java.util.*;
public class CargaInicial 
{	
	/**
	 * 
	 * Este m?todo retorna uma lista de clientes .
	 * @return ArrayList<Cliente> lista de clientes 
	 * @author Rodolfo
	 */
	public static ArrayList<Cliente> listaClientes()
	{

		ArrayList<Cliente> cliente = new ArrayList<>();

		cliente.add(new Cliente("Rodolfo Cabral Neves",
				new RG("Masculino","18-12-1990","19-03-2024","112233"),
				new Endereco ("12345-678", "a Casa do " + "Estudante da Universidade de Brasilia", "Distrito", "Brasilia", "DF", "12",4, 1),
				new Celular(61,235434324)));

		cliente.add(new Cliente("Joao Pedro",
				new RG("Masculino","18-12-1990","19-03-2024","112523"),
				new Endereco ("12225-977", "a Casa do " + "Estudante da Universidade de Brasilia", "Distrito", "Brasilia", "DF", "12",334, 20),
				new Celular(61,333434324)));

		cliente.add(new Cliente("Marcos Fernando",
				new RG("Masculino","18-12-1990","19-03-2024","119033"),
				new Endereco ("56345-678", "a Casa do " + "Estudante da Universidade de Brasilia", "Distrito", "Brasilia", "DF", "12",134, 27),
				new Celular(61,883434324)));

		cliente.add(
				new Cliente("Joao Manuel",
						new RG("Masculino","18-12-1990","19-03-2024","112233"),
						new Endereco ("98345-678", "a Casa do " + "Estudante da Universidade de Brasilia", "Distrito", "Brasilia", "DF", "12",354, 12),
						new Celular(61,893434324)));
		cliente.add(
				new Cliente("Carla Menezes",
						new RG("Feminino","28-02-1994","29-03-2026","662533"),
						new Endereco ("12555-678", "Casa do " + "Estudante da Universidade de Brasilia", "Distrito", "Brasilia", "DF", "21",884, 2),
						new Celular(61,773434324)));
		return cliente;
	}
	/**
	 * 
	 * Este m?todo retorna uma lista de livros .
	 * @return ArrayList<Livro> lista de livros
	 * @author Rodolfo
	 * 
	 */
	public static ArrayList<Livro> listaLivros()
	{
		ArrayList<Livro> livros = new ArrayList<>();

		livros.add(new Livro("Augusto Cury", "Romance", "Amar e bom", "19/2/1998",544.33F, "Romances Love", 5,23));
		livros.add(new Livro("Flemming", "Academico", "Calculo II", "9/12/2008",64.93F, "Mir Moscovo", 1,54));
		livros.add(new Livro("Dennis Ritchie", "Academico", "Linguagem C", "1/1/1992",46.34F, "Flow Editor", 3,77));
		livros.add(new Livro("Edson Júnior", "Academico", "Estrutuas de Dados II", "5/9/2009",63.71F, "UnB", 1,98));
		return livros;
	}

	/**
	 * 
	 * Este m?todo retorna uma lista de revistas .
	 * @return ArrayList<Livro> lista de revistas
	 * @author Rodolfo
	 * 
	 */
	public static ArrayList<Revista> listaRevista()
	{
		ArrayList<Revista> revista = new ArrayList<>();

		revista.add(new Revista("Playboy","Desporto","Rodolfo, o Plaboy","12/3/2021",46.5f,"PlayBoy Ed",2,45));
		revista.add(new Revista("Magazine Luiza","Cosmetico","Os melhores cosmeticos","22/05/2021",66.35f,"Luiza Pub",21,95));
		revista.add(new Revista("Food Cook","Gastronomia","Os melhores temperos","4/09/2021",46.6f,"FoodMaker Ed",23,64));
		return revista;
	}
}
