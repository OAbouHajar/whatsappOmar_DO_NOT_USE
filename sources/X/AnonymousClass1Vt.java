package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Vt  reason: invalid class name */
public class AnonymousClass1Vt {
    public static final int[] A0S = {702, 701};
    public static final int[] A0T = {101, 102, 103, 104};
    public static final int[] A0U = {11, 12, 608};
    public static final int[] A0V = {401, 402, 403, 404, 410, 411, 413, 601, 602, 603, 425};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public C28411Vz A07;
    @Deprecated
    public C28401Vy A08;
    public C35431lv A09;
    public AnonymousClass1W2 A0A;
    public C35361lo A0B;
    public C15830rv A0C;
    public UserJid A0D;
    public UserJid A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public ArrayList A0N;
    public boolean A0O = true;
    public boolean A0P;
    public boolean A0Q;
    public byte[] A0R;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (r2 == 40) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1Vt(X.C28411Vz r12, X.C28401Vy r13, com.whatsapp.jid.UserJid r14, com.whatsapp.jid.UserJid r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, int r24, int r25, int r26, int r27, long r28, long r30) {
        /*
            r11 = this;
            r3 = r17
            r4 = r11
            r11.<init>()
            r0 = 1
            r11.A0O = r0
            r2 = r23
            if (r23 != 0) goto L_0x000e
            r0 = 0
        L_0x000e:
            X.AnonymousClass00B.A0G(r0)
            r11.A03 = r2
            r11.A0E = r14
            r11.A0D = r15
            r0 = r16
            r11.A0I = r0
            r11.A08 = r13
            r0 = r28
            r11.A05 = r0
            r0 = r22
            r11.A0G = r0
            r0 = r25
            r11.A04 = r0
            r0 = r26
            r11.A01 = r0
            r11.A07 = r12
            r0 = r27
            r11.A00 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x004d
            r3 = r21
            boolean r0 = android.text.TextUtils.isEmpty(r21)
            if (r0 != 0) goto L_0x0050
            r0 = 10
            if (r2 == r0) goto L_0x004d
            r0 = 20
            if (r2 == r0) goto L_0x004d
            r0 = 40
            if (r2 != r0) goto L_0x0050
        L_0x004d:
            r11.A06(r3)
        L_0x0050:
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r24
            r9 = r30
            r4.A07(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Vt.<init>(X.1Vz, X.1Vy, com.whatsapp.jid.UserJid, com.whatsapp.jid.UserJid, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, int, long, long):void");
    }

    public AnonymousClass1Vt(String str, int i2, int i3, int i4, long j2) {
        this.A03 = i2;
        this.A05 = j2;
        this.A0G = str;
        this.A04 = i3;
        this.A01 = i4;
        this.A0I = "XXX";
        this.A07 = C35481m0.A06;
    }

    public synchronized C28411Vz A00() {
        return this.A07;
    }

    public synchronized C35361lo A01() {
        return this.A0B;
    }

    public synchronized Boolean A02() {
        int i2;
        i2 = this.A03;
        return (i2 == 1 || i2 == 100 || i2 == 20) ? Boolean.TRUE : (i2 == 2 || i2 == 200 || i2 == 10) ? Boolean.FALSE : null;
    }

    public synchronized void A03(AnonymousClass1W2 r4, long j2) {
        if (j2 > 0) {
            AnonymousClass1W2 r0 = this.A0A;
            if (r0 == null) {
                this.A0A = r4;
                r0 = r4;
            }
            r0.A0R(j2);
        }
    }

    public synchronized void A04(AnonymousClass1Vt r10) {
        synchronized (this) {
            if (!TextUtils.isEmpty(r10.A0K)) {
                A06(r10.A0K);
            }
            this.A05 = r10.A05;
            this.A0E = r10.A0E;
            this.A0D = r10.A0D;
            this.A08 = r10.A08;
            this.A0I = r10.A0I;
            this.A03 = r10.A03;
            this.A0G = r10.A0G;
            this.A07 = r10.A07;
            this.A04 = r10.A04;
            this.A0R = r10.A0R;
            this.A0L = r10.A0L;
            this.A0Q = r10.A0Q;
            this.A0C = r10.A0C;
            this.A0M = r10.A0M;
            this.A0A = r10.A0A;
            this.A0B = r10.A0B;
            A07(this.A0H, this.A0J, this.A0F, this.A02, this.A06);
        }
    }

    public synchronized void A05(C35361lo r2) {
        this.A0B = r2;
    }

    public synchronized void A06(String str) {
        AnonymousClass00B.A05(str);
        this.A0K = str;
        this.A0O = true;
    }

    public synchronized void A07(String str, String str2, String str3, int i2, long j2) {
        synchronized (this) {
            this.A02 = i2;
            if (j2 >= 0) {
                this.A06 = j2;
                this.A0O = true;
                this.A0H = str;
                this.A0J = str2;
                this.A0F = str3;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("PAY: PaymentTransaction update called with invalid timestamp: ");
                sb.append(j2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    public synchronized void A08(List list) {
        if (list != null) {
            if (list.size() > 0) {
                this.A0N = new ArrayList(list);
            }
        }
    }

    public synchronized void A09(boolean z2) {
        this.A0O = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0035, code lost:
        if (r1 != 200) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0038, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0067, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0A() {
        /*
            r7 = this;
            monitor-enter(r7)
            int r1 = r7.A03     // Catch:{ all -> 0x0068 }
            r6 = 0
            r5 = 1
            if (r1 == r5) goto L_0x0008
            goto L_0x0017
        L_0x0008:
            int[] r4 = A0V     // Catch:{ all -> 0x0068 }
            int r3 = r4.length     // Catch:{ all -> 0x0068 }
            r2 = 0
        L_0x000c:
            if (r2 >= r3) goto L_0x0066
            r1 = r4[r2]     // Catch:{ all -> 0x0068 }
            int r0 = r7.A02     // Catch:{ all -> 0x0068 }
            if (r1 == r0) goto L_0x0037
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0017:
            r0 = 2
            if (r1 == r0) goto L_0x0057
            r0 = 3
            if (r1 == r0) goto L_0x0066
            r0 = 6
            if (r1 == r0) goto L_0x0048
            r0 = 7
            if (r1 == r0) goto L_0x0057
            r0 = 8
            if (r1 == r0) goto L_0x0039
            r0 = 10
            if (r1 == r0) goto L_0x0039
            r0 = 20
            if (r1 == r0) goto L_0x0039
            r0 = 100
            if (r1 == r0) goto L_0x0008
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0057
        L_0x0037:
            monitor-exit(r7)
            return r6
        L_0x0039:
            int[] r4 = A0U     // Catch:{ all -> 0x0068 }
            int r3 = r4.length     // Catch:{ all -> 0x0068 }
            r2 = 0
        L_0x003d:
            if (r2 >= r3) goto L_0x0066
            r1 = r4[r2]     // Catch:{ all -> 0x0068 }
            int r0 = r7.A02     // Catch:{ all -> 0x0068 }
            if (r1 == r0) goto L_0x0037
            int r2 = r2 + 1
            goto L_0x003d
        L_0x0048:
            int[] r4 = A0S     // Catch:{ all -> 0x0068 }
            int r3 = r4.length     // Catch:{ all -> 0x0068 }
            r2 = 0
        L_0x004c:
            if (r2 >= r3) goto L_0x0066
            r1 = r4[r2]     // Catch:{ all -> 0x0068 }
            int r0 = r7.A02     // Catch:{ all -> 0x0068 }
            if (r1 == r0) goto L_0x0037
            int r2 = r2 + 1
            goto L_0x004c
        L_0x0057:
            int[] r4 = A0T     // Catch:{ all -> 0x0068 }
            int r3 = r4.length     // Catch:{ all -> 0x0068 }
            r2 = 0
        L_0x005b:
            if (r2 >= r3) goto L_0x0066
            r1 = r4[r2]     // Catch:{ all -> 0x0068 }
            int r0 = r7.A02     // Catch:{ all -> 0x0068 }
            if (r1 == r0) goto L_0x0037
            int r2 = r2 + 1
            goto L_0x005b
        L_0x0066:
            monitor-exit(r7)
            return r5
        L_0x0068:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Vt.A0A():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
        r1 = r2.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0B() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r1 = r2.A03     // Catch:{ all -> 0x0016 }
            r0 = 10
            if (r1 != r0) goto L_0x0013
            int r1 = r2.A02     // Catch:{ all -> 0x0016 }
            r0 = 12
            if (r1 == r0) goto L_0x0011
            r0 = 19
            if (r1 != r0) goto L_0x0013
        L_0x0011:
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            monitor-exit(r2)
            return r0
        L_0x0016:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Vt.A0B():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
        r1 = r2.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0C() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A0E()     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x0017
            int r1 = r2.A02     // Catch:{ all -> 0x001a }
            r0 = 12
            if (r1 == r0) goto L_0x0015
            r0 = 19
            if (r1 == r0) goto L_0x0015
            r0 = 20
            if (r1 != r0) goto L_0x0017
        L_0x0015:
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            monitor-exit(r2)
            return r0
        L_0x001a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Vt.A0C():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r2 == 602) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0D() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.A0C()     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x0012
            int r2 = r3.A02     // Catch:{ all -> 0x0015 }
            r0 = 608(0x260, float:8.52E-43)
            if (r2 == r0) goto L_0x0012
            r1 = 602(0x25a, float:8.44E-43)
            r0 = 0
            if (r2 != r1) goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            monitor-exit(r3)
            return r0
        L_0x0015:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Vt.A0D():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r2 == 30) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0E() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r2 = r3.A03     // Catch:{ all -> 0x0017 }
            r0 = 20
            if (r2 == r0) goto L_0x0014
            r0 = 40
            if (r2 == r0) goto L_0x0014
            r0 = 10
            if (r2 == r0) goto L_0x0014
            r1 = 30
            r0 = 0
            if (r2 != r1) goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            monitor-exit(r3)
            return r0
        L_0x0017:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Vt.A0E():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r3.A03 == 30) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0F() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r1 = r3.A02     // Catch:{ all -> 0x001d }
            r0 = 106(0x6a, float:1.49E-43)
            if (r1 == r0) goto L_0x001a
            r0 = 405(0x195, float:5.68E-43)
            if (r1 == r0) goto L_0x001a
            r0 = 604(0x25c, float:8.46E-43)
            if (r1 == r0) goto L_0x001a
            r0 = 703(0x2bf, float:9.85E-43)
            if (r1 == r0) goto L_0x001a
            int r2 = r3.A03     // Catch:{ all -> 0x001d }
            r1 = 30
            r0 = 0
            if (r2 != r1) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            monitor-exit(r3)
            return r0
        L_0x001d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Vt.A0F():boolean");
    }

    public synchronized boolean A0G() {
        return AnonymousClass1W1.A0A(this.A0G, this.A04);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r1 != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0H() {
        /*
            r2 = this;
            monitor-enter(r2)
            X.1Vy r0 = r2.A08     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0010
            X.1W2 r0 = r2.A0A     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.A0Z(r2)     // Catch:{ all -> 0x0013 }
            r0 = 0
            if (r1 == 0) goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            monitor-exit(r2)
            return r0
        L_0x0013:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Vt.A0H():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0086, code lost:
        if (r11 <= r9) goto L_0x0089;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0I(X.AnonymousClass1W2 r16, int r17, long r18) {
        /*
            r15 = this;
            monitor-enter(r15)
            long r1 = r15.A06     // Catch:{ all -> 0x008b }
            X.1W2 r8 = r15.A0A     // Catch:{ all -> 0x008b }
            if (r8 == 0) goto L_0x000c
            int r7 = r8.A05()     // Catch:{ all -> 0x008b }
            goto L_0x000d
        L_0x000c:
            r7 = 0
        L_0x000d:
            if (r16 == 0) goto L_0x0014
            int r6 = r16.A05()     // Catch:{ all -> 0x008b }
            goto L_0x0015
        L_0x0014:
            r6 = 0
        L_0x0015:
            r5 = 0
            if (r16 == 0) goto L_0x0023
            X.5UL r0 = r16.A0B()     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x0024
            java.lang.String r4 = r0.AAk()     // Catch:{ all -> 0x008b }
            goto L_0x0025
        L_0x0023:
            r0 = r5
        L_0x0024:
            r4 = r5
        L_0x0025:
            r13 = 0
            if (r0 == 0) goto L_0x002e
            long r11 = r0.AGn()     // Catch:{ all -> 0x008b }
            goto L_0x0030
        L_0x002e:
            r11 = 0
        L_0x0030:
            if (r8 == 0) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            r9 = 0
            goto L_0x0044
        L_0x0036:
            X.5UL r0 = r8.A0B()     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x0033
            java.lang.String r5 = r0.AAk()     // Catch:{ all -> 0x008b }
            long r9 = r0.AGn()     // Catch:{ all -> 0x008b }
        L_0x0044:
            int r3 = r15.A01     // Catch:{ all -> 0x008b }
            r0 = 3
            if (r3 != r0) goto L_0x0055
            if (r8 == 0) goto L_0x0050
            long r1 = r8.A0A()     // Catch:{ all -> 0x008b }
            goto L_0x0052
        L_0x0050:
            r1 = 0
        L_0x0052:
            if (r16 == 0) goto L_0x005c
            goto L_0x0058
        L_0x0055:
            r13 = r18
            goto L_0x005c
        L_0x0058:
            long r13 = r16.A0A()     // Catch:{ all -> 0x008b }
        L_0x005c:
            int r3 = r15.A03     // Catch:{ all -> 0x008b }
            r0 = 5
            if (r3 == r0) goto L_0x0065
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r3 != r0) goto L_0x0069
        L_0x0065:
            r0 = r17
            if (r3 != r0) goto L_0x0088
        L_0x0069:
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0088
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0077
            if (r6 != 0) goto L_0x0075
            if (r7 == 0) goto L_0x0088
        L_0x0075:
            if (r6 > r7) goto L_0x0088
        L_0x0077:
            if (r8 == 0) goto L_0x007f
            boolean r0 = r8.A0Y()     // Catch:{ all -> 0x008b }
            if (r0 != 0) goto L_0x0088
        L_0x007f:
            if (r4 == 0) goto L_0x0083
            if (r4 != r5) goto L_0x0088
        L_0x0083:
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x0089
        L_0x0088:
            r0 = 1
        L_0x0089:
            monitor-exit(r15)
            return r0
        L_0x008b:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Vt.A0I(X.1W2, int, long):boolean");
    }

    public synchronized boolean A0J(AnonymousClass1Vt r5) {
        return A0I(r5.A0A, r5.A03, r5.A06);
    }

    public synchronized boolean A0K(UserJid userJid) {
        boolean z2;
        if (userJid != null) {
            if (!userJid.equals(this.A0E)) {
                z2 = false;
                if (userJid.equals(this.A0D)) {
                }
            }
        }
        z2 = true;
        return z2;
    }

    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("id: ");
        sb.append(this.A0K);
        sb.append(" key_remote_id: ");
        sb.append(this.A0C);
        sb.append(" key_from_me: ");
        sb.append(this.A0Q);
        sb.append(" key_id: ");
        sb.append(this.A0L);
        sb.append(" status: ");
        sb.append(this.A02);
        sb.append(" type: ");
        sb.append(this.A03);
        sb.append(" updateTs: ");
        sb.append(this.A06);
        sb.append(" initTs: ");
        sb.append(this.A05);
        sb.append(" error_code: ");
        sb.append(this.A0J);
        sb.append(" sender: ");
        sb.append(this.A0E);
        sb.append(" receiver: ");
        sb.append(this.A0D);
        sb.append(" credential_id: ");
        sb.append(this.A0H);
        sb.append(" methods: ");
        sb.append(this.A0N);
        sb.append(" reqMsgKeyId: ");
        sb.append(this.A0M);
        sb.append(" metadata: ");
        sb.append(this.A0A);
        sb.append(" country: ");
        sb.append(this.A0G);
        sb.append(" version: ");
        sb.append(this.A04);
        sb.append(" interop: ");
        sb.append(this.A0P);
        sb.append(" background: ");
        sb.append(this.A0B);
        sb.append(" purchase_initiator: ");
        sb.append(this.A00);
        return sb.toString();
    }
}
