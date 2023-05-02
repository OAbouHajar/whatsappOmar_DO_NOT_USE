package X;

import android.content.Context;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.view.ContextThemeWrapper;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.obwhatsapp.R;
import com.obwhatsapp.ephemeral.EphemeralDmKicBottomSheetDialog;
import com.obwhatsapp.ephemeral.EphemeralNUXDialog;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1uD  reason: invalid class name and case insensitive filesystem */
public class C40491uD {
    public static final long[] A00 = {0, 180000, 900000};

    public static int A00(C16000sG r1, C15810rt r2, C15830rv r3) {
        AnonymousClass1WV A08;
        if (C16030sJ.A0L(r3)) {
            C16010sH A082 = r1.A08(r3);
            if (A082 != null) {
                return A082.A01;
            }
            return 0;
        } else if (!(r3 instanceof UserJid) || (A08 = r2.A08((UserJid) r3)) == null) {
            return 0;
        } else {
            return A08.expiration;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r1 == null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass1WV A01(X.C16740tZ r7) {
        /*
            java.lang.Long r1 = r7.A0Y
            int r6 = r7.A04
            r0 = 0
            if (r6 <= 0) goto L_0x0008
            r0 = 1
        L_0x0008:
            r2 = 0
            if (r0 != 0) goto L_0x0022
            if (r1 == 0) goto L_0x0025
            long r4 = r1.longValue()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0025
        L_0x0016:
            long r2 = r1.longValue()
        L_0x001a:
            int r1 = r7.A00
            X.1WV r0 = new X.1WV
            r0.<init>(r6, r2, r1)
            return r0
        L_0x0022:
            if (r1 != 0) goto L_0x0016
            goto L_0x001a
        L_0x0025:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40491uD.A01(X.0tZ):X.1WV");
    }

    public static String A02(Context context, int i2) {
        if (context == null) {
            return "";
        }
        int i3 = R.string.str0810;
        if (i2 != 86400) {
            i3 = R.string.str082c;
            if (i2 != 604800) {
                if (i2 != 7776000) {
                    return "";
                }
                i3 = R.string.str0813;
            }
        }
        return context.getString(i3);
    }

    public static String A03(Context context, int i2, boolean z2, boolean z3) {
        int i3;
        if (i2 <= 0) {
            if (z3) {
                i3 = R.string.str065e;
                if (z2) {
                    i3 = R.string.str065d;
                }
            } else {
                i3 = R.string.str0829;
                if (z2) {
                    i3 = R.string.str0828;
                }
            }
        } else if (i2 == 86400) {
            i3 = R.string.str0811;
            if (!z2) {
                i3 = R.string.str0812;
            }
        } else if (i2 == 604800) {
            i3 = R.string.str082d;
            if (!z2) {
                i3 = R.string.str082e;
            }
        } else if (i2 == 7776000) {
            i3 = R.string.str0814;
            if (!z2) {
                i3 = R.string.str0815;
            }
        } else {
            int i4 = R.plurals.plurals008b;
            if (i2 > 86400) {
                i2 /= 86400;
                i4 = R.plurals.plurals0088;
            } else if (i2 >= 3600) {
                i2 /= 3600;
                i4 = R.plurals.plurals0089;
            } else if (i2 >= 60) {
                i2 /= 60;
                i4 = R.plurals.plurals008a;
            }
            return context.getResources().getQuantityString(i4, i2, new Object[]{Integer.valueOf(i2)});
        }
        return context.getString(i3);
    }

    public static String A04(AnonymousClass013 r6, int i2) {
        int i3;
        if (i2 <= 0) {
            return "";
        }
        if (i2 >= 86400) {
            i2 /= 86400;
            i3 = R.plurals.plurals0164;
        } else if (i2 >= 3600) {
            i2 /= 3600;
            i3 = R.plurals.plurals0165;
        } else if (i2 >= 60) {
            i2 /= 60;
            i3 = R.plurals.plurals0166;
        } else {
            i3 = R.plurals.plurals0167;
        }
        return r6.A0J(new Object[]{Integer.valueOf(i2)}, i3, (long) i2);
    }

    public static void A05(RadioGroup radioGroup, C14710pd r11, int i2, boolean z2, boolean z3) {
        int[] iArr = r11.A0E(C16620tM.A02, 1397) ? AnonymousClass01S.A0E : AnonymousClass01S.A0F;
        int i3 = -1;
        int length = iArr.length;
        AppCompatRadioButton[] appCompatRadioButtonArr = new AppCompatRadioButton[length];
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (!z3 || i5 != 0) {
                Context context = radioGroup.getContext();
                AppCompatRadioButton appCompatRadioButton = new AppCompatRadioButton(new ContextThemeWrapper(context, R.style.style0259));
                appCompatRadioButton.setId(C004601z.A03());
                appCompatRadioButton.setTag(Integer.valueOf(i5));
                appCompatRadioButton.setText(A03(context, i5, true, z2));
                appCompatRadioButton.setLayoutParams(new RadioGroup.LayoutParams(-1, -2));
                appCompatRadioButtonArr[i4] = appCompatRadioButton;
                radioGroup.addView(appCompatRadioButton);
                if (i5 == i2) {
                    i3 = i4;
                }
            }
        }
        if (i3 >= 0) {
            appCompatRadioButtonArr[i3].setChecked(true);
        }
    }

    public static void A06(AnonymousClass02C r2, C15860rz r3, C14710pd r4, C15830rv r5, C17800vf r6, int i2) {
        if (!r4.A0E(C16620tM.A02, 2005)) {
            boolean z2 = false;
            if (i2 == 2) {
                z2 = true;
            }
            EphemeralNUXDialog.A01(r2, r6, z2);
        } else if (EphemeralDmKicBottomSheetDialog.A02(r2, r3)) {
            EphemeralDmKicBottomSheetDialog.A01(r2, r5, i2);
            EphemeralDmKicBottomSheetDialog.A0P = null;
        }
    }

    public static boolean A07(C16000sG r3, C15810rt r4, C16740tZ r5) {
        C15830rv r1 = r5.A11.A00;
        if (C16030sJ.A0G(r1) || r5.A10(16384) || r5.A10(AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED)) {
            return false;
        }
        AnonymousClass00B.A06(r1);
        return A00(r3, r4, r1) != r5.A04;
    }
}
