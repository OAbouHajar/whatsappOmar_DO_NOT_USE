package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1XR  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1XR implements AnonymousClass1WE {
    public final /* synthetic */ AnonymousClass1RO A00;
    public final /* synthetic */ AnonymousClass1XG A01;
    public final /* synthetic */ AnonymousClass1XP A02;
    public final /* synthetic */ File A03;

    public /* synthetic */ AnonymousClass1XR(AnonymousClass1RO r1, AnonymousClass1XG r2, AnonymousClass1XP r3, File file) {
        this.A00 = r1;
        this.A03 = file;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void accept(Object obj) {
        String str;
        File file = this.A03;
        AnonymousClass1XP r3 = this.A02;
        AnonymousClass1XG r4 = this.A01;
        Number number = (Number) obj;
        StringBuilder sb = new StringBuilder("external-mutations-uploader: media-job-finished for upload, mediaJobResult: ");
        sb.append(number);
        Log.i(sb.toString());
        long length = file.length();
        file.delete();
        r3.A02();
        int intValue = number.intValue();
        if (intValue == 0) {
            AnonymousClass21B r0 = (AnonymousClass21B) r3.A0H.A00();
            if (r0 != null) {
                C31761ez r32 = r0.A02;
                synchronized (r32) {
                    str = r32.A07;
                }
                String A032 = r32.A03();
                String A05 = r32.A05();
                String A04 = r32.A04();
                AnonymousClass1XM A002 = r32.A00();
                if (A002 == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(A032) || TextUtils.isEmpty(A05) || TextUtils.isEmpty(A04)) {
                    StringBuilder sb2 = new StringBuilder("create-external-blob-reference response is missing field/s; handle = ");
                    sb2.append(str);
                    sb2.append("; directPath = ");
                    sb2.append(A032);
                    sb2.append("; mediaHash = ");
                    sb2.append(A05);
                    sb2.append("; mediaEncHash = ");
                    sb2.append(A04);
                    sb2.append("; mediaKey = ");
                    sb2.append(A002);
                    Log.e(sb2.toString());
                } else {
                    C28581Wr A0U = AnonymousClass1XB.A07.A0U();
                    byte[] bArr = A002.A01;
                    C28631Ww A012 = C28631Ww.A01(bArr, 0, bArr.length);
                    A0U.A03();
                    AnonymousClass1XB r33 = (AnonymousClass1XB) A0U.A00;
                    r33.A00 |= 1;
                    r33.A04 = A012;
                    A0U.A03();
                    AnonymousClass1XB r34 = (AnonymousClass1XB) A0U.A00;
                    r34.A00 |= 2;
                    r34.A05 = A032;
                    A0U.A03();
                    AnonymousClass1XB r35 = (AnonymousClass1XB) A0U.A00;
                    r35.A00 |= 4;
                    r35.A06 = str;
                    A0U.A03();
                    AnonymousClass1XB r36 = (AnonymousClass1XB) A0U.A00;
                    r36.A00 |= 8;
                    r36.A01 = length;
                    byte[] decode = Base64.decode(A05, 0);
                    C28631Ww A013 = C28631Ww.A01(decode, 0, decode.length);
                    A0U.A03();
                    AnonymousClass1XB r1 = (AnonymousClass1XB) A0U.A00;
                    r1.A00 |= 16;
                    r1.A03 = A013;
                    byte[] decode2 = Base64.decode(A04, 0);
                    C28631Ww A014 = C28631Ww.A01(decode2, 0, decode2.length);
                    A0U.A03();
                    AnonymousClass1XB r12 = (AnonymousClass1XB) A0U.A00;
                    r12.A00 |= 32;
                    r12.A02 = A014;
                    AnonymousClass1XB r37 = (AnonymousClass1XB) A0U.A02();
                    if (r37 != null) {
                        StringBuilder sb3 = new StringBuilder("external-mutations-uploader: media-job-finished for upload with response = ");
                        sb3.append(r37);
                        Log.i(sb3.toString());
                        C28461We r2 = r4.A02;
                        r2.A01 = r37;
                        r2.A03 = null;
                        r4.A00.A02(r2.A00());
                        return;
                    }
                }
            }
            Log.i("external-mutations-uploader: media-job-finished for upload but response has missing fields");
        } else if (C87644Xx.A01(intValue)) {
            boolean z2 = false;
            if (intValue == 8) {
                z2 = true;
            }
            r4.A00.A03(new AnonymousClass259("prepare-syncd-mutations-helper/startPrepareJob/onTransientFailure: Upload error", z2));
            return;
        }
        r4.A00.A03(new AnonymousClass1XT("prepare-syncd-mutations-helper/startPrepareJob/onFailed: Upload error", (Exception) null));
    }
}
