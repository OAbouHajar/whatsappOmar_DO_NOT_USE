package X;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.facebook.redex.IDxSListenerShape36S0000000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import java.util.List;
import java.util.Map;

/* renamed from: X.5ex  reason: invalid class name and case insensitive filesystem */
public class C110865ex extends AnonymousClass01X {
    public final C50262Yq A00;
    public final AnonymousClass013 A01;
    public final C35251lc A02;
    public final Map A03 = AnonymousClass000.A0x();

    public C110865ex(C50262Yq r2, AnonymousClass013 r3, C35251lc r4) {
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
    }

    public int A0C() {
        return this.A02.A05.A08.size() + 1;
    }

    public void ANf(C005602k r26, int i2) {
        C005602k r10 = r26;
        C35251lc r6 = this.A02;
        C35221lZ r2 = r6.A05;
        List list = r2.A08;
        int i3 = i2;
        if (i3 < list.size()) {
            C93554jO r8 = (C93554jO) list.get(i3);
            C110995fA r102 = (C110995fA) r10;
            AnonymousClass013 r9 = this.A01;
            C35691mL r12 = (C35691mL) this.A03.get(r8.A00());
            C35211lY r5 = r8.A01;
            long j2 = r5.A01;
            int i4 = r8.A00;
            String A04 = r6.A04(r9, new C35211lY(r5.A00, r5.A02, j2 * ((long) i4)));
            WaImageView waImageView = r102.A00;
            Resources A0D = C13680ns.A0D(waImageView);
            r102.A03.setText(r8.A03);
            r102.A02.setText(C13700nu.A0F(A0D, Integer.valueOf(i4), C13680ns.A1b(), 0, R.string.str0ed7));
            r102.A01.setText(A04);
            if (r12 == null) {
                waImageView.setImageDrawable(new ColorDrawable(A0D.getColor(R.color.color0887)));
            } else {
                r102.A04.A02(waImageView, r12, (C108515Oh) null, new IDxSListenerShape36S0000000_3_I1(1), 2);
            }
        } else {
            C111065fH r103 = (C111065fH) r10;
            AnonymousClass013 r13 = this.A01;
            C35211lY r4 = r2.A06;
            String A042 = r6.A04(r13, r4);
            C35211lY r3 = r2.A03;
            String A043 = r6.A04(r13, r3);
            C35211lY r52 = r2.A04;
            String A044 = r6.A04(r13, r52);
            String A045 = r6.A04(r13, r2.A05);
            String A032 = r6.A03(r13);
            String str = null;
            String str2 = r4 == null ? null : r4.A02;
            String str3 = r3 == null ? null : r3.A02;
            if (r52 != null) {
                str = r52.A02;
            }
            if (!TextUtils.isEmpty(A042) || !TextUtils.isEmpty(A043) || !TextUtils.isEmpty(A044)) {
                r103.A07(0);
                r103.A08(r103.A05, r103.A06, r13, (String) null, A045, R.string.str0ecc);
                r103.A08(r103.A07, r103.A08, r13, str2, A042, R.string.str0ecd);
                r103.A08(r103.A01, r103.A02, r13, str3, A043, R.string.str0e9d);
                r103.A08(r103.A03, r103.A04, r13, str, A044, R.string.str0ebc);
            } else {
                r103.A07(8);
            }
            r103.A09.setText(A032);
        }
    }

    public C005602k APF(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            return new C110995fA(C110105dW.A07(viewGroup).inflate(R.layout.layout043b, viewGroup, false), this.A00);
        }
        if (i2 == 1) {
            return new C111065fH(C110105dW.A07(viewGroup).inflate(R.layout.layout0435, viewGroup, false));
        }
        throw AnonymousClass000.A0V(C13680ns.A0c(i2, "Unsupported view type - "));
    }

    public int getItemViewType(int i2) {
        return AnonymousClass000.A1R(i2, this.A02.A05.A08.size()) ? 1 : 0;
    }
}
