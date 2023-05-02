package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.redex.IDxEWrapperShape174S0100000_2_I1;
import com.obwhatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.37t  reason: invalid class name and case insensitive filesystem */
public final class C611437t extends C114725oT {
    public C29671b0 A00;

    public C611437t(AnonymousClass013 r1, WaBloksActivity waBloksActivity) {
        super(r1, waBloksActivity);
    }

    public void A02() {
        if (this.A00 != null) {
            AnonymousClass1K6.A0A(this.A03.AH1(), this.A00);
        }
    }

    public void A03(Intent intent, Bundle bundle) {
        super.A03(intent, bundle);
        A01().A0J(this.A01);
    }

    public void A04(C108615Or r5) {
        C18450wi.A0H(r5, 0);
        super.A04(r5);
        AnonymousClass4NW r2 = new AnonymousClass4NW(r5.A9T().A0G(40));
        this.A00 = null;
        if (r2.A00 != null) {
            this.A00 = new IDxEWrapperShape174S0100000_2_I1(r2, 0);
        }
        String A0J = r5.A9T().A0J(36);
        this.A01 = A0J;
        if (AnonymousClass1ZW.A0E(A0J)) {
            this.A01 = r2.A04;
        }
        A01().A0J(this.A01);
    }

    public boolean A05() {
        return AnonymousClass000.A1V(this.A00);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C18450wi.A0H(activity, 0);
        super.onActivityCreated(activity, bundle);
        C19530ya.A01(activity, this);
    }
}
