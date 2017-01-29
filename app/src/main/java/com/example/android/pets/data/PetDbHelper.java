package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class PetDbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "shelter.db";
    public static final int DATABASE_VERSION = 1;
    public static final String TEXT_TYPE = " TEXT";
    public static final String INTEGER_TYPE = " INTEGER";
    public static final String COMMA_SEPARATOR = ", ";
    public static final String PRIMARY_KEY_AUTOINCREMENT = " PRIMARY KEY AUTOINCREMENT";

    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }




    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + PetContract.PetEntry.TABLE_NAME + "("
                + PetContract.PetEntry._ID + INTEGER_TYPE + PRIMARY_KEY_AUTOINCREMENT + COMMA_SEPARATOR
                + PetContract.PetEntry.COLUMN_PET_NAME + TEXT_TYPE + COMMA_SEPARATOR
                + PetContract.PetEntry.COLUMN_PET_BREED + TEXT_TYPE + COMMA_SEPARATOR
                + PetContract.PetEntry.COLUMN_PET_GENDER + INTEGER_TYPE + COMMA_SEPARATOR
                + PetContract.PetEntry.COLUMN_PET_WEIGHT + INTEGER_TYPE + ");");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
