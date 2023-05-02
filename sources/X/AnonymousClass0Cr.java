package X;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: X.0Cr  reason: invalid class name */
public class AnonymousClass0Cr extends AnonymousClass05J implements AnonymousClass06H {
    public C009804r A00;
    public WeakReference A01;
    public final Context A02;
    public final C016607w A03;
    public final /* synthetic */ C02480Cg A04;

    public AnonymousClass0Cr(Context context, C02480Cg r4, C009804r r5) {
        this.A04 = r4;
        this.A02 = context;
        this.A00 = r5;
        C016607w r1 = new C016607w(context);
        r1.A00 = 1;
        this.A03 = r1;
        r1.A0D(this);
    }

    public Menu A00() {
        return this.A03;
    }

    public MenuInflater A01() {
        return new C02350Bg(this.A02);
    }

    public View A02() {
        WeakReference weakReference = this.A01;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public CharSequence A03() {
        return this.A04.A0A.A0D;
    }

    public CharSequence A04() {
        return this.A04.A0A.A0E;
    }

    public void A05() {
        C02480Cg r3 = this.A04;
        if (r3.A05 == this) {
            boolean z2 = r3.A0H;
            boolean z3 = r3.A0I;
            if (z2 || z3) {
                r3.A07 = this;
                r3.A06 = this.A00;
            } else {
                this.A00.APd(this);
            }
            this.A00 = null;
            r3.A0Z(false);
            ActionBarContextView actionBarContextView = r3.A0A;
            if (actionBarContextView.A04 == null) {
                actionBarContextView.A03();
            }
            ((AnonymousClass09F) r3.A0C).A09.sendAccessibilityEvent(32);
            r3.A0B.setHideOnContentScrollEnabled(r3.A0J);
            r3.A05 = null;
        }
    }

    public void A06() {
        if (this.A04.A05 == this) {
            C016607w r1 = this.A03;
            r1.A08();
            try {
                this.A00.AV8(r1, this);
            } finally {
                r1.A07();
            }
        }
    }

    public void A07(int i2) {
        A0A(this.A04.A02.getResources().getString(i2));
    }

    public void A08(int i2) {
        A0B(this.A04.A02.getResources().getString(i2));
    }

    public void A09(View view) {
        this.A04.A0A.setCustomView(view);
        this.A01 = new WeakReference(view);
    }

    public void A0A(CharSequence charSequence) {
        this.A04.A0A.setSubtitle(charSequence);
    }

    public void A0B(CharSequence charSequence) {
        this.A04.A0A.setTitle(charSequence);
    }

    public void A0C(boolean z2) {
        this.A01 = z2;
        this.A04.A0A.setTitleOptional(z2);
    }

    public boolean A0D() {
        return this.A04.A0A.A0H;
    }

    public boolean ATe(MenuItem menuItem, C016607w r3) {
        C009804r r0 = this.A00;
        if (r0 != null) {
            return r0.AM1(menuItem, this);
        }
        return false;
    }

    public void ATf(C016607w r2) {
        if (this.A00 != null) {
            A06();
            AnonymousClass0ZV r0 = this.A04.A0A.A0A;
            if (r0 != null) {
                r0.A03();
            }
        }
    }
}
