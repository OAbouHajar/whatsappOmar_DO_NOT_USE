package X;

import android.view.View;
import com.obwhatsapp.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.60R  reason: invalid class name */
public class AnonymousClass60R implements AnonymousClass1TV {
    public final int A00;
    public final C227319b A01;
    public final C1222969a A02;
    public final WeakReference A03;

    public AnonymousClass60R(C227319b r2, C1222969a r3, C112885jv r4, int i2) {
        this.A02 = r3;
        this.A00 = i2;
        this.A01 = r2;
        this.A03 = new WeakReference(r4);
    }

    public final void A00(AnonymousClass2HJ r4, C112885jv r5) {
        int i2;
        C1222969a r1 = this.A02;
        if (r1 != null) {
            r1.AKK(r4, this.A00);
        }
        r5.Ac1();
        if (r4 != null) {
            C227319b r2 = this.A01;
            if (r2 == null || (i2 = r2.AC2((AnonymousClass4XO) null, r4.A00)) == 0) {
                i2 = R.string.str0f74;
            }
            r5.Afg(i2);
        }
    }

    public void AWC(AnonymousClass2HJ r4) {
        C112885jv r2 = (C112885jv) this.A03.get();
        if (r2 != null) {
            r2.A0J.A06(AnonymousClass000.A0g("setDefault/onRequestError. paymentNetworkError: ", r4));
            A00(r4, r2);
        }
    }

    public void AWI(AnonymousClass2HJ r4) {
        C112885jv r2 = (C112885jv) this.A03.get();
        if (r2 != null) {
            r2.A0J.A04(AnonymousClass000.A0g("setDefault/onResponseError. paymentNetworkError: ", r4));
            A00(r4, r2);
        }
    }

    public void AWJ(AnonymousClass2HK r7) {
        int i2;
        C112885jv r2 = (C112885jv) this.A03.get();
        if (r2 != null) {
            r2.A0J.A06("setDefault Success");
            C1222969a r3 = this.A02;
            if (r3 != null) {
                r3.AKK((AnonymousClass2HJ) null, this.A00);
            }
            C118925vd r4 = r2.A0E;
            List list = ((AnonymousClass3w0) r7).A00;
            if (r4 instanceof C112755jA) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C30671cl A0F = C110115dX.A0F(it);
                    if (A0F.A0A.equals(r4.A04.A08.A0A)) {
                        r4.A00(A0F);
                        break;
                    }
                }
            } else {
                r4.A01.setImageResource(R.drawable.ic_settings_starred);
                r4.A02.setText(R.string.str0664);
                r4.A00.setOnClickListener((View.OnClickListener) null);
            }
            r2.Ac1();
            if (this instanceof C112965kx) {
                boolean equals = "p2m".equals(((C112965kx) this).A01);
                i2 = R.string.str0f7c;
                if (equals) {
                    i2 = R.string.str0f7b;
                }
            } else {
                i2 = R.string.str0f7a;
            }
            r2.Afh(r2.getString(i2));
        }
    }
}
