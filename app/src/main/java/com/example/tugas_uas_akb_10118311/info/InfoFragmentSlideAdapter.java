package com.example.tugas_uas_akb_10118311.info;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class InfoFragmentSlideAdapter extends FragmentStatePagerAdapter {
    // 13 Agustus 2021 - 10118311 - Ilham Pahrul Anam - IF8

    private List<Fragment> fragmentList;
    public InfoFragmentSlideAdapter(@NonNull FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        this.fragmentList = fragmentList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        return fragmentList.get(position);
    }

    @Override
    public int getCount() {

        return fragmentList.size();
    }
}
