package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxCListenerShape134S0100000_3_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.5gY  reason: invalid class name and case insensitive filesystem */
public abstract class C111545gY extends C19530ya {
    public Toolbar A00;
    public String A01;
    public final AnonymousClass013 A02;
    public final WaBloksActivity A03;

    public C111545gY(AnonymousClass013 r1, WaBloksActivity waBloksActivity) {
        this.A02 = r1;
        this.A03 = waBloksActivity;
    }

    public View A00() {
        return this.A03.findViewById(R.id.bk_navigation_custom_view);
    }

    public C005402i A01() {
        C005402i x2 = this.A03.x();
        AnonymousClass00B.A06(x2);
        return x2;
    }

    public void A02() {
        C52372dh r2;
        C52372dh r1;
        if (this instanceof C114745oV) {
            C114745oV r22 = (C114745oV) this;
            if (r22.A00 != null) {
                AnonymousClass1K6.A0A(r22.A03.AH1(), r22.A00);
            }
        } else if (this instanceof C114755oW) {
            C114755oW r0 = (C114755oW) this;
            C114695oP r6 = (C114695oP) r0.A03;
            C118775vE r5 = r0.A00;
            String str = r5.A02;
            C18450wi.A0H(str, 0);
            String str2 = r6.A03;
            if (!(str2 == null || (r1 = r6.A00) == null)) {
                r1.A01(new C1207262t(str2, str));
            }
            String str3 = r5.A00;
            String str4 = r5.A01;
            if (r6.A05 && (r2 = r6.A00) != null) {
                r2.A01(new C1207362u(str3, str4, true));
            }
        }
    }

    public abstract void A03(Intent intent, Bundle bundle);

    public abstract void A04(C108615Or r1);

    public boolean A05() {
        return this instanceof C114745oV ? AnonymousClass000.A1V(((C114745oV) this).A00) : this instanceof C114755oW;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        WaBloksActivity waBloksActivity = this.A03;
        AnonymousClass00B.A0G(AnonymousClass000.A1Y(activity, waBloksActivity));
        if (bundle != null) {
            this.A01 = bundle.getString("bk_navigation_bar_title");
        }
        Toolbar toolbar = (Toolbar) AnonymousClass00T.A05(waBloksActivity, R.id.wabloks_screen_toolbar);
        this.A00 = toolbar;
        toolbar.setTitle((CharSequence) "");
        Toolbar toolbar2 = this.A00;
        toolbar2.A07();
        waBloksActivity.Aem(toolbar2);
        A01().A0N(true);
        this.A00.setNavigationIcon(this instanceof C114755oW ? ((C114755oW) this).A00.A00() : C110105dW.A0E(waBloksActivity, this.A02, R.drawable.ic_back));
        this.A00.setBackgroundColor(waBloksActivity.getResources().getColor(R.color.color0807));
        this.A00.setNavigationOnClickListener(new IDxCListenerShape134S0100000_3_I0(activity, 1));
        A03(activity.getIntent(), bundle);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        bundle.putString("bk_navigation_bar_title", this.A01);
        super.onActivitySaveInstanceState(activity, bundle);
    }
}
