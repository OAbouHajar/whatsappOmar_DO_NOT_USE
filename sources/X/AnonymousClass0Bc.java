package X;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* renamed from: X.0Bc  reason: invalid class name */
public class AnonymousClass0Bc extends ActionMode {
    public final Context A00;
    public final AnonymousClass05J A01;

    public AnonymousClass0Bc(Context context, AnonymousClass05J r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public void finish() {
        this.A01.A05();
    }

    public View getCustomView() {
        return this.A01.A02();
    }

    public Menu getMenu() {
        return new AnonymousClass0Cu(this.A00, (C016707x) this.A01.A00());
    }

    public MenuInflater getMenuInflater() {
        return this.A01.A01();
    }

    public CharSequence getSubtitle() {
        return this.A01.A03();
    }

    public Object getTag() {
        return this.A01.A00;
    }

    public CharSequence getTitle() {
        return this.A01.A04();
    }

    public boolean getTitleOptionalHint() {
        return this.A01.A01;
    }

    public void invalidate() {
        this.A01.A06();
    }

    public boolean isTitleOptional() {
        return this.A01.A0D();
    }

    public void setCustomView(View view) {
        this.A01.A09(view);
    }

    public void setSubtitle(int i2) {
        this.A01.A07(i2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.A01.A0A(charSequence);
    }

    public void setTag(Object obj) {
        this.A01.A00 = obj;
    }

    public void setTitle(int i2) {
        this.A01.A08(i2);
    }

    public void setTitle(CharSequence charSequence) {
        this.A01.A0B(charSequence);
    }

    public void setTitleOptionalHint(boolean z2) {
        this.A01.A0C(z2);
    }
}
