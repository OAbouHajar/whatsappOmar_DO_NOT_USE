package X;

import android.util.Base64;
import java.io.File;
import java.io.IOException;

/* renamed from: X.1OU  reason: invalid class name */
public class AnonymousClass1OU implements C23541Cj {
    public final C16040sK A00;
    public final AnonymousClass120 A01;
    public final AnonymousClass10K A02;

    public AnonymousClass1OU(C16040sK r1, AnonymousClass120 r2, AnonymousClass10K r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public /* synthetic */ void APJ() {
    }

    public void APK() {
        File A002;
        String A07;
        AnonymousClass10K r5 = this.A02;
        if (r5.A00("user_push_name") == null && r5.A02() && (A07 = this.A00.A07()) != null && !A07.isEmpty()) {
            r5.A01("user_push_name", A07);
        }
        C16040sK r0 = this.A00;
        r0.A0B();
        C28881Zb r4 = r0.A01;
        if (r4 != null && r5.A00("user_profile_photo") == null && r5.A02.A0E(C16620tM.A02, 2413) && (A002 = this.A01.A00(r4)) != null && A002.exists()) {
            try {
                String encodeToString = Base64.encodeToString(AnonymousClass1XI.A0T(A002), 0);
                if (encodeToString != null) {
                    r5.A01("user_profile_photo", encodeToString);
                }
            } catch (IOException unused) {
            }
        }
    }
}
