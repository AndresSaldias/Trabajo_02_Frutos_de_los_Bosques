package cl.isisur.pruebamapag02;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import cl.isisur.pruebamapag02.databinding.ActivityMapsBinding;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapa);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera

        LatLng Lugar1 =new LatLng(-36.58999084991806, -72.0814869839765);
        LatLng Lugar2 =new LatLng(-36.58651756859308, -72.13047768843629);
        LatLng Lugar3 =new LatLng(-36.650502119872094, -72.0357752673742);
        LatLng Lugar4 =new LatLng(-36.65227052928064, -72.10934133924727);
        LatLng Lugar5 =new LatLng(-36.58979728421823, -72.0825509148436);



        mMap.addMarker(new MarkerOptions().position(Lugar1).title("Ubicacion 1"));
        mMap.addMarker(new MarkerOptions().position(Lugar2).title("Ubicacion 2"));
        mMap.addMarker(new MarkerOptions().position(Lugar3).title("Ubicacion 3"));
        mMap.addMarker(new MarkerOptions().position(Lugar4).title("Ubicacion 4"));
        mMap.addMarker(new MarkerOptions().position(Lugar5).title("mi Ubicacion"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lugar5,1010));
        mMap.setMinZoomPreference(4.0F);
        mMap.setMaxZoomPreference(18.0f);


    }
}