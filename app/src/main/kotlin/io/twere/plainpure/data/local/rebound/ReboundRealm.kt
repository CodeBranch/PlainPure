package io.twere.plainpure.data.local.rebound

import io.twere.plainpure.data.local.team.TeamRealm
import io.twere.plainpure.data.local.user.UserRealm
import io.realm.RealmModel
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass
import io.twere.plainpure.data.local.images.ImagesRealm
import java.util.Date

@RealmClass
open class ReboundRealm : RealmModel {

  @PrimaryKey
  open var id: Long = 0
  open var title: String = ""
  open var description: String = ""
  open var width: Int = 0
  open var height: Int = 0
  open var images: ImagesRealm? = null
  open var viewsCount: Int = 0
  open var likesCount: Int = 0
  open var commentsCount: Int = 0
  open var attachmentsCount: Int = 0
  open var reboundsCount: Int = 0
  open var bucketsCount: Int = 0
  open var createdAt: Date? = null
  open var updatedAt: Date? = null
  open var htmlUrl: String = ""
  open var attachmentsUrl: String = ""
  open var commentsUrl: String = ""
  open var likesUrl: String = ""
  open var projectsUrl: String = ""
  open var reboundsUrl: String = ""
  open var reboundSourceUrl: String = ""
  //open var tags: Array<Int>? = null
  open var user: UserRealm? = null
  open var team: TeamRealm? = null

}