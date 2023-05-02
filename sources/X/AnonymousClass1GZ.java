package X;

import com.whatsapp.util.Log;

/* renamed from: X.1GZ  reason: invalid class name */
public class AnonymousClass1GZ {
    public final C16980tz A00;
    public final C14710pd A01;
    public final C19950zG A02;
    public final C213013o A03;
    public final C17670vS A04;

    public AnonymousClass1GZ(C16980tz r1, C14710pd r2, C19950zG r3, C213013o r4, C17670vS r5) {
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final C37801pl A00(C19950zG r7, String str) {
        C37801pl A7K = ((AnonymousClass16H) r7).A7K(this.A04, str, (String) null, (String) null, (String) null);
        if (A7K.A6O() >= 400) {
            StringBuilder sb = new StringBuilder("WallpaperDownloader/download/Error, code=");
            sb.append(A7K.A6O());
            Log.e(sb.toString());
            return null;
        }
        A7K.A6O();
        return A7K;
    }
}
