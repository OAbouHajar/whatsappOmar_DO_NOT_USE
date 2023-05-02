package X;

import android.os.Bundle;
import com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.3Eo  reason: invalid class name and case insensitive filesystem */
public class C62693Eo implements AnonymousClass12R {
    public int A00;
    public long A01 = -1;
    public long A02 = -1;
    public final C14870pt A03;
    public final AnonymousClass12Q A04;
    public final SettingsGoogleDriveViewModel A05;
    public final C18260wP A06;
    public final C15860rz A07;

    public C62693Eo(C14870pt r3, AnonymousClass12Q r4, SettingsGoogleDriveViewModel settingsGoogleDriveViewModel, C18260wP r6, C15860rz r7) {
        this.A03 = r3;
        this.A07 = r7;
        this.A06 = r6;
        this.A04 = r4;
        this.A05 = settingsGoogleDriveViewModel;
    }

    public static int A00(int i2, long j2, long j3) {
        if (i2 > 0) {
            return (int) ((j2 * 100) / j3);
        }
        return -1;
    }

    public static void A01(C62693Eo r3) {
        r3.A03((AnonymousClass45p) null, 2, -1);
    }

    public final void A02(AnonymousClass45p r7, int i2, int i3) {
        A04(r7, i2, i3, true, false);
    }

    public final void A03(AnonymousClass45p r7, int i2, int i3) {
        A04(r7, i2, i3, false, false);
    }

    public final void A04(AnonymousClass45p r8, int i2, int i3, boolean z2, boolean z3) {
        AnonymousClass027 r0;
        SettingsGoogleDriveViewModel settingsGoogleDriveViewModel;
        if (i2 != this.A00 && i2 == 4) {
            Log.i("settings-gdrive/set-message/show-indeterminate");
        }
        this.A00 = i2;
        boolean z4 = null;
        if (i2 == 1) {
            Log.i("settings-gdrive/set-message/show-nothing");
            SettingsGoogleDriveViewModel settingsGoogleDriveViewModel2 = this.A05;
            settingsGoogleDriveViewModel2.A07.A09(false);
            settingsGoogleDriveViewModel2.A0L.A09(false);
            settingsGoogleDriveViewModel2.A09.A09(false);
            settingsGoogleDriveViewModel2.A0M.A09(false);
            settingsGoogleDriveViewModel2.A0B.A09(false);
            settingsGoogleDriveViewModel2.A06.A09(false);
            r0 = settingsGoogleDriveViewModel2.A08;
        } else if (i2 != 2) {
            if (i2 != 3) {
                AnonymousClass00B.A06(r8);
                settingsGoogleDriveViewModel = this.A05;
                z4 = false;
                settingsGoogleDriveViewModel.A07.A09(false);
                settingsGoogleDriveViewModel.A0M.A09(false);
                settingsGoogleDriveViewModel.A0L.A09(true);
                settingsGoogleDriveViewModel.A0J.A09(true);
                settingsGoogleDriveViewModel.A09.A09(Boolean.valueOf(z2));
                settingsGoogleDriveViewModel.A06.A09(true);
                StringBuilder A0q = AnonymousClass000.A0q("settings-gdrive/set-message ");
                A0q.append(r8);
                C13680ns.A1V(A0q);
                settingsGoogleDriveViewModel.A08.A09(r8);
            } else {
                AnonymousClass00B.A06(r8);
                Log.i("settings-gdrive/set-message/show-determinate");
                settingsGoogleDriveViewModel = this.A05;
                z4 = false;
                settingsGoogleDriveViewModel.A07.A09(false);
                settingsGoogleDriveViewModel.A0L.A09(true);
                settingsGoogleDriveViewModel.A0J.A09(false);
                settingsGoogleDriveViewModel.A09.A09(Boolean.valueOf(z2));
                settingsGoogleDriveViewModel.A06.A09(true);
                if (i3 >= 0) {
                    C13680ns.A1P(settingsGoogleDriveViewModel.A0K, i3);
                }
                settingsGoogleDriveViewModel.A08.A09(r8);
                settingsGoogleDriveViewModel.A0M.A09(Boolean.valueOf(z3));
            }
            r0 = settingsGoogleDriveViewModel.A0B;
        } else {
            Log.i("settings-gdrive/set-message/show-backup-button");
            SettingsGoogleDriveViewModel settingsGoogleDriveViewModel3 = this.A05;
            settingsGoogleDriveViewModel3.A07.A09(true);
            settingsGoogleDriveViewModel3.A0L.A09(false);
            settingsGoogleDriveViewModel3.A09.A09(false);
            settingsGoogleDriveViewModel3.A0M.A09(false);
            settingsGoogleDriveViewModel3.A0B.A09(true);
            settingsGoogleDriveViewModel3.A06.A09(false);
            settingsGoogleDriveViewModel3.A05.A09(true);
            settingsGoogleDriveViewModel3.A08.A09((Object) null);
            C14870pt.A00(this.A03, settingsGoogleDriveViewModel3, 21);
            if (r8 != null) {
                throw AnonymousClass000.A0T("message should be null when button has to be displayed.");
            }
            return;
        }
        r0.A09(z4);
    }

    public void ALz(boolean z2) {
        Log.e("settings-gdrive-observer/account-deletion-end/unexpected-state");
    }

    public void AND() {
        Log.i("settings-gdrive-observer/backup-cancelled");
        A01(this);
    }

    public void ANE(boolean z2) {
        StringBuilder A0r = AnonymousClass000.A0r("settings-gdrive-observer/backup-end ");
        A0r.append(z2);
        C13680ns.A1V(A0r);
        A01(this);
        if (z2 && this.A05.A0e.get()) {
            this.A04.A03();
        }
    }

    public void ANK(long j2, long j3) {
        Log.i("settings-gdrive-observer/backup-paused/no-data-connection");
        A02(new C71293io(8), 3, A00((j3 > 0 ? 1 : (j3 == 0 ? 0 : -1)), j2, j3));
    }

    public void ANL(long j2, long j3) {
        Log.i("settings-gdrive-observer/backup-paused/low-battery");
        A02(new C71293io(9), 3, A00((j3 > 0 ? 1 : (j3 == 0 ? 0 : -1)), j2, j3));
    }

    public void ANM(long j2, long j3) {
        Log.i("settings-gdrive-observer/backup-paused/sdcard-missing");
        A02(new C71293io(11), 3, A00((j3 > 0 ? 1 : (j3 == 0 ? 0 : -1)), j2, j3));
    }

    public void ANN(long j2, long j3) {
        Log.i("settings-gdrive-observer/backup-paused/sdcard-unmounted");
        A02(new C71293io(10), 3, A00((j3 > 0 ? 1 : (j3 == 0 ? 0 : -1)), j2, j3));
    }

    public void ANO(long j2, long j3) {
        Log.i("settings-gdrive-observer/backup-paused/no-wifi");
        int A002 = A00((j3 > 0 ? 1 : (j3 == 0 ? 0 : -1)), j2, j3);
        int i2 = 7;
        if (this.A06.A04(true) == 2) {
            i2 = 6;
        }
        A02(new C71293io(i2), 3, A002);
    }

    public void ANP(int i2) {
        if (i2 >= 0) {
            AnonymousClass00B.A00();
            A02(new C71253ik(i2), 4, i2);
        }
    }

    public void ANQ() {
        Log.i("settings-gdrive-observer/backup-prep-start");
        A02(new C71293io(5), 4, -1);
    }

    public void ANR(long j2, long j3) {
        if (j3 <= 0) {
            StringBuilder A0r = AnonymousClass000.A0r("settings-gdrive-observer/backup-progress incorrect invocation: ");
            A0r.append(j2);
            A0r.append("/");
            Log.e(C13680ns.A0j(A0r, j3));
            return;
        }
        long j4 = this.A02;
        int i2 = (int) ((100 * j2) / j3);
        if (((int) ((j4 * 100) / j3)) != i2 || j2 != j4) {
            this.A02 = j2;
            A02(new C71273im(j2, j3), 3, i2);
        }
    }

    public void ANS() {
        Log.i("settings-gdrive-observer/backup-start");
        this.A02 = -1;
        ANP(0);
    }

    public void AQL() {
        C15860rz r1 = this.A07;
        if (r1.A0F(r1.A0M()) == 2) {
            C14870pt.A00(this.A03, this.A05, 21);
        }
    }

    public void AQh(int i2, Bundle bundle) {
        if (i2 != 10) {
            A01(this);
        }
        C13680ns.A1P(this.A05.A0D, i2);
    }

    public void AQi(int i2, Bundle bundle) {
        if (i2 != 10) {
            A03((AnonymousClass45p) null, 1, -1);
        }
        this.A05.A0E.A09(new AnonymousClass2YJ(i2, bundle));
    }

    public void AQj(int i2, Bundle bundle) {
        Log.e("settings-gdrive-observer/msgstore-download-error/unexpected-state");
    }

    public void ATQ() {
        Log.i("settings-gdrive-observer/restore-cancelled");
        this.A05.A08(false);
        A01(this);
        this.A01 = -1;
        this.A02 = -1;
    }

    public void ATR(long j2, boolean z2) {
        StringBuilder A0r = AnonymousClass000.A0r("settings-gdrive-observer/restore-end ");
        A0r.append(z2);
        C13680ns.A1V(A0r);
        A01(this);
        this.A01 = -1;
        this.A02 = -1;
        if (z2 && this.A05.A0e.get()) {
            this.A04.A03();
        }
    }

    public void ATS(long j2, long j3) {
        Log.i("settings-gdrive-observer/restore-paused/no-data-connection");
        A03(new C71293io(1), 3, A00((j3 > 0 ? 1 : (j3 == 0 ? 0 : -1)), j2, j3));
    }

    public void ATT(long j2, long j3) {
        Log.i("settings-gdrive-observer/restore-paused/low-battery");
        int A002 = A00((j3 > 0 ? 1 : (j3 == 0 ? 0 : -1)), j2, j3);
        this.A05.A0d.set(true);
        A04(new C71293io(2), 3, A002, false, true);
    }

    public void ATU(long j2, long j3) {
        Log.i("settings-gdrive-observer/restore-paused/sdcard-missing");
        A03(new C71293io(4), 3, A00((j3 > 0 ? 1 : (j3 == 0 ? 0 : -1)), j2, j3));
    }

    public void ATV(long j2, long j3) {
        Log.i("settings-gdrive-observer/restore-paused/sdcard-unmounted");
        A03(new C71293io(3), 3, A00((j3 > 0 ? 1 : (j3 == 0 ? 0 : -1)), j2, j3));
    }

    public void ATW(long j2, long j3) {
        Log.i("settings-gdrive-observer/restore-paused/no-wifi");
        int A002 = A00((j3 > 0 ? 1 : (j3 == 0 ? 0 : -1)), j2, j3);
        this.A05.A0d.set(false);
        if (this.A06.A04(true) == 2) {
            Log.i("settings-gdrive-observer/restore-paused/cellular-available");
            A04(new C71293io(0), 3, A002, false, true);
            return;
        }
        A03(new C71293io(0), 3, A002);
    }

    public void ATX(int i2) {
        if (i2 >= 0) {
            A03(new C71263il(i2), 4, i2);
        }
    }

    public void ATY() {
        Log.i("settings-gdrive-observer/restore-start");
        A03(new C71293io(13), 4, -1);
    }

    public void ATZ(long j2, long j3) {
        if (j2 != this.A01) {
            this.A01 = j2;
            A03(new C71283in(j2, j3), 3, (int) ((j2 * 100) / j3));
        }
    }

    public void ATi(boolean z2) {
        Log.e("settings-gdrive-observer/msgstore-download-end/unexpected-state");
    }

    public void ATj(long j2, long j3) {
        Log.e("settings-gdrive-observer/msgstore-download-progress/unexpected-state");
        StringBuilder A0r = AnonymousClass000.A0r("settings-gdrive-observer/msgstore-download-progress/downloaded: ");
        A0r.append(j2);
        A0r.append(" total: ");
        A0r.append(j3);
        C13680ns.A1V(A0r);
    }

    public void ATk() {
        Log.e("settings-gdrive-observer/msgstore-download-start/unexpected-state");
    }

    public void AWm() {
        Log.i("settings-gdrive-observer/post-backup-scrub-start");
        A02(new C71293io(12), 4, -1);
    }

    public void AZP() {
        C14870pt.A00(this.A03, this.A05, 21);
    }
}
