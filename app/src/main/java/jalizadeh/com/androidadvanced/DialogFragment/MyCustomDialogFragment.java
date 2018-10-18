package jalizadeh.com.androidadvanced.DialogFragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import jalizadeh.com.androidadvanced.R;

public class MyCustomDialogFragment extends DialogFragment {

    //widgets
    private EditText  etInput;
    private TextView actionCancel,actionOk;


    //it will listen for the input
    public interface OnInputListener{
        void sendInput(String input);
    }

    public OnInputListener mOnInputListener;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dialog_fragment_video12, container, false);

        etInput = (EditText) view.findViewById(R.id.etFragmentInput);
        actionCancel = (TextView) view.findViewById(R.id.tvCancel);
        actionOk = (TextView) view.findViewById(R.id.tvOk);

        //cancel and close the dialog
        actionCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDialog().dismiss();
            }
        });


        actionOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String input = etInput.getText().toString();

                if(! input.equals("")){

                    //easiest way, BUT not good
                    //((Activity_DialogFragment)getActivity()).textFromFragment.setText(input);

                    //best way
                    mOnInputListener.sendInput(input);

                    getDialog().dismiss();
                }
            }
        });

        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            mOnInputListener = (OnInputListener) getActivity();
        } catch (ClassCastException e){
            //
        }
    }
}
