package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.19E  reason: invalid class name */
public class AnonymousClass19E implements C18970xY {
    public final C16040sK A00;
    public final AnonymousClass139 A01;
    public final C16440t3 A02;
    public final C208211s A03;
    public final C20360zv A04;
    public final C14710pd A05;
    public final C16490t9 A06;

    public AnonymousClass19E(C16040sK r1, AnonymousClass19R r2, AnonymousClass139 r3, C16440t3 r4, C208211s r5, C20360zv r6, C14710pd r7, C16490t9 r8) {
        this.A02 = r4;
        this.A05 = r7;
        this.A00 = r1;
        this.A06 = r8;
        this.A03 = r5;
        this.A04 = r6;
        this.A01 = r3;
        r2.A02(this);
    }

    public static Integer A00(int i2) {
        if (!(i2 == 0 || i2 == 1)) {
            if (!(i2 == 2 || i2 == 3)) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return 2;
        }
        return 1;
    }

    public static Integer A01(int i2) {
        int i3 = 1;
        if (i2 != 0) {
            int i4 = 5;
            if (i2 != 1) {
                i3 = 2;
                if (i2 != 2) {
                    i3 = 3;
                    if (i2 != 3) {
                        i3 = 4;
                        if (i2 != 4) {
                            i4 = 6;
                            if (i2 != 5) {
                                return null;
                            }
                        }
                    }
                }
            }
            return Integer.valueOf(i4);
        }
        return Integer.valueOf(i3);
    }

    public static final Integer A02(long j2) {
        int i2;
        if (j2 == 0) {
            i2 = 1;
        } else if (j2 == 1) {
            i2 = 2;
        } else if (j2 < 10) {
            i2 = 3;
        } else if (j2 < 100) {
            i2 = 4;
        } else if (j2 < 500) {
            i2 = 5;
        } else if (j2 < 1000) {
            i2 = 6;
        } else {
            i2 = 8;
            if (j2 < 5000) {
                i2 = 7;
            }
        }
        return Integer.valueOf(i2);
    }

    public static Integer A03(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -849492943:
                    if (str.equals("regular_low")) {
                        return 2;
                    }
                    break;
                case -564602779:
                    if (str.equals("regular_high")) {
                        return 3;
                    }
                    break;
                case -498584183:
                    if (str.equals("critical_unblock_low")) {
                        return 5;
                    }
                    break;
                case 207170541:
                    if (str.equals("critical_block")) {
                        return 4;
                    }
                    break;
                case 1086463900:
                    if (str.equals("regular")) {
                        return 1;
                    }
                    break;
            }
        }
        return null;
    }

    public static final String A04(AnonymousClass1WL r7, AnonymousClass1WL r8) {
        String str;
        if (r7 == null) {
            str = "SyncStatsManager/createBootstrapSessionId companionKey is null";
        } else if (r8 == null) {
            str = "SyncStatsManager/createBootstrapSessionId primaryKey is null";
        } else {
            try {
                byte[] bArr = {95};
                return Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(C28641Wx.A04(r8.A00.A01, bArr, r7.A00.A01)), 2);
            } catch (NoSuchAlgorithmException e2) {
                Log.e("sync-stats-manager/createBootstrapSessionId unable to create id because sha256 instance could not created.", e2);
                return null;
            }
        }
        Log.w(str);
        return null;
    }

    public AnonymousClass1WM A05(AnonymousClass1WL r6, String str) {
        String A042 = A04(r6, this.A03.A00.A04().A01);
        String str2 = null;
        if (str != null) {
            C16040sK r0 = this.A00;
            r0.A0B();
            AnonymousClass1ZT r3 = r0.A05;
            if (r3 == null) {
                Log.e("sync-stats-manager/createMDRegAttemptId myUserJid is null");
            } else {
                try {
                    MessageDigest instance = MessageDigest.getInstance("SHA-256");
                    StringBuilder sb = new StringBuilder();
                    sb.append(r3.user);
                    sb.append("_");
                    sb.append(str);
                    str2 = Base64.encodeToString(instance.digest(sb.toString().getBytes()), 2);
                } catch (NoSuchAlgorithmException e2) {
                    Log.e("sync-stats-manager/createMDRegAttemptId unable to create id because sha256 instance could not created.", e2);
                }
            }
        }
        if (A042 == null || str2 == null) {
            return null;
        }
        return new AnonymousClass1WM(A042, str2);
    }

    public void A06(int i2) {
        if (this.A05.A0E(C16620tM.A02, 624)) {
            C37371p3 r1 = new C37371p3();
            r1.A00 = Integer.valueOf(i2);
            this.A06.A06(r1);
        }
    }

    public void A07(int i2, String str) {
        C37341p0 r1 = new C37341p0();
        r1.A01 = Integer.valueOf(i2);
        r1.A00 = A03(str);
        this.A06.A06(r1);
    }

    public void A08(long j2, boolean z2) {
        C37321oy r2 = new C37321oy();
        r2.A00 = Boolean.valueOf(z2);
        r2.A01 = Long.valueOf(this.A02.A00() - j2);
        this.A06.A06(r2);
    }

    public final void A09(AnonymousClass1WM r4, int i2) {
        C37331oz r2 = new C37331oz();
        r2.A00 = Integer.valueOf(i2);
        r2.A03 = r4.A01;
        r2.A02 = r4.A00;
        r2.A01 = Long.valueOf(this.A02.A00());
        this.A06.A06(r2);
    }

    public void A0A(AnonymousClass1WM r6, int i2, int i3, long j2, long j3, long j4, long j5, long j6) {
        if (r6 != null) {
            C37361p2 r2 = new C37361p2();
            r2.A05 = Long.valueOf(j3);
            r2.A06 = Long.valueOf(j4);
            r2.A07 = Long.valueOf(j5);
            r2.A01 = Integer.valueOf(i3);
            r2.A0B = r6.A01;
            r2.A0A = r6.A00;
            r2.A09 = Long.valueOf(this.A02.A00());
            int i4 = 1;
            if (i3 != 1) {
                i4 = 2;
            }
            r2.A03 = Integer.valueOf(i4);
            r2.A00 = A01(i2);
            r2.A02 = A00(i2);
            r2.A04 = Long.valueOf(j2);
            r2.A08 = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j6));
            this.A06.A06(r2);
        }
    }

    public void A0B(AnonymousClass1WM r4, int i2, long j2, long j3, boolean z2) {
        C37311ox r2 = new C37311ox();
        r2.A06 = r4.A01;
        r2.A05 = r4.A00;
        r2.A04 = Long.valueOf(this.A02.A00());
        r2.A02 = Long.valueOf(j2);
        r2.A00 = Integer.valueOf(i2);
        int i3 = 2;
        if (z2) {
            i3 = 1;
        }
        r2.A01 = Integer.valueOf(i3);
        r2.A03 = Long.valueOf(j3);
        this.A06.A06(r2);
    }

    public void A0C(AnonymousClass1WM r4, int i2, long j2, boolean z2) {
        if (r4 != null) {
            C37301ow r2 = new C37301ow();
            r2.A07 = r4.A01;
            r2.A06 = r4.A00;
            r2.A05 = Long.valueOf(this.A02.A00());
            int i3 = 2;
            r2.A02 = 2;
            if (z2) {
                i3 = 1;
            }
            r2.A03 = Integer.valueOf(i3);
            r2.A00 = A01(i2);
            r2.A01 = A00(i2);
            r2.A04 = Long.valueOf(j2);
            this.A06.A06(r2);
        }
    }

    public void A0D(AnonymousClass1WM r4, int i2, boolean z2) {
        C37301ow r2 = new C37301ow();
        r2.A07 = r4.A01;
        r2.A06 = r4.A00;
        r2.A05 = Long.valueOf(this.A02.A00());
        int i3 = 1;
        r2.A02 = 1;
        if (!z2) {
            i3 = 2;
        }
        r2.A03 = Integer.valueOf(i3);
        r2.A01 = Integer.valueOf(i2);
        this.A06.A06(r2);
    }

    public void A0E(C29861bL r8, int i2) {
        if ((r8 instanceof C29871bM) && this.A05.A0E(C16620tM.A02, 1183)) {
            C29871bM r82 = (C29871bM) r8;
            String str = r82.A0G;
            String str2 = r82.A0F;
            int i3 = r82.A03;
            int i4 = 1;
            boolean z2 = false;
            if (i2 == -1) {
                z2 = true;
            }
            if (str != null && str2 != null) {
                C37351p1 r2 = new C37351p1();
                r2.A06 = str;
                r2.A05 = str2;
                r2.A01 = A00(i3);
                r2.A00 = A01(i3);
                r2.A04 = Long.valueOf(this.A02.A00());
                if (!z2) {
                    i4 = 2;
                }
                r2.A02 = Integer.valueOf(i4);
                if (!z2) {
                    r2.A03 = Long.valueOf((long) i2);
                }
                this.A06.A06(r2);
            }
        }
    }

    public void AQq(C29861bL r17) {
        C29861bL r2 = r17;
        if (r2 instanceof C29871bM) {
            C29871bM r22 = (C29871bM) r2;
            String str = r22.A0G;
            String str2 = r22.A0F;
            if (str != null && str2 != null) {
                long j2 = r22.A04;
                long j3 = r22.A07;
                long j4 = r22.A05;
                long j5 = r22.A0A;
                A0A(new AnonymousClass1WM(str, str2), r22.A03, 1, (long) r22.A01, j2, j3, j4, j5);
            }
        }
    }
}
