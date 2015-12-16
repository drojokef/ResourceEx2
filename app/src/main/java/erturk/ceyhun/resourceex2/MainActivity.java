package erturk.ceyhun.resourceex2;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.textView);
        int beyazRenk = getResources().getColor(R.color.siyah);
        mTextView.setTypeface(null, Typeface.ITALIC);
        mTextView.setTextColor(beyazRenk);
    }


}
