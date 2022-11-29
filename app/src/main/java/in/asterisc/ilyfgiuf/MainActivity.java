package in.asterisc.ilyfgiuf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import soup.neumorphism.NeumorphButton;

public class MainActivity extends AppCompatActivity {

    NeumorphButton btnone,btntwo,btnthree,btnfour,btnfive,btnsix,btnseven,btneight,btnnine,btnzero,btnpoint,btnequal,btnplus,btnminus,btnmul,btndiv,btnper,btnalld;
    EditText btntextview;

    Switch btnswitch;

    public static final String MyPREFERENCES = "nightModeprefs";
    public static final String KEY_ISNIGHTMODE = "idNightMode";
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnone = findViewById(R.id.btnOne);
        btntwo = findViewById(R.id.btnTwo);
        btnthree = findViewById(R.id.btnThree);
        btnfour = findViewById(R.id.btnFour);
        btnfive = findViewById(R.id.btnFive);
        btnsix = findViewById(R.id.btnSix);
        btnseven = findViewById(R.id.btnSeven);
        btneight = findViewById(R.id.btnEight);
        btnnine = findViewById(R.id.btnNine);
        btnzero= findViewById(R.id.btnZero);
        btntextview = findViewById(R.id.TexTview);

        btnplus = findViewById(R.id.btnPlus);
        btnminus = findViewById(R.id.btnMinus);
        btnmul = findViewById(R.id.btnMultiply);
        btndiv = findViewById(R.id.btndivision);
        btnpoint = findViewById(R.id.btnPoint);
        btnper = findViewById(R.id.btnPrecentage);
        btnalld = findViewById(R.id.btnAlldelete);

        btnone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btntextview.setText(btntextview.getText() + "1");
            }
        });
        btntwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btntextview.setText(btntextview.getText() + "2");
            }
        });
        btnthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btntextview.setText(btntextview.getText() + "3");
            }
        });
        btnfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btntextview.setText(btntextview.getText() + "4");
            }
        });
        btnfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btntextview.setText(btntextview.getText() + "5");
            }
        });
        btnsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btntextview.setText(btntextview.getText() + "6");
            }
        });
        btnseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btntextview.setText(btntextview.getText() + "7");
            }
        });
        btneight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btntextview.setText(btntextview.getText() + "8");
            }
        });
        btnnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btntextview.setText(btntextview.getText() + "9");
            }
        });
        btnzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btntextview.setText(btntextview.getText() + "0");
            }
        });
        btnpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btntextview.setText(btntextview.getText() + ".");
            }
        });
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btntextview.setText(btntextview.getText() + "+");
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btntextview.setText(btntextview.getText() + "-");
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btntextview.setText(btntextview.getText() + "×");
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btntextview.setText(btntextview.getText() + "÷");
            }
        });
        btnper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btntextview.setText(btntextview.getText() + "%");
            }
        });
        btnalld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btntextview.setText(null);
            }
        });

        sharedPreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        btnswitch = findViewById(R.id.switchbtn);

        checkNightModeActivated();

        btnswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    saveNightModeState(true);
                    recreate();
                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    saveNightModeState(false);
                    recreate();
                }
            }
        });
    }

    private void saveNightModeState(boolean nightmode) {
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean(KEY_ISNIGHTMODE, nightmode);

        editor.apply();
    }

    public void checkNightModeActivated() {
        if (sharedPreferences.getBoolean(KEY_ISNIGHTMODE, false)) {
            btnswitch.setChecked(true);
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            btnswitch.setChecked(false);
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }
}
