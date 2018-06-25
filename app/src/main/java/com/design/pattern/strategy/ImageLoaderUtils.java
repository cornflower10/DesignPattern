package com.design.pattern.strategy;

public class ImageLoaderUtils {
    private ImageLoader imageLoader;
    public ImageLoaderUtils(ImageLoader imageLoader){
        this.imageLoader = imageLoader;
    }
    public void showImage(){
        imageLoader.showImage();
    }
}
