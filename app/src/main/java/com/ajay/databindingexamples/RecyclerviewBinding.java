package com.ajay.databindingexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ajay.databindingexamples.Adapter.CategoryAdapter;
import com.ajay.databindingexamples.Model.CategoryObject;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewBinding extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.food_category);
        GridLayoutManager mGrid = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mGrid);
        recyclerView.setHasFixedSize(true);
        CategoryAdapter mAdapter = new CategoryAdapter(this, testData());
        recyclerView.setAdapter(mAdapter);
    }
    private List<CategoryObject> testData() {
        List<CategoryObject> categoryList = new ArrayList<>();
        categoryList.add(new CategoryObject("Pizza", R.drawable.food));
        categoryList.add(new CategoryObject("Chomin", R.drawable.food));
        categoryList.add(new CategoryObject("Sandwich Potato", R.drawable.food));
        categoryList.add(new CategoryObject("Checken", R.drawable.food));
        return categoryList;
    }
}
