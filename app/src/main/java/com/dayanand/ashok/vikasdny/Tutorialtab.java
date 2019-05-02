package com.dayanand.ashok.vikasdny;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
public class Tutorialtab extends AppCompatActivity {





    ListView list;
    private ProgressDialog mReg_progrs;
    private android.support.v7.widget.Toolbar mToolbar;
    final String[] name = new String[]
            {
                    "LCM and HCF ",
                    "Age",
                    "Simplification",
                    "Power,indices and Surds",
                    "Average",
                    "Ratio and Proportion",
                    "Alligation Method & Mixture",
                    "Percentage",
                    "Profit & Loss & Discount",
                    "Simple interest",
                    "Compound interest",
                    "Time and Work 1",
                    "Time and Work 2",
                    "Pipe and Cistern",
                    "Time and Distance",
                    "Boat and Stream",
                    "Boat and Train",
                    "Algebra",
                    "Trigonometry",
                    "Height & Distance",
                    "Geometry 1",
                    "Geometry 2",
                    "Mensuration 2D",
                    "Circle Area",
                    "Mensuration 3D",
                    " Data Interpretion",
                    "Miscellaneous"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorialtab);


        list = (ListView) findViewById(R.id.ls2);
        mToolbar=(android.support.v7.widget.Toolbar)findViewById(R.id.apptoolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Topic list");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        mReg_progrs=new ProgressDialog(this);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.sciencetext, R.id.textView1, name);
        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                String selectedItem =(String)adapterView.getItemAtPosition(i);
                switch (i) {
                    case 0:
                        Intent inr = new Intent(Tutorialtab.this, Lcmandhcf.class);

                        startActivity(inr);
                        break;
                    case 1:
                        Intent inrt = new Intent(Tutorialtab.this, com.dayanand.ashok.vikasdny.Number.class);

                        startActivity(inrt);
                        break;
                    case 2:
                        Intent ine = new Intent(Tutorialtab.this, Simplification.class);

                        startActivity(ine);
                        break;
                    case 3:
                        Intent ind = new Intent(Tutorialtab.this, Power.class);

                        startActivity(ind);
                        break;
                    case 4:
                        Intent inc = new Intent(Tutorialtab.this, Average.class);

                        startActivity(inc);
                        break;
                    case 5:
                        Intent inb = new Intent(Tutorialtab.this, Ratio.class);

                        startActivity(inb);
                        break;
                    case 6:
                        Intent inf= new Intent(Tutorialtab.this, Alligan.class);

                        startActivity(inf);
                        break;
                    case 7:
                        Intent ina = new Intent(Tutorialtab.this, Percentage.class);

                        startActivity(ina);
                        break;
                    case 8:
                        Intent inz = new Intent(Tutorialtab.this, Profit.class);

                        startActivity(inz);
                        break;
                    case 9:
                        Intent  xz= new Intent(Tutorialtab.this, Simpleinterset.class);

                        startActivity(xz);
                        break;
                    case 10:
                        Intent n = new Intent(Tutorialtab.this, Compoundinterset.class);

                        startActivity(n);
                        break;
                    case 11:
                        Intent ic = new Intent(Tutorialtab.this, Timeandwork.class);

                        startActivity(ic);
                        break;
                    case 12:
                        Intent isa = new Intent(Tutorialtab.this, Timeandwork2.class);

                        startActivity(isa);
                        break;
                    case 13:
                        Intent inbp = new Intent(Tutorialtab.this, Pipeand.class);

                        startActivity(inbp);
                        break;
                    case 14:
                        Intent infas= new Intent(Tutorialtab.this, TimeandDistance.class);

                        startActivity(infas);
                        break;
                    case 15:
                        Intent inayu = new Intent(Tutorialtab.this, BoatStream.class);

                        startActivity(inayu);
                        break;
                    case 16:
                        Intent inrrt = new Intent(Tutorialtab.this, Boat.class);

                        startActivity(inrrt);
                        break;
                    case 17:
                        Intent inrtqw = new Intent(Tutorialtab.this, Algebra.class);

                        startActivity(inrtqw);
                        break;
                    case 18:
                        Intent ineo = new Intent(Tutorialtab.this, Trigo1.class);

                        startActivity(ineo);
                        break;
                    case 19:
                        Intent indll = new Intent(Tutorialtab.this, Hightand.class);

                        startActivity(indll);
                        break;
                    case 20:
                        Intent incv = new Intent(Tutorialtab.this, Geometry1.class);

                        startActivity(incv);
                        break;
                    case 21:
                        Intent inbaa = new Intent(Tutorialtab.this, Geometry2.class);

                        startActivity(inbaa);
                        break;
                    case 22:
                        Intent infz= new Intent(Tutorialtab.this, Mensuration1.class);

                        startActivity(infz);
                        break;
                    case 23:
                        Intent inal = new Intent(Tutorialtab.this,Circlearea.class);

                        startActivity(inal);
                        break;

                    case 24:
                        Intent inra = new Intent(Tutorialtab.this, Mensuration2.class);

                        startActivity(inra);
                        break;
                    case 25:
                        Intent inrc = new Intent(Tutorialtab.this, Data.class);

                        startActivity(inrc);
                        break;
                    case 26:
                        Intent ines = new Intent(Tutorialtab.this, Misceelous.class);

                        startActivity(ines);
                        break;




                }

            }


        });

    }
}