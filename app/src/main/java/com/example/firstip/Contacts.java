package com.example.firstip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Contacts extends AppCompatActivity {

    private ListView list;

    private String[] friends = new String[] {"Nicole", "Kelly", "Bercy", "Jesus","Judicael","Jonael","Paola", "Ella", "Jules","Celia", "Dorian","Kim","Berly"};
//    private String[] theirContacts= new String[]{"0786720958", "0737474056", "0788555291", "07872394732", "078567207654","75789390","71766897","69292438","78123456","78986543","76549235","75412098","0786720958"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        list = (ListView) findViewById(R.id.contact);
        ArrayAdapter ad= new ArrayAdapter(this,android.R.layout.simple_list_item_1, friends);
        list.setAdapter(ad);

    }
}
