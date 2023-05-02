package X;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.AppCompatSpinner;

/* renamed from: X.0Z3  reason: invalid class name */
public class AnonymousClass0Z3 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AnonymousClass0DD A00;
    public final /* synthetic */ AppCompatSpinner A01;

    public AnonymousClass0Z3(AnonymousClass0DD r1, AppCompatSpinner appCompatSpinner) {
        this.A00 = r1;
        this.A01 = appCompatSpinner;
    }

    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        AnonymousClass0DD r3 = this.A00;
        AppCompatSpinner appCompatSpinner = r3.A04;
        appCompatSpinner.setSelection(i2);
        if (appCompatSpinner.getOnItemClickListener() != null) {
            appCompatSpinner.performItemClick(view, i2, r3.A01.getItemId(i2));
        }
        r3.dismiss();
    }
}
