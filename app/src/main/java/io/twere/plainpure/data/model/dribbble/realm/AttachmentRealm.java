package io.twere.plainpure.data.model.dribbble.realm;

import io.realm.RealmModel;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.RealmClass;
import java.util.Date;

@RealmClass public class AttachmentRealm implements RealmModel {

  @PrimaryKey private long id;

  private String url;

  private String thumbnailUrl;

  private long size;

  private String contentType;

  private int viewsCount;

  private Date createdAt;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getThumbnailUrl() {
    return thumbnailUrl;
  }

  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }

  public long getSize() {
    return size;
  }

  public void setSize(long size) {
    this.size = size;
  }

  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public int getViewsCount() {
    return viewsCount;
  }

  public void setViewsCount(int viewsCount) {
    this.viewsCount = viewsCount;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }
}