package com.healthiera.mobile.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.healthiera.mobile.R;
import com.healthiera.mobile.fragment.healthData.Complains;
import com.healthiera.mobile.fragment.healthData.Devices;
import com.healthiera.mobile.fragment.healthData.Heredity;
import com.healthiera.mobile.fragment.healthData.Status;


/**
 * Created by Davit on 11.09.2016.
 */
public class HealthData extends BaseFragment {
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.tv1:
                    FragmentTransaction transaction = getFragmentManager().beginTransaction();
                    transaction
                            .addToBackStack("HD-C")
                            .setCustomAnimations(R.anim.slide_left, R.anim.slide_right)
                            .replace(R.id.Content_id_, new Complains())
                            .commit();
                    break;
                case R.id.tv2:
                    getFragmentManager().beginTransaction()
                            .setCustomAnimations(R.anim.slide_left, R.anim.slide_right)
                            .replace(R.id.Content_id_, new Heredity()).addToBackStack("HD-H").commit();
                    break;
                case R.id.tv3:
                    getFragmentManager().beginTransaction()
                            .setCustomAnimations(R.anim.slide_left, R.anim.slide_right)
                            .replace(R.id.Content_id_, new Status()).addToBackStack("HD-S").commit();
                    break;
                case R.id.tv4:
                    getFragmentManager().beginTransaction()
                            .setCustomAnimations(R.anim.slide_left, R.anim.slide_right)
                            .replace(R.id.Content_id_, new Devices()).addToBackStack("HD-D").commit();
                    break;
            }
        }
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.health_data, container, false);

        TextView tv1 = (TextView) rootView.findViewById(R.id.tv1);
        TextView tv2 = (TextView) rootView.findViewById(R.id.tv2);
        TextView tv3 = (TextView) rootView.findViewById(R.id.tv3);
        TextView tv4 = (TextView) rootView.findViewById(R.id.tv4);


        tv1.setOnClickListener(onClickListener);
        tv2.setOnClickListener(onClickListener);
        tv3.setOnClickListener(onClickListener);
        tv4.setOnClickListener(onClickListener);
        return rootView;
    }

}