package com.example.sqllite_crudoperation;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="student.db";
    public static final String TABLE_NAME="student_table";
    public static final String ID="ID";
    public static final String COL1="name";
    public static final String COL2="age";
    public static final String COL3="msg";
    public static final int DB_VERSION=1;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String query="CREATE TABLE "+TABLE_NAME+"("+ID+"INTEGER PRIMARY KEY AUTOINCREMENT,"+
                COL1 +"TEXT NOT NULL,"+
                COL2 +"TEXT NOT NULL,"+
                COL3 +"TEXT NOT NULL)";
      sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(" DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);

    }
}
