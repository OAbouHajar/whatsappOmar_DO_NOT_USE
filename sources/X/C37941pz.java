package X;

import android.view.View;
import android.widget.PopupWindow;
import com.obwhatsapp.R;
import com.obwhatsapp.emoji.EmojiDescriptor;
import java.util.ArrayList;

/* renamed from: X.1pz  reason: invalid class name and case insensitive filesystem */
public class C37941pz {
    public static C37781pj A00(String str) {
        int length = str.length();
        int[] iArr = new int[length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int codePointAt = Character.codePointAt(str, i2);
            i2 += Character.charCount(codePointAt);
            iArr[i3] = codePointAt;
            i3++;
        }
        int[] iArr2 = new int[i3];
        System.arraycopy(iArr, 0, iArr2, 0, i3);
        return new C37781pj(iArr2);
    }

    public static void A01(View view, View view2, PopupWindow popupWindow) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getRootView().getLocationOnScreen(iArr2);
        popupWindow.showAtLocation(view2, 51, ((iArr[0] - Math.max(0, iArr2[0])) + (view.getMeasuredWidth() / 2)) - (popupWindow.getContentView().getMeasuredWidth() / 2), ((iArr[1] - Math.max(0, iArr2[1])) - popupWindow.getContentView().getMeasuredHeight()) - view.getContext().getResources().getDimensionPixelSize(R.dimen.dimen0747));
    }

    public static boolean A02(CharSequence charSequence) {
        C435020g r7 = new C435020g(charSequence);
        boolean z2 = false;
        long A00 = EmojiDescriptor.A00(r7, false);
        if (A00 != -1) {
            z2 = true;
        }
        if (!z2) {
            return false;
        }
        int A01 = r7.A01(0, A00);
        int i2 = r7.A01;
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = Character.codePointAt(r7.A02, i3);
        }
        return A01 == iArr.length;
    }

    public static int[] A03(int[] iArr) {
        ArrayList arrayList = new ArrayList(r5);
        for (int i2 : iArr) {
            if (i2 != 65039) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Number) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }
}
