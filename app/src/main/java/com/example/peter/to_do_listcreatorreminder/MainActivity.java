package com.example.peter.to_do_listcreatorreminder;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.peter.to_do_listcreatorreminder.models.Todo;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void setupUI(@NonNull List<Todo> todo){
        ListView listView = (ListView) findViewById(R.id.main_list_view);
        listView.setAdapter(new TodoListAdapter(this, todo));
    }
}
