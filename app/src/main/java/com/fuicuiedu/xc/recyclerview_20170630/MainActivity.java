package com.fuicuiedu.xc.recyclerview_20170630;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

//RecyclerView的使用
//1.依赖
//2.布局本件中使用控件
//3.找到控件（findViewByid）
//4.数据（假数据）
//5.设置布局管理器（layoutManager）
//6.适配器适配数据展示

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<String> mDatas;
    private MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        mDatas = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            mDatas.add("第" + i + "条数据");
        }

        //设置布局管理器
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        //设置适配器
        adapter = new MainAdapter(mDatas);
        recyclerView.setAdapter(adapter);

    }
}
