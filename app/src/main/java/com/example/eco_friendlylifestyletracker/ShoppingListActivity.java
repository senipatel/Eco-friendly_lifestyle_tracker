package com.example.eco_friendlylifestyletracker;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class ShoppingListActivity extends AppCompatActivity {

    private ArrayList<String> shoppingItems;
    private ArrayAdapter<String> adapter;
    private EditText edtNewItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_list);

        shoppingItems = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, shoppingItems);

        ListView listView = findViewById(R.id.listViewShoppingList);
        listView.setAdapter(adapter);

        edtNewItem = findViewById(R.id.edtNewItem);

        Button btnAddItem = findViewById(R.id.btnAddItem);
        btnAddItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addItemToList();
            }
        });
    }

    private void addItemToList() {
        String newItem = edtNewItem.getText().toString().trim();
        if (!newItem.isEmpty()) {
            shoppingItems.add(newItem);
            adapter.notifyDataSetChanged();
            edtNewItem.getText().clear();
        }
    }

    public void onDeleteItem(View view) {
        View parent = (View) view.getParent();
        TextView itemTextView = parent.findViewById(R.id.textShoppingItem);
        String itemToRemove = itemTextView.getText().toString();
        shoppingItems.remove(itemToRemove);
        adapter.notifyDataSetChanged();
    }
}

