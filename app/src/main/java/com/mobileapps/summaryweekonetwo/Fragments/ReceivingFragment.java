package com.mobileapps.summaryweekonetwo.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mobileapps.summaryweekonetwo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReceivingFragment extends Fragment {

    public static final String RECV_FRAG_TAG = "receiving_frag";
    TextView tvMessageReceived;

    public static ReceivingFragment newInstance() {
        ReceivingFragment receivingFragment = new ReceivingFragment();
        return receivingFragment;
    }


    public ReceivingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_receiving, container, false);
        tvMessageReceived = view.findViewById(R.id.tvMessageReceived);
        return view;
    }

    public void recieveMessage(String msgReceived){
        tvMessageReceived.setText(msgReceived);
    }

    public interface OnFragmentInteractionListener {
        public void sendString(String stringToSend);
    }

}
