package jalizadeh.com.androidadvanced.DialogFragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import jalizadeh.com.androidadvanced.R;

public class Activity_DialogFragment extends AppCompatActivity implements MyCustomDialogFragment.OnInputListener {

    /**
     * of interface in {@link MyCustomDialogFragment}
     *
     * @param input
     */
    @Override
    public void sendInput(String input) {
        textFromFragment.setText(input);
    }


    //widgets
    private Button btnOpenDialog;
    public TextView textFromFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_fragment);

        textFromFragment = (TextView) findViewById(R.id.tvFragmentResult);

        btnOpenDialog = (Button) findViewById(R.id.btnOpenDialog);
        btnOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyCustomDialogFragment dialog = new MyCustomDialogFragment();
                dialog.show(getSupportFragmentManager(), "MyCustomDialog");
            }
        });

    }


}
