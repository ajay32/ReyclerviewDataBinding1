package com.ajay.databindingexamples.Adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ajay.databindingexamples.BR;
import com.ajay.databindingexamples.Model.CategoryObject;
import com.ajay.databindingexamples.R;

import java.util.List;
public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>{

    private Context context;
    private List<CategoryObject> categoryObjectList;

    public CategoryAdapter(Context context, List<CategoryObject> categoryObjectList) {
        this.context = context;
        this.categoryObjectList = categoryObjectList;
    }
    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.category_list, parent, false);
        return new CategoryViewHolder(view);
    }
    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {
        //here is our category class object
        final CategoryObject categoryObject = categoryObjectList.get(position);
        holder.getBindings().setVariable(BR.category, categoryObject);
        holder.getBindings().executePendingBindings();
    }
    @Override
    public int getItemCount() {
        return categoryObjectList.size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding bindings;
        public CategoryViewHolder(View itemView) {
            super(itemView);
            //with this binding technique we can bind any item
            bindings = DataBindingUtil.bind(itemView);   //we are not binding adapter xml file but here we are binding itemview
        }
        public ViewDataBinding getBindings(){
            return bindings;
        }
    }
}