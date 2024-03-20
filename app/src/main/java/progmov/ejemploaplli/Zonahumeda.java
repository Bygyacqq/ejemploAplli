package progmov.ejemploaplli;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import java.util.Calendar;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;
import java.util.Calendar;

public class Zonahumeda extends AppCompatActivity {
    private Button fechaButton, tiempoButton;
    private Calendar calendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zonahumeda);
        fechaButton = findViewById(R.id.fecha);
        tiempoButton = findViewById(R.id.tiempo);
        calendar = Calendar.getInstance();
        fechaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePicker();
            }
        });
        tiempoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTimePicker();
            }
        });
    }

    private void showTimePicker() {
        int year = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH);
        int dia_mes = calendar.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int mes, int dia_mes) {
                Toast.makeText(Zonahumeda.this, "Fecha a seleccionar: " + dia_mes + "/" + (mes+1) + "/" + year, Toast.LENGTH_SHORT).show();
            }
        }, year, mes, dia_mes);
        datePickerDialog.show();
    }

    private void showDatePicker() {
        int hora_dia = calendar.get(Calendar.HOUR_OF_DAY);
        int minutos = calendar.get(Calendar.MINUTE);
        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hora_dia, int minutos) {
                Toast.makeText(Zonahumeda.this, "Hora a seleccionar: " + hora_dia + minutos, Toast.LENGTH_SHORT).show();
            }
        }, hora_dia, minutos, true);
        timePickerDialog.show();
    }
}