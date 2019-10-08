package ucc.itics.tesoem.edu.proyecto1;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class QuesonActivity extends AppCompatActivity implements View.OnClickListener {
    TextView btnregresar1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queson);
    }
    @Override
    public void onClick(View v){
        Intent regresar1=new Intent(this,MenuActivity.class);
        startActivity(regresar1);
        finish();
    }
}
