package cuecasbol.alberthapaza.sp3ctr3.cuecas_bolivia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPrincipal extends AppCompatActivity {

    Button btnIniciar,btnCretidos,btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        btnIniciar=(Button)findViewById(R.id.btnIniciar);
        btnCretidos=(Button)findViewById(R.id.btnCreditos);
        btnSalir=(Button)findViewById(R.id.btnSalir);

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MenuPrincipal.this,Menu_2.class);
                startActivity(intent);

            }
        });

        btnCretidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MenuPrincipal.this, Creditos.class);
                startActivity(intent);

            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(getApplicationContext(),"salir",Toast.LENGTH_LONG).show();
                finish();
            }
        });

    }
}
