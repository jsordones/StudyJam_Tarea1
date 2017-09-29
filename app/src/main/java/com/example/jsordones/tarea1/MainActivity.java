package com.example.jsordones.tarea1;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



    }


}


/*
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

private ImageButton ibAbreActivity;

    private ImageButton ibAbrirMarcado;

    private ImageButton ibLLaLmar;

    private ImageButton ibComparteImagen;

    private ImageButton ibAbreGoogleMaps;

    private ImageButton ibAbrePaginaWeb;

    private ImageButton ibEnviaEmail;

    private Intent intent;

dentro de onCreate

* ibAbrirMarcado = (ImageButton) findViewById(R.id.ibAbrirMarcado);

        ibLLaLmar = (ImageButton) findViewById(R.id.ibLlamar);

        ibAbreGoogleMaps = (ImageButton) findViewById(R.id.ibAbreGoogleMaps);

        ibAbrePaginaWeb = (ImageButton) findViewById(R.id.ibAbrePaginaWeb);

        ibEnviaEmail = (ImageButton) findViewById(R.id.ibEnviaEmail);

        ibComparteImagen = (ImageButton) findViewById(R.id.ibComparteImagen);

        ibAbrirMarcado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirMarcadoTelefonico();
            }
        });

        ibLLaLmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llamar();
            }
        });

        ibAbreGoogleMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirGoogleMaps();
            }
        });

        ibAbrePaginaWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirPaginaWeb();
            }
        });

        ibEnviaEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviarMensaje();
            }
        });

         public void abrirMarcadoTelefonico(){

        intent = new Intent(intent.ACTION_DIAL);

        intent.setData(Uri.parse("tel:70540507"));

        startActivity(intent);

    }

    public void llamar(){

        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);

        intent = new Intent(Intent.ACTION_CALL);

        Uri.parse("tel:60656009");

        startActivity(intent);

    }

    public void abrirGoogleMaps(){

        intent = new Intent(Intent.ACTION_VIEW);

        intent.setData(Uri.parse("geo: -16.504014, -68.130906"));

        startActivity(intent);

    }

    public void abrirPaginaWeb(){

        intent = new Intent(Intent.ACTION_VIEW);

        intent.setData(Uri.parse("https://www.gdg.androidbolivia.com"));

        startActivity(intent);

    }

    public void onRequestPermissionResult(int requestCode,String[] permissions,int[]grantResults){

        switch (requestCode){

            case 123:
                if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
                    llamar();

                else
                    Log.d("TAG","Permiso de llamada no concedido");

        }

    }


* */