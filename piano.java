import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class PianoActivity extends AppCompatActivity {
    // Define MediaPlayer objects for each piano note sound
    private MediaPlayer mediaPlayerC;
    private MediaPlayer mediaPlayerD;
    // Add more MediaPlayer objects for other notes

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano);

        // Initialize MediaPlayer objects with sound files for each note
        mediaPlayerC = MediaPlayer.create(this, R.raw.c_note);
        mediaPlayerD = MediaPlayer.create(this, R.raw.d_note);
        // Initialize more MediaPlayers for other notes

        // Set click listeners for the piano keys
        Button buttonC = findViewById(R.id.keyC);
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Play the C note when the C button is clicked
                mediaPlayerC.start();
            }
        });

        Button buttonD = findViewById(R.id.keyD);
        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Play the D note when the D button is clicked
                mediaPlayerD.start();
            }
        });
        // Set click listeners for other keys in a similar way
    }
}
