package com.example.tugasuts.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tugasuts.R;
import com.example.tugasuts.Util.Tensiku;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TensiFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class TensiFragment extends Fragment {

    private OnFragmentInteractionListener mListener;

    public TensiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tensi, container, false);
        final EditText sistolText = view.findViewById(R.id.editText);
        final EditText diastolText = view.findViewById(R.id.editText2);



        Button cektensiButton = view.findViewById(R.id.button2);
        cektensiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mListener != null){
                    String sistolString = sistolText.getText().toString();
                    String diastolString = diastolText.getText().toString();
                    if (!TextUtils.isEmpty(sistolString) && !TextUtils.isEmpty(diastolString)){
                        int sistol = Integer.parseInt(sistolString);
                        int diastol = Integer.parseInt(diastolString);
                        Tensiku tensiku = new Tensiku(sistol, diastol);
                        mListener.onCekTensiButtonClicked(tensiku.Tekanan());
                    } else  {
                        Toast.makeText(getActivity(), "Please Input Your Sistol and Diastol", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
       // void onFragmentInteraction(Uri uri);

        void onCekTensiButtonClicked(String i);
    }
}
