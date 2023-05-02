package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.210  reason: invalid class name */
public class AnonymousClass210 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final AnonymousClass1XN A04;
    public final AnonymousClass1XK A05;
    public final AnonymousClass1XO A06;
    public final File A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public AnonymousClass210(AnonymousClass1XN r4, AnonymousClass1XK r5, AnonymousClass1XO r6, File file, String str, String str2, String str3, String str4, int i2, int i3, long j2, long j3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        boolean z7 = z4;
        if (z4 && (r5 == AnonymousClass1XK.A0B || r5 == AnonymousClass1XK.A0Z || r5 == AnonymousClass1XK.A0G || r5 == AnonymousClass1XK.A0R || r5 == AnonymousClass1XK.A06 || r5 == AnonymousClass1XK.A0L || r5 == AnonymousClass1XK.A07)) {
            AnonymousClass00B.A0D("Image transcoding should have quality settings", r4 != null);
        }
        this.A08 = str;
        this.A07 = file;
        this.A0B = str2;
        this.A09 = str3;
        this.A0A = str4;
        this.A05 = r5;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = j2;
        this.A03 = j3;
        this.A0D = z2;
        this.A0G = z3;
        this.A0C = z7;
        this.A06 = r6;
        this.A04 = r4;
        this.A0E = z5;
        this.A0F = z6;
    }

    public File A00() {
        Uri parse;
        String str = this.A0B;
        if (str == null || (parse = Uri.parse(str)) == null || !parse.isAbsolute()) {
            return null;
        }
        return AnonymousClass1XI.A03(parse);
    }
}
