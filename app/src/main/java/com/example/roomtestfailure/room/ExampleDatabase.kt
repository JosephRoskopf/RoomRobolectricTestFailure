package com.example.roomtestfailure.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(entities = [UserEntity::class, TaskEntity::class], version = 2, exportSchema = true)
abstract class ExampleDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun taskDao(): TaskDao

    companion object {
        val MIGRATION_1_2: Migration = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                // Create the new table
                database.execSQL(
                    "CREATE TABLE task_events (id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                            "firstIndexId TEXT NOT NULL, " +
                            "secondIndexId TEXT NOT NULL " +
                            ")"
                )
            }
        }
    }
}