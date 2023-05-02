package X;

import android.app.Activity;
import android.os.Build;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.38h  reason: invalid class name and case insensitive filesystem */
public class C612838h {
    public final Activity A00;
    public final C16260sj A01;
    public final C14750ph A02;

    public C612838h(Activity activity, C16260sj r2, C14750ph r3) {
        this.A01 = r2;
        this.A00 = activity;
        this.A02 = r3;
    }

    public boolean A00(String str) {
        int i2;
        int i3;
        C16260sj r2 = this.A01;
        boolean z2 = !r2.A0B();
        if (AnonymousClass000.A1O(r2.A03("android.permission.RECORD_AUDIO"))) {
            if (z2) {
                ArrayList A0u = AnonymousClass000.A0u();
                A0u.add("android.permission.RECORD_AUDIO");
                Activity activity = this.A00;
                C18450wi.A0H(activity, 0);
                A0u.addAll(Arrays.asList(C28971Zm.A00(activity, false, true)));
                String[] strArr = new String[A0u.size()];
                A0u.toArray(strArr);
                C54932iV r3 = new C54932iV(activity);
                r3.A0H = new int[]{R.drawable.permission_storage, R.drawable.permission_plus, R.drawable.permission_mic};
                r3.A06 = R.string.str120e;
                r3.A0I = null;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 30) {
                    i3 = R.string.str120b;
                } else {
                    i3 = R.string.str1210;
                    if (i4 < 33) {
                        i3 = R.string.str120f;
                    }
                }
                r3.A09 = i3;
                r3.A0G = null;
                r3.A0K = strArr;
                activity.startActivity(r3.A00());
            } else {
                Activity activity2 = this.A00;
                C54932iV r22 = new C54932iV(activity2);
                r22.A01 = R.drawable.permission_mic;
                r22.A06 = R.string.str11da;
                r22.A09 = R.string.str11d9;
                r22.A0K = new String[]{"android.permission.RECORD_AUDIO"};
                r22.A02 = R.drawable.permission_mic;
                r22.A0B = R.string.str1276;
                r22.A08 = R.string.str1274;
                r22.A07 = R.string.str1273;
                r22.A04 = R.string.str1275;
                r22.A05 = R.string.str1277;
                r22.A0F = str.equals("note");
                activity2.startActivity(r22.A00());
            }
        } else if (!z2) {
            return true;
        } else {
            Activity activity3 = this.A00;
            int i5 = Build.VERSION.SDK_INT;
            if (i5 < 30) {
                i2 = R.string.str1238;
            } else {
                i2 = R.string.str123e;
                if (i5 < 33) {
                    i2 = R.string.str123d;
                }
            }
            RequestPermissionActivity.A0K(activity3, R.string.str123c, i2);
        }
        return false;
    }
}
