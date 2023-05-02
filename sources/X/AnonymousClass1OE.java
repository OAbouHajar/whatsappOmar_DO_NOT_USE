package X;

import android.text.TextUtils;
import com.obwhatsapp.backup.google.workers.GoogleEncryptedReUploadWorker;
import java.util.Random;

/* renamed from: X.1OE  reason: invalid class name */
public class AnonymousClass1OE implements C23541Cj {
    public final C16200sd A00;
    public final C15860rz A01;
    public final AnonymousClass12P A02;

    public AnonymousClass1OE(C16200sd r1, C15860rz r2, AnonymousClass12P r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public /* synthetic */ void APJ() {
    }

    public void APK() {
        C15860rz r3 = this.A00.A03;
        if (r3.A1f() && r3.A06() != 0 && r3.A06() != 1) {
            String A0M = r3.A0M();
            if (r3.A1f() && !TextUtils.isEmpty(A0M) && r3.A0F(A0M) == 1) {
                AnonymousClass12P r4 = this.A02;
                Random random = new Random();
                GoogleEncryptedReUploadWorker.A01(AnonymousClass03z.KEEP, this.A01, r4, random, false);
            }
        }
    }
}
