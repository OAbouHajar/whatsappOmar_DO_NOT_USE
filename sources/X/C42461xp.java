package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1xp  reason: invalid class name and case insensitive filesystem */
public class C42461xp extends C42101xE {
    public C42461xp(C16880tn r1) {
        super(r1);
    }

    public static final JSONObject A01(C35251lc r1, AnonymousClass21Q r2) {
        try {
            return C39811t6.A03(r1, r2.A08);
        } catch (JSONException e2) {
            StringBuilder sb = new StringBuilder("CheckoutMessageCustomizer/getJsonParameter/invalid parameter json: ");
            sb.append(e2.getMessage());
            Log.e(sb.toString());
            return null;
        }
    }

    public CharSequence A06(Context context, Paint paint, AnonymousClass013 r6) {
        String str;
        C35251lc r0 = this.A00.A01;
        if (r0 == null || (str = r0.A0A) == null) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return super.A06(context, paint, r6);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        Drawable A01 = A01(context);
        return A01 != null ? C56522nn.A00(paint, A01, sb) : sb;
    }

    public String A07(Context context) {
        String str;
        C35251lc r0 = this.A00.A01;
        if (r0 == null || (str = r0.A0A) == null) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return super.A07(context);
        }
        StringBuilder sb = new StringBuilder("*");
        sb.append(str);
        sb.append("*");
        return sb.toString();
    }

    public String A08(AnonymousClass013 r5) {
        StringBuilder sb = new StringBuilder();
        C16880tn r2 = this.A00;
        C35251lc r0 = r2.A01;
        if (r0 != null) {
            C42101xE.A00(r0.A05.A00(), IOUtils.LINE_SEPARATOR_UNIX, sb);
            C42101xE.A00(r2.A01.A03(r5), IOUtils.LINE_SEPARATOR_UNIX, sb);
        }
        C42101xE.A00(r2.A07, IOUtils.LINE_SEPARATOR_UNIX, sb);
        C42101xE.A00(r2.A08, IOUtils.LINE_SEPARATOR_UNIX, sb);
        C42101xE.A00(r5.A09(R.string.str0455), IOUtils.LINE_SEPARATOR_UNIX, sb);
        return sb.toString();
    }

    public void A09(C16740tZ r9, AnonymousClass21Q r10, AnonymousClass1GC r11) {
        JSONObject A01;
        JSONObject A012;
        C16880tn r2 = this.A00;
        C35251lc r0 = r2.A01;
        if (r0 == null || !r0.A0D) {
            C33221iE r4 = r10.A04;
            C58852uG r02 = ((C33211iD) r4.A00).A03;
            if (r02 == null) {
                r02 = C58852uG.A08;
            }
            C69503f9 r3 = (C69503f9) r02.A0U();
            C35251lc r03 = r2.A01;
            if (r03 == null || r03.A0E == null) {
                r3.A05(AnonymousClass438.A02);
            } else {
                C28581Wr A0U = C445224k.A0R.A0U();
                byte[] bArr = r2.A01.A0E;
                C28631Ww A013 = C28631Ww.A01(bArr, 0, bArr.length);
                A0U.A03();
                C445224k r1 = (C445224k) A0U.A00;
                r1.A00 |= 2048;
                r1.A0A = A013;
                r3.A05(AnonymousClass438.A03);
                r3.A03();
                C58852uG r12 = (C58852uG) r3.A00;
                r12.A05 = A0U.A02();
                r12.A01 = 3;
            }
            String str = r2.A07;
            if (str != null) {
                r3.A03();
                C58852uG r13 = (C58852uG) r3.A00;
                r13.A00 |= 32;
                r13.A06 = str;
            }
            String str2 = r2.A08;
            if (str2 != null) {
                r3.A03();
                C58852uG r14 = (C58852uG) r3.A00;
                r14.A00 |= 64;
                r14.A07 = str2;
            }
            C28581Wr A0U2 = C58382tP.A03.A0U();
            A0U2.A03();
            C58382tP r15 = (C58382tP) A0U2.A00;
            r15.A00 |= 1;
            r15.A01 = "review_and_pay";
            C35251lc r04 = r2.A01;
            if (!(r04 == null || (A01 = A01(r04, r10)) == null)) {
                String obj = A01.toString();
                A0U2.A03();
                C58382tP r16 = (C58382tP) A0U2.A00;
                r16.A00 |= 2;
                r16.A02 = obj;
            }
            C28581Wr A0U3 = AnonymousClass2u3.A05.A0U();
            A0U3.A03();
            AnonymousClass2u3 r17 = (AnonymousClass2u3) A0U3.A00;
            r17.A03 = (C58382tP) A0U2.A02();
            r17.A00 |= 8;
            AnonymousClass42R r22 = AnonymousClass42R.A01;
            A0U3.A03();
            AnonymousClass2u3 r18 = (AnonymousClass2u3) A0U3.A00;
            r18.A00 |= 4;
            r18.A01 = r22.value;
            C28581Wr A0U4 = AnonymousClass2t2.A02.A0U();
            A0U4.A03();
            AnonymousClass2t2 r19 = (AnonymousClass2t2) A0U4.A00;
            r19.A00 |= 1;
            r19.A01 = "review_and_pay";
            A0U3.A03();
            AnonymousClass2u3 r110 = (AnonymousClass2u3) A0U3.A00;
            r110.A02 = (AnonymousClass2t2) A0U4.A02();
            r110.A00 |= 2;
            r3.A03();
            C58852uG r23 = (C58852uG) r3.A00;
            AnonymousClass1XE r111 = r23.A03;
            if (!((AnonymousClass1XF) r111).A00) {
                r111 = C28541Wm.A0G(r111);
                r23.A03 = r111;
            }
            r111.add(A0U3.A02());
            AnonymousClass1WV r24 = r10.A05;
            byte[] bArr2 = r10.A0A;
            if (C41071vB.A0O(r24, r9, bArr2)) {
                AnonymousClass21S A00 = r11.A00(r24, r9, bArr2, r10.A07);
                r3.A03();
                C58852uG r112 = (C58852uG) r3.A00;
                r112.A04 = A00;
                r112.A00 |= 128;
            }
            r4.A03();
            C33211iD r113 = (C33211iD) r4.A00;
            r113.A03 = (C58852uG) r3.A02();
            r113.A01 |= 1;
            return;
        }
        super.A09(r9, r10, r11);
        C33221iE r42 = r10.A04;
        AnonymousClass220 r05 = ((C33211iD) r42.A00).A0O;
        if (r05 == null) {
            r05 = AnonymousClass220.A07;
        }
        C28581Wr A0U5 = r05.A0U();
        C28581Wr A0U6 = ((AnonymousClass220) A0U5.A00).A0d().A0U();
        String A002 = r2.A00() != null ? r2.A00() : "review_and_pay";
        C28581Wr A0U7 = AnonymousClass222.A03.A0U();
        A0U7.A03();
        AnonymousClass222 r114 = (AnonymousClass222) A0U7.A00;
        r114.A00 |= 1;
        r114.A02 = A002;
        C35251lc r06 = r2.A01;
        if (!(r06 == null || (A012 = A01(r06, r10)) == null)) {
            String obj2 = A012.toString();
            A0U7.A03();
            AnonymousClass222 r115 = (AnonymousClass222) A0U7.A00;
            r115.A00 |= 2;
            r115.A01 = obj2;
        }
        C28541Wm A02 = A0U7.A02();
        A0U6.A03();
        AnonymousClass221 r25 = (AnonymousClass221) A0U6.A00;
        AnonymousClass1XE r116 = r25.A02;
        if (!((AnonymousClass1XF) r116).A00) {
            r116 = C28541Wm.A0G(r116);
            r25.A02 = r116;
        }
        r116.add(A02);
        A0U5.A03();
        AnonymousClass220 r117 = (AnonymousClass220) A0U5.A00;
        r117.A06 = A0U6.A02();
        r117.A01 = 6;
        r42.A08((AnonymousClass220) A0U5.A02());
    }
}
