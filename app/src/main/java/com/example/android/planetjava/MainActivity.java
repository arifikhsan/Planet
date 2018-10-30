package com.example.android.planetjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private PlanetAdapter planetAdapter;
    private ArrayList<Planet> planetArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rv_planets);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        planetArrayList = new ArrayList<>();
        planetAdapter = new PlanetAdapter(this, planetArrayList);
        recyclerView.setAdapter(planetAdapter);

        createListData();

    }

    private void createListData() {
        Planet planet = new Planet("Earth", 150, 10, 12750);
        planetArrayList.add(planet);

        planet = new Planet("Jupiter", 778, 26, 143000);
        planetArrayList.add(planet);

        planet = new Planet("Mars", 228, 4, 6800);
        planetArrayList.add(planet);

        planet = new Planet("Pluto", 5900, 1, 2320);
        planetArrayList.add(planet);

        planet = new Planet("Venus", 108, 9, 12750);
        planetArrayList.add(planet);

        planet = new Planet("Saturn", 1429, 11, 120000);
        planetArrayList.add(planet);

        planet = new Planet("Mercury", 58, 4, 4900);
        planetArrayList.add(planet);

        planet = new Planet("Neptune", 4500, 12, 50500);
        planetArrayList.add(planet);

        planet = new Planet("Uranus", 2870, 9, 52400);
        planetArrayList.add(planet);

        planetAdapter.notifyDataSetChanged();
    }
}
