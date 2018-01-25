package com.coding_blocks.stonedcoder.dlandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private BinaryClassifier binaryClassifier;
    private int inputs = 2;
    private int outputs = 1;
    RecyclerView recyclerView;
    private JobAdapter jobAdapter;
    private Button mockDataButton;
    private Button learnButton;
    private Button refreshButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
