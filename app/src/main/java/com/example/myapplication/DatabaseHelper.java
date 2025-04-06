package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Login.db";
    private static final String COL_1 = "ID";
     static final String COL_2 = "USERNAME";
    private static final String COL_3 = "PASSWORD";
     static final String COLUMN_MONEY = "MONEY";
    static final String TABLE = "Users";

    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE Users(ID INTEGER PRIMARY KEY AUTOINCREMENT, USERNAME TEXT, PASSWORD TEXT, MONEY TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
            db.execSQL("DROP TABLE IF EXISTS Users");
            onCreate(db);
    }
    public boolean insertData(String username, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, username );
        contentValues.put(COL_3, password );
        long result = db.insert("Users", null, contentValues);
        return result != -1;
    }

    public void addMoney (String money){

        SQLiteDatabase db = this.getWritableDatabase();
    }

    public String checkLogin(String username, String password){
        SQLiteDatabase db = this.getWritableDatabase();
        String[] colums ={COL_2};
        String selection = "USERNAME=? AND PASSWORD = ?";
        String[] selectionArgs = {username, password};
        Cursor cursor = db.query("Users", colums, selection, selectionArgs, null , null, null);
        String result = null;

        if (cursor !=null && cursor.moveToFirst()){
            result = cursor.getString(cursor.getColumnIndex(COL_2));
            cursor.close();
        }
        return result;
    }

}
