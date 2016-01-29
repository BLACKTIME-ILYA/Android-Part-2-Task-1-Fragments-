package com.sourceit.task1.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.sourceit.task1.R;
import com.sourceit.task1.utils.L;


public class TopFragment extends Fragment {

    public static TopFragment newInstance() {
        TopFragment fragment = new TopFragment();
        return fragment;
    }

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private EditText num1;
    private EditText num2;
    private EditText num3;
    private int temp_num;

    public TopFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container_top, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top, container_top, false);
        L.d("onCreateView_top");
        btn1 = (Button) view.findViewById(R.id.button1);
        L.d("create button 1");
        btn2 = (Button) view.findViewById(R.id.button2);
        btn3 = (Button) view.findViewById(R.id.button3);
        num1 = (EditText) view.findViewById(R.id.editTextNum1);
        L.d("create num 1");
        num2 = (EditText) view.findViewById(R.id.editTextNum2);
        num3 = (EditText) view.findViewById(R.id.editTextNum3);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    temp_num = Integer.parseInt(num1.getText().toString());
                } catch (NumberFormatException e) {
                }
                L.d("temp_num value: " + temp_num);
                sendNum();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    temp_num = Integer.parseInt(num2.getText().toString());
                } catch (NumberFormatException e) {
                }
                sendNum();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    temp_num = Integer.parseInt(num3.getText().toString());
                } catch (NumberFormatException e) {
                }
                sendNum();
            }
        });

        return view;
    }

    private void sendNum() {
        if (temp_num != 0) {
            BottomFragment bottomFragment = (BottomFragment) getActivity().getSupportFragmentManager().findFragmentByTag(BottomFragment.class.getSimpleName());
            bottomFragment.setNums(temp_num);
        }
    }
}
