package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.2of  reason: invalid class name and case insensitive filesystem */
public final class C56842of extends FrameLayout implements C001300o, AnonymousClass006 {
    public C614238v A00;
    public C52662eE A01;
    public boolean A02;
    public final C009604p A03;

    public C56842of(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            C16320sq A1B = C16150sX.A1B(A002);
            this.A00 = new C614238v((C19150xq) A002.AFC.get(), new AnonymousClass1DH(C16150sX.A0e(A002), C16150sX.A0m(A002)), (C16220sf) A002.A3y.get(), A1B);
        }
        this.A03 = new C009604p(this);
        FrameLayout.inflate(context, R.layout.layout0082, this);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public C009604p getLifecycle() {
        return this.A03;
    }

    public final C614238v getViewModel() {
        C614238v r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18450wi.A03("viewModel");
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A03.A05(C011005f.RESUMED);
        TextView A0M = C13680ns.A0M(this, R.id.auto_muted_text);
        Resources A0D = C13680ns.A0D(A0M);
        Object[] A1b = C13680ns.A1b();
        AnonymousClass000.A1K(A1b, 256);
        C13700nu.A0M(A0D, A0M, A1b, R.plurals.plurals002a, 256);
        C13680ns.A1A(findViewById(R.id.unmute_cta), this, 22);
        C13680ns.A1A(findViewById(R.id.ok_cta), this, 23);
        C13680ns.A1L(this, getViewModel().A02, 0);
        C13680ns.A1L(this, getViewModel().A01, 1);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A03.A05(C011005f.DESTROYED);
        C614238v viewModel = getViewModel();
        viewModel.A04.A03(viewModel.A03);
    }

    public final void setViewModel(C614238v r2) {
        C18450wi.A0H(r2, 0);
        this.A00 = r2;
    }
}
