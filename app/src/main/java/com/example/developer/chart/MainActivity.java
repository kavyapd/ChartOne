package com.example.developer.chart;

import android.app.Activity;
        import android.content.Intent;
        import android.os.Build;
        import android.os.Bundle;
        import android.support.annotation.RequiresApi;
        import android.util.Log;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.RadioButton;
        import android.widget.Spinner;
        import android.widget.SpinnerAdapter;
        import android.widget.TextView;
        import android.widget.Toast;


        import com.android.volley.Request;
        import com.android.volley.RequestQueue;
        import com.android.volley.Response;
        import com.android.volley.VolleyError;
        import com.android.volley.toolbox.JsonArrayRequest;
        import com.android.volley.toolbox.JsonObjectRequest;
        import com.android.volley.toolbox.Volley;

        import org.json.JSONArray;
        import org.json.JSONException;
        import org.json.JSONObject;


        import java.lang.reflect.Array;
        import java.util.ArrayList;
        import java.util.List;

        import java.lang.String;
//
public class MainActivity extends Activity implements AdapterView.OnItemSelectedListener {
    String selectedSuperStar;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        final Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        final Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);//buyer
        final Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        final Spinner spinner4 = (Spinner) findViewById(R.id.spinner4);//year
        Button btn1 = (RadioButton) findViewById(R.id.radioButton);
        Button btn2 = (RadioButton) findViewById(R.id.radioButton3);
        Button button = (Button) findViewById(R.id.button2);



        // Spinner click listener


        List<String> supplier = new ArrayList<String>();
        supplier.add("Select suppliers");
        supplier.add("Compunet Services");
        supplier.add("Finder India Pvt.Ltd");
        supplier.add("Finolex Cable LTD");
        supplier.add("Indomax");
        supplier.add("Kyland Technology Shanghai Co LTD");
        supplier.add("Regency Electric Shanghai Co.LTD.");


        List<String> categories = new ArrayList<String>();
        categories.add("Select categories");
        categories.add("NEC");

        List<String> Buyers = new ArrayList<String>();
        Buyers.add("Select buyers");
        Buyers.add("Anke Mueller");
        Buyers.add("Arda Hosgor");
        Buyers.add("Nishant Bhoi");
        Buyers.add("Sandeep Borade");
        Buyers.add("Yigit Bakis");

        List<String> Group_Manager = new ArrayList<String>();
        Group_Manager.add("Select group_manager");
        Group_Manager.add("LoB(T)");
        Group_Manager.add("Local(L)");

        List<String> Year = new ArrayList<String>();
        Year.add("Select year");
        Year.add("2018");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, supplier);
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Buyers);
        ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Group_Manager);
        ArrayAdapter<String> dataAdapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Year);


        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        spinner.setAdapter(dataAdapter);
        spinner1.setAdapter(dataAdapter1);
        spinner2.setAdapter(dataAdapter2);
        spinner3.setAdapter(dataAdapter3);
        spinner4.setAdapter(dataAdapter4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });


    }


    public void onRadioButtonClicked(View view) {
        this.view = view;
// Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

// Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton:
                if (checked)
                    // BouttonRADIO_Bluetooth
                    break;
            case R.id.radioButton3:
                if (checked)
                    // BouttonRADIO_RS232
                    break;
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }

}

