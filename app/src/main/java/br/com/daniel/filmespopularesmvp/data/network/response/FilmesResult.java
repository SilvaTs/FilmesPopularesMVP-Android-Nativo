package br.com.daniel.filmespopularesmvp.data.network.response.response;

import com.squareup.moshi.Json;

import java.util.List;

public class FilmesResult {

    @Json(name = "results")
    private final List<FilmeResponse> resultadoFilmes;

    public FilmesResult(List<FilmeResponse> resultadoFilmes) {
        this.resultadoFilmes = resultadoFilmes;
    }

    public List<br.com.daniel.filmespopularesmvp.data.network.response.response.FilmeResponse> getResultadoFilmes() {
        return resultadoFilmes;
    }
}
