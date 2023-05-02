package X;

import android.content.SharedPreferences;
import com.facebook.redex.RunnableRunnableShape16S0100000_I0_15;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.0ps  reason: invalid class name and case insensitive filesystem */
public class C14860ps {
    public static final long A0D = TimeUnit.SECONDS.toMillis(35);
    public static final long[] A0E;
    public SharedPreferences A00;
    public final C16300so A01;
    public final C14870pt A02;
    public final C19000xb A03;
    public final C18260wP A04;
    public final C16440t3 A05;
    public final AnonymousClass149 A06;
    public final AnonymousClass14A A07;
    public final C17020u3 A08;
    public final AnonymousClass1H4 A09;
    public final C16320sq A0A;
    public final List A0B = new LinkedList();
    public volatile String A0C;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        A0E = new long[]{timeUnit.toMillis(6), timeUnit.toMillis(12), timeUnit2.toMillis(1), timeUnit2.toMillis(1), timeUnit2.toMillis(3), timeUnit2.toMillis(7)};
    }

    public C14860ps(C16300so r2, C14870pt r3, C19000xb r4, C18260wP r5, C16440t3 r6, AnonymousClass149 r7, AnonymousClass14A r8, C17020u3 r9, AnonymousClass1H4 r10, C16320sq r11) {
        this.A05 = r6;
        this.A02 = r3;
        this.A01 = r2;
        this.A0A = r11;
        this.A06 = r7;
        this.A03 = r4;
        this.A09 = r10;
        this.A07 = r8;
        this.A08 = r9;
        this.A04 = r5;
    }

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A08.A00(AnonymousClass01S.A07);
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public String A01() {
        if (this.A0C == null) {
            synchronized (this) {
                if (this.A0C == null) {
                    String string = A00().getString("two_factor_auth_code", (String) null);
                    String str = "";
                    if (string == null) {
                        this.A0C = str;
                    } else {
                        boolean z2 = A00().getBoolean("two_factor_auth_using_encryption", false);
                        if (!z2 || (string = A02(string)) != null) {
                            str = string;
                        } else {
                            this.A01.AcB("TwoFactorAuthManager/loadCodeInMemory/EncryptedCodeFailure", (String) null, false);
                        }
                        this.A0C = str;
                        StringBuilder sb = new StringBuilder("TwoFactorAuthManager/loadCodeInMemory/isUsingEncryption: ");
                        sb.append(z2);
                        Log.i(sb.toString());
                    }
                }
            }
        }
        String str2 = this.A0C;
        AnonymousClass00B.A06(str2);
        return str2;
    }

    public final String A02(String str) {
        byte[] A012;
        try {
            C35811mX A002 = AnonymousClass149.A00(new JSONArray(str));
            if (A002 == null || (A012 = this.A07.A01(A002, AnonymousClass021.A0N)) == null) {
                return null;
            }
            return new String(A012, AnonymousClass01S.A0A);
        } catch (JSONException e2) {
            Log.w("TwoFactorAuthManager/decryptCode/cannot create Json", e2);
            return null;
        }
    }

    public void A03(String str, int i2) {
        StringBuilder sb = new StringBuilder("twofactorauthmanager/store-auth-settings-error errorCode [");
        sb.append(i2);
        sb.append("] errorMessage [");
        sb.append(str);
        sb.append("]");
        Log.w(sb.toString());
        for (AnonymousClass0rA AZH : this.A0B) {
            AZH.AZH();
        }
    }

    public void A04(String str, String str2) {
        if (!this.A04.A0A()) {
            Log.i("twofactorauthmanager/set-two-factor-auth-settings no internet connection, cancelling");
            this.A02.Acq(new RunnableRunnableShape16S0100000_I0_15(this, 2));
            return;
        }
        Log.i("twofactorauthmanager/set-two-factor-auth-settings");
        AnonymousClass1H4 r5 = this.A09;
        C17190ug r10 = r5.A01;
        String A022 = r10.A02();
        StringBuilder sb = new StringBuilder("TwoFactorXmppMethods/sendSetTwoFactorAuth; iq=");
        sb.append(A022);
        Log.i(sb.toString());
        ArrayList arrayList = new ArrayList(2);
        String str3 = str;
        if (str != null) {
            arrayList.add(new C28371Vv("code", str3, (C35081lL[]) null));
        }
        String str4 = str2;
        if (str2 != null) {
            arrayList.add(new C28371Vv("email", str4, (C35081lL[]) null));
        }
        r10.A0G(new AnonymousClass2KF(r5, str3, str4), new C28371Vv(new C28371Vv("2fa", (C35081lL[]) null, (C28371Vv[]) arrayList.toArray(new C28371Vv[0])), "iq", new C35081lL[]{new C35081lL((Jid) C34791ks.A00, "to"), new C35081lL("id", A022), new C35081lL("xmlns", "urn:xmpp:whatsapp:account"), new C35081lL("type", "set")}), A022, 111, 32000);
    }

    public void A05(boolean z2) {
        int i2 = A00().getInt("two_factor_auth_nag_interval", 0);
        A00().edit().putLong("two_factor_auth_nag_time", this.A05.A00()).putInt("two_factor_auth_nag_interval", z2 ? Math.min(i2 + 1, 5) : Math.max(i2 - 1, 0)).putBoolean("two_factor_auth_last_code_correctness", z2).apply();
    }

    public boolean A06() {
        if (!(!A01().isEmpty())) {
            return false;
        }
        long j2 = A00().getLong("two_factor_auth_nag_time", -1);
        C16440t3 r6 = this.A05;
        boolean z2 = false;
        if (r6.A00() > A0E[Math.min(5, A00().getInt("two_factor_auth_nag_interval", 0))] + j2) {
            z2 = true;
        }
        boolean z3 = A00().getBoolean("two_factor_auth_last_code_correctness", false);
        boolean z4 = false;
        if (r6.A00() < j2) {
            z4 = true;
            Log.w("twofactorauthmanager/clock-moved-back");
        }
        return z2 || !z3 || z4;
    }
}
