package com.example.akhil.tasks.data;

import android.provider.BaseColumns;

/**
 * Created by akhil on 14-07-2017.
 */

public final class TasksContract {
    private TasksContract(){};

    public static class TasksEntry implements BaseColumns{
        public static final String TABLE_NAME = "tasks";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_TASK_TITLE = "title";
        public static final String COLUMN_TASK_CONTENT = "content";
        public static final String COLUMN_TASK_DATE = "date";
        public static final String COLUMN_TASK_MONTH = "month";
        public static final String COLUMN_TASK_YEAR = "year";
        public static final String COLUMN_TASK_SECONDS = "seconds";
        public static final String COLUMN_TASK_HOURS = "hours";
        public static final String COLUMN_TASK_MINUTES = "minutes";
        public static final String COLUMN_TASK_TYPE = "type";
    }
}
