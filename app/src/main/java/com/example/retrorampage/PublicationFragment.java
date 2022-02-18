//Asocio la clase al paquete
package com.example.retrorampage;

//Importo las librerias necesarias
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

//Declaro la clase y heredo de fragment
public class PublicationFragment extends Fragment {

    //
    private RecyclerView m_RecyclerView;

    //Defino el metodo que se ejecuta segun el ciclo de vida del fragment
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    //
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //Asocio el fragment con su layout
        View view = inflater.inflate(R.layout.activity_publication_recycler_view,container);


        return view;
    }

    //
    public static void rankingMode(){



    }

    //
    public static void standbyMode(){



    }

    //
    public static void newInstance(Context context){



    }

}