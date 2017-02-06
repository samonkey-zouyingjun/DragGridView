package com.zouyingjun.samonkey.draggridview;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private Draggridview ddv;
    private int[] imgs = {R.drawable.default_ptr_flip,R.drawable.default_ptr_rotate,R.drawable.dialog_bg,
            R.drawable.ic_closedpic,R.drawable.icon_addpic_unfocused,R.mipmap.ic_launcher};
//    private ImageAdapter sa;
    private GridViewAdapter sa;
    private List<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intData();
        intView();
    }

    private void intData() {
        list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
    }


    private void intView() {
        ddv = (Draggridview) findViewById(R.id.noScrollgridview);
        sa = new GridViewAdapter(this,list);
        ddv.setAdapter(sa);
    }

}
