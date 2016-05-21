package io.twere.plainpure.mvp.model.dribbble;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

public class Like implements Serializable {

  @SerializedName("id") private long id;

  @SerializedName("created_at") private Date createdAt;

  @SerializedName("user") private User user;

  @SerializedName("shot") private Shot shot;

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Shot getShot() {
    return shot;
  }

  public void setShot(Shot shot) {
    this.shot = shot;
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
