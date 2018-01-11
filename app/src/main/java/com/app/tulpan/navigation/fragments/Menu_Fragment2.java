package com.app.tulpan.navigation.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.tulpan.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Menu_Fragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_info, container, false);

      /*  view.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Clicked a button! 2 ", Toast.LENGTH_SHORT).show();
            }
        });*/
        return view;
    }
}
