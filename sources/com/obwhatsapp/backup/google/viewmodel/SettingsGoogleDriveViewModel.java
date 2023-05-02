package com.obwhatsapp.backup.google.viewmodel;

import X.AnonymousClass01E;
import X.AnonymousClass027;
import X.AnonymousClass12N;
import X.AnonymousClass12O;
import X.AnonymousClass12Q;
import X.AnonymousClass12R;
import X.AnonymousClass12S;
import X.AnonymousClass12U;
import X.AnonymousClass1I1;
import X.AnonymousClass1KN;
import X.AnonymousClass1UX;
import X.AnonymousClass2GK;
import X.AnonymousClass2YG;
import X.AnonymousClass2YI;
import X.AnonymousClass2YJ;
import X.AnonymousClass45p;
import X.C003401n;
import X.C100114v7;
import X.C14870pt;
import X.C15860rz;
import X.C16200sd;
import X.C16250si;
import X.C16320sq;
import X.C18000vz;
import X.C18260wP;
import X.C19670yo;
import X.C30801cy;
import X.C62693Eo;
import X.C71293io;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.facebook.redex.IDxSConnectionShape327S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape3S0100000_I0_2;
import com.obwhatsapp.R;
import java.util.concurrent.atomic.AtomicBoolean;

public class SettingsGoogleDriveViewModel extends C003401n implements C18000vz {
    public static final int[] A0f = {R.string.str1559, R.string.str1557, R.string.str1556, R.string.str155a, R.string.str1558};
    public static final int[] A0g = {0, 4, 1, 2, 3};
    public final ServiceConnection A00;
    public final ConditionVariable A01;
    public final AnonymousClass027 A02;
    public final AnonymousClass027 A03 = new AnonymousClass027();
    public final AnonymousClass027 A04;
    public final AnonymousClass027 A05;
    public final AnonymousClass027 A06;
    public final AnonymousClass027 A07;
    public final AnonymousClass027 A08;
    public final AnonymousClass027 A09;
    public final AnonymousClass027 A0A;
    public final AnonymousClass027 A0B;
    public final AnonymousClass027 A0C;
    public final AnonymousClass027 A0D;
    public final AnonymousClass027 A0E;
    public final AnonymousClass027 A0F;
    public final AnonymousClass027 A0G = new AnonymousClass027(Boolean.FALSE);
    public final AnonymousClass027 A0H = new AnonymousClass027(0L);
    public final AnonymousClass027 A0I;
    public final AnonymousClass027 A0J;
    public final AnonymousClass027 A0K;
    public final AnonymousClass027 A0L;
    public final AnonymousClass027 A0M;
    public final AnonymousClass027 A0N;
    public final AnonymousClass027 A0O;
    public final C16200sd A0P;
    public final AnonymousClass1KN A0Q;
    public final AnonymousClass12S A0R;
    public final AnonymousClass12O A0S;
    public final AnonymousClass1I1 A0T;
    public final AnonymousClass12U A0U;
    public final AnonymousClass12N A0V;
    public final AnonymousClass12Q A0W;
    public final AnonymousClass12R A0X;
    public final C18260wP A0Y;
    public final C15860rz A0Z;
    public final C16250si A0a;
    public final C30801cy A0b;
    public final C16320sq A0c;
    public final AtomicBoolean A0d;
    public final AtomicBoolean A0e;

    public SettingsGoogleDriveViewModel(C14870pt r17, C16200sd r18, AnonymousClass1KN r19, AnonymousClass12O r20, AnonymousClass1I1 r21, C19670yo r22, AnonymousClass12U r23, AnonymousClass12N r24, AnonymousClass12Q r25, C18260wP r26, C15860rz r27, C16250si r28, C16320sq r29) {
        AnonymousClass027 r7 = new AnonymousClass027();
        this.A0O = r7;
        AnonymousClass027 r2 = new AnonymousClass027();
        this.A0F = r2;
        this.A0I = new AnonymousClass027();
        AnonymousClass027 r6 = new AnonymousClass027();
        this.A02 = r6;
        AnonymousClass027 r5 = new AnonymousClass027();
        this.A04 = r5;
        this.A0L = new AnonymousClass027();
        this.A0J = new AnonymousClass027();
        this.A0K = new AnonymousClass027();
        this.A09 = new AnonymousClass027();
        this.A0M = new AnonymousClass027();
        this.A0C = new AnonymousClass027();
        this.A0B = new AnonymousClass027();
        this.A06 = new AnonymousClass027();
        this.A08 = new AnonymousClass027();
        AnonymousClass027 r3 = new AnonymousClass027();
        this.A07 = r3;
        this.A05 = new AnonymousClass027(Boolean.TRUE);
        this.A0D = new AnonymousClass027(10);
        this.A0E = new AnonymousClass027(new AnonymousClass2YJ(10, (Bundle) null));
        this.A0b = new C30801cy();
        this.A0N = new AnonymousClass027();
        this.A0A = new AnonymousClass027();
        this.A0e = new AtomicBoolean();
        this.A0d = new AtomicBoolean();
        boolean z2 = false;
        this.A01 = new ConditionVariable(false);
        this.A00 = new IDxSConnectionShape327S0100000_2_I0(this, 2);
        this.A0c = r29;
        this.A0P = r18;
        this.A0a = r28;
        this.A0Q = r19;
        this.A0U = r23;
        C15860rz r15 = r27;
        this.A0Z = r15;
        this.A0S = r20;
        this.A0T = r21;
        C18260wP r14 = r26;
        this.A0Y = r14;
        AnonymousClass12Q r12 = r25;
        this.A0W = r12;
        this.A0V = r24;
        this.A0X = new C62693Eo(r17, r12, this, r14, r15);
        this.A0R = new C100114v7(this);
        r14.A02(this);
        r2.A0B(Boolean.valueOf(r15.A1a()));
        long A052 = A05();
        if (A052 > 0) {
            r7.A0B(new AnonymousClass2YI(A052));
        }
        r6.A0B(r15.A0M());
        r5.A0B(Integer.valueOf(r15.A06()));
        if (!r22.A0c.get() && !AnonymousClass2GK.A0H(r15)) {
            z2 = true;
        }
        r3.A0B(Boolean.valueOf(z2));
    }

    public void A04() {
        this.A0Y.A03(this);
        this.A0V.A03(this.A0X);
        AnonymousClass12O r0 = this.A0S;
        r0.A00.A03(this.A0R);
    }

    public final long A05() {
        C15860rz r1 = this.A0Z;
        String A0M2 = r1.A0M();
        if (TextUtils.isEmpty(A0M2)) {
            return -1;
        }
        StringBuilder sb = new StringBuilder("gdrive_last_successful_backup_video_size:");
        sb.append(A0M2);
        return ((SharedPreferences) r1.A01.get()).getLong(sb.toString(), -1);
    }

    public void A06() {
        AnonymousClass027 r2;
        AnonymousClass2YI r0;
        long A052 = A05();
        if (A052 > 0) {
            r2 = this.A0O;
            r0 = new AnonymousClass2YI(A052);
        } else {
            Object A012 = this.A0F.A01();
            Boolean bool = Boolean.TRUE;
            r2 = this.A0O;
            if (A012 != bool) {
                r0 = null;
            } else {
                r2.A0B(new AnonymousClass2YG());
                this.A0c.Acl(new RunnableRunnableShape3S0100000_I0_2(this, 36));
                return;
            }
        }
        r2.A0B(r0);
    }

    public void A07() {
        this.A0c.Acl(new RunnableRunnableShape3S0100000_I0_2(this, 37));
        A06();
        C15860rz r4 = this.A0Z;
        String A0M2 = r4.A0M();
        int i2 = 0;
        if (A0M2 != null) {
            boolean A1m = r4.A1m(A0M2);
            int A0F2 = r4.A0F(A0M2);
            if (A1m || A0F2 == 0) {
                i2 = A0F2;
            } else {
                r4.A0z(A0M2, 0);
            }
        }
        this.A0I.A0B(Integer.valueOf(i2));
    }

    public void A08(boolean z2) {
        boolean A012 = AnonymousClass01E.A01();
        AnonymousClass027 r1 = this.A0C;
        Boolean valueOf = Boolean.valueOf(z2);
        if (A012) {
            r1.A0B(valueOf);
        } else {
            r1.A09(valueOf);
        }
    }

    public boolean A09(int i2) {
        if (!this.A0Z.A1l(i2)) {
            return false;
        }
        this.A04.A0B(Integer.valueOf(i2));
        return true;
    }

    public void AP4(AnonymousClass1UX r5) {
        int A042 = this.A0Y.A04(true);
        this.A03.A09(Integer.valueOf(A042));
        if (A042 == 0 || A042 == 2) {
            AnonymousClass45p r1 = (AnonymousClass45p) this.A08.A01();
            if (r1 instanceof C71293io) {
                int i2 = ((C71293io) r1).A00;
                if (i2 == 0) {
                    this.A0X.ATW(0, 0);
                } else if (i2 == 6 || i2 == 7) {
                    this.A0X.ANO(0, 0);
                }
            }
        }
    }
}
