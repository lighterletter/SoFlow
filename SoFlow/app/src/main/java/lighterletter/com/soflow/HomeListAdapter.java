package lighterletter.com.soflow;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class HomeListAdapter extends RecyclerView.Adapter<HomeListAdapter.ViewHolder> {
    private List<Video> videos;

    public HomeListAdapter() {
        setItems(new ArrayList<Video>());
    }

    public HomeListAdapter(List<Video> videos){
       setItems(videos);
    }

    public void setItems(List<Video> videos){
        this.videos = videos;
    }


    @Override
    public HomeListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        // Inflate the custom layout
        View view = inflater.inflate(R.layout.home_item, parent, false);
        // Return a new holder instance
        ViewHolder viewHolder = new HomeListAdapter.ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bindView(videos.get(position));
    }


    @Override
    public int getItemCount() {
        return videos.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        VideoView videoView;
        Button commentBtn;

        public ViewHolder(View itemView) {
            super(itemView);
            videoView = (VideoView) itemView.findViewById(R.id.user_video);
            commentBtn = (Button) itemView.findViewById(R.id.view_comments);
        }

        public void bindView(Video video){
            videoView.setVideoURI(video.getUri());
            commentBtn.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            switch(view.getId()){
                case R.id.user_video:
                case R.id.view_comments: //todo
            }
        }
    }
}
