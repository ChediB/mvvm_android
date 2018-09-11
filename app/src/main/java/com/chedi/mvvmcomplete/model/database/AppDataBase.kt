package com.chedi.mvvmcomplete.model.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.chedi.mvvmcomplete.model.Post
import com.chedi.mvvmcomplete.model.PostDao

@Database(entities = arrayOf(Post::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
}