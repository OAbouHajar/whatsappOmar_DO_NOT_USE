package X;

import android.graphics.Typeface;
import java.util.Map;

/* renamed from: X.1t4  reason: invalid class name and case insensitive filesystem */
public class C39791t4 {
    public static Typeface A00;
    public static final Map A01 = new AnonymousClass5C6();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence A00(android.content.Context r11, java.lang.String r12) {
        /*
            java.util.Map r6 = A01
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r10 = r0.iterator()
        L_0x000a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r9 = r10.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r6.get(r9)
            if (r0 == 0) goto L_0x000a
            java.lang.Object r7 = r6.get(r9)
            java.lang.String r7 = (java.lang.String) r7
            android.graphics.Typeface r0 = A00
            if (r0 != 0) goto L_0x0032
            android.graphics.Typeface r0 = X.AnonymousClass00X.A02(r11)     // Catch:{ NotFoundException -> 0x002d }
            A00 = r0     // Catch:{ NotFoundException -> 0x002d }
            goto L_0x0032
        L_0x002d:
            java.lang.String r0 = "PAY: PaymentsTypeface/loadTypefaceSync could not load font R.font.payment_icons_regular"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0032:
            android.graphics.Typeface r0 = A00
            if (r0 == 0) goto L_0x009b
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>(r12)
            r0 = 5
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            java.lang.String r4 = r12.toString()
            int r3 = r4.indexOf(r9)
        L_0x0049:
            if (r3 < 0) goto L_0x0067
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            int r0 = r9.length()
            int r0 = r0 + r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.01Q r0 = new X.01Q
            r0.<init>(r2, r1)
            r8.add(r0)
            int r0 = r3 + 1
            int r3 = r4.indexOf(r9, r0)
            goto L_0x0049
        L_0x0067:
            java.util.Iterator r4 = r8.iterator()
        L_0x006b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0098
            java.lang.Object r1 = r4.next()
            X.01Q r1 = (X.AnonymousClass01Q) r1
            java.lang.Object r0 = r1.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            java.lang.Object r0 = r1.A01
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r5.replace(r3, r0, r7)
            android.graphics.Typeface r0 = A00
            X.1t2 r2 = new X.1t2
            r2.<init>(r0)
            int r1 = r3 + 1
            r0 = 0
            r5.setSpan(r2, r3, r1, r0)
            goto L_0x006b
        L_0x0098:
            r12 = r5
            goto L_0x000a
        L_0x009b:
            java.lang.String r0 = "PAY: PaymentsTypeface/format Could not load payment_icons_regular typeface, call loadTypeface() before applying font."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x000a
        L_0x00a2:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39791t4.A00(android.content.Context, java.lang.String):java.lang.CharSequence");
    }
}
