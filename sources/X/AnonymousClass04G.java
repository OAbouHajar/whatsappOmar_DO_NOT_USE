package X;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.Set;

/* renamed from: X.04G  reason: invalid class name */
public final class AnonymousClass04G {
    public final Bundle A00;
    public final CharSequence A01;
    public final String A02;
    public final Set A03;
    public final CharSequence[] A04;

    public AnonymousClass04G(Bundle bundle, CharSequence charSequence, String str, Set set, CharSequence[] charSequenceArr) {
        this.A02 = str;
        this.A01 = charSequence;
        this.A04 = charSequenceArr;
        this.A00 = bundle;
        this.A03 = set;
    }

    public static Bundle A00(Intent intent) {
        Intent intent2;
        if (Build.VERSION.SDK_INT >= 20) {
            return AnonymousClass0SX.A01(intent);
        }
        ClipData clipData = intent.getClipData();
        if (clipData != null) {
            ClipDescription description = clipData.getDescription();
            if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals("android.remoteinput.results") && (intent2 = clipData.getItemAt(0).getIntent()) != null) {
                return (Bundle) intent2.getExtras().getParcelable("android.remoteinput.resultsData");
            }
        }
        return null;
    }

    public static RemoteInput[] A01(AnonymousClass04G[] r4) {
        int length = r4.length;
        RemoteInput[] remoteInputArr = new RemoteInput[length];
        for (int i2 = 0; i2 < length; i2++) {
            remoteInputArr[i2] = AnonymousClass0SX.A00(r4[i2]);
        }
        return remoteInputArr;
    }
}
