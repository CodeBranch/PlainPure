package io.twere.plainpure.data.api.dribbble;

import io.twere.plainpure.mvp.model.dribbble.Shot;
import io.twere.plainpure.mvp.model.dribbble.User;
import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface DribbbleTeamsService {

    @GET("teams/{team}/members") Observable<List<User>> getTeamMembersList(@Path("team") long teamId);
    
    @GET("teams/{team}/shots")
    Observable<List<Shot>> getTeamShotsList(@Path("team") long teamId);
}
