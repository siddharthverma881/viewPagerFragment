package com.example.android.viewpagerfragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


public class Example extends Fragment {
    public Example() {
        // Required empty public constructor
    }

    public static Example newInstance(Bundle bundle) {
        Example fragment = new Example();
        if(bundle != null){
            fragment.setArguments(bundle);
        }
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         View view = inflater.inflate(R.layout.fragment_example,container,false);
        Bundle bundle = getArguments();
        String key = bundle.getString("string1");

        TextView textView = view.findViewById(R.id.fragment_tv);
        textView.setText(key);
        return view;
    }

}
