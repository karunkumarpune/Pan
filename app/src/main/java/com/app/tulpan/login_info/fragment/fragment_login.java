package com.app.tulpan.login_info.fragment;



import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.tulpan.R;
import com.app.tulpan.login_info.OtpActivity;
import com.app.tulpan.navigation.NavigationDwable;


public class fragment_login extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_login, container, false);

        TextView btn_login=v.findViewById(R.id.btn_);
        TextView btn_forget_pass=v.findViewById(R.id.btn_forget_pass);









        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), NavigationDwable.class));
            }
        });

        btn_forget_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), OtpActivity.class));
            }
        });






        return v;
    }
}