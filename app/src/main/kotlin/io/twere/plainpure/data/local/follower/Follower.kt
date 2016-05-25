package io.twere.plainpure.data.local.follower

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.twere.plainpure.data.local.user.User
import java.util.Date

data class Follower(
    @SerializedName("id") @Expose var id: Long,
    @SerializedName("created_at") @Expose var createdAt: Date,
    @SerializedName("follower") @Expose var follower: User) {
}