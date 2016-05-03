package vishnu.yolo.com.cgpacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText c1,c2,c3,c4,c5,c6,g1,g2,g3,g4,g5,g6;
        Button b1;
        final TextView t1;
        c1 = (EditText)findViewById(R.id.c1);
        c2 = (EditText)findViewById(R.id.c2);
        c3 = (EditText)findViewById(R.id.c3);
        c4 = (EditText)findViewById(R.id.c4);
        c5 = (EditText)findViewById(R.id.c5);
        c6 = (EditText)findViewById(R.id.c6);
        g1 = (EditText)findViewById(R.id.g1);
        g2 = (EditText)findViewById(R.id.g2);
        g3 = (EditText)findViewById(R.id.g3);
        g4 = (EditText)findViewById(R.id.g4);
        g5 = (EditText)findViewById(R.id.g5);
        g6 = (EditText)findViewById(R.id.g6);
        b1=(Button)findViewById(R.id.button);
        t1 = (TextView) findViewById(R.id.textView10);


        b1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0){

                float credit1=Float.parseFloat(c1.getText().toString());
                float credit2=Float.parseFloat(c2.getText().toString());
                float credit3=Float.parseFloat(c3.getText().toString());
                float credit4=Float.parseFloat(c4.getText().toString());
                float credit5=Float.parseFloat(c5.getText().toString());
                float credit6=Float.parseFloat(c6.getText().toString());
                float grade1=Float.parseFloat(g1.getText().toString());
                float grade2=Float.parseFloat(g2.getText().toString());
                float grade3=Float.parseFloat(g3.getText().toString());
                float grade4=Float.parseFloat(g4.getText().toString());
                float grade5=Float.parseFloat(g5.getText().toString());
                float grade6=Float.parseFloat(g6.getText().toString());
                double cgpas;

                cgpas= (credit1*grade1+credit2*grade2+credit3*grade3+credit4*grade4+credit5*grade5+credit6*grade6) /(credit1+credit2+credit3+credit4+credit5+credit6);
                String s =String.format("%.2f",cgpas);


                t1.setText("Your gpa is "+s);



            }
        });
    }
}
