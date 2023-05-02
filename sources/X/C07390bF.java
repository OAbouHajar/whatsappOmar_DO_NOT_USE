package X;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;

/* renamed from: X.0bF  reason: invalid class name and case insensitive filesystem */
public class C07390bF implements InputConnectionCompat.OnCommitContentListener {
    public final /* synthetic */ View A00;

    public C07390bF(View view) {
        this.A00 = view;
    }

    public boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i2 & 1) != 0) {
            try {
                inputContentInfoCompat.requestPermission();
                InputContentInfo inputContentInfo = (InputContentInfo) inputContentInfoCompat.mImpl.getInputContentInfo();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable(InputConnectionCompat.EXTRA_INPUT_CONTENT_INFO, inputContentInfo);
            } catch (Exception e2) {
                Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e2);
                return false;
            }
        }
        return C004601z.A0G(this.A00, AnonymousClass0NR.A00(bundle, inputContentInfoCompat)) == null;
    }
}
