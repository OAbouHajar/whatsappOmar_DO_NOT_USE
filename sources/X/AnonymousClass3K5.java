package X;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.obwhatsapp.accountsync.LoginActivity;
import com.whatsapp.util.Log;
import java.util.Arrays;

/* renamed from: X.3K5  reason: invalid class name */
public class AnonymousClass3K5 extends AbstractAccountAuthenticator {
    public final Context A00;

    public AnonymousClass3K5(Context context) {
        super(context);
        this.A00 = context;
    }

    public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        Log.i("account/sync/addAccount");
        Bundle A0D = C13690nt.A0D();
        Intent intent = new Intent(this.A00, LoginActivity.class);
        intent.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
        A0D.putParcelable("intent", intent);
        return A0D;
    }

    public Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
        Log.i("account/sync/confirmCredentials");
        return null;
    }

    public Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        Log.i("account/sync/editProperties");
        return null;
    }

    public Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        Log.i("account/sync/getAuthToken");
        return null;
    }

    public String getAuthTokenLabel(String str) {
        Log.i("account/sync/getAuthTokenLabel");
        return null;
    }

    public Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) {
        Log.i(AnonymousClass000.A0h(Arrays.toString(strArr), AnonymousClass000.A0r("account/sync/hasFeatures: ")));
        return null;
    }

    public Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        Log.i("account/sync/updateCredentials");
        return null;
    }
}
