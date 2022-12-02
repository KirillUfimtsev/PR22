package com.example.pr22;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InfoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InfoFragment extends Fragment {

    private TextView tv_name;
    private TextView tv_text;

    public static InfoFragment newInstance(String name, String text) {
        InfoFragment fragment = new InfoFragment();
        Bundle args = new Bundle();
        args.putString("name", name);
        args.putString("text", text);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info, container, false);
        tv_name = (TextView) view.findViewById(R.id.tv_name);
        tv_text = (TextView) view.findViewById(R.id.tv_text);
        String name = getArguments().getString("name","");
        String text = getArguments().getString("text","");
        tv_name.setText(name);
        tv_text.setText(text);
        return view;
    }
}