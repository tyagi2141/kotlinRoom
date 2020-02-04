package `in`.rahultyagi.kotlinroom

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ChapterDao {
    @Insert
    fun insert(chapter: Chapter)
    @Query("SELECT * FROM MindOrksDb ORDER BY chapterName ASC")
    fun getAllChapter(): List<Chapter>
}