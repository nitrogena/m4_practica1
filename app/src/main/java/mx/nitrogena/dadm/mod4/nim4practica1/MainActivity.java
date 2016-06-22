package mx.nitrogena.dadm.mod4.nim4practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText etNumero;
    private EditText etResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumero = (EditText)findViewById(R.id.amain_et_numero);
        etResultado = (EditText)findViewById(R.id.amain_et_resultado);
        findViewById(R.id.amain_bt_1).setOnClickListener(this);
        findViewById(R.id.amain_bt_2).setOnClickListener(this);
        findViewById(R.id.amain_bt_3).setOnClickListener(this);
        findViewById(R.id.amain_bt_4).setOnClickListener(this);
        findViewById(R.id.amain_bt_5).setOnClickListener(this);
        findViewById(R.id.amain_bt_6).setOnClickListener(this);
        findViewById(R.id.amain_bt_7).setOnClickListener(this);
        findViewById(R.id.amain_bt_8).setOnClickListener(this);
        findViewById(R.id.amain_bt_9).setOnClickListener(this);
        findViewById(R.id.amain_bt_0).setOnClickListener(this);

        findViewById(R.id.amain_bt_igual).setOnClickListener(this);
        findViewById(R.id.amain_bt_punto).setOnClickListener(this);

        findViewById(R.id.amain_bt_dividir).setOnClickListener(this);
        findViewById(R.id.amain_bt_multiplicar).setOnClickListener(this);
        findViewById(R.id.amain_bt_restar).setOnClickListener(this);
        findViewById(R.id.amain_bt_sumar).setOnClickListener(this);


    }
}
