package com.shadow.vocabuler.feature_dictionary.domain.repository

import com.shadow.vocabuler.core.util.Resource
import com.shadow.vocabuler.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}