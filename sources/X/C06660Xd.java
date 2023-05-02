package X;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* renamed from: X.0Xd  reason: invalid class name and case insensitive filesystem */
public class C06660Xd implements ComponentCallbacks {
    public final /* synthetic */ AnonymousClass09W A00;

    public C06660Xd(AnonymousClass09W r1) {
        this.A00 = r1;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        this.A00.A05();
    }
}
