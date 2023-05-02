package X;

import com.obwhatsapp.framework.alerts.ui.AlertCardListFragment;

/* renamed from: X.4mE  reason: invalid class name and case insensitive filesystem */
public final class C95184mE implements AnonymousClass04o {
    public final /* synthetic */ AlertCardListFragment A00;

    public C95184mE(AlertCardListFragment alertCardListFragment) {
        this.A00 = alertCardListFragment;
    }

    public C003401n A6s(Class cls) {
        String str;
        AlertCardListFragment alertCardListFragment = this.A00;
        if (alertCardListFragment.A01 != null) {
            C18080w7 r1 = alertCardListFragment.A02;
            if (r1 != null) {
                return new AnonymousClass3Pi(r1);
            }
            str = "alertStorage";
        } else {
            str = "alertListViewModelFactory";
        }
        throw C18450wi.A03(str);
    }

    public /* synthetic */ C003401n A73(C013806q r2, Class cls) {
        return C013906r.A00(this, cls);
    }
}
