package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.obwhatsapp.R;
import com.obwhatsapp.accountsync.LoginActivity;

/* renamed from: X.3ya  reason: invalid class name and case insensitive filesystem */
public class C78723ya extends C16690tT {
    public final ProgressDialog A00;
    public final /* synthetic */ LoginActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78723ya(Context context, LoginActivity loginActivity) {
        super(loginActivity, true);
        this.A01 = loginActivity;
        ProgressDialog show = ProgressDialog.show(context, "", loginActivity.getString(R.string.str0089), true, false);
        this.A00 = show;
        show.setCancelable(true);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        SystemClock.sleep(2000);
        LoginActivity loginActivity = this.A01;
        Account account = new Account(loginActivity.getString(R.string.str1bd4), "com.obwhatsapp");
        if (!AccountManager.get(loginActivity).addAccountExplicitly(account, (String) null, (Bundle) null)) {
            return Boolean.FALSE;
        }
        Bundle A0D = C13690nt.A0D();
        A0D.putString("authAccount", account.name);
        A0D.putString("accountType", account.type);
        loginActivity.A01 = A0D;
        return Boolean.TRUE;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        this.A00.dismiss();
        if (((Boolean) obj).booleanValue()) {
            this.A01.finish();
        }
    }
}
