package cuecasbol.alberthapaza.sp3ctr3.cuecas_bolivia;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MusicaDetalle extends AppCompatActivity {


    private ImageView ivImagen;
    private TextView tvTitulo;
    private TextView tvSubtitulo;
    private TextView tvDetalle;
    private Typeface tf_black;
    private Typeface tf_thin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musica_detalle);

        ivImagen=(ImageView)findViewById(R.id.ivDetalleImagen);
        tvTitulo=(TextView)findViewById(R.id.tvDetalleTitulo);
        tvSubtitulo=(TextView)findViewById(R.id.tvDetalleSubtitulo);
        tvDetalle=(TextView)findViewById(R.id.tvDetalle);

        Cueca cueca=(Cueca)getIntent().getSerializableExtra("cueca");

        ivImagen.setImageResource(cueca.getImagen());
        tvTitulo.setText(cueca.getTitulo());
        tvSubtitulo.setText(cueca.getSubtitulo());
        tvDetalle.setText(cueca.getDetalle());

    }
}
