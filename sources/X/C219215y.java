package X;

import com.facebook.redex.IDxNConsumerShape39S0200000_2_I0;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.15y  reason: invalid class name and case insensitive filesystem */
public class C219215y {
    public final C15900s5 A00;
    public final C17130ua A01;
    public final AnonymousClass12A A02;
    public final C16980tz A03;
    public final C14730pf A04;
    public final C14710pd A05;
    public final C20330zs A06;
    public final C219115x A07;
    public final C19040xf A08;
    public final C16320sq A09;
    public final HashMap A0A = new HashMap();

    public C219215y(C15900s5 r2, C17130ua r3, AnonymousClass12A r4, C16980tz r5, C14730pf r6, C14710pd r7, C20330zs r8, C219115x r9, C19040xf r10, C16320sq r11) {
        this.A05 = r7;
        this.A03 = r5;
        this.A09 = r11;
        this.A01 = r3;
        this.A00 = r2;
        this.A04 = r6;
        this.A08 = r10;
        this.A02 = r4;
        this.A07 = r9;
        this.A06 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        if (r3 != null) goto L_0x0005;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A00(android.content.Context r2, java.lang.String r3, java.net.URL r4) {
        /*
            if (r4 != 0) goto L_0x0005
            r0 = 0
            if (r3 == 0) goto L_0x0006
        L_0x0005:
            r0 = 1
        L_0x0006:
            X.AnonymousClass00B.A0G(r0)
            if (r4 == 0) goto L_0x0028
            java.lang.String r1 = r4.toString()
        L_0x000f:
            r0 = 0
            java.lang.String r3 = android.webkit.URLUtil.guessFileName(r1, r0, r0)
            java.io.File r2 = r2.getCacheDir()
            java.lang.String r0 = "ProfilePictureTemp"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            r1.mkdirs()
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r3)
            return r0
        L_0x0028:
            java.lang.String r1 = "https://pps.whatsapp.net"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C219215y.A00(android.content.Context, java.lang.String, java.net.URL):java.io.File");
    }

    public void A01(AnonymousClass277 r19, long j2) {
        AnonymousClass277 r11 = r19;
        C15830rv r8 = r11.A03;
        int i2 = r11.A02;
        Locale locale = Locale.US;
        Integer valueOf = Integer.valueOf(i2);
        String format = String.format(locale, "%s.%d", new Object[]{r8.getRawString(), valueOf});
        HashMap hashMap = this.A0A;
        synchronized (hashMap) {
            AnonymousClass278 r4 = (AnonymousClass278) hashMap.get(format);
            if (r4 != null) {
                if (!r4.A03.A04.equals(r11.A04)) {
                    r4.A03();
                    hashMap.remove(format);
                }
            }
            String format2 = String.format(Locale.US, "%s.%d", new Object[]{r8.getRawString(), valueOf});
            IDxNConsumerShape39S0200000_2_I0 iDxNConsumerShape39S0200000_2_I0 = new IDxNConsumerShape39S0200000_2_I0(r11, 9, this);
            C14710pd r9 = this.A05;
            C16980tz r7 = this.A03;
            C17130ua r5 = this.A01;
            C15900s5 r42 = this.A00;
            C14730pf r82 = this.A04;
            C19040xf r13 = this.A08;
            AnonymousClass278 r3 = new AnonymousClass278(r42, r5, this.A02, r7, r82, r9, this.A06, r11, this.A07, r13, iDxNConsumerShape39S0200000_2_I0, format2, j2);
            hashMap.put(format2, r3);
            this.A09.Acl(r3);
        }
    }
}
