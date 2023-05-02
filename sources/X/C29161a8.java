package X;

import com.whatsapp.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: X.1a8  reason: invalid class name and case insensitive filesystem */
public class C29161a8 {
    public final AnonymousClass02J A00;
    public final AnonymousClass02L A01;
    public final C226318r A02;
    public final C29171a9 A03;

    public C29161a8(C226318r r3, C29171a9 r4) {
        AnonymousClass02L r1 = new AnonymousClass02L();
        AnonymousClass02J r0 = new AnonymousClass02J();
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r1;
        this.A00 = r0;
    }

    public int A00() {
        return this.A01.A02.size() + this.A00.A02.size();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007f A[LOOP:0: B:20:0x0079->B:22:0x007f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r10 = this;
            X.02J r0 = r10.A00
            r0.A08()
            X.1a9 r2 = r10.A03
            int r6 = r2.A03
            r4 = 2
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = java.lang.System.currentTimeMillis()
            if (r6 != r4) goto L_0x0097
            long r3 = r3.toHours(r0)
            r0 = 3600(0xe10, double:1.7786E-320)
            long r3 = r3 * r0
        L_0x0019:
            X.18r r5 = r10.A02
            r1 = 47
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r5.A01(r0, r1, r6)
            r7 = 3433(0xd69, float:4.81E-42)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = java.lang.System.currentTimeMillis()
            long r3 = r3.toSeconds(r0)
            r0 = 86400(0x15180, double:4.26873E-319)
            long r3 = r3 / r0
            X.2I6 r8 = r2.A06
            long r0 = r8.A03
            int r9 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x0051
            r1 = 100
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            int r1 = r0.nextInt(r1)
            r0 = 0
            r8.A02 = r0
            if (r1 != 0) goto L_0x004d
            r0 = 1
        L_0x004d:
            r8.A04 = r0
            r8.A03 = r3
        L_0x0051:
            boolean r0 = r8.A04
            if (r0 == 0) goto L_0x0060
            int r0 = r8.A02
            int r0 = r0 + 1
            if (r0 > 0) goto L_0x0090
            r0 = 0
            r8.A02 = r0
            r8.A04 = r0
        L_0x0060:
            r0 = 0
        L_0x0061:
            r5.A01(r0, r7, r6)
            r0 = 1
            if (r6 == r0) goto L_0x008d
            if (r6 == 0) goto L_0x008d
            X.1Zq r0 = r5.A01
        L_0x006b:
            java.util.Map r0 = r0.A00
            java.util.Set r0 = r0.keySet()
            java.util.Collection r0 = java.util.Collections.unmodifiableCollection(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0079:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x009d
            java.lang.Object r0 = r1.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r10.A02(r0)
            goto L_0x0079
        L_0x008d:
            X.1Zq r0 = r5.A00
            goto L_0x006b
        L_0x0090:
            r8.A02 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0061
        L_0x0097:
            long r3 = r3.toSeconds(r0)
            goto L_0x0019
        L_0x009d:
            X.1aA r0 = r2.A04
            X.1aB r1 = r0.A7h()
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x00ce
            X.1Zq r0 = r1.A03
            java.util.Map r0 = r0.A00
            java.util.Set r0 = r0.keySet()
            java.util.Collection r0 = java.util.Collections.unmodifiableCollection(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00b9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00cd
            java.lang.Object r0 = r1.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r10.A02(r0)
            goto L_0x00b9
        L_0x00cd:
            return
        L_0x00ce:
            java.lang.String r1 = "No attribute codes available for rotated buffers"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29161a8.A01():void");
    }

    public final void A02(int i2) {
        C226318r r3 = this.A02;
        C29171a9 r2 = this.A03;
        int i3 = r2.A03;
        Map map = ((i3 == 1 || i3 == 0) ? r3.A00 : r3.A01).A00;
        Integer valueOf = Integer.valueOf(i2);
        C29001Zr r0 = !map.containsKey(valueOf) ? C28991Zq.A01 : (C29001Zr) map.get(valueOf);
        C29191aB A7h = r2.A04.A7h();
        if (A7h.A05()) {
            Map map2 = A7h.A03.A00;
            Object obj = !map2.containsKey(valueOf) ? C28991Zq.A01 : map2.get(valueOf);
            AnonymousClass02J r4 = this.A00;
            Map map3 = r4.A00;
            if (!map3.containsKey(valueOf) && !r0.equals(obj)) {
                r4.A0A(r0.A00, 0, i2);
                map3.put(valueOf, r0);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("No attribute value available for rotated buffers");
    }

    public void A03(C16470t7 r5, int i2) {
        AnonymousClass02L r3 = this.A01;
        r3.A08();
        r3.A0A(Integer.valueOf(i2), 1, r5.code);
        r5.serialize(new C48822Ph(this));
        r3.A09((byte) (r3.A02.A01()[r3.A00] | 4));
    }

    public void A04(byte[] bArr, int i2, int i3) {
        AnonymousClass02L r3 = this.A01;
        r3.A08();
        r3.A0A(Integer.valueOf(i3), 1, i2);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        while (wrap.position() < wrap.limit()) {
            try {
                AnonymousClass056 A06 = AnonymousClass02K.A06(wrap);
                r3.A0A(A06.A02, 2, A06.A00);
            } catch (BufferUnderflowException unused) {
                throw new AnonymousClass2PY("Incomplete buffer");
            } catch (AnonymousClass2PY e2) {
                Log.e("EventSerialBuffer/putSerializedEvent Error adding serialized event to buffer", e2);
            }
        }
        r3.A09((byte) (r3.A02.A01()[r3.A00] | 4));
    }
}
