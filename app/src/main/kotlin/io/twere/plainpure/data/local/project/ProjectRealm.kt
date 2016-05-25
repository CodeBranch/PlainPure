package io.twere.plainpure.data.local.project

import io.twere.plainpure.data.local.user.UserRealm
import io.realm.RealmModel
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass
import java.util.Date

@RealmClass
open class ProjectRealm : RealmModel {

  @PrimaryKey
 open var id: Long = 0
 open var name: String = ""
 open var description: String = ""
 open var shotsCount: Int = 0
 open var createdAt: Date? = null
 open var updatedAt: Date? = null
 open var user: UserRealm? = null

}