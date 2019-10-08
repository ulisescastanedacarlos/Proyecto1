package ucc.itics.tesoem.edu.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HistoriaPotosinasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia_potosinas);
    }
    public void regresa9 (View v){
        Intent regresa9 = new Intent(this,PotosinasActivity.class);
        startActivity(regresa9);
        finish();
    }
}
