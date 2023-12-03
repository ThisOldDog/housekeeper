package pers.dog.housekeeper.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.Room
import pers.dog.housekeeper.db.AppDatabase
import pers.dog.housekeeper.db.entity.UserEntity

class MyViewModel(application: Application) : AndroidViewModel(application) {
    private val db =
        Room.databaseBuilder(application, AppDatabase::class.java, "housekeeper").build()

    private val userDao = db.userDao()

    private val _my by lazy { userDao.getPrimary() }
    val my: LiveData<UserEntity> = _my
}