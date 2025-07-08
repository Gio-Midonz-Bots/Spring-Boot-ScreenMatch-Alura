package br.com.Spring.Alura.Screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public record DadosSerie(@JsonAlias("Title") String title,
                         @JsonAlias("Year")String year,
                         @JsonAlias("totalSeasons")Integer totalSeasons,
                         @JsonAlias("imdbRating")String avaliacao,
                        @JsonProperty("imdbVotes") String votes) {
}
