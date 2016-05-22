package io.twere.plainpure.data.model.dribbble.realm;

import io.realm.RealmModel;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;
import java.util.Date;

@RealmClass public class ReboundRealm implements RealmModel {

  @PrimaryKey private long id;

  private String title;

  private String description;

  private int width;

  private int height;

  private ImagesRealm images;

  private int viewsCount;

  private int likesCount;

  private int commentsCount;

  private int attachmentsCount;

  private int reboundsCount;

  private int bucketsCount;

  private Date createdAt;

  private Date updatedAt;

  private String htmlUrl;

  private String attachmentsUrl;

  private String commentsUrl;

  private String likesUrl;

  private String projectsUrl;

  private String reboundsUrl;

  private String reboundSourceUrl;

 // private RealmList tags;

  private UserRealm user;

  private TeamRealm team;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public ImagesRealm getImages() {
    return images;
  }

  public void setImages(ImagesRealm images) {
    this.images = images;
  }

  public int getViewsCount() {
    return viewsCount;
  }

  public void setViewsCount(int viewsCount) {
    this.viewsCount = viewsCount;
  }

  public int getLikesCount() {
    return likesCount;
  }

  public void setLikesCount(int likesCount) {
    this.likesCount = likesCount;
  }

  public int getCommentsCount() {
    return commentsCount;
  }

  public void setCommentsCount(int commentsCount) {
    this.commentsCount = commentsCount;
  }

  public int getAttachmentsCount() {
    return attachmentsCount;
  }

  public void setAttachmentsCount(int attachmentsCount) {
    this.attachmentsCount = attachmentsCount;
  }

  public int getReboundsCount() {
    return reboundsCount;
  }

  public void setReboundsCount(int reboundsCount) {
    this.reboundsCount = reboundsCount;
  }

  public int getBucketsCount() {
    return bucketsCount;
  }

  public void setBucketsCount(int bucketsCount) {
    this.bucketsCount = bucketsCount;
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

  public String getHtmlUrl() {
    return htmlUrl;
  }

  public void setHtmlUrl(String htmlUrl) {
    this.htmlUrl = htmlUrl;
  }

  public String getAttachmentsUrl() {
    return attachmentsUrl;
  }

  public void setAttachmentsUrl(String attachmentsUrl) {
    this.attachmentsUrl = attachmentsUrl;
  }

  public String getCommentsUrl() {
    return commentsUrl;
  }

  public void setCommentsUrl(String commentsUrl) {
    this.commentsUrl = commentsUrl;
  }

  public String getLikesUrl() {
    return likesUrl;
  }

  public void setLikesUrl(String likesUrl) {
    this.likesUrl = likesUrl;
  }

  public String getProjectsUrl() {
    return projectsUrl;
  }

  public void setProjectsUrl(String projectsUrl) {
    this.projectsUrl = projectsUrl;
  }

  public String getReboundsUrl() {
    return reboundsUrl;
  }

  public void setReboundsUrl(String reboundsUrl) {
    this.reboundsUrl = reboundsUrl;
  }

  public String getReboundSourceUrl() {
    return reboundSourceUrl;
  }

  public void setReboundSourceUrl(String reboundSourceUrl) {
    this.reboundSourceUrl = reboundSourceUrl;
  }


  public UserRealm getUser() {
    return user;
  }

  public void setUser(UserRealm user) {
    this.user = user;
  }

  public TeamRealm getTeam() {
    return team;
  }

  public void setTeam(TeamRealm team) {
    this.team = team;
  }
}