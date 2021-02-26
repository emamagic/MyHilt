package com.example.myhilt

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Provides
    fun provideDataBase(@ApplicationContext context: Context ,callback: MyDataBase.Callback): MyDataBase {
        return Room.databaseBuilder(context,MyDataBase::class.java,"DATABASE_NAME")
            .fallbackToDestructiveMigration()
            .addCallback(callback)
            .build()
    }

    @Singleton
    @Provides
    fun provideDao(myDataBase: MyDataBase): MyDao {
        return myDataBase.getMyDao()
    }

}