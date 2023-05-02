package X;

import com.facebook.redex.RunnableRunnableShape6S0200000_I0_4;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.14s  reason: invalid class name and case insensitive filesystem */
public class C216014s {
    public final C16040sK A00;
    public final C222017a A01;
    public final C16000sG A02;
    public final C16440t3 A03;
    public final C15810rt A04;
    public final AnonymousClass11I A05;
    public final C222117b A06;
    public final C14710pd A07;
    public final C20260zl A08;
    public final C16490t9 A09;
    public final AnonymousClass15W A0A;

    public C216014s(C16040sK r1, C222017a r2, C16000sG r3, C16440t3 r4, C15810rt r5, AnonymousClass11I r6, C222117b r7, C14710pd r8, C20260zl r9, C16490t9 r10, AnonymousClass15W r11) {
        this.A03 = r4;
        this.A07 = r8;
        this.A00 = r1;
        this.A06 = r7;
        this.A04 = r5;
        this.A09 = r10;
        this.A08 = r9;
        this.A02 = r3;
        this.A05 = r6;
        this.A0A = r11;
        this.A01 = r2;
    }

    public final int A00(C15830rv r5) {
        int i2;
        C15840rx A062 = this.A04.A06(r5);
        int i3 = 0;
        if (r5 == null) {
            Log.e("spamManager/isCallNotSpamProp/null jid");
        } else {
            List A012 = A01();
            if (A012 != null && A012.contains(r5)) {
                i3 = 1;
            }
        }
        int i4 = i3 ^ 1;
        if (A062 == null) {
            return i4 ^ 1;
        }
        if (i4 == 0) {
            return 1;
        }
        synchronized (A062) {
            i2 = A062.A03;
        }
        return i2;
    }

    public final List A01() {
        String A022 = this.A05.A02("call_not_spam_jids");
        if (A022 == null || A022.length() <= 0) {
            return null;
        }
        return C16030sJ.A08(C15830rv.class, Arrays.asList(A022.split(",")));
    }

    public void A02(C15830rv r6, Integer num, boolean z2) {
        C222017a r4 = this.A01;
        long A002 = this.A03.A00();
        try {
            JSONObject A012 = r4.A01(r6);
            if (A012 == null) {
                A012 = new JSONObject();
            }
            A012.put("tb_last_action_ts", A002);
            r4.A02(r6, A012);
        } catch (JSONException unused) {
        }
        if (z2) {
            C40581uM r1 = new C40581uM();
            r1.A00 = num;
            r1.A01 = 1;
            r1.A02 = r6.getRawString();
            C16490t9 r0 = this.A09;
            r0.A06(r1);
            r0.A01();
        }
    }

    public boolean A03(C15830rv r3) {
        int A002 = A00(r3);
        return A002 == -1 || A002 == -2 || A002 == 0;
    }

    public boolean A04(C15830rv r9) {
        C222017a r2 = this.A01;
        long A002 = this.A03.A00();
        try {
            JSONObject A012 = r2.A01(r9);
            if (A012 == null || !A012.has("tb_expired_ts") || !A012.has("tb_cooldown") || A012.getLong("tb_expired_ts") < A002) {
                return false;
            }
            return !A012.has("tb_last_action_ts") || A012.getLong("tb_last_action_ts") + A012.getLong("tb_cooldown") <= A002;
        } catch (JSONException unused) {
            return false;
        }
    }

    public boolean A05(C15830rv r6, int i2) {
        C222117b r4 = this.A06;
        C15840rx A062 = r4.A02.A06(r6);
        if (A062 == null || A062.A03 == i2) {
            return false;
        }
        A062.A03 = i2;
        r4.A00.A01(new RunnableRunnableShape6S0200000_I0_4(r4, 46, A062), 34);
        return true;
    }

    public boolean A06(C16050sL r5, Boolean bool) {
        C16000sG r1 = this.A02;
        UserJid A0D = r1.A0D(r5);
        C16010sH A0A2 = A0D != null ? r1.A0A(A0D) : null;
        return (A0A2 == null || (!this.A00.A0I(A0A2.A0E) && A0A2.A0D == null)) && !this.A0A.A01(r5) && !bool.booleanValue() && A00(r5) == -1;
    }

    public boolean A07(UserJid userJid) {
        if (C40561uK.A01(this.A08, userJid) || C40571uL.A00(this.A07, userJid)) {
            return true;
        }
        C16010sH A0A2 = this.A02.A0A(userJid);
        if (!this.A00.A0G()) {
            return !A04(userJid) && !(A0A2.A0D == null && A00(userJid) == -1);
        }
        return true;
    }
}
