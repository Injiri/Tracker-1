package com.example.track_motorbike;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.telephony.SmsManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class ActivateFragment extends Fragment{


    Button activate;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_activate, null);

        activate = (Button) view.findViewById(R.id.btn_activate);
       // activate.setOnClickListener(this);
        return  view;

    }


   /* @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.btn_activate:
                sendSMS();
                break;
            default:
                break;
        }
     }

   *//* public void sendSMS() {

            SmsManager sms = SmsManager.getDefault();
            String msg = "Activate";
            sms.sendTextMessage("0701869953", null, msg, null, null);

    }
*/

}