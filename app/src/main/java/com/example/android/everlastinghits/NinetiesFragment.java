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
 * {@link Fragment} that displays a songs' list from the 1990s.
 */
public class NinetiesFragment extends Fragment {

    // Empty public constructor
    public NinetiesFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.songs_list, container, false);

        // Create a songs' list from the 1990s.
        final ArrayList<Song> words = new ArrayList<>();
        words.add(new Song(R.string.nineties_title_1, R.string.nineties_artist_1,
                R.drawable.sample_album_image));
        words.add(new Song(R.string.nineties_title_2, R.string.nineties_artist_2,
                R.drawable.sample_album_image));
        words.add(new Song(R.string.nineties_title_3, R.string.nineties_artist_3,
                R.drawable.sample_album_image));
        words.add(new Song(R.string.nineties_title_4, R.string.nineties_artist_4,
                R.drawable.sample_album_image));
        words.add(new Song(R.string.nineties_title_5, R.string.nineties_artist_5,
                R.drawable.sample_album_image));
        words.add(new Song(R.string.nineties_title_6, R.string.nineties_artist_6,
                R.drawable.sample_album_image));
        words.add(new Song(R.string.nineties_title_7, R.string.nineties_artist_7,
                R.drawable.sample_album_image));
        words.add(new Song(R.string.nineties_title_8, R.string.nineties_artist_8,
                R.drawable.sample_album_image));
        words.add(new Song(R.string.nineties_title_9, R.string.nineties_artist_9,
                R.drawable.sample_album_image));
        words.add(new Song(R.string.nineties_title_10, R.string.nineties_artist_10,
                R.drawable.sample_album_image));

        // Creating a {@link SongAdapter}
        SongAdapter adapter = new SongAdapter(getActivity(), words, R.color.nineties_background);

        // Finding the {@link ListView} object
        ListView listView = (ListView) view.findViewById(R.id.songsList);

        // Addi a fixed view (with button) to appear at the bottom of the songs' list
        ViewGroup footer = (ViewGroup) inflater.inflate(R.layout.footer_button, listView, false);
        listView.addFooterView(footer);

        // Making the {@link ListView} use the {@link SongAdapter}
        listView.setAdapter(adapter);

        //Button
        Button button = (Button) view.findViewById(R.id.footerButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NinetiesFragment.this.getActivity(), CuriosityActivity.class);
                NinetiesFragment.this.getActivity().startActivity(intent);
            }
        });

        return view;
    }
}