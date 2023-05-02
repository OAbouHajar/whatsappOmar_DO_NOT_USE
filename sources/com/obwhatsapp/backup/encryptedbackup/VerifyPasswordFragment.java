package com.obwhatsapp.backup.encryptedbackup;

import X.C14710pd;
import X.C14870pt;
import X.C16300so;
import android.content.Intent;
import com.obwhatsapp.deviceauth.BiometricAuthPlugin;

public class VerifyPasswordFragment extends Hilt_VerifyPasswordFragment {
    public C16300so A00;
    public C14870pt A01;
    public BiometricAuthPlugin A02;
    public C14710pd A03;

    public void A0x(int i2, int i3, Intent intent) {
        super.A0x(i2, i3, intent);
        if (i2 == 12345) {
            A1H(i3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A18(android.os.Bundle r15, android.view.View r16) {
        /*
            r14 = this;
            r0 = r16
            super.A18(r15, r0)
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r14.A07
            int r1 = r0.A05()
            r3 = 7
            r0 = 8
            if (r1 != r0) goto L_0x0015
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r14.A07
            r0.A0D(r3)
        L_0x0015:
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r14.A07
            int r1 = r0.A05()
            r0 = 10
            r4 = 9
            if (r1 != r0) goto L_0x0026
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r14.A07
            r0.A0D(r4)
        L_0x0026:
            X.0pd r11 = r14.A03
            X.0pt r8 = r14.A01
            X.0so r7 = r14.A00
            X.01V r9 = r14.A09
            X.00l r6 = r14.A0D()
            r12 = 2131888018(0x7f120792, float:1.941066E38)
            r13 = 2131888017(0x7f120791, float:1.9410657E38)
            r2 = 1
            com.facebook.redex.IDxAListenerShape290S0100000_2_I1 r10 = new com.facebook.redex.IDxAListenerShape290S0100000_2_I1
            r10.<init>(r14, r2)
            com.obwhatsapp.deviceauth.BiometricAuthPlugin r5 = new com.obwhatsapp.deviceauth.BiometricAuthPlugin
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r14.A02 = r5
            int r1 = r14.A00
            r0 = 4
            if (r1 != r0) goto L_0x0082
            android.widget.TextView r1 = r14.A04
            r0 = 2131888104(0x7f1207e8, float:1.9410834E38)
            X.AnonymousClass3K3.A17(r1, r14, r0)
            android.widget.TextView r1 = r14.A03
            r0 = 2131888103(0x7f1207e7, float:1.9410832E38)
        L_0x0057:
            X.AnonymousClass3K3.A17(r1, r14, r0)
        L_0x005a:
            android.widget.TextView r1 = r14.A01
            r0 = 0
            r1.setVisibility(r0)
            com.obwhatsapp.components.Button r1 = r14.A08
            r0 = 2131888101(0x7f1207e5, float:1.9410828E38)
            X.AnonymousClass3K3.A17(r1, r14, r0)
            android.widget.TextView r1 = r14.A01
            r0 = 14
            X.C34331k5.A01(r1, r14, r0)
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r14.A07
            X.0sd r0 = r0.A0B
            X.0sk r0 = r0.A01
            X.0tw r0 = r0.A00()
            if (r0 == 0) goto L_0x00a5
            r14.A1F(r2)
            r14.A1C()
            return
        L_0x0082:
            r0 = 5
            if (r1 != r0) goto L_0x0093
            android.widget.TextView r1 = r14.A04
            r0 = 2131888104(0x7f1207e8, float:1.9410834E38)
            X.AnonymousClass3K3.A17(r1, r14, r0)
            android.widget.TextView r1 = r14.A03
            r0 = 2131888102(0x7f1207e6, float:1.941083E38)
            goto L_0x0057
        L_0x0093:
            if (r1 == r3) goto L_0x0097
            if (r1 != r4) goto L_0x005a
        L_0x0097:
            android.widget.TextView r1 = r14.A04
            r0 = 2131888094(0x7f1207de, float:1.9410814E38)
            X.AnonymousClass3K3.A17(r1, r14, r0)
            android.widget.TextView r1 = r14.A03
            r0 = 2131888093(0x7f1207dd, float:1.9410812E38)
            goto L_0x0057
        L_0x00a5:
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r14.A07
            X.027 r0 = r0.A04
            X.C13680ns.A1O(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.backup.encryptedbackup.VerifyPasswordFragment.A18(android.os.Bundle, android.view.View):void");
    }

    public final void A1H(int i2) {
        EncBackupViewModel encBackupViewModel;
        int i3;
        if (i2 == -1 || i2 == 4) {
            this.A07.A0A(6);
            this.A07.A0A.A09(true);
            int A05 = this.A07.A05();
            if (A05 == 4) {
                this.A07.A0C(302);
                return;
            }
            if (A05 != 5) {
                if (A05 == 7) {
                    encBackupViewModel = this.A07;
                    i3 = 8;
                } else if (A05 == 9) {
                    encBackupViewModel = this.A07;
                    i3 = 10;
                } else {
                    return;
                }
                encBackupViewModel.A0D(i3);
            }
            this.A07.A0C(300);
        }
    }
}
