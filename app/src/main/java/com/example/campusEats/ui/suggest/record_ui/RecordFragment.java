package com.example.campusEats.ui.suggest.record_ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.campusEats.MainActivity;
import com.example.campusEats.R;

import java.util.ArrayList;

public class RecordFragment extends Fragment {
    private RecordViewModel recordViewModel;
    Bundle bundle;
    LinearLayout total_record;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        recordViewModel =
                ViewModelProviders.of(this).get(RecordViewModel.class);
        View root = inflater.inflate(R.layout.fragment_record, container, false);
        total_record = root.findViewById(R.id.total_record);


        bundle = new Bundle();
        ArrayList array_name = bundle.getParcelableArrayList("product_name");


        Button btn_back = root.findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        TextView test = new TextView(getContext());
//        test.setText(String.valueOf(array_name.get(0)));

        total_record.addView(test);
        return root;
    }







}