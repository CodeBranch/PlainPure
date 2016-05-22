package io.twere.plainpure.data.api.dribbble;

import io.twere.plainpure.data.model.dribbble.Bucket;
import io.twere.plainpure.data.model.dribbble.Shot;
import java.util.List;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface DribbbleBucketsService {

  @GET("buckets/{id}") Observable<Bucket> getBucket(@Path("id") long bucketId);

  @POST("buckets") Observable<Bucket> createBucket(@Body Bucket bucket);

  @PUT("buckets/{id}") Observable<Bucket> updateBucket(@Path("id") long bucketId,
      @Body Bucket bucket);

  @DELETE("buckets/{id}") Observable<Void> deleteBucket(@Path("id") long bucketId);

  @GET("buckets/{id}/shots") Observable<List<Shot>> getShotsForBucket(@Path("id") long bucketId);

  @PUT("buckets/{id}/shots") Observable<Void> addShotToBucket(@Path("id") long bucketId,
      @Query("shot_id") long shotId);

  @DELETE("buckets/{id}/shots") Observable<Void> removeShotFromBucket(@Path("id") long bucketId,
      @Query("shot_id") long shotId);
}
