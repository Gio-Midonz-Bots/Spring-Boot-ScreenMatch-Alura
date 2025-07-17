package br.com.Spring.Alura.Screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpsodio(@JsonAlias("Title") String titulo,
                           @JsonAlias("Episode") Integer numeroEpisodio,
                           @JsonAlias("imbdRating") String avaliacao,
                           @JsonAlias("Realeased") String dataLancamento) {
}
