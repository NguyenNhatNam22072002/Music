package hcmute.edu.vn.appmusic.Fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hcmute.edu.vn.appmusic.R;

public class Fragment_Tim_Kiem extends Fragment {

    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment__tim__kiem, container, false);
        return view;
    }
}