package X;

import android.content.Context;
import android.net.Uri;
import com.obwhatsapp.SuspiciousLinkWarningDialogFragment;
import com.obwhatsapp.status.playback.fragment.OpenLinkConfirmationDialogFragment;
import com.obwhatsapp.status.playback.fragment.OpenLinkDialogFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.1dL  reason: invalid class name and case insensitive filesystem */
public class C31021dL {
    public static final HashSet A00 = new HashSet(Arrays.asList(new Integer[]{128525, 128514, 128558, 128546, 128591, 128079, 127881, 128175, 128077, 128514, 128558, 128546, 10084, 128522, 129392, 129321, 128154, 129315, 128518, 128293, 128588, 129395, 128557, 128532, 129402, 128562, 129327, 128545, 128548}));

    public static List A00(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                if (A00.contains(Integer.valueOf(jSONArray.getInt(i2)))) {
                    arrayList.add(Integer.valueOf(jSONArray.getInt(i2)));
                }
            }
        } catch (JSONException e2) {
            StringBuilder sb = new StringBuilder("statusreply/statusreactions/invalid emoji list JSONArray:");
            sb.append(str);
            Log.e(sb.toString(), e2);
        }
        return arrayList;
    }

    public static void A01(Context context, C17100uX r4, C41831wj r5, String str, String str2, Set set, boolean z2) {
        OpenLinkDialogFragment openLinkDialogFragment;
        if (set != null) {
            openLinkDialogFragment = SuspiciousLinkWarningDialogFragment.A01(str, str2, set);
        } else if (!z2) {
            r4.Acv(context, Uri.parse(str), 0, 1);
            return;
        } else {
            openLinkDialogFragment = OpenLinkConfirmationDialogFragment.A01(str, str2);
        }
        openLinkDialogFragment.A04 = r5;
        ((C14550pN) C19980zJ.A01(context, C14550pN.class)).Afc(openLinkDialogFragment);
    }

    public static boolean A02(C14710pd r7, AnonymousClass1P8 r8, C16740tZ r9) {
        if ((r9 instanceof C16730tY) && (!r9.A11.A02 || ((r9 instanceof C38711rI) && AnonymousClass20C.A03((C38731rK) r9)))) {
            C16730tY r6 = (C16730tY) r9;
            C16750ta r3 = r6.A02;
            AnonymousClass00B.A06(r3);
            C30701co A002 = r8.A00(r3);
            String str = null;
            if (r7 != null) {
                str = r7.A06(C16620tM.A02, 2917);
            }
            if (r9.A10 != 3 || !r3.A0Z || A002 == null || A002.A0i == null || C41971wz.A0B(str)) {
                if (!(r9 instanceof C38681rF) || !C38621r6.A0x(r6)) {
                    return (!r3.A0P || r3.A07 == 1 || r3.A0F == null) ? false : true;
                }
                return true;
            }
        }
        return true;
    }
}
