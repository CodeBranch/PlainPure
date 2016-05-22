package io.twere.plainpure.data.model.dribbble.realm;

import io.realm.RealmModel;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;
import java.util.Date;

@RealmClass public class ShotRealm implements RealmModel {

  @PrimaryKey private long id;

  private String title;

  private String description;

  private int width;

  private int height;

  private ImagesRealm images;

  private long viewsCount;

  private long likesCount;

  private long commentsCount;

  private long attachmentsCount;

  private long reboundsCount;

  private long bucketsCount;

  private Date createdAt;

  private Date updatedAt;

  private String htmlUrl;

  private String attachmentsUrl;

  private String bucketsUrl;

  private String commentsUrl;

  private String likesUrl;

  private String projectsUrl;

  private String reboundsUrl;

//  private RealmList tags;

  private UserRealm user;

  private TeamRealm team;

  private boolean seen;

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

  public long getViewsCount() {
    return viewsCount;
  }

  public void setViewsCount(long viewsCount) {
    this.viewsCount = viewsCount;
  }

  public long getLikesCount() {
    return likesCount;
  }

  public void setLikesCount(long likesCount) {
    this.likesCount = likesCount;
  }

  public long getCommentsCount() {
    return commentsCount;
  }

  public void setCommentsCount(long commentsCount) {
    this.commentsCount = commentsCount;
  }

  public long getAttachmentsCount() {
    return attachmentsCount;
  }

  public void setAttachmentsCount(long attachmentsCount) {
    this.attachmentsCount = attachmentsCount;
  }

  public long getReboundsCount() {
    return reboundsCount;
  }

  public void setReboundsCount(long reboundsCount) {
    this.reboundsCount = reboundsCount;
  }

  public long getBucketsCount() {
    return bucketsCount;
  }

  public void setBucketsCount(long bucketsCount) {
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

  public String getBucketsUrl() {
    return bucketsUrl;
  }

  public void setBucketsUrl(String bucketsUrl) {
    this.bucketsUrl = bucketsUrl;
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

  public boolean isSeen() {
    return seen;
  }

  public void setSeen(boolean seen) {
    this.seen = seen;
  }
}
