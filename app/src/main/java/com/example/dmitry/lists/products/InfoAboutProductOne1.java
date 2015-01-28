package com.example.dmitry.lists.products;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dmitry.lists.info_screens.InfoScreenOne1;
import com.example.dmitry.lists.R;

/**
 * Created by Dmitry on 20.01.2015.Product one - Number 1
 */
public class InfoAboutProductOne1 extends ActionBarActivity {

    // инициализируем переменные для добавления в них ресурсов для продукта из файла
    String mProductName;
    String mProductId;
    String mProductDescription;
    Drawable mProductImage;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product1info);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        // создадим и добавим в новые переменные массивы данных
        String[] mProductArrayNames = getResources().getStringArray(R.array.telephone_names);
        String[] mProductArrayIds = getResources().getStringArray(R.array.telephone_ids);

        // выберим из массивов нужные данные, подставим их, и изменим отображаемый текст
        mProductName = mProductArrayNames[0];
        mProductId = mProductArrayIds[0];
        mProductDescription = getResources().getString(R.string.telephone_htc_descripton);
        mProductImage = getResources().getDrawable(R.drawable.htc_product_one);

        // имя продукта
        TextView ChangeTextName = (TextView)findViewById(R.id.textName1);
        ChangeTextName.setText(mProductName);
        // ID продукта
        TextView ChangeTextId = (TextView)findViewById(R.id.textId1);
        ChangeTextId.setText(mProductId);
        // Описание продукта
        TextView ChangeTextDescription = (TextView)findViewById(R.id.ReviewInfo2);
        ChangeTextDescription.setText(mProductDescription);
        // Изображение продукта
        ImageView ChangeImage = (ImageView)findViewById(R.id.imagePhone1);
        ChangeImage.setImageDrawable(mProductImage);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_product, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Intent intent = new Intent(InfoAboutProductOne1.this, InfoScreenOne1.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Информация о компании", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_settings:
                Toast.makeText(getApplicationContext(), "Нечего настраивать", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
