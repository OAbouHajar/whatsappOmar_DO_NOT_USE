package X;

import com.obwhatsapp.R;
import java.io.File;

/* renamed from: X.36I  reason: invalid class name */
public class AnonymousClass36I extends C16690tT {
    public final int A00;
    public final C82564Dh A01;
    public final File A02;
    public final boolean A03;
    public final byte[] A04;

    public AnonymousClass36I(C001300o r2, C82564Dh r3, File file, byte[] bArr, int i2, boolean z2) {
        super(r2, true);
        this.A01 = r3;
        this.A04 = bArr;
        this.A00 = i2;
        this.A03 = z2;
        this.A02 = file;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x001e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r5) {
        /*
            r4 = this;
            r3 = 0
            java.io.File r2 = r4.A02     // Catch:{ FileNotFoundException -> 0x0027, IOException -> 0x001f }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0027, IOException -> 0x001f }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0027, IOException -> 0x001f }
            byte[] r0 = r4.A04     // Catch:{ all -> 0x001a }
            r1.write(r0)     // Catch:{ all -> 0x001a }
            r1.close()     // Catch:{ FileNotFoundException -> 0x0027, IOException -> 0x001f }
            boolean r1 = r4.A03
            int r0 = r4.A00
            X.4KK r3 = new X.4KK
            r3.<init>(r2, r0, r1)
            return r3
        L_0x001a:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x001e }
        L_0x001e:
            throw r0     // Catch:{ FileNotFoundException -> 0x0027, IOException -> 0x001f }
        L_0x001f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "cameraui/ Error accessing file: "
            goto L_0x002e
        L_0x0027:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "cameraui/ File not found: "
        L_0x002e:
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.e(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36I.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass4KK r8 = (AnonymousClass4KK) obj;
        C29251aI r6 = this.A01.A00;
        if (r6.A0A != null) {
            C13690nt.A1I(r6.A03(), R.id.save_progress);
            if (r8 == null) {
                r6.A0d.A09(R.string.str0388, 1);
                r6.A0z.ANy();
                return;
            }
            r6.A0Q(new C54992ib(r6.A0m.A00.getContentResolver(), r8.A01, r8.A00, r8.A02), (C54502hd) null, true);
        }
    }
}
