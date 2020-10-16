package br.com.daniel.filmespopularesmvp.data.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import br.com.daniel.filmespopularesmvp.data.network.response.response.FilmesResult;
public interface FilmesService {

    @GET("movie/popular")
    Call<FilmesResult> obterFilmesPopulares(@Query("api_key") String chaveApi);
}
