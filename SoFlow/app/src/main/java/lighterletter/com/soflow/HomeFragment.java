package lighterletter.com.soflow;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class HomeFragment extends Fragment {

    Context context;
    RecyclerView recyclerView;
    HomeListAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        List<Video> videoList = new ArrayList<>();

        Video test = new Video("http://techslides.com/demos/sample-videos/small.mp4");
        Video test2 = new Video("http://techslides.com/demos/sample-videos/small.mp4");
        Video test3 = new Video("http://techslides.com/demos/sample-videos/small.mp4");
        Video test4 = new Video("http://techslides.com/demos/sample-videos/small.mp4");
        Video test5 = new Video("http://techslides.com/demos/sample-videos/small.mp4");

        videoList.add(test);
        videoList.add(test2);
        videoList.add(test3);
        videoList.add(test4);
        videoList.add(test5);
        adapter = new HomeListAdapter(videoList);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        assert container != null;
        View view = inflater.inflate(R.layout.home_fragment, container, false);
        context = view.getContext();
        recyclerView = (RecyclerView) view.findViewById(R.id.home_content);
        setupRecyclerView(recyclerView);
        return view;
    }

    public void setupRecyclerView(RecyclerView rv){
        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        rv.setAdapter(adapter);
        rv.setLayoutManager(layoutManager);
    }


}
