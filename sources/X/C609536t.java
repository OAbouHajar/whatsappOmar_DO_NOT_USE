package X;

import android.util.Pair;
import com.obwhatsapp.IDxTSpanShape14S0200000_1_I0;

/* renamed from: X.36t  reason: invalid class name and case insensitive filesystem */
public class C609536t extends C16690tT {
    public final C14870pt A00;
    public final C23181Au A01;
    public final AnonymousClass4E1 A02;
    public final C17190ug A03;
    public final String A04;
    public final String A05;

    public C609536t(C14870pt r1, C23181Au r2, AnonymousClass4E1 r3, C17190ug r4, String str, String str2) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A05 = str;
        this.A04 = str2;
        this.A02 = r3;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        try {
            this.A03.A07(32000);
            return this.A01.A00(C34861kz.A0D, this.A04);
        } catch (C34541kR unused) {
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Pair pair = (Pair) obj;
        this.A00.A05();
        AnonymousClass4E1 r0 = this.A02;
        String str = this.A04;
        String str2 = this.A05;
        IDxTSpanShape14S0200000_1_I0 iDxTSpanShape14S0200000_1_I0 = r0.A00;
        C30011bb r1 = (C30011bb) iDxTSpanShape14S0200000_1_I0.A00;
        r1.A0o = null;
        if (pair != null) {
            r1.A0j.A00.put(str, pair);
        }
        C30011bb.A0H(pair, r1, str, str2, ((C16740tZ) iDxTSpanShape14S0200000_1_I0.A01).A11.A02);
    }
}
