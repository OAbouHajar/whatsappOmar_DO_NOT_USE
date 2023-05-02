package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.obwhatsapp.R;
import java.util.ArrayList;

/* renamed from: X.09B  reason: invalid class name */
public class AnonymousClass09B extends C005402i {
    public Window.Callback A00;
    public AnonymousClass09G A01;
    public ArrayList A02 = new ArrayList();
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass09E A06;
    public final Runnable A07 = new AnonymousClass09C(this);

    public AnonymousClass09B(Window.Callback callback, Toolbar toolbar, CharSequence charSequence) {
        AnonymousClass09D r2 = new AnonymousClass09D(this);
        this.A06 = r2;
        AnonymousClass09F r1 = new AnonymousClass09F(toolbar, false);
        this.A01 = r1;
        AnonymousClass09L r0 = new AnonymousClass09L(callback, this);
        this.A00 = r0;
        r1.A07 = r0;
        toolbar.A0R = r2;
        r1.setWindowTitle(charSequence);
    }

    public float A00() {
        return C004601z.A00(((AnonymousClass09F) this.A01).A09);
    }

    public int A01() {
        return ((AnonymousClass09F) this.A01).A01;
    }

    public Context A02() {
        return ((AnonymousClass09F) this.A01).A09.getContext();
    }

    public View A03() {
        return ((AnonymousClass09F) this.A01).A06;
    }

    public void A05() {
        ((AnonymousClass09F) this.A01).A09.removeCallbacks(this.A07);
    }

    public void A06() {
        ((AnonymousClass09F) this.A01).A09.setVisibility(8);
    }

    public void A07() {
        ((AnonymousClass09F) this.A01).A09.setVisibility(0);
    }

    public void A08(float f2) {
        C004601z.A0X(((AnonymousClass09F) this.A01).A09, f2);
    }

    public void A09(int i2) {
        AnonymousClass09F r3 = (AnonymousClass09F) this.A01;
        r3.AeA(AnonymousClass06L.A02().A05(r3.A09.getContext(), R.drawable.ic_pip_close));
    }

    public void A0A(int i2) {
        AnonymousClass09G r1 = this.A01;
        r1.Ael(((AnonymousClass09F) r1).A09.getContext().getText(i2));
    }

    public void A0B(int i2) {
        AnonymousClass09G r1 = this.A01;
        r1.Aer(i2 != 0 ? ((AnonymousClass09F) r1).A09.getContext().getText(i2) : null);
    }

    public void A0D(Drawable drawable) {
        ((AnonymousClass09F) this.A01).A09.setBackground(drawable);
    }

    public void A0E(Drawable drawable) {
        this.A01.AeA(drawable);
    }

    public void A0F(Drawable drawable) {
        AnonymousClass09F r0 = (AnonymousClass09F) this.A01;
        r0.A04 = null;
        r0.A00();
    }

    public void A0G(View view) {
        A0H(view, new AnonymousClass05K(-2, -2));
    }

    public void A0H(View view, AnonymousClass05K r3) {
        if (view != null) {
            view.setLayoutParams(r3);
        }
        this.A01.Adp(view);
    }

    public void A0I(CharSequence charSequence) {
        this.A01.Ael(charSequence);
    }

    public void A0J(CharSequence charSequence) {
        this.A01.Aer(charSequence);
    }

    public void A0K(CharSequence charSequence) {
        this.A01.setWindowTitle(charSequence);
    }

    public void A0L(boolean z2) {
        if (z2 != this.A03) {
            this.A03 = z2;
            ArrayList arrayList = this.A02;
            if (0 < arrayList.size()) {
                arrayList.get(0);
                throw new NullPointerException("onMenuVisibilityChanged");
            }
        }
    }

    public void A0M(boolean z2) {
    }

    public void A0N(boolean z2) {
        int i2 = 0;
        if (z2) {
            i2 = 4;
        }
        A0Z(i2, 4);
    }

    public void A0O(boolean z2) {
        A0Z(16, 16);
    }

    public void A0P(boolean z2) {
        A0Z(0, 2);
    }

    public void A0Q(boolean z2) {
        int i2 = 0;
        if (z2) {
            i2 = 8;
        }
        A0Z(i2, 8);
    }

    public void A0R(boolean z2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.A08;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0S() {
        /*
            r2 = this;
            X.09G r0 = r2.A01
            X.09F r0 = (X.AnonymousClass09F) r0
            androidx.appcompat.widget.Toolbar r0 = r0.A09
            androidx.appcompat.widget.ActionMenuView r0 = r0.A0O
            if (r0 == 0) goto L_0x0015
            X.0ZV r0 = r0.A08
            if (r0 == 0) goto L_0x0015
            boolean r1 = r0.A01()
            r0 = 1
            if (r1 != 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09B.A0S():boolean");
    }

    public boolean A0T() {
        Toolbar toolbar = ((AnonymousClass09F) this.A01).A09;
        Runnable runnable = this.A07;
        toolbar.removeCallbacks(runnable);
        toolbar.postOnAnimation(runnable);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.A08;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0U() {
        /*
            r2 = this;
            X.09G r0 = r2.A01
            X.09F r0 = (X.AnonymousClass09F) r0
            androidx.appcompat.widget.Toolbar r0 = r0.A09
            androidx.appcompat.widget.ActionMenuView r0 = r0.A0O
            if (r0 == 0) goto L_0x0015
            X.0ZV r0 = r0.A08
            if (r0 == 0) goto L_0x0015
            boolean r1 = r0.A03()
            r0 = 1
            if (r1 != 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09B.A0U():boolean");
    }

    public boolean A0V() {
        C07290av r0;
        AnonymousClass0ZS r02 = ((AnonymousClass09F) this.A01).A09.A0Q;
        if (r02 == null || (r0 = r02.A01) == null) {
            return false;
        }
        r0.collapseActionView();
        return true;
    }

    public boolean A0W(int i2, KeyEvent keyEvent) {
        Menu A0Y = A0Y();
        if (A0Y == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() == 1) {
            z2 = false;
        }
        A0Y.setQwertyMode(z2);
        return A0Y.performShortcut(i2, keyEvent, 0);
    }

    public boolean A0X(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            A0U();
        }
        return true;
    }

    public final Menu A0Y() {
        if (!this.A04) {
            AnonymousClass09G r0 = this.A01;
            ((AnonymousClass09F) r0).A09.setMenuCallbacks(new AnonymousClass0ZQ(this), new AnonymousClass0ZJ(this));
            this.A04 = true;
        }
        return ((AnonymousClass09F) this.A01).A09.getMenu();
    }

    public void A0Z(int i2, int i3) {
        AnonymousClass09G r2 = this.A01;
        r2.Adr((i2 & i3) | ((i3 ^ -1) & ((AnonymousClass09F) r2).A01));
    }
}
