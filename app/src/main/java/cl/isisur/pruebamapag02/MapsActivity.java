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
        LatLng Local1 = new LatLng(-36.618174360096106, -72.1077998164599);
        LatLng Local2 = new LatLng(-36.61397107559495, -72.12354615885812);
        LatLng Local3 = new LatLng(-36.59073945462864, -72.08989341717141);
        LatLng Local4 = new LatLng(-36.606409185771085, -72.0690306183908);
        LatLng UbicacionInicial = new LatLng(-36.589807712243825, -72.08260039678616);


        mMap.addMarker(new MarkerOptions().position(Local1).title("Local1"));
        mMap.addMarker(new MarkerOptions().position(Local2).title("Local2"));
        mMap.addMarker(new MarkerOptions().position(Local3).title("Local3"));
        mMap.addMarker(new MarkerOptions().position(Local4).title("Local4"));
        mMap.addMarker(new MarkerOptions().position(UbicacionInicial).title("Ubicacion Inicial"));


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(UbicacionInicial, 15));
        mMap.setMinZoomPreference(4.0F);
        mMap.setMaxZoomPreference(18.0f);


    }
}