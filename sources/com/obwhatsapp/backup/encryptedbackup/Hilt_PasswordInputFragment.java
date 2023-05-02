package com.obwhatsapp.backup.encryptedbackup;

import X.AnonymousClass006;
import X.AnonymousClass04o;
import X.AnonymousClass2TA;
import X.AnonymousClass3K2;
import X.AnonymousClass3K3;
import X.C13690nt;
import X.C16150sX;
import X.C16300so;
import X.C17050uS;
import X.C17060uT;
import X.C23071Aj;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.base.WaFragment;

public abstract class Hilt_PasswordInputFragment extends WaFragment implements AnonymousClass006 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = C13690nt.A0Y();
    public volatile C54442hW A04;

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A1A();
        return this.A00;
    }

    public LayoutInflater A0v(Bundle bundle) {
        return C54452hX.A00(super.A0v(bundle), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (X.C54442hW.A00(r1) == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0y(android.app.Activity r3) {
        /*
            r2 = this;
            r0 = 1
            r2.A0V = r0
            android.content.ContextWrapper r1 = r2.A00
            if (r1 == 0) goto L_0x000e
            android.content.Context r1 = X.C54442hW.A00(r1)
            r0 = 0
            if (r1 != r3) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.C52772eQ.A01(r0)
            r2.A1A()
            r2.A19()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.backup.encryptedbackup.Hilt_PasswordInputFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1A();
        A19();
    }

    public void A19() {
        C17060uT r0;
        Hilt_CreatePasswordFragment hilt_CreatePasswordFragment;
        if (this instanceof Hilt_VerifyPasswordFragment) {
            Hilt_VerifyPasswordFragment hilt_VerifyPasswordFragment = (Hilt_VerifyPasswordFragment) this;
            if (!hilt_VerifyPasswordFragment.A02) {
                hilt_VerifyPasswordFragment.A02 = true;
                VerifyPasswordFragment verifyPasswordFragment = (VerifyPasswordFragment) hilt_VerifyPasswordFragment;
                C16150sX r1 = ((C17050uS) ((C17060uT) hilt_VerifyPasswordFragment.generatedComponent())).A0b;
                AnonymousClass3K2.A17(r1, verifyPasswordFragment);
                verifyPasswordFragment.A03 = C16150sX.A0k(r1);
                verifyPasswordFragment.A01 = C16150sX.A02(r1);
                verifyPasswordFragment.A00 = (C16300so) r1.A5p.get();
            }
        } else if (this instanceof Hilt_RestorePasswordInputFragment) {
            Hilt_RestorePasswordInputFragment hilt_RestorePasswordInputFragment = (Hilt_RestorePasswordInputFragment) this;
            if (!hilt_RestorePasswordInputFragment.A02) {
                hilt_RestorePasswordInputFragment.A02 = true;
                RestorePasswordInputFragment restorePasswordInputFragment = (RestorePasswordInputFragment) hilt_RestorePasswordInputFragment;
                C16150sX r12 = ((C17050uS) ((C17060uT) hilt_RestorePasswordInputFragment.generatedComponent())).A0b;
                AnonymousClass3K2.A17(r12, restorePasswordInputFragment);
                restorePasswordInputFragment.A00 = AnonymousClass3K3.A0a(r12);
                restorePasswordInputFragment.A01 = (C23071Aj) r12.AQb.get();
            }
        } else {
            if (this instanceof Hilt_CreatePasswordFragment) {
                Hilt_CreatePasswordFragment hilt_CreatePasswordFragment2 = (Hilt_CreatePasswordFragment) this;
                if (!hilt_CreatePasswordFragment2.A02) {
                    hilt_CreatePasswordFragment2.A02 = true;
                    r0 = (C17060uT) hilt_CreatePasswordFragment2.generatedComponent();
                    hilt_CreatePasswordFragment = hilt_CreatePasswordFragment2;
                } else {
                    return;
                }
            } else if (this instanceof Hilt_ConfirmPasswordFragment) {
                Hilt_ConfirmPasswordFragment hilt_ConfirmPasswordFragment = (Hilt_ConfirmPasswordFragment) this;
                if (!hilt_ConfirmPasswordFragment.A02) {
                    hilt_ConfirmPasswordFragment.A02 = true;
                    r0 = (C17060uT) hilt_ConfirmPasswordFragment.generatedComponent();
                    hilt_CreatePasswordFragment = hilt_ConfirmPasswordFragment;
                } else {
                    return;
                }
            } else if (!this.A02) {
                this.A02 = true;
                r0 = (C17060uT) generatedComponent();
                hilt_CreatePasswordFragment = (PasswordInputFragment) this;
            } else {
                return;
            }
            AnonymousClass3K2.A17(((C17050uS) r0).A0b, hilt_CreatePasswordFragment);
        }
    }

    public final void A1A() {
        if (this.A00 == null) {
            this.A00 = C54452hX.A01(super.A0u(), this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }

    public AnonymousClass04o ABj() {
        return AnonymousClass2TA.A01(this, super.ABj());
    }

    public final Object generatedComponent() {
        if (this.A04 == null) {
            synchronized (this.A03) {
                if (this.A04 == null) {
                    this.A04 = new C54442hW(this);
                }
            }
        }
        return this.A04.generatedComponent();
    }
}
