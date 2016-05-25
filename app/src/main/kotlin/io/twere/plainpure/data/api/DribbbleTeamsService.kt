package io.twere.plainpure.data.api

import io.twere.plainpure.data.local.shot.Shot
import io.twere.plainpure.data.local.user.User
import retrofit2.http.GET
import retrofit2.http.Path
import rx.Observable

interface DribbbleTeamsService {

  @GET("teams/{team}/members")
  fun getTeamMembersList(
      @Path("team") teamId: Long): Observable<List<User>>

  @GET("teams/{team}/shots")
  fun getTeamShotsList(
      @Path("team") teamId: Long): Observable<List<Shot>>

}