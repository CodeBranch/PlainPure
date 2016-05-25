package io.twere.plainpure.data.api

import io.twere.plainpure.data.local.project.Project
import io.twere.plainpure.data.local.shot.Shot
import retrofit2.http.GET
import retrofit2.http.Path
import rx.Observable

interface DribbbleProjectsService {

  @GET("projects/{id}")
  fun getProject(
      @Path("id") projectId: Long): Observable<Project>

  @GET("projects/{id}/shots")
  fun getShotsForProject(
      @Path("id") projectId: Long): Observable<List<Shot>>

}