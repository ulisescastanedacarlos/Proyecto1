package ucc.itics.tesoem.edu.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HistoriaSuizasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia_suizas);
    }
    public void regresa8(View v){
        Intent regresa8=new Intent(this,SuizasActivity.class);
        startActivity(regresa8);
        finish();
    }
}
