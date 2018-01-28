package com.example.rathana.fragmentdemo2;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.rathana.fragmentdemo2.fragment.ArticleDetailFragment;
import com.example.rathana.fragmentdemo2.fragment.ArticleFragment;

public class DynamicFagmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_fagment);

        FragmentTransaction t= getFragmentManager().beginTransaction();
        ArticleFragment articleFragment=new ArticleFragment();
        t.add(R.id.fragment_container,articleFragment);
        t.commit();

    }
    public void replaceFragment(View view) {
        FragmentTransaction t= getFragmentManager().beginTransaction();
        ArticleDetailFragment fragment=new ArticleDetailFragment();
        t.replace(R.id.fragment_container,fragment,"articleDetail");
        //t.addToBackStack(null);
        t.commit();
    }

    public void removeFragment(View view) {
        FragmentTransaction t= getFragmentManager().beginTransaction();
        Fragment fragment= getFragmentManager()
                //.findFragmentById(R.id.article_detail_fragment);
            .findFragmentByTag("articleDetail");
        if(fragment!=null){
            Log.e("DynamicActivity", "removeFragment: ->;remove ");
            t.remove(fragment);
            t.addToBackStack(null);
            t.commit();
        }

    }
}
