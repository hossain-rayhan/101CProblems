package com.appsfacto.hundred_one_c_problems;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.appsfacto.hundred_one_c_problems.helper.Constant;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tvChapterName_1, tvChapterName_2,tvChapterName_3,tvChapterName_4,tvChapterName_5,tvChapterName_6,
            tvChapterName_7,tvChapterName_8,tvChapterName_9,tvChapterName_10,tvChapterName_11,tvChapterName_12;
    TextView tvChapterNo_1, tvChapterNo_2, tvChapterNo_3, tvChapterNo_4, tvChapterNo_5, tvChapterNo_6,
            tvChapterNo_7, tvChapterNo_8, tvChapterNo_9, tvChapterNo_10, tvChapterNo_11, tvChapterNo_12;
    TextView tvRange_1, tvRange_2, tvRange_3, tvRange_4, tvRange_5, tvRange_6, tvRange_7, tvRange_8, tvRange_9,
            tvRange_10, tvRange_11, tvRange_12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_action_circle_icon);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.bg_chapter_1)));

        // Font path
        String fontPath = "fonts/comic.ttf";
        // Loading Font Face
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);

        View grid_1 = findViewById(R.id.grid_1);
        grid_1.setOnClickListener(this);
        tvChapterName_1 = (TextView)grid_1.findViewById(R.id.tv_chapter_name);
        tvChapterName_1.setText(getResources().getString(R.string.chapter_name_1));
        tvChapterName_1.setTypeface(tf);
        tvChapterNo_1 = (TextView)grid_1.findViewById(R.id.tv_chatper_no);
        tvChapterNo_1.setText(getResources().getString(R.string._01));
        GradientDrawable sd1 = (GradientDrawable) tvChapterNo_1.getBackground().mutate();
        sd1.setColor(getResources().getColor(R.color.round_shape_chapter_1));
        sd1.invalidateSelf();
        tvRange_1 = (TextView)grid_1.findViewById(R.id.tv_problem_range);
        tvRange_1.setText(getResources().getString(R.string.problem_01_05));
        tvRange_1.setBackgroundColor(getResources().getColor(R.color.problem_range_chapter_1));
        grid_1.setBackgroundDrawable(getResources().getDrawable(R.drawable.selector_chapter_tiles_1));

        View grid_2 = findViewById(R.id.grid_2);
        grid_2.setOnClickListener(this);
        tvChapterName_2 = (TextView)grid_2.findViewById(R.id.tv_chapter_name);
        tvChapterName_2.setText(getResources().getString(R.string.chapter_name_2));
        tvChapterName_2.setTypeface(tf);
        tvChapterNo_2 = (TextView)grid_2.findViewById(R.id.tv_chatper_no);
        tvChapterNo_2.setText(getResources().getString(R.string._02));
        GradientDrawable sd2 = (GradientDrawable) tvChapterNo_2.getBackground().mutate();
        sd2.setColor(getResources().getColor(R.color.round_shape_chapter_2));
        sd2.invalidateSelf();
        tvRange_2 = (TextView)grid_2.findViewById(R.id.tv_problem_range);
        tvRange_2.setText(getResources().getString(R.string.problem_06_12));
        tvRange_2.setBackgroundColor(getResources().getColor(R.color.problem_range_chapter_2));
        grid_2.setBackgroundDrawable(getResources().getDrawable(R.drawable.selector_chapter_tiles_2));

        View grid_3 = findViewById(R.id.grid_3);
        grid_3.setOnClickListener(this);
        tvChapterName_3 = (TextView)grid_3.findViewById(R.id.tv_chapter_name);
        tvChapterName_3.setText(getResources().getString(R.string.chapter_name_3));
        tvChapterName_3.setTypeface(tf);
        tvChapterNo_3 = (TextView)grid_3.findViewById(R.id.tv_chatper_no);
        tvChapterNo_3.setText(getResources().getString(R.string._03));
        GradientDrawable sd3 = (GradientDrawable) tvChapterNo_3.getBackground().mutate();
        sd3.setColor(getResources().getColor(R.color.round_shape_chapter_3));
        sd3.invalidateSelf();
        tvRange_3 = (TextView)grid_3.findViewById(R.id.tv_problem_range);
        tvRange_3.setText(getResources().getString(R.string.problem_13_15));
        tvRange_3.setBackgroundColor(getResources().getColor(R.color.problem_range_chapter_3));
        grid_3.setBackgroundDrawable(getResources().getDrawable(R.drawable.selector_chapter_tiles_3));

        View grid_4 = findViewById(R.id.grid_4);
        grid_4.setOnClickListener(this);
        tvChapterName_4 = (TextView)grid_4.findViewById(R.id.tv_chapter_name);
        tvChapterName_4.setText(getResources().getString(R.string.chapter_name_4));
        tvChapterName_4.setTypeface(tf);
        tvChapterNo_4 = (TextView)grid_4.findViewById(R.id.tv_chatper_no);
        tvChapterNo_4.setText(getResources().getString(R.string._04));
        GradientDrawable sd4 = (GradientDrawable) tvChapterNo_4.getBackground().mutate();
        sd4.setColor(getResources().getColor(R.color.round_shape_chapter_4));
        sd4.invalidateSelf();
        tvRange_4 = (TextView)grid_4.findViewById(R.id.tv_problem_range);
        tvRange_4.setText(getResources().getString(R.string.problem_16_25));
        tvRange_4.setBackgroundColor(getResources().getColor(R.color.problem_range_chapter_4));
        grid_4.setBackgroundDrawable(getResources().getDrawable(R.drawable.selector_chapter_tiles_4));

        View grid_5 = findViewById(R.id.grid_5);
        grid_5.setOnClickListener(this);
        tvChapterName_5 = (TextView)grid_5.findViewById(R.id.tv_chapter_name);
        tvChapterName_5.setText(getResources().getString(R.string.chapter_name_5));
        tvChapterName_5.setTypeface(tf);
        tvChapterNo_5 = (TextView)grid_5.findViewById(R.id.tv_chatper_no);
        tvChapterNo_5.setText(getResources().getString(R.string._05));
        GradientDrawable sd5 = (GradientDrawable) tvChapterNo_5.getBackground().mutate();
        sd5.setColor(getResources().getColor(R.color.round_shape_chapter_5));
        sd5.invalidateSelf();
        tvRange_5 = (TextView)grid_5.findViewById(R.id.tv_problem_range);
        tvRange_5.setText(getResources().getString(R.string.problem_26_43));
        tvRange_5.setBackgroundColor(getResources().getColor(R.color.problem_range_chapter_5));
        grid_5.setBackgroundDrawable(getResources().getDrawable(R.drawable.selector_chapter_tiles_5));


        View grid_6 = findViewById(R.id.grid_6);
        grid_6.setOnClickListener(this);
        tvChapterName_6 = (TextView)grid_6.findViewById(R.id.tv_chapter_name);
        tvChapterName_6.setText(getResources().getString(R.string.chapter_name_6));
        tvChapterName_6.setTypeface(tf);
        tvChapterNo_6 = (TextView)grid_6.findViewById(R.id.tv_chatper_no);
        tvChapterNo_6.setText(getResources().getString(R.string._06));
        GradientDrawable sd6 = (GradientDrawable) tvChapterNo_6.getBackground().mutate();
        sd6.setColor(getResources().getColor(R.color.round_shape_chapter_6));
        sd6.invalidateSelf();
        tvRange_6 = (TextView)grid_6.findViewById(R.id.tv_problem_range);
        tvRange_6.setText(getResources().getString(R.string.problem_44_53));
        tvRange_6.setBackgroundColor(getResources().getColor(R.color.problem_range_chapter_6));
        grid_6.setBackgroundDrawable(getResources().getDrawable(R.drawable.selector_chapter_tiles_6));

        View grid_7 = findViewById(R.id.grid_7);
        grid_7.setOnClickListener(this);
        tvChapterName_7 = (TextView)grid_7.findViewById(R.id.tv_chapter_name);
        tvChapterName_7.setText(getResources().getString(R.string.chapter_name_7));
        tvChapterName_7.setTypeface(tf);
        tvChapterNo_7 = (TextView)grid_7.findViewById(R.id.tv_chatper_no);
        tvChapterNo_7.setText(getResources().getString(R.string._07));
        GradientDrawable sd7 = (GradientDrawable) tvChapterNo_7.getBackground().mutate();
        sd7.setColor(getResources().getColor(R.color.round_shape_chapter_7));
        sd7.invalidateSelf();
        tvRange_7 = (TextView)grid_7.findViewById(R.id.tv_problem_range);
        tvRange_7.setText(getResources().getString(R.string.problem_54_63));
        tvRange_7.setBackgroundColor(getResources().getColor(R.color.problem_range_chapter_7));
        grid_7.setBackgroundDrawable(getResources().getDrawable(R.drawable.selector_chapter_tiles_7));

        View grid_8 = findViewById(R.id.grid_8);
        grid_8.setOnClickListener(this);
        tvChapterName_8 = (TextView)grid_8.findViewById(R.id.tv_chapter_name);
        tvChapterName_8.setText(getResources().getString(R.string.chapter_name_8));
        tvChapterName_8.setTypeface(tf);
        tvChapterNo_8 = (TextView)grid_8.findViewById(R.id.tv_chatper_no);
        tvChapterNo_8.setText(getResources().getString(R.string._08));
        GradientDrawable sd8 = (GradientDrawable) tvChapterNo_8.getBackground().mutate();
        sd8.setColor(getResources().getColor(R.color.round_shape_chapter_8));
        sd8.invalidateSelf();
        tvRange_8 = (TextView)grid_8.findViewById(R.id.tv_problem_range);
        tvRange_8.setText(getResources().getString(R.string.problem_64_73));
        tvRange_8.setBackgroundColor(getResources().getColor(R.color.problem_range_chapter_8));
        grid_8.setBackgroundDrawable(getResources().getDrawable(R.drawable.selector_chapter_tiles_8));

        View grid_9 = findViewById(R.id.grid_9);
        grid_9.setOnClickListener(this);
        tvChapterName_9 = (TextView)grid_9.findViewById(R.id.tv_chapter_name);
        tvChapterName_9.setText(getResources().getString(R.string.chapter_name_9));
        tvChapterName_9.setTypeface(tf);
        tvChapterNo_9 = (TextView)grid_9.findViewById(R.id.tv_chatper_no);
        tvChapterNo_9.setText(getResources().getString(R.string._09));
        GradientDrawable sd9 = (GradientDrawable) tvChapterNo_9.getBackground().mutate();
        sd9.setColor(getResources().getColor(R.color.round_shape_chapter_9));
        sd9.invalidateSelf();
        tvRange_9 = (TextView)grid_9.findViewById(R.id.tv_problem_range);
        tvRange_9.setText(getResources().getString(R.string.problem_74_80));
        tvRange_9.setBackgroundColor(getResources().getColor(R.color.problem_range_chapter_9));
        grid_9.setBackgroundDrawable(getResources().getDrawable(R.drawable.selector_chapter_tiles_9));

        View grid_10 = findViewById(R.id.grid_10);
        grid_10.setOnClickListener(this);
        tvChapterName_10 = (TextView)grid_10.findViewById(R.id.tv_chapter_name);
        tvChapterName_10.setText(getResources().getString(R.string.chapter_name_10));
        tvChapterName_10.setTypeface(tf);
        tvChapterNo_10 = (TextView)grid_10.findViewById(R.id.tv_chatper_no);
        tvChapterNo_10.setText(getResources().getString(R.string._10));
        GradientDrawable sd10 = (GradientDrawable) tvChapterNo_10.getBackground().mutate();
        sd10.setColor(getResources().getColor(R.color.round_shape_chapter_10));
        sd10.invalidateSelf();
        tvRange_10 = (TextView)grid_10.findViewById(R.id.tv_problem_range);
        tvRange_10.setText(getResources().getString(R.string.problem_81_85));
        tvRange_10.setBackgroundColor(getResources().getColor(R.color.problem_range_chapter_10));
        grid_10.setBackgroundDrawable(getResources().getDrawable(R.drawable.selector_chapter_tiles_10));

        View grid_11 = findViewById(R.id.grid_11);
        grid_11.setOnClickListener(this);
        tvChapterName_11 = (TextView)grid_11.findViewById(R.id.tv_chapter_name);
        tvChapterName_11.setText(getResources().getString(R.string.chapter_name_11));
        tvChapterName_11.setTypeface(tf);
        tvChapterNo_11 = (TextView)grid_11.findViewById(R.id.tv_chatper_no);
        tvChapterNo_11.setText(getResources().getString(R.string._11));
        GradientDrawable sd11 = (GradientDrawable) tvChapterNo_11.getBackground().mutate();
        sd11.setColor(getResources().getColor(R.color.round_shape_chapter_11));
        sd11.invalidateSelf();
        tvRange_11 = (TextView)grid_11.findViewById(R.id.tv_problem_range);
        tvRange_11.setText(getResources().getString(R.string.problem_86_90));
        tvRange_11.setBackgroundColor(getResources().getColor(R.color.problem_range_chapter_11));
        grid_11.setBackgroundDrawable(getResources().getDrawable(R.drawable.selector_chapter_tiles_11));

        View grid_12 = findViewById(R.id.grid_12);
        grid_12.setOnClickListener(this);
        tvChapterName_12 = (TextView)grid_12.findViewById(R.id.tv_chapter_name);
        tvChapterName_12.setText(getResources().getString(R.string.chapter_name_12));
        tvChapterName_12.setTypeface(tf);
        tvChapterNo_12 = (TextView)grid_12.findViewById(R.id.tv_chatper_no);
        tvChapterNo_12.setText(getResources().getString(R.string._12));
        GradientDrawable sd12 = (GradientDrawable) tvChapterNo_12.getBackground().mutate();
        sd12.setColor(getResources().getColor(R.color.round_shape_chapter_12));
        sd12.invalidateSelf();
        tvRange_12 = (TextView)grid_12.findViewById(R.id.tv_problem_range);
        tvRange_12.setText(getResources().getString(R.string.problem_91_100));
        tvRange_12.setBackgroundColor(getResources().getColor(R.color.problem_range_chapter_12));
        grid_12.setBackgroundDrawable(getResources().getDrawable(R.drawable.selector_chapter_tiles_12));
    }

    @Override
    public void onClick(View view) {
        Intent i;
       switch (view.getId()) {
            case R.id.grid_1:
                i = new Intent(this, ChapterActivity.class);
                i.putExtra(Constant.GRID_NO, 1);
                i.putExtra(Constant.TITLE,"Play with Printf()");
                startActivity(i);
                break;

            case R.id.grid_2:
                i = new Intent(this, ChapterActivity.class);
                i.putExtra(Constant.GRID_NO, 2);
                i.putExtra(Constant.TITLE,"Data Type and Variables");
                startActivity(i);
                break;

            case R.id.grid_3:
                i = new Intent(this, ChapterActivity.class);
                i.putExtra(Constant.GRID_NO, 3);
                i.putExtra(Constant.TITLE,"User Input Scanf()");
                startActivity(i);
                break;

            case R.id.grid_4:
                i = new Intent(this, ChapterActivity.class);
                i.putExtra(Constant.GRID_NO, 4);
                i.putExtra(Constant.TITLE,"Apply Your Conditions");
                startActivity(i);
                break;

            case R.id.grid_5:
                i = new Intent(this, ChapterActivity.class);
                i.putExtra(Constant.GRID_NO, 5);
                i.putExtra(Constant.TITLE,"Magic Of Loop");
                startActivity(i);
                break;

            case R.id.grid_6:
                i = new Intent(this, ChapterActivity.class);
                i.putExtra(Constant.GRID_NO, 6);
                i.putExtra(Constant.TITLE,"Uses Of Array");
                startActivity(i);
                break;
           case R.id.grid_7:
               i = new Intent(this, ChapterActivity.class);
               i.putExtra(Constant.GRID_NO, 7);
               i.putExtra(Constant.TITLE,"Fun Of Function");
               startActivity(i);
               break;

           case R.id.grid_8:
               i = new Intent(this, ChapterActivity.class);
               i.putExtra(Constant.GRID_NO, 8);
               i.putExtra(Constant.TITLE,"Start With String");
               startActivity(i);
               break;

           case R.id.grid_9:
               i = new Intent(this, ChapterActivity.class);
               i.putExtra(Constant.GRID_NO, 9);
               i.putExtra(Constant.TITLE,"Pointer de Complexity");
               startActivity(i);
               break;

           case R.id.grid_10:
               i = new Intent(this, ChapterActivity.class);
               i.putExtra(Constant.GRID_NO, 10);
               i.putExtra(Constant.TITLE,"Structure And Union");
               startActivity(i);
               break;

           case R.id.grid_11:
               i = new Intent(this, ChapterActivity.class);
               i.putExtra(Constant.GRID_NO, 11);
               i.putExtra(Constant.TITLE,"Basic Of FILE I/O");
               startActivity(i);
               break;

           case R.id.grid_12:
               i = new Intent(this, ChapterActivity.class);
               i.putExtra(Constant.GRID_NO, 12);
               i.putExtra(Constant.TITLE,"Math And Coding");
               startActivity(i);
               break;

            default:
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int menu_id = item.getItemId();
        switch (menu_id) {
            case R.id.action_about:
                startActivity(new Intent(HomeActivity.this, AboutActivity.class));
                break;
            default:
                break;
        }
        return true;
    }
}
