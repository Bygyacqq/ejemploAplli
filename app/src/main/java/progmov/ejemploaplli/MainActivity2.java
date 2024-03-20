package progmov.ejemploaplli;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button reservaHabitacion=findViewById(R.id.reservaHabitacion);
        reservaHabitacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, Habitacion.class);
                startActivity(intent);
            }
        });
        Button reservazhumeda = findViewById(R.id.reservazhumeda);
        reservazhumeda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, Zonahumeda.class);
                startActivity(intent);
            }
        });
    }
}