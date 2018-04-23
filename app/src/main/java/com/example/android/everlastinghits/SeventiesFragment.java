package com.example.android.everlastinghits;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a songs' list from the 1970s.
 */
public class SeventiesFragment extends Fragment {

    // Empty public constructor
    public SeventiesFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.songs_list, container, false);

        // Create a songs' list from the 1970s.
        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song(R.string.seventies_title_1, R.string.seventies_artist_1,
                R.drawable.seventies_image_1));
        songs.add(new Song(R.string.seventies_title_2, R.string.seventies_artist_2,
                R.drawable.seventies_image_2));
        songs.add(new Song(R.string.seventies_title_3, R.string.seventies_artist_3,
                R.drawable.seventies_image_3));
        songs.add(new Song(R.string.seventies_title_4, R.string.seventies_artist_4,
                R.drawable.seventies_image_4));
        songs.add(new Song(R.string.seventies_title_5, R.string.seventies_artist_5,
                R.drawable.seventies_image_5));
        songs.add(new Song(R.string.seventies_title_6, R.string.seventies_artist_6,
                R.drawable.sample_album_image));
        songs.add(new Song(R.string.seventies_title_7, R.string.seventies_artist_7,
                R.drawable.sample_album_image));
        songs.add(new Song(R.string.seventies_title_8, R.string.seventies_artist_8,
                R.drawable.sample_album_image));
        songs.add(new Song(R.string.seventies_title_9, R.string.seventies_artist_9,
                R.drawable.sample_album_image));
        songs.add(new Song(R.string.seventies_title_10, R.string.seventies_artist_10,
                R.drawable.sample_album_image));

        // Creating a {@link SongAdapter}
        SongAdapter adapter = new SongAdapter(getActivity(), songs, R.color.seventies_background);

        // Finding the {@link ListView} object
        ListView listView = (ListView) view.findViewById(R.id.songsList);

        // Adding a fixed view (with button) to appear at the bottom of the songs' list
        ViewGroup footer = (ViewGroup) inflater.inflate(R.layout.footer_button, listView, false);
        listView.addFooterView(footer);

        // Making the {@link ListView} use the {@link SongAdapter}
        listView.setAdapter(adapter);

        //Button
        Button button = (Button) view.findViewById(R.id.footerButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeventiesFragment.this.getActivity(), CuriosityActivity.class);
                SeventiesFragment.this.getActivity().startActivity(intent);
            }
        });

        return view;
    }
}