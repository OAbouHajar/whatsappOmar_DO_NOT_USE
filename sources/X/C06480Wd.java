package X;

import android.app.Notification;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.0Wd  reason: invalid class name and case insensitive filesystem */
public class C06480Wd {
    public static Field A00;
    public static boolean A01;
    public static final Object A02 = new Object();

    public static Bundle A00(Notification.Builder builder, AnonymousClass04E r4) {
        IconCompat A002 = r4.A00();
        builder.addAction(A002 != null ? A002.A04() : 0, r4.A03, r4.A01);
        Bundle bundle = new Bundle(r4.A07);
        AnonymousClass04G[] r0 = r4.A09;
        if (r0 != null) {
            bundle.putParcelableArray("android.support.remoteInputs", A02(r0));
        }
        AnonymousClass04G[] r02 = r4.A08;
        if (r02 != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", A02(r02));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", r4.A04);
        return bundle;
    }

    public static Bundle A01(AnonymousClass04E r4) {
        Bundle bundle = new Bundle();
        IconCompat A002 = r4.A00();
        bundle.putInt("icon", A002 != null ? A002.A04() : 0);
        bundle.putCharSequence("title", r4.A03);
        bundle.putParcelable("actionIntent", r4.A01);
        Bundle bundle2 = new Bundle(r4.A07);
        bundle2.putBoolean("android.support.allowGeneratedReplies", r4.A04);
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", A02(r4.A09));
        bundle.putBoolean("showsUserInterface", r4.A05);
        bundle.putInt("semanticAction", r4.A06);
        return bundle;
    }

    public static Bundle[] A02(AnonymousClass04G[] r7) {
        if (r7 == null) {
            return null;
        }
        int length = r7.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i2 = 0; i2 < length; i2++) {
            AnonymousClass04G r2 = r7[i2];
            Bundle bundle = new Bundle();
            bundle.putString("resultKey", r2.A02);
            bundle.putCharSequence("label", r2.A01);
            bundle.putCharSequenceArray("choices", r2.A04);
            bundle.putBoolean("allowFreeFormInput", true);
            bundle.putBundle("extras", r2.A00);
            Set<Object> set = r2.A03;
            if (!set.isEmpty()) {
                ArrayList arrayList = new ArrayList(set.size());
                for (Object add : set) {
                    arrayList.add(add);
                }
                bundle.putStringArrayList("allowedDataTypes", arrayList);
            }
            bundleArr[i2] = bundle;
        }
        return bundleArr;
    }
}
