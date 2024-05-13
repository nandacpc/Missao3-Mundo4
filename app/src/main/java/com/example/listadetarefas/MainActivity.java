package com.example.listadetarefas;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Button button;
    ArrayAdapter adapter;
    ArrayList<String> tasks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        button = findViewById(R.id.button);
        tasks = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tasks);

        listView.setAdapter(adapter);
        button.setOnClickListener(view -> {
            tasks.add("Nova Tarefa" + (tasks.size() + 1));
            adapter.notifyDataSetChanged();
        });
    }
}