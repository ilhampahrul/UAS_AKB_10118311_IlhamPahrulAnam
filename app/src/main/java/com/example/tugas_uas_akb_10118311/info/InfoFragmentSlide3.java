package com.example.tugas_uas_akb_10118311.info;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.tugas_uas_akb_10118311.R;
import com.example.tugas_uas_akb_10118311.HomeActivity;


public class InfoFragmentSlide3 extends Fragment {
    // 13 Agustus 2021 - 10118311 - Ilham Pahrul Anam - IF8
    Button btnGetStarted;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container
            ,Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_info_slide3, container, false);

        btnGetStarted = rootView.findViewById(R.id.btnGetStarted);
        btnGetStarted.setOnClickListener(view -> {
            startActivity(new Intent(getActivity(), HomeActivity.class));

        });
        return rootView;
    }
}