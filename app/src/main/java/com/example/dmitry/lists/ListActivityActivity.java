package com.example.dmitry.lists;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import android.widget.AdapterView.OnItemClickListener;

import android.widget.Toast;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import android.content.Intent;

import com.example.dmitry.lists.products.AcerProductFive5;
import com.example.dmitry.lists.products.AlcatelProductTwo2;
import com.example.dmitry.lists.products.AppleProductThree3;
import com.example.dmitry.lists.products.AsusProductSix6;
import com.example.dmitry.lists.products.DnsProductFour4;
import com.example.dmitry.lists.products.ExplayProductSeven7;
import com.example.dmitry.lists.products.HuaweiProductTen10;
import com.example.dmitry.lists.products.InfoAboutProductOne1;
import com.example.dmitry.lists.products.LenovoProductEight8;
import com.example.dmitry.lists.products.LgProductNine9;
import com.example.dmitry.lists.products.NokiaProductEleven11;
import com.example.dmitry.lists.products.SamsungProductTwelve12;
import com.example.dmitry.lists.products.SonyProductThirteen13;
import com.example.dmitry.lists.products.ZteProductFourteen14;

public class ListActivityActivity extends ActionBarActivity {

    // Присваиваем имена атрибутов для Map "наследников". Каждый Map содержит данные для соответствующего пункта списка
    final String ATTRIBUTE_NAME_TEXT = "name";
    final String ATTRIBUTE_NAME_SUBTEXT = "id";

    // инициализируем переменную списка (для адаптера)
    ListView lvSimple;

    // Вызывается при создании активности
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.phone_logo);
        actionBar.setDisplayUseLogoEnabled(true);


        // Инициализируем массивы данных
        final String[] array_names = getResources().getStringArray(R.array.telephone_names);
        String[] array_ids = getResources().getStringArray(R.array.telephone_ids);

        // Упаковываем данные в понятную структуру для адаптера
        ArrayList<Map<String, Object>> data = new ArrayList<Map<String, Object>>(array_names.length);
        Map<String, Object> m;
        for (int i = 0; i < array_names.length; i++) {
            m = new HashMap<String, Object>();
            m.put(ATTRIBUTE_NAME_TEXT, array_names[i]);
            m.put(ATTRIBUTE_NAME_SUBTEXT, array_ids[i]);
            data.add(m);
        }

        // массив имен аттрибутов, из которых будут читаться данные
        String[] from = { ATTRIBUTE_NAME_TEXT, ATTRIBUTE_NAME_SUBTEXT };
        // массив ID View-компонентов, в которые будут вставляться данные
        int[] to = { R.id.text, R.id.tvText };

        // создаем адаптер
        final SimpleAdapter sAdapter = new SimpleAdapter(this, data, R.layout.custom_list_activity_view, from, to);

        // определяем список и присваиваем ему адаптер
        lvSimple = (ListView)findViewById(R.id.lvSimple);
        lvSimple.setAdapter(sAdapter);

        // создаем обработчик нажатия на пункт из списка
        lvSimple.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int item0 = 0, item1 = 1, item2 = 2, item3 = 3, item4 = 4, item5 = 5, item6 = 6, item7 = 7, item8 = 8, item9 = 9, item10 = 10, item11 = 11, item12 = 12, item13 = 13;

                if (position == item0) {
                    Intent intentOne = new Intent(ListActivityActivity.this, InfoAboutProductOne1.class);
                    startActivity(intentOne);
                    Toast.makeText(getApplicationContext(), "Переход на страницу 'О продукте'", Toast.LENGTH_SHORT).show();
                } else if (position == item1) {
                    Intent intentTwo = new Intent(ListActivityActivity.this, AlcatelProductTwo2.class);
                    startActivity(intentTwo);
                    Toast.makeText(getApplicationContext(), "Переход на страницу 'О продукте'", Toast.LENGTH_SHORT).show();
                } else if (position == item2) {
                    Intent intentThree = new Intent(ListActivityActivity.this, AppleProductThree3.class);
                    startActivity(intentThree);
                    Toast.makeText(getApplicationContext(), "Переход на страницу 'О продукте'", Toast.LENGTH_SHORT).show();
                } else if (position == item3) {
                    Intent intentFour = new Intent(ListActivityActivity.this, DnsProductFour4.class);
                    startActivity(intentFour);
                    Toast.makeText(getApplicationContext(), "Переход на страницу 'О продукте'", Toast.LENGTH_SHORT).show();
                } else if (position == item4) {
                    Intent intentFive = new Intent(ListActivityActivity.this, AcerProductFive5.class);
                    startActivity(intentFive);
                    Toast.makeText(getApplicationContext(), "Переход на страницу 'О продукте'", Toast.LENGTH_SHORT).show();
                } else if (position == item5) {
                    Intent intentSix = new Intent(ListActivityActivity.this, AsusProductSix6.class);
                    startActivity(intentSix);
                    Toast.makeText(getApplicationContext(), "Переход на страницу 'О продукте'", Toast.LENGTH_SHORT).show();
                } else if (position == item6) {
                    Intent intentSeven = new Intent(ListActivityActivity.this, ExplayProductSeven7.class);
                    startActivity(intentSeven);
                    Toast.makeText(getApplicationContext(), "Переход на страницу 'О продукте'", Toast.LENGTH_SHORT).show();
                } else if (position == item7) {
                    Intent intentEight = new Intent(ListActivityActivity.this, LenovoProductEight8.class);
                    startActivity(intentEight);
                    Toast.makeText(getApplicationContext(), "Переход на страницу 'О продукте'", Toast.LENGTH_SHORT).show();
                } else if (position == item8) {
                    Intent intentNine = new Intent(ListActivityActivity.this, LgProductNine9.class);
                    startActivity(intentNine);
                    Toast.makeText(getApplicationContext(), "Переход на страницу 'О продукте'", Toast.LENGTH_SHORT).show();
                } else if (position == item9) {
                    Intent intentTen = new Intent(ListActivityActivity.this, HuaweiProductTen10.class);
                    startActivity(intentTen);
                    Toast.makeText(getApplicationContext(), "Переход на страницу 'О продукте'", Toast.LENGTH_SHORT).show();
                } else if (position == item10) {
                    Intent intentEleven = new Intent(ListActivityActivity.this, NokiaProductEleven11.class);
                    startActivity(intentEleven);
                    Toast.makeText(getApplicationContext(), "Переход на страницу 'О продукте'", Toast.LENGTH_SHORT).show();
                } else if (position == item11) {
                    Intent intentTwelve = new Intent(ListActivityActivity.this, SamsungProductTwelve12.class);
                    startActivity(intentTwelve);
                    Toast.makeText(getApplicationContext(), "Переход на страницу 'О продукте'", Toast.LENGTH_SHORT).show();
                } else if (position == item12) {
                    Intent intentThirteen = new Intent(ListActivityActivity.this, SonyProductThirteen13.class);
                    startActivity(intentThirteen);
                    Toast.makeText(getApplicationContext(), "Переход на страницу 'О продукте'", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intentFourteen = new Intent(ListActivityActivity.this, ZteProductFourteen14.class);
                    startActivity(intentFourteen);
                    Toast.makeText(getApplicationContext(), "Переход на страницу 'О продукте'", Toast.LENGTH_SHORT).show();
                }
                }
            });
        }

    // вызывается при создании меню/action bar'а и подгружает xml-разметку
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // обработчик нажатия на пункт из action bar'а
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Toast.makeText(getApplicationContext(), "Нечего настраивать", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itemCloseApp:
                finish();
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}

