package io.twere.plainpure.data.local.like

import io.twere.plainpure.data.local.shot.ShotRealm
import io.twere.plainpure.data.local.user.UserRealm
import io.realm.RealmModel
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass
import java.util.Date

@RealmClass
open class LikeRealm : RealmModel {

  @PrimaryKey
 open var id: Long = 0
 open var createdAt: Date? = null
 open var user: UserRealm? = null
 open var shot: ShotRealm? = null

}