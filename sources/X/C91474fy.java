package X;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

/* renamed from: X.4fy  reason: invalid class name and case insensitive filesystem */
public abstract class C91474fy implements DialogInterface.OnClickListener {
    public final void onClick(DialogInterface dialogInterface, int i2) {
        try {
            if (this instanceof AnonymousClass3YK) {
                AnonymousClass3YK r3 = (AnonymousClass3YK) this;
                Intent intent = r3.A00;
                if (intent != null) {
                    r3.A01.startActivityForResult(intent, 2);
                }
            } else {
                AnonymousClass3YL r32 = (AnonymousClass3YL) this;
                Intent intent2 = r32.A02;
                if (intent2 != null) {
                    r32.A01.startActivityForResult(intent2, r32.A00);
                }
            }
        } catch (ActivityNotFoundException e2) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e2);
        } catch (Throwable th) {
            dialogInterface.dismiss();
            throw th;
        }
        dialogInterface.dismiss();
    }
}
