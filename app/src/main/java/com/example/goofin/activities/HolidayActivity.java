package com.example.goofin.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.goofin.R;
import com.example.goofin.store.Holiday;

public class HolidayActivity extends AppCompatActivity {

    public static final String NEW_HOLIDAY = "NEW_HOLIDAY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holiday);

//        final Button button = findViewById(R.id.button_save);
//        button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                Intent replyIntent = new Intent();
//                if (TextUtils.isEmpty(mEditWordView.getText())) {
//                    setResult(RESULT_CANCELED, replyIntent);
//                } else {
//                    String word = mEditWordView.getText().toString();
//                    replyIntent.putExtra(EXTRA_REPLY, word);
//                    setResult(RESULT_OK, replyIntent);
//                }
//                finish();
//            }
//        });
    }
}
