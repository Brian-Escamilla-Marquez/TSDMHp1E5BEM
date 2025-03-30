package mx.edu.isc.tesoem.tsdmhp1e5bem;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrincipalActivity extends AppCompatActivity {

    String[] strEstados;
    List<String> listEstados = new ArrayList<>();
    ArrayAdapter<String> Adaptador;
    Spinner spEstados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        strEstados = new String[]{"Edo Mex","Durango","Coahuila","Veracruz","Sonora","Michoacan","Yucatan"};
        Collections.addAll(listEstados,strEstados);
        Adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,listEstados);
        spEstados = findViewById(R.id.spEstados);
        spEstados.setAdapter(Adaptador);
    }
}