package uet.se.assignment_recycleview;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class  Jobs extends Fragment {
    private RecyclerView recyclerView;
    private List<Model> my_list;
    RecyclerView.Adapter adapter;
    View view;
    private OnFragmentInteractionListener mListener;

    public Jobs() {

    }

    public static Jobs newInstance(String param1, String param2) {
        Jobs fragment = new Jobs();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        my_list = new ArrayList<>();
        my_list.add(new Model(R.drawable.sophie,"(111-123-456)","Anna"));
        my_list.add(new Model(R.drawable.jack,"(222-345-856)","Alsa"));
        my_list.add(new Model(R.drawable.john,"(333-523-457)","Rebacca"));
        my_list.add(new Model(R.drawable.sophie,"(444-896-458)","Rania"));
        my_list.add(new Model(R.drawable.sophie,"(555-183-996)","Rosmary"));
        my_list.add(new Model(R.drawable.sophie,"(666-673-490)","Vashma"));
        my_list.add(new Model(R.drawable.sophie,"(777-775-656)","Zarmenay"));
        my_list.add(new Model(R.drawable.sophie,"(888-895-777)","Ayesha"));
        my_list.add(new Model(R.drawable.sophie,"(456-654-000)","Rida"));
        my_list.add(new Model(R.drawable.sophie,"(257-193-496)","Sana"));
        my_list.add(new Model(R.drawable.sophie,"(100-565-987)","Seher"));
        my_list.add(new Model(R.drawable.sophie,"(567-173-999)","Asifa"));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_jobs, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recylcler_view);
        adapter = new RecyclerViewAdapter(my_list, getContext());
        recyclerView.hasFixedSize();
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {

        }
    }

    public void setInteractionListener(OnFragmentInteractionListener mListener){
        this.mListener = mListener;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
