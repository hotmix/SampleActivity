package jp.hotmix.sampleactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SubActivity extends AppCompatActivity {

    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        Log.d("SubActivity", "onCreate");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mEditText = (EditText)findViewById(R.id.editText);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("text")) {
            mEditText.setText(intent.getStringExtra("text"));
        }

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent data = new Intent();
                data.putExtra("text", mEditText.getText().toString());
                setResult(RESULT_OK, data);

                finish();

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("SubActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("SubActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("SubActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("SubActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("SubActivity", "onDestroy");
    }
}
