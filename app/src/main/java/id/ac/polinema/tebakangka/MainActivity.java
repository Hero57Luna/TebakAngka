package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	//  TODO: deklarasikan variabel di sini
	int number;
	private EditText angkaInput;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// TODO: bind layout di sini
		angkaInput = findViewById(R.id.number_input);
		initRandomNumber();
	}

	// TODO: generate angka random di sini
	private void initRandomNumber() {
		Random numberRandom  = new Random();
		number = numberRandom.nextInt(10) + 1;


	}

	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
		String guessStr = angkaInput.getText().toString();
		int theGuess = Integer.parseInt(guessStr);
		if (theGuess > number) {
			Toast.makeText(this, "Angka Anda terlalu besar", Toast.LENGTH_SHORT).show();
		}
		else if(theGuess < number) {
			Toast.makeText(this, "Angka Anda terlalu kecil", Toast.LENGTH_SHORT).show();
		}
		else {
			Toast.makeText(this, "Angka Anda benar", Toast.LENGTH_SHORT).show();
		}
	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
		angkaInput.setText("");
		initRandomNumber();
	}
}
