package io.twere.plainpure.data.model.dribbble;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

public class Follower implements Serializable {

  @SerializedName("id") private long id;

  @SerializedName("created_at") private Date createdAt;

  @SerializedName("follower") private User user;

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
}
