package com.example.guides.quiz1.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.guides.quiz1.Model.Output;
import com.example.guides.quiz1.R;

import java.util.List;

/**
 * Created by GUIDES on 9/28/2017.
 */

public class CustomAdapter extends BaseAdapter {
    Context c;
    List<Output> output;
    ImageView img1;
    TextView txt1,txt2,txt3,txt4;


    public CustomAdapter(Context c, List<Output> output) {
        this.c = c;
        this.output = output;
    }


    @Override
    public int getCount() {
        return output.size();
    }

    @Override
    public Object getItem(int i) {
        return output.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(c, R.layout.row_layout, null);

        img1 = (ImageView) v.findViewById(R.id.IMG1);
        txt1 = (TextView) v.findViewById(R.id.TXT1);
        txt2 = (TextView) v.findViewById(R.id.TXT2);
        txt3 = (TextView) v.findViewById(R.id.TXT3);
        txt4 = (TextView) v.findViewById(R.id.TXT4);

        txt1.setText(output.get(i).getCodename());
        txt2.setText(output.get(i).getVersion());
        txt3.setText(output.get(i).getApi());
        txt4.setText(output.get(i).getDate());
        img1.setImageResource(output.get(i).getLogo());


        return v;
    }
}
