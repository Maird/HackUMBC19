package com.example.parkcore;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;


public class Spots_Available extends AppCompatActivity {

    private Button button3;
    private CheckBox checkBoxYes;
    private boolean checked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spots__available);

        button3 = findViewById(R.id.button3);
        checkBoxYes = (CheckBox) findViewById(R.id.checkBoxYes);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                openParkingSpot(checked);


            }
        });
    }

    public void openParkingSpot(final boolean checked) {
        /*
        String url = "rest/classified";
        int idx = -1;

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {

                        // check handicap
                        for (int idx = 0; idx < 10; idx++){
                            if (response.response[idx] == 0) {
                                if ((idx == 0 || idx == 1) && checked)
                                    ans = idx;
                                else if
                                    ans

                            }
                        }
                    }

                });


         */
        Intent intent = new Intent(this, ParkingSpot.class);
        startActivity(intent);
    }
}

// response obj, one member variable called response = array integers
//send example query  and make example response

