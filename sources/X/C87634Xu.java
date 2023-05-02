package X;

import android.view.View;
import android.widget.ListView;

/* renamed from: X.4Xu  reason: invalid class name and case insensitive filesystem */
public class C87634Xu {
    public static void A00(View view, AnonymousClass01A r3) {
        C001000l A0C = r3.A0C();
        if (A0C instanceof C14680pa) {
            ((C14680pa) A0C).installScrollableCallbacks(view);
        }
    }

    public static void A01(View view, AnonymousClass01A r3, int i2) {
        C001000l A0C = r3.A0C();
        if (A0C instanceof C14680pa) {
            ListView listView = (ListView) view.findViewById(16908298);
            C64103Mt r2 = new C64103Mt(A0C, i2);
            C004601z.A0d(r2, 2);
            if (listView != null) {
                listView.addFooterView(r2, (Object) null, false);
            }
        }
    }
}
