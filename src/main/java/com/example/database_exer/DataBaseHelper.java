package com.example.database_exer;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {
    public static final String CUSTOMER_TABLE = "CUSTOMER_TABLE";
    public static final String CUSTOMER_NAME = "CUSTOMER_NAME";
    public static final String CUSTOMER_AGE = "CUSTOMER_AGE";
    public static final String COLUMN_ID = "ID";
    //constructor is a must because of the parent class. refer to SQLiteOpenHelper documentation


    public DataBaseHelper(@Nullable Context context) {
        super(context, "exercise.db", null, 1);// passing the parent hardcoded parameters through super
    }

    // called the first time a database is accessed, code for creating new databases
    @Override
    public void onCreate(SQLiteDatabase db) {//method called automatically when the app requests or input new data
        //create SQL statement that generates the SQL

        String createTableStatement = "CREATE TABLE " + CUSTOMER_TABLE + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + CUSTOMER_NAME + " TEXT, " + CUSTOMER_AGE + " INT)";///first column as primary key


        db.execSQL(createTableStatement);

    }

    //called if the database version number changes, prevents previous users apps from breaking when changing the database design
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
