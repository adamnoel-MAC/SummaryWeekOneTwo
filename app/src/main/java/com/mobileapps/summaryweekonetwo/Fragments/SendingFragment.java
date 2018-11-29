package com.mobileapps.summaryweekonetwo.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.mobileapps.summaryweekonetwo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SendingFragment extends Fragment implements View.OnClickListener{

    public static final String SEND_FRAG_TAG = "sending_frag";
    EditText etMessageToSend;
    Button btnSendMessage;
    OnFragmentInteractionListener mListener;

    public SendingFragment() {
        // Required empty public constructor
    }

    public static SendingFragment newInstance(){
        SendingFragment sendingFragment = new SendingFragment();
        return sendingFragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof OnFragmentInteractionListener){
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sending, container, false);
        etMessageToSend = view.findViewById(R.id.etMessageToSend);
        btnSendMessage = view.findViewById(R.id.btnSendMessage);
        btnSendMessage.setOnClickListener(this);
        return view;
    }

//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//    }

    public void onClick(View view) {
        String messageToSend = etMessageToSend.getText().toString();
        mListener.sendMessageToMainActivity(messageToSend.isEmpty() ? "EMPTY" : messageToSend);
    }

    public interface OnFragmentInteractionListener{
        public void sendMessageToMainActivity(String messageToSend);
    }

}
