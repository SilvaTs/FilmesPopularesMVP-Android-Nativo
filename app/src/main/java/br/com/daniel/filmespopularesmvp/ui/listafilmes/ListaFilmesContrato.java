package br.com.daniel.filmespopularesmvp.ui.listafilmes;

import java.util.List;
import br.com.daniel.filmespopularesmvp.data.model.Filme;

public interface ListaFilmesContrato {

    interface ListaFilmesView {

        void mostraFilmes(List<Filme> filmes);

        void mostraErro();
    }

    interface ListaFilmesPresenter {

        void obtemFilmes();

        void destruirView();
    }
}
