package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.2iO  reason: invalid class name and case insensitive filesystem */
public class C54862iO extends AnonymousClass07D {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass2V7 A01;
    public final /* synthetic */ AnonymousClass013 A02;

    public C54862iO(AnonymousClass2V7 r1, AnonymousClass013 r2, int i2) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i2;
    }

    public void A03(Rect rect, View view, AnonymousClass0Ri r6, RecyclerView recyclerView) {
        boolean z2 = !this.A02.A0T();
        int i2 = this.A00;
        if (z2) {
            rect.set(0, 0, i2, 0);
        } else {
            rect.set(i2, 0, 0, 0);
        }
    }
}
