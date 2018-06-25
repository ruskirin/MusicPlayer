package com.project.udacity.my.musicplayer;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ListView items below
        ArrayList<Artist> artists = new ArrayList<>();

        final Artist BlueStahli = new Artist("Blue Stahli", getDrawable(R.drawable.bluestahliprofile));
        artists.add(BlueStahli);
        final Artist Celldweller = new Artist("Celldweller", getDrawable(R.drawable.celldwellerprofile));
        artists.add(Celldweller);
        final Artist Gramatik = new Artist("Gramatik", getDrawable(R.drawable.gramatikprofile));
        artists.add(Gramatik);
        final Artist Rhcp = new Artist("Red Hot Chili Peppers", getDrawable(R.drawable.redhotcprofile));
        artists.add(Rhcp);
        final Artist Woodkid = new Artist("Woodkid", getDrawable(R.drawable.woodkidprofile));
        artists.add(Woodkid);

        //Initialize listview
        ListView mainArtistList = (ListView)findViewById(R.id.layout_main_artist_list);
        //initialize custom arrayadapter
        ArtistAdapter artistAdapter = new ArtistAdapter(this, artists);
        //attach adapter to listview
        mainArtistList.setAdapter(artistAdapter);

        mainArtistList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch(position) {
                    case 0:
                        Intent toBlueStahli = new Intent(MainActivity.this, ArtistActivity.class);
                        toBlueStahli.putExtra("artist", 0);
                        toBlueStahli.putExtra("artist pic", R.drawable.bluestahliprofile);
                        toBlueStahli.putExtra("artist name", R.string.bluestahli_name);
                        toBlueStahli.putExtra("artist bio", R.string.bluestahli_bio);
                        startActivity(toBlueStahli);
                        break;
                    case 1:
                        Intent toCellDweller = new Intent(MainActivity.this, ArtistActivity.class);
                        toCellDweller.putExtra("artist", 1);
                        toCellDweller.putExtra("artist pic", R.drawable.celldwellerprofile);
                        toCellDweller.putExtra("artist name", R.string.celldweller_name);
                        toCellDweller.putExtra("artist bio", R.string.celldweller_bio);
                        startActivity(toCellDweller);
                        break;
                    case 2:
                        Intent toGramatik = new Intent(MainActivity.this, ArtistActivity.class);
                        toGramatik.putExtra("artist", 2);
                        toGramatik.putExtra("artist pic", R.drawable.gramatikprofile);
                        toGramatik.putExtra("artist name", R.string.gramatik_name);
                        toGramatik.putExtra("artist bio", R.string.gramatik_bio);
                        startActivity(toGramatik);
                        break;
                    case 3:
                        Intent toRHCP = new Intent(MainActivity.this, ArtistActivity.class);
                        toRHCP.putExtra("artist", 3);
                        toRHCP.putExtra("artist pic", R.drawable.redhotcprofile);
                        toRHCP.putExtra("artist name", R.string.redhotcp_name);
                        toRHCP.putExtra("artist bio", R.string.redhotcp_bio);
                        startActivity(toRHCP);
                        break;
                    case 4:
                        Intent toWoodkid = new Intent(MainActivity.this, ArtistActivity.class);
                        toWoodkid.putExtra("artist", 4);
                        toWoodkid.putExtra("artist pic", R.drawable.woodkidprofile);
                        toWoodkid.putExtra("artist name", R.string.woodkid_name);
                        toWoodkid.putExtra("artist bio", R.string.woodkid_bio);
                        startActivity(toWoodkid);
                        break;

                }
            }
        });

    }
    //Custom arrayadapter for artist display
    private static class ArtistAdapter extends ArrayAdapter<Artist> {

        private ArtistAdapter(@NonNull Context context, ArrayList<Artist> artists) {
            super(context, 0, artists);
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            //Retrieve artist information
            Artist artist = getItem(position);

            //Check whether a new view should be created
            if(convertView == null)
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.artist_main_view, parent, false);

            //Look-up view
            ImageView artistpic = (ImageView) convertView.findViewById(R.id.view_artist_pic);
            TextView artistname = (TextView) convertView.findViewById(R.id.view_artist_name);
            //Populate view
            artistpic.setImageDrawable(artist.getPicture());
            artistname.setText(artist.getName());

            return convertView;
        }
    }
}
