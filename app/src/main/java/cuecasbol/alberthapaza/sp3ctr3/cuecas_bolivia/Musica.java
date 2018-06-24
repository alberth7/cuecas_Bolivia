package cuecasbol.alberthapaza.sp3ctr3.cuecas_bolivia;

import android.app.Activity;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class Musica extends AppCompatActivity {

    private ArrayList<Cueca> datos;
    private RecyclerView rvDatos;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    private Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musica);
        activity=this;

        llenarCuecas();

        rvDatos=findViewById(R.id.rvContenido);

        layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);

        rvDatos.setLayoutManager(layoutManager);
        adapter = new RVAdapter(activity, datos);
        rvDatos.setAdapter(adapter);
    }

    private void llenarCuecas() {
        datos =new ArrayList<Cueca>();
        Resources resources= getResources();
        TypedArray arrayImgs = resources.obtainTypedArray(R.array.images);
        String[] arrayTitulos=resources.getStringArray(R.array.Titulos);
        String[] arraySubtitulos=resources.getStringArray(R.array.subtitulos);
        String[] arrayDetalles=resources.getStringArray(R.array.detalles);

        for (int i=0; i<arrayTitulos.length;i++){
            Cueca cueca=new Cueca();
            cueca.setTitulo(arrayTitulos[i]);
            cueca.setSubtitulo(arraySubtitulos[i]);
            cueca.setDetalle(arrayDetalles[i]);
            cueca.setImagen(arrayImgs.getResourceId(i,-1));

            datos.add(cueca);

        }


    }
}

