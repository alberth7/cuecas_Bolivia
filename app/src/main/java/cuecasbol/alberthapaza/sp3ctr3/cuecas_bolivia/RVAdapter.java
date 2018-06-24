package cuecasbol.alberthapaza.sp3ctr3.cuecas_bolivia;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Cueca> items;

    public RVAdapter(Activity activity, ArrayList<Cueca> data) {
        this.context = activity;
        this.items = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.card_item_music,
                        parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Cueca temp = items.get(position);
        holder.tvTitulo.setText(temp.getTitulo());
        holder.ivImagen.setImageResource(temp.getImagen());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvTitulo;
        private ImageView ivImagen;

        public ViewHolder(final View itemView) {
            super(itemView);
            tvTitulo = itemView.findViewById(R.id.tvCardTitulo);
            ivImagen = itemView.findViewById(R.id.imgCardDepto);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int posicion = getAdapterPosition();
                    Intent intent = new Intent(
                            context, MusicaDetalle.class);
                    intent.putExtra("cueca", items.get(posicion));
                    context.startActivity(intent);
                }
            });
        }
    }
}