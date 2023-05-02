package X;

import android.os.Bundle;
import com.facebook.redex.RunnableRunnableShape0S0101200_I0;
import com.facebook.redex.RunnableRunnableShape0S0110000_I0;
import com.facebook.redex.RunnableRunnableShape0S0201000_I0;
import com.facebook.redex.RunnableRunnableShape3S0100000_I0_2;
import com.facebook.redex.RunnableRunnableShape5S0200000_I0_3;
import com.obwhatsapp.R;
import com.obwhatsapp.backup.google.RestoreFromBackupActivity;
import com.obwhatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;

/* renamed from: X.2Hv  reason: invalid class name and case insensitive filesystem */
public abstract class C47162Hv implements AnonymousClass12R {
    public void ALz(boolean z2) {
        if (this instanceof C47152Hu) {
            C47152Hu r2 = (C47152Hu) this;
            StringBuilder sb = new StringBuilder("deleteacctconfirm/gdrive-observer/deletion-finished/");
            sb.append(z2 ? "success" : "failed");
            Log.i(sb.toString());
            r2.A00.open();
        }
    }

    public void AND() {
    }

    public void ANE(boolean z2) {
    }

    public void ANK(long j2, long j3) {
    }

    public void ANL(long j2, long j3) {
    }

    public void ANM(long j2, long j3) {
    }

    public void ANN(long j2, long j3) {
    }

    public void ANO(long j2, long j3) {
    }

    public void ANP(int i2) {
    }

    public void ANQ() {
    }

    public void ANR(long j2, long j3) {
    }

    public void ANS() {
    }

    public void AQL() {
    }

    public void AQh(int i2, Bundle bundle) {
    }

    public void AQi(int i2, Bundle bundle) {
        if (this instanceof AnonymousClass2JE) {
            AnonymousClass2JE r3 = (AnonymousClass2JE) this;
            ConversationsFragment conversationsFragment = r3.A04;
            if (conversationsFragment.A0c()) {
                r3.A01 = 2;
                if (i2 != 10) {
                    StringBuilder sb = new StringBuilder("conversations-gdrive-observer/error-during-restore/");
                    sb.append(AnonymousClass2GK.A04(i2));
                    Log.i(sb.toString());
                    r3.A00(conversationsFragment.A0J(R.string.str097d), conversationsFragment.A0J(R.string.str0958), 1, 0, false);
                    conversationsFragment.A0X.A03();
                }
            }
        }
    }

    public void AQj(int i2, Bundle bundle) {
        if (this instanceof C55312jJ) {
            C55312jJ r3 = (C55312jJ) this;
            if (i2 != 10) {
                StringBuilder sb = new StringBuilder("restore>RestoreFromBackupActivity/observer/error during msgstore download: ");
                sb.append(AnonymousClass2GK.A04(i2));
                Log.i(sb.toString());
            }
            r3.A01.A05.A0K(new RunnableRunnableShape0S0201000_I0((Object) r3, i2, (Object) bundle, 9));
        }
    }

    public void ATQ() {
        C001000l A0C;
        if (this instanceof AnonymousClass2JE) {
            AnonymousClass2JE r4 = (AnonymousClass2JE) this;
            Log.i("conversations-gdrive-observer/restore-cancelled");
            ConversationsFragment conversationsFragment = r4.A04;
            if (conversationsFragment.A0c() && (A0C = conversationsFragment.A0C()) != null && !A0C.isFinishing()) {
                conversationsFragment.A0O.A0K(new RunnableRunnableShape5S0200000_I0_3(r4, 42, A0C));
            }
        }
    }

    public void ATR(long j2, boolean z2) {
        C001000l A0C;
        if (this instanceof AnonymousClass2JE) {
            AnonymousClass2JE r6 = (AnonymousClass2JE) this;
            StringBuilder sb = new StringBuilder("conversations-gdrive-observer/restore-end ");
            sb.append(z2);
            Log.i(sb.toString());
            ConversationsFragment conversationsFragment = r6.A04;
            if (conversationsFragment.A0c() && (A0C = conversationsFragment.A0C()) != null) {
                r6.A01 = 8;
                r6.A02 = -1;
                String string = A0C.getString(R.string.str0977, new Object[]{AnonymousClass2GQ.A03(conversationsFragment.A1K, j2)});
                if (j2 > 0) {
                    r6.A00(A0C.getString(R.string.str097e), string, 3, 100, false);
                } else if (j2 == 0) {
                    Log.i("conversations-gdrive-observer/restore-end/nothing-to-restore");
                    if (!A0C.isFinishing()) {
                        conversationsFragment.A0O.A0K(new RunnableRunnableShape5S0200000_I0_3(r6, 43, A0C));
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("conversations-gdrive-observer/restore-end restored: ");
                    sb2.append(j2);
                    sb2.append(" result: ");
                    sb2.append(z2);
                    Log.e(sb2.toString());
                }
            }
        }
    }

    public void ATS(long j2, long j3) {
        if (this instanceof AnonymousClass2JE) {
            AnonymousClass2JE r4 = (AnonymousClass2JE) this;
            Log.i("conversations-gdrive-observer/restore-paused/no-data-connection");
            ConversationsFragment conversationsFragment = r4.A04;
            if (conversationsFragment.A0c()) {
                r4.A01 = 4;
                r4.A00(conversationsFragment.A0J(R.string.str097f), conversationsFragment.A0J(R.string.str097a), 3, j3 > 0 ? (int) ((j2 * 100) / j3) : -1, false);
            }
        }
    }

    public void ATT(long j2, long j3) {
        if (this instanceof AnonymousClass2JE) {
            AnonymousClass2JE r4 = (AnonymousClass2JE) this;
            Log.i("conversations-gdrive-observer/restore-paused/low-battery");
            ConversationsFragment conversationsFragment = r4.A04;
            if (conversationsFragment.A0c()) {
                r4.A01 = 5;
                r4.A00(conversationsFragment.A0J(R.string.str097f), conversationsFragment.A0J(R.string.str0979), 3, j3 > 0 ? (int) ((j2 * 100) / j3) : -1, false);
            }
        }
    }

    public void ATU(long j2, long j3) {
        if (this instanceof AnonymousClass2JE) {
            AnonymousClass2JE r5 = (AnonymousClass2JE) this;
            Log.i("conversations-gdrive-observer/restore-paused/sdcard-missing");
            ConversationsFragment conversationsFragment = r5.A04;
            if (conversationsFragment.A0c()) {
                r5.A01 = 7;
                r5.A00(conversationsFragment.A0J(R.string.str097f), conversationsFragment.A0J(R.string.str09a2), 4, j3 > 0 ? (int) ((j2 * 100) / j3) : -1, false);
            }
        }
    }

    public void ATV(long j2, long j3) {
        if (this instanceof AnonymousClass2JE) {
            AnonymousClass2JE r4 = (AnonymousClass2JE) this;
            Log.i("conversations-gdrive-observer/restore-paused/sdcard-unmounted");
            ConversationsFragment conversationsFragment = r4.A04;
            if (conversationsFragment.A0c()) {
                r4.A01 = 6;
                r4.A00(conversationsFragment.A0J(R.string.str097f), conversationsFragment.A0J(R.string.str0d8d), 3, j3 > 0 ? (int) ((j2 * 100) / j3) : -1, false);
            }
        }
    }

    public void ATW(long j2, long j3) {
        if (this instanceof AnonymousClass2JE) {
            AnonymousClass2JE r4 = (AnonymousClass2JE) this;
            Log.i("conversations-gdrive-observer/restore-paused/no-wifi");
            ConversationsFragment conversationsFragment = r4.A04;
            if (conversationsFragment.A0c()) {
                r4.A01 = 3;
                r4.A00(conversationsFragment.A0J(R.string.str097f), conversationsFragment.A0J(R.string.str097b), 3, j3 > 0 ? (int) ((j2 * 100) / j3) : -1, false);
            }
        }
    }

    public void ATX(int i2) {
        if (this instanceof AnonymousClass2JE) {
            AnonymousClass2JE r9 = (AnonymousClass2JE) this;
            ConversationsFragment conversationsFragment = r9.A04;
            if (conversationsFragment.A0c()) {
                int i3 = i2;
                if (i2 > 0) {
                    r9.A01 = 10;
                    r9.A00(conversationsFragment.A0J(R.string.str1cda), conversationsFragment.A0K(R.string.str097c, conversationsFragment.A1K.A0L().format(((double) i3) / 100.0d)), 4, i3, true);
                }
            }
        }
    }

    public void ATY() {
        if (this instanceof AnonymousClass2JE) {
            AnonymousClass2JE r2 = (AnonymousClass2JE) this;
            Log.i("conversations-gdrive-observer/restore-start");
            ConversationsFragment conversationsFragment = r2.A04;
            if (conversationsFragment.A0c()) {
                r2.A01 = 9;
                r2.A00(conversationsFragment.A0J(R.string.str1cda), conversationsFragment.A0J(R.string.str1cd9), 4, -1, true);
            }
        }
    }

    public void ATZ(long j2, long j3) {
        long j4 = j2;
        if (this instanceof AnonymousClass2JE) {
            AnonymousClass2JE r13 = (AnonymousClass2JE) this;
            ConversationsFragment conversationsFragment = r13.A04;
            if (conversationsFragment.A0c() && conversationsFragment.A0C() != null) {
                String A03 = AnonymousClass2GQ.A03(conversationsFragment.A1K, j4);
                if (r13.A01 != 1 || !A03.equals(AnonymousClass2GQ.A03(conversationsFragment.A1K, r13.A02))) {
                    r13.A02 = j4;
                    long j5 = j3;
                    r13.A00(conversationsFragment.A0J(R.string.str1cda), conversationsFragment.A0K(R.string.str0978, A03, AnonymousClass2GQ.A03(conversationsFragment.A1K, j5), conversationsFragment.A1K.A0L().format(((double) j4) / ((double) j5))), 3, (int) ((j2 * 100) / j3), true);
                    r13.A01 = 1;
                }
            }
        }
    }

    public void ATi(boolean z2) {
        if (this instanceof C55312jJ) {
            C55312jJ r4 = (C55312jJ) this;
            RestoreFromBackupActivity restoreFromBackupActivity = r4.A01;
            int A08 = restoreFromBackupActivity.A09.A08();
            if (z2) {
                Log.i("restore>RestoreFromBackupActivity/observer/msgstore download successful");
            } else {
                StringBuilder sb = new StringBuilder("restore>RestoreFromBackupActivity/observer/msgstore download failed with ");
                sb.append(AnonymousClass2GK.A04(A08));
                Log.e(sb.toString());
            }
            if (A08 == 10) {
                restoreFromBackupActivity.A05.A0K(new RunnableRunnableShape0S0110000_I0(r4, 5, z2));
            }
        }
    }

    public void ATj(long j2, long j3) {
        if (this instanceof C55312jJ) {
            C55312jJ r2 = (C55312jJ) this;
            long j4 = j2;
            long j5 = j3;
            int i2 = (int) ((100 * j2) / j3);
            if (i2 - r2.A00 > 0) {
                r2.A00 = i2;
                if (i2 % 10 == 0) {
                    StringBuilder sb = new StringBuilder("restore>RestoreFromBackupActivity/observer/msgstore download progress:");
                    sb.append(j2);
                    sb.append("/");
                    sb.append(j3);
                    sb.append(" ");
                    sb.append(i2);
                    sb.append("%");
                    Log.i(sb.toString());
                }
                r2.A01.A05.A0K(new RunnableRunnableShape0S0101200_I0(r2, i2, 0, j4, j5));
            }
        }
    }

    public void ATk() {
        if (this instanceof C55312jJ) {
            C55312jJ r3 = (C55312jJ) this;
            r3.A01.A05.A0K(new RunnableRunnableShape3S0100000_I0_2(r3, 26));
        }
    }

    public void AWm() {
    }

    public void AZP() {
    }
}
