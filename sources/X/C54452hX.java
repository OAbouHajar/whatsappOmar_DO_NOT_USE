package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1;

/* renamed from: X.2hX  reason: invalid class name and case insensitive filesystem */
public final class C54452hX extends ContextWrapper {
    public LayoutInflater A00;
    public LayoutInflater A01;
    public AnonymousClass01A A02;
    public final AnonymousClass05T A03;

    public C54452hX(Context context, AnonymousClass01A r4) {
        super(context);
        ViewComponentManager$FragmentContextWrapper$1 viewComponentManager$FragmentContextWrapper$1 = new ViewComponentManager$FragmentContextWrapper$1(this);
        this.A03 = viewComponentManager$FragmentContextWrapper$1;
        this.A00 = null;
        this.A02 = r4;
        r4.A0K.A00(viewComponentManager$FragmentContextWrapper$1);
    }

    public C54452hX(LayoutInflater layoutInflater, AnonymousClass01A r4) {
        super(layoutInflater.getContext());
        ViewComponentManager$FragmentContextWrapper$1 viewComponentManager$FragmentContextWrapper$1 = new ViewComponentManager$FragmentContextWrapper$1(this);
        this.A03 = viewComponentManager$FragmentContextWrapper$1;
        this.A00 = layoutInflater;
        this.A02 = r4;
        r4.A0K.A00(viewComponentManager$FragmentContextWrapper$1);
    }

    public static LayoutInflater A00(LayoutInflater layoutInflater, AnonymousClass01A r2) {
        return layoutInflater.cloneInContext(new C54452hX(layoutInflater, r2));
    }

    public static C54452hX A01(Context context, AnonymousClass01A r2) {
        return new C54452hX(context, r2);
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        LayoutInflater layoutInflater = this.A01;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflater2 = this.A00;
        if (layoutInflater2 == null) {
            layoutInflater2 = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            this.A00 = layoutInflater2;
        }
        LayoutInflater cloneInContext = layoutInflater2.cloneInContext(this);
        this.A01 = cloneInContext;
        return cloneInContext;
    }
}
