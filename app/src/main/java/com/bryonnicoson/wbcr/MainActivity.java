package com.bryonnicoson.wbcr;

import android.support.v7.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;

public class MainActivity extends AppCompatActivity  {
//implements View.OnClickListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // custom font implementation for title
        SpannableString s = new SpannableString("WishBone Canine Rescue");
        s.setSpan(new TypefaceSpan(this, "Balham.otf"), 0, s.length(),
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        // Update the action bar title with the TypefaceSpan instance
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(s);

//        findViewById(R.id.bottom_nav_adopt).setOnClickListener(this);
//        findViewById(R.id.bottom_nav_donate).setOnClickListener(this);
//        findViewById(R.id.bottom_nav_foster).setOnClickListener(this);
//        findViewById(R.id.bottom_nav_volunteer).setOnClickListener(this);
    }

//    @Override
//    public void onClick(View v) {
//        Class c = null;
//
//        switch (v.getId()) {
//            case R.id.bottom_nav_adopt:
//                c = Adopt.class;
//                break;
//            case R.id.bottom_nav_donate:
//                c = Donate.class;
//                break;
//            case R.id.bottom_nav_foster:
//                c = Foster.class;
//                break;
//            case R.id.bottom_nav_volunteer:
//                c = Volunteer.class;
//                break;
//        }
//        startActivity(new Intent(this, c));
//    }
}
