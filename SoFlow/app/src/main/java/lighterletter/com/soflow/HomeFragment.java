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

public class HomeFragment extends Fragment {

    Context context;
    RecyclerView mainContent;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment, container, false);

        assert container != null;
        context = view.getContext();

        mainContent = (RecyclerView) view.findViewById(R.id.home_content);
        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        HomeListAdapter adapter = new HomeListAdapter();
        mainContent.setAdapter(adapter);
        mainContent.setLayoutManager(layoutManager);

        return view;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

}
