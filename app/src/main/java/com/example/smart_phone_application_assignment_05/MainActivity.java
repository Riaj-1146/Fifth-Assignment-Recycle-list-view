package com.example.smart_phone_application_assignment_05;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Item> itemList = Arrays.asList(
                new Item("Ahsan Manzil", "Dhaka, Bangladesh", R.drawable.ahsan_manzil),
                new Item("Lalbagh Fort", "Dhaka, Bangladesh", R.drawable.lalbagh_fort),
                new Item("Mahasthangarh", "Bogra, Bangladesh", R.drawable.mahasthangarh),
                new Item("Sixty Dome Mosque", "Bagerhat, Bangladesh", R.drawable.sixty_dome_mosque),
                new Item("Somapura Mahavihara", "Naogaon, Bangladesh", R.drawable.somapura_mahavihara)
        );


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        ItemAdapter adapter = new ItemAdapter(itemList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}