package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView Text1, Text2;
    CheckBox Chkagree;
    RadioGroup RdoGroup;
    RadioButton RdoDog, RdoCat, RdoRabbit;
    Button BtnOK;
    ImageView ImgPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("애완동물 사진보기");

        Text1 = (TextView) findViewById(R.id.Text1);
        Text2 = (TextView) findViewById(R.id.Text2);
        Chkagree = (CheckBox) findViewById(R.id.Chkagree);
        RdoGroup = (RadioGroup) findViewById(R.id.RdoGroup);
        RdoDog = (RadioButton) findViewById(R.id.RdoDog);
        RdoCat = (RadioButton) findViewById(R.id.RdoCat);
        RdoRabbit = (RadioButton) findViewById(R.id.RdoRabbit);
        BtnOK = (Button) findViewById(R.id.BtnOK);
        ImgPet = (ImageView) findViewById(R.id.ImgPet);


        Chkagree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (Chkagree.isChecked() == true) {
                    Text2.setVisibility(View.VISIBLE);
                    RdoGroup.setVisibility(View.VISIBLE);
                    BtnOK.setVisibility(View.VISIBLE);
                    ImgPet.setVisibility(View.VISIBLE);
                } else {
                    Text2.setVisibility(View.INVISIBLE);
                    RdoGroup.setVisibility(View.INVISIBLE);
                    BtnOK.setVisibility(View.INVISIBLE);
                    ImgPet.setVisibility(View.INVISIBLE);
                }
            }
        });

        BtnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (RdoGroup.getCheckedRadioButtonId()) {
                    case R.id.RdoDog:
                        ImgPet.setImageResource(R.drawable.doge);
                        break;
                    case R.id.RdoCat:
                        ImgPet.setImageResource(R.drawable.cat);
                        break;
                    case R.id.RdoRabbit:
                        ImgPet.setImageResource(R.drawable.rabbit);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "동물 먼저 선택하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}

