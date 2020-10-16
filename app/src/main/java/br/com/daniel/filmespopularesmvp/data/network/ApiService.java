package br.com.daniel.filmespopularesmvp.data.network;

import br.com.daniel.filmespopularesmvp.data.network.response.FilmesResult;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class ApiService {

    private static FilmesService INSTANCE;

    public static FilmesService getInstance() {
        if (INSTANCE == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.themoviedb.org/3/")
                    .addConverterFactory(MoshiConverterFactory.create())
                    .build();

            INSTANCE = retrofit.create(FilmesService.class);
        }

        return INSTANCE;
    }

    public static interface FilmesService {

        @GET("movie/popular")
        Call<FilmesResult> obterFilmesPopulares(@Query("api_key") String chaveApi);
    }
}
