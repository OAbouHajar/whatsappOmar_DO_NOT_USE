package X;

import android.content.Context;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.0Qe  reason: invalid class name */
public class AnonymousClass0Qe {
    public AnonymousClass0KU A00 = AnonymousClass0KU.AUTOMATIC;
    public C12510kW A01;
    public List A02 = AnonymousClass000.A0u();
    public Set A03;
    public Set A04 = new LinkedHashSet();
    public Executor A05;
    public Executor A06;
    public boolean A07;
    public boolean A08;
    public boolean A09 = true;
    public final Context A0A;
    public final AnonymousClass0Rk A0B = new AnonymousClass0Rk();
    public final String A0C;
    public final List A0D = AnonymousClass000.A0u();
    public final List A0E = AnonymousClass000.A0u();

    public AnonymousClass0Qe(Context context, String str) {
        this.A0A = context;
        this.A0C = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0216, code lost:
        r1 = X.AnonymousClass000.A0r("A required auto migration spec (");
        r1.append(r6.getCanonicalName());
        r0 = ") is missing in the database configuration.";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0SM A00() {
        /*
            r25 = this;
            r9 = r25
            java.util.concurrent.Executor r1 = r9.A05
            java.util.concurrent.Executor r0 = r9.A06
            if (r1 != 0) goto L_0x0042
            if (r0 != 0) goto L_0x000e
            java.util.concurrent.Executor r0 = X.C011905t.A02
            r9.A06 = r0
        L_0x000e:
            r9.A05 = r0
        L_0x0010:
            java.util.Set r0 = r9.A03
            if (r0 == 0) goto L_0x0047
            X.C18450wi.A0F(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x001b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r0 = r3.next()
            int r2 = X.AnonymousClass000.A0D(r0)
            java.util.Set r1 = r9.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r0 = r1.contains(r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0U(r0, r2)
            throw r0
        L_0x0042:
            if (r0 != 0) goto L_0x0010
            r9.A06 = r1
            goto L_0x0010
        L_0x0047:
            X.0kW r14 = r9.A01
            if (r14 != 0) goto L_0x0050
            X.0cL r14 = new X.0cL
            r14.<init>()
        L_0x0050:
            java.lang.String r1 = "Required value was null."
            android.content.Context r11 = r9.A0A
            java.lang.String r15 = r9.A0C
            X.0Rk r13 = r9.A0B
            java.util.List r8 = r9.A0D
            boolean r7 = r9.A08
            X.0KU r0 = r9.A00
            X.0KU r12 = r0.A00(r11)
            java.util.concurrent.Executor r6 = r9.A05
            if (r6 == 0) goto L_0x022f
            java.util.concurrent.Executor r5 = r9.A06
            if (r5 == 0) goto L_0x022f
            boolean r4 = r9.A09
            boolean r3 = r9.A07
            java.util.Set r2 = r9.A04
            java.util.List r1 = r9.A0E
            java.util.List r0 = r9.A02
            X.0PC r10 = new X.0PC
            r16 = r8
            r17 = r1
            r18 = r0
            r19 = r2
            r20 = r6
            r21 = r5
            r22 = r7
            r23 = r4
            r24 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r5 = X.C05740Su.A01()
            X.0SM r5 = (X.AnonymousClass0SM) r5
            r8 = 0
            r1 = r5
            androidx.work.impl.WorkDatabase_Impl r1 = (androidx.work.impl.WorkDatabase_Impl) r1
            X.0XC r0 = new X.0XC
            r0.<init>(r1)
            X.0GB r2 = new X.0GB
            r2.<init>(r10, r0)
            android.content.Context r0 = r10.A00
            X.0QV r1 = new X.0QV
            r1.<init>(r0)
            java.lang.String r0 = r10.A04
            r1.A01 = r0
            r1.A00 = r2
            X.0Ot r1 = r1.A00()
            X.0kW r0 = r10.A03
            X.0md r0 = r0.A6t(r1)
            r5.A00 = r0
            java.util.Set r0 = r5.A05()
            java.util.BitSet r3 = new java.util.BitSet
            r3.<init>()
            java.util.Iterator r7 = r0.iterator()
        L_0x00c5:
            boolean r0 = r7.hasNext()
            r6 = 1
            if (r0 == 0) goto L_0x00fd
            java.lang.Object r6 = r7.next()
            java.lang.Class r6 = (java.lang.Class) r6
            java.util.List r4 = r10.A05
            int r0 = r4.size()
            int r2 = r0 + -1
            if (r2 < 0) goto L_0x0216
        L_0x00dc:
            int r1 = r2 + -1
            java.lang.Object r0 = r4.get(r2)
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r6.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x00f9
            r3.set(r2)
            java.util.Map r1 = r5.A02
            java.lang.Object r0 = r4.get(r2)
            r1.put(r6, r0)
            goto L_0x00c5
        L_0x00f9:
            if (r1 < 0) goto L_0x0216
            r2 = r1
            goto L_0x00dc
        L_0x00fd:
            java.util.List r0 = r10.A05
            int r0 = r0.size()
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x011a
        L_0x0107:
            int r1 = r0 + -1
            boolean r0 = r3.get(r0)
            if (r0 == 0) goto L_0x0113
            if (r1 < 0) goto L_0x011a
            r0 = r1
            goto L_0x0107
        L_0x0113:
            java.lang.String r0 = "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x011a:
            java.util.Map r0 = r5.A02
            java.util.List r0 = r5.A03(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x0124:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0144
            java.lang.Object r3 = r4.next()
            X.0PS r3 = (X.AnonymousClass0PS) r3
            X.0Rk r2 = r10.A02
            int r1 = r3.A01
            int r0 = r3.A00
            boolean r0 = r2.A03(r1, r0)
            if (r0 != 0) goto L_0x0124
            X.0PS[] r0 = new X.AnonymousClass0PS[r6]
            r0[r8] = r3
            r2.A02(r0)
            goto L_0x0124
        L_0x0144:
            java.lang.Class<X.0cP> r1 = X.C07750cP.class
            X.0md r0 = r5.A00()
            r1.isInstance(r0)
            java.lang.Class<X.0cO> r1 = X.C07740cO.class
            X.0md r0 = r5.A00()
            r1.isInstance(r0)
            X.0KU r1 = r10.A01
            X.0KU r0 = X.AnonymousClass0KU.WRITE_AHEAD_LOGGING
            boolean r1 = X.AnonymousClass000.A1Y(r1, r0)
            X.0md r0 = r5.A00()
            r0.Af3(r1)
            java.util.List r0 = r10.A06
            r5.A01 = r0
            java.util.concurrent.Executor r0 = r10.A09
            r5.A03 = r0
            java.util.concurrent.Executor r1 = r10.A0A
            X.0hp r0 = new X.0hp
            r0.<init>(r1)
            r5.A04 = r0
            boolean r0 = r10.A0C
            r5.A05 = r0
            java.util.Map r0 = r5.A04()
            java.util.BitSet r4 = new java.util.BitSet
            r4.<init>()
            java.util.Iterator r9 = X.AnonymousClass000.A0y(r0)
        L_0x0187:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01f0
            java.util.Map$Entry r0 = X.AnonymousClass000.A0z(r9)
            java.lang.Object r6 = r0.getKey()
            java.lang.Class r6 = (java.lang.Class) r6
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r8 = r0.iterator()
        L_0x01a1:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0187
            java.lang.Object r7 = r8.next()
            java.lang.Class r7 = (java.lang.Class) r7
            java.util.List r3 = r10.A07
            int r0 = r3.size()
            int r2 = r0 + -1
            if (r2 < 0) goto L_0x01d8
        L_0x01b7:
            int r1 = r2 + -1
            java.lang.Object r0 = r3.get(r2)
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r7.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x01d4
            r4.set(r2)
            java.util.Map r1 = r5.A09
            java.lang.Object r0 = r3.get(r2)
            r1.put(r7, r0)
            goto L_0x01a1
        L_0x01d4:
            if (r1 < 0) goto L_0x01d8
            r2 = r1
            goto L_0x01b7
        L_0x01d8:
            java.lang.String r0 = "A required type converter ("
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r7)
            java.lang.String r0 = ") for "
            r1.append(r0)
            java.lang.String r0 = r6.getCanonicalName()
            r1.append(r0)
            java.lang.String r0 = " is missing in the database configuration."
            goto L_0x0225
        L_0x01f0:
            java.util.List r3 = r10.A07
            int r0 = r3.size()
            int r2 = r0 + -1
            if (r2 < 0) goto L_0x022e
        L_0x01fa:
            int r1 = r2 + -1
            boolean r0 = r4.get(r2)
            if (r0 == 0) goto L_0x0206
            if (r1 < 0) goto L_0x022e
            r2 = r1
            goto L_0x01fa
        L_0x0206:
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r0 = "Unexpected type converter "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r2)
            java.lang.String r0 = ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."
            goto L_0x0225
        L_0x0216:
            java.lang.String r0 = "A required auto migration spec ("
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r6.getCanonicalName()
            r1.append(r0)
            java.lang.String r0 = ") is missing in the database configuration."
        L_0x0225:
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x022e:
            return r5
        L_0x022f:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Qe.A00():X.0SM");
    }

    public void A01(AnonymousClass0PS... r6) {
        if (this.A03 == null) {
            this.A03 = new HashSet();
        }
        for (AnonymousClass0PS r2 : r6) {
            Set set = this.A03;
            C18450wi.A0F(set);
            set.add(Integer.valueOf(r2.A01));
            Set set2 = this.A03;
            C18450wi.A0F(set2);
            set2.add(Integer.valueOf(r2.A00));
        }
        this.A0B.A02((AnonymousClass0PS[]) Arrays.copyOf(r6, r3));
    }
}
