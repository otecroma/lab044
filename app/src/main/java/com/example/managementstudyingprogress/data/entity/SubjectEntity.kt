    package com.example.managementstudyingprogress.data.entity

    import androidx.room.Entity
    import androidx.room.PrimaryKey
// стуності наші //
    @Entity(tableName = "subjects")
    data class SubjectEntity(
        @PrimaryKey(autoGenerate = true) val id: Int = 0,
        val title: String,
    )
