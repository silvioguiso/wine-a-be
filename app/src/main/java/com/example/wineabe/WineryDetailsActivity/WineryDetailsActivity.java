package com.example.wineabe.WineryDetailsActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wineabe.Data.WineryData;
import com.example.wineabe.Model.Winery;
import com.example.wineabe.R;

public class WineryDetailsActivity extends AppCompatActivity {

    public static final String WINERYSK = "winerysk";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Winery selectedWinery = WineryData.getWineryBySK(getIntent().getIntExtra(WINERYSK, 0));
        setTitle(selectedWinery.getName());
        setContentView(R.layout.activity_winery_details);

        ImageView image = (ImageView) findViewById(R.id.image_logo);
        image.setImageResource(selectedWinery.getImageID());

        TextView textDetails = findViewById(R.id.text_wineryDetails);
        textDetails.setText(selectedWinery.getDetails());

        TextView textWines = findViewById(R.id.text_wines);
        textWines.setText(selectedWinery.getWineInformation());

        TextView textMemberships = findViewById(R.id.text_memberships);
        textMemberships.setText(selectedWinery.getMembershipInformation());

        Button buttonDirections = (Button)findViewById(R.id.button_directions);
        buttonDirections.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, selectedWinery.getLocationUri());
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });
    }
}
