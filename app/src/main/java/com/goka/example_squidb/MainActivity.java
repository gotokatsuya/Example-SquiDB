package com.goka.example_squidb;

import com.yahoo.squidb.data.DatabaseDao;
import com.yahoo.squidb.sql.Query;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private DatabaseDao dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dao = new DatabaseDao(new ExampleDatabase(this));

        Person newPerson = new Person();
        //newPerson.setName("Sam");

        // This will insert a new row into the database
        dao.persist(newPerson);

        // After the call to persist, the model will have an id,
        // i.e. the _id of the new row that was inserted
        long rowId = newPerson.getId();

        fetch(rowId);
    }

    private void fetch(long rowId) {
        Person person = dao.fetch(Person.class, rowId);
        Toast.makeText(this, person.getName(), Toast.LENGTH_SHORT).show();
    }

}
