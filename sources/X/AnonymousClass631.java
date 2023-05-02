package X;

import android.util.Log;

/* renamed from: X.631  reason: invalid class name */
public class AnonymousClass631 implements AnonymousClass5SD {
    public final /* synthetic */ AnonymousClass1KK A00;
    public final /* synthetic */ String A01;

    public AnonymousClass631(AnonymousClass1KK r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public void AWK(C29661az r3) {
        Log.e("WaBkPreloadHelper", AnonymousClass000.A0h(this.A01, AnonymousClass000.A0r("Should not prefetch async actions: ")));
    }

    public void AWO(AnonymousClass2WZ r6) {
        StringBuilder A0r;
        int i2 = r6.A00;
        if (i2 == 5) {
            A0r = AnonymousClass000.A0r("BLOKS: Prefetch successful (");
            A0r.append(this.A01);
        } else {
            A0r = AnonymousClass000.A0r("BLOKS: Prefetch failed (");
            A0r.append(this.A01);
            A0r.append(", status=");
            A0r.append(i2);
        }
        Log.v("WaBkPreloadHelper", AnonymousClass000.A0h(")", A0r));
    }
}
