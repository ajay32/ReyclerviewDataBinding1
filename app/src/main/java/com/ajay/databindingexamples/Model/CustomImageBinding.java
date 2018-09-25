package com.ajay.databindingexamples.Model;

import android.databinding.BindingAdapter;
import android.widget.ImageView;
public class CustomImageBinding {

    @BindingAdapter({"android:src"})
    public static void setImageViewResource(ImageView imageView, int resource) {
        imageView.setImageResource(resource);
    }
}