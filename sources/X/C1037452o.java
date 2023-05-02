package X;

import android.view.View;
import com.obwhatsapp.CircularProgressBar;

/* renamed from: X.52o  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1037452o implements AnonymousClass2NR {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C1037452o(int i2, int i3, boolean z2) {
        this.A02 = z2;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final void ASD(View view) {
        boolean z2 = this.A02;
        int i2 = this.A00;
        int i3 = this.A01;
        CircularProgressBar circularProgressBar = (CircularProgressBar) view;
        circularProgressBar.setIndeterminate(z2);
        circularProgressBar.setProgress(i2);
        circularProgressBar.A0C = i3;
    }
}
