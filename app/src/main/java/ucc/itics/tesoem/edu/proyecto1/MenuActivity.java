package ucc.itics.tesoem.edu.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }
    public void queson(View v){
        Intent queson=new Intent(this,QuesonActivity.class);
        startActivity(queson);
        finish();
    }
    public void tipos(View v){
        Intent tipos=new Intent(this,TiposActivity.class);
        startActivity(tipos);
        finish();
    }
    public void recetas (View v) {
        Intent recetas = new Intent(this, RecetasActivity.class);
        startActivity(recetas);
        finish();
    }
    public void by(View v){
        Intent by =new Intent(this,ByActivity.class);
        startActivity(by);
        finish();
    }
}
