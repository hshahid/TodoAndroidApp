package com.example.hashma.todoapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvItems;
    private EditText etNewItem;
    private Button btnAddItem;
    private List<String> items;
    private ArrayAdapter<String> itemsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        items = new ArrayList<String>();
        itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        lvItems.setAdapter(itemsAdapter);
        items.add("First Item");
        items.add("Second Item");

    }

//    private void setupListViewListener(){
//        lvItems.setOnItemLongClickListener(
//                new AdapterView.OnItemLongClickListener() {
//
//                    @Override
//                    public boolean OnItemLongClick(AdapterView<?> adapter,
//                                                   View item, int pos, long id) {
//                        items.remove(pos);
//                        itemsAdapter.notifyDataSetChanged();
//                        return true;
//                    }
//                }
//        );
//    }

//    public void onAddItem(View v) {
//        etNewItem = (EditText)findViewById(R.id.etNewItem);
//        String itemText = etNewItem.getText().toString();
//        itemsAdapter.add(itemText);
//        etNewItem.setText("");
//    }
}
