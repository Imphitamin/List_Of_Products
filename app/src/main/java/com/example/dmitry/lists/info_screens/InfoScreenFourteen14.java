package com.example.dmitry.lists.info_screens;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dmitry.lists.R;

/**
 * Created by Dmitry on 21.01.2015. Info Screen -> Number 14
 */
public class InfoScreenFourteen14 extends ActionBarActivity {

    final Context context = this;

    String mCompanyName;
    String mCompanySiteText;
    String mCompanySite;
    Drawable mCompanyLogo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product1infoabout);

        mCompanyName = getResources().getString(R.string.zte_company);
        mCompanySiteText = getResources().getString(R.string.go_to_company_site);
        mCompanySite = getResources().getString(R.string.zte_site);
        mCompanyLogo = getResources().getDrawable(R.drawable.zte_logo);


        TextView AddCompanyName = (TextView)findViewById(R.id.textCompany);
        AddCompanyName.setText(mCompanyName);

        TextView AddCompanySiteText = (TextView)findViewById(R.id.webPage1);
        AddCompanySiteText.setText(mCompanySiteText);

        ImageView AddCompanyLogo = (ImageView)findViewById(R.id.imageLogotip1);
        AddCompanyLogo.setImageDrawable(mCompanyLogo);
    }

    public void OnSitClick(View view) {

        // построим новый предупредительный диалог
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage("Открыть сайт в браузере?");
        builder.setCancelable(false);
        builder.setPositiveButton("ОК",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog,
                                        int which) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(mCompanySite));
                        startActivity(browserIntent);
                    }
                });
        builder.setNegativeButton("Отмена",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog,
                                        int which) {
                        dialog.cancel();
                        Toast.makeText(getApplicationContext(), "Отменено пользователем", Toast.LENGTH_SHORT).show();
                    }
                });

        // выводим диалоговое окно
        builder.show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_about_company, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemClose:
                finish();
                Toast.makeText(getApplicationContext(), "Закрыто", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}