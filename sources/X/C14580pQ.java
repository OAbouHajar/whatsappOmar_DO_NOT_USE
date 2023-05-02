package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.redex.IDxDListenerShape358S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape2S0200000_I0;

/* renamed from: X.0pQ  reason: invalid class name and case insensitive filesystem */
public abstract class C14580pQ extends C14590pR {
    public static final int A03 = -1;
    public ViewTreeObserver.OnDrawListener A00;
    public C47712Kc A01;
    public Boolean A02;

    private View A1X() {
        if (A1s().A01) {
            return getWindow().getDecorView();
        }
        return null;
    }

    public static /* synthetic */ void A1Y() {
    }

    public int A1r() {
        return -1;
    }

    public C31091dS A1s() {
        return new C31091dS(A1r());
    }

    public final Boolean A1t(C14710pd r3) {
        Boolean bool = this.A02;
        if (bool != null) {
            return bool;
        }
        Boolean valueOf = Boolean.valueOf(r3.A0E(C16620tM.A02, 2310));
        this.A02 = valueOf;
        return valueOf;
    }

    public void A1u() {
    }

    public void A1v() {
    }

    public void A1w() {
    }

    public void A1x() {
    }

    public void A1y() {
        this.A02 = null;
    }

    public final void A1z() {
    }

    public void A20(View view, C14870pt r4) {
        Boolean bool = this.A02;
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        if (bool.booleanValue()) {
            this.A00 = new AnonymousClass2T7(view, r4, this);
            view.getViewTreeObserver().addOnDrawListener(this.A00);
        }
    }

    public void A21(View view, C14870pt r3) {
        Boolean bool = this.A02;
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        if (bool.booleanValue()) {
            AKv("onRendered");
            AL0(2);
            A22(view, r3);
        }
    }

    public void A22(View view, C14870pt r4) {
        r4.A02.post(new RunnableRunnableShape2S0200000_I0(view, 40, this));
    }

    public void A23(C47712Kc r1) {
        this.A01 = r1;
    }

    public final void A24(String str, boolean z2, boolean z3) {
        this.A01.A01.A0B(str, z2, z3);
    }

    public void AKv(String str) {
        this.A01.A01.A07(str);
    }

    public void AKw(String str) {
        this.A01.A01.A08(str);
    }

    public void AL0(short s2) {
        this.A01.A01.A0C(s2);
    }

    public void AL7(String str) {
        this.A01.A01.A09(str);
    }

    public void ANY() {
        this.A01.A01.A08("data_load");
    }

    public void APM() {
        this.A01.A01.A07("data_load");
    }

    public void AW4() {
        this.A01.A01.A0C(230);
    }

    public void attachBaseContext(Context context) {
        String simpleName = getClass().getSimpleName();
        this.A01 = new C47712Kc((C226718v) ((C229119t) ((C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class))).ACp.get()).A00.A01.ACk.get(), A1s(), simpleName);
        super.attachBaseContext(context);
    }

    public void onCreate(Bundle bundle) {
        if (!getIntent().getBooleanExtra("key_perf_tracked", false)) {
            C47712Kc r0 = this.A01;
            if (!r0.A01.A08.AJC(A1r())) {
                long longExtra = getIntent().getLongExtra("perf_start_time_ns", -1);
                String stringExtra = getIntent().getStringExtra("perf_origin");
                if (stringExtra == null) {
                    stringExtra = getClass().getSimpleName();
                }
                C47712Kc r8 = this.A01;
                View A1X = A1X();
                IDxDListenerShape358S0100000_2_I0 iDxDListenerShape358S0100000_2_I0 = new IDxDListenerShape358S0100000_2_I0(this, 1);
                if (A1X != null && r8.A01.A06.A01) {
                    AnonymousClass2T8 r3 = new AnonymousClass2T8(A1X);
                    r8.A00 = r3;
                    r3.A00(new AnonymousClass2T9(r8, iDxDListenerShape358S0100000_2_I0));
                }
                if (r8.A01.A0D(stringExtra, longExtra)) {
                    getIntent().putExtra("key_perf_tracked", true);
                }
            }
        }
        super.onCreate(bundle);
    }

    public void onResume() {
        super.onResume();
    }

    public void onStart() {
        super.onStart();
    }

    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }
}
