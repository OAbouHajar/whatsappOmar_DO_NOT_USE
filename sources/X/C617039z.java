package X;

import com.obwhatsapp.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.39z  reason: invalid class name and case insensitive filesystem */
public class C617039z {
    public static AnonymousClass4O3 A00(AnonymousClass4YH r13, C14990q7 r14, AnonymousClass4O3 r15, C88964bN r16, C31201dg r17, AnonymousClass5MN r18, AnonymousClass4K0 r19) {
        AnonymousClass3AN r4 = new AnonymousClass3AN(r13, r15, r16, (C85844Qf) r14.A02(R.id.bk_context_key_scoped_client_id_mapper), r18, r19, C62183Bz.A04(r14), (String) r14.A01.get(R.id.bk_context_key_logging_id));
        HashSet A0o = C13680ns.A0o();
        C31201dg r6 = r17;
        C31201dg A01 = A01(r4, r6, r15 == null ? null : r15.A01, AnonymousClass000.A0x(), A0o);
        HashMap hashMap = new HashMap(A0o.size());
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            hashMap.put(next, r4.A01.A03.get(next));
        }
        return new AnonymousClass4O3(r4.A04, r6, A01, r4.A09, r4.A01.A03, r4.A0A, hashMap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0311, code lost:
        if (r8.A03 != r11) goto L_0x0313;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C31201dg A01(X.AnonymousClass3AN r32, X.C31201dg r33, X.C31201dg r34, java.util.Map r35, java.util.Set r36) {
        /*
            r11 = r33
            r3 = r11
            r0 = 148(0x94, float:2.07E-43)
            r12 = 1
            boolean r0 = r11.A0P(r0, r12)
            if (r0 == 0) goto L_0x0398
            r9 = r32
            r8 = r34
            r34 = r36
            if (r8 == 0) goto L_0x0031
            X.1dg r0 = r8.A03
            if (r0 != r11) goto L_0x0031
            java.util.Set r4 = r9.A0C
            if (r4 == 0) goto L_0x0031
            X.4Ju r5 = r9.A03
            android.util.SparseArray r0 = r5.A02
            int r3 = r8.A00
            java.lang.Object r2 = r0.get(r3)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 != 0) goto L_0x003a
            java.lang.String r1 = "BindEvaluator"
            java.lang.String r0 = "A previously bound node has a null variable dependency map"
            X.C29691b2.A00(r1, r0)
        L_0x0031:
            X.4VL r0 = X.C89644cb.A00
            boolean r20 = r0.A02()
            if (r20 == 0) goto L_0x00a9
            goto L_0x004f
        L_0x003a:
            java.util.Iterator r1 = r2.iterator()
        L_0x003e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x034e
            java.lang.Object r0 = r1.next()
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x003e
            goto L_0x0031
        L_0x004f:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0347 }
            java.lang.String r0 = "Bloks Bind Subtree"
            r2.append(r0)     // Catch:{ all -> 0x0347 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0347 }
            java.lang.String r1 = r11.A0I()     // Catch:{ all -> 0x0347 }
            if (r1 == 0) goto L_0x006a
            java.lang.String r0 = " id: "
            r3.append(r0)     // Catch:{ all -> 0x0347 }
            r3.append(r1)     // Catch:{ all -> 0x0347 }
        L_0x006a:
            java.util.List r4 = r11.A05     // Catch:{ all -> 0x0347 }
            if (r4 == 0) goto L_0x0097
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x0347 }
            if (r0 != 0) goto L_0x0097
            java.lang.String r0 = " keyPath: "
            r3.append(r0)     // Catch:{ all -> 0x0347 }
            r0 = 0
            java.lang.String r0 = X.AnonymousClass000.A0n(r4, r0)     // Catch:{ all -> 0x0347 }
            r3.append(r0)     // Catch:{ all -> 0x0347 }
            r1 = 1
        L_0x0082:
            int r0 = r4.size()     // Catch:{ all -> 0x0347 }
            if (r1 >= r0) goto L_0x0097
            java.lang.String r0 = "/"
            r3.append(r0)     // Catch:{ all -> 0x0347 }
            java.lang.String r0 = X.AnonymousClass000.A0n(r4, r1)     // Catch:{ all -> 0x0347 }
            r3.append(r0)     // Catch:{ all -> 0x0347 }
            int r1 = r1 + 1
            goto L_0x0082
        L_0x0097:
            java.lang.String r0 = " styleId: "
            r3.append(r0)     // Catch:{ all -> 0x0347 }
            int r0 = r11.A01     // Catch:{ all -> 0x0347 }
            java.lang.String r0 = X.AnonymousClass000.A0l(r3, r0)     // Catch:{ all -> 0x0347 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r2)     // Catch:{ all -> 0x0347 }
            X.C89644cb.A01(r0)     // Catch:{ all -> 0x0347 }
        L_0x00a9:
            java.util.HashSet r7 = X.C13680ns.A0o()     // Catch:{ all -> 0x0347 }
            java.util.HashMap r19 = X.AnonymousClass000.A0x()     // Catch:{ all -> 0x0347 }
            r10 = r11
            r0 = 135(0x87, float:1.89E-43)
            X.0q1 r5 = r11.A0H(r0)     // Catch:{ all -> 0x0347 }
            if (r5 == 0) goto L_0x012e
            java.util.List r13 = r11.A05     // Catch:{ all -> 0x0347 }
            r31 = r13
            if (r13 != 0) goto L_0x00c4
            java.util.List r31 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0347 }
        L_0x00c4:
            java.util.Map r0 = r9.A0A     // Catch:{ all -> 0x0347 }
            r15 = r0
            X.4bN r14 = r9.A01     // Catch:{ all -> 0x0347 }
            X.4K0 r4 = r9.A06     // Catch:{ all -> 0x0347 }
            X.1Jc r2 = r9.A07     // Catch:{ all -> 0x0347 }
            r6 = 0
            java.lang.String r1 = r9.A08     // Catch:{ all -> 0x0347 }
            X.4YH r0 = r9.A00     // Catch:{ all -> 0x0347 }
            X.0q4 r3 = new X.0q4     // Catch:{ all -> 0x0347 }
            r21 = r3
            r22 = r0
            r23 = r6
            r24 = r14
            r25 = r4
            r26 = r2
            r27 = r1
            r28 = r13
            r29 = r15
            r30 = r7
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0347 }
            X.0q3 r0 = X.C14950q3.A01     // Catch:{ 43P -> 0x00f9 }
            java.lang.Object r5 = X.C807345g.A00(r0, r5, r3)     // Catch:{ 43P -> 0x00f9 }
            if (r5 == 0) goto L_0x00f6
            java.util.List r5 = (java.util.List) r5     // Catch:{ 43P -> 0x00f9 }
            goto L_0x0103
        L_0x00f6:
            java.util.List r5 = java.util.Collections.EMPTY_LIST     // Catch:{ 43P -> 0x00f9 }
            goto L_0x0103
        L_0x00f9:
            r2 = move-exception
            java.lang.String r1 = "BindEvaluator"
            java.lang.String r0 = "Exception evaluating onBind"
            X.C29691b2.A01(r1, r0, r2)     // Catch:{ all -> 0x0347 }
            java.util.List r5 = java.util.Collections.EMPTY_LIST     // Catch:{ all -> 0x0347 }
        L_0x0103:
            r3.A01 = r6     // Catch:{ all -> 0x0347 }
            r3.A02 = r6     // Catch:{ all -> 0x0347 }
            X.4ts r0 = r3.A03     // Catch:{ all -> 0x0347 }
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00     // Catch:{ all -> 0x0347 }
            r0.clear()     // Catch:{ all -> 0x0347 }
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x0347 }
            if (r0 != 0) goto L_0x012e
            r14 = 0
            java.lang.Object r0 = r5.get(r14)     // Catch:{ all -> 0x0347 }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ all -> 0x0347 }
            r17 = r0
            java.lang.String r4 = "BindEvaluator"
            r3 = 2
            if (r0 == 0) goto L_0x0148
            int r0 = r5.size()     // Catch:{ all -> 0x0347 }
            int r0 = r0 % r3
            if (r0 != r12) goto L_0x0148
            java.lang.String r0 = "Encountered odd number of elements in interleaved binding array"
            X.C29691b2.A00(r4, r0)     // Catch:{ all -> 0x0347 }
        L_0x012e:
            r0 = 135(0x87, float:1.89E-43)
            X.0q1 r0 = r10.A0H(r0)     // Catch:{ all -> 0x0347 }
            boolean r18 = X.AnonymousClass000.A1V(r0)
            X.4da r0 = X.C90154da.A00()     // Catch:{ all -> 0x0347 }
            X.1JR r0 = r0.A06()     // Catch:{ all -> 0x0347 }
            int[] r6 = r0.A01(r10)     // Catch:{ all -> 0x0347 }
            int r5 = r6.length     // Catch:{ all -> 0x0347 }
            r4 = 0
            goto L_0x0262
        L_0x0148:
            r0 = 0
        L_0x0149:
            int r1 = r5.size()     // Catch:{ all -> 0x0347 }
            if (r0 >= r1) goto L_0x0255
            if (r17 == 0) goto L_0x015c
            int r15 = r0 + 1
            java.lang.String r16 = X.AnonymousClass000.A0n(r5, r0)     // Catch:{ all -> 0x0347 }
            java.lang.Object r2 = r5.get(r15)     // Catch:{ all -> 0x0347 }
            goto L_0x0180
        L_0x015c:
            java.util.List r2 = X.C13690nt.A0l(r5, r0)     // Catch:{ all -> 0x0347 }
            java.lang.String r13 = X.C47842Kv.A00(r2, r14)     // Catch:{ all -> 0x0347 }
            java.lang.String r1 = r10.A0I()     // Catch:{ all -> 0x0347 }
            if (r1 == 0) goto L_0x0177
            boolean r1 = r13.equals(r1)     // Catch:{ all -> 0x0347 }
            if (r1 != 0) goto L_0x0177
            java.lang.String r1 = "Encountered binding targeted for a descendant "
            X.C29691b2.A00(r4, r1)     // Catch:{ all -> 0x0347 }
            goto L_0x0250
        L_0x0177:
            java.lang.String r16 = X.AnonymousClass000.A0n(r2, r12)     // Catch:{ all -> 0x0347 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0347 }
            r15 = r0
        L_0x0180:
            int r1 = X.C807145e.A00(r16)     // Catch:{ all -> 0x0347 }
            r0 = 32
            if (r1 >= r0) goto L_0x019e
            r0 = 3
            java.lang.Object[] r13 = new java.lang.Object[r0]     // Catch:{ all -> 0x0347 }
            X.AnonymousClass000.A1M(r13, r1, r14)     // Catch:{ all -> 0x0347 }
            r13[r12] = r16     // Catch:{ all -> 0x0347 }
            int r0 = r10.A01     // Catch:{ all -> 0x0347 }
            X.AnonymousClass000.A1M(r13, r0, r3)     // Catch:{ all -> 0x0347 }
            java.lang.String r0 = "Encountered invalid minified key: %s, raw: %s for styleId: %s while unwrapping binding expression"
            java.lang.String r0 = java.lang.String.format(r0, r13)     // Catch:{ all -> 0x0347 }
            X.C29691b2.A00(r4, r0)     // Catch:{ all -> 0x0347 }
        L_0x019e:
            X.4da r0 = X.C90154da.A00()     // Catch:{ all -> 0x0347 }
            X.1JR r0 = r0.A06()     // Catch:{ all -> 0x0347 }
            int[] r13 = r0.A00(r10)     // Catch:{ all -> 0x0347 }
            int r0 = r13.length     // Catch:{ all -> 0x0347 }
            r16 = r0
        L_0x01ad:
            r0 = r16
            if (r14 >= r0) goto L_0x0200
            r0 = r13[r14]     // Catch:{ all -> 0x0347 }
            if (r0 != r1) goto L_0x01bc
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x0347 }
            java.util.ArrayList r13 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0347 }
            goto L_0x01bf
        L_0x01bc:
            int r14 = r14 + 1
            goto L_0x01ad
        L_0x01bf:
            if (r2 == 0) goto L_0x01e3
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0347 }
        L_0x01c5:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0347 }
            if (r0 == 0) goto L_0x01e3
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0347 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0347 }
            r28 = r9
            r29 = r10
            r30 = r8
            r32 = r0
            r33 = r19
            X.1dg r0 = X.C612037z.A00(r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x0347 }
            r13.add(r0)     // Catch:{ all -> 0x0347 }
            goto L_0x01c5
        L_0x01e3:
            java.util.Iterator r14 = r13.iterator()     // Catch:{ all -> 0x0347 }
        L_0x01e7:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0347 }
            if (r0 == 0) goto L_0x023a
            java.lang.Object r2 = r14.next()     // Catch:{ all -> 0x0347 }
            X.1dg r2 = (X.C31201dg) r2     // Catch:{ all -> 0x0347 }
            if (r6 != 0) goto L_0x01fa
            android.util.SparseArray r6 = new android.util.SparseArray     // Catch:{ all -> 0x0347 }
            r6.<init>()     // Catch:{ all -> 0x0347 }
        L_0x01fa:
            int r0 = r2.A00     // Catch:{ all -> 0x0347 }
            r6.put(r0, r2)     // Catch:{ all -> 0x0347 }
            goto L_0x01e7
        L_0x0200:
            X.4da r0 = X.C90154da.A00()     // Catch:{ all -> 0x0347 }
            X.1JR r0 = r0.A06()     // Catch:{ all -> 0x0347 }
            int[] r13 = r0.A01(r10)     // Catch:{ all -> 0x0347 }
            int r0 = r13.length     // Catch:{ all -> 0x0347 }
            r16 = r0
            r14 = 0
            goto L_0x0213
        L_0x0211:
            int r14 = r14 + 1
        L_0x0213:
            r0 = r16
            if (r14 >= r0) goto L_0x0218
            goto L_0x021a
        L_0x0218:
            r13 = r2
            goto L_0x023a
        L_0x021a:
            r0 = r13[r14]     // Catch:{ all -> 0x0347 }
            if (r0 != r1) goto L_0x0211
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x0347 }
            r28 = r9
            r29 = r10
            r30 = r8
            r32 = r2
            r33 = r19
            X.1dg r13 = X.C612037z.A00(r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x0347 }
            if (r6 != 0) goto L_0x0235
            android.util.SparseArray r6 = new android.util.SparseArray     // Catch:{ all -> 0x0347 }
            r6.<init>()     // Catch:{ all -> 0x0347 }
        L_0x0235:
            int r0 = r13.A00     // Catch:{ all -> 0x0347 }
            r6.put(r0, r13)     // Catch:{ all -> 0x0347 }
        L_0x023a:
            int r2 = r10.A01     // Catch:{ all -> 0x0347 }
            r0 = 13688(0x3578, float:1.9181E-41)
            if (r2 == r0) goto L_0x0245
            X.1dg r10 = X.AnonymousClass3AN.A00(r10, r11, r13, r1)     // Catch:{ all -> 0x0347 }
            goto L_0x024f
        L_0x0245:
            java.util.List r2 = r9.A09     // Catch:{ all -> 0x0347 }
            X.4Jv r0 = new X.4Jv     // Catch:{ all -> 0x0347 }
            r0.<init>(r10, r13, r1)     // Catch:{ all -> 0x0347 }
            r2.add(r0)     // Catch:{ all -> 0x0347 }
        L_0x024f:
            r0 = r15
        L_0x0250:
            int r0 = r0 + 1
            r14 = 0
            goto L_0x0149
        L_0x0255:
            X.4Ju r0 = r9.A04     // Catch:{ all -> 0x0347 }
            if (r6 == 0) goto L_0x012e
            android.util.SparseArray r1 = r0.A01     // Catch:{ all -> 0x0347 }
            int r0 = r10.A00     // Catch:{ all -> 0x0347 }
            r1.put(r0, r6)     // Catch:{ all -> 0x0347 }
            goto L_0x012e
        L_0x0262:
            if (r4 >= r5) goto L_0x0288
            r3 = r6[r4]     // Catch:{ all -> 0x0347 }
            X.1dg r1 = r10.A0G(r3)     // Catch:{ all -> 0x0347 }
            if (r1 == 0) goto L_0x0285
            if (r8 == 0) goto L_0x026f
            goto L_0x0271
        L_0x026f:
            r2 = 0
            goto L_0x0275
        L_0x0271:
            X.1dg r2 = r8.A0G(r3)     // Catch:{ all -> 0x0347 }
        L_0x0275:
            r0 = r19
            X.1dg r1 = A01(r9, r1, r2, r0, r7)     // Catch:{ all -> 0x0347 }
            boolean r0 = X.C13680ns.A1a(r1, r2)
            r18 = r18 | r0
            X.1dg r10 = X.AnonymousClass3AN.A00(r10, r11, r1, r3)     // Catch:{ all -> 0x0347 }
        L_0x0285:
            int r4 = r4 + 1
            goto L_0x0262
        L_0x0288:
            X.4da r0 = X.C90154da.A00()     // Catch:{ all -> 0x0347 }
            X.1JR r0 = r0.A06()     // Catch:{ all -> 0x0347 }
            int[] r17 = r0.A00(r10)     // Catch:{ all -> 0x0347 }
            r0 = r17
            int r0 = r0.length     // Catch:{ all -> 0x0347 }
            r21 = r0
            r14 = 0
        L_0x029a:
            r0 = r21
            if (r14 >= r0) goto L_0x030a
            r13 = r17[r14]     // Catch:{ all -> 0x0347 }
            java.util.List r12 = r10.A0M(r13)     // Catch:{ all -> 0x0347 }
            if (r8 == 0) goto L_0x02ab
            java.util.List r6 = r8.A0M(r13)     // Catch:{ all -> 0x0347 }
            goto L_0x02ac
        L_0x02ab:
            r6 = 0
        L_0x02ac:
            r5 = r12
            r4 = 0
        L_0x02ae:
            int r0 = r12.size()     // Catch:{ all -> 0x0347 }
            if (r4 >= r0) goto L_0x0301
            X.1dg r3 = X.C13690nt.A0Q(r12, r4)     // Catch:{ all -> 0x0347 }
            if (r3 == 0) goto L_0x02fe
            r2 = 0
            if (r6 == 0) goto L_0x02e7
            int r0 = r6.size()     // Catch:{ all -> 0x0347 }
            if (r4 >= r0) goto L_0x02cf
            X.1dg r15 = X.C13690nt.A0Q(r6, r4)     // Catch:{ all -> 0x0347 }
            int r0 = r15.A00     // Catch:{ all -> 0x0347 }
            r1 = r0
            int r0 = r3.A00     // Catch:{ all -> 0x0347 }
            if (r1 != r0) goto L_0x02cf
            goto L_0x02e6
        L_0x02cf:
            java.util.Iterator r16 = r6.iterator()     // Catch:{ all -> 0x0347 }
        L_0x02d3:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0347 }
            if (r0 == 0) goto L_0x02e7
            java.lang.Object r15 = r16.next()     // Catch:{ all -> 0x0347 }
            X.1dg r15 = (X.C31201dg) r15     // Catch:{ all -> 0x0347 }
            int r0 = r15.A00     // Catch:{ all -> 0x0347 }
            r1 = r0
            int r0 = r3.A00     // Catch:{ all -> 0x0347 }
            if (r1 != r0) goto L_0x02d3
        L_0x02e6:
            r2 = r15
        L_0x02e7:
            r0 = r19
            X.1dg r1 = A01(r9, r3, r2, r0, r7)     // Catch:{ all -> 0x0347 }
            boolean r0 = X.C13680ns.A1a(r1, r2)
            r18 = r18 | r0
            if (r1 == r3) goto L_0x02fe
            if (r5 != r12) goto L_0x02fb
            java.util.ArrayList r5 = X.C13680ns.A0n(r12)     // Catch:{ all -> 0x0347 }
        L_0x02fb:
            r5.set(r4, r1)     // Catch:{ all -> 0x0347 }
        L_0x02fe:
            int r4 = r4 + 1
            goto L_0x02ae
        L_0x0301:
            if (r5 == r12) goto L_0x0307
            X.1dg r10 = X.AnonymousClass3AN.A00(r10, r11, r5, r13)     // Catch:{ all -> 0x0347 }
        L_0x0307:
            int r14 = r14 + 1
            goto L_0x029a
        L_0x030a:
            if (r18 != 0) goto L_0x0313
            if (r8 == 0) goto L_0x0313
            X.1dg r0 = r8.A03     // Catch:{ all -> 0x0347 }
            r3 = r8
            if (r0 == r11) goto L_0x0314
        L_0x0313:
            r3 = r10
        L_0x0314:
            X.4Ju r4 = r9.A04     // Catch:{ all -> 0x0347 }
            boolean r0 = r19.isEmpty()     // Catch:{ all -> 0x0347 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0327
            android.util.SparseArray r2 = r4.A00     // Catch:{ all -> 0x0347 }
            int r1 = r3.A00     // Catch:{ all -> 0x0347 }
            r0 = r19
            r2.put(r1, r0)     // Catch:{ all -> 0x0347 }
        L_0x0327:
            java.util.Set r0 = r19.keySet()     // Catch:{ all -> 0x0347 }
            r7.removeAll(r0)     // Catch:{ all -> 0x0347 }
            android.util.SparseArray r1 = r4.A02     // Catch:{ all -> 0x0347 }
            int r0 = r3.A00     // Catch:{ all -> 0x0347 }
            r1.put(r0, r7)     // Catch:{ all -> 0x0347 }
            r0 = r34
            r0.addAll(r7)     // Catch:{ all -> 0x0347 }
            r1 = r35
            r0 = r19
            r1.putAll(r0)     // Catch:{ all -> 0x0347 }
            if (r20 == 0) goto L_0x0398
            X.C89644cb.A00()
            return r3
        L_0x0347:
            r0 = move-exception
            if (r20 == 0) goto L_0x034d
            X.C89644cb.A00()
        L_0x034d:
            throw r0
        L_0x034e:
            r0 = r34
            r0.addAll(r2)
            X.4Ju r1 = r9.A04
            X.4tg r0 = new X.4tg
            r0.<init>(r5, r1)
            r8.A0Q(r0)
            android.util.SparseArray r0 = r5.A00
            java.lang.Object r1 = r0.get(r3)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x0397
            r0 = r35
            r0.putAll(r1)
            java.util.Iterator r3 = X.AnonymousClass000.A0y(r1)
        L_0x0370:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0397
            java.util.Map$Entry r0 = X.AnonymousClass000.A0z(r3)
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            java.util.Map r0 = r9.A0A
            r0.put(r2, r1)
            java.util.Map r0 = r9.A0B
            java.lang.Object r0 = r0.get(r2)
            boolean r0 = X.AnonymousClass45W.A00(r0, r1)
            if (r0 != 0) goto L_0x0370
            r4.add(r2)
            goto L_0x0370
        L_0x0397:
            return r8
        L_0x0398:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C617039z.A01(X.3AN, X.1dg, X.1dg, java.util.Map, java.util.Set):X.1dg");
    }
}
