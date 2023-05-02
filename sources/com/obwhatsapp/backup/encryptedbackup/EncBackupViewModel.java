package com.obwhatsapp.backup.encryptedbackup;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass027;
import X.AnonymousClass1ZW;
import X.C003401n;
import X.C100084v4;
import X.C15860rz;
import X.C16200sd;
import X.C16320sq;
import X.C16490t9;
import X.C17190ug;
import X.C19000xb;
import X.C19760yx;
import X.C29801bE;
import X.C29821bG;
import X.C74313qL;
import X.C74663qu;
import android.os.Bundle;
import android.os.CountDownTimer;
import com.facebook.redex.RunnableRunnableShape0S1100000_I0;
import com.facebook.redex.RunnableRunnableShape0S1310000_I0;
import com.facebook.redex.RunnableRunnableShape2S0100000_I0_1;
import com.obwhatsapp.jobqueue.job.DeleteAccountFromHsmServerJob;
import com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.LinkedList;
import org.whispersystems.jobqueue.JobParameters;

public class EncBackupViewModel extends C003401n {
    public CountDownTimer A00;
    public final AnonymousClass027 A01;
    public final AnonymousClass027 A02 = new AnonymousClass027();
    public final AnonymousClass027 A03 = new AnonymousClass027();
    public final AnonymousClass027 A04 = new AnonymousClass027(1);
    public final AnonymousClass027 A05 = new AnonymousClass027();
    public final AnonymousClass027 A06 = new AnonymousClass027(0);
    public final AnonymousClass027 A07 = new AnonymousClass027();
    public final AnonymousClass027 A08 = new AnonymousClass027(0L);
    public final AnonymousClass027 A09 = new AnonymousClass027();
    public final AnonymousClass027 A0A;
    public final C16200sd A0B;
    public final AnonymousClass01V A0C;
    public final C15860rz A0D;
    public final AnonymousClass013 A0E;
    public final C16490t9 A0F;
    public final C17190ug A0G;
    public final C19760yx A0H;
    public final C16320sq A0I;

    public EncBackupViewModel(C16200sd r3, AnonymousClass01V r4, C15860rz r5, AnonymousClass013 r6, C16490t9 r7, C17190ug r8, C19760yx r9, C16320sq r10) {
        Boolean bool = Boolean.FALSE;
        this.A0A = new AnonymousClass027(bool);
        this.A01 = new AnonymousClass027(bool);
        this.A0I = r10;
        this.A0F = r7;
        this.A0G = r8;
        this.A0C = r4;
        this.A0E = r6;
        this.A0B = r3;
        this.A0H = r9;
        this.A0D = r5;
    }

    public static /* synthetic */ void A01(EncBackupViewModel encBackupViewModel, int i2) {
        AnonymousClass027 r1;
        int i3;
        if (i2 == 0) {
            encBackupViewModel.A04.A09(3);
            if (encBackupViewModel.A05() == 1) {
                Log.i("EncBackupViewModel/enabled encrypted backup");
                encBackupViewModel.A09(5);
                r1 = encBackupViewModel.A07;
                i3 = -1;
            } else {
                Log.i("EncBackupViewModel/successfully re-registered with the hsm");
                r1 = encBackupViewModel.A03;
                i3 = 502;
            }
        } else if (i2 == 3) {
            Log.e("EncBackupViewModel/failed to enable encrypted backup due to a connection error");
            r1 = encBackupViewModel.A04;
            i3 = 8;
        } else {
            Log.e("EncBackupViewModel/failed to enable encrypted backup due to a server error");
            r1 = encBackupViewModel.A04;
            i3 = 4;
        }
        r1.A09(Integer.valueOf(i3));
    }

    public int A05() {
        Object A012 = this.A09.A01();
        AnonymousClass00B.A06(A012);
        return ((Number) A012).intValue();
    }

    public void A06() {
        C16200sd r3 = this.A0B;
        r3.A07.Acl(new RunnableRunnableShape2S0100000_I0_1(r3, 45));
        if (!r3.A03.A1g()) {
            C19000xb r4 = r3.A00;
            LinkedList linkedList = new LinkedList();
            linkedList.add(new ChatConnectionRequirement());
            r4.A00(new DeleteAccountFromHsmServerJob(new JobParameters("DeleteAccountFromHsmServerJob", linkedList, true)));
        }
        Log.i("EncBackupViewModel/encrypted backup disabled");
        this.A03.A0B(402);
    }

    public void A07() {
        AnonymousClass027 r1 = this.A01;
        if (r1.A01() == null || !((Boolean) r1.A01()).booleanValue()) {
            this.A04.A09(2);
            C16200sd r12 = this.A0B;
            Object A012 = this.A05.A01();
            AnonymousClass00B.A06(A012);
            C29821bG r2 = new C29821bG(this);
            JniBridge jniBridge = r12.A08;
            C16320sq r6 = r12.A07;
            new C29801bE(r12, r2, r12.A03, r12.A05, r12.A06, r6, jniBridge, (String) A012).A01();
            return;
        }
        C15860rz r13 = this.A0B.A03;
        r13.A1O(true);
        r13.A1P(true);
        A09(5);
        this.A07.A09(-1);
    }

    public void A08() {
        String str = (String) this.A02.A01();
        if (str == null) {
            return;
        }
        if (A05() == 2) {
            C16200sd r4 = this.A0B;
            C100084v4 r6 = new C100084v4(this);
            boolean z2 = false;
            if (str.length() == 64) {
                z2 = true;
            }
            AnonymousClass00B.A0F(z2);
            r4.A07.Acl(new RunnableRunnableShape0S1310000_I0(r4, AnonymousClass1ZW.A0G(str), r6, (String) null, 0, true));
            return;
        }
        this.A04.A0B(2);
        this.A0I.Acl(new RunnableRunnableShape0S1100000_I0(6, str, this));
    }

    public void A09(int i2) {
        C74663qu r1 = new C74663qu();
        r1.A00 = Integer.valueOf(i2);
        this.A0F.A06(r1);
    }

    public void A0A(int i2) {
        C74663qu r1 = new C74663qu();
        r1.A01 = Integer.valueOf(i2);
        this.A0F.A06(r1);
    }

    public void A0B(int i2) {
        C74313qL r1 = new C74313qL();
        r1.A00 = Integer.valueOf(i2);
        this.A0F.A06(r1);
    }

    public void A0C(int i2) {
        this.A03.A0B(Integer.valueOf(i2));
    }

    public void A0D(int i2) {
        this.A09.A0B(Integer.valueOf(i2));
    }

    public void A0E(Bundle bundle) {
        AnonymousClass00B.A0C("getIntent().getExtras()[USER_ACTION_ARG] is required but is not present", bundle.containsKey("user_action"));
        int i2 = bundle.getInt("user_action");
        AnonymousClass027 r1 = this.A09;
        if (r1.A01() == null) {
            r1.A0B(Integer.valueOf(i2));
        }
        AnonymousClass027 r2 = this.A03;
        if (r2.A01() == null) {
            int i3 = 100;
            if (i2 != 1) {
                i3 = 103;
                if (i2 != 2) {
                    i3 = 102;
                    if (i2 != 3) {
                        if (i2 == 7 || i2 == 9) {
                            i3 = 104;
                        } else {
                            return;
                        }
                    }
                }
            }
            r2.A0B(Integer.valueOf(i3));
        }
    }

    public void A0F(boolean z2) {
        AnonymousClass027 r1;
        int i2;
        if (z2) {
            Log.i("EncBackupViewModel/successfully verified encryption key");
            this.A0A.A09(Boolean.TRUE);
            this.A04.A09(3);
            A0A(4);
            if (A05() == 4) {
                r1 = this.A03;
                i2 = 302;
            } else if (A05() == 6) {
                r1 = this.A03;
                i2 = 300;
            } else {
                return;
            }
        } else {
            Log.i("EncBackupViewModel/invalid encryption key");
            r1 = this.A04;
            i2 = 5;
        }
        r1.A09(Integer.valueOf(i2));
    }

    public boolean A0G() {
        Object A012 = this.A0A.A01();
        AnonymousClass00B.A06(A012);
        return ((Boolean) A012).booleanValue();
    }
}
