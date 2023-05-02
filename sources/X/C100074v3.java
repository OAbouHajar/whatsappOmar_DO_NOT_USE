package X;

import com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.4v3  reason: invalid class name and case insensitive filesystem */
public class C100074v3 implements C29761b9 {
    public final /* synthetic */ EncBackupViewModel A00;

    public C100074v3(EncBackupViewModel encBackupViewModel) {
        this.A00 = encBackupViewModel;
    }

    public void AQc(String str, int i2, int i3, int i4, int i5) {
        String str2;
        AnonymousClass027 r3;
        int i6;
        int i7;
        EncBackupViewModel encBackupViewModel = this.A00;
        if (i2 == 0) {
            Log.i("EncBackupViewModel/successfully retrieved and saved backup key");
            C13680ns.A1P(encBackupViewModel.A04, 3);
            r3 = encBackupViewModel.A07;
            i7 = -1;
        } else if (i2 == 404) {
            Log.i("EncBackupViewModel/account not found");
            r3 = encBackupViewModel.A04;
            i7 = 7;
        } else if (i2 == 8) {
            Log.i("EncBackupViewModel/invalid password");
            C13680ns.A1P(encBackupViewModel.A06, i4);
            if (i5 > 0) {
                long j2 = ((long) i5) * 1000;
                encBackupViewModel.A0B(4);
                encBackupViewModel.A08.A09(Long.valueOf(j2));
                C63693Ld r0 = new C63693Ld(encBackupViewModel, j2);
                encBackupViewModel.A00 = r0;
                r0.start();
            }
            r3 = encBackupViewModel.A04;
            i7 = 5;
        } else {
            if (i2 == 408) {
                Log.i("EncBackupViewModel/request timeout");
                if (i5 > 0) {
                    long j3 = ((long) i5) * 1000;
                    encBackupViewModel.A0B(4);
                    encBackupViewModel.A08.A09(Long.valueOf(j3));
                    C63693Ld r02 = new C63693Ld(encBackupViewModel, j3);
                    encBackupViewModel.A00 = r02;
                    r02.start();
                    r3 = encBackupViewModel.A04;
                    i7 = 6;
                } else {
                    str2 = "EncBackupViewModel/request timeout returned from server without timeout value";
                }
            } else if (i2 == 3) {
                Log.e("EncBackupViewModel/failed to retrieve and save backup key due to a connection error");
                r3 = encBackupViewModel.A04;
                i6 = 8;
                r3.A09(i6);
            } else {
                str2 = "EncBackupViewModel/failed to retrieve and save backup key due to a server error";
            }
            Log.e(str2);
            r3 = encBackupViewModel.A04;
            i6 = 4;
            r3.A09(i6);
        }
        i6 = Integer.valueOf(i7);
        r3.A09(i6);
    }

    public void onSuccess() {
        EncBackupViewModel encBackupViewModel = this.A00;
        Log.i("EncBackupViewModel/successfully retrieved and saved backup key");
        C13680ns.A1P(encBackupViewModel.A04, 3);
        C13680ns.A1P(encBackupViewModel.A07, -1);
    }
}
