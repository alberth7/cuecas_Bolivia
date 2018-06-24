package cuecasbol.alberthapaza.sp3ctr3.cuecas_bolivia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Creditos extends AppCompatActivity {

    Button btnSalirCredit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);
    }

    public void atrasCreditos(View view){

        onBackPressed();
        //Intent intent= new Intent(this,MainActivity.class);
        //startActivity(intent);
        //finish();
    }
}
