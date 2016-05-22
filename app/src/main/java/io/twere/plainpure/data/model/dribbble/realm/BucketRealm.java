package io.twere.plainpure.data.model.dribbble.realm;

import io.realm.RealmModel;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;
import java.util.Date;

@RealmClass public class BucketRealm implements RealmModel {

  @PrimaryKey private long id;

  private String name;

  private String description;

  private int shotsCount;

  private Date createdAt;

  private Date updatedAt;

  private UserRealm user;

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

  public UserRealm getUser() {
    return user;
  }

  public void setUser(UserRealm user) {
    this.user = user;
  }
}
