package com.shadow.vocabuler.feature_dictionary.data.remote.dto

import com.shadow.vocabuler.feature_dictionary.data.local.entity.WordInfoEntity
import com.shadow.vocabuler.feature_dictionary.domain.model.WordInfo

data class WordInfoDto(
    val license: LicenseDto,
    val meanings: List<MeaningDto>,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val sourceUrls: List<String>,
    val word: String
) {
    fun toWordInfoEntity(): WordInfoEntity {
        return WordInfoEntity(
            meanings = meanings.map { it.toMeaning() },
            phonetic = phonetic,
            word = word
        )
    }
}