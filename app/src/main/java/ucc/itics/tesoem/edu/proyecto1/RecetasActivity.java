package ucc.itics.tesoem.edu.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RecetasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recetas);
    }
    public void cargapantallaverdes(View v){
        Intent verdes = new Intent(this,VerdesActivity.class);
        startActivity(verdes);
        finish();
    }
    public void cargapantallarojas (View v){
        Intent rojas = new Intent(this,RojasActivity.class);
        startActivity(rojas);
        finish();
    }
    public void cargapantallasuizas(View v){
        Intent suizas= new Intent(this,SuizasActivity.class);
        startActivity(suizas);
        finish();
    }
    public void cargapantallapotosinas(View v){
        Intent potosinas=new Intent( this,PotosinasActivity.class);
        startActivity(potosinas);
        finish();
    }
    public void cargapantallaregresamenu3(View v){
        Intent regresamenu3=new Intent(this,MenuActivity.class);
        startActivity(regresamenu3);
        finish();
    }
}
