package io.twere.plainpure.data.local.comment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.twere.plainpure.data.local.user.User
import java.util.Date

data class Comment(
    @SerializedName("id") @Expose var id: Long,
    @SerializedName("body") @Expose var body: String,
    @SerializedName("likes_count") @Expose var likesCount: Int,
    @SerializedName("likes_url") @Expose var likesUrl: String,
    @SerializedName("created_at") @Expose var createdAt: Date,
    @SerializedName("updated_at") @Expose var updatedAt: Date,
    @SerializedName("user") @Expose var user: User) {

}