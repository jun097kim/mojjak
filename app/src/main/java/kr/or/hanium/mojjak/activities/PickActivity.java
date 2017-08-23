package kr.or.hanium.mojjak.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import kr.or.hanium.mojjak.R;

public class PickActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        LinearLayout llRestaurants = (LinearLayout) findViewById(R.id.ll_restaurants);
        LinearLayout llBikes = (LinearLayout) findViewById(R.id.ll_bikes);
        LinearLayout llBathrooms = (LinearLayout) findViewById(R.id.ll_bathrooms);
        Button btnRoutes = (Button) findViewById(R.id.btn_routes);

        llRestaurants.setOnClickListener(this);
        llBikes.setOnClickListener(this);
        llBathrooms.setOnClickListener(this);
        btnRoutes.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_routes) {
            Intent intent = new Intent(this, RouteActivity.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, MainActivity.class);
            switch (view.getId()) {
                case R.id.ll_restaurants:
                    intent.putExtra("picked", "restaurants");
                    break;
                case R.id.ll_bikes:
                    intent.putExtra("picked", "bikes");
                    break;
                case R.id.ll_bathrooms:
                    intent.putExtra("picked", "bathrooms");
                    break;
            }
            startActivity(intent);
        }
    }
}