package com.example.rwcyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorPersonajes extends RecyclerView.Adapter<AdaptadorPersonajes.viewHolderPersonajes> implements View.OnClickListener {

    ArrayList<personaje>listaPersonajes;
    private View.OnClickListener listener;

    public AdaptadorPersonajes(ArrayList<personaje> listaPersonajes) {
        this.listaPersonajes = listaPersonajes;
    }

    @NonNull
    @Override
    public viewHolderPersonajes onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_personaje,null,false);

        
        return new viewHolderPersonajes(view);


    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderPersonajes holder, int position) {
        holder.etiNombre.setText(listaPersonajes.get(position).getNombre());
        holder.etiInformacion.setText(listaPersonajes.get(position).getNombre());
        holder.foto.setImageResource(listaPersonajes.get(position).getFoto());



    }

    @Override
    public int getItemCount() {
        return listaPersonajes.size();
    }

    @Override
    public void onClick(View v) {

    }

    public class viewHolderPersonajes extends RecyclerView.ViewHolder {

        TextView etiNombre, etiInformacion;
        ImageView foto;
        public viewHolderPersonajes(@NonNull View itemView) {
            super(itemView);
            etiNombre=(TextView) itemView.findViewById(R.id.idNombre);
            etiInformacion=(TextView) itemView.findViewById(R.id.idInfo);
            foto= (ImageView)itemView.findViewById(R.id.idImagen);
        }
    }
}
