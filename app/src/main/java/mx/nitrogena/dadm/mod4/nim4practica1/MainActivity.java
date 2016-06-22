package mx.nitrogena.dadm.mod4.nim4practica1;

import android.net.Uri;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView etNumero;
    private TextView etResultado;
    private Double dblNumero1;
    private Double dblNumero2;
    private Double dblResultado = 0.0;
    private String strOperador = "";
    private String strNumero = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //etNumero = (TextView)findViewById(R.id.amain_tv_numero);
        etResultado = (TextView) findViewById(R.id.amain_tv_resultado);

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

    @Override
    public void onClick(View v) {
        String strNum;
        switch (v.getId()) {
            case R.id.amain_bt_0:
                strNum = "0";
                obtenerNumero(strNum);
                break;
            case R.id.amain_bt_1:
                strNum = "1";
                obtenerNumero(strNum);
                break;
            case R.id.amain_bt_2:
                strNum = "2";
                obtenerNumero(strNum);
                break;
            case R.id.amain_bt_3:
                strNum = "3";
                obtenerNumero(strNum);
                break;
            case R.id.amain_bt_4:
                strNum = "4";
                obtenerNumero(strNum);
                break;
            case R.id.amain_bt_5:
                strNum = "5";
                obtenerNumero(strNum);
                break;
            case R.id.amain_bt_6:
                strNum = "6";
                obtenerNumero(strNum);
                break;
            case R.id.amain_bt_7:
                strNum = "7";
                obtenerNumero(strNum);
                break;
            case R.id.amain_bt_8:
                strNum = "8";
                obtenerNumero(strNum);
                break;
            case R.id.amain_bt_9:
                strNum = "9";
                obtenerNumero(strNum);
                break;

            case R.id.amain_bt_sumar:
                sumar();
                break;
            case R.id.amain_bt_restar:
                restar();
                break;
            case R.id.amain_bt_multiplicar:
                multiplicar();
                break;
            case R.id.amain_bt_dividir:
                dividir();
                break;
            case R.id.amain_bt_igual:
                obtenerResultado();
                break;
        }
    }

    private void restar() {
        strOperador = "-";
        etNumero.setText(etNumero.getText() + "-");
        realizarOperacion();
    }

    private void multiplicar() {
        strOperador = "*";
        etNumero.setText(etNumero.getText() + "*");
        realizarOperacion();
    }

    private void dividir() {
        strOperador = "/";
        etNumero.setText(etNumero.getText() + "/");
        realizarOperacion();
    }

    private void sumar() {
        strOperador = "+";
        etNumero.setText(etNumero.getText() + "+");
        realizarOperacion();

    }

    private void obtenerResultado() {
        etResultado.setText(dblResultado.toString());
    }

    private void realizarOperacion() {
        dblNumero1 = Double.parseDouble(strNumero);
        switch (strOperador) {
            case "+":

                dblResultado = dblResultado + dblNumero1;
                break;
            case "-":

                dblResultado = dblResultado - dblNumero1;
                break;
            case "*":

                dblResultado = dblResultado * dblNumero1;
                break;
            case "/":

                dblResultado = dblResultado / dblNumero1;
                break;

        }

    }


    private void obtenerNumero(String strNum) {


        etNumero = (TextView) findViewById(R.id.amain_tv_numero);
        etNumero.setText(etNumero.getText() + strNum);

        strNumero = strNumero + strNum;




    }




}
