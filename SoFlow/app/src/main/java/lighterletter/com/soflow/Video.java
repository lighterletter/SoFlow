package lighterletter.com.soflow;

import android.net.Uri;

/**
 * Created by C4Q on 9/10/16.
 */
public class Video implements Model {

    String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public Video() {
    }

    public Video(String url) {

        this.url = url;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
