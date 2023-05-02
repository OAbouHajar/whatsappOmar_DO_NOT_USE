package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.obwhatsapp.R;
import org.apache.commons.io.IOUtils;

/* renamed from: X.1xE  reason: invalid class name and case insensitive filesystem */
public class C42101xE {
    public final C16880tn A00;

    public C42101xE(C16880tn r1) {
        this.A00 = r1;
    }

    public static void A00(CharSequence charSequence, String str, StringBuilder sb) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (sb.length() > 0) {
                sb.append(str);
            }
            sb.append(charSequence);
        }
    }

    public Drawable A01(Context context) {
        int i2;
        int i3;
        if (this instanceof C42111xF) {
            i2 = R.drawable.msg_status_shop;
            i3 = R.color.color055a;
        } else if (!(this instanceof C42461xp)) {
            return null;
        } else {
            i2 = R.drawable.vec_ic_receipt_16dp;
            i3 = R.color.color0693;
        }
        return AnonymousClass2SR.A02(context, i2, i3);
    }

    public CharSequence A02(Context context, Paint paint, AnonymousClass013 r7) {
        StringBuilder sb = new StringBuilder();
        C16880tn r2 = this.A00;
        A00(r2.A07, IOUtils.LINE_SEPARATOR_UNIX, sb);
        A00(r2.A08, IOUtils.LINE_SEPARATOR_UNIX, sb);
        return sb.toString();
    }

    public String A03() {
        C35201lX r0 = this.A00.A02;
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A04(android.content.Context r7) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C42161xK
            if (r0 == 0) goto L_0x00c7
            X.0tn r3 = r6.A00
            java.lang.String r4 = r3.A07
            X.1lW r5 = r3.A03
            if (r5 == 0) goto L_0x00c3
            java.util.List r2 = r5.A00
            int r1 = r2.size()
            r0 = 1
            if (r1 != r0) goto L_0x00c3
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            X.1lV r0 = (X.C35181lV) r0
            X.1lK r0 = r0.A01
            java.lang.String r0 = r0.A01
        L_0x0020:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00c6
            if (r5 == 0) goto L_0x00c0
            java.util.List r2 = r5.A00
            int r1 = r2.size()
            r0 = 1
            if (r1 != r0) goto L_0x00c0
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            X.1lV r0 = (X.C35181lV) r0
            X.1lK r0 = r0.A01
            java.lang.String r5 = r0.A01
        L_0x003c:
            java.lang.String r1 = r3.A00()
            java.lang.String r0 = "review_order"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            if (r5 == 0) goto L_0x00be
            java.lang.String r1 = X.AnonymousClass3BX.A02(r5)
            java.util.Map r0 = X.AnonymousClass3BX.A01
            java.lang.Object r0 = r0.get(r1)
        L_0x0055:
            java.lang.Number r0 = (java.lang.Number) r0
        L_0x0057:
            if (r0 == 0) goto L_0x00c6
            android.content.res.Resources r1 = r7.getResources()
            int r0 = r0.intValue()
            java.lang.String r2 = r1.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x007a
            r0 = 2
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r0]
            r0 = 0
            r1[r0] = r2
            r0 = 1
            r1[r0] = r4
            java.lang.String r0 = "\n"
            java.lang.String r2 = X.AnonymousClass1ZW.A0B(r0, r1)
        L_0x007a:
            return r2
        L_0x007b:
            java.lang.String r1 = r3.A00()
            java.lang.String r0 = "payment_method"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008c
            java.lang.Integer r0 = X.AnonymousClass3BX.A00(r5)
            goto L_0x0057
        L_0x008c:
            java.lang.String r0 = r3.A00()
            java.lang.String r3 = "payment_status"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00be
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x00be
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r2 = 0
            if (r0 != 0) goto L_0x00b7
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00b1 }
            r1.<init>(r5)     // Catch:{ JSONException -> 0x00b1 }
            java.lang.String r0 = "pending"
            java.lang.String r2 = r1.optString(r3, r0)     // Catch:{ JSONException -> 0x00b1 }
            goto L_0x00b7
        L_0x00b1:
            r1 = move-exception
            java.lang.String r0 = "CheckoutInfoContentParser/getCustomPaymentMethodStr failed to parse parameters json"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00b7:
            java.util.Map r0 = X.AnonymousClass3BX.A00
            java.lang.Object r0 = r0.get(r2)
            goto L_0x0055
        L_0x00be:
            r0 = 0
            goto L_0x0057
        L_0x00c0:
            r5 = 0
            goto L_0x003c
        L_0x00c3:
            r0 = 0
            goto L_0x0020
        L_0x00c6:
            return r4
        L_0x00c7:
            X.0tn r0 = r6.A00
            java.lang.String r0 = r0.A07
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42101xE.A04(android.content.Context):java.lang.String");
    }

    public String A05(Context context) {
        StringBuilder sb = new StringBuilder();
        A00(A03(), " ", sb);
        C16880tn r1 = this.A00;
        A00(r1.A07, " ", sb);
        A00(r1.A08, " ", sb);
        return sb.toString();
    }

    public CharSequence A06(Context context, Paint paint, AnonymousClass013 r6) {
        StringBuilder sb = new StringBuilder();
        String A03 = A03();
        if (!TextUtils.isEmpty(A03)) {
            sb.append(A03.trim());
        }
        C35201lX r0 = this.A00.A02;
        A00(r0 != null ? r0.A00 : null, IOUtils.LINE_SEPARATOR_UNIX, sb);
        A00(A02(context, paint, r6), IOUtils.LINE_SEPARATOR_UNIX, sb);
        Drawable A01 = A01(context);
        return A01 != null ? C56522nn.A00(paint, A01, sb) : sb;
    }

    public String A07(Context context) {
        StringBuilder sb = new StringBuilder();
        String A03 = A03();
        if (!TextUtils.isEmpty(A03)) {
            sb.append("*");
            sb.append(A03.trim());
            sb.append("*\n");
        }
        C16880tn r2 = this.A00;
        A00(r2.A07, IOUtils.LINE_SEPARATOR_UNIX, sb);
        A00(r2.A08, IOUtils.LINE_SEPARATOR_UNIX, sb);
        return sb.toString();
    }

    public String A08(AnonymousClass013 r5) {
        StringBuilder sb = new StringBuilder();
        A00(A03(), " ", sb);
        C16880tn r1 = this.A00;
        C35201lX r0 = r1.A02;
        A00(r0 != null ? r0.A00 : null, " ", sb);
        A00(r1.A07, " ", sb);
        A00(r1.A08, " ", sb);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x012e, code lost:
        if (r1 == false) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(X.C16740tZ r11, X.AnonymousClass21Q r12, X.AnonymousClass1GC r13) {
        /*
            r10 = this;
            r0 = r11
            X.0tj r0 = (X.C16840tj) r0
            X.0tn r0 = r0.AAt()
            if (r0 == 0) goto L_0x012d
            X.1iE r3 = r12.A04
            X.1Wm r0 = r3.A00
            X.1iD r0 = (X.C33211iD) r0
            X.220 r0 = r0.A0O
            if (r0 != 0) goto L_0x0015
            X.220 r0 = X.AnonymousClass220.A07
        L_0x0015:
            X.1Wr r4 = r0.A0U()
            X.1Wm r0 = r4.A00
            X.220 r0 = (X.AnonymousClass220) r0
            X.22R r0 = r0.A05
            if (r0 != 0) goto L_0x0023
            X.22R r0 = X.AnonymousClass22R.A06
        L_0x0023:
            X.1Wr r8 = r0.A0U()
            X.3fC r8 = (X.C69533fC) r8
            X.1Wm r0 = r4.A00
            X.220 r0 = (X.AnonymousClass220) r0
            X.2t7 r0 = r0.A03
            if (r0 != 0) goto L_0x0033
            X.2t7 r0 = X.C58202t7.A02
        L_0x0033:
            X.1Wr r7 = r0.A0U()
            X.1Wm r0 = r4.A00
            X.220 r0 = (X.AnonymousClass220) r0
            X.2t8 r0 = r0.A04
            if (r0 != 0) goto L_0x0041
            X.2t8 r0 = X.C58212t8.A02
        L_0x0041:
            X.1Wr r5 = r0.A0U()
            java.lang.String r2 = r10.A03()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0135
            r8.A03()
            X.1Wm r1 = r8.A00
            X.22R r1 = (X.AnonymousClass22R) r1
            int r0 = r1.A00
            r0 = r0 | 1
            r1.A00 = r0
            r1.A04 = r2
            r1 = 0
        L_0x005f:
            X.0tn r2 = r10.A00
            X.1lX r9 = r2.A02
            if (r9 == 0) goto L_0x0132
            java.lang.String r6 = r9.A00
        L_0x0067:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x007d
            r8.A03()
            X.1Wm r1 = r8.A00
            X.22R r1 = (X.AnonymousClass22R) r1
            int r0 = r1.A00
            r0 = r0 | 2
            r1.A00 = r0
            r1.A03 = r6
            r1 = 0
        L_0x007d:
            if (r9 == 0) goto L_0x012e
            byte[] r6 = r9.A02
            if (r6 == 0) goto L_0x012e
            int r1 = r6.length
            r0 = 0
            X.1Ww r6 = X.C28631Ww.A01(r6, r0, r1)
            r8.A03()
            X.1Wm r1 = r8.A00
            X.22R r1 = (X.AnonymousClass22R) r1
            r0 = 6
            r1.A01 = r0
            r1.A02 = r6
            r8.A05()
        L_0x0098:
            r4.A03()
            X.1Wm r1 = r4.A00
            X.220 r1 = (X.AnonymousClass220) r1
            X.1Wm r0 = r8.A02()
            X.22R r0 = (X.AnonymousClass22R) r0
            r1.A05 = r0
            int r0 = r1.A00
            r0 = r0 | 1
            r1.A00 = r0
        L_0x00ad:
            java.lang.String r6 = r2.A07
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x00d9
            r7.A03()
            X.1Wm r1 = r7.A00
            X.2t7 r1 = (X.C58202t7) r1
            int r0 = r1.A00
            r0 = r0 | 1
            r1.A00 = r0
            r1.A01 = r6
            r4.A03()
            X.1Wm r1 = r4.A00
            X.220 r1 = (X.AnonymousClass220) r1
            X.1Wm r0 = r7.A02()
            X.2t7 r0 = (X.C58202t7) r0
            r1.A03 = r0
            int r0 = r1.A00
            r0 = r0 | 2
            r1.A00 = r0
        L_0x00d9:
            java.lang.String r2 = r2.A08
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0105
            r5.A03()
            X.1Wm r1 = r5.A00
            X.2t8 r1 = (X.C58212t8) r1
            int r0 = r1.A00
            r0 = r0 | 1
            r1.A00 = r0
            r1.A01 = r2
            r4.A03()
            X.1Wm r1 = r4.A00
            X.220 r1 = (X.AnonymousClass220) r1
            X.1Wm r0 = r5.A02()
            X.2t8 r0 = (X.C58212t8) r0
            r1.A04 = r0
            int r0 = r1.A00
            r0 = r0 | 4
            r1.A00 = r0
        L_0x0105:
            X.1WV r2 = r12.A05
            byte[] r1 = r12.A0A
            boolean r0 = X.C41071vB.A0O(r2, r11, r1)
            if (r0 == 0) goto L_0x0124
            boolean r0 = r12.A07
            X.21S r0 = r13.A00(r2, r11, r1, r0)
            r4.A03()
            X.1Wm r1 = r4.A00
            X.220 r1 = (X.AnonymousClass220) r1
            r1.A02 = r0
            int r0 = r1.A00
            r0 = r0 | 64
            r1.A00 = r0
        L_0x0124:
            X.1Wm r0 = r4.A02()
            X.220 r0 = (X.AnonymousClass220) r0
            r3.A08(r0)
        L_0x012d:
            return
        L_0x012e:
            if (r1 != 0) goto L_0x00ad
            goto L_0x0098
        L_0x0132:
            r6 = 0
            goto L_0x0067
        L_0x0135:
            r1 = 1
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42101xE.A09(X.0tZ, X.21Q, X.1GC):void");
    }
}
