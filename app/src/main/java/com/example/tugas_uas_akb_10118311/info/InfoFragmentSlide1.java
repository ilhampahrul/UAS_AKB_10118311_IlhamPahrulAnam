package com.example.tugas_uas_akb_10118311.info;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tugas_uas_akb_10118311.R;

public class InfoFragmentSlide1 extends Fragment {
    // 13 Agustus 2021 - 10118311 - Ilham Pahrul Anam - IF8

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container
            ,Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_info_slide1, container, false);
        return rootView;
    }
}
