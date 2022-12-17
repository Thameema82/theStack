package com.example.doweb;

public class CategoryModel {
    private String imageurl;
    private String title;

    public CategoryModel(String imageurl, String title) {
        this.imageurl = imageurl;
        this.title = title;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
    // private int sets;


//    public  CategoryModel(){
//        //for firebase
//    }
//
//    public CategoryModel(String name, int sets, String url) {
//        this.name = name;
//        this.sets = sets;
//        this.url = url;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getSets() {
//        return sets;
//    }
//
//    public void setSets(int sets) {
//        this.sets = sets;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//}
