package com.example.swipeview;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {


    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_fragment1,container,false);
        textView = view.findViewById(R.id.textView);
        Bundle bundle=getArguments();
        String message =Integer.toString(bundle.getInt("count"));
        textView.setText("this is "+message+ " swipe view page...");
        return view;
    }

}
