package ucc.itics.tesoem.edu.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VerdesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verdes);
    }
    public void regresarrecetas(View v){
        Intent regresar= new Intent(this,RecetasActivity.class);
        startActivity(regresar);
        finish();
    }
}
