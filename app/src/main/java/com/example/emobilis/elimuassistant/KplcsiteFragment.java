package com.example.emobilis.elimuassistant;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class KplcsiteFragment extends Fragment {
    WebView web;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_kplcsite, container, false);


        web = root.findViewById(R.id.plcsite);
        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        web.loadUrl("https://www.kplc.co.ke/");

        return root;
    }


}
