package ucc.itics.tesoem.edu.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PotosinasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potosinas);
    }
    public void historiap (View v){
        Intent historiap =new Intent(this,HistoriaPotosinasActivity.class);
        startActivity(historiap);
        finish();
    }
    public void regresa7 (View v){
        Intent regresa7=new Intent(this, RecetasActivity.class);
        startActivity(regresa7);
        finish();
    }
}
