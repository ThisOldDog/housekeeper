package pers.dog.housekeeper.db.dao

import androidx.room.Dao
import androidx.room.Query
import pers.dog.housekeeper.db.entity.UserEntity

@Dao
interface UserDao {
    @Query("SELECT * FROM md_user WHERE `primary` = 1")
    fun getPrimary(): UserEntity
}