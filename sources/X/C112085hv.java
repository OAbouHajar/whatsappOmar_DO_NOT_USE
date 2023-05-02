package X;

import android.content.Context;
import com.facebook.redex.IDxNConsumerShape41S0200000_3_I0;
import com.obwhatsapp.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5hv  reason: invalid class name and case insensitive filesystem */
public class C112085hv extends AnonymousClass1GQ {
    public static Map A0C = new AnonymousClass67T();
    public static Map A0D = new AnonymousClass67U();
    public final C19980zJ A00;
    public final C14870pt A01;
    public final AnonymousClass173 A02;
    public final C18310wU A03;
    public final C18290wS A04;
    public final C112495ia A05;
    public final C118485ul A06;
    public final AnonymousClass1JN A07;
    public final C118955vg A08;
    public final C18280wR A09;
    public final AnonymousClass1GN A0A;
    public final C20180zd A0B;

    public C112085hv(C19980zJ r1, C14870pt r2, AnonymousClass173 r3, C18310wU r4, C18290wS r5, C112495ia r6, C118485ul r7, AnonymousClass1JN r8, C118955vg r9, C18280wR r10, AnonymousClass1GN r11, C20180zd r12) {
        this.A01 = r2;
        this.A0A = r11;
        this.A00 = r1;
        this.A09 = r10;
        this.A04 = r5;
        this.A0B = r12;
        this.A07 = r8;
        this.A03 = r4;
        this.A02 = r3;
        this.A05 = r6;
        this.A08 = r9;
        this.A06 = r7;
    }

    public void A00(Context context, String str) {
        C14870pt r4 = this.A01;
        r4.A08(0, R.string.str0c8c);
        HashMap A0x = AnonymousClass000.A0x();
        A0x.put("action", "start");
        HashMap A0x2 = AnonymousClass000.A0x();
        A0x2.put("type", "modal");
        HashMap A0x3 = AnonymousClass000.A0x();
        A0x3.put("style", A0x2);
        A0x.put("presentation", A0x3);
        HashMap A0x4 = AnonymousClass000.A0x();
        A0x4.put("device_id", this.A09.A01());
        AnonymousClass1JN r6 = this.A07;
        C17950vu r5 = r6.A01;
        if (!A0x4.isEmpty()) {
            r5.A0G.putAll(A0x4);
        }
        AnonymousClass4W4 r9 = new AnonymousClass4W4(A0x, "br_merchant_onboarding", (String) null);
        C1204461r r3 = new C1204461r(this);
        C1204061n r7 = new C1204061n(this);
        AnonymousClass1WD r2 = new AnonymousClass1WD();
        r5.A0I.put("BRMerchantData", r3);
        r6.A00(r7, new C1204161o(r2, this), r9, str, (Map) null);
        r2.A01(new IDxNConsumerShape41S0200000_3_I0(context, 0, this), r4.A06);
    }

    public void A01(AnonymousClass1TV r2) {
        if (this.A08.A06.A03()) {
            this.A06.A00(r2);
        } else {
            this.A05.A00(r2);
        }
    }
}
