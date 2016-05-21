package io.twere.plainpure.data.api.dribbble;

import io.twere.plainpure.mvp.model.dribbble.Attachment;
import io.twere.plainpure.mvp.model.dribbble.Bucket;
import io.twere.plainpure.mvp.model.dribbble.Comment;
import io.twere.plainpure.mvp.model.dribbble.Like;
import io.twere.plainpure.mvp.model.dribbble.Project;
import io.twere.plainpure.mvp.model.dribbble.Rebound;
import io.twere.plainpure.mvp.model.dribbble.Shot;
import java.util.List;
import java.util.Map;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;

public interface DribbbleShotsService {

  @GET("shots") Observable<List<Shot>> fetchShots(@Query("page") int page);

  @GET("shots") Observable<List<Shot>> fetchShots(@Query("page") int page,
      @Query("per_page") int perPage);

  @GET("shots") Observable<List<Shot>> fetchShots(@Query("page") int page,
      @Query("per_page") int perPage, @Query("list") String list, @Query("sort") String sort);

  @GET("shots") Observable<List<Shot>> fetchShots(@Query("page") int page,
      @Query("per_page") int perPage, @Query("list") String list, @Query("sort") String sort,
      @Query("date") String date, @Query("timeframe") String timeframe);

  @GET("shots") Observable<List<Shot>> fetchShots(@Query("page") int page,
      @Query("list") String list, @Query("sort") String sort, @Query("date") String date,
      @Query("timeframe") String timeframe);

  @GET("shots") Observable<List<Shot>> fetchShots(@Query("list") String list);

  @GET("shots") Observable<List<Shot>> fetchShotsWithToken(
      @Query("access_token") String accessToken);

  @GET("shots") Observable<List<Shot>> fetchShots(@QueryMap Map<String, Object> parameters);

  @GET("shots") Observable<List<Shot>> fetchSortedShots(@Query("sort") String sort);

  @GET("shots/{id}") Observable<Shot> getShot(@Path("id") long shotId);

  @Multipart @POST("shots") Observable<Void> createShot(@Part("title") String title,
      @Part("image") RequestBody image, @Part("description") String description,
      @Part("tags") String[] tags, @Part("team_id") int teamId,
      @Part("rebound_source_id") int reboundSourceId);

  @Multipart @POST("shots") Observable<Void> createShot(@Part("title") String title,
      @Part("image") RequestBody image, @Part("description") String description,
      @Part("tags") String[] tags);

  @Multipart @POST("shots") Observable<Void> createShot(@Part("title") String title,
      @Part("image") RequestBody image);

  @Multipart @POST("shots") Observable<Void> createShot(@PartMap Map<String, Object> partMap);

  @Multipart @PUT("shots/{id}") Observable<Shot> updateShot(@Path("id") long shotId,
      @Part("title") String title, @Part("description") String description,
      @Part("team_id") int teamId, @Part("tags") String[] tags);

  @Multipart @PUT("shots/{id}") Observable<Shot> updateShot(@Path("id") long shotId,
      @Part("title") String title, @Part("description") String description,
      @Part("tags") String[] tags);

  @Multipart @PUT("shots/{id}") Observable<Shot> updateShot(@Path("id") long shotId,
      @Part("description") String description);

  @DELETE("shots/{id}") Observable<Void> deleteShot(@Path("id") long shotId);

  @GET("shots/{id}/attachments") Observable<List<Attachment>> getShotAttachments(
      @Path("id") long shotId);

  @POST("shots/{shot}/attachments") Observable<Void> createShotAttachment(@Path("shot") long shotId,
      @Part("file") RequestBody file);

  @GET("shots/{shot}/attachments/{id}") Observable<Attachment> getShotAttachment(
      @Path("shot") long shotId, @Path("id") long attachmentId);

  @DELETE("shots/{shot}/attachments/{id}") Observable<Void> deleteShotAttachment(
      @Path("shot") long shotId, @Path("id") long attachmentId);

  @GET("shots/{id}/buckets") Observable<List<Bucket>> getShotBuckets(@Path("id") long shotId);

  @GET("shots/{shot}/comments") Observable<List<Comment>> getShotComments(
      @Path("shot") long shotId);

  @GET("shots/{shot}/comments/{id}/likes") Observable<List<Like>> getCommentLikes(
      @Path("shot") long shotId, @Path("id") long commentId);

  @POST("shots/{shot}/comments") Observable<Comment> createComment(@Path("shot") long shotId,
      @Body Comment body);

  @GET("shots/{shot}/comments/{id}") Observable<Comment> getShotComment(@Path("shot") long shotId,
      @Path("id") long commentId);

  @PUT("shots/{shot}/comments/{id}") Observable<Comment> updateShotComment(
      @Path("shot") long shotId, @Path("id") long commentId, @Body Comment comment);

  @DELETE("shots/{shot}/comments/{id}") Observable<Void> deleteShotComment(
      @Path("shot") long shotId, @Path("id") long commentId);

  @GET("shots/{shot}/comments/{id}/like") Observable<Like> checkIsLikedShotComment(
      @Path("shot") long shotId, @Path("id") long commentId);

  @POST("shots/{shot}/comments/{id}/like") Observable<Like> likeShotComment(
      @Path("shot") long shotId, @Path("id") long commentId);

  @DELETE("shots/{shot}/comments/{id}/like") Observable<Void> unlikeShotComment(
      @Path("shot") long shotId, @Path("id") long commentId);

  @GET("shots/{id}/likes") Observable<List<Like>> getShotLikes(@Path("id") long shotId);

  @GET("shots/{id}/like") Observable<Like> checkShotIsLiked(@Path("id") long shotId);

  @POST("shots/{id}/like") Observable<Like> likeShot(@Path("id") long shotId);

  @DELETE("shots/{id}/like") Observable<Void> unlikeShot(@Path("id") long shotId);

  @GET("shots/{id}/projects") Observable<List<Project>> getShotProjectsList(
      @Path("id") long shotId);

  @GET("shots/{id}/rebounds") Observable<List<Rebound>> getShotReboundsList(
      @Path("id") long shotId);
}
