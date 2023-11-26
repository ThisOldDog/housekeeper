package pers.dog.housekeeper.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "md_user")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val gender: Gender,
    val primary: Boolean
)

enum class Gender {
    MALE,
    FEMALE
}