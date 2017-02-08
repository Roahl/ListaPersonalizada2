package com.example.a15carlosspb.listapersonalizada2;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MiAdaptador extends ArrayAdapter<String> {

    private Activity context;
    private ArrayList<Animal> animal;


    public MiAdaptador(Activity context, ArrayList animal) {
        super(context, R.layout.filas, animal);
        this.animal = animal;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View fila = inflater.inflate(R.layout.filas, null);
        TextView tvAnimal = (TextView) fila.findViewById(R.id.tvfila);
        ImageView imagen = (ImageView) fila.findViewById(R.id.ivFila);
        TextView tvDescr = (TextView) fila.findViewById(R.id.tvDescr);
        ImageView icono = (ImageView) fila.findViewById(R.id.ivIcono);
        LinearLayout l = (LinearLayout) fila.findViewById(R.id.linear);

        tvDescr.setText(animal.get(position).getDescripcion());
        tvAnimal.setText(animal.get(position).getNombre());
        imagen.setImageResource(animal.get(position).getFoto());
        icono.setImageResource(animal.get(position).getIcono());
        if (position % 2 == 0) {
            l.setBackgroundColor(Color.argb(255, 188, 253, 246));
            tvAnimal.setTextSize(25);
            tvAnimal.setTextColor(Color.BLUE);
        } else {
            l.setBackgroundColor(Color.argb(255, 230, 253, 254));

            tvAnimal.setTextSize(25);
        }



        return fila;
    }
}
