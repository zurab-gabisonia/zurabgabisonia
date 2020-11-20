package com.example.zurabgabisonia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}public void OnButtonClicked(View view){
    EditText FirstName = (EditText) findViewById(R.id.FNEditText);
    EditText LastName = (EditText) findViewById(R.id.LNEditText);
    EditText Age = (EditText) findViewById(R.id.AgeEditText);
    if(FirstName.getText().toString().isEmpty() || LastName.getText().toString().isEmpty() || age.getText().toString().isEmpty()){
      Toast.makeText(context:this,text:"Please fill all fields", Toast.LENGTH_SHORT).show();
    }
    else if(Integer.parseInt(Age.getText().toString()) < 1 ){
        Toast.makeText(context:this, text:"CAn't enter anything below one", Toast.LENGTH_SHORT)show();
        Age.setText("");
    }
    else if (Integer.parseInt(Age.getText().tostring()) <10){
    Toast.makeText(context);this, text:"Must be 10 or older", Toast.LENGTH_SHORT).show();
    Age.setText("");
}
 else{
     Toast.makeText(context:this, text:"Registration successful",Toast.LENGTH_SHORT).show();
     User NewUser = new(FirsName.getText().tostring(),LastName.getText().toString(),Integer.parseInt(Age,getText().toString)));

 }
    public class Car {
        private String model;
        private String manufacturer;
        private int doi;

        public Car(String Model, String Manufacturer, int Doi){
            model = Model;
            manufacturer= Manufacturer;
            doi = Doi;
        }
