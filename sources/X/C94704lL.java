package X;

import android.view.View;
import android.widget.AdapterView;
import android.widget.RadioButton;
import com.obwhatsapp.backup.google.GoogleDriveNewUserSetupActivity;

/* renamed from: X.4lL  reason: invalid class name and case insensitive filesystem */
public class C94704lL implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ GoogleDriveNewUserSetupActivity A00;

    public C94704lL(GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity) {
        this.A00 = googleDriveNewUserSetupActivity;
    }

    public void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity = this.A00;
        if (googleDriveNewUserSetupActivity.A04.getVisibility() == 0) {
            googleDriveNewUserSetupActivity.A3F((RadioButton) null, String.valueOf(adapterView.getItemAtPosition(i2)));
        }
    }

    public void onNothingSelected(AdapterView adapterView) {
    }
}
