package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: X.0Cw  reason: invalid class name */
public class AnonymousClass0Cw extends C016607w implements SubMenu {
    public C016607w A00;
    public C07290av A01;

    public AnonymousClass0Cw(Context context, C016607w r2, C07290av r3) {
        super(context);
        this.A00 = r2;
        this.A01 = r3;
    }

    public C016607w A02() {
        return this.A00.A02();
    }

    public String A04() {
        int itemId;
        C07290av r0 = this.A01;
        if (r0 == null || (itemId = r0.getItemId()) == 0) {
            return null;
        }
        StringBuilder A0r = AnonymousClass000.A0r("android:menu:actionviewstates");
        A0r.append(":");
        return AnonymousClass000.A0l(A0r, itemId);
    }

    public void A0D(AnonymousClass06H r2) {
        this.A00.A0D(r2);
    }

    public boolean A0H() {
        return this.A00.A0H();
    }

    public boolean A0I() {
        return this.A00.A0I();
    }

    public boolean A0J() {
        return this.A00.A0J();
    }

    public boolean A0K(MenuItem menuItem, C016607w r4) {
        return super.A0K(menuItem, r4) || this.A00.A0K(menuItem, r4);
    }

    public boolean A0M(C07290av r2) {
        return this.A00.A0M(r2);
    }

    public boolean A0N(C07290av r2) {
        return this.A00.A0N(r2);
    }

    public MenuItem getItem() {
        return this.A01;
    }

    public void setGroupDividerEnabled(boolean z2) {
        this.A00.setGroupDividerEnabled(z2);
    }

    public SubMenu setHeaderIcon(int i2) {
        if (i2 > 0) {
            this.A01 = AnonymousClass00T.A04(this.A0N, i2);
        }
        this.A02 = null;
        A0F(false);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        if (drawable != null) {
            this.A01 = drawable;
        }
        this.A02 = null;
        A0F(false);
        return this;
    }

    public SubMenu setHeaderTitle(int i2) {
        Resources resources = this.A0O;
        if (i2 > 0) {
            this.A05 = resources.getText(i2);
        }
        this.A02 = null;
        A0F(false);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.A05 = charSequence;
        }
        this.A02 = null;
        A0F(false);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        if (view != null) {
            this.A02 = view;
            this.A05 = null;
            this.A01 = null;
        } else {
            this.A02 = null;
        }
        A0F(false);
        return this;
    }

    public SubMenu setIcon(int i2) {
        this.A01.setIcon(i2);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.A01.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z2) {
        this.A00.setQwertyMode(z2);
    }
}
