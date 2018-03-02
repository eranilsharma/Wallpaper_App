package com.android.wallpaperapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.android.wallpaperapp.R;
import com.android.wallpaperapp.adapter.CategoryImageAdapter;
import com.android.wallpaperapp.adapter.MainCategoryDataAdapter;
import com.android.wallpaperapp.model.MainCategoryImagesModel;

import java.util.ArrayList;

public class allImageActivity extends AppCompatActivity {

    String Category;
    private final String android_image_urls[] = {
            "https://api.learn2crack.com/android/images/donut.png",
            "https://api.learn2crack.com/android/images/eclair.png",
            "https://api.learn2crack.com/android/images/froyo.png",
            "https://api.learn2crack.com/android/images/ginger.png",
            "https://api.learn2crack.com/android/images/honey.png",
            "https://api.learn2crack.com/android/images/icecream.png",
            "https://api.learn2crack.com/android/images/jellybean.png",
            "https://api.learn2crack.com/android/images/kitkat.png",
            "https://api.learn2crack.com/android/images/lollipop.png",
            "https://api.learn2crack.com/android/images/marshmallow.png"
    };

    private final String android_image_urls2[] = {
            "https://api.learn2crack.com/android/images/donut.png",
            "https://api.learn2crack.com/android/images/eclair.png",
            "https://api.learn2crack.com/android/images/froyo.png",
            "https://api.learn2crack.com/android/images/ginger.png",
            "https://api.learn2crack.com/android/images/honey.png",
            "https://api.learn2crack.com/android/images/icecream.png",
            "https://api.learn2crack.com/android/images/jellybean.png",
            "https://api.learn2crack.com/android/images/kitkat.png",
            "https://api.learn2crack.com/android/images/lollipop.png",
            "https://api.learn2crack.com/android/images/marshmallow.png"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_image);
        Intent intent = getIntent();
        if (intent != null) {
            Category = intent.getStringExtra("category");
        } else {
            Toast.makeText(allImageActivity.this, "No images Found", Toast.LENGTH_SHORT).show();
        }
        initViews();
    }

    private void initViews() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView_allimages);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(allImageActivity.this, 2);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<MainCategoryImagesModel> mainCategoryModels = prepareData();
        CategoryImageAdapter adapter = new CategoryImageAdapter(allImageActivity.this, mainCategoryModels);
        recyclerView.setAdapter(adapter);

    }

    private ArrayList<MainCategoryImagesModel> prepareData() {

        ArrayList<MainCategoryImagesModel> main_category_model = new ArrayList<>();
        if (Category.equals("Donut")) {
            for (int i = 0; i < android_image_urls.length; i++) {
                MainCategoryImagesModel mainCategoryModel = new MainCategoryImagesModel();
                //mainCategoryModel.setCategory_name(main_category_model_names[i]);
                mainCategoryModel.setCategory_image_url(android_image_urls[i]);
                main_category_model.add(mainCategoryModel);
            }
        } else if (Category.equals("Eclair")) {
            for (int i = 0; i < android_image_urls2.length; i++) {
                MainCategoryImagesModel mainCategoryModel = new MainCategoryImagesModel();
                //mainCategoryModel.setCategory_name(main_category_model_names[i]);
                mainCategoryModel.setCategory_image_url(android_image_urls2[i]);
                main_category_model.add(mainCategoryModel);
            }

        } else if (Category.equals("Froyo")) {
            for (int i = 0; i < android_image_urls2.length; i++) {
                MainCategoryImagesModel mainCategoryModel = new MainCategoryImagesModel();
                //mainCategoryModel.setCategory_name(main_category_model_names[i]);
                mainCategoryModel.setCategory_image_url(android_image_urls2[i]);
                main_category_model.add(mainCategoryModel);
            }

        } else if (Category.equals("Gingerbread")) {
            for (int i = 0; i < android_image_urls2.length; i++) {
                MainCategoryImagesModel mainCategoryModel = new MainCategoryImagesModel();
                //mainCategoryModel.setCategory_name(main_category_model_names[i]);
                mainCategoryModel.setCategory_image_url(android_image_urls2[i]);
                main_category_model.add(mainCategoryModel);
            }

        } else if (Category.equals("Honeycomb")) {
            for (int i = 0; i < android_image_urls2.length; i++) {
                MainCategoryImagesModel mainCategoryModel = new MainCategoryImagesModel();
                //mainCategoryModel.setCategory_name(main_category_model_names[i]);
                mainCategoryModel.setCategory_image_url(android_image_urls2[i]);
                main_category_model.add(mainCategoryModel);
            }

        } else if (Category.equals("Ice Cream Sandwich")) {
            for (int i = 0; i < android_image_urls2.length; i++) {
                MainCategoryImagesModel mainCategoryModel = new MainCategoryImagesModel();
                //mainCategoryModel.setCategory_name(main_category_model_names[i]);
                mainCategoryModel.setCategory_image_url(android_image_urls2[i]);
                main_category_model.add(mainCategoryModel);
            }

        } else if (Category.equals("Jelly Bean")) {
            for (int i = 0; i < android_image_urls2.length; i++) {
                MainCategoryImagesModel mainCategoryModel = new MainCategoryImagesModel();
                //mainCategoryModel.setCategory_name(main_category_model_names[i]);
                mainCategoryModel.setCategory_image_url(android_image_urls2[i]);
                main_category_model.add(mainCategoryModel);
            }

        } else if (Category.equals("KitKat")) {
            for (int i = 0; i < android_image_urls2.length; i++) {
                MainCategoryImagesModel mainCategoryModel = new MainCategoryImagesModel();
                //mainCategoryModel.setCategory_name(main_category_model_names[i]);
                mainCategoryModel.setCategory_image_url(android_image_urls2[i]);
                main_category_model.add(mainCategoryModel);
            }

        } else if (Category.equals("Lollipop")) {
            for (int i = 0; i < android_image_urls2.length; i++) {
                MainCategoryImagesModel mainCategoryModel = new MainCategoryImagesModel();
                //mainCategoryModel.setCategory_name(main_category_model_names[i]);
                mainCategoryModel.setCategory_image_url(android_image_urls2[i]);
                main_category_model.add(mainCategoryModel);
            }

        } else if (Category.equals("Marshmallow")) {
            for (int i = 0; i < android_image_urls2.length; i++) {
                MainCategoryImagesModel mainCategoryModel = new MainCategoryImagesModel();
                //mainCategoryModel.setCategory_name(main_category_model_names[i]);
                mainCategoryModel.setCategory_image_url(android_image_urls2[i]);
                main_category_model.add(mainCategoryModel);
            }

        }
        return main_category_model;
    }

}
