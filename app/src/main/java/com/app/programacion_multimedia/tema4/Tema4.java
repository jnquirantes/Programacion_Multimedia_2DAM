package com.app.programacion_multimedia.tema4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.widget.ImageButton;
import android.widget.PopupMenu;

import com.app.programacion_multimedia.MainActivity;
import com.app.programacion_multimedia.R;
import com.app.programacion_multimedia.adapter.ViewPageAdapter;
import com.google.android.material.tabs.TabLayout;

public class Tema4 extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager2 viewPager2;
    private ViewPageAdapter tabAdapter;
    private ImageButton bDownload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temas);

        viewPager2 = findViewById(R.id.viewpager);

        tabLayout = findViewById(R.id.tabLayout);
        tabAdapter = new ViewPageAdapter(this);
        viewPager2.setAdapter(tabAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        //ERROR al entrar desde StartScreenActivity, no cambia la barra inferior
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });

        bDownload = findViewById(R.id.fabDownload);
        bDownload.setOnClickListener(v -> {

            PopupMenu popup = new PopupMenu(Tema4.this, v);
            MenuInflater inflater = popup.getMenuInflater();
            inflater.inflate(R.menu.descargar, popup.getMenu());
            popup.setOnMenuItemClickListener(item -> {
                switch (item.getItemId()) {
                    case(R.id.mGit):
                        if (tabLayout.getTabAt(1).isSelected()) {
                            Uri webpage = Uri.parse("https://github.com/jnquirantes/Programacion_Multimedia/commit/7c3ebaa3bd67bee4e3902f4361728b1a7a2b1d67?diff=unified#diff-7b4adf3c1c3698ef45a30b259b95b01ef77d3064ae7d5fd7cc55161906fcccab");
                            Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                            startActivity(webIntent);

                        } else if(tabLayout.getTabAt(1).isSelected()) {
                            Uri webpage = Uri.parse("https://github.com/jnquirantes/Programacion_Multimedia/commit/7c3ebaa3bd67bee4e3902f4361728b1a7a2b1d67?diff=unified#diff-27849c997d5314acbe46c4d68ab3196d55a4cba6bae098edb1559861f551324f");
                            Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                            startActivity(webIntent);
                        }
                    break;

                    case(R.id.mDescarga):

                    break;

                    case(R.id.mAbrir):
                    break;
                }
                return false;
            });
            popup.show();
        });
    }



    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        MainActivity.tema4 = false;
        return super.onKeyDown(keyCode, event);
    }
}