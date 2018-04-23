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
 * {@link Fragment} that displays a songs' list from the 2000s.
 */
public class TwoThousandsFragment extends Fragment {

    // Empty public constructor
    public TwoThousandsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.songs_list, container, false);

        // Create a songs' list from the 2000s.
        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new com.example.android.everlastinghits.Song(R.string.twothousands_title_1,
                R.string.twothousands_artist_1, R.drawable.sample_album_image));
        songs.add(new Song(R.string.twothousands_title_2,
                R.string.twothousands_artist_2, R.drawable.sample_album_image));
        songs.add(new Song(R.string.twothousands_title_3,
                R.string.twothousands_artist_3, R.drawable.sample_album_image));
        songs.add(new Song(R.string.twothousands_title_4,
                R.string.twothousands_artist_4, R.drawable.sample_album_image));
        songs.add(new Song(R.string.twothousands_title_5,
                R.string.twothousands_artist_5, R.drawable.sample_album_image));
        songs.add(new Song(R.string.twothousands_title_6,
                R.string.twothousands_artist_6, R.drawable.sample_album_image));
        songs.add(new Song(R.string.twothousands_title_7,
                R.string.twothousands_artist_7, R.drawable.sample_album_image));
        songs.add(new Song(R.string.twothousands_title_8,
                R.string.twothousands_artist_8, R.drawable.sample_album_image));
        songs.add(new Song(R.string.twothousands_title_9,
                R.string.twothousands_artist_9, R.drawable.sample_album_image));
        songs.add(new Song(R.string.twothousands_title_10,
                R.string.twothousands_artist_10, R.drawable.sample_album_image));

        // Creating a {@link SongAdapter}
        SongAdapter adapter = new SongAdapter(getActivity(), songs, R.color.twothousands_background);

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
                Intent intent = new Intent(TwoThousandsFragment.this.getActivity(), CuriosityActivity.class);
                TwoThousandsFragment.this.getActivity().startActivity(intent);
            }
        });

        return view;
    }
}