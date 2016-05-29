package com.nanodegree;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by priteshjain on 29/05/16.
 */
public class GridAdapter extends BaseAdapter {
    private Context mContext;
    private String[] namesArray;
    private int[] colorArray;

    public GridAdapter(Context c, String[] names) {
        this.mContext = c;
        namesArray = names;
        colorArray = mContext.getResources().getIntArray(R.array.colors);
    }

    public int getCount() {
        return namesArray.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(final int position, View convertView, ViewGroup parent) {
        SquareButtonView button;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            LayoutInflater li = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = li.inflate(R.layout.grid_item, null);
        }
        button = (SquareButtonView) convertView.findViewById(R.id.gridImageButton);
        button.setText(namesArray[position]);
        button.setBackgroundColor(colorArray[position]);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "This button will launch " + namesArray[position] + " app",
                        Toast.LENGTH_SHORT).show();
            }
        });
        return button;
    }

}