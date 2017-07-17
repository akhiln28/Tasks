package com.example.akhil.tasks;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

/**
 * Created by akhil on 14-07-2017.
 */

public class EditTaskActivity extends AppCompatActivity {
    EditText name = (EditText) findViewById(R.id.edit_text_edit_task);

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_task);
    }
}
