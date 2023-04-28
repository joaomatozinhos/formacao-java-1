package desafios.consulta_api_cep;

import java.io.FileWriter;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GeradorDeArquivo {

	public void salvaJson(List<Endereco> listaDeEndereco) throws Exception {

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonEndereco = gson.toJson(listaDeEndereco);

		FileWriter escrita = new FileWriter("enderecos-pesquisados.json");
		escrita.write(jsonEndereco);
		escrita.close();

	}

}
