package io.twere.plainpure.data.local.followee

import io.twere.plainpure.data.local.user.UserRealm
import io.realm.RealmModel
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass
import java.util.Date

@RealmClass
open class FolloweeRealm : RealmModel {

  @PrimaryKey
  open var id: Long = 0
  open var createdAt: Date? = null
  open var followee: UserRealm? = null

}