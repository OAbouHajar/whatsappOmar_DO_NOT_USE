package X;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0LS  reason: invalid class name */
public class AnonymousClass0LS {
    public static List A00(Resources resources, int i2) {
        int i3;
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList A0u = AnonymousClass000.A0u();
            if (Build.VERSION.SDK_INT >= 21) {
                i3 = AnonymousClass0LR.A00(obtainTypedArray, 0);
            } else {
                TypedValue typedValue = new TypedValue();
                obtainTypedArray.getValue(0, typedValue);
                i3 = typedValue.type;
            }
            if (i3 == 1) {
                for (int i4 = 0; i4 < obtainTypedArray.length(); i4++) {
                    int resourceId = obtainTypedArray.getResourceId(i4, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList A0u2 = AnonymousClass000.A0u();
                        for (String decode : stringArray) {
                            A0u2.add(Base64.decode(decode, 0));
                        }
                        A0u.add(A0u2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList A0u3 = AnonymousClass000.A0u();
                for (String decode2 : stringArray2) {
                    A0u3.add(Base64.decode(decode2, 0));
                }
                A0u.add(A0u3);
            }
            obtainTypedArray.recycle();
            return A0u;
        } finally {
            obtainTypedArray.recycle();
        }
    }
}
