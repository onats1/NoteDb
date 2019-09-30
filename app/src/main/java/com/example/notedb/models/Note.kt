package com.example.notedb.models

import android.os.Parcel
import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class Note(
    @PrimaryKey(autoGenerate = true)
    var id: Int,

    @NonNull
    @ColumnInfo(name = "title")
    var title: String?,

    @ColumnInfo(name = "content")
    var content: String?,

    @ColumnInfo(name = "timestamp")
    var timeStamp: String?
) : Parcelable{

    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    )

    override fun describeContents(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun toString(): String {
        return "Note(id=$id, title='$title', content='$content', timeStamp='$timeStamp')"
    }

    override fun equals(other: Any?): Boolean {

        other?.let {
            if(javaClass != other.javaClass){
                return false
            }
        }

        other as Note

        return other.id == id && other.title == title && other.content == content
    }

    companion object CREATOR : Parcelable.Creator<Note> {
        override fun createFromParcel(parcel: Parcel): Note {
            return Note(parcel)
        }

        override fun newArray(size: Int): Array<Note?> {
            return arrayOfNulls(size)
        }
    }
}