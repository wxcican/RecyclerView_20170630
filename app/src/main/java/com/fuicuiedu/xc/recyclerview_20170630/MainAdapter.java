package com.fuicuiedu.xc.recyclerview_20170630;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * 作者：王小超
 * 邮箱：wxcican@qq.com
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder>{

    private List<String> mData;

    public MainAdapter(List<String> mData){
        this.mData = mData;
    }

    //创建ViewHolder
    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MainViewHolder holder = new MainViewHolder(
                LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view,parent,false));
        return holder;
    }

    //ViewHolder数据绑定
    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {
        holder.textView.setText(mData.get(position));
    }

    //获取列表item数量
    @Override
    public int getItemCount() {
        return mData.size();
    }

    class MainViewHolder extends RecyclerView.ViewHolder{
        TextView textView;

        public MainViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.item_tv);
        }
    }
}
