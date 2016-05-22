package io.twere.plainpure.data.model.dribbble.realm;

import io.realm.RealmModel;
import io.realm.annotations.RealmClass;

@RealmClass public class ImagesRealm implements RealmModel {

  private String hidpi;

  private String normal;

  private String teaser;

  public String getHidpi() {
    return hidpi;
  }

  public void setHidpi(String hidpi) {
    this.hidpi = hidpi;
  }

  public String getNormal() {
    return normal;
  }

  public void setNormal(String normal) {
    this.normal = normal;
  }

  public String getTeaser() {
    return teaser;
  }

  public void setTeaser(String teaser) {
    this.teaser = teaser;
  }
}
