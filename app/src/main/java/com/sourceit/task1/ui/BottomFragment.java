package com.sourceit.task1.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.sourceit.task1.R;
import com.sourceit.task1.utils.L;

public class BottomFragment extends Fragment {

    public static BottomFragment newInstance() {
        BottomFragment fragment = new BottomFragment();
        return fragment;
    }

    private EditText binary;
    private EditText octal;
    private EditText hexadecimal;

    public BottomFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container_bottom, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bottom, container_bottom, false);

        binary = (EditText) view.findViewById(R.id.editTextBin);
        octal = (EditText) view.findViewById(R.id.editTextOct);
        hexadecimal = (EditText) view.findViewById(R.id.editTextHex);

        return view;
    }

    void setNums(int num) {
        L.d("setNums:" + num);
        binary.setText(Integer.toBinaryString(num));
        octal.setText(Integer.toOctalString(num));
        hexadecimal.setText(Integer.toHexString(num));
    }
}
