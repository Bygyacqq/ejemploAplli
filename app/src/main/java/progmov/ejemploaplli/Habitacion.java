package progmov.ejemploaplli;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;
import java.util.Calendar;
public class Habitacion extends AppCompatActivity {
    private Button dateButton, timeButton;
    private Calendar calendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habitacion);
        dateButton = findViewById(R.id.dateButton);
        timeButton = findViewById(R.id.timeButton);
        calendar = Calendar.getInstance();
        dateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePicker();
            }
        });
        timeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTimePicker();
            }
        });
    }

    private void showTimePicker() {
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day_of_month = calendar.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                Toast.makeText(Habitacion.this, "Fecha a seleccionar: " + dayOfMonth + "/" + (month + 1) + "/" + year, Toast.LENGTH_SHORT).show();
            }
            }, year, month, day_of_month);

        datePickerDialog.show();
    }

    private void showDatePicker()
    {
        int hour_day = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hour_day, int minute) {
                Toast.makeText(Habitacion.this, "Hora a seleccionar:" + hour_day + minute, Toast.LENGTH_SHORT).show();
            }
        }, hour_day, minute, true);
        timePickerDialog.show();
    }
}