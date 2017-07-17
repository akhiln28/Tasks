package com.example.akhil.tasks.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by akhil on 17-07-2017.
 */

public class TasksDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "tasks";
    private static int DATABASE_VERSION = 1;
    public TasksDbHelper(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String SQL_CREATE_TASKS_TABLE = "CREATE TABLE" + TasksContract.TasksEntry.TABLE_NAME + "(" +
                TasksContract.TasksEntry._ID + "INTEGER PRIMARY KEY AUTOINCREMENT" +
                TasksContract.TasksEntry.COLUMN_TASK_TITLE + "TEXT NOT NULL" +
                TasksContract.TasksEntry.COLUMN_TASK_CONTENT + "TEXT" +
                TasksContract.TasksEntry.COLUMN_TASK_TYPE + "TEXT" +
                TasksContract.TasksEntry.COLUMN_TASK_DATE + "INTEGER" +
                TasksContract.TasksEntry.COLUMN_TASK_MONTH + "INTEGER" +
                TasksContract.TasksEntry.COLUMN_TASK_YEAR + "INTEGER" +
                TasksContract.TasksEntry.COLUMN_TASK_HOURS + "INTEGER" +
                TasksContract.TasksEntry.COLUMN_TASK_MINUTES + "INTEGER" +
                TasksContract.TasksEntry.COLUMN_TASK_SECONDS + "INTEGER" + ")";
        sqLiteDatabase.execSQL(SQL_CREATE_TASKS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
