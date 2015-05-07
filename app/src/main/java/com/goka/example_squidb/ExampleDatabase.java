package com.goka.example_squidb;

import com.yahoo.squidb.data.AbstractDatabase;
import com.yahoo.squidb.sql.Table;
import com.yahoo.squidb.sql.View;
import com.yahoo.squidb.sql.VirtualTable;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by katsuyagoto on 2015/05/07.
 */
public class ExampleDatabase extends AbstractDatabase {

    private static final int VERSION = 1;
    private static final String NAME = "ex-database.db";

    public ExampleDatabase(Context context) {
        super(context);
    }

    @Override
    protected String getName() {
        return NAME;
    }


    @Override
    protected Table[] getTables() {
        return new Table[]{
                // List all tables here
                Person.TABLE,
        };
    }

    @Override
    protected int getVersion() {
        return VERSION;
    }

    @Override
    protected boolean onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        /*switch(oldVersion) {
            case 1:
        }*/
        return true;
    }
}