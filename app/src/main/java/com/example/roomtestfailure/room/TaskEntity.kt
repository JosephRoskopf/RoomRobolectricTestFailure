package com.example.roomtestfailure.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "task_events", indices = [Index(value = ["firstIndexId", "secondIndexId"], unique = true)])
data class TaskEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,

    @ColumnInfo(name = "firstIndexId")
    val firstIndexId: String,

    @ColumnInfo(name = "secondIndexId")
    val secondIndexId: String,
)
