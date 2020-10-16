package br.com.daniel.filmespopularesmvp.data.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.daniel.filmespopularesmvp.data.model.Filme;
import br.com.daniel.filmespopularesmvp.data.network.response.response.FilmeResponse;
public class FilmeMapper {

    public static List<Filme> deResponseParaDominio(List<FilmeResponse> listaFilmeResponse) {
        List<Filme> listaFilmes = new ArrayList<>();

        for (FilmeResponse filmeResponse : listaFilmeResponse) {
            final Filme filme = new Filme(filmeResponse.getTituloOriginal(), filmeResponse.getCaminhoPoster());
            listaFilmes.add(filme);
        }

        return listaFilmes;
    }
}
