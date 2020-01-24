package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private String output;
    String TAG="Concert Tickets";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText number=findViewById(R.id.plainText);
        final Spinner places=findViewById((R.id.spinnerg));
        Button cost=findViewById((R.id.computebutton));
        final TextView rtext=findViewById((R.id.textViewresult));

        double total;


        cost.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (number.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this,"Number of tickets cannot be added..!!",Toast.LENGTH_SHORT).show();
                }
else
                {
                    try{
                        int num=Integer.parseInt(number.getText().toString());
                        int index= places.getSelectedItemPosition





                                ();
                        double cost=0;
                        switch(index)
                        {
                            case 0:
                                cost=num*79.99;
                                break;
                            case 1:
                                cost=num*79.99;
                                break;
                            case 2:
                                cost=num*79.99;
                                break;
                        }
                        DecimalFormat df= new DecimalFormat("$#.##");
                        output="place ="+places.getSelectedItem()+"\n"+ "number of atheletes"+num+ "\n"+ "total cost"+df.format(cost);
                    rtext.setText(output);
                    }

                    catch (Exception ex)
                    {
                        Log.w(TAG,ex.getMessage());
                    }
                }
            }
        });

    }
}
