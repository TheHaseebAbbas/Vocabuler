package com.shadow.vocabuler.feature_dictionary.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.shadow.vocabuler.feature_dictionary.data.local.entity.WordInfoEntity

@Dao
interface WordInfoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWordInfos(infos: List<WordInfoEntity>)

    @Query("Delete From wordinfoentity Where word In (:words)")
    suspend fun deleteWordInfos(words: List<String>)

    @Query("Select * From wordinfoentity Where word Like '%' || :word || '%'")
    suspend fun getWordInfos(word: String): List<WordInfoEntity>
}