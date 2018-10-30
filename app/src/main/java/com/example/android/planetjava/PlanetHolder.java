package com.example.android.planetjava;

import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

/**
 * Created by Arif Ikhsanudin on Tuesday, 30 October 2018.
 */

class PlanetHolder extends RecyclerView.ViewHolder {

    private TextView name, distance, gravity, diameter;
    private Context context;

    PlanetHolder(final View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.tv_name);
        distance = itemView.findViewById(R.id.tv_distance);
        gravity = itemView.findViewById(R.id.tv_gravity);
        diameter = itemView.findViewById(R.id.tv_diameter);

        itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d("aaaaaaaa", name.getText().toString());
                Toast.makeText(context, name.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    void setDetails(Planet planet) {
        name.setText(planet.getPlanetName());
        distance.setText(String.format(Locale.US, "Distance from sun : %d Million KM", planet.getDistanceFromSun()));
        gravity.setText(String.format(Locale.US, "Surface Gravity : %d N/kg", planet.getGravity()));
        diameter.setText(String.format(Locale.US, "Diameter : %d KM", planet.getDiameter()));
    }

}
