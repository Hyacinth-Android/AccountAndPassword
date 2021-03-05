package com.example.accountpassword;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MsgAdapter extends RecyclerView.Adapter<MsgAdapter.ViewHolder>{

    private List<Msg> mList;

    /**
     * 首先定义了一个内部类 ViewHolder，继承自 RecyclerView.ViewHolder
     * 然后 ViewHolder 的构造函数中要传入一个 View 参数
     * 这个参数通常就是 RecyclerView 子项的最外层布局（msg_item.xml）
     * 最后，通过 View 的 findViewById() 方法来获取到布局中的 ImageView 和 TextView 的实例
     */
    static class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView img;
        private TextView account;
        private TextView password;
        private TextView bind;

        public ViewHolder(@NonNull View view) {
            super(view);
            img = view.findViewById(R.id.img_head);
            account = view.findViewById(R.id.account);
            password = view.findViewById(R.id.password);
            bind = view.findViewById(R.id.bind);
        }
    }

    /**
     *  该方法用于把要展示的数据源传进来，并赋值给变量 mList
     *  后续操作都将在这个数据源的基础上进行
     */
    public MsgAdapter(List<Msg> list){
        mList = list;
    }

    /**
     *  onCreateViewHolder()方法用于创建 ViewHolder 实例
     *  在这个方法中，将 msg_item 布局加载进来，然后创建一个 ViewHolder 实例
     *  并把加载出来的布局传入到构造函数中，最后将 ViewHolder 实例返回
     */
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.msg_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    /**
     *  onBindViewHolder() 方法用于对 RecyclerView 子项的数据进行赋值
     *  会在每个子项被滚动到屏幕内的时候执行
     *  这里通过 position 参数得到当前项的 Msg 实例
     *  然后再将数据设置到 ViewHolder 的 ImageView 和 TextView 当中
     */
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Msg msg = mList.get(position);
        holder.img.setImageResource(msg.getImg());
        holder.account.setText(msg.getAccount());
        holder.password.setText(msg.getPassword());
        holder.bind.setText(msg.getBind());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

}
