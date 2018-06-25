package com.project.udacity.my.musicplayer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ArrayList<String> songs = new ArrayList<>();
        int artist = getIntent().getExtras().getInt("artist");
        int album = getIntent().getExtras().getInt("album");

        ImageView albumCover = (ImageView) findViewById(R.id.layout_song_album_cover);
        TextView artistName = (TextView) findViewById(R.id.layout_song_artistname);

        //Put appropriate songs in the arraylist
        populateAlbums(artist, album, songs);

        switch(artist) {

            case 0:
                artistName.setText(R.string.bluestahli_name);
                if(album == 1)
                    albumCover.setImageResource(R.drawable.bluestahli1album);
                else if(album == 2)
                    albumCover.setImageResource(R.drawable.bluestahli2album);
                else
                    albumCover.setImageResource(R.drawable.bluestahli3album);
                break;
            case 1:
                artistName.setText(R.string.celldweller_name);
                if(album == 1)
                    albumCover.setImageResource(R.drawable.celldweller1album);
                else if(album == 2)
                    albumCover.setImageResource(R.drawable.celldweller2album);
                else
                    albumCover.setImageResource(R.drawable.celldweller3album);
                break;
            case 2:
                artistName.setText(R.string.gramatik_name);
                if(album == 1)
                    albumCover.setImageResource(R.drawable.gramatik1album);
                else if(album == 2)
                    albumCover.setImageResource(R.drawable.gramatik2album);
                else
                    albumCover.setImageResource(R.drawable.gramatik3album);
                break;
            case 3:
                artistName.setText(R.string.redhotcp_name);
                if(album == 1)
                    albumCover.setImageResource(R.drawable.redhotcp1album);
                else if(album == 2)
                    albumCover.setImageResource(R.drawable.redhotcp2album);
                else
                    albumCover.setImageResource(R.drawable.redhotcp3album);
                break;
            case 4:
                artistName.setText(R.string.woodkid_name);
                if(album == 1)
                    albumCover.setImageResource(R.drawable.woodkid1album);
                else
                    albumCover.setImageResource(R.drawable.woodkid2album);
                break;
        }
        //Set the songs in the list view
        ListView songList = (ListView) findViewById(R.id.layout_song_songlist);
        songList.setAdapter(new ArrayAdapter<String>(
                this, R.layout.song_view, songs));

        //Select song to play
        songList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                TextView songName = (TextView) findViewById(R.id.layout_song_songname);
                songName.setText(songs.get(position));
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

    private void populateAlbums
            (int artist, int album,  ArrayList<String> songs) {

        switch(artist) {

            //BlueStahli
            case 0:
                if(album == 0) {
                    songs.clear();
                    songs.add(getString(R.string.bluestahli_antisleep1_1));
                    songs.add(getString(R.string.bluestahli_antisleep1_2));
                    songs.add(getString(R.string.bluestahli_antisleep1_3));
                    songs.add(getString(R.string.bluestahli_antisleep1_4));
                    songs.add(getString(R.string.bluestahli_antisleep1_5));
                    songs.add(getString(R.string.bluestahli_antisleep1_6));
                    songs.add(getString(R.string.bluestahli_antisleep1_7));
                    songs.add(getString(R.string.bluestahli_antisleep1_8));
                    songs.add(getString(R.string.bluestahli_antisleep1_9));
                    songs.add(getString(R.string.bluestahli_antisleep1_10));
                    songs.add(getString(R.string.bluestahli_antisleep1_11));
                    songs.add(getString(R.string.bluestahli_antisleep1_12));
                    songs.add(getString(R.string.bluestahli_antisleep1_13));
                    songs.add(getString(R.string.bluestahli_antisleep1_14));
                    songs.add(getString(R.string.bluestahli_antisleep1_15));
                    songs.add(getString(R.string.bluestahli_antisleep1_16));
                    songs.add(getString(R.string.bluestahli_antisleep1_17));
                    songs.add(getString(R.string.bluestahli_antisleep1_18));
                    break;
                } else if(album == 2) {
                    songs.clear();
                    songs.add(getString(R.string.bluestahli_antisleep2_1));
                    songs.add(getString(R.string.bluestahli_antisleep2_2));
                    songs.add(getString(R.string.bluestahli_antisleep2_3));
                    songs.add(getString(R.string.bluestahli_antisleep2_4));
                    songs.add(getString(R.string.bluestahli_antisleep2_5));
                    songs.add(getString(R.string.bluestahli_antisleep2_6));
                    songs.add(getString(R.string.bluestahli_antisleep2_7));
                    songs.add(getString(R.string.bluestahli_antisleep2_8));
                    songs.add(getString(R.string.bluestahli_antisleep2_9));
                    songs.add(getString(R.string.bluestahli_antisleep2_10));
                    songs.add(getString(R.string.bluestahli_antisleep2_11));
                    songs.add(getString(R.string.bluestahli_antisleep2_12));
                    songs.add(getString(R.string.bluestahli_antisleep2_13));
                    songs.add(getString(R.string.bluestahli_antisleep2_14));
                    songs.add(getString(R.string.bluestahli_antisleep2_15));
                    break;
                } else if(album == 3) {
                    songs.clear();
                    songs.add(getString(R.string.bluestahli_thedevil_1));
                    songs.add(getString(R.string.bluestahli_thedevil_2));
                    songs.add(getString(R.string.bluestahli_thedevil_3));
                    songs.add(getString(R.string.bluestahli_thedevil_4));
                    songs.add(getString(R.string.bluestahli_thedevil_5));
                    songs.add(getString(R.string.bluestahli_thedevil_6));
                    songs.add(getString(R.string.bluestahli_thedevil_7));
                    songs.add(getString(R.string.bluestahli_thedevil_8));
                    songs.add(getString(R.string.bluestahli_thedevil_9));
                    songs.add(getString(R.string.bluestahli_thedevil_10));
                    songs.add(getString(R.string.bluestahli_thedevil_11));
                    songs.add(getString(R.string.bluestahli_thedevil_12));
                    break;
                } else songs.clear();

            //Celldweller
            case 1:
                if(album == 1) {
                    songs.clear();
                    songs.add(getString(R.string.celldweller_celldweller_1));
                    songs.add(getString(R.string.celldweller_celldweller_2));
                    songs.add(getString(R.string.celldweller_celldweller_3));
                    songs.add(getString(R.string.celldweller_celldweller_4));
                    songs.add(getString(R.string.celldweller_celldweller_5));
                    songs.add(getString(R.string.celldweller_celldweller_6));
                    songs.add(getString(R.string.celldweller_celldweller_7));
                    songs.add(getString(R.string.celldweller_celldweller_8));
                    songs.add(getString(R.string.celldweller_celldweller_9));
                    songs.add(getString(R.string.celldweller_celldweller_10));
                    songs.add(getString(R.string.celldweller_celldweller_11));
                    songs.add(getString(R.string.celldweller_celldweller_12));
                    songs.add(getString(R.string.celldweller_celldweller_13));
                    songs.add(getString(R.string.celldweller_celldweller_14));
                    songs.add(getString(R.string.celldweller_celldweller_15));
                    songs.add(getString(R.string.celldweller_celldweller_16));
                    songs.add(getString(R.string.celldweller_celldweller_17));
                    songs.add(getString(R.string.celldweller_celldweller_18));
                    break;
                } else if(album == 2) {
                    songs.clear();
                    songs.add(getString(R.string.celldweller_soundtrack2_1));
                    songs.add(getString(R.string.celldweller_soundtrack2_2));
                    songs.add(getString(R.string.celldweller_soundtrack2_3));
                    songs.add(getString(R.string.celldweller_soundtrack2_4));
                    songs.add(getString(R.string.celldweller_soundtrack2_5));
                    songs.add(getString(R.string.celldweller_soundtrack2_6));
                    songs.add(getString(R.string.celldweller_soundtrack2_7));
                    songs.add(getString(R.string.celldweller_soundtrack2_8));
                    songs.add(getString(R.string.celldweller_soundtrack2_9));
                    songs.add(getString(R.string.celldweller_soundtrack2_10));
                    songs.add(getString(R.string.celldweller_soundtrack2_11));
                    songs.add(getString(R.string.celldweller_soundtrack2_12));
                    songs.add(getString(R.string.celldweller_soundtrack2_13));
                    songs.add(getString(R.string.celldweller_soundtrack2_14));
                    songs.add(getString(R.string.celldweller_soundtrack2_15));
                    songs.add(getString(R.string.celldweller_soundtrack2_16));
                    songs.add(getString(R.string.celldweller_soundtrack2_17));
                    songs.add(getString(R.string.celldweller_soundtrack2_18));
                    songs.add(getString(R.string.celldweller_soundtrack2_19));
                    break;
                } else if(album == 3) {
                    songs.clear();
                    songs.add(getString(R.string.celldweller_endofanempire_1));
                    songs.add(getString(R.string.celldweller_endofanempire_2));
                    songs.add(getString(R.string.celldweller_endofanempire_3));
                    songs.add(getString(R.string.celldweller_endofanempire_4));
                    songs.add(getString(R.string.celldweller_endofanempire_5));
                    songs.add(getString(R.string.celldweller_endofanempire_6));
                    songs.add(getString(R.string.celldweller_endofanempire_7));
                    songs.add(getString(R.string.celldweller_endofanempire_8));
                    songs.add(getString(R.string.celldweller_endofanempire_9));
                    songs.add(getString(R.string.celldweller_endofanempire_10));
                    songs.add(getString(R.string.celldweller_endofanempire_11));
                    songs.add(getString(R.string.celldweller_endofanempire_12));
                    songs.add(getString(R.string.celldweller_endofanempire_13));
                    songs.add(getString(R.string.celldweller_endofanempire_14));
                    break;
                } else songs.clear();
            //Gramatik
            case 2:
                if(album == 1) {
                    songs.clear();
                    songs.add(getString(R.string.gramatik_beats_1));
                    songs.add(getString(R.string.gramatik_beats_2));
                    songs.add(getString(R.string.gramatik_beats_3));
                    songs.add(getString(R.string.gramatik_beats_4));
                    songs.add(getString(R.string.gramatik_beats_5));
                    songs.add(getString(R.string.gramatik_beats_6));
                    songs.add(getString(R.string.gramatik_beats_7));
                    songs.add(getString(R.string.gramatik_beats_8));
                    songs.add(getString(R.string.gramatik_beats_9));
                    songs.add(getString(R.string.gramatik_beats_10));
                    songs.add(getString(R.string.gramatik_beats_11));
                    songs.add(getString(R.string.gramatik_beats_12));
                    songs.add(getString(R.string.gramatik_beats_13));
                    songs.add(getString(R.string.gramatik_beats_14));
                    songs.add(getString(R.string.gramatik_beats_15));
                    songs.add(getString(R.string.gramatik_beats_16));
                    break;
                } else if(album == 2) {
                    songs.clear();
                    songs.add(getString(R.string.gramatik_epigram_1));
                    songs.add(getString(R.string.gramatik_epigram_2));
                    songs.add(getString(R.string.gramatik_epigram_3));
                    songs.add(getString(R.string.gramatik_epigram_4));
                    songs.add(getString(R.string.gramatik_epigram_5));
                    songs.add(getString(R.string.gramatik_epigram_6));
                    songs.add(getString(R.string.gramatik_epigram_7));
                    songs.add(getString(R.string.gramatik_epigram_8));
                    songs.add(getString(R.string.gramatik_epigram_9));
                    songs.add(getString(R.string.gramatik_epigram_10));
                    break;
                } else if(album == 3) {
                    songs.clear();
                    songs.add(getString(R.string.gramatik_street_1));
                    songs.add(getString(R.string.gramatik_street_2));
                    songs.add(getString(R.string.gramatik_street_3));
                    songs.add(getString(R.string.gramatik_street_4));
                    songs.add(getString(R.string.gramatik_street_5));
                    songs.add(getString(R.string.gramatik_street_6));
                    songs.add(getString(R.string.gramatik_street_7));
                    songs.add(getString(R.string.gramatik_street_8));
                    songs.add(getString(R.string.gramatik_street_9));
                    songs.add(getString(R.string.gramatik_street_10));
                    songs.add(getString(R.string.gramatik_street_11));
                    songs.add(getString(R.string.gramatik_street_12));
                    songs.add(getString(R.string.gramatik_street_13));
                    songs.add(getString(R.string.gramatik_street_14));
                    songs.add(getString(R.string.gramatik_street_15));
                    songs.add(getString(R.string.gramatik_street_16));
                    songs.add(getString(R.string.gramatik_street_17));
                    songs.add(getString(R.string.gramatik_street_18));
                    songs.add(getString(R.string.gramatik_street_19));
                    songs.add(getString(R.string.gramatik_street_20));
                    break;
                } else songs.clear();
            //RHCP
            case 3:
                if(album == 1) {
                    songs.clear();
                    songs.add(getString(R.string.rhcp_stadium_1));
                    songs.add(getString(R.string.rhcp_stadium_2));
                    songs.add(getString(R.string.rhcp_stadium_3));
                    songs.add(getString(R.string.rhcp_stadium_4));
                    songs.add(getString(R.string.rhcp_stadium_5));
                    songs.add(getString(R.string.rhcp_stadium_6));
                    songs.add(getString(R.string.rhcp_stadium_7));
                    songs.add(getString(R.string.rhcp_stadium_8));
                    songs.add(getString(R.string.rhcp_stadium_9));
                    songs.add(getString(R.string.rhcp_stadium_10));
                    songs.add(getString(R.string.rhcp_stadium_11));
                    songs.add(getString(R.string.rhcp_stadium_12));
                    songs.add(getString(R.string.rhcp_stadium_13));
                    songs.add(getString(R.string.rhcp_stadium_14));
                    songs.add(getString(R.string.rhcp_stadium_15));
                    songs.add(getString(R.string.rhcp_stadium_16));
                    songs.add(getString(R.string.rhcp_stadium_17));
                    songs.add(getString(R.string.rhcp_stadium_18));
                    songs.add(getString(R.string.rhcp_stadium_19));
                    songs.add(getString(R.string.rhcp_stadium_20));
                    songs.add(getString(R.string.rhcp_stadium_21));
                    songs.add(getString(R.string.rhcp_stadium_22));
                    songs.add(getString(R.string.rhcp_stadium_23));
                    songs.add(getString(R.string.rhcp_stadium_24));
                    songs.add(getString(R.string.rhcp_stadium_25));
                    songs.add(getString(R.string.rhcp_stadium_26));
                    songs.add(getString(R.string.rhcp_stadium_27));
                    songs.add(getString(R.string.rhcp_stadium_28));
                    break;
                } else if(album == 2) {
                    songs.clear();
                    songs.add(getString(R.string.rhcp_californication_1));
                    songs.add(getString(R.string.rhcp_californication_2));
                    songs.add(getString(R.string.rhcp_californication_3));
                    songs.add(getString(R.string.rhcp_californication_4));
                    songs.add(getString(R.string.rhcp_californication_5));
                    songs.add(getString(R.string.rhcp_californication_6));
                    songs.add(getString(R.string.rhcp_californication_7));
                    songs.add(getString(R.string.rhcp_californication_8));
                    songs.add(getString(R.string.rhcp_californication_9));
                    songs.add(getString(R.string.rhcp_californication_10));
                    songs.add(getString(R.string.rhcp_californication_11));
                    songs.add(getString(R.string.rhcp_californication_12));
                    songs.add(getString(R.string.rhcp_californication_13));
                    songs.add(getString(R.string.rhcp_californication_14));
                    songs.add(getString(R.string.rhcp_californication_15));
                    break;
                } else if(album == 3){
                    songs.clear();
                    songs.add(getString(R.string.rhcp_getaway_1));
                    songs.add(getString(R.string.rhcp_getaway_2));
                    songs.add(getString(R.string.rhcp_getaway_3));
                    songs.add(getString(R.string.rhcp_getaway_4));
                    songs.add(getString(R.string.rhcp_getaway_5));
                    songs.add(getString(R.string.rhcp_getaway_6));
                    songs.add(getString(R.string.rhcp_getaway_7));
                    songs.add(getString(R.string.rhcp_getaway_8));
                    songs.add(getString(R.string.rhcp_getaway_9));
                    songs.add(getString(R.string.rhcp_getaway_10));
                    songs.add(getString(R.string.rhcp_getaway_11));
                    songs.add(getString(R.string.rhcp_getaway_12));
                    break;
                } else songs.clear();
            //Woodkid
            case 4:
                if(album == 1) {
                    songs.clear();
                    songs.add(getString(R.string.woodkid_golden_1));
                    songs.add(getString(R.string.woodkid_golden_2));
                    songs.add(getString(R.string.woodkid_golden_3));
                    songs.add(getString(R.string.woodkid_golden_4));
                    songs.add(getString(R.string.woodkid_golden_5));
                    songs.add(getString(R.string.woodkid_golden_6));
                    songs.add(getString(R.string.woodkid_golden_7));
                    songs.add(getString(R.string.woodkid_golden_8));
                    songs.add(getString(R.string.woodkid_golden_9));
                    songs.add(getString(R.string.woodkid_golden_10));
                    songs.add(getString(R.string.woodkid_golden_11));
                    songs.add(getString(R.string.woodkid_golden_12));
                    songs.add(getString(R.string.woodkid_golden_13));
                    songs.add(getString(R.string.woodkid_golden_14));
                    break;
                } else if(album == 2){
                    songs.clear();
                    songs.add(getString(R.string.woodkid_desierto_1));
                    songs.add(getString(R.string.woodkid_desierto_2));
                    songs.add(getString(R.string.woodkid_desierto_3));
                    songs.add(getString(R.string.woodkid_desierto_4));
                    songs.add(getString(R.string.woodkid_desierto_5));
                    songs.add(getString(R.string.woodkid_desierto_6));
                    songs.add(getString(R.string.woodkid_desierto_7));
                    songs.add(getString(R.string.woodkid_desierto_8));
                    songs.add(getString(R.string.woodkid_desierto_9));
                    songs.add(getString(R.string.woodkid_desierto_10));
                    songs.add(getString(R.string.woodkid_desierto_11));
                    songs.add(getString(R.string.woodkid_desierto_12));
                    break;
                } else songs.clear();
        }
    }
}
