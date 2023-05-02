package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.02m  reason: invalid class name and case insensitive filesystem */
public class C005802m extends Dialog implements C002300y {
    public C004301w A00;
    public final C001400p A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C005802m(android.content.Context r6, int r7) {
        /*
            r5 = this;
            r0 = r7
            if (r7 != 0) goto L_0x0015
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r6.getTheme()
            r1 = 2130968899(0x7f040143, float:1.7546465E38)
            r0 = 1
            r2.resolveAttribute(r1, r3, r0)
            int r0 = r3.resourceId
        L_0x0015:
            r5.<init>(r6, r0)
            X.0bA r0 = new X.0bA
            r0.<init>(r5)
            r5.A01 = r0
            X.01w r4 = r5.A00()
            if (r7 != 0) goto L_0x0037
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r6.getTheme()
            r1 = 2130968899(0x7f040143, float:1.7546465E38)
            r0 = 1
            r2.resolveAttribute(r1, r3, r0)
            int r7 = r3.resourceId
        L_0x0037:
            r0 = r4
            X.06G r0 = (X.AnonymousClass06G) r0
            r0.A02 = r7
            r0 = 0
            r4.A0D(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C005802m.<init>(android.content.Context, int):void");
    }

    public C004301w A00() {
        C004301w r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass06G r02 = new AnonymousClass06G(getContext(), getWindow(), this, this);
        this.A00 = r02;
        return r02;
    }

    public void A01() {
        AnonymousClass06G r3 = (AnonymousClass06G) A00();
        if (r3.A0Y) {
            r3.A0Y = false;
        }
        r3.A0P();
        r3.A0h = true;
    }

    public boolean A02(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void AYX(AnonymousClass05J r1) {
    }

    public void AYY(AnonymousClass05J r1) {
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A00().A0F(view, layoutParams);
    }

    public void dismiss() {
        super.dismiss();
        A00().A08();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AnonymousClass0NJ.A00(keyEvent, getWindow().getDecorView(), this, this.A01);
    }

    public View findViewById(int i2) {
        AnonymousClass06G r0 = (AnonymousClass06G) A00();
        r0.A0M();
        return r0.A08.findViewById(i2);
    }

    public void invalidateOptionsMenu() {
        A00().A07();
    }

    public void onCreate(Bundle bundle) {
        A00().A06();
        super.onCreate(bundle);
        A00().A0D(bundle);
    }

    public void onStop() {
        super.onStop();
        A00().A09();
    }

    public void setContentView(int i2) {
        A00().A0A(i2);
    }

    public void setContentView(View view) {
        A00().A0E(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A00().A0G(view, layoutParams);
    }

    public void setTitle(int i2) {
        super.setTitle(i2);
        A00().A0H(getContext().getString(i2));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        A00().A0H(charSequence);
    }
}
