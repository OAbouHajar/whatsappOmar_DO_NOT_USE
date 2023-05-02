package X;

import android.os.CountDownTimer;
import com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel;

/* renamed from: X.3Ld  reason: invalid class name and case insensitive filesystem */
public class C63693Ld extends CountDownTimer {
    public final /* synthetic */ EncBackupViewModel A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63693Ld(EncBackupViewModel encBackupViewModel, long j2) {
        super(j2, 60000);
        this.A00 = encBackupViewModel;
    }

    public void onFinish() {
        EncBackupViewModel encBackupViewModel = this.A00;
        encBackupViewModel.A00 = null;
        encBackupViewModel.A08.A09(AnonymousClass3K2.A0Z());
        C13680ns.A1P(encBackupViewModel.A04, 1);
    }

    public void onTick(long j2) {
        AnonymousClass027 r3 = this.A00.A08;
        if (r3.A01() == null || C13700nu.A01(r3.A01()) != j2) {
            r3.A09(Long.valueOf(j2));
        }
    }
}
