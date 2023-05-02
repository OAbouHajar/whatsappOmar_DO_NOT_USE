package X;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: X.0Cs  reason: invalid class name */
public class AnonymousClass0Cs extends AnonymousClass05J implements AnonymousClass06H {
    public Context A00;
    public C009804r A01;
    public C016607w A02;
    public ActionBarContextView A03;
    public WeakReference A04;
    public boolean A05;

    public AnonymousClass0Cs(Context context, C009804r r4, ActionBarContextView actionBarContextView) {
        this.A00 = context;
        this.A03 = actionBarContextView;
        this.A01 = r4;
        C016607w r1 = new C016607w(actionBarContextView.getContext());
        r1.A00 = 1;
        this.A02 = r1;
        r1.A0D(this);
    }

    public Menu A00() {
        return this.A02;
    }

    public MenuInflater A01() {
        return new C02350Bg(this.A03.getContext());
    }

    public View A02() {
        WeakReference weakReference = this.A04;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public CharSequence A03() {
        return this.A03.A0D;
    }

    public CharSequence A04() {
        return this.A03.A0E;
    }

    public void A05() {
        if (!this.A05) {
            this.A05 = true;
            this.A03.sendAccessibilityEvent(32);
            this.A01.APd(this);
        }
    }

    public void A06() {
        this.A01.AV8(this.A02, this);
    }

    public void A07(int i2) {
        A0A(this.A00.getString(i2));
    }

    public void A08(int i2) {
        A0B(this.A00.getString(i2));
    }

    public void A09(View view) {
        this.A03.setCustomView(view);
        this.A04 = view != null ? new WeakReference(view) : null;
    }

    public void A0A(CharSequence charSequence) {
        this.A03.setSubtitle(charSequence);
    }

    public void A0B(CharSequence charSequence) {
        this.A03.setTitle(charSequence);
    }

    public void A0C(boolean z2) {
        this.A01 = z2;
        this.A03.setTitleOptional(z2);
    }

    public boolean A0D() {
        return this.A03.A0H;
    }

    public boolean ATe(MenuItem menuItem, C016607w r3) {
        return this.A01.AM1(menuItem, this);
    }

    public void ATf(C016607w r2) {
        A06();
        AnonymousClass0ZV r0 = this.A03.A0A;
        if (r0 != null) {
            r0.A03();
        }
    }
}
