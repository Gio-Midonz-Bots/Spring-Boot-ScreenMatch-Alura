package br.com.Spring.Alura.Screenmatch;

import br.com.Spring.Alura.Screenmatch.model.DadosEpsodio;
import br.com.Spring.Alura.Screenmatch.model.DadosSerie;
import br.com.Spring.Alura.Screenmatch.service.ConsumoAPI;
import br.com.Spring.Alura.Screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoAPI();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?i=tt3896198&apikey=e0966007");
		System.out.println(json);
		ConverteDados converso = new ConverteDados();
		DadosSerie dados = converso.obterDados(json, DadosSerie.class);
		System.out.println(dados);
		DadosEpsodio dadosEpsodio = converso.obterDados(json, DadosEpsodio.class);
	}
}
