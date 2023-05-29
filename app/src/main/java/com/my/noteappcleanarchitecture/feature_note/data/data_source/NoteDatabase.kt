package com.my.noteappcleanarchitecture.feature_note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.my.noteappcleanarchitecture.feature_note.domain.model.Note

/**
created by Mehmet E. Yıldız
 **/

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase : RoomDatabase() {
    abstract val noteDao: NoteDao
}