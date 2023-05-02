package X;

import android.view.ViewTreeObserver;
import com.obwhatsapp.components.SelectionCheckView;

/* renamed from: X.4l1  reason: invalid class name and case insensitive filesystem */
public class C94504l1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ C85554Ox A00;
    public final /* synthetic */ boolean A01;

    public C94504l1(C85554Ox r1, boolean z2) {
        this.A00 = r1;
        this.A01 = z2;
    }

    public boolean onPreDraw() {
        SelectionCheckView selectionCheckView = this.A00.A08;
        AnonymousClass3K2.A10(selectionCheckView, this);
        selectionCheckView.A04(this.A01, true);
        return false;
    }
}
