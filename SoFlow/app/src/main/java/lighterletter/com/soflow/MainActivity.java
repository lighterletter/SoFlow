package lighterletter.com.soflow;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initHomeList();
    }

    public void initHomeList(){
        FragmentManager fg = getSupportFragmentManager();
        FragmentTransaction transaction = fg.beginTransaction();

        HomeFragment homeScreen = new HomeFragment();
        transaction.replace(R.id.main_container, homeScreen);
        transaction.commit();
    }

}
