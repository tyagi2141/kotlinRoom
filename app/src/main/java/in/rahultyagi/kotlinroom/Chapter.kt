package `in`.rahultyagi.kotlinroom

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "MindOrksDb")
data class Chapter(
    @PrimaryKey
    @ColumnInfo @SerializedName("chapterName") val chapterName: String
)