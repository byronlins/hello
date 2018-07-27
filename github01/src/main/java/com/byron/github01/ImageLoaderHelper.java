package com.byron.github01;

import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.net.URI;

/*
 * File: ImageLoaderHelper.java
 * Author: linbc
 * Version: V1.0.0
 * Create: 2018/7/27 16:05
 * Changes (from 2018/7/27)
 */
public class ImageLoaderHelper {

    public static void load (Context c, String path, ImageView imageView){
        Glide.with(c).load( path).into(imageView);
    }

}
