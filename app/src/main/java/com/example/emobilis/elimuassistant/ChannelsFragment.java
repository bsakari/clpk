package com.example.emobilis.elimuassistant;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChannelsFragment extends Fragment {
    CardView mCvMail,mCvSMS,mCvCall,mCvMobile,mCvKPLC;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_channels, container, false);
        mCvMail = root.findViewById(R.id.cvMail);
        mCvSMS = root.findViewById(R.id.cvSMS);
        mCvCall = root.findViewById(R.id.cvCall);
        mCvMobile = root.findViewById(R.id.cvMobile);
        mCvKPLC = root.findViewById(R.id.cvKPLC);


        mCvMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","abc@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "WHISTLE BLOWING");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Hi there, I just saw...");
                startActivity(Intent.createChooser(emailIntent, "Send email..."));
            }
        });
        mCvSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("smsto:0714359957");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Buda niaje...");
                startActivity(intent);
            }
        });
        mCvCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "0714359957"));
                if (ContextCompat.checkSelfPermission(getContext(),
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions((Activity) getContext(), new String[]{Manifest.permission.CALL_PHONE},1);
                }
                else
                {
                    startActivity(intent);
                }
            }
        });
        mCvMobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "In progress", Toast.LENGTH_SHORT).show();
            }
        });
        mCvKPLC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "In progress", Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }


}