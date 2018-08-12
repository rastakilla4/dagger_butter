package com.gsoft.injection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.gsoft.injection.di.App;
import com.gsoft.injection.di.Empresa;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button2) Button boton;
    @BindString(R.string.texto) String holaMundo;
    @BindViews({R.id.button2, R.id.button3, R.id.button4})
    List<Button> buttons;
    @BindColor(R.color.yellow) int amarillo;
    @BindColor(R.color.blanco) int blanco;

    @Named("gustavo") @Inject Programador programador;
    @Named("hana") @Inject Programador programador2;
    @Named("none") @Inject Programador programador3;
    @Named("none") @Inject Programador programador4;
    @Inject Empresa empresa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ((App)getApplication()).getComponentTest().inject(this);

        //boton.setText(holaMundo);
        //buttons.get(0).setText(holaMundo);
        //buttons.get(1).setBackgroundColor(amarillo);

        //ConInyeccion  conInyeccion = new ConInyeccion(new Programador("gustavo"));
        //SinInyeccion sinInyeccion = new SinInyeccion();
        //ConInyeccion conInyeccion1 = new ConInyeccion(new Programador("tavito"));
    }

    @OnClick({R.id.button2,R.id.button3 ,R.id.button4})
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button2:
                buttons.get(2).setBackgroundColor(amarillo);
                Toast.makeText(this, programador4.toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                buttons.get(0).setText(holaMundo);
                Toast.makeText(this, empresa.toString(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                buttons.get(0).setText("");
                buttons.get(2).setBackgroundColor(blanco);
                default:
                    break;
        }

    }
}
