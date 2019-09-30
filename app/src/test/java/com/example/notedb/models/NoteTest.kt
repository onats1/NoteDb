package com.example.notedb.models


import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.lang.Exception

class NoteTest {

    private val TIMESTAMP_1 = "09-2019"
    private val TIMESTAMP_2 = "18-2019"

    @Test
    @Throws(Exception::class)
    internal fun isNotesEqual_identicalProperties_returnTrue(){
        val note1 = Note(id = 1, title = "Note1", content = "This is first note", timeStamp = TIMESTAMP_1)
        val note2 = Note(id = 1, title = "Note1", content = "This is first note", timeStamp = TIMESTAMP_2)

        assertEquals(note1, note2)
        println("Notes are equal")
    }

    @Test
    @Throws(Exception::class)
    internal fun isNotesEqual_differentProperties_returnFalse() {
        val note1 = Note(id = 1, title = "Note1", content = "This is first note", timeStamp = TIMESTAMP_1)
        val note2 = Note(id = 2, title = "Note1", content = "This is first note", timeStamp = TIMESTAMP_2)

        assertNotEquals(note1, note2)
        println("Notes are not equal")
    }

    @Test
    @Throws(Exception::class)
    internal fun isNotesEqual_differentTimeStamps_returnTrue() {
        val note1 = Note(id = 1, title = "Note1", content = "This is first note", timeStamp = TIMESTAMP_1)
        val note2 = Note(id = 1, title = "Note1", content = "This is first note", timeStamp = TIMESTAMP_2)

        assertEquals(note1, note2)
        println("Notes are equal")
    }

    @Test
    @Throws(Exception::class)
    internal fun isNotesEqual_differentTitle_returnFalse() {
        val note1 = Note(id = 1, title = "Note2", content = "This is first note", timeStamp = TIMESTAMP_1)
        val note2 = Note(id = 1, title = "Note1", content = "This is first note", timeStamp = TIMESTAMP_2)

        assertNotEquals(note1, note2)
        println("Notes are not equal. They have different titles.")
    }

    @Test
    @Throws(Exception::class)
    internal fun isNotesEqual_differentContent_returnFalse() {
        val note1 = Note(id = 1, title = "Note1", content = "This is first note", timeStamp = TIMESTAMP_1)
        val note2 = Note(id = 1, title = "Note1", content = "This is second note", timeStamp = TIMESTAMP_2)

        assertNotEquals(note1, note2)
        println("Notes are not equal. They have different content.")
    }
}