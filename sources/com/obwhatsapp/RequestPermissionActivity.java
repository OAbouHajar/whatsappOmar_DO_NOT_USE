package com.obwhatsapp;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass02C;
import X.AnonymousClass09N;
import X.AnonymousClass0Y9;
import X.AnonymousClass1BN;
import X.AnonymousClass1DX;
import X.AnonymousClass1GE;
import X.AnonymousClass1GW;
import X.AnonymousClass22X;
import X.C14710pd;
import X.C14870pt;
import X.C15450qv;
import X.C15860rz;
import X.C16260sj;
import X.C18450wi;
import X.C19230xz;
import X.C28971Zm;
import X.C43041zF;
import X.C54932iV;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import com.obwhatsapp.registration.directmigration.RequestPermissionFromSisterAppActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RequestPermissionActivity extends AnonymousClass22X {
    public static final Map A0B;
    public AnonymousClass1GW A00;
    public C19230xz A01;
    public C16260sj A02;
    public C15860rz A03;
    public C14710pd A04;
    public AnonymousClass1DX A05;
    public AnonymousClass1BN A06;
    public String A07;
    public Set A08;
    public boolean A09;
    public boolean A0A;

    static {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        HashMap hashMap = new HashMap(4);
        int[] iArr = new int[6];
        iArr[0] = R.string.str11fc;
        boolean A0B2 = C15450qv.A0B();
        if (A0B2) {
            i2 = R.string.str11fe;
        } else {
            int i10 = Build.VERSION.SDK_INT;
            i2 = R.string.str11fd;
            if (i10 < 30) {
                i2 = R.string.str11fb;
            }
        }
        iArr[1] = i2;
        iArr[2] = R.string.str1225;
        if (A0B2) {
            i3 = R.string.str1227;
        } else {
            int i11 = Build.VERSION.SDK_INT;
            i3 = R.string.str1226;
            if (i11 < 30) {
                i3 = R.string.str1224;
            }
        }
        iArr[3] = i3;
        iArr[4] = R.string.str11ad;
        iArr[5] = R.string.str1198;
        hashMap.put(30, iArr);
        hashMap.put(29, iArr);
        int[] iArr2 = new int[6];
        iArr2[0] = R.string.str11f4;
        boolean A0B3 = C15450qv.A0B();
        if (A0B3) {
            i4 = R.string.str11f6;
        } else {
            int i12 = Build.VERSION.SDK_INT;
            i4 = R.string.str11f5;
            if (i12 < 30) {
                i4 = R.string.str11f3;
            }
        }
        iArr2[1] = i4;
        iArr2[2] = R.string.str1219;
        if (A0B3) {
            i5 = R.string.str121b;
        } else {
            int i13 = Build.VERSION.SDK_INT;
            i5 = R.string.str121a;
            if (i13 < 30) {
                i5 = R.string.str1218;
            }
        }
        iArr2[3] = i5;
        iArr2[4] = R.string.str119a;
        iArr2[5] = R.string.str1199;
        hashMap.put(31, iArr2);
        int[] iArr3 = new int[6];
        iArr3[0] = R.string.str11f8;
        boolean A0B4 = C15450qv.A0B();
        if (A0B4) {
            i6 = R.string.str11fa;
        } else {
            int i14 = Build.VERSION.SDK_INT;
            i6 = R.string.str11f9;
            if (i14 < 30) {
                i6 = R.string.str11f7;
            }
        }
        iArr3[1] = i6;
        iArr3[2] = R.string.str121d;
        if (A0B4) {
            i7 = R.string.str121f;
        } else {
            int i15 = Build.VERSION.SDK_INT;
            i7 = R.string.str121e;
            if (i15 < 30) {
                i7 = R.string.str121c;
            }
        }
        iArr3[3] = i7;
        iArr3[4] = R.string.str119c;
        iArr3[5] = R.string.str119b;
        hashMap.put(32, iArr3);
        int[] iArr4 = new int[6];
        iArr4[0] = R.string.str1200;
        boolean A0B5 = C15450qv.A0B();
        if (A0B5) {
            i8 = R.string.str121f;
        } else {
            int i16 = Build.VERSION.SDK_INT;
            i8 = R.string.str1201;
            if (i16 < 30) {
                i8 = R.string.str11ff;
            }
        }
        iArr4[1] = i8;
        iArr4[2] = R.string.str1231;
        if (A0B5) {
            i9 = R.string.str1233;
        } else {
            int i17 = Build.VERSION.SDK_INT;
            i9 = R.string.str1232;
            if (i17 < 30) {
                i9 = R.string.str1230;
            }
        }
        iArr4[3] = i9;
        iArr4[4] = R.string.str11af;
        iArr4[5] = R.string.str11ae;
        hashMap.put(33, iArr4);
        A0B = Collections.unmodifiableMap(hashMap);
    }

    public static Intent A02(Context context, int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
        boolean A012 = C16260sj.A01(context);
        int i6 = R.string.str1271;
        int i7 = R.string.str126f;
        if (A012) {
            i6 = R.string.str1272;
            i7 = R.string.str1270;
        }
        C54932iV r2 = new C54932iV(context);
        r2.A01 = R.drawable.permission_storage;
        C18450wi.A0H(context, 0);
        r2.A0K = C28971Zm.A00(context, false, true);
        r2.A06 = i2;
        r2.A09 = i3;
        r2.A0D = z2;
        r2.A02 = R.drawable.permission_settings_media;
        r2.A0F = z3;
        r2.A07 = R.string.str1267;
        r2.A04 = i4;
        r2.A05 = R.string.str1269;
        r2.A03 = i5;
        r2.A0B = i6;
        r2.A08 = i7;
        return r2.A00();
    }

    public static Intent A03(Context context, int i2, int i3, boolean z2) {
        C54932iV r3 = new C54932iV(context);
        r3.A01 = R.drawable.permission_contacts_small;
        r3.A0K = new String[]{"android.permission.GET_ACCOUNTS", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"};
        r3.A06 = i2;
        r3.A0I = null;
        r3.A09 = i3;
        r3.A0G = null;
        r3.A0D = z2;
        return r3.A00();
    }

    public static Intent A09(Context context, C16260sj r8, int i2, int i3, int i4, boolean z2) {
        int i5 = i2;
        int[] iArr = (int[]) A0B.get(Integer.valueOf(i2));
        boolean z3 = !r8.A0B();
        boolean z4 = false;
        if (r8.A03("android.permission.CAMERA") != 0) {
            z4 = true;
        }
        return A0A(context, iArr, i5, i3, i4, z3, z4, z2);
    }

    public static Intent A0A(Context context, int[] iArr, int i2, int i3, int i4, boolean z2, boolean z3, boolean z4) {
        C54932iV r2;
        if (iArr == null) {
            StringBuilder sb = new StringBuilder("conversation/check/camera/storage/permissions/unexpected request code ");
            sb.append(i2);
            Log.e(sb.toString());
        } else {
            Context context2 = context;
            if (z3) {
                if (z2) {
                    r2.A0H = new int[]{R.drawable.permission_storage, R.drawable.permission_plus, R.drawable.permission_cam};
                    C18450wi.A0H(context, 0);
                    r2.A0K = C28971Zm.A00(context, true, true);
                    r2.A06 = iArr[0];
                    r2.A09 = iArr[1];
                } else {
                    r2 = new C54932iV(context);
                    r2.A01 = R.drawable.permission_cam;
                    r2.A06 = iArr[4];
                    r2.A09 = iArr[5];
                    r2.A0K = new String[]{"android.permission.CAMERA"};
                }
                r2.A0D = false;
                return r2.A00();
            } else if (z2) {
                return A02(context2, iArr[2], iArr[3], i3, i4, false, z4);
            }
        }
        return null;
    }

    public static void A0B(Activity activity) {
        if (!activity.isFinishing()) {
            C54932iV r2 = new C54932iV(activity);
            r2.A01 = R.drawable.permission_call;
            r2.A0K = (String[]) C16260sj.A00().toArray(new String[0]);
            r2.A06 = R.string.str11ec;
            r2.A09 = R.string.str11eb;
            r2.A0D = true;
            activity.startActivityForResult(r2.A00(), 155);
        }
    }

    public static void A0D(Activity activity, int i2, int i3) {
        if (!activity.isFinishing()) {
            activity.startActivityForResult(A03(activity, i2, i3, false), 150);
        }
    }

    public static void A0K(Activity activity, int i2, int i3) {
        Activity activity2 = activity;
        if (!activity.isFinishing()) {
            activity2.startActivityForResult(A02(activity2, i2, i3, 0, 0, false, false), 151);
        }
    }

    public static void A0L(Activity activity, int i2, int i3, int i4) {
        Activity activity2 = activity;
        if (!activity.isFinishing()) {
            activity2.startActivityForResult(A02(activity2, i2, i3, 0, 0, false, false), i4);
        }
    }

    public static void A0M(Activity activity, C14870pt r12, C16260sj r13, boolean z2) {
        int i2;
        Intent A002;
        C54932iV r6;
        int i3 = Build.VERSION.SDK_INT;
        boolean z3 = i3 >= 23 ? r13.A03("android.permission.RECORD_AUDIO") != 0 : r13.A00.A00.checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") != 0;
        boolean z4 = z2 && (i3 >= 23 ? r13.A03("android.permission.CAMERA") != 0 : r13.A00.A00.checkCallingOrSelfPermission("android.permission.CAMERA") != 0);
        StringBuilder sb = new StringBuilder("request/permission/checkCameraAndMicPermissionsForVoipCall needMicPerm = ");
        sb.append(z3);
        sb.append(", needCameraPerm = ");
        sb.append(z4);
        Log.i(sb.toString());
        if (i3 >= 23) {
            if (z4) {
                if (z3) {
                    r6.A0H = new int[]{R.drawable.permission_mic, R.drawable.permission_plus, R.drawable.permission_cam};
                    r6.A0K = new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                    r6.A06 = R.string.str11e7;
                    r6.A09 = R.string.str11e6;
                } else {
                    r6 = new C54932iV(activity);
                    r6.A01 = R.drawable.permission_cam;
                    r6.A06 = R.string.str11aa;
                    r6.A09 = R.string.str11a9;
                    r6.A0K = new String[]{"android.permission.CAMERA"};
                }
                r6.A0D = true;
                A002 = r6.A00();
            } else if (z3) {
                C54932iV r1 = new C54932iV(activity);
                r1.A01 = R.drawable.permission_mic;
                r1.A06 = R.string.str11e1;
                r1.A09 = R.string.str11d8;
                r1.A0K = new String[]{"android.permission.RECORD_AUDIO"};
                r1.A0D = true;
                A002 = r1.A00();
            } else {
                return;
            }
            activity.startActivityForResult(A002, 152);
            return;
        }
        if (z4) {
            i2 = R.string.str038d;
            if (z3) {
                i2 = R.string.str038e;
            }
        } else if (z3) {
            i2 = R.string.str0393;
        } else {
            return;
        }
        r12.A07(i2, 1);
    }

    public static void A0N(Activity activity, C16260sj r6, int i2, boolean z2) {
        int i3;
        if (!activity.isFinishing() && (!r6.A0A())) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(C16260sj.A00());
            C54932iV r1 = new C54932iV(activity);
            if (Build.VERSION.SDK_INT >= 28) {
                arrayList.add("android.permission.READ_CALL_LOG");
                arrayList.add("android.permission.ANSWER_PHONE_CALLS");
                r1.A0K = (String[]) arrayList.toArray(new String[0]);
                r1.A06 = R.string.str11ca;
                i3 = R.string.str11c9;
            } else {
                arrayList.add("android.permission.CALL_PHONE");
                r1.A0K = (String[]) arrayList.toArray(new String[0]);
                r1.A06 = R.string.str11cc;
                i3 = R.string.str11cb;
            }
            r1.A09 = i3;
            r1.A0A = R.string.str11c8;
            r1.A0D = true;
            r1.A0D = true;
            r1.A0E = z2;
            activity.startActivityForResult(r1.A00(), i2);
        }
    }

    public static void A0O(AnonymousClass01A r2, int i2, int i3) {
        if (r2.A0u() != null) {
            r2.startActivityForResult(A03(r2.A0u(), i2, i3, false), 150);
        }
    }

    public static void A0P(AnonymousClass01A r4, C15860rz r5, String[] strArr) {
        A0Q(r5, strArr);
        if (r4.A0F != null) {
            AnonymousClass02C A0G = r4.A0G();
            if (A0G.A02 != null) {
                A0G.A0D.addLast(new AnonymousClass0Y9(r4.A0T, 100));
                A0G.A02.A00((AnonymousClass09N) null, strArr);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(r4);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    public static void A0Q(C15860rz r5, String[] strArr) {
        for (String str : strArr) {
            r5.A0K().putBoolean(str, true).apply();
            if (C43041zF.A03(str, AnonymousClass1GE.A07)) {
                r5.A1M(true);
                r5.A1N(true);
            }
        }
    }

    public static boolean A0R(Activity activity, C16260sj r11) {
        int i2;
        if (!(!r11.A0B())) {
            return true;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30) {
            i2 = R.string.str1212;
        } else {
            i2 = R.string.str1215;
            if (i3 < 33) {
                i2 = R.string.str1214;
            }
        }
        activity.startActivityForResult(A02(activity, R.string.str1213, i2, 0, 0, false, false), 34);
        return false;
    }

    public static boolean A0S(Activity activity, C16260sj r11) {
        if (r11.A0B()) {
            return true;
        }
        int i2 = Build.VERSION.SDK_INT;
        int i3 = R.string.str1205;
        if (i2 < 30) {
            i3 = R.string.str1203;
        }
        activity.startActivityForResult(A02(activity, R.string.str1204, i3, 0, 0, false, false), 151);
        return false;
    }

    public static boolean A0T(Activity activity, C16260sj r6, int i2) {
        Activity activity2 = activity;
        Intent A092 = A09(activity2, r6, i2, 0, 0, false);
        if (A092 == null) {
            return true;
        }
        activity2.startActivityForResult(A092, i2);
        return false;
    }

    public static boolean A0U(Activity activity, C16260sj r3, String[] strArr, int i2, int i3, int i4, boolean z2) {
        if (r3.A05()) {
            return true;
        }
        C54932iV r1 = new C54932iV(activity);
        r1.A01 = R.drawable.permission_location;
        r1.A0K = strArr;
        r1.A09 = i3;
        r1.A06 = i2;
        r1.A0B = R.string.str126d;
        r1.A08 = R.string.str126b;
        r1.A07 = R.string.str126a;
        r1.A04 = R.string.str126c;
        r1.A05 = R.string.str126e;
        r1.A02 = R.drawable.permission_location;
        r1.A0F = z2;
        activity.startActivityForResult(r1.A00(), i4);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (r4 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0V(android.app.Activity r5, java.lang.String r6, int[] r7, int r8, int r9, int r10, int r11, boolean r12, boolean r13) {
        /*
            r2 = 0
            r3 = 1
            if (r12 == 0) goto L_0x0012
            if (r13 == 0) goto L_0x000d
            java.lang.String[] r4 = A0a(r5)
        L_0x000a:
            if (r4 != 0) goto L_0x0024
        L_0x000c:
            return r3
        L_0x000d:
            java.lang.String[] r4 = X.C28971Zm.A00(r5, r2, r3)
            goto L_0x000a
        L_0x0012:
            if (r13 == 0) goto L_0x000c
            r0 = 3
            java.lang.String[] r4 = new java.lang.String[r0]
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            r4[r2] = r0
            java.lang.String r0 = "android.permission.WRITE_CONTACTS"
            r4[r3] = r0
            r1 = 2
            java.lang.String r0 = "android.permission.GET_ACCOUNTS"
            r4[r1] = r0
        L_0x0024:
            int r0 = r7.length
            X.2iV r1 = new X.2iV
            r1.<init>(r5)
            if (r0 != r3) goto L_0x0047
            r0 = r7[r2]
            r1.A01 = r0
        L_0x0030:
            r1.A0K = r4
            r1.A06 = r10
            r1.A0A = r9
            r1.A00 = r11
            r1.A0D = r3
            android.content.Intent r1 = r1.A00()
            java.lang.String r0 = "permission_requester_screen"
            r1.putExtra(r0, r6)
            r5.startActivityForResult(r1, r8)
            return r2
        L_0x0047:
            r1.A0H = r7
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.RequestPermissionActivity.A0V(android.app.Activity, java.lang.String, int[], int, int, int, int, boolean, boolean):boolean");
    }

    public static boolean A0W(Activity activity, String[] strArr) {
        for (String A0H : strArr) {
            if (!AnonymousClass00T.A0H(activity, A0H)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0X(Context context, C16260sj r9) {
        int i2;
        if (!(!r9.A0B())) {
            return true;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30) {
            i2 = R.string.str1212;
        } else {
            i2 = R.string.str1215;
            if (i3 < 33) {
                i2 = R.string.str1214;
            }
        }
        context.startActivity(A02(context, R.string.str1213, i2, 0, 0, false, false));
        return false;
    }

    public static boolean A0Y(AnonymousClass01A r10, C16260sj r11) {
        if (r11.A0B()) {
            return true;
        }
        Context A0u = r10.A0u();
        int i2 = Build.VERSION.SDK_INT;
        int i3 = R.string.str1205;
        if (i2 < 30) {
            i3 = R.string.str1203;
        }
        r10.startActivityForResult(A02(A0u, R.string.str1204, i3, 0, 0, false, false), 151);
        return false;
    }

    public static boolean A0Z(C15860rz r5, String[] strArr) {
        for (String str : strArr) {
            if (((SharedPreferences) r5.A01.get()).getBoolean(str, false)) {
                return false;
            }
        }
        return true;
    }

    public static String[] A0a(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.GET_ACCOUNTS");
        arrayList.add("android.permission.READ_CONTACTS");
        arrayList.add("android.permission.WRITE_CONTACTS");
        arrayList.addAll(Arrays.asList(C28971Zm.A00(context, false, true)));
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    public final String A2B(Bundle bundle, boolean z2) {
        int i2 = bundle.getInt(z2 ? "perm_denial_message_id" : "message_id");
        if (i2 == 0) {
            return null;
        }
        int[] intArray = bundle.getIntArray(z2 ? "perm_denial_message_params_id" : "message_params_id");
        if (intArray == null) {
            return getString(i2);
        }
        int length = intArray.length;
        String[] strArr = new String[length];
        for (int i3 = 0; i3 < length; i3++) {
            strArr[i3] = getString(intArray[i3]);
        }
        return getString(i2, strArr);
    }

    public void A2C(String str, Bundle bundle) {
        if (str != null) {
            ((TextView) AnonymousClass00T.A05(this, R.id.permission_message)).setText(str);
            return;
        }
        StringBuilder sb = new StringBuilder("request/permission/activity/there is no message id for ");
        sb.append(Arrays.toString(bundle.getStringArray("permissions")));
        Log.e(sb.toString());
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
        if (r10.A04.A0E(X.C16620tM.A02, 2767) == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x010b, code lost:
        if (r9 != false) goto L_0x010d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            super.onCreate(r11)
            android.content.Intent r0 = r10.getIntent()
            android.os.Bundle r2 = r0.getExtras()
            if (r2 != 0) goto L_0x0016
            java.lang.String r0 = "request/permission/activity/extra is null"
        L_0x000f:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r10.finish()
        L_0x0015:
            return
        L_0x0016:
            java.lang.String r0 = "permission_requester_screen"
            java.lang.String r0 = r2.getString(r0)
            r10.A07 = r0
            java.lang.String r0 = "permissions"
            java.lang.String[] r4 = r2.getStringArray(r0)
            if (r4 != 0) goto L_0x0029
            java.lang.String r0 = "request/permission/activity/no-permissions-passed"
            goto L_0x000f
        L_0x0029:
            java.lang.String r0 = "title_id"
            int r6 = r2.getInt(r0)
            java.lang.String r0 = "is_attachment"
            boolean r0 = r2.getBoolean(r0)
            r5 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0047
            X.0pd r7 = r10.A04
            r1 = 2767(0xacf, float:3.877E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r7.A0E(r0, r1)
            r9 = 1
            if (r0 != 0) goto L_0x00ea
        L_0x0047:
            r9 = 0
            r0 = 2131101255(0x7f060647, float:1.7814915E38)
            int r7 = X.AnonymousClass00T.A00(r10, r0)
            android.view.Window r1 = r10.getWindow()
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r7)
            r1.setBackgroundDrawable(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0085
            android.view.Window r1 = r10.getWindow()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.addFlags(r0)
            android.view.Window r1 = r10.getWindow()
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1.clearFlags(r0)
            r0 = 2131100913(0x7f0604f1, float:1.781422E38)
            int r1 = X.AnonymousClass00T.A00(r10, r0)
            r0 = 1050253722(0x3e99999a, float:0.3)
            int r1 = X.AnonymousClass090.A03(r0, r7, r1)
            android.view.Window r0 = r10.getWindow()
        L_0x0085:
            r0 = 2131559565(0x7f0d048d, float:1.8744478E38)
            r10.setContentView((int) r0)
            r7 = 2131362567(0x7f0a0307, float:1.8344918E38)
            android.view.View r1 = X.AnonymousClass00T.A05(r10, r7)
            com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0 r0 = new com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0
            r0.<init>(r10, r5)
            r1.setOnClickListener(r0)
            if (r6 == 0) goto L_0x00af
            r1 = 2131365288(0x7f0a0da8, float:1.8350437E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r10, r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r6)
            android.view.View r0 = X.AnonymousClass00T.A05(r10, r1)
            r0.setVisibility(r3)
        L_0x00af:
            java.lang.String r0 = "drawable_id"
            int r1 = r2.getInt(r0)
            if (r1 == 0) goto L_0x0238
            r0 = 2131365284(0x7f0a0da4, float:1.8350429E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r10, r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageResource(r1)
            r0 = 2131365283(0x7f0a0da3, float:1.8350427E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r10, r0)
            r1 = 8
            r0.setVisibility(r1)
            r0 = 2131365285(0x7f0a0da5, float:1.835043E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r10, r0)
            r0.setVisibility(r1)
        L_0x00d9:
            java.lang.String r0 = "cancel_button_message_id"
            int r1 = r2.getInt(r0)
            if (r1 == 0) goto L_0x00ea
            android.view.View r0 = X.AnonymousClass00T.A05(r10, r7)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r1)
        L_0x00ea:
            if (r11 == 0) goto L_0x00f4
            java.lang.String r0 = "permissions_requested"
            boolean r0 = r11.getBoolean(r0, r3)
            r10.A0A = r0
        L_0x00f4:
            boolean r6 = A0W(r10, r4)
            java.lang.String r0 = "force_ui"
            boolean r0 = r2.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x010d
            java.lang.String r0 = "perm_denial_message_id"
            int r0 = r2.getInt(r0)
            if (r0 == 0) goto L_0x010d
            if (r6 != 0) goto L_0x010d
            r8 = 0
            if (r9 == 0) goto L_0x010e
        L_0x010d:
            r8 = 1
        L_0x010e:
            X.0rz r0 = r10.A03
            boolean r1 = A0Z(r0, r4)
            if (r6 != 0) goto L_0x0235
            if (r1 != 0) goto L_0x0235
        L_0x0118:
            java.lang.String r0 = "hide_permissions_rationale"
            boolean r7 = r2.getBoolean(r0, r3)
            android.content.Intent r6 = r10.getIntent()
            java.lang.String r0 = "minimal_partial_permissions"
            java.lang.String[] r0 = r6.getStringArrayExtra(r0)
            if (r0 == 0) goto L_0x0135
            java.util.List r6 = java.util.Arrays.asList(r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r6)
            r10.A08 = r0
        L_0x0135:
            java.lang.String r0 = "extra_for_automation"
            boolean r0 = r2.getBoolean(r0, r3)
            r10.A09 = r0
            X.1DX r0 = r10.A05
            r0.A00()
            boolean r0 = r10.A0A
            if (r0 != 0) goto L_0x0271
            if (r8 != 0) goto L_0x014a
            if (r1 != 0) goto L_0x0271
        L_0x014a:
            if (r7 != 0) goto L_0x0271
            if (r9 == 0) goto L_0x01ea
            X.0qx r3 = new X.0qx
            r3.<init>()
            java.lang.String r0 = "extra_permission_title_id_v2"
            int r0 = r2.getInt(r0)
            r3.A09 = r0
            java.lang.String r0 = "extra_permission_nth_details_id_v2"
            int r0 = r2.getInt(r0)
            r3.A08 = r0
            java.lang.String r0 = "message_id_v2"
            int r0 = r2.getInt(r0)
            r3.A07 = r0
            java.lang.String r0 = "drawable_id_v2"
            int r0 = r2.getInt(r0)
            r3.A00 = r0
            java.lang.String r0 = "extra_line1_icon_id_v2"
            int r0 = r2.getInt(r0)
            r3.A01 = r0
            java.lang.String r0 = "extra_line2_icon_id_v2"
            int r0 = r2.getInt(r0)
            r3.A03 = r0
            java.lang.String r0 = "extra_line3_icon_id_v2"
            int r0 = r2.getInt(r0)
            r3.A05 = r0
            java.lang.String r0 = "extra_line1_message_id_v2"
            int r0 = r2.getInt(r0)
            r3.A02 = r0
            java.lang.String r0 = "extra_line2_message_id_v2"
            int r0 = r2.getInt(r0)
            r3.A04 = r0
            java.lang.String r0 = "extra_line3_message_id_v2"
            int r0 = r2.getInt(r0)
            r3.A06 = r0
            r3.A0E = r4
            java.lang.String r0 = r10.A07
            r3.A0A = r0
            r3.A0B = r1
            X.0pd r1 = r10.A04
            r0 = 2941(0xb7d, float:4.121E-42)
            X.0tM r2 = X.C16620tM.A02
            boolean r0 = r1.A0E(r2, r0)
            r3.A0C = r0
            X.0pd r1 = r10.A04
            r0 = 2942(0xb7e, float:4.123E-42)
            boolean r0 = r1.A0E(r2, r0)
            r3.A0D = r0
            boolean r0 = r3 instanceof X.C15460qw
            if (r0 == 0) goto L_0x01e4
            com.obwhatsapp.permissions.NotificationPermissionBottomSheet r2 = new com.obwhatsapp.permissions.NotificationPermissionBottomSheet
            r2.<init>()
        L_0x01ca:
            android.os.Bundle r0 = r3.A00()
            r2.A0T(r0)
            X.02C r1 = r10.AGM()
            java.lang.String r0 = "RequestPermissionsBottomSheet"
            r2.A1G(r1, r0)
        L_0x01da:
            java.lang.String r1 = r10.A07
            if (r1 == 0) goto L_0x0015
            X.1BN r0 = r10.A06
            r0.A01(r1)
            return
        L_0x01e4:
            com.obwhatsapp.permissions.RequestPermissionsBottomSheet r2 = new com.obwhatsapp.permissions.RequestPermissionsBottomSheet
            r2.<init>()
            goto L_0x01ca
        L_0x01ea:
            java.lang.String r0 = r10.A2B(r2, r5)
            r10.A2C(r0, r2)
            boolean r1 = r10 instanceof com.obwhatsapp.registration.directmigration.RequestPermissionFromSisterAppActivity
            r0 = 2131366502(0x7f0a1266, float:1.83529E38)
            android.view.View r2 = X.AnonymousClass00T.A05(r10, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r1 == 0) goto L_0x0219
            r0 = 2131890673(0x7f1211f1, float:1.9416044E38)
            r2.setText(r0)
            r1 = 40
            com.whatsapp.util.ViewOnClickCListenerShape5S0100000_I1_1 r0 = new com.whatsapp.util.ViewOnClickCListenerShape5S0100000_I1_1
            r0.<init>(r10, r1)
            r2.setOnClickListener(r0)
        L_0x020e:
            r0 = 2131365287(0x7f0a0da7, float:1.8350435E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r10, r0)
            r0.setVisibility(r3)
            goto L_0x01da
        L_0x0219:
            if (r5 == 0) goto L_0x022b
            r0 = 2131890673(0x7f1211f1, float:1.9416044E38)
            r2.setText(r0)
            r1 = 2
            com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0 r0 = new com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0
            r0.<init>(r10, r1)
            r2.setOnClickListener(r0)
            goto L_0x020e
        L_0x022b:
            r1 = 4
            com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0 r0 = new com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0
            r0.<init>(r4, r1, r10)
            r2.setOnClickListener(r0)
            goto L_0x020e
        L_0x0235:
            r5 = 0
            goto L_0x0118
        L_0x0238:
            java.lang.String r0 = "drawable_ids"
            int[] r6 = r2.getIntArray(r0)
            if (r6 == 0) goto L_0x00d9
            int r1 = r6.length
            r0 = 3
            if (r1 != r0) goto L_0x00d9
            r0 = 2131365283(0x7f0a0da3, float:1.8350427E38)
            android.view.View r1 = X.AnonymousClass00T.A05(r10, r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = r6[r3]
            r1.setImageResource(r0)
            r0 = 2131365284(0x7f0a0da4, float:1.8350429E38)
            android.view.View r1 = X.AnonymousClass00T.A05(r10, r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = r6[r5]
            r1.setImageResource(r0)
            r0 = 2131365285(0x7f0a0da5, float:1.835043E38)
            android.view.View r1 = X.AnonymousClass00T.A05(r10, r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2
            r0 = r6[r0]
            r1.setImageResource(r0)
            goto L_0x00d9
        L_0x0271:
            r0 = 1
            r10.A0A = r0
            X.0rz r0 = r10.A03
            A0Q(r0, r4)
            X.AnonymousClass00T.A0F(r10, r4, r3)
            r0 = 2131365287(0x7f0a0da7, float:1.8350435E38)
            android.view.View r1 = X.AnonymousClass00T.A05(r10, r0)
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.RequestPermissionActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return super.onKeyDown(i2, keyEvent);
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        String str;
        super.onRequestPermissionsResult(i2, strArr, iArr);
        if (i2 == 0) {
            setResult(-1);
            for (int i3 = 0; i3 < strArr.length; i3++) {
                if (iArr[i3] == 0) {
                    this.A03.A0K().remove(strArr[i3]).apply();
                    if ("android.permission.WRITE_CONTACTS".equals(strArr[i3])) {
                        this.A00.A00(getApplicationContext());
                        this.A01.A04();
                    }
                    Set set = this.A08;
                    if (set != null) {
                        set.remove(strArr[i3]);
                    }
                } else {
                    StringBuilder sb = new StringBuilder("request/permission/activity/");
                    sb.append(strArr[i3]);
                    sb.append(" denied");
                    Log.i(sb.toString());
                    if (this.A08 == null) {
                        setResult(0);
                    }
                }
                if (this.A07 != null) {
                    String str2 = strArr[i3];
                    boolean z2 = false;
                    if (iArr[i3] == 0) {
                        z2 = true;
                    }
                    if ("android.permission.WRITE_CONTACTS".equals(str2)) {
                        str = "access_to_contacts";
                    } else if ("android.permission.WRITE_EXTERNAL_STORAGE".equals(str2)) {
                        str = "access_to_files";
                    }
                    this.A06.A03(str, z2 ? "allow" : "not_now");
                }
            }
            Set set2 = this.A08;
            if (set2 != null && !set2.isEmpty()) {
                setResult(0);
            }
            finish();
        }
    }

    public void onResume() {
        super.onResume();
        Bundle extras = getIntent().getExtras();
        AnonymousClass00B.A06(extras);
        String[] stringArray = extras.getStringArray("permissions");
        if (stringArray != null) {
            if (this instanceof RequestPermissionFromSisterAppActivity) {
                int length = stringArray.length;
                int i2 = 0;
                while (i2 < length) {
                    if (C16260sj.A02(this, stringArray[i2])) {
                        i2++;
                    } else {
                        return;
                    }
                }
            } else {
                int length2 = stringArray.length;
                int i3 = 0;
                while (i3 < length2) {
                    String str = stringArray[i3];
                    if (this.A02.A03(str) == 0) {
                        this.A03.A0K().remove(str).apply();
                        i3++;
                    } else {
                        return;
                    }
                }
            }
        }
        if (!this.A09) {
            Log.i("request/permission/activity/permissions has been granted while we were paused");
            setResult(-1);
            finish();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("permissions_requested", this.A0A);
    }
}
