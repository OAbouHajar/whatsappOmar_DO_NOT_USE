package com.mod2.fblibs;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieSyncManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

public class Facebook {
    public static final String CANCEL_URI = "fbconnect://cancel";
    protected static String DIALOG_BASE_URL = "https://m.facebook.com/dialog/";
    public static final String EXPIRES = "expires_in";
    public static final String FB_APP_SIGNATURE = "30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2";
    public static final int FORCE_DIALOG_AUTH = -1;
    protected static String GRAPH_BASE_URL = "https://graph.facebook.com/";
    public static final String REDIRECT_URI = "fbconnect://success";
    protected static String RESTSERVER_URL = "https://api.facebook.com/restserver.php";
    public static final String SINGLE_SIGN_ON_DISABLED = "service_disabled";
    public static final String TOKEN = "access_token";
    private long mAccessExpires = 0;
    private String mAccessToken = null;
    private String mAppId;
    private Activity mAuthActivity;
    private int mAuthActivityCode;
    /* access modifiers changed from: private */
    public DialogListener mAuthDialogListener;
    private String[] mAuthPermissions;

    public interface DialogListener {
        void onCancel();

        void onComplete(Bundle bundle);

        void onError(DialogError dialogError);

        void onFacebookError(FacebookError facebookError);
    }

    public Facebook(String str) {
        if (str == null) {
            throw new IllegalArgumentException("You must specify your application ID when instantiating a Facebook object. See README for details.");
        }
        this.mAppId = str;
    }

    private void startDialogAuth(Activity activity, String[] strArr) {
        Bundle bundle = new Bundle();
        if (strArr.length > 0) {
            bundle.putString("scope", TextUtils.join(",", strArr));
        }
        CookieSyncManager.createInstance(activity);
        dialog(activity, "oauth", bundle, new DialogListener() {
            public void onCancel() {
                Log.d("Facebook-authorize", "Login canceled");
                Facebook.this.mAuthDialogListener.onCancel();
            }

            public void onComplete(Bundle bundle) {
                CookieSyncManager.getInstance().sync();
                Facebook.this.setAccessToken(bundle.getString(Facebook.TOKEN));
                Facebook.this.setAccessExpiresIn(bundle.getString(Facebook.EXPIRES));
                if (Facebook.this.isSessionValid()) {
                    Log.d("Facebook-authorize", "Login Success! access_token=" + Facebook.this.getAccessToken() + " expires=" + Facebook.this.getAccessExpires());
                    Facebook.this.mAuthDialogListener.onComplete(bundle);
                    return;
                }
                Facebook.this.mAuthDialogListener.onFacebookError(new FacebookError("Failed to receive access token."));
            }

            public void onError(DialogError dialogError) {
                Log.d("Facebook-authorize", "Login failed: " + dialogError);
                Facebook.this.mAuthDialogListener.onError(dialogError);
            }

            public void onFacebookError(FacebookError facebookError) {
                Log.d("Facebook-authorize", "Login failed: " + facebookError);
                Facebook.this.mAuthDialogListener.onFacebookError(facebookError);
            }
        });
    }

    private boolean startSingleSignOn(Activity activity, String str, String[] strArr, int i2) {
        Intent intent = new Intent();
        intent.setClassName("com.facebook.katana", "com.facebook.katana.ProxyAuth");
        intent.putExtra("client_id", str);
        if (strArr.length > 0) {
            intent.putExtra("scope", TextUtils.join(",", strArr));
        }
        if (!validateAppSignatureForIntent(activity, intent)) {
            return false;
        }
        this.mAuthActivity = activity;
        this.mAuthPermissions = strArr;
        this.mAuthActivityCode = i2;
        try {
            activity.startActivityForResult(intent, i2);
            return true;
        } catch (ActivityNotFoundException e2) {
            return false;
        }
    }

    private boolean validateAppSignatureForIntent(Activity activity, Intent intent) {
        boolean z2;
        ResolveInfo resolveActivity = activity.getPackageManager().resolveActivity(intent, 0);
        if (resolveActivity == null) {
            z2 = false;
        } else {
            try {
                Signature[] signatureArr = activity.getPackageManager().getPackageInfo(resolveActivity.activityInfo.packageName, 64).signatures;
                for (Signature charsString : signatureArr) {
                    if (charsString.toCharsString().equals(FB_APP_SIGNATURE)) {
                        return true;
                    }
                }
                z2 = false;
            } catch (PackageManager.NameNotFoundException e2) {
                return false;
            }
        }
        return z2;
    }

    public void authorize(Activity activity, DialogListener dialogListener) {
        authorize(activity, new String[0], 32665, dialogListener);
    }

    public void authorize(Activity activity, String[] strArr, int i2, DialogListener dialogListener) {
        boolean z2 = false;
        this.mAuthDialogListener = dialogListener;
        if (i2 >= 0) {
            z2 = startSingleSignOn(activity, this.mAppId, strArr, i2);
        }
        if (!z2) {
            startDialogAuth(activity, strArr);
        }
    }

    public void authorize(Activity activity, String[] strArr, DialogListener dialogListener) {
        authorize(activity, strArr, 32665, dialogListener);
    }

    public void authorizeCallback(int i2, int i3, Intent intent) {
        if (i2 != this.mAuthActivityCode) {
            return;
        }
        if (i3 == -1) {
            String stringExtra = intent.getStringExtra("error");
            String str = stringExtra;
            if (stringExtra == null) {
                str = intent.getStringExtra("error_type");
            }
            if (str == null) {
                setAccessToken(intent.getStringExtra(TOKEN));
                setAccessExpiresIn(intent.getStringExtra(EXPIRES));
                if (isSessionValid()) {
                    Log.d("Facebook-authorize", "Login Success! access_token=" + getAccessToken() + " expires=" + getAccessExpires());
                    this.mAuthDialogListener.onComplete(intent.getExtras());
                    return;
                }
                this.mAuthDialogListener.onFacebookError(new FacebookError("Failed to receive access token."));
            } else if (str.equals(SINGLE_SIGN_ON_DISABLED) || str.equals("AndroidAuthKillSwitchException")) {
                Log.d("Facebook-authorize", "Hosted auth currently disabled. Retrying dialog auth...");
                startDialogAuth(this.mAuthActivity, this.mAuthPermissions);
            } else if (str.equals("access_denied") || str.equals("OAuthAccessDeniedException")) {
                Log.d("Facebook-authorize", "Login canceled by user.");
                this.mAuthDialogListener.onCancel();
            } else {
                String stringExtra2 = intent.getStringExtra("error_description");
                String str2 = str;
                if (stringExtra2 != null) {
                    str2 = String.valueOf(str) + ":" + stringExtra2;
                }
                Log.d("Facebook-authorize", "Login failed: " + str2);
                this.mAuthDialogListener.onFacebookError(new FacebookError(str2));
            }
        } else if (i3 != 0) {
        } else {
            if (intent != null) {
                Log.d("Facebook-authorize", "Login failed: " + intent.getStringExtra("error"));
                this.mAuthDialogListener.onError(new DialogError(intent.getStringExtra("error"), intent.getIntExtra("error_code", -1), intent.getStringExtra("failing_url")));
                return;
            }
            Log.d("Facebook-authorize", "Login canceled by user.");
            this.mAuthDialogListener.onCancel();
        }
    }

    public void dialog(Context context, String str, Bundle bundle, DialogListener dialogListener) {
        String str2 = String.valueOf(DIALOG_BASE_URL) + str;
        bundle.putString("display", "touch");
        bundle.putString("redirect_uri", REDIRECT_URI);
        if (str.equals("oauth")) {
            bundle.putString("type", "user_agent");
            bundle.putString("client_id", this.mAppId);
        } else {
            bundle.putString("app_id", this.mAppId);
        }
        if (isSessionValid()) {
            bundle.putString(TOKEN, getAccessToken());
        }
        String str3 = String.valueOf(str2) + "?" + Util.encodeUrl(bundle);
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") != 0) {
            Util.showAlert(context, "Error", "Application requires permission to access the Internet");
        } else {
            new FbDialog(context, str3, dialogListener).show();
        }
    }

    public void dialog(Context context, String str, DialogListener dialogListener) {
        dialog(context, str, new Bundle(), dialogListener);
    }

    public long getAccessExpires() {
        return this.mAccessExpires;
    }

    public String getAccessToken() {
        return this.mAccessToken;
    }

    public String getAppId() {
        return this.mAppId;
    }

    public boolean isSessionValid() {
        return getAccessToken() != null && (getAccessExpires() == 0 || System.currentTimeMillis() < getAccessExpires());
    }

    public String logout(Context context) throws MalformedURLException, IOException {
        Util.clearCookies(context);
        Bundle bundle = new Bundle();
        bundle.putString("method", "auth.expireSession");
        String request = request(bundle);
        setAccessToken((String) null);
        setAccessExpires(0);
        return request;
    }

    public String request(Bundle bundle) throws MalformedURLException, IOException {
        if (bundle.containsKey("method")) {
            return request((String) null, bundle, "GET");
        }
        throw new IllegalArgumentException("API method must be specified. (parameters must contain key \"method\" and value). See http://developers.facebook.com/docs/reference/rest/");
    }

    public String request(String str) throws MalformedURLException, IOException {
        return request(str, new Bundle(), "GET");
    }

    public String request(String str, Bundle bundle) throws MalformedURLException, IOException {
        return request(str, bundle, "GET");
    }

    public String request(String str, Bundle bundle, String str2) throws FileNotFoundException, MalformedURLException, IOException {
        bundle.putString("format", "json");
        if (isSessionValid()) {
            bundle.putString(TOKEN, getAccessToken());
        }
        return Util.openUrl(str != null ? String.valueOf(GRAPH_BASE_URL) + str : RESTSERVER_URL, str2, bundle);
    }

    public void setAccessExpires(long j2) {
        this.mAccessExpires = j2;
    }

    public void setAccessExpiresIn(String str) {
        if (str != null) {
            setAccessExpires(str.equals("0") ? 0 : System.currentTimeMillis() + (Long.parseLong(str) * 1000));
        }
    }

    public void setAccessToken(String str) {
        this.mAccessToken = str;
    }

    public void setAppId(String str) {
        this.mAppId = str;
    }
}
