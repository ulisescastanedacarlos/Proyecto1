package ucc.itics.tesoem.edu.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SuizasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suizas);
    }
    public void historia(View v){
        Intent historias=new Intent(this,HistoriaSuizasActivity.class);
        startActivity(historias);
        finish();
    }
    public void regresar6(View v){
        Intent regresar6 = new Intent(this,RecetasActivity.class);
        startActivity(regresar6);
        finish();
    }
}
