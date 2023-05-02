package X;

import android.view.View;
import com.facebook.redex.ViewOnClickCListenerShape15S0100000_I1;
import com.obwhatsapp.R;

/* renamed from: X.3Ef  reason: invalid class name and case insensitive filesystem */
public class C62603Ef implements AnonymousClass5SS {
    public View A00;
    public final AnonymousClass02C A01;
    public final AnonymousClass1VI A02;
    public final C23071Aj A03;
    public final C16440t3 A04;
    public final AnonymousClass13U A05;
    public final C84864Me A06;

    public C62603Ef(AnonymousClass02C r1, AnonymousClass1VI r2, C23071Aj r3, C16440t3 r4, AnonymousClass13U r5, C84864Me r6) {
        this.A02 = r2;
        this.A01 = r1;
        this.A06 = r6;
        this.A03 = r3;
        this.A05 = r5;
        this.A04 = r4;
    }

    public void AHm() {
        C13680ns.A13(this.A00);
    }

    public boolean AfA() {
        this.A02.getContext();
        return false;
    }

    public void AhG() {
        AnonymousClass1VI r8 = this.A02;
        r8.getContext();
        View view = this.A00;
        if (view == null) {
            view = C13680ns.A0H(C13680ns.A0G(r8), r8, R.layout.layout01fd);
            this.A00 = view;
        }
        C13680ns.A0L(view, R.id.smb_warning_banner_body).setText(AnonymousClass1ZW.A00(r8.getContext(), new Object[]{AnonymousClass1ZW.A06(r8.getContext(), R.color.color072f)}, R.string.str1b93));
        r8.setBackgroundResource(R.color.color072e);
        C84864Me r3 = this.A06;
        r8.setOnClickListener(new ViewOnClickCListenerShape15S0100000_I1(this, 36));
        C004601z.A0E(view, R.id.close).setOnClickListener(new ViewOnClickCListenerShape15S0100000_I1(this, 35));
        view.setVisibility(0);
        if (!r3.A01.A0E(C16620tM.A02, 1730)) {
            C74583qm r1 = new C74583qm();
            r1.A00 = 1;
            r1.A01 = 32;
            r3.A03.A05(r1);
        }
        new C75663sW();
        throw AnonymousClass000.A0W("source");
    }
}
