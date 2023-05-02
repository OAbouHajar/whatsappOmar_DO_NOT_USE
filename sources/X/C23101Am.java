package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.1Am  reason: invalid class name and case insensitive filesystem */
public class C23101Am {
    public Intent A00(Context context) {
        return new Intent("android.intent.action.VIEW").setClassName(context.getPackageName(), "com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryActivity");
    }

    public Intent A01(Context context) {
        if (this instanceof AnonymousClass1GN) {
            throw new UnsupportedOperationException();
        }
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.profile.ProfileInfoActivity");
        return intent;
    }
}
