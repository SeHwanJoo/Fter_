package com.fter.sopt.fter.curation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.fter.sopt.fter.R;

/**
 * Created by songmho on 2015-01-02.
 */
public class page_4 extends android.support.v4.app.Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        LinearLayout linearLayout=(LinearLayout)inflater.inflate(R.layout.page,container,false);

        LinearLayout background=(LinearLayout)linearLayout.findViewById(R.id.background);
        TextView page_num=(TextView)linearLayout.findViewById(R.id.page_num);
       // page_num.setText(String.valueOf(1));
        //background.setBackground(new ColorDrawable(0xff6dc6d2));
        background.setBackground(this.getResources().getDrawable(R.drawable.ad_image4));
        //Drawable d = getActivity().getResources().getDrawable(android.R.attr.illust);
        //background.setBackgroundDrawable(d);

        return linearLayout;
    }
}
