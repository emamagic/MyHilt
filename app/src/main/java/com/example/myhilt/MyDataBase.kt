package com.example.myhilt

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Provider

@Database(
    entities = [MyEntity::class], version = 1
)
abstract class MyDataBase : RoomDatabase() {

    abstract fun getMyDao(): MyDao

    class Callback @Inject constructor(
        private val myDb: MyDataBase
    ): RoomDatabase.Callback() {
        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)

            GlobalScope.launch {
                myDb.getMyDao().insertData(MyEntity("first name in callback"))
            }

        }
    }

    //  myDb.get().getMyDao().insertData(MyEntity("first name in callback"))
}