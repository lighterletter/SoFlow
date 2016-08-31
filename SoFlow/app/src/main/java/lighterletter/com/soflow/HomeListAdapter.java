package lighterletter.com.soflow;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.VideoView;


public class HomeListAdapter extends RecyclerView.Adapter<HomeListAdapter.ViewHolder> {


    @Override
    public HomeListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.home_item, parent, false);
        // Return a new holder instance
        ViewHolder viewHolder = new HomeListAdapter.ViewHolder(contactView);

        return viewHolder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        VideoView video = holder.video;
        Button button = holder.button;
    }


    @Override
    public int getItemCount() {
        return 20;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        VideoView video;
        Button button;

        public ViewHolder(View itemView) {
            super(itemView);
            video = (VideoView) itemView.findViewById(R.id.user_video);
            button = (Button) itemView.findViewById(R.id.view_comments);
        }
    }
}
