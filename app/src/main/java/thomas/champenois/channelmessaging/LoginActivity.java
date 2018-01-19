package thomas.champenois.channelmessaging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnValider ;
    private TextView textViewId;
    private EditText editTextId;
    private TextView textViewPass;
    private EditText editTextPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnValider = (Button) findViewById(R.id.buttonValider);
        btnValider.setOnClickListener(this);

        textViewId = (TextView) findViewById(R.id.textId);
        editTextId = (EditText) findViewById(R.id.editId);

        textViewPass = (TextView) findViewById(R.id.password);
        editTextPass = (EditText) findViewById(R.id.editPass);



    }

    @Override
    public void onClick(View v) {

    }
}
