package com.prokarma.bustest.repo.remote;

import com.prokarma.bustest.model.PlayerResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NBAService {
    @GET("/api/v1/players")
    Observable<PlayerResponse> getPlayers(@Query("per_page") int perPage);

}
