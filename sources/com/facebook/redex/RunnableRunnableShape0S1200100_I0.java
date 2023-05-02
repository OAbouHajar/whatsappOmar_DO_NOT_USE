package com.facebook.redex;

import X.AnonymousClass027;
import X.AnonymousClass2RR;
import X.C24511Gf;
import X.C27141Qp;
import X.C34121jj;
import X.C50102Xy;
import X.C55062ik;
import android.app.Activity;
import android.util.Pair;
import com.obwhatsapp.backup.google.RestoreFromBackupActivity;
import com.obwhatsapp.backup.google.viewmodel.RestoreFromBackupViewModel;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Set;

public class RunnableRunnableShape0S1200100_I0 implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public RunnableRunnableShape0S1200100_I0(Object obj, Object obj2, String str, int i2, long j2) {
        this.A04 = i2;
        this.A01 = obj;
        this.A03 = str;
        this.A00 = j2;
        this.A02 = obj2;
    }

    public final void run() {
        switch (this.A04) {
            case 0:
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A01;
                String str = this.A03;
                long j2 = this.A00;
                C55062ik r6 = (C55062ik) this.A02;
                restoreFromBackupActivity.A0m.block();
                restoreFromBackupActivity.A3O((C34121jj) null, 24);
                restoreFromBackupActivity.A09.A0s(str);
                if (j2 > 0) {
                    restoreFromBackupActivity.A09.A12(str, j2);
                }
                Set A022 = r6.A02();
                if (!A022.isEmpty()) {
                    Log.i("restore>RestoreFromBackupActivity/create-media-placeholders/before message restore");
                    RestoreFromBackupViewModel restoreFromBackupViewModel = restoreFromBackupActivity.A0L;
                    if (!A022.isEmpty()) {
                        restoreFromBackupViewModel.A08.Acl(new RunnableRunnableShape3S0200000_I0_1(restoreFromBackupViewModel, 8, A022));
                    }
                }
                restoreFromBackupActivity.A3I();
                return;
            case 1:
                AnonymousClass2RR r5 = (AnonymousClass2RR) this.A01;
                Jid jid = (Jid) this.A02;
                String str2 = this.A03;
                long j3 = this.A00;
                try {
                    C24511Gf r1 = r5.A0C;
                    C50102Xy A032 = r1.A03(jid, str2);
                    if (A032 != null) {
                        A032.A00 = j3;
                        r1.A05(A032, jid);
                        C50102Xy A033 = r1.A03(jid, str2);
                        if (A033 != null) {
                            AnonymousClass027 r3 = r5.A09;
                            if (r3 != null) {
                                r3.A09(new Pair(str2, Integer.valueOf((int) A033.A00)));
                                return;
                            }
                            return;
                        }
                    }
                    AnonymousClass027 r12 = r5.A05;
                    if (r12 != null) {
                        r12.A09(Boolean.TRUE);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    AnonymousClass027 r13 = r5.A05;
                    if (r13 != null) {
                        r13.A09(Boolean.TRUE);
                        return;
                    }
                    return;
                }
            default:
                ((C27141Qp) this.A01).A06((Activity) this.A02, this.A03, this.A00);
                return;
        }
    }
}
