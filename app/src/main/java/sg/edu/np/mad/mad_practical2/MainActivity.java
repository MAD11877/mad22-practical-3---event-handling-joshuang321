package sg.edu.np.mad.mad_practical2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user = new User(null, null,  0, true);

        ((TextView)findViewById(R.id.textView)).setText("MAD " + getIntent().getIntExtra("rand", 0));

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,  user.followed? "Followed!" : "UnFollowed!", Toast.LENGTH_SHORT)
                        .show();
                user.followed = !user.followed;
                button.setText(user.followed? "Follow" : "UnFollow");
            }
        });
    }
}