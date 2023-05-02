package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;

/* renamed from: X.3Cw  reason: invalid class name and case insensitive filesystem */
public class C62293Cw implements View.OnLayoutChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C606734v A02;
    public final /* synthetic */ boolean A03;

    public C62293Cw(View view, View view2, C606734v r3, boolean z2) {
        this.A02 = r3;
        this.A01 = view;
        this.A00 = view2;
        this.A03 = z2;
    }

    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        Rect A0J = AnonymousClass000.A0J();
        Rect A0J2 = AnonymousClass000.A0J();
        Point point = new Point();
        Point point2 = new Point();
        View view2 = this.A01;
        view2.getGlobalVisibleRect(A0J, point2);
        this.A00.getGlobalVisibleRect(A0J2, point);
        A0J.offset(point2.x - A0J.left, point2.y - A0J.top);
        A0J2.offset(-point.x, -point.y);
        C606734v r8 = this.A02;
        r8.A0P.set(A0J);
        view2.setLayoutParams(C13690nt.A0M());
        C46212Cy.A01(r8.A0O, A0J, A0J2, view2, r8.A06, r8, (C55322jK) null, r8.A0A, this.A03, false);
        r8.A04();
        view.removeOnLayoutChangeListener(this);
    }
}
