package com.facebook.redex;

import X.AnonymousClass01S;
import X.AnonymousClass021;
import X.AnonymousClass2JE;
import X.C14860ps;
import X.C16300so;
import X.C28781Xp;
import X.C35811mX;
import android.content.SharedPreferences;
import com.obwhatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;

public class RunnableRunnableShape0S2101000_I0 implements Runnable {
    public int A00;
    public Object A01;
    public String A02;
    public String A03;
    public final int A04;

    public RunnableRunnableShape0S2101000_I0(Object obj, String str, String str2, int i2, int i3) {
        this.A04 = i3;
        this.A01 = obj;
        this.A02 = str;
        this.A00 = i2;
        this.A03 = str2;
    }

    public final void run() {
        if (this.A04 != 0) {
            C14860ps r3 = (C14860ps) this.A01;
            String str = this.A02;
            String str2 = this.A03;
            int i2 = this.A00;
            synchronized (r3) {
                Log.i("twofactorauthmanager/store-new-auth-settings");
                if (str == null || str.isEmpty()) {
                    r3.A0C = "";
                    r3.A00().edit().remove("two_factor_auth_code").remove("two_factor_auth_using_encryption").remove("two_factor_auth_email_set").remove("two_factor_auth_nag_time").remove("two_factor_auth_nag_interval").remove("two_factor_auth_last_code_correctness").apply();
                } else {
                    r3.A0C = str;
                    C35811mX A002 = r3.A07.A00(AnonymousClass021.A0N, str.getBytes(AnonymousClass01S.A0A));
                    String str3 = null;
                    if (A002 != null) {
                        String A003 = A002.A00();
                        if (A003 == null || !str.equals(r3.A02(A003))) {
                            C16300so r5 = r3.A01;
                            boolean z2 = false;
                            if (A003 == null) {
                                z2 = true;
                            }
                            r5.AcB("TwoFactorAuthManager/encryptCode/EncryptedCodeFailure", String.valueOf(z2), false);
                        } else {
                            str3 = A003;
                        }
                    }
                    boolean z3 = false;
                    if (str3 != null) {
                        z3 = true;
                        str = str3;
                    }
                    StringBuilder sb = new StringBuilder("TwoFactorAuthManager/storeNewAuthSettings/isUsingEncryption: ");
                    sb.append(z3);
                    Log.i(sb.toString());
                    SharedPreferences.Editor putBoolean = r3.A00().edit().putString("two_factor_auth_code", str).putBoolean("two_factor_auth_using_encryption", z3).putLong("two_factor_auth_nag_time", System.currentTimeMillis()).putInt("two_factor_auth_nag_interval", i2).putBoolean("two_factor_auth_last_code_correctness", false);
                    if (str2 != null) {
                        int i3 = 2;
                        if (str2.length() > 0) {
                            i3 = 1;
                        }
                        putBoolean.putInt("two_factor_auth_email_set", i3);
                    } else if (r3.A00().getInt("two_factor_auth_email_set", 0) == 0) {
                        r3.A03.A00(new C28781Xp());
                    }
                    putBoolean.apply();
                }
                r3.A02.A0K(new RunnableRunnableShape16S0100000_I0_15(r3, 3));
            }
            return;
        }
        String str4 = this.A02;
        int i4 = this.A00;
        String str5 = this.A03;
        ConversationsFragment conversationsFragment = ((AnonymousClass2JE) this.A01).A04;
        conversationsFragment.A0A.setProgress(i4);
        conversationsFragment.A0D.setText(str5);
        conversationsFragment.A0C.setText(str4);
    }
}
