package com.app.tulpan.navigation.fragments;


import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.app.tulpan.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Menu_Fragment1 extends Fragment {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)

    private LinearLayout _btn_home;
    private LinearLayout _btn_product;
    private LinearLayout _btn_cart;
    private LinearLayout _btn_promo;
    private LinearLayout _btn_scedule;

    private ImageView btn_home1;
    private ImageView btn_product1;
    private ImageView btn_cart1;
    private ImageView btn_promo1;
    private ImageView btn_scedule1;

    private ImageView btn_home2;
    private ImageView btn_product2;
    private ImageView btn_cart2;
    private ImageView btn_promo2;
    private ImageView btn_scedule2;


    private TextView tv_home;
    private TextView tv_product;
    private TextView tv_cart;
    private TextView tv_promo;
    private TextView tv_schedul;




    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_info, container, false);
       //  getActivity().requestWindowFeature(Window.FEATURE_NO_TITLE);


        _btn_home= view.findViewById(R.id.btn_home_);
        _btn_product= view.findViewById(R.id.btn_product_);
        _btn_cart= view.findViewById(R.id.btn_cart_);
        _btn_promo= view.findViewById(R.id.btn_promo_);
        _btn_scedule= view.findViewById(R.id.btn_scedule_);

        btn_home1= view.findViewById(R.id.btn_home1);
        btn_product1= view.findViewById(R.id.btn_product1);
        btn_cart1= view.findViewById(R.id.btn_cart1);
        btn_promo1= view.findViewById(R.id.btn_promo1);
        btn_scedule1= view.findViewById(R.id.btn_scedule1);

        btn_home2= view.findViewById(R.id.btn_home2);
        btn_product2= view.findViewById(R.id.btn_product2);
        btn_cart2= view.findViewById(R.id.btn_cart2);
        btn_promo2= view.findViewById(R.id.btn_promo2);
        btn_scedule2= view.findViewById(R.id.btn_scedule2);


        tv_home= view.findViewById(R.id.tv_home);
        tv_product= view.findViewById(R.id.tv_product);
        tv_cart= view.findViewById(R.id.tv_cart);
        tv_promo= view.findViewById(R.id.tv_promo);
        tv_schedul= view.findViewById(R.id.tv_schedul);




        tv_home.setTextColor(ContextCompat.getColor(getContext(), R.color.colorAccent));
        tv_product.setTextColor(ContextCompat.getColor(getContext(), R.color.btn_info));
        tv_cart.setTextColor(ContextCompat.getColor(getContext(), R.color.btn_info));
        tv_promo.setTextColor(ContextCompat.getColor(getContext(), R.color.btn_info));
        tv_schedul.setTextColor(ContextCompat.getColor(getContext(), R.color.btn_info));

        btn_home1.setVisibility(View.VISIBLE);

        btn_product1.setVisibility(View.GONE);
        btn_cart1.setVisibility(View.GONE);
        btn_promo1.setVisibility(View.GONE);
        btn_scedule1.setVisibility(View.GONE);



        btn_home2.setVisibility(View.GONE);
        btn_product2.setVisibility(View.VISIBLE);
        btn_cart2.setVisibility(View.VISIBLE);
        btn_promo2.setVisibility(View.VISIBLE);
        btn_scedule2.setVisibility(View.VISIBLE);




        _btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv_home.setTextColor(ContextCompat.getColor(getContext(), R.color.colorAccent));
                tv_product.setTextColor(ContextCompat.getColor(getContext(), R.color.btn_info));
                tv_cart.setTextColor(ContextCompat.getColor(getContext(), R.color.btn_info));
                tv_promo.setTextColor(ContextCompat.getColor(getContext(), R.color.btn_info));
                tv_schedul.setTextColor(ContextCompat.getColor(getContext(), R.color.btn_info));

                btn_home1.setVisibility(View.VISIBLE);

                btn_product1.setVisibility(View.GONE);
                btn_cart1.setVisibility(View.GONE);
                btn_promo1.setVisibility(View.GONE);
                btn_scedule1.setVisibility(View.GONE);



                btn_home2.setVisibility(View.GONE);
                btn_product2.setVisibility(View.VISIBLE);
                btn_cart2.setVisibility(View.VISIBLE);
                btn_promo2.setVisibility(View.VISIBLE);
                btn_scedule2.setVisibility(View.VISIBLE);




            }
        });

        _btn_product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                tv_home.setTextColor(ContextCompat.getColor(getContext(), R.color.btn_info));
                tv_product.setTextColor(ContextCompat.getColor(getContext(), R.color.colorAccent));
                tv_cart.setTextColor(ContextCompat.getColor(getContext(), R.color.btn_info));
                tv_promo.setTextColor(ContextCompat.getColor(getContext(), R.color.btn_info));
                tv_schedul.setTextColor(ContextCompat.getColor(getContext(), R.color.btn_info));

                btn_home1.setVisibility(View.GONE);
                btn_product1.setVisibility(View.VISIBLE);
                btn_cart1.setVisibility(View.GONE);
                btn_promo1.setVisibility(View.GONE);
                btn_scedule1.setVisibility(View.GONE);



                btn_home2.setVisibility(View.VISIBLE);
                btn_product2.setVisibility(View.GONE);
                btn_cart2.setVisibility(View.VISIBLE);
                btn_promo2.setVisibility(View.VISIBLE);
                btn_scedule2.setVisibility(View.VISIBLE);



            }
        });

        _btn_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv_home.setTextColor(ContextCompat.getColor(getContext(), R.color.btn_info));
                tv_product.setTextColor(ContextCompat.getColor(getContext(), R.color.btn_info));
                tv_cart.setTextColor(ContextCompat.getColor(getContext(), R.color.colorAccent));
                tv_promo.setTextColor(ContextCompat.getColor(getContext(), R.color.btn_info));
                tv_schedul.setTextColor(ContextCompat.getColor(getContext(), R.color.btn_info));

                btn_home1.setVisibility(View.GONE);
                btn_product1.setVisibility(View.GONE);
                btn_cart1.setVisibility(View.VISIBLE);
                btn_promo1.setVisibility(View.GONE);
                btn_scedule1.setVisibility(View.GONE);



                btn_home2.setVisibility(View.VISIBLE);
                btn_product2.setVisibility(View.VISIBLE);
                btn_cart2.setVisibility(View.GONE);
                btn_promo2.setVisibility(View.VISIBLE);
                btn_scedule2.setVisibility(View.VISIBLE);
            }
        });

        _btn_promo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv_home.setTextColor(ContextCompat.getColor(getContext(), R.color.btn_info));
                tv_product.setTextColor(ContextCompat.getColor(getContext(), R.color.btn_info));
                tv_cart.setTextColor(ContextCompat.getColor(getContext(), R.color.btn_info));
                tv_promo.setTextColor(ContextCompat.getColor(getContext(), R.color.colorAccent));
                tv_schedul.setTextColor(ContextCompat.getColor(getContext(), R.color.btn_info));

                btn_home1.setVisibility(View.GONE);
                btn_product1.setVisibility(View.GONE);
                btn_cart1.setVisibility(View.GONE);
                btn_promo1.setVisibility(View.VISIBLE);
                btn_scedule1.setVisibility(View.GONE);



                btn_home2.setVisibility(View.VISIBLE);
                btn_product2.setVisibility(View.VISIBLE);
                btn_cart2.setVisibility(View.VISIBLE);
                btn_promo2.setVisibility(View.GONE);
                btn_scedule2.setVisibility(View.VISIBLE);

            }
        });

        _btn_scedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv_home.setTextColor(ContextCompat.getColor(getContext(), R.color.btn_info));
                tv_product.setTextColor(ContextCompat.getColor(getContext(), R.color.btn_info));
                tv_cart.setTextColor(ContextCompat.getColor(getContext(), R.color.btn_info));
                tv_promo.setTextColor(ContextCompat.getColor(getContext(), R.color.btn_info));
                tv_schedul.setTextColor(ContextCompat.getColor(getContext(), R.color.colorAccent));

                btn_home1.setVisibility(View.GONE);
                btn_product1.setVisibility(View.GONE);
                btn_cart1.setVisibility(View.GONE);
                btn_promo1.setVisibility(View.GONE);
                btn_scedule1.setVisibility(View.VISIBLE);



                btn_home2.setVisibility(View.VISIBLE);
                btn_product2.setVisibility(View.VISIBLE);
                btn_cart2.setVisibility(View.VISIBLE);
                btn_promo2.setVisibility(View.VISIBLE);
                btn_scedule2.setVisibility(View.GONE);
            }
        });









     /*   Window window = getActivity().getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(ContextCompat.getColor(getContext(), R.color.colorStatusBar));
*/


    /*    view.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Clicked a button! 1", Toast.LENGTH_SHORT).show();
            }
        });*/
        return view;
    }

}
