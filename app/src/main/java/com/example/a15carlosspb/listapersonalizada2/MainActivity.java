package com.example.a15carlosspb.listapersonalizada2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv);

        int[] fotosid = {R.drawable.aguila,
                R.drawable.ballena,
                R.drawable.caballo,
                R.drawable.canario,
                R.drawable.delfin,
                R.drawable.gato,
                R.drawable.perro,
                R.drawable.vaca};

        int[] iconosid = {R.drawable.verde,
                R.drawable.azul,
                R.drawable.rosa};

        ArrayList<Animal> animales = new ArrayList<>();

        for (int i = 0; i < getResources().getStringArray(R.array.animales).length; i++) {
            Animal a = new Animal();
            a.setNombre(getResources().getStringArray(R.array.animales)[i]);
            a.setDescripcion(getResources().getStringArray(R.array.descripciones)[i]);
            a.setFoto(fotosid[i]);
            a.setIcono(iconosid[1 % i]);
            animales.add(a);

        }

        MiAdaptador adaptador = new MiAdaptador(this, animales);

        lv.setAdapter(adaptador);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, getResources().getStringArray(R.array.animales)[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}

