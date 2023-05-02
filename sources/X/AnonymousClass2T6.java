package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* renamed from: X.2T6  reason: invalid class name */
public class AnonymousClass2T6 extends ContextWrapper {
    public LayoutInflater A00;
    public final AnonymousClass2T5 A01;
    public final C008804a A02;
    public final AnonymousClass013 A03;

    public AnonymousClass2T6(Context context, AnonymousClass2T5 r4, AnonymousClass013 r5) {
        super(r5.A02(context));
        this.A03 = r5;
        this.A01 = r4;
        boolean z2 = getBaseContext().getResources() instanceof C008804a;
        Resources resources = getBaseContext().getResources();
        this.A02 = z2 ? (C008804a) resources : C008804a.A00(resources, r5);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return new AnonymousClass2T6(super.createConfigurationContext(configuration), this.A01, this.A03);
    }

    public Resources getResources() {
        return this.A02;
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        LayoutInflater layoutInflater = this.A00;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        AnonymousClass2TG r2 = new AnonymousClass2TG(this, LayoutInflater.from(getBaseContext()), ((AnonymousClass2T4) this.A01).A00);
        this.A00 = r2;
        return r2;
    }
}
