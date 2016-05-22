package io.twere.plainpure.data.model.dribbble.realm;

import io.realm.RealmModel;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;
import java.util.Date;

@RealmClass public class CommentRealm implements RealmModel {

  @PrimaryKey private long id;

  private String body;

  private int likesCount;

  private String likesUrl;

  private Date createdAt;

  private Date updatedAt;

  private UserRealm user;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public int getLikesCount() {
    return likesCount;
  }

  public void setLikesCount(int likesCount) {
    this.likesCount = likesCount;
  }

  public String getLikesUrl() {
    return likesUrl;
  }

  public void setLikesUrl(String likesUrl) {
    this.likesUrl = likesUrl;
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


