package com.example.rathana.fragmentdemo2.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rathana.fragmentdemo2.R;

/**
 * Created by RATHANA on 1/28/2018.
 */

public class ArticleFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.acticle_fragment_layout,container,false);

    }
}
