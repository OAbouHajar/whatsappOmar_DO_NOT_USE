package X;

import com.obwhatsapp.gallerypicker.GalleryPickerFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.37P  reason: invalid class name */
public class AnonymousClass37P extends C16690tT {
    public final int A00;
    public final int A01;
    public final C16980tz A02;
    public final AnonymousClass013 A03;
    public final C49172Rk A04;
    public final C20350zu A05;
    public final WeakReference A06;

    public AnonymousClass37P(C16980tz r2, AnonymousClass013 r3, GalleryPickerFragment galleryPickerFragment, C49172Rk r5, C20350zu r6, int i2, int i3) {
        this.A02 = r2;
        this.A04 = r5;
        this.A03 = r3;
        this.A05 = r6;
        this.A06 = C13690nt.A0h(galleryPickerFragment);
        this.A01 = i2;
        this.A00 = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b8, code lost:
        if (r6.intValue() == r7.getCount()) goto L_0x00ba;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r29) {
        /*
            r28 = this;
            r0 = r28
            int r5 = r0.A00
            r1 = 0
            r13 = 0
            long r18 = android.os.SystemClock.uptimeMillis()
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()
            int r3 = r0.A01
            r2 = 7
            if (r3 != r2) goto L_0x00be
            X.4MH[] r11 = com.obwhatsapp.gallerypicker.GalleryPickerFragment.A0Q
        L_0x0015:
            java.util.HashMap r10 = X.AnonymousClass000.A0x()
            int r12 = r11.length
            r2 = 0
            r9 = 0
        L_0x001c:
            if (r9 >= r12) goto L_0x00c2
            r15 = r11[r9]
            int r6 = r15.A00
            r6 = r6 & r3
            if (r6 == 0) goto L_0x0081
            boolean r6 = X.C16690tT.A02(r0)
            if (r6 != 0) goto L_0x00c2
            int r14 = r15.A00
            r7 = r14 & r3
            java.lang.String r8 = r15.A03
            X.2Rk r6 = r0.A04
            X.2BC r7 = X.C16690tT.A00(r6, r8, r7, r2)
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L_0x00ba
            java.lang.String r6 = com.obwhatsapp.gallerypicker.GalleryPickerFragment.A0O
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x00a2
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            int r6 = r7.getCount()
            X.C13680ns.A1X(r14, r10, r6)
        L_0x0050:
            int r14 = r15.A02
            X.0tz r6 = r0.A02
            android.content.Context r6 = r6.A00
            int r15 = r15.A01
            java.lang.String r23 = r6.getString(r15)
            X.2BF r21 = r7.ADR(r2)
            int r26 = r7.getCount()
            X.4S6 r6 = new X.4S6
            r27 = 0
            r20 = r6
            r22 = r8
            r24 = r14
            r25 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r7.close()
            if (r1 >= r5) goto L_0x0084
            java.util.List r6 = java.util.Collections.singletonList(r6)
            r0.A07(r6)
        L_0x007f:
            int r1 = r1 + 1
        L_0x0081:
            int r9 = r9 + 1
            goto L_0x001c
        L_0x0084:
            r4.add(r6)
            r6 = 1000(0x3e8, double:4.94E-321)
            long r14 = r18 + r6
            long r7 = android.os.SystemClock.uptimeMillis()
            int r6 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x007f
            java.util.ArrayList r6 = X.C13680ns.A0n(r4)
            r4.clear()
            r0.A07(r6)
            long r18 = android.os.SystemClock.uptimeMillis()
            goto L_0x007f
        L_0x00a2:
            if (r8 != 0) goto L_0x0050
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            java.lang.Object r6 = r10.get(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            if (r6 == 0) goto L_0x0050
            int r14 = r6.intValue()
            int r6 = r7.getCount()
            if (r14 != r6) goto L_0x0050
        L_0x00ba:
            r7.close()
            goto L_0x0081
        L_0x00be:
            X.4MH[] r11 = com.obwhatsapp.gallerypicker.GalleryPickerFragment.A0P
            goto L_0x0015
        L_0x00c2:
            X.0tU r11 = r0.A02
            boolean r6 = r11.isCancelled()
            if (r6 != 0) goto L_0x02a1
            boolean r6 = X.C15450qv.A09()
            if (r6 == 0) goto L_0x010e
            X.2Rk r9 = r0.A04
            r8 = 7
            r7 = 1
            X.2BC r7 = X.C16690tT.A00(r9, r13, r8, r7)
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L_0x010b
            r24 = 3
            X.0tz r6 = r0.A02
            android.content.Context r8 = r6.A00
            r6 = 2131886294(0x7f1200d6, float:1.9407163E38)
            java.lang.String r23 = r8.getString(r6)
            X.2BF r21 = r7.ADR(r2)
            int r26 = r7.getCount()
            X.4S6 r6 = new X.4S6
            r25 = 7
            r27 = 1
            r20 = r6
            r22 = r13
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            if (r1 >= r5) goto L_0x01f5
            java.util.List r6 = java.util.Collections.singletonList(r6)
            r0.A07(r6)
        L_0x0109:
            int r1 = r1 + 1
        L_0x010b:
            r7.close()
        L_0x010e:
            X.2Rk r10 = r0.A04
            X.2BC r12 = X.C16690tT.A00(r10, r13, r3, r2)
            boolean r6 = r11.isCancelled()
            if (r6 == 0) goto L_0x0150
            r12.close()
        L_0x011d:
            boolean r6 = r11.isCancelled()
            if (r6 != 0) goto L_0x02a1
            X.0tz r8 = r0.A02
            android.content.Context r6 = r8.A00
            android.content.ContentResolver r20 = r6.getContentResolver()
            java.lang.String r6 = "content://"
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0r(r6)
            java.lang.String r6 = "com.obwhatsapp"
            r7.append(r6)
            java.lang.String r6 = ".provider.media/buckets"
            java.lang.String r6 = X.AnonymousClass000.A0h(r6, r7)
            android.net.Uri r21 = android.net.Uri.parse(r6)
            r23 = r13
            r24 = r13
            r25 = r13
            r22 = r13
            android.database.Cursor r10 = r20.query(r21, r22, r23, r24, r25)
            if (r10 != 0) goto L_0x021d
            goto L_0x0214
        L_0x0150:
            java.util.HashMap r6 = r12.AAC()
            java.util.Set r6 = r6.entrySet()
            java.util.ArrayList r8 = X.C13680ns.A0n(r6)
            X.013 r6 = r0.A03
            java.util.Locale r6 = X.C13690nt.A0m(r6)
            java.text.Collator r9 = java.text.Collator.getInstance(r6)
            r6 = 1
            r9.setDecomposition(r6)
            r7 = 9
            com.facebook.redex.IDxComparatorShape184S0100000_2_I1 r6 = new com.facebook.redex.IDxComparatorShape184S0100000_2_I1
            r6.<init>(r9, r7)
            java.util.Collections.sort(r8, r6)
            r12.close()
            boolean r6 = r11.isCancelled()
            if (r6 != 0) goto L_0x011d
            java.util.Iterator r12 = r8.iterator()
        L_0x0181:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto L_0x011d
            java.util.Map$Entry r7 = X.AnonymousClass000.A0z(r12)
            java.lang.String r9 = X.C13690nt.A0f(r7)
            if (r9 == 0) goto L_0x0181
            boolean r6 = r11.isCancelled()
            if (r6 != 0) goto L_0x011d
            java.lang.String r6 = com.obwhatsapp.gallerypicker.GalleryPickerFragment.A0O
            boolean r6 = r9.equals(r6)
            if (r6 != 0) goto L_0x0181
            X.2BC r8 = X.C16690tT.A00(r10, r9, r3, r2)
            boolean r6 = r8.isEmpty()
            if (r6 != 0) goto L_0x01d3
            java.lang.Object r7 = r7.getValue()
            java.lang.String r7 = (java.lang.String) r7
            X.2BF r21 = r8.ADR(r2)
            int r26 = r8.getCount()
            r24 = 8
            X.4S6 r6 = new X.4S6
            r27 = 0
            r20 = r6
            r22 = r9
            r23 = r7
            r25 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            if (r1 >= r5) goto L_0x01d7
            java.util.List r6 = java.util.Collections.singletonList(r6)
            r0.A07(r6)
        L_0x01d1:
            int r1 = r1 + 1
        L_0x01d3:
            r8.close()
            goto L_0x0181
        L_0x01d7:
            r4.add(r6)
            r6 = 1000(0x3e8, double:4.94E-321)
            long r16 = r18 + r6
            long r14 = android.os.SystemClock.uptimeMillis()
            int r6 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r6 >= 0) goto L_0x01d1
            java.util.ArrayList r6 = X.C13680ns.A0n(r4)
            r4.clear()
            r0.A07(r6)
            long r18 = android.os.SystemClock.uptimeMillis()
            goto L_0x01d1
        L_0x01f5:
            r4.add(r6)
            r8 = 1000(0x3e8, double:4.94E-321)
            long r14 = r18 + r8
            long r8 = android.os.SystemClock.uptimeMillis()
            int r6 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x0109
            java.util.ArrayList r6 = X.C13680ns.A0n(r4)
            r4.clear()
            r0.A07(r6)
            long r18 = android.os.SystemClock.uptimeMillis()
            goto L_0x0109
        L_0x0214:
            java.lang.String r1 = "gallerypicker/cursor/null"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ all -> 0x029a }
            goto L_0x028b
        L_0x021a:
            r7.close()     // Catch:{ all -> 0x029a }
        L_0x021d:
            boolean r6 = r10.moveToNext()     // Catch:{ all -> 0x029a }
            if (r6 == 0) goto L_0x0288
            java.lang.String r6 = r10.getString(r2)     // Catch:{ all -> 0x029a }
            com.whatsapp.jid.Jid r7 = com.whatsapp.jid.Jid.getNullable(r6)     // Catch:{ all -> 0x029a }
            r6 = 1
            java.lang.String r23 = r10.getString(r6)     // Catch:{ all -> 0x029a }
            boolean r6 = r11.isCancelled()     // Catch:{ all -> 0x029a }
            if (r6 != 0) goto L_0x0288
            java.lang.String r9 = X.C16030sJ.A03(r7)     // Catch:{ all -> 0x029a }
            X.0zu r6 = r0.A05     // Catch:{ all -> 0x029a }
            X.32H r7 = new X.32H     // Catch:{ all -> 0x029a }
            r7.<init>(r8, r6, r9, r3)     // Catch:{ all -> 0x029a }
            boolean r6 = r7.isEmpty()     // Catch:{ all -> 0x029a }
            if (r6 != 0) goto L_0x021a
            X.2BF r21 = r7.ADR(r2)     // Catch:{ all -> 0x029a }
            int r26 = r7.getCount()     // Catch:{ all -> 0x029a }
            r24 = 9
            X.4S6 r6 = new X.4S6     // Catch:{ all -> 0x029a }
            r27 = 0
            r20 = r6
            r22 = r9
            r25 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x029a }
            if (r1 >= r5) goto L_0x0268
            java.util.List r6 = java.util.Collections.singletonList(r6)     // Catch:{ all -> 0x029a }
            r0.A07(r6)     // Catch:{ all -> 0x029a }
            goto L_0x0285
        L_0x0268:
            r4.add(r6)     // Catch:{ all -> 0x029a }
            r14 = 1000(0x3e8, double:4.94E-321)
            long r16 = r18 + r14
            long r14 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x029a }
            int r6 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r6 >= 0) goto L_0x0285
            java.util.ArrayList r6 = X.C13680ns.A0n(r4)     // Catch:{ all -> 0x029a }
            r4.clear()     // Catch:{ all -> 0x029a }
            r0.A07(r6)     // Catch:{ all -> 0x029a }
            long r18 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x029a }
        L_0x0285:
            int r1 = r1 + 1
            goto L_0x021a
        L_0x0288:
            r10.close()
        L_0x028b:
            boolean r1 = r11.isCancelled()
            if (r1 != 0) goto L_0x02a1
            r1 = 1
            java.util.List[] r1 = new java.util.List[r1]
            r1[r2] = r4
            r0.A07(r1)
            return r13
        L_0x029a:
            r0 = move-exception
            if (r10 == 0) goto L_0x02a0
            r10.close()     // Catch:{ all -> 0x02a0 }
        L_0x02a0:
            throw r0
        L_0x02a1:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37P.A08(java.lang.Object[]):java.lang.Object");
    }
}
