package com.AssemMods.accounts;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Process;

public class Utils {
    private static AccountsManager mAccountsManager;

    public static void Restart(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(268468224);
            context.startActivity(launchIntentForPackage);
            Process.killProcess(Process.myPid());
            System.exit(0);
        }
    }

    public static AccountsManager getAccountsManager() {
        return mAccountsManager;
    }

    public static String getApplicationPath(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.dataDir;
        } catch (PackageManager.NameNotFoundException e2) {
            return null;
        }
    }

    public static void initAccounts(Context context) {
        mAccountsManager = new AccountsManager(context);
    }
}
