package com.project.udacity.my.musicplayer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    static int artist, pic, name, bio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Album> albums = new ArrayList<>();
        Album album1,
                album2,
                album3;

        ImageView artistPic = (ImageView) findViewById(R.id.artist_activity_image);
        TextView artistName = (TextView) findViewById(R.id.artist_activity_bio_name);
        TextView artistBio = (TextView) findViewById(R.id.artist_activity_bio_bio);

        if(getIntent().hasExtra("artist"))
            artist = getIntent().getExtras().getInt("artist");
        if(getIntent().hasExtra("artist pic"))
            pic = getIntent().getExtras().getInt("artist pic");
        if(getIntent().hasExtra("artist name"))
            name = getIntent().getExtras().getInt("artist name");
        if(getIntent().hasExtra("artist bio"))
            bio = getIntent().getExtras().getInt("artist bio");

        artistPic.setImageResource(pic);
        artistName.setText(name);
        artistBio.setText(bio);

        switch(artist) {

            case 0:
                album1 = new Album
                        (getString(R.string.bluestahli_album_antisleep1), getDrawable(R.drawable.bluestahli1album));
                album2 = new Album
                        (getString(R.string.bluestahli_album_antisleep2), getDrawable(R.drawable.bluestahli2album));
                album3 = new Album
                        (getString(R.string.bluestahli_album_thedevil), getDrawable(R.drawable.bluestahli3album));

                albums.add(album1); albums.add(album2); albums.add(album3);
                break;
            case 1:
                album1 = new Album
                        (getString(R.string.celldweller_album_celldweller), getDrawable(R.drawable.celldweller1album));
                album2 = new Album
                        (getString(R.string.celldweller_album_soundtrack2), getDrawable(R.drawable.celldweller2album));
                album3 = new Album
                        (getString(R.string.celldweller_album_endofanempire), getDrawable(R.drawable.celldweller3album));

                albums.add(album1); albums.add(album2); albums.add(album3);
                break;
            case 2:
                album1 = new Album
                        (getString(R.string.gramatik_album_epigram), getDrawable(R.drawable.gramatik1album));
                album2 = new Album
                        (getString(R.string.gramatik_album_beats), getDrawable(R.drawable.gramatik2album));
                album3 = new Album
                        (getString(R.string.gramatik_album_street), getDrawable(R.drawable.gramatik3album));

                albums.add(album1); albums.add(album2); albums.add(album3);
                break;
            case 3:
                album1 = new Album
                        (getString(R.string.rhcp_album_stadium), getDrawable(R.drawable.redhotcp1album));
                album2 = new Album
                        (getString(R.string.rhcp_album_californication), getDrawable(R.drawable.redhotcp2album));
                album3 = new Album
                        (getString(R.string.rhcp_album_getaway), getDrawable(R.drawable.redhotcp3album));

                albums.add(album1); albums.add(album2); albums.add(album3);
                break;
            case 4:
                album1 = new Album
                        (getString(R.string.woodkid_album_golden), getDrawable(R.drawable.woodkid1album));
                album2 = new Album
                        (getString(R.string.woodkid_album_desierto), getDrawable(R.drawable.woodkid2album));

                albums.add(album1); albums.add(album2);
                break;
        }
        ListView albumList = (ListView)findViewById(R.id.artist_activity_listview);
        AlbumAdapter albumAdapter = new AlbumAdapter(this, albums);
        albumList.setAdapter(albumAdapter);

        //Click listener for the album list, directing to appropriate songs
        albumList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch(position) {

                    case 0:
                        Intent toAlbum1 = new Intent(ArtistActivity.this, SongActivity.class);
                        toAlbum1.putExtra("artist", artist);
                        toAlbum1.putExtra("album", 1);
                        startActivity(toAlbum1);
                        break;
                    case 1:
                        Intent toAlbum2 = new Intent(ArtistActivity.this, SongActivity.class);
                        toAlbum2.putExtra("artist", artist);
                        toAlbum2.putExtra("album", 2);
                        startActivity(toAlbum2);
                        break;
                    case 2:
                        Intent toAlbum3 = new Intent(ArtistActivity.this, SongActivity.class);
                        toAlbum3.putExtra("artist", artist);
                        toAlbum3.putExtra("album", 3);
                        startActivity(toAlbum3);
                        break;
                }
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home) {
            NavUtils.navigateUpFromSameTask(this);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private static class AlbumAdapter extends ArrayAdapter<Album> {

        private AlbumAdapter(@NonNull Context context, ArrayList<Album> albums) {
            super(context, 0, albums);
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            Album album = getItem(position);

            if(convertView == null)
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.album_view, parent, false);

            ImageView albumcover = (ImageView) convertView.findViewById(R.id.layout_album_view_cover);
            TextView albumname = (TextView) convertView.findViewById(R.id.layout_album_view_name);

            albumcover.setImageDrawable(album.getCover());
            albumname.setText(album.getName());

            return convertView;
        }
    }
}
