package com.example.rwcyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    /*ArrayList<String> listDatos;
    RecyclerView recycler;
    RequestQueue queue;
*/

    ArrayList<personaje>listaPersonajes;
    RecyclerView recyclerPersonajes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listaPersonajes=new ArrayList<>();
        recyclerPersonajes=findViewById(R.id.recyclerID);
        recyclerPersonajes.setLayoutManager(new LinearLayoutManager(this));

        llenarPersonajes();
        AdaptadorPersonajes adapter=new AdaptadorPersonajes(listaPersonajes);
        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "selección: "+
                            listaPersonajes.get(recyclerPersonajes.getChildAdapterPosition(v)).getNombre(),Toast.LENGTH_SHORT).show();
            }
        });
        recyclerPersonajes.setAdapter(adapter);
    }

    private void llenarPersonajes() {

        listaPersonajes.add(new personaje("krusty_lala","dekkfnlfke",R.drawable.krusti));
        listaPersonajes.add(new personaje("bart","dekkfnlfke",R.drawable.bart));
        listaPersonajes.add(new personaje("burns","dekkfnlfke",R.drawable.burns));
        listaPersonajes.add(new personaje("flanders","dekkfnlfke",R.drawable.flanders));
        listaPersonajes.add(new personaje("homero","dekkfnlfke",R.drawable.homero));
        listaPersonajes.add(new personaje("lisa","dekkfnlfke",R.drawable.lisa));
        listaPersonajes.add(new personaje("magie","dekkfnlfke",R.drawable.magie));
    }


}


