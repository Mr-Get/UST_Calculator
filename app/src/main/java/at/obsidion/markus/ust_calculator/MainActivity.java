package at.obsidion.markus.ust_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtNetto;
    EditText txtTax;
    TextView txtBrutto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNetto = (EditText)findViewById(R.id.txtInputNetto);
        txtTax = (EditText)findViewById(R.id.txtInputTax);
        txtBrutto = (TextView)findViewById(R.id.txtBrutto);

    }

    public void calcBrutto(View view) {

        String txtNettoString = txtNetto.getText().toString();
        String txtTaxString = txtTax.getText().toString();

        double netto = 0;
        double tax = 0;

        try {
            netto = Double.parseDouble(txtNettoString);
            tax = Double.parseDouble(txtTaxString);
            double result = netto * (tax /100 +1 );
            txtBrutto.setText(""+result);
        } catch (NumberFormatException e) {
            txtBrutto.setText("WRONG INPUT!!!");
            e.printStackTrace();
        }


    }

}
