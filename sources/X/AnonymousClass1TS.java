package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1TS  reason: invalid class name */
public class AnonymousClass1TS {
    public final C17030uP A00;
    public final C15860rz A01;
    public final C14710pd A02;
    public final C16490t9 A03;
    public final C20060zR A04;
    public final C25321Ji A05;
    public final AnonymousClass175 A06;
    public final C18090w8 A07;
    public final AnonymousClass1TR A08;
    public final C16320sq A09;

    public AnonymousClass1TS(C17030uP r1, C15860rz r2, C14710pd r3, C16490t9 r4, C20060zR r5, C25321Ji r6, AnonymousClass175 r7, C18090w8 r8, AnonymousClass1TR r9, C16320sq r10) {
        this.A02 = r3;
        this.A09 = r10;
        this.A03 = r4;
        this.A06 = r7;
        this.A04 = r5;
        this.A00 = r1;
        this.A01 = r2;
        this.A07 = r8;
        this.A08 = r9;
        this.A05 = r6;
    }

    public final String A00(C16840tj r4) {
        C16880tn AAt = r4.AAt();
        AnonymousClass00B.A06(AAt);
        C35251lc r2 = AAt.A01;
        AnonymousClass00B.A06(r2);
        String str = r2.A08;
        if (str != null && this.A07.A0D(str)) {
            return "p2m_lite";
        }
        AnonymousClass00B.A06(r2);
        C28411Vz r0 = r2.A04;
        AnonymousClass00B.A06(r0);
        String str2 = ((C35491m1) r0).A04;
        return (((C35491m1) C35481m0.A04).A04.equals(str2) || ((C35491m1) C35481m0.A05).A04.equals(str2)) ? "p2m_pro" : "UNSET";
    }

    public void A01(C16840tj r7, String str, int i2) {
        A02(r7, str, i2, false, false);
    }

    public void A02(C16840tj r13, String str, int i2, boolean z2, boolean z3) {
        String str2;
        int i3;
        C16880tn AAt;
        if (!A03(r13)) {
            C15830rv r5 = ((C16740tZ) r13).A11.A00;
            try {
                String A002 = A00(r13);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cta", "order_details");
                jSONObject.put("wa_pay_registered", this.A06.A0D());
                jSONObject.put("p2m_type", A002);
                jSONObject.put("is_cta_available", z3);
                C16880tn AAt2 = r13.AAt();
                AnonymousClass00B.A06(AAt2);
                C35251lc r4 = AAt2.A01;
                AnonymousClass00B.A06(r4);
                String str3 = r4.A01;
                if ("payment_instruction".equals(str3)) {
                    str2 = "non-native";
                } else {
                    AnonymousClass00B.A06(r4);
                    str2 = "confirm";
                    if (!str2.equals(str3)) {
                        str2 = !AnonymousClass1ZW.A0E(r4.A03) ? "native" : null;
                    }
                }
                if (AnonymousClass1ZW.A0E(str)) {
                    str = str2;
                }
                if (!AnonymousClass1ZW.A0E(str)) {
                    jSONObject.put("payment_method_choice", str);
                }
                if (z2 && (AAt = r13.AAt()) != null) {
                    C35251lc r1 = AAt.A01;
                    AnonymousClass00B.A06(r1);
                    C35211lY r0 = r1.A06;
                    AnonymousClass00B.A06(r0);
                    Float valueOf = Float.valueOf(r1.A02(r0).A02.A00.floatValue());
                    if (valueOf != null) {
                        jSONObject.put("order_amount", valueOf);
                    }
                }
                C25321Ji r42 = this.A05;
                String obj = jSONObject.toString();
                if (r13 instanceof C39151s0) {
                    i3 = 8;
                } else if (r13 instanceof C39111rw) {
                    i3 = 2;
                } else {
                    i3 = 1;
                    if (r13 instanceof C39141rz) {
                        i3 = 3;
                    }
                }
                r42.A00(r5, Integer.valueOf(AnonymousClass2RK.A00(this.A00.A00(UserJid.of(r5)))), obj, i2, 4, i3, true);
            } catch (JSONException unused) {
                Log.e("OrderDetailsMessageLogging/logOrderDetailsAction failed to construct message class attributes");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r4.AAt();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.C16840tj r4) {
        /*
            r3 = this;
            X.0pd r2 = r3.A02
            r1 = 1345(0x541, float:1.885E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x001b
            X.0tn r0 = r4.AAt()
            if (r0 == 0) goto L_0x001b
            X.1lc r0 = r0.A01
            if (r0 == 0) goto L_0x001b
            boolean r1 = r4 instanceof X.C16740tZ
            r0 = 0
            if (r1 != 0) goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1TS.A03(X.0tj):boolean");
    }
}
