package com.yunduo.huopinclientapp.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.yunduo.huopinclientapp.R;
import com.yunduo.huopinclientapp.activitys.LoginActivity;
import com.yunduo.huopinclientapp.utils.MyToast;


/**
 * 我的
 */
public class MyFragment extends Fragment implements View.OnClickListener {

    private View view;
    private TextView titleTxt;
    private ImageView imgIc;

    private TextView btnRegOrlog;

    public MyFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_my, container, false);
        initView();
        return view;
    }

    public void initView() {
        titleTxt = (TextView) view.findViewById(R.id.title_bar_text);
        titleTxt.setText(R.string.title_wode);
        imgIc = (ImageView) view.findViewById(R.id.my_ic_setting);
        imgIc.setVisibility(View.VISIBLE);

        btnRegOrlog = (TextView) view.findViewById(R.id.my_btn_reg);

        btnRegOrlog.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){

            case R.id.my_btn_reg:
                //判断  当前  是否已经登录  TODO
                if(true){
                    startActivity(new Intent(getActivity(),LoginActivity.class));
                }else{
                    MyToast.ToastIncenter(getActivity(),"当前已经登录");
                }
                break;

            default:break;
        }
    }
}