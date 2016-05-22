package io.twere.plainpure.data.model.dribbble.realm;

import io.realm.RealmModel;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;
import java.util.Date;

@RealmClass public class LikeRealm implements RealmModel {

  @PrimaryKey  private long id;

  private Date createdAt;

  private UserRealm user;

  private ShotRealm shot;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public UserRealm getUser() {
    return user;
  }

  public void setUser(UserRealm user) {
    this.user = user;
  }

  public ShotRealm getShot() {
    return shot;
  }

  public void setShot(ShotRealm shot) {
    this.shot = shot;
  }
}
