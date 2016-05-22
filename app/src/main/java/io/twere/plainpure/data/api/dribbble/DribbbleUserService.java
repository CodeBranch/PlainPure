package io.twere.plainpure.data.api.dribbble;

import io.twere.plainpure.data.model.dribbble.Bucket;
import io.twere.plainpure.data.model.dribbble.Followee;
import io.twere.plainpure.data.model.dribbble.Follower;
import io.twere.plainpure.data.model.dribbble.Like;
import io.twere.plainpure.data.model.dribbble.Project;
import io.twere.plainpure.data.model.dribbble.Shot;
import io.twere.plainpure.data.model.dribbble.Team;
import io.twere.plainpure.data.model.dribbble.User;
import java.util.List;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface DribbbleUserService {

  @GET("users/{user}") Observable<User> getSingleUser(@Path("user") long userId);

  @GET("user") Observable<User> fetchAuthenticatedUser();

  @GET("users/{user}/buckets") Observable<List<Bucket>> getUsersBuckets(@Path("user") long userId);

  @GET("user/buckets") Observable<List<Bucket>> getAuthenticatedUsersBuckets();

  @GET("users/{user}/followers") Observable<List<Follower>> getUsersFollowers(
      @Path("user") long userId, @Query("page") int page, @Query("per_page") int perPage);

  @GET("user/followers") Observable<List<Follower>> getAuthenticatedUsersFollowers(
      @Query("page") int page, @Query("per_page") int perPage);

  @GET("users/{user}/following") Observable<List<Followee>> getFollowingByUser(
      @Path("user") long userId);

  @GET("users/{user}/following") Observable<List<Followee>> getFollowingByUser(
      @Path("user") long userId, @Query("page") int page, @Query("per_page") int perPage);

  @GET("user/following") Observable<List<Followee>> getFollowingByCurrentUser();

  @GET("user/following/shots") Observable<List<Shot>> shotsForUserFollowedByUser();

  @GET("user/following/{user}") Observable<Void> checkUserIsFollowed(@Path("user") long userId);

  @GET("users/{user}/following/{target_user}") Observable<Void> checkUserIsFollowingAnother(
      @Path("user") long userId, @Path("target_user") long targetUserId);

  @PUT("users/{id}/follow") Observable<Void> followUser(@Path("id") long userId);

  @DELETE("users/{id}/follow") Observable<Void> unfollowUser(@Path("id") long userId);

  @GET("users/{user}/likes") Observable<List<Like>> getUsersLikes(@Path("user") long userId);

  @GET("users/{user}/likes") Observable<List<Like>> getUsersLikes(@Path("user") long userId,
      @Query("page") int page, @Query("per_page") int perPage);

  @GET("user/likes") Observable<List<Like>> getAuthenticatedUsersLikes();

  @GET("users/{user}/projects") Observable<List<Project>> getUsersProjects(
      @Path("user") long userId);

  @GET("user/projects") Observable<List<Project>> getAuthenticatedUsersProjects();

  @GET("users/{user}/shots") Observable<List<Shot>> getUsersShots(@Path("user") long userId);

  @GET("users/{user}/shots") Observable<List<Shot>> getUsersShots(@Path("user") long userId,
      @Query("page") int page, @Query("per_page") int perPage);

  @GET("user/shots") Observable<List<Shot>> getAuthenticatedUsersShots(@Query("page") int page,
      @Query("per_page") int perPage);

  @GET("users/{user}/teams") Observable<List<Team>> getUsersTeams(@Path("user") long userId);

  @GET("user/teams") Observable<List<Team>> getAuthenticatedUsersTeams(@Query("page") int page);
}
