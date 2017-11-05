package com.example.kir.moneytracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageButton;

public class AddActivity extends AppCompatActivity {

    private EditText name;
    private EditText price;
    private ImageButton add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        price = findViewById(R.id.price);
        add = findViewById(R.id.add);

        name.addTextChangedListener(textWatcher);
        price.addTextChangedListener(textWatcher);
        add.setEnabled(false);
    }

    @Override
    protected void onDestroy() {
        name.removeTextChangedListener(textWatcher);
        price.removeTextChangedListener(textWatcher);
        super.onDestroy();

    }

    private TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            add.setEnabled(!TextUtils.isEmpty(name.getText()) && !TextUtils.isEmpty(price.getText()));
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };


    @Override
    protected void onStart() {
        super.onStart();
    }


    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    protected void onPause() {
        super.onPause();
    }


    @Override
    protected void onStop() {
        super.onStop();
    }

}
