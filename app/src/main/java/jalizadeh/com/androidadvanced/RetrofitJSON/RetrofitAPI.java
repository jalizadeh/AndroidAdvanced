package jalizadeh.com.androidadvanced.RetrofitJSON;

import jalizadeh.com.androidadvanced.RetrofitJSON.Model.Feed;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;


/**
 * reddit user
 * user: jsonretrofit
 * pass: zade@amadamus.com
 *
 * https://www.reddit.com/api/login/jsonretrofit?user=jsonretrofit&passwd=zade@amadamus.com&api_type=json
 *
 */
public interface RetrofitAPI {
    final String BASE_URL = "https://www.reddit.com/";

    @Headers("Content-Type: application/json")
    @GET(".json")
    Call<Feed> getData();
}
