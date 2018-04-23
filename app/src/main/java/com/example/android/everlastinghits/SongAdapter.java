package com.example.android.everlastinghits;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link SongAdapter} is an {@link ArrayAdapter} that provides the layout for each songs' list item
 */
public class SongAdapter extends ArrayAdapter<Song> {

    // Resource ID for the background color for the songs' list */
    private int colorId;

    // Constructor - creating a new {@link SongAdapter} object.
    public SongAdapter(Context context, ArrayList<Song> songs, int colorId) {
        super(context, 0, songs);
        this.colorId = colorId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Checking if an existing view is being reused, otherwise inflate it
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.songs_list_item, parent, false);
        }

        // Return the {@link Word} object located at the given position in the songs' list
        Song currentSong = getItem(position);

        // Find the TextView in the songs_list_item.xml layout with the ID artist_text_view.
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        // Get the artist name from the currentSong object and set this text on the artist_text_view TextView.
        artistTextView.setText(currentSong.getArtistId());

        // Find the TextView in the songs_list_item.xml layout with the ID title_text_view.
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        // Get the title from the currentSong object and set this text on the title_text_view TextView.
        defaultTextView.setText(currentSong.getTitleId());

        // Find the ImageView in the songs_list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Display the provided image
        imageView.setImageResource(currentSong.getImageId());

        // Set the category color
        View songContainer = listItemView.findViewById(R.id.song_container);
        // Find the color by resource ID
        int color = ContextCompat.getColor(getContext(), colorId);
        // Set the background color
        songContainer.setBackgroundColor(color);

        // Return the whole songs' list item layout
        return listItemView;
    }
}