package in.dharmalife.library;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import in.dharmalife.logslibrary.LogsCreation;

public class EntryClass extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entry_point);

        LogsCreation logsCreation = new LogsCreation();
        if (logsCreation.checkExternalMedia()) {
            logsCreation.writeToSDFile();
        }

        Log.e("Read File ", logsCreation.readFile());
    }
}
