package ucc.itics.tesoem.edu.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ByActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_by);
    }
    public void cargapantallaregresamenu2(View v){
        Intent regresamenu2 = new Intent(this,MenuActivity.class);
        startActivity(regresamenu2);
        finish();
    }
}
