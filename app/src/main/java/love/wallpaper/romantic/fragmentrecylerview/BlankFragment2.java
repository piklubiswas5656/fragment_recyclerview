package love.wallpaper.romantic.fragmentrecylerview;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import love.wallpaper.romantic.fragmentrecylerview.Adapter.Adapter;
import love.wallpaper.romantic.fragmentrecylerview.Modal.Modal;


public class BlankFragment2 extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    private RecyclerView recyclerView;
    private ArrayList<Modal> data;
    private Adapter adapter;

    public BlankFragment2() {
        // Required empty public constructor
    }


    public static BlankFragment2 newInstance(String param1, String param2) {
        BlankFragment2 fragment = new BlankFragment2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank2, container, false);
        recyclerView = view.findViewById(R.id.recyclerview2);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new Adapter(getContext(), getdata());
        recyclerView.setAdapter(adapter);
        return view;
    }

    private ArrayList<Modal> getdata() {
        ArrayList<Modal> holder = new ArrayList<>();
        Modal obj1 = new Modal("this is title", "this is description");
        holder.add(obj1);

        Modal obj2 = new Modal("this is title", "this is description 2");
        holder.add(obj2);

        Modal obj3 = new Modal("this is title", "this is description 3");
        holder.add(obj3);

        Modal obj4 = new Modal("this is title", "this is description 4");
        holder.add(obj4);

        return holder;
    }
}