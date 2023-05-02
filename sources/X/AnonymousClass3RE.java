package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3RE  reason: invalid class name */
public final class AnonymousClass3RE extends AnonymousClass07D {
    public final C14990q7 A00;
    public final C31201dg A01;

    public AnonymousClass3RE(C14990q7 r1, C31201dg r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A03(Rect rect, View view, AnonymousClass0Ri r6, RecyclerView recyclerView) {
        List unmodifiableList;
        Rect rect2;
        C18450wi.A0H(rect, 0);
        C18450wi.A0J(view, recyclerView);
        int A002 = RecyclerView.A00(view);
        Object A05 = C62183Bz.A05(this.A00, this.A01);
        C18450wi.A0B(A05);
        List list = ((AnonymousClass39I) A05).A07;
        if (list != null && (unmodifiableList = Collections.unmodifiableList(list)) != null && (rect2 = (Rect) C003101j.A06(unmodifiableList, A002)) != null) {
            rect.set(rect2);
        }
    }
}
