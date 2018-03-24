package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Arkady on 24-Mar-18.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    public WordAdapter(Activity context, ArrayList<Word> resource) {
        super(context, 0, resource);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link Word} object located at this position in the list
        Word currentItem = getItem(position);
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.text_english);
        defaultTextView.setText(currentItem.getmDefaultTranslation());
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.text_miwok);
        miwokTextView.setText(currentItem.getmMiwokTranslation());


//        return super.getView(position, convertView, parent);
        return listItemView;
    }
}
