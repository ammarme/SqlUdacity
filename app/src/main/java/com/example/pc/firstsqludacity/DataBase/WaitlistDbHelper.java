package com.example.pc.firstsqludacity.DataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.pc.firstsqludacity.DataBase.WaitingListContract.Waitinglistentry;

/**
 * Created by PC on 7/27/2017.
 */

public class WaitlistDbHelper extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "waitlist.db";
    private static final int DATABASE_VERSION = 1;


    public WaitlistDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        final String SQL_CREATE_WAITLIST_TABLE = "CREATE TABLE " + Waitinglistentry.TABLE_NAME + " (" +
                Waitinglistentry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                Waitinglistentry.COLUMN_GUEST_NAME + " TEXT NOT NULL, " +
                Waitinglistentry.COLUMN_PARTY_SIZE + " INTEGER NOT NULL, " +
                Waitinglistentry.COLUMN_TIMESTAMP + " TIMESTAMP DEFAULT CURRENT_TIMESTAMP" +
                "); ";

        db.execSQL(SQL_CREATE_WAITLIST_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Waitinglistentry.TABLE_NAME);
        onCreate(db);
    }
}
