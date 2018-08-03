package tw.com.flag.ch02_button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int size=30;

    //public TextView txv = (TextView)findViewById(R.id.txv);

    public void bigger(View v)
    {
        TextView txv;
        txv = (TextView)findViewById(R.id.txv);
        txv.setTextSize(++size);
    }

    public void smaller(View v)
    {
        if(size > 30)
        {
            TextView txv = (TextView)findViewById(R.id.txv);
            txv.setTextSize(--size);
        }
    }

    public void DisplayInputText(View v)
    {
        TextView txv = (TextView)findViewById(R.id.txv);
        EditText edit;
        edit = (EditText)findViewById(R.id.edit);
        String str = edit.getText().toString();
        txv.setText(str);
    }


}
