package com.example.android.everlastinghits;

/**
 * {@link Song} contains resource IDs for the title, artist, audio file and image for the song.
 */
public class Song {

    // String resource ID for the title of the song.
    private int titleId;

    // String resource ID for the artist.
    private int artistId;

    // Image resource ID for the word.
    private int imageId;

    // Constructor - creating a new Word object.
    public Song(int titleId, int artistId, int imageId) {
        this.titleId = titleId;
        this.artistId = artistId;
        this.imageId = imageId;
    }

    // Getter - string resource ID for the title of the song.
    public int getTitleId() {
        return titleId;
    }

    // Getter - string resource ID for the artist.
    public int getArtistId() {
        return artistId;
    }

    // Getter - image resource ID for the song.
    public int getImageId() {
        return imageId;
    }
}