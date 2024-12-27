package com.example.recyclerview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    ArrayList<Contactmodel> arrContacts = new ArrayList<>();
    EditText search;
    Button button;

    int searchint;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_main);
        search = findViewById(R.id.searchview);
        button = findViewById(R.id.btn_search);







        RecyclerView recyclerView = findViewById(R.id.recyclerContact);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);

        recyclerView.setLayoutManager(gridLayoutManager);

        arrContacts.add(new Contactmodel(R.drawable.a,"Abc","98980770",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"xyz","87980900",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"Nmo","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"Hij","989800990",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"xyz","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"Rty","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"Nmo","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"Sdf","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"Fgh","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"Ert","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"Utk","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"sha","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"gjg","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"gjg","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"gjg","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"gjg","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"gjg","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"gjg","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"Abc","98980770",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"xyz","87980900",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"Nmo","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"Hij","989800990",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"xyz","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"Rty","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"Nmo","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"Sdf","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"Fgh","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"Ert","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"Utk","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"sha","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"gjg","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"gjg","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"gjg","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"gjg","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"gjg","98980000",R.drawable.c));
        arrContacts.add(new Contactmodel(R.drawable.a,"gjg","98980000",R.drawable.c));

        RecyclerConatctAdapter adapter = new RecyclerConatctAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchint = Integer.parseInt(search.getText().toString());
                gridLayoutManager.scrollToPosition(searchint);
            }
        });
    }
}