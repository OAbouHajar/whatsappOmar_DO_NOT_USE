package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.calllink.CallLinkShareReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2dD  reason: invalid class name and case insensitive filesystem */
public class C52142dD {
    public static Intent A00(Context context, String str, String str2, int i2, boolean z2) {
        IntentSender intentSender;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("android.intent.extra.SUBJECT", str2);
        intent.setType("text/plain");
        intent.addFlags(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
        if (Build.VERSION.SDK_INT < 22) {
            intentSender = null;
        } else {
            Intent putExtra = new Intent(context, CallLinkShareReceiver.class).putExtra("extra_entry_point", i2).putExtra("extra_is_video", z2);
            int i3 = 134217728;
            if (C42341xd.A01) {
                i3 = 167772160;
            }
            intentSender = PendingIntent.getBroadcast(context, 0, putExtra, i3).getIntentSender();
        }
        return AnonymousClass1yL.A01(intentSender, (CharSequence) null, Collections.singletonList(intent));
    }

    public static C75003rS A01(String str, int i2, int i3, boolean z2) {
        C75003rS r1 = new C75003rS();
        r1.A00 = Integer.valueOf(i2);
        r1.A01 = Integer.valueOf(i3);
        int i4 = 1;
        if (z2) {
            i4 = 2;
        }
        r1.A02 = Integer.valueOf(i4);
        r1.A03 = str;
        return r1;
    }

    public static AnonymousClass2Wj A02(C16000sG r6, C16080sP r7, List list, int i2, boolean z2) {
        Object[] objArr;
        int i3;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (i4 < i2 && i4 < list.size()) {
            C16010sH A0A = r6.A0A((C15830rv) list.get(i4));
            arrayList.add(z2 ? r7.A08(A0A) : r7.A0C(A0A));
            i4++;
        }
        if (list.size() > i2) {
            return new C78493yA(new Object[]{arrayList.get(0), Integer.valueOf(list.size() - 1)}, R.plurals.plurals00b8, list.size() - 1);
        }
        if (list.size() == 2) {
            objArr = new Object[]{arrayList.get(0), arrayList.get(1)};
            i3 = R.string.str1a87;
        } else if (list.size() == 3) {
            objArr = new Object[]{arrayList.get(0), arrayList.get(1), arrayList.get(2)};
            i3 = R.string.str1a86;
        } else if (list.size() == 1) {
            return new AnonymousClass3y8((String) arrayList.get(0));
        } else {
            if (list.size() == 0) {
                objArr = new Object[0];
                i3 = R.string.str034e;
            } else {
                AnonymousClass00B.A0B("Number of names not supported", false);
                return null;
            }
        }
        return new C78483y9(objArr, i3);
    }
}
