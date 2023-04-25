package com.example.a10120248latihan3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import butterknife.ButterKnife;
import butterknife.OnClick;
import static com.example.a10120248latihan3.DoneActivity.ID_EXTRA_MSG_EXIT;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        if (getIntent().getBooleanExtra(ID_EXTRA_MSG_EXIT, false)) {
            finish();
        }
    }
    @OnClick(R.id.btnWalkthroughStart)
    void mulai() {
        Intent intent = new Intent(this, LoginCodeActivity.class);
        startActivity(intent);
    }
}

//Diana
//10120248
//IF-6
//Tanggal Pengerjaan   : 21-04-2023