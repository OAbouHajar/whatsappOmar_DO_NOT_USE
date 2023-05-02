package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.UUID;

/* renamed from: X.1Rp  reason: invalid class name and case insensitive filesystem */
public class C27401Rp {
    public final C16980tz A00;
    public final C16490t9 A01;
    public final C27281Rd A02;
    public final AnonymousClass1RW A03;
    public final C27391Ro A04;
    public final C27251Ra A05;
    public final AnonymousClass1A9 A06;

    public C27401Rp(C16980tz r1, C16490t9 r2, C27281Rd r3, AnonymousClass1RW r4, C27391Ro r5, C27251Ra r6, AnonymousClass1A9 r7) {
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = r7;
        this.A04 = r5;
        this.A02 = r3;
        this.A05 = r6;
        this.A03 = r4;
    }

    public AnonymousClass213 A00(AnonymousClass1XP r18, AnonymousClass210 r19) {
        AnonymousClass211 r7 = new AnonymousClass211(this.A01);
        AnonymousClass1XP r8 = r18;
        C31781f1 r0 = r8.A0J;
        AnonymousClass00B.A06(r0);
        String str = r0.A0D;
        r7.A03.A0D = Long.valueOf(UUID.fromString(str).getMostSignificantBits() & Long.MAX_VALUE);
        AnonymousClass213 r1 = new AnonymousClass213(r7);
        AnonymousClass210 r02 = r19;
        if (r02.A0C || r02.A07 != null) {
            AnonymousClass1XK r5 = r02.A05;
            if (r5 == AnonymousClass1XK.A04) {
                this.A03.A06(this.A00.A00, new AnonymousClass217(r7, r8, r1, this, r02), r8, r02.A08);
                return r1;
            } else if (r5 == AnonymousClass1XK.A0X || r5 == AnonymousClass1XK.A0a) {
                this.A03.A06(this.A00.A00, new AnonymousClass219(r7, r8, r1, this, r02), r8, r02.A08);
                return r1;
            } else {
                AnonymousClass1XK r3 = AnonymousClass1XK.A05;
                if (r5 == r3 || r5 == AnonymousClass1XK.A0I) {
                    AnonymousClass214 r11 = r1.A07;
                    AnonymousClass215 r10 = r1.A06;
                    AnonymousClass216 r9 = r1.A05;
                    File file = r02.A07;
                    AnonymousClass00B.A06(file);
                    boolean z2 = r02.A0G;
                    StringBuilder sb = new StringBuilder();
                    sb.append(UUID.randomUUID().toString());
                    sb.append(".aac");
                    this.A05.A01(new AnonymousClass201(r7, r8, r9, r10, r11, file, A01(file, sb.toString()), z2), r3);
                    return r1;
                }
                AnonymousClass1XK r32 = AnonymousClass1XK.A0B;
                if (r5 == r32 || r5 == AnonymousClass1XK.A0Z || r5 == AnonymousClass1XK.A0G || r5 == AnonymousClass1XK.A0R || r5 == AnonymousClass1XK.A06 || r5 == AnonymousClass1XK.A0L || r5 == AnonymousClass1XK.A07) {
                    String str2 = r02.A0B;
                    AnonymousClass00B.A06(str2);
                    AnonymousClass214 r12 = r1.A07;
                    AnonymousClass215 r102 = r1.A06;
                    AnonymousClass216 r92 = r1.A05;
                    File A002 = r02.A00();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(UUID.randomUUID().toString());
                    sb2.append(".jpg");
                    File A012 = A01(A002, sb2.toString());
                    AnonymousClass1XN r112 = r02.A04;
                    AnonymousClass00B.A06(r112);
                    this.A05.A01(new AnonymousClass203(r7, r8, r92, r102, r112, r12, A012, str2, r02.A0E, r02.A0D), r32);
                    return r1;
                }
                AnonymousClass1XK r33 = AnonymousClass1XK.A0S;
                if (r5 == r33) {
                    File file2 = r02.A07;
                    String str3 = r02.A0B;
                    String str4 = r02.A09;
                    AnonymousClass1XO r122 = r02.A06;
                    AnonymousClass214 r113 = r1.A07;
                    AnonymousClass215 r103 = r1.A06;
                    AnonymousClass216 r93 = r1.A05;
                    File A003 = r02.A00();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(UUID.randomUUID().toString());
                    sb3.append(".webp");
                    this.A05.A01(new AnonymousClass205(r7, r8, r93, r103, r113, r122, file2, A01(A003, sb3.toString()), str3, str4), r33);
                    return r1;
                } else if (r5 == AnonymousClass1XK.A08) {
                    File file3 = r02.A07;
                    AnonymousClass00B.A06(file3);
                    this.A02.A01(r8, new AnonymousClass209(r1.A05, r1.A07, file3));
                    return r1;
                }
            }
        } else {
            AnonymousClass214 r114 = r1.A07;
            AnonymousClass215 r104 = r1.A06;
            AnonymousClass216 r94 = r1.A05;
            String str5 = r02.A0B;
            AnonymousClass00B.A06(str5);
            File A004 = r02.A00();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(UUID.randomUUID().toString());
            sb4.append(".tmp");
            this.A05.A01(new AnonymousClass207(r7, r8, r94, r104, r114, A01(A004, sb4.toString()), str5), r02.A05);
        }
        return r1;
    }

    public final File A01(File file, String str) {
        if (file == null) {
            Log.w("mediaprocessmanager/gettranscodedfile/originalFile is null");
        }
        return this.A06.A0a(str, file != null ? file.length() : -1);
    }
}
