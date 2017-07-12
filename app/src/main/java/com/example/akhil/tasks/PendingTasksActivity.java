package com.example.akhil.tasks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class PendingTasksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pending_tasks);

        String names[] = {"akhil","nikhil","andi"};
        ListAdapter akhilAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        ListView akhilListView = (ListView) findViewById(R.id.listview_pending_tasks);
        akhilListView.setAdapter(akhilAdapter);
        akhilListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String name = String.valueOf(adapterView.getItemAtPosition(i));
                Toast.makeText(PendingTasksActivity.this,name,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
