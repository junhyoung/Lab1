package embedded.kookmin.ac.kr.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt=(Button)findViewById(R.id.button);
        bt.setText("ChangeText");
        bt.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v){
                Toast.makeText(getApplicationContext(),"Toast",Toast.LENGTH_LONG).show();
            }
        });
    }
}
