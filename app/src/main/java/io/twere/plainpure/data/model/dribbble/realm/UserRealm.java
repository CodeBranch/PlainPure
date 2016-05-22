package io.twere.plainpure.data.model.dribbble.realm;

import io.realm.RealmModel;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;
import java.util.Date;

@RealmClass public class UserRealm implements RealmModel {

  @PrimaryKey private long id;

  private String name;

  private String userName;

  private String htmlUrl;

  private String avatarUrl;

  private String bio;

  private String location;

  //private Map<String, String> links;

  private long bucketsCount;

  private long commentsReceivedCount;

  private long followersCount;

  private long followingCount;

  private long likesCount;

  private long likesReceivedCount;

  private long projectsCount;

  private long reboundsReceivedCount;

  private long shotsCount;

  private long teamsCount;

  private boolean canUploadShot;

  private String type;

  private boolean pro;

  private String bucketsUrl;

  private String followersUrl;

  private String followingUrl;

  private String likesUrl;

  private String shotsUrl;

  private String teamsUrl;

  private Date createdAt;

  private Date updatedAt;

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

  public long getFollowingCount() {
    return followingCount;
  }

  public void setFollowingCount(long followingCount) {
    this.followingCount = followingCount;
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

  public long getProjectsCount() {
    return projectsCount;
  }

  public void setProjectsCount(long projectsCount) {
    this.projectsCount = projectsCount;
  }

  public long getReboundsReceivedCount() {
    return reboundsReceivedCount;
  }

  public void setReboundsReceivedCount(long reboundsReceivedCount) {
    this.reboundsReceivedCount = reboundsReceivedCount;
  }

  public long getShotsCount() {
    return shotsCount;
  }

  public void setShotsCount(long shotsCount) {
    this.shotsCount = shotsCount;
  }

  public long getTeamsCount() {
    return teamsCount;
  }

  public void setTeamsCount(long teamsCount) {
    this.teamsCount = teamsCount;
  }

  public boolean isCanUploadShot() {
    return canUploadShot;
  }

  public void setCanUploadShot(boolean canUploadShot) {
    this.canUploadShot = canUploadShot;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public boolean isPro() {
    return pro;
  }

  public void setPro(boolean pro) {
    this.pro = pro;
  }

  public String getBucketsUrl() {
    return bucketsUrl;
  }

  public void setBucketsUrl(String bucketsUrl) {
    this.bucketsUrl = bucketsUrl;
  }

  public String getFollowersUrl() {
    return followersUrl;
  }

  public void setFollowersUrl(String followersUrl) {
    this.followersUrl = followersUrl;
  }

  public String getFollowingUrl() {
    return followingUrl;
  }

  public void setFollowingUrl(String followingUrl) {
    this.followingUrl = followingUrl;
  }

  public String getLikesUrl() {
    return likesUrl;
  }

  public void setLikesUrl(String likesUrl) {
    this.likesUrl = likesUrl;
  }

  public String getShotsUrl() {
    return shotsUrl;
  }

  public void setShotsUrl(String shotsUrl) {
    this.shotsUrl = shotsUrl;
  }

  public String getTeamsUrl() {
    return teamsUrl;
  }

  public void setTeamsUrl(String teamsUrl) {
    this.teamsUrl = teamsUrl;
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
}