package com.example.myhilt

import androidx.room.*

@Dao
interface MyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertData(data: MyEntity): Long

}