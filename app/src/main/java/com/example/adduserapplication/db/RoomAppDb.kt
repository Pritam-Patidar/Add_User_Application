package com.example.adduserapplication.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase as RoomDatabase


@Database(entities = [UserEntity::class], version = 1)
abstract class RoomAppDb : RoomDatabase() {
    abstract fun UserDao(): UserDao?
    abstract fun userDao()

    companion object {
        private var INSTANCE: RoomAppDb? = null

        fun getAppDatabase(context: Context): RoomAppDb {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder<RoomAppDb>(
                    context.applicationContext, RoomAppDb::class.java, name = "AppDb"
                )

                    .allowMainThreadQueries()
                    .build()
            }
            return INSTANCE as RoomAppDb
        }
    }
}