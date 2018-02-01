package com.example.surjit.androidalertdialogboxs;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AlertDialog.Builder alertDialog;
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void simpleAlertDialogBox(View view) {

        alertDialog = new AlertDialog.Builder(this);

        alertDialog.setTitle(R.string.simple_alert_dialog_box);

        alertDialog.setMessage("This is demo alert dailog box with positive, negative and neutral button.");

        alertDialog.setIcon(R.mipmap.ic_launcher_round);

        alertDialog.setCancelable(false); // if you want to restrict user to dont exit without pressing any one button. By default this method has value true

        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                toast = Toast.makeText(MainActivity.this, "You Clicked No Button", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                toast = Toast.makeText(MainActivity.this, "You Clicked Yes Button", Toast.LENGTH_SHORT);
                toast.show();
            }
        });


        alertDialog.setNeutralButton("Neutral", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                toast = Toast.makeText(MainActivity.this, "You Clicked Neutral Button", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        alertDialog.show();

    }
}
