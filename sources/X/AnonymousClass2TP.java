package X;

import android.content.Context;
import android.text.Spannable;
import com.whatsapp.util.IDxTHighlighterShape12S0000000_2_I0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2TP  reason: invalid class name */
public abstract class AnonymousClass2TP {
    public static Map A00 = new ConcurrentHashMap();
    public static final AnonymousClass2TP A01 = new IDxTHighlighterShape12S0000000_2_I0(1);
    public static final AnonymousClass2TP A02 = new IDxTHighlighterShape12S0000000_2_I0(2);
    public static final AnonymousClass2TP A03 = new IDxTHighlighterShape12S0000000_2_I0(3);
    public static final AnonymousClass2TP A04 = new IDxTHighlighterShape12S0000000_2_I0(0);

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0111, code lost:
        r3 = true;
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0112, code lost:
        if (r11 != null) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0114, code lost:
        r11 = android.text.SpannableString.valueOf(r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0118, code lost:
        r14.A03(r21, r11, r9, r8);
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013a, code lost:
        if (r11 == null) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00cb, code lost:
        r11 = r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass01Q A00(android.content.Context r21, X.AnonymousClass013 r22, X.AnonymousClass2TP r23, java.lang.CharSequence r24, java.util.List r25, boolean r26) {
        /*
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r11 = 0
            r19 = r24
            if (r24 == 0) goto L_0x013c
            r13 = r25
            if (r25 == 0) goto L_0x013c
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x013c
            java.util.regex.Pattern r1 = X.C40661uU.A02
            r0 = r19
            java.util.regex.Matcher r1 = r1.matcher(r0)
            java.lang.String r0 = " "
            java.lang.String r10 = r1.replaceAll(r0)
            r20 = r22
            java.text.BreakIterator r18 = X.C40661uU.A01(r20)
            r0 = r18
            r0.setText(r10)
            int r9 = r18.first()
            int r8 = r18.next()
            r1 = -1
            r7 = -1
            r5 = r11
            r6 = r11
        L_0x0039:
            if (r8 == r1) goto L_0x013a
            java.lang.String r17 = r10.substring(r9, r8)
            if (r5 != 0) goto L_0x008f
            r0 = r20
            android.content.Context r0 = r0.A00
            java.util.Locale r2 = X.AnonymousClass013.A00(r0)
            java.util.Map r1 = A00
            java.lang.Object r0 = r1.get(r2)
            java.lang.ThreadLocal r0 = (java.lang.ThreadLocal) r0
            if (r0 != 0) goto L_0x005b
            X.5B5 r0 = new X.5B5
            r0.<init>(r2)
            r1.put(r2, r0)
        L_0x005b:
            X.AnonymousClass00B.A06(r0)
            java.lang.Object r5 = r0.get()
            java.text.Collator r5 = (java.text.Collator) r5
            int r0 = r13.size()
            java.text.CollationKey[] r6 = new java.text.CollationKey[r0]
            int r0 = r13.size()
            int r2 = r0 + -1
        L_0x0070:
            if (r2 < 0) goto L_0x008f
            java.lang.Object r1 = r13.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r13.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.text.CollationKey r0 = r5.getCollationKey(r0)
            r6[r2] = r0
            int r0 = r1.length()
            int r7 = java.lang.Math.max(r7, r0)
            int r2 = r2 + -1
            goto L_0x0070
        L_0x008f:
            X.2TP r0 = A02
            r2 = 0
            r14 = r23
            if (r14 == r0) goto L_0x00d2
            X.2TP r0 = A01
            if (r14 == r0) goto L_0x00d2
            int r0 = r17.length()
            int r16 = java.lang.Math.min(r0, r7)
            r4 = 1
            r3 = 0
        L_0x00a4:
            r0 = r16
            if (r4 > r0) goto L_0x011d
            r0 = r17
            java.lang.String r0 = r0.substring(r2, r4)
            java.text.CollationKey r15 = r5.getCollationKey(r0)
            int r1 = r6.length
        L_0x00b3:
            if (r2 >= r1) goto L_0x00ce
            r0 = r6[r2]
            int r0 = r15.compareTo(r0)
            if (r0 != 0) goto L_0x00cb
            if (r11 != 0) goto L_0x00c3
            android.text.SpannableString r11 = android.text.SpannableString.valueOf(r19)
        L_0x00c3:
            int r3 = r9 + r4
            r0 = r21
            r14.A03(r0, r11, r9, r3)
            r3 = 1
        L_0x00cb:
            int r2 = r2 + 1
            goto L_0x00b3
        L_0x00ce:
            int r4 = r4 + 1
            r2 = 0
            goto L_0x00a4
        L_0x00d2:
            java.lang.String r4 = X.AnonymousClass1ZW.A09(r17)
        L_0x00d6:
            int r1 = r6.length
            r0 = 1
            int r1 = r1 - r0
            if (r2 >= r1) goto L_0x00ea
            r1 = r6[r2]
            java.text.CollationKey r0 = r5.getCollationKey(r4)
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L_0x0111
            int r2 = r2 + 1
            goto L_0x00d6
        L_0x00ea:
            r3 = 0
            r15 = r6[r1]
            int r1 = r4.length()
            java.lang.String r0 = r15.getSourceString()
            int r0 = r0.length()
            int r2 = java.lang.Math.min(r1, r0)
            r1 = 1
        L_0x00fe:
            if (r1 > r2) goto L_0x011d
            java.lang.String r0 = r4.substring(r3, r1)
            java.text.CollationKey r0 = r5.getCollationKey(r0)
            int r0 = r0.compareTo(r15)
            if (r0 == 0) goto L_0x0111
            int r1 = r1 + 1
            goto L_0x00fe
        L_0x0111:
            r3 = 1
            if (r11 != 0) goto L_0x0118
            android.text.SpannableString r11 = android.text.SpannableString.valueOf(r19)
        L_0x0118:
            r0 = r21
            r14.A03(r0, r11, r9, r8)
        L_0x011d:
            if (r26 == 0) goto L_0x0131
            if (r3 == 0) goto L_0x0131
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            X.01Q r0 = new X.01Q
            r0.<init>(r2, r1)
            r12.add(r0)
        L_0x0131:
            int r0 = r18.next()
            r9 = r8
            r1 = -1
            r8 = r0
            goto L_0x0039
        L_0x013a:
            if (r11 != 0) goto L_0x013e
        L_0x013c:
            r11 = r19
        L_0x013e:
            X.01Q r0 = new X.01Q
            r0.<init>(r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2TP.A00(android.content.Context, X.013, X.2TP, java.lang.CharSequence, java.util.List, boolean):X.01Q");
    }

    public static CharSequence A01(Context context, AnonymousClass013 r7, CharSequence charSequence, List list) {
        Object obj = A00(context, r7, A02, charSequence, list, true).A00;
        AnonymousClass00B.A06(obj);
        return (CharSequence) obj;
    }

    public static CharSequence A02(Context context, AnonymousClass013 r7, CharSequence charSequence, List list) {
        return (CharSequence) A00(context, r7, A04, charSequence, list, false).A00;
    }

    public abstract void A03(Context context, Spannable spannable, int i2, int i3);
}
