package ucc.itics.tesoem.edu.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RojasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rojas);
    }
    public void regresar5 (View v){
        Intent regresa5 =new Intent(this,RecetasActivity.class);
        startActivity(regresa5);
        finish();
    }
}
