package com.my.noteappcleanarchitecture.feature_note.domain.use_case

import com.my.noteappcleanarchitecture.feature_note.domain.model.Note
import com.my.noteappcleanarchitecture.feature_note.domain.repository.NoteRepository

/**
created by Mehmet E. Yıldız
 **/
class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}