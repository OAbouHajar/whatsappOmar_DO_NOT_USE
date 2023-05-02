package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;

/* renamed from: X.1gM  reason: invalid class name and case insensitive filesystem */
public class C32441gM {
    public int A00;
    public C40111ta A01;
    public boolean A02;

    public C32441gM(C17030uP r2, UserJid userJid) {
        this(r2.A00(userJid));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r2 != 3) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C32441gM(X.C28331Vq r4) {
        /*
            r3 = this;
            r3.<init>()
            if (r4 == 0) goto L_0x001b
            int r2 = r4.A03
            X.1ta r1 = r4.A00()
            int r0 = A00(r4)
            r3.A01 = r1
            r3.A00 = r0
            r1 = 3
            r0 = 1
            if (r2 == r1) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r3.A02 = r0
            return
        L_0x001b:
            r1 = 1
            X.1ta r0 = new X.1ta
            r0.<init>()
            r3.A01 = r0
            r3.A00 = r1
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32441gM.<init>(X.1Vq):void");
    }

    public C32441gM(C40111ta r3, int i2, int i3) {
        this.A01 = r3 == null ? new C40111ta() : r3;
        this.A00 = i2;
        this.A02 = i3 == 3;
    }

    public static int A00(C28331Vq r2) {
        if (r2 != null) {
            if (r2.A02()) {
                return 2;
            }
            if (r2.A01()) {
                return 3;
            }
        }
        return 1;
    }

    public int A01() {
        if (!A04(1, 1, 1, false)) {
            if (A04(2, 1, 1, false)) {
                return 1;
            }
            if (!A04(2, 1, 1, true)) {
                if (!A04(3, 1, 1, false)) {
                    if (!A04(3, 1, 1, true)) {
                        if (A04(3, 1, 2, false)) {
                            return 5;
                        }
                        if (A04(3, 1, 2, true)) {
                            return 6;
                        }
                        if (A04(3, 2, 1, false)) {
                            return 7;
                        }
                        if (A04(3, 2, 1, true)) {
                            return 8;
                        }
                        if (A04(3, 2, 2, false)) {
                            return 9;
                        }
                        if (A04(3, 2, 2, true)) {
                            return 10;
                        }
                        if (A04(2, 1, 2, false)) {
                            return 11;
                        }
                        if (A04(2, 1, 2, true)) {
                            return 12;
                        }
                        if (A04(2, 2, 2, false)) {
                            return 13;
                        }
                        if (A04(2, 2, 2, true)) {
                            return 14;
                        }
                        if (!A04(1, 0, 0, false)) {
                            if (A04(2, 0, 0, false)) {
                                return 1;
                            }
                            if (!A04(2, 0, 0, true)) {
                                if (!A04(3, 0, 0, false)) {
                                    if (A04(3, 0, 0, true)) {
                                        return 4;
                                    }
                                }
                            }
                        }
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 0;
    }

    public boolean A02() {
        int A012 = A01();
        if (A012 == 5 || A012 == 6) {
            return true;
        }
        switch (A012) {
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return true;
            default:
                return false;
        }
    }

    public boolean A03() {
        int A012 = A01();
        return A012 == 0 || A012 == 1 || A012 == 2 || A012 == 3 || A012 == 4;
    }

    public final boolean A04(int i2, int i3, int i4, boolean z2) {
        if (this.A00 == i2) {
            C40111ta r1 = this.A01;
            return r1.actualActors == i3 && r1.hostStorage == i4 && this.A02 == z2;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C32441gM r5 = (C32441gM) obj;
            if (!(this.A00 == r5.A00 && this.A02 == r5.A02 && this.A01.equals(r5.A01))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, Integer.valueOf(this.A00), Boolean.valueOf(this.A02)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BusinessState{privacyMode=");
        sb.append(this.A01);
        sb.append(", client=");
        sb.append(this.A00);
        sb.append(", isVerified=");
        sb.append(this.A02);
        sb.append(", stateId=");
        sb.append(A01());
        sb.append('}');
        return sb.toString();
    }
}
