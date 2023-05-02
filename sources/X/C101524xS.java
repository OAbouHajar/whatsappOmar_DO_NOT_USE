package X;

import android.app.Activity;
import android.view.View;
import com.obwhatsapp.R;

/* renamed from: X.4xS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C101524xS implements AnonymousClass5PN {
    public final /* synthetic */ AnonymousClass348 A00;

    public /* synthetic */ C101524xS(AnonymousClass348 r1) {
        this.A00 = r1;
    }

    public final void AXB(boolean z2) {
        View findViewById;
        Activity A002 = AnonymousClass22N.A00(this.A00.getContext());
        if (A002 != null && (findViewById = A002.findViewById(R.id.proximity_overlay)) != null) {
            int i2 = 4;
            if (z2) {
                i2 = 0;
            }
            findViewById.setVisibility(i2);
        }
    }
}
