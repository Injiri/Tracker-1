package com.example.track_motorbike;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ActivateFragment extends Fragment implements View.OnClickListener {


    Button activate;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_activate, null);

    }


    @Override
    public void onClick(View v) {

    }
}

public class fragmentOne extends Fragment implements  {
    Button myButton;

    @Override
    public View OnCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedinstanceState) {
        View myView = inflater.inflate(R.layout.fragment_1, container, false);
        myButton = (Button) myView.findViewById(R.id.myButton);
        myButton.setOnClickListener(this);
        return myView;
    }

    @Override
    public void onClick(View v) {
        // implements your things
    }
}