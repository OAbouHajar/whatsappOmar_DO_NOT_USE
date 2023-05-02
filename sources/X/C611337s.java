package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.obwhatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.37s  reason: invalid class name and case insensitive filesystem */
public final class C611337s extends C114725oT {
    public C611337s(AnonymousClass013 r1, WaBloksActivity waBloksActivity) {
        super(r1, waBloksActivity);
    }

    public void A03(Intent intent, Bundle bundle) {
        super.A03(intent, bundle);
        A01().A0J(this.A01);
    }

    public void A04(C108615Or r3) {
        C18450wi.A0H(r3, 0);
        super.A04(r3);
        this.A01 = r3.A9T().A0J(36);
        A01().A0J(this.A01);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C18450wi.A0H(activity, 0);
        super.onActivityCreated(activity, bundle);
        C19530ya.A01(activity, this);
    }
}
