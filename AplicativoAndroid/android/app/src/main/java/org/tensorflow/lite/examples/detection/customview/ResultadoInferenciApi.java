package org.tensorflow.lite.examples.detection.customview;
import java.util.ArrayList;
import retrofit2.http.Path;

import model.Senales;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ResultadoInferenciApi {
    @GET("senales")
    Call<ArrayList<Senales>> getSenales();

    @GET("senales/{codigo}")
    Call<Senales> getSenales(@Path("codigo") String codigo);


}
