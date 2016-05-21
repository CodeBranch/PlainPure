package io.twere.plainpure.mvp.model.dribbble;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

public class Bucket implements Serializable {

  @SerializedName("id") private long id;

  @SerializedName("name") private String name;

  @SerializedName("description") private String description;

  @SerializedName("shots_count") private int shotsCount;

  @SerializedName("created_at") private Date createdAt;

  @SerializedName("updated_at") private Date updatedAt;

  @SerializedName("user") private User user;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getShotsCount() {
    return shotsCount;
  }

  public void setShotsCount(int shotsCount) {
    this.shotsCount = shotsCount;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  @Override public String toString() {
    return name;
  }
}
