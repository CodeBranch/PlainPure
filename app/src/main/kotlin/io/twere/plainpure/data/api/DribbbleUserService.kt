package io.twere.plainpure.data.api

import io.twere.plainpure.data.local.bucket.Bucket
import io.twere.plainpure.data.local.followee.Followee
import io.twere.plainpure.data.local.follower.Follower
import io.twere.plainpure.data.local.like.Like
import io.twere.plainpure.data.local.project.Project
import io.twere.plainpure.data.local.shot.Shot
import io.twere.plainpure.data.local.team.Team
import io.twere.plainpure.data.local.user.User
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query
import rx.Observable

interface DribbbleUserService {

  @GET("users/{user}")
  fun getSingleUser(
      @Path("user") userId: Long): Observable<User>

  @GET("user")
  fun fetchAuthenticatedUser(): Observable<User>

  @GET("users/{user}/buckets")
  fun getUsersBuckets(
      @Path("user") userId: Long): Observable<List<Bucket>>

  @GET("user/buckets")
  fun getAuthenticatedUsersBuckets(): Observable<List<Bucket>>

  @GET("users/{user}/followers")
  fun getUsersFollowers(
      @Path("user") userId: Long,
      @Query("page") page: Int,
      @Query("per_page") perPage: Int): Observable<List<Follower>>

  @GET("user/followers")
  fun getAuthenticatedUsersFollowers(
      @Query("page") page: Int,
      @Query("per_page") perPage: Int): Observable<List<Follower>>

  @GET("users/{user}/following")
  fun getFollowingByUser(
      @Path("user") userId: Long): Observable<List<Followee>>

  @GET("users/{user}/following")
  fun getFollowingByUser(
      @Path("user") userId: Long,
      @Query("page") page: Int,
      @Query("per_page") perPage: Int): Observable<List<Followee>>

  @GET("user/following")
  fun getFollowingByCurrentUser(): Observable<List<Followee>>

  @GET("user/following/shots")
  fun shotsForUserFollowedByUser(): Observable<List<Shot>>

  @GET("user/following/{user}")
  fun checkUserIsFollowed(
      @Path("user") userId: Long): Observable<Void>

  @GET("users/{user}/following/{target_user}")
  fun checkUserIsFollowingAnother(
      @Path("user") userId: Long,
      @Path("target_user") targetUserId: Long): Observable<Void>

  @PUT("users/{id}/follow")
  fun followUser(
      @Path("user") userId: Long): Observable<Void>

  @DELETE("users/{id}/follow")
  fun unfollowUser(
      @Path("user") userId: Long): Observable<Void>

  @GET("users/{user}/likes")
  fun getUsersLikes(
      @Path("user") userId: Long): Observable<List<Like>>

  @GET("users/{user}/likes")
  fun getUsersLikes(
      @Path("user") userId: Long,
      @Query("page") page: Int,
      @Query("per_page") perPage: Int): Observable<List<Like>>

  @GET("user/likes")
  fun getAuthenticatedUsersLikes(): Observable<List<Like>>

  @GET("users/{user}/projects")
  fun getUsersProjects(
      @Path("user") userId: Long): Observable<List<Like>>

  @GET("user/projects")
  fun getAuthenticatedUsersProjects(): Observable<List<Project>>

  @GET("users/{user}/shots")
  fun getUsersShots(
      @Path("user") userId: Long): Observable<List<Shot>>

  @GET("users/{user}/shots")
  fun getUsersShots(
      @Path("user") userId: Long,
      @Query("page") page: Int,
      @Query("per_page") perPage: Int): Observable<List<Shot>>

  @GET("user/shots")
  fun getAuthenticatedUsersShots(
      @Query("page") page: Int,
      @Query("per_page") perPage: Int): Observable<List<Shot>>

  @GET("users/{user}/teams")
  fun getUsersTeams(
      @Query("page") page: Int): Observable<List<Team>>

  @GET("user/teams")
  fun getAuthenticatedUsersTeams(
      @Query("page") page: Int): Observable<List<Team>>

}