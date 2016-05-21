package io.twere.plainpure.data.api.dribbble;

import io.twere.plainpure.mvp.model.dribbble.Project;
import io.twere.plainpure.mvp.model.dribbble.Shot;
import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface DribbbleProjectsService {

  @GET("projects/{id}") Observable<Project> getProject(@Path("id") long projectId);

  @GET("projects/{id}/shots") Observable<List<Shot>> getShotsForProject(@Path("id") long projectId);
}
