package pl.michu628.plankchallenge;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Michał on 2015-04-24.
 */
public class ChallengesDatabase implements ChallengeProvider{

    private static final String COLUMN_1_NAME = "_id";
    private static final String COLUMN_2_NAME = "Time";
    private static final String COLUMN_3_NAME = "Done";
    MyDBHelper mMyDBHelper;
    Context mContext;

    public ChallengesDatabase(Context context) throws IOException {
        mContext = context;

        mMyDBHelper = new MyDBHelper(context);
        try{ mMyDBHelper.createDatabase(); }
        catch(IOException ioe){ throw new Error("Unable to create database"); }

        try { mMyDBHelper.openDatabase(); }
        catch(SQLException sqle){ throw new Error("Unable to open database"); }
    }

    @Override
    public ArrayList<ChallengeDay> getChallenge(String tableName) {

        SQLiteDatabase db = mMyDBHelper.getReadableDatabase();
        ArrayList<ChallengeDay> arrayList = new ArrayList<>();

        String[] projection = {
                COLUMN_1_NAME,
                COLUMN_2_NAME,
                COLUMN_3_NAME
        };

        Cursor cursor = db.query(tableName,projection,null,null,null,null,null);

        while(cursor.moveToNext() == true){
            int day = Integer.parseInt(cursor.getString(0));
            int time = Integer.parseInt(cursor.getString(1));

            arrayList.add(new ChallengeDay(day,time,false));
        }

        return arrayList;
    }
}
