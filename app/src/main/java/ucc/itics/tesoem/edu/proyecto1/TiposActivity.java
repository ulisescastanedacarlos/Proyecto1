package ucc.itics.tesoem.edu.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TiposActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos);
    }
    public void cargapantallaregresamenu1(View v){
        Intent regresamenu1=new Intent(this,MenuActivity.class);
        startActivity(regresamenu1);
        finish();
    }
}
