package pers.dog.housekeeper.db

import androidx.room.Database
import androidx.room.RoomDatabase
import pers.dog.housekeeper.db.dao.UserDao
import pers.dog.housekeeper.db.entity.UserEntity

@Database(entities = [UserEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}