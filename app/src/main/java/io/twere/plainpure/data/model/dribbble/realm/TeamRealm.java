package io.twere.plainpure.data.model.dribbble.realm;

import io.realm.RealmModel;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;

@RealmClass public class TeamRealm implements RealmModel {

  @PrimaryKey private long id;

  private String name;

  private String userName;

  private String htmlUrl;

  private String avatarUrl;

  private String bio;

  private String location;

  private long bucketsCount;

  private long commentsReceivedCount;

  private long followersCount;

  private long followingsCount;

  private long likesCount;

  private long likesReceivedCount;

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

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getHtmlUrl() {
    return htmlUrl;
  }

  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }

  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public long getBucketsCount() {
    return bucketsCount;
  }

  public void setBucketsCount(long bucketsCount) {
    this.bucketsCount = bucketsCount;
  }

  public long getCommentsReceivedCount() {
    return commentsReceivedCount;
  }

  public void setCommentsReceivedCount(long commentsReceivedCount) {
    this.commentsReceivedCount = commentsReceivedCount;
  }

  public long getFollowersCount() {
    return followersCount;
  }

  public void setFollowersCount(long followersCount) {
    this.followersCount = followersCount;
  }

  public long getFollowingsCount() {
    return followingsCount;
  }

  public void setFollowingsCount(long followingsCount) {
    this.followingsCount = followingsCount;
  }

  public long getLikesCount() {
    return likesCount;
  }

  public void setLikesCount(long likesCount) {
    this.likesCount = likesCount;
  }

  public long getLikesReceivedCount() {
    return likesReceivedCount;
  }

  public void setLikesReceivedCount(long likesReceivedCount) {
    this.likesReceivedCount = likesReceivedCount;
  }
}