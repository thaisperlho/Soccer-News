package me.dio.soccernews.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import me.dio.soccernews.domain.News;

@Database(entities = {News.class}, version = 1, exportSchema = false)
public abstract class SoccerNewsDb extends RoomDatabase {
    public abstract NewsDao newsDao();
}