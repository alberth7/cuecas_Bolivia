package cuecasbol.alberthapaza.sp3ctr3.cuecas_bolivia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu_2 extends AppCompatActivity {

    Button btnHistoria,btnPartesCueca,btnMusica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_2);
        btnHistoria=(Button)findViewById(R.id.btnHistoria);
        btnPartesCueca=(Button)findViewById(R.id.btnPartesCueca);
        btnMusica=(Button)findViewById(R.id.btnMusica);

        btnMusica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Menu_2.this,Musica.class);
                startActivity(intent);
            }
        });
    }


    public void atras2(View view){
        onBackPressed();
    }

}
