package com.example.romaniatravelplanner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.HorizontalScrollView;

import com.example.romaniatravelplanner.adapter.RecentsAdapter;
import com.example.romaniatravelplanner.model.RecentsData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recentRecycler;
    RecentsAdapter recentsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("Peles Castle","Sinaia", "From 10 lei", R.drawable.peles));
        recentsDataList.add(new RecentsData("Black Sea","Constanta", "From 0 lei", R.drawable.sea));
        recentsDataList.add(new RecentsData("Transfagarasan","DN7C", "From 0 lei", R.drawable.transfagarasan));
        recentsDataList.add(new RecentsData("Danube Delta","Tulcea", "From 120 lei", R.drawable.delta));

        setRecentRecycler((recentsDataList));
    }
    private void setRecentRecycler(List<RecentsData> recentsDataList){
        recentRecycler=findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);
    }
}