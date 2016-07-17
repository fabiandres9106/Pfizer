package fabian.pfizer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by fabian on 14/07/16.
 * Fragmento perteneciente al FragmentoInicio. Muestra el mapa de avances del usuario
 */
public class FragmentoCalificaciones extends Fragment {
    public FragmentoCalificaciones(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragmento_calificaciones, container, false);
    }



}
