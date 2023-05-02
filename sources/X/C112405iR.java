package X;

import android.content.Context;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: X.5iR  reason: invalid class name and case insensitive filesystem */
public class C112405iR extends C112485iZ {
    public C117215sd A00;
    public C116475rR A01;
    public final AnonymousClass1Vo A02 = AnonymousClass1Vo.A00("GetContactsPaymentStatusIndiaUpiNetworkCallback", "network", "IN");

    public C112405iR(Context context, C14870pt r11, C117215sd r12, C18340wX r13, C116475rR r14) {
        super(context, r11, r13, (AnonymousClass4XO) null, "get-contacts-payment-status");
        this.A01 = r14;
        this.A00 = r12;
    }

    public void A03(AnonymousClass2HJ r2) {
        super.A03(r2);
        this.A00.A01.accept(r2);
    }

    public void A04(AnonymousClass2HJ r2) {
        super.A04(r2);
        this.A00.A02.accept(r2);
    }

    public void A05(C28371Vv r25) {
        String A0g;
        try {
            C116475rR r1 = this.A01;
            C28371Vv r9 = r25;
            C28371Vv.A06(r9, "iq");
            C28371Vv r3 = r1.A00;
            Class<String> cls = String.class;
            Long A0X = AnonymousClass3K2.A0X();
            Long A0Y = AnonymousClass3K2.A0Y();
            C32271fx.A01((C16300so) null, r9, cls, A0X, A0Y, "result", new String[]{"type"}, false);
            C28371Vv r17 = r9;
            Long l2 = A0X;
            Long l3 = A0Y;
            C32271fx.A01((C16300so) null, r17, C34791ks.class, l2, l3, C34791ks.A00, new String[]{"from"}, false);
            C32271fx.A01((C16300so) null, r9, cls, A0X, A0Y, "get-contacts-payment-status", new String[]{"account", "action"}, false);
            Class<String> cls2 = cls;
            Object A012 = C32271fx.A01((C16300so) null, r3, cls2, l2, l3, (Object) null, new String[]{"id"}, false);
            C32271fx.A01((C16300so) null, r9, cls2, l2, l3, A012, new String[]{"id"}, true);
            List<AnonymousClass5wY> A07 = C32271fx.A07(r9, new AnonymousClass62T(), new String[]{"account", "contact"}, 0, Long.MAX_VALUE);
            HashMap A0x = AnonymousClass000.A0x();
            for (AnonymousClass5wY r4 : A07) {
                A0x.put(r4.A00.getRawString(), r4.A02);
            }
            C117215sd r7 = this.A00;
            ArrayList A0u = AnonymousClass000.A0u();
            for (C16010sH r42 : r7.A03) {
                Jid A08 = r42.A08(UserJid.class);
                if (!(A08 == null || (A0g = C110115dX.A0g(A08.getRawString(), A0x)) == null || 2 != C35511m3.A01(A0g.toLowerCase(Locale.US)))) {
                    A0u.add(r42);
                }
            }
            r7.A00.accept(A0u);
        } catch (AnonymousClass1W9 unused) {
            this.A02.A05("sendGetContactsPaymentStatus/onResponseSuccess/CorruptStreamException");
            C117215sd r2 = this.A00;
            r2.A02.accept(new AnonymousClass2HJ(500));
        }
    }
}
