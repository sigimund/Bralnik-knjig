package aplikacija.bralnik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ArrayAdapter;
import android.widget.Toolbar;

public class Bralnik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bralnik);

        setTitle(null);

        Toolbar meniToolbar = (Toolbar) findViewById(R.id.ZaMeni);
        setSupportActionBar(meniToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

    }

    private void setSupportActionBar(Toolbar a) {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater aa = getMenuInflater();
        aa.inflate(R.menu.meni,menu);
        return true;
    }
}
