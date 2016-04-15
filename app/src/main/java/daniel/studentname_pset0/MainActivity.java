package daniel.studentname_pset0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setAllInvisible();
    }

    public void checkboxClicked(View v) {
        String stringId = v.getTag().toString();
        int id_name = getResources().getIdentifier(stringId, "id", "daniel.studentname_pset0");

        CheckBox checkBox = (CheckBox)v;
        ImageView imgView = (ImageView) findViewById(id_name);
        if(checkBox.isChecked()){
            imgView .setVisibility(View.VISIBLE);
        }
        else{
            imgView .setVisibility(View.INVISIBLE);
        }
    }

    private void setAllInvisible(){
        ImageView imgView = (ImageView) findViewById(R.id.arms);
        imgView .setVisibility(View.INVISIBLE);
        imgView = (ImageView) findViewById(R.id.ears);
        imgView .setVisibility(View.INVISIBLE);
        imgView = (ImageView) findViewById(R.id.eyebrows);
        imgView .setVisibility(View.INVISIBLE);
        imgView = (ImageView) findViewById(R.id.eyes);
        imgView .setVisibility(View.INVISIBLE);
        imgView = (ImageView) findViewById(R.id.glasses);
        imgView .setVisibility(View.INVISIBLE);
        imgView = (ImageView) findViewById(R.id.hat);
        imgView .setVisibility(View.INVISIBLE);
        imgView = (ImageView) findViewById(R.id.mouth);
        imgView .setVisibility(View.INVISIBLE);
        imgView = (ImageView) findViewById(R.id.mustache);
        imgView .setVisibility(View.INVISIBLE);
        imgView = (ImageView) findViewById(R.id.nose);
        imgView .setVisibility(View.INVISIBLE);
        imgView = (ImageView) findViewById(R.id.shoes);
        imgView .setVisibility(View.INVISIBLE);
    }
}
