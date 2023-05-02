package X;

import android.app.Activity;
import android.util.SparseArray;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxEWrapperShape173S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.bloks.components.BkCdsBottomSheetFragment;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1K6  reason: invalid class name */
public class AnonymousClass1K6 implements C25261Jc {
    public final C25261Jc A00 = new C09040eo(new C62563Eb());
    public final AnonymousClass1K5 A01;

    public AnonymousClass1K6(AnonymousClass1K5 r3) {
        this.A01 = r3;
    }

    public static Activity A00(C14960q4 r1) {
        return (Activity) r1.A00.A02.A00().get(R.id.bloks_host_activity);
    }

    public static DialogFragment A01(String str, List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return null;
            }
            AnonymousClass01A r3 = (AnonymousClass01A) list.get(size);
            if (!(r3 instanceof C13550mZ) || !(r3 instanceof DialogFragment)) {
                DialogFragment A012 = A01(str, r3.A0F().A0U.A02());
                if (A012 != null) {
                    return A012;
                }
            } else {
                DialogFragment dialogFragment = (DialogFragment) r3;
                for (C05070Pd r0 : ((BkCdsBottomSheetFragment) ((C13550mZ) dialogFragment)).A1J().A0C) {
                    if (str.equals(r0.A02)) {
                        return dialogFragment;
                    }
                }
                continue;
            }
        }
    }

    public static C14960q4 A02(Object obj) {
        if (obj instanceof C14960q4) {
            return (C14960q4) obj;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(obj.getClass().getSimpleName());
        sb.append("is not an instance of ");
        sb.append("BloksInterpreterEnvironment");
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C31201dg A03(X.C31201dg r2, int r3) {
        /*
            int r1 = r2.A01
            r0 = 13784(0x35d8, float:1.9315E-41)
            if (r1 != r0) goto L_0x0029
            r1 = 42
            android.util.SparseArray r0 = r2.A02
            java.lang.Object r1 = r0.get(r1)
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L_0x0029
            java.util.List r1 = (java.util.List) r1
        L_0x0014:
            java.util.Iterator r2 = r1.iterator()
        L_0x0018:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002e
            java.lang.Object r1 = r2.next()
            X.1dg r1 = (X.C31201dg) r1
            int r0 = r1.A01
            if (r0 != r3) goto L_0x0018
            return r1
        L_0x0029:
            java.util.List r1 = java.util.Collections.emptyList()
            goto L_0x0014
        L_0x002e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1K6.A03(X.1dg, int):X.1dg");
    }

    public static Object A04(List list) {
        Object A04;
        Class<C13550mZ> cls = C13550mZ.class;
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            AnonymousClass01A r1 = (AnonymousClass01A) list.get(size);
            if (cls.isInstance(r1)) {
                return cls.cast(r1);
            }
            A04 = A04(r1.A0F().A0U.A02());
        } while (A04 == null);
        return A04;
    }

    public static String A05(C31201dg r4) {
        int i2 = r4.A01;
        boolean z2 = false;
        if (i2 == 13647) {
            z2 = true;
        }
        if (!z2) {
            if (i2 == 13784) {
                C31201dg A03 = A03(r4, 15855);
                if (A03 != null) {
                    return A03.A0J(40);
                }
            } else {
                throw new IllegalArgumentException("screen should be an instance of BloksScreenData or BloksScreenV2Data");
            }
        }
        return r4.A0J(35);
    }

    public static String A06(C31201dg r4) {
        int i2 = r4.A01;
        boolean z2 = false;
        if (i2 == 13647) {
            z2 = true;
        }
        int i3 = 40;
        if (!z2) {
            if (i2 == 13784) {
                i3 = 45;
            } else {
                throw new IllegalArgumentException("screen should be an instance of BloksScreenData or BloksScreenV2Data");
            }
        }
        return r4.A0K(i3, "0");
    }

    public static HashMap A07(Map map) {
        String str;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            boolean z2 = entry.getValue() instanceof Number;
            Object key = entry.getKey();
            if (!z2) {
                str = null;
                if (entry.getValue() == null) {
                    hashMap.put(key, str);
                }
            }
            str = entry.getValue().toString();
            hashMap.put(key, str);
        }
        return hashMap;
    }

    public static HashMap A08(Map map) {
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            Object key = entry.getKey();
            boolean z2 = key instanceof Number;
            if (value == null) {
                hashMap.put((z2 || key != null) ? key.toString() : null, (Object) null);
            } else {
                String obj = (z2 || key != null) ? key.toString() : null;
                Object value2 = entry.getValue();
                hashMap.put(obj, ((value2 instanceof Number) || value2 != null) ? value2.toString() : null);
            }
        }
        return hashMap;
    }

    public static final void A09(C14990q7 r3, C14960q4 r4, C31201dg r5) {
        C14930q1 A0H = r5.A0H(35);
        if (A0H != null) {
            C14940q2 r1 = new C14940q2();
            r1.A03(r5, 0);
            r1.A03(r3, 1);
            C14980q6.A00(r4, new C14950q3(r1.A00), A0H);
        }
    }

    public static void A0A(AnonymousClass22A r5, C29671b0 r6) {
        C14930q1 A9V = r6.A9V();
        C14980q6.A00(C14960q4.A00(C62183Bz.A01(C90154da.A00().A00, new SparseArray(), (C14910pz) null, r5, (String) null), (List) null), C14950q3.A01, A9V);
    }

    public final Object A0B(C14960q4 r11, C14950q3 r12, boolean z2) {
        List list = r12.A00;
        String str = (String) list.get(0);
        C31421e9 r2 = ((C31411e8) list.get(2)).A00;
        C31421e9 r1 = ((C31411e8) list.get(3)).A00;
        AnonymousClass1K5 r4 = this.A01;
        HashMap A07 = A07((Map) list.get(1));
        C14960q4 r7 = r11;
        if (z2) {
            r4.A5B(new IDxEWrapperShape173S0100000_2_I0(r2, 1), new IDxEWrapperShape173S0100000_2_I0(r1, 0), r7, str, A07);
            return null;
        }
        r4.A5A(new IDxEWrapperShape173S0100000_2_I0(r2, 4), new IDxEWrapperShape173S0100000_2_I0(r1, 2), r7, str, A07);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v174, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v176 */
    /* JADX WARNING: type inference failed for: r3v280 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x03d7, code lost:
        r6.A08 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x03d9, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x03dc, code lost:
        r0 = r6.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03de, code lost:
        if (r0 == null) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x03e0, code lost:
        r6.A08 = true;
        r0.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x03e6, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x03e8, code lost:
        r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03ee, code lost:
        r0 = (com.obwhatsapp.bloks.components.BkCdsBottomSheetFragment) ((X.C13550mZ) ((androidx.fragment.app.DialogFragment) r2.get(r2.size() - 1)));
        r4 = r0.A1J();
        r2 = r0.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x040d, code lost:
        if (r4.A0C.size() == 1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x040f, code lost:
        r4.A08(r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0065, code lost:
        if (r0 == null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0412, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0413, code lost:
        r2 = A00(r2);
        r9 = (java.lang.String) r8.A00.get(0);
        r1 = X.AnonymousClass0T1.A01(X.AnonymousClass0T1.A00(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0427, code lost:
        if (r1 == null) goto L_0x043f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x042d, code lost:
        if (r1.isEmpty() != false) goto L_0x043f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x042f, code lost:
        r0 = A01(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0433, code lost:
        r0 = (X.C13550mZ) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0435, code lost:
        if (r0 != null) goto L_0x0441;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0437, code lost:
        X.C29691b2.A00("CDSBloksBottomSheetController", "Cannot remove without an existing bottom sheet - no bottom sheet contains the screen ID");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x043e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0067, code lost:
        r3 = A07(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x043f, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0441, code lost:
        r2 = ((com.obwhatsapp.bloks.components.BkCdsBottomSheetFragment) r0).A1J();
        r1 = r2.A0C;
        r0 = (X.C05070Pd) r1.peekFirst();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0451, code lost:
        if (r0 == null) goto L_0x15c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0459, code lost:
        if (r9.equals(r0.A02) != false) goto L_0x15c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x045b, code lost:
        r7 = r1.iterator();
        r6 = r2.A0A.iterator();
        r5 = r2.A0B.iterator();
        r4 = null;
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0471, code lost:
        if (r7.hasNext() == false) goto L_0x15cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0473, code lost:
        r1 = (X.C05070Pd) r7.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x047d, code lost:
        if (r6.hasNext() == false) goto L_0x0483;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006b, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x047f, code lost:
        r4 = r6.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0487, code lost:
        if (r5.hasNext() == false) goto L_0x048d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0489, code lost:
        r2 = r5.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0493, code lost:
        if (r9.equals(r1.A02) == false) goto L_0x046d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0495, code lost:
        r1.A00.A07();
        r7.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x049d, code lost:
        if (r4 == null) goto L_0x04a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x049f, code lost:
        r6.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x04a2, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006c, code lost:
        if (r5 == 0) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x04a4, code lost:
        r5.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x04a7, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x04a8, code lost:
        X.C18450wi.A0H(r8, 0);
        X.C18450wi.A0H(r2, 1);
        r10 = r8.A00;
        r7 = r10.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x04b4, code lost:
        if (r7 == null) goto L_0x15ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x04b6, code lost:
        r7 = (X.C14990q7) r7;
        r8 = r10.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x04bc, code lost:
        if (r8 == null) goto L_0x15e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x04be, code lost:
        r8 = (java.lang.String) r8;
        r4 = r10.get(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x04c6, code lost:
        if (r4 == null) goto L_0x15de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x04c8, code lost:
        r6 = ((java.lang.Number) r4).intValue();
        r4 = r10.get(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x04d3, code lost:
        if (r4 == null) goto L_0x15d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006e, code lost:
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x04d5, code lost:
        r9 = ((java.lang.Number) r4).intValue();
        r5 = X.C31411e8.A01(r10.get(4));
        r4 = X.C31411e8.A01(r10.get(5));
        r14 = r7.A00;
        r10 = new X.C84764Lu(r7, r2, r5, r4);
        r11 = new X.AnonymousClass4DH(r15);
        r7 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x04fa, code lost:
        if (r9 <= 0) goto L_0x06e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x04fc, code lost:
        if (r6 <= 0) goto L_0x06e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        r2 = X.C90214dk.A00(r8);
        r4 = r2.getPath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0506, code lost:
        if (r4 != null) goto L_0x052c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0508, code lost:
        r6 = X.AnonymousClass0KZ.INVALID_PARAMETER;
        r4 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x050d, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x050f, code lost:
        X.C14980q6.A00(r10.A01, new X.C14950q3(X.AnonymousClass1JA.A0R(r10.A00, r6.toString())), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x052c, code lost:
        r13 = new java.io.File(r4);
        r5 = new X.C007703o(r13.getCanonicalPath()).A07(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006f, code lost:
        r1 = r4.getIntent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x053f, code lost:
        if (r5 == 6) goto L_0x0545;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0543, code lost:
        if (r5 != 8) goto L_0x0547;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0545, code lost:
        r7 = r6;
        r6 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0547, code lost:
        r8 = r14.getContentResolver().openInputStream(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x054f, code lost:
        if (r8 != null) goto L_0x0575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0551, code lost:
        r6 = X.AnonymousClass0KZ.INTERNAL_ERROR;
        r4 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0556, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0558, code lost:
        X.C14980q6.A00(r10.A01, new X.C14950q3(X.AnonymousClass1JA.A0R(r10.A00, r6.toString())), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0073, code lost:
        if (r3 == null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        r4 = new android.graphics.BitmapFactory.Options();
        r4.inJustDecodeBounds = true;
        android.graphics.BitmapFactory.decodeStream(r8, (android.graphics.Rect) null, r4);
        r12 = new android.graphics.Rect(0, 0, r4.outWidth, r4.outHeight);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:?, code lost:
        r8.close();
        r5 = r12.width();
        r4 = r12.height();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0593, code lost:
        if (r5 <= 0) goto L_0x06ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0595, code lost:
        if (r4 <= 0) goto L_0x06ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0597, code lost:
        if (r5 > r6) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0599, code lost:
        if (r4 > r7) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x059b, code lost:
        r6 = r10.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x059d, code lost:
        if (r6 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x059f, code lost:
        X.C14980q6.A00(r10.A01, new X.C14950q3(X.AnonymousClass1JA.A0R(r10.A00, r2.toString())), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0075, code lost:
        r1.putExtra("finish_activity_result", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x05bc, code lost:
        r8 = new android.graphics.Rect(0, 0, r6, r7);
        r6 = java.lang.Math.max((((double) r12.width()) * 1.0d) / ((double) r8.width()), (((double) r12.height()) * 1.0d) / ((double) r8.height()));
        r7 = new android.graphics.Rect(0, 0, (int) (((double) r12.width()) / r6), (int) (((double) r12.height()) / r6));
        r8 = r14.getContentResolver().openInputStream(r2);
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x05fb, code lost:
        if (r8 == null) goto L_0x0696;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        r5 = android.graphics.BitmapFactory.decodeStream(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0601, code lost:
        if (r5 == null) goto L_0x060f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0603, code lost:
        r6 = android.graphics.Bitmap.createScaledBitmap(r5, r7.width(), r7.height(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0612, code lost:
        if (r6 == null) goto L_0x0696;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0614, code lost:
        r4 = r11.A00;
        r2 = new java.lang.StringBuilder();
        r2.append(java.util.UUID.randomUUID().toString());
        r2.append(".jpg");
        r5 = r4.AC7(r2.toString());
        r4 = new java.io.FileOutputStream(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007a, code lost:
        r4.setResult(r2, r1);
        r4.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
        r6.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, r4);
        r4.flush();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        r4.close();
        r4 = new X.C007703o(r5.getCanonicalPath());
        r0 = new X.C007703o(r13.getCanonicalPath()).A07(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x065b, code lost:
        if (r0 == 0) goto L_0x0667;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x065d, code lost:
        r4.A0O(java.lang.String.valueOf(r0));
        r4.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0667, code lost:
        r5 = android.net.Uri.fromFile(r5);
        X.C18450wi.A0H(r5, 0);
        r4 = r10.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0671, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0673, code lost:
        X.C14980q6.A00(r10.A01, new X.C14950q3(X.AnonymousClass1JA.A0R(r10.A00, r5.toString())), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0691, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0082, code lost:
        r3 = r8.A00;
        r3 = ((java.lang.Boolean) r3.get(1)).booleanValue();
        r15.Afo(A00(r2), (android.app.ProgressDialog) r2.A00.A02.A00().get(com.obwhatsapp.R.id.bloks_host_progress_dialog), (java.lang.String) r3.get(0), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:?, code lost:
        r6 = X.AnonymousClass0KZ.INTERNAL_ERROR;
        r4 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x069b, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x069d, code lost:
        X.C14980q6.A00(r10.A01, new X.C14950q3(X.AnonymousClass1JA.A0R(r10.A00, r6.toString())), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x06ba, code lost:
        r6 = X.AnonymousClass0KZ.INVALID_PARAMETER;
        r4 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x06bf, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x06c1, code lost:
        X.C14980q6.A00(r10.A01, new X.C14950q3(X.AnonymousClass1JA.A0R(r10.A00, r6.toString())), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x06de, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ae, code lost:
        r15.Agu((java.lang.String) r8.A00.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x06e3, code lost:
        r6 = X.AnonymousClass0KZ.INVALID_PARAMETER;
        r4 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x06e8, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x06ea, code lost:
        X.C14980q6.A00(r10.A01, new X.C14950q3(X.AnonymousClass1JA.A0R(r10.A00, r6.toString())), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0707, code lost:
        r5 = X.AnonymousClass0KZ.INTERNAL_ERROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x070a, code lost:
        r5 = X.AnonymousClass0KZ.FILE_NOT_FOUND;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bb, code lost:
        r15.A82(A00(r2), new com.facebook.redex.IDxEWrapperShape173S0100000_2_I0(((X.C31411e8) r8.A00.get(0)).A00, 6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x070d, code lost:
        r5 = X.AnonymousClass0KZ.INVALID_PARAMETER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x070f, code lost:
        X.C18450wi.A0H(r5, 0);
        r4 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0715, code lost:
        if (r4 != null) goto L_0x0717;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0717, code lost:
        X.C14980q6.A00(r10.A01, new X.C14950q3(X.AnonymousClass1JA.A0R(r10.A00, r5.toString())), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0733, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0734, code lost:
        r4 = r8.A00;
        r5 = (java.lang.String) r4.get(0);
        r4 = (java.lang.String) r4.get(1);
        r2 = A00(r2).getIntent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x074a, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x074c, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d4, code lost:
        r1 = (java.util.Map) r8.A00.get(0);
        r0 = A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0752, code lost:
        switch(r4.hashCode()) {
            case -891985903: goto L_0x0767;
            case 64711720: goto L_0x0775;
            case 97526364: goto L_0x0786;
            case 1958052158: goto L_0x0798;
            default: goto L_0x0755;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0755, code lost:
        r0 = new java.lang.StringBuilder("WABLOKS: getIntentParameter type not supported: ");
        r0.append(r4);
        com.whatsapp.util.Log.e(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0766, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x076e, code lost:
        if (r4.equals("string") == false) goto L_0x0755;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0774, code lost:
        return r2.getStringExtra(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x077b, code lost:
        if (r4.equals("boolean") == false) goto L_0x0755;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e0, code lost:
        if (r1 == null) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0781, code lost:
        if (r2.getBooleanExtra(r5, false) == false) goto L_0x15f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0783, code lost:
        return "1";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x078c, code lost:
        if (r4.equals("float") == false) goto L_0x0755;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0797, code lost:
        return java.lang.Float.toString(r2.getFloatExtra(r5, 0.0f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x079e, code lost:
        if (r4.equals("integer") == false) goto L_0x0755;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e2, code lost:
        A07(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x07a8, code lost:
        return java.lang.Integer.toString(r2.getIntExtra(r5, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x07a9, code lost:
        r7 = (X.C31201dg) r8.A00.get(0);
        r0 = A00(r2);
        X.C62563Eb.A02(r2, r8, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x07b8, code lost:
        if (r7 == null) goto L_0x07bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x07ba, code lost:
        r7.A0H(35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x07bd, code lost:
        r1 = X.AnonymousClass0T1.A01(X.AnonymousClass0T1.A00(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x07c5, code lost:
        if (r1 == null) goto L_0x07e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x07cb, code lost:
        if (r1.isEmpty() != false) goto L_0x07e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x07cd, code lost:
        r0 = A04(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x07d1, code lost:
        r0 = (X.C13550mZ) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e5, code lost:
        r0.onBackPressed();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x07d3, code lost:
        if (r0 == null) goto L_0x15f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x07d5, code lost:
        r4 = ((com.obwhatsapp.bloks.components.BkCdsBottomSheetFragment) r0).A1J();
        r4.A06 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x07e2, code lost:
        if (r4.A04 != X.C03880Kf.FULL_SCREEN) goto L_0x07e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x07e4, code lost:
        r4.A08 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x07e6, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x07e7, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x07e9, code lost:
        r0 = r4.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x07eb, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x07ed, code lost:
        r4.A08 = true;
        r0.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x07f2, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ea, code lost:
        r5 = java.util.Collections.unmodifiableList(r8.A00);
        r4 = new java.lang.StringBuilder("[Bloks logging] ");
        r2 = (java.lang.String) r5.get(0);
        r4.append((java.lang.String) r5.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x07f3, code lost:
        X.C18450wi.A0H(r8, 0);
        X.C18450wi.A0H(r2, 1);
        r4 = r8.A00;
        r6 = r4.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x07ff, code lost:
        if (r6 == null) goto L_0x1607;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0801, code lost:
        r6 = (X.C14990q7) r6;
        r8 = r4.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0807, code lost:
        if (r8 == null) goto L_0x15ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0809, code lost:
        r8 = (X.C31201dg) r8;
        r7 = r8.A0H(35);
        r5 = r8.A0J(36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0815, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x081b, code lost:
        if (r5.isEmpty() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0821, code lost:
        switch(r5.hashCode()) {
            case -1367751899: goto L_0x0825;
            case -196315310: goto L_0x0830;
            case -94789412: goto L_0x083b;
            default: goto L_0x0824;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x010a, code lost:
        if (r5.get(2) == null) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0824, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x082b, code lost:
        if (r5.equals("camera") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x082d, code lost:
        r5 = "android.permission.CAMERA";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0836, code lost:
        if (r5.equals("gallery") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0838, code lost:
        r5 = "android.permission.WRITE_EXTERNAL_STORAGE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0841, code lost:
        if (r5.equals("read_contacts") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0843, code lost:
        r5 = "android.permission.READ_CONTACTS";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x010c, code lost:
        r5 = ((java.util.Map) r5.get(2)).entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0845, code lost:
        r15.AcH(A00(r2), new X.C100734w7(r6, r2, r7), new java.lang.String[]{r5});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0855, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0856, code lost:
        r2 = r8.A00;
        r3 = (java.util.Map) r2.get(0);
        r2 = r2.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0862, code lost:
        if (r3 == null) goto L_0x086d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0868, code lost:
        if (r3.size() <= 0) goto L_0x086d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x086a, code lost:
        r0 = "properties";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x086d, code lost:
        r1 = new java.lang.StringBuilder();
        r0 = "WaExtensions/GetChildNode Cannot find the attribute [";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0875, code lost:
        r2 = r8.A00;
        r3 = (java.util.Map) r2.get(0);
        r2 = r2.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0881, code lost:
        if (r3 == null) goto L_0x089b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0887, code lost:
        if (r3.size() <= 0) goto L_0x089b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0889, code lost:
        r0 = "children";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x088b, code lost:
        r0 = (java.util.Map) r3.get(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0891, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0893, code lost:
        r3 = r0.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0897, code lost:
        if (r3 != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x089b, code lost:
        r1 = new java.lang.StringBuilder();
        r0 = "WaExtensions/GetChildNode Cannot find the child node [";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x08a2, code lost:
        r1.append(r0);
        r1.append(r2);
        r1.append("] on a null or empty parent node");
        r3 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x08b3, code lost:
        switch(r10.hashCode()) {
            case 97: goto L_0x08c1;
            case 100: goto L_0x08ca;
            case 101: goto L_0x08cc;
            case 105: goto L_0x08d3;
            case 118: goto L_0x08dc;
            case 119: goto L_0x08e6;
            default: goto L_0x08b6;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x011e, code lost:
        if (r5.hasNext() == false) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x08b6, code lost:
        r1 = new java.lang.StringBuilder("[Bloks logging] incorrect level: ");
        r1.append(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x08c7, code lost:
        if (r10.equals("a") != false) goto L_0x0963;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x08ca, code lost:
        r0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x08d0, code lost:
        if (r10.equals("e") != false) goto L_0x0918;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x08d9, code lost:
        if (r10.equals("i") != false) goto L_0x0968;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x08dc, code lost:
        r0 = "v";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0120, code lost:
        r1 = (java.util.Map.Entry) r5.next();
        r4.append(" ");
        r4.append((java.lang.String) r1.getKey());
        r4.append(" : ");
        r1 = r1.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x08e3, code lost:
        if (r10.equals(r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x08ed, code lost:
        if (r10.equals("w") != false) goto L_0x096d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x08f0, code lost:
        r2 = (java.lang.String) r8.A00.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x08fc, code lost:
        if (android.text.TextUtils.isEmpty(r2) == false) goto L_0x091d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x08fe, code lost:
        r3 = "WaExtensions/evaluate/bk.action.io.clipboard.SetString: text cannot be null or empty";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0904, code lost:
        switch("e".hashCode()) {
            case 97: goto L_0x0936;
            case 100: goto L_0x095c;
            case 101: goto L_0x093f;
            case 105: goto L_0x0946;
            case 118: goto L_0x0959;
            case 119: goto L_0x094f;
            default: goto L_0x0907;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0907, code lost:
        r1 = new java.lang.StringBuilder("[Bloks logging] incorrect level: ");
        r1.append("e");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0911, code lost:
        com.whatsapp.util.Log.e(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0918, code lost:
        com.whatsapp.util.Log.e(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x013f, code lost:
        if ((r1 instanceof java.lang.Number) != false) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x091d, code lost:
        r1 = r15.AAf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0921, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:?, code lost:
        r1.setPrimaryClip(android.content.ClipData.newPlainText(r2, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x092c, code lost:
        r3 = "bkinterpreter/clipboard/";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0932, code lost:
        switch("e".hashCode()) {
            case 97: goto L_0x0936;
            case 100: goto L_0x095c;
            case 101: goto L_0x093f;
            case 105: goto L_0x0946;
            case 118: goto L_0x0959;
            case 119: goto L_0x094f;
            default: goto L_0x0935;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x093c, code lost:
        if ("e".equals("a") != false) goto L_0x0963;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0141, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0943, code lost:
        if ("e".equals("e") != false) goto L_0x0918;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x094c, code lost:
        if ("e".equals("i") != false) goto L_0x0968;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0956, code lost:
        if ("e".equals("w") != false) goto L_0x096d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0959, code lost:
        r10 = "v";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0960, code lost:
        if ("e".equals(r10) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0963, code lost:
        com.whatsapp.util.Log.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0968, code lost:
        com.whatsapp.util.Log.i(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0142, code lost:
        if (r1 == null) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x096d, code lost:
        com.whatsapp.util.Log.w(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0144, code lost:
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0148, code lost:
        r4.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x014c, code lost:
        r3 = r4.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0154, code lost:
        switch(r2.hashCode()) {
            case 97: goto L_0x0163;
            case 100: goto L_0x017f;
            case 101: goto L_0x016c;
            case 105: goto L_0x0173;
            case 118: goto L_0x017c;
            case 119: goto L_0x0186;
            default: goto L_0x0157;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0157, code lost:
        r1 = new java.lang.StringBuilder("[Bloks logging] incorrect level: ");
        r1.append(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        r10 = "d";
        r3 = null;
        r8 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0169, code lost:
        if (r2.equals("a") != false) goto L_0x0963;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0cba, code lost:
        if (r3 == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0cc2, code lost:
        return r15.AAA();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0cc7, code lost:
        return A0B(r2, r8, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0170, code lost:
        if (r2.equals("e") != false) goto L_0x0918;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0ccc, code lost:
        return r15.AEz();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0cd1, code lost:
        return A0B(r2, r8, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0cda, code lost:
        return java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0cdb, code lost:
        r3 = r8.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0cf1, code lost:
        return r15.A9d(((java.lang.Number) r3.get(0)).intValue(), (java.lang.String) r3.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0cf2, code lost:
        r2 = r8.A00;
        r15.Ab6(new com.facebook.redex.IDxMWrapperShape226S0100000_2_I0(r2.get(2), 8), (java.util.Map) null, ((java.lang.Number) r2.get(0)).intValue(), ((java.lang.Number) r2.get(1)).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0d16, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0d17, code lost:
        r3 = r8.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0d35, code lost:
        return java.lang.Boolean.valueOf(java.util.regex.Pattern.compile((java.lang.String) r3.get(1)).matcher((java.lang.String) r3.get(0)).matches());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0d36, code lost:
        r6 = r8.A00;
        r5 = (java.lang.String) r6.get(0);
        r4 = r6.size() - 1;
        r3 = new java.lang.String[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0d45, code lost:
        if (r0 >= r4) goto L_0x0d51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x0d47, code lost:
        r2 = r0 + 1;
        r3[r0] = r6.get(r2);
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0d55, code lost:
        return java.text.MessageFormat.format(r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0d56, code lost:
        r4 = r8.A00;
        r15.Ab7(((java.lang.Number) r4.get(0)).intValue(), (java.lang.String) r4.get(2), ((java.lang.Number) r4.get(1)).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0d75, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0d76, code lost:
        return "CONSUMER";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0d79, code lost:
        r5 = r8.A00;
        r15.AbB((java.lang.String) r5.get(2), (java.util.Map) r5.get(3), ((java.lang.Number) r5.get(0)).intValue(), ((java.lang.Number) r5.get(1)).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0179, code lost:
        if (r2.equals("i") != false) goto L_0x0968;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0d9f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0da0, code lost:
        r4 = r8.A00;
        r15.AbA(((java.lang.Number) r4.get(0)).intValue(), ((java.lang.Number) r4.get(1)).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0db9, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0dba, code lost:
        r15.AZv(A00(r2), (java.lang.String) r8.A00.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0dc9, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0dca, code lost:
        r9 = (X.C31201dg) r8.A00.get(0);
        r6 = X.C62563Eb.A02(r2, r8, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0dde, code lost:
        return 0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0ddf, code lost:
        r2 = r8.A00;
        r15.Ab4((X.C108615Or) null, (java.util.Map) r2.get(3), ((java.lang.Number) r2.get(0)).intValue(), ((java.lang.Number) r2.get(1)).intValue(), ((java.lang.Number) r2.get(2)).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0e0c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x017c, code lost:
        r10 = "v";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0e0d, code lost:
        r7 = r8.A00;
        r5 = (X.C31201dg) r7.get(0);
        r4 = (X.C31201dg) r7.get(1);
        r7 = A08((java.util.Map) r7.get(2));
        r6 = A05(r5);
        r23 = A06(r5);
        r8 = new X.AnonymousClass4DF(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0e32, code lost:
        if (r4 == null) goto L_0x0fa4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0e34, code lost:
        r11 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0e3c, code lost:
        if (r11 != 14059) goto L_0x0f3e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0e3e, code lost:
        r12 = r4.A0P(36, false);
        r11 = X.AnonymousClass0XG.A01(r4.A0K(40, "FULL_SHEET"));
        r10 = X.AnonymousClass0XG.A00(r4.A0K(46, "NEVER_ANIMATED"));
        r17 = r4.A0H(42);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0e5e, code lost:
        if (r12 == false) goto L_0x0f3a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0e60, code lost:
        r12 = X.C03860Kd.DISABLED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0e64, code lost:
        if (r11 != X.AnonymousClass0JR.FULL_SHEET) goto L_0x0f36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0e66, code lost:
        r13 = X.C03880Kf.FULL_SHEET;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0e6c, code lost:
        switch(r10.ordinal()) {
            case 0: goto L_0x0f2a;
            case 1: goto L_0x0f2e;
            case 2: goto L_0x0e6f;
            case 3: goto L_0x0f32;
            default: goto L_0x0e6f;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0e6f, code lost:
        r10 = X.C03870Ke.STATIC;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0e71, code lost:
        r9 = new X.AnonymousClass0XG(r10, X.C03850Kc.AUTO, r12, r13, (X.C14990q7) null, r2, r4, r17, false, false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0e82, code lost:
        r4 = com.obwhatsapp.bloks.components.BkCdsBottomSheetFragment.A01(r9, r6);
        r9 = r2.A00;
        r4.A02 = r9.A02;
        r10 = new X.C04890Ok();
        r10.A01 = r6;
        r10.A02 = r7;
        r10.A00 = 812974081;
        r7 = new X.C05280Qa(r10);
        r10 = A03(r5, 15932);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0ea7, code lost:
        if (r10 == null) goto L_0x0ece;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0ea9, code lost:
        r11 = r10.A0K(38, "adjust_pan");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0eb3, code lost:
        switch(r11.hashCode()) {
            case -1009740956: goto L_0x0f0d;
            case -205076707: goto L_0x0f18;
            case 1976678381: goto L_0x0f23;
            default: goto L_0x0eb6;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0eb6, code lost:
        r12 = new java.lang.StringBuilder("Unexpected soft input mode ");
        r12.append(r11);
        r12.append("; using default instead");
        X.C29691b2.A00("WindowSoftInputUtils", r12.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0ece, code lost:
        r24 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0183, code lost:
        if (r2.equals(r10) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0ed0, code lost:
        if (r10 == null) goto L_0x0f0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0ed2, code lost:
        r21 = r10.A0H(40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0ed8, code lost:
        r6 = (X.C001000l) A00(r2);
        r12 = r5.A01;
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0ee3, code lost:
        if (r12 != 13647) goto L_0x0ee6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0ee5, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0ee6, code lost:
        r10 = 43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0ee8, code lost:
        if (r11 != false) goto L_0x0ef4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0eea, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0eed, code lost:
        if (r12 != 13784) goto L_0x0ef0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0eef, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0024, code lost:
        switch(r13) {
            case 0: goto L_0x154f;
            case 1: goto L_0x14b4;
            case 2: goto L_0x0cd2;
            case 3: goto L_0x149a;
            case 4: goto L_0x1411;
            case 5: goto L_0x13ec;
            case 6: goto L_0x136c;
            case 7: goto L_0x0ccd;
            case 8: goto L_0x0338;
            case 9: goto L_0x135c;
            case 10: goto L_0x1342;
            case 11: goto L_0x1322;
            case 12: goto L_0x0cc8;
            case 13: goto L_0x12fb;
            case 14: goto L_0x02f6;
            case 15: goto L_0x08f0;
            case 16: goto L_0x0899;
            case 17: goto L_0x121d;
            case 18: goto L_0x11ec;
            case 19: goto L_0x11c1;
            case 20: goto L_0x11a1;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_labels_singleLine :int: goto L_0x002d;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_labels_ellipsize :int: goto L_0x117a;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_labels_maxLines :int: goto L_0x0413;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_fab_size :int: goto L_0x02da;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_labels_style :int: goto L_0x1156;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_labels_customFont :int: goto L_0x112e;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_shadowColor :int: goto L_0x0046;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_shadowRadius :int: goto L_0x10a3;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_shadowXOffset :int: goto L_0x0875;
            case 30: goto L_0x02b8;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_colorNormal :int: goto L_0x102f;
            case 32: goto L_0x0295;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_colorRipple :int: goto L_0x0fe9;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_openDirection :int: goto L_0x0899;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_backgroundColor :int: goto L_0x025c;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_fab_label :int: goto L_0x02da;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_fab_show_animation :int: goto L_0x0856;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_fab_hide_animation :int: goto L_0x0239;
            case 39: goto L_0x0228;
            case 40: goto L_0x0e0d;
            case 41: goto L_0x01fb;
            case 42: goto L_0x0ddf;
            case 43: goto L_0x0dd8;
            case 44: goto L_0x01e1;
            case 45: goto L_0x0dca;
            case com.obwhatsapp.calling.crypto.DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH :int: goto L_0x0899;
            case 47: goto L_0x07f3;
            case 48: goto L_0x0cc3;
            case 49: goto L_0x0dba;
            case com.google.android.search.verification.client.SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS :int: goto L_0x0da0;
            case 51: goto L_0x0d79;
            case 52: goto L_0x02f6;
            case 53: goto L_0x01c9;
            case 54: goto L_0x0d76;
            case 55: goto L_0x0046;
            case 56: goto L_0x07a9;
            case 57: goto L_0x01b8;
            case 58: goto L_0x01a1;
            case 59: goto L_0x0cbe;
            case 60: goto L_0x00ae;
            case 61: goto L_0x003d;
            case 62: goto L_0x0046;
            case 63: goto L_0x0734;
            case android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ACCESSIBILITY_FOCUS :int: goto L_0x04a8;
            case 65: goto L_0x0d56;
            case 66: goto L_0x0190;
            case 67: goto L_0x00ea;
            case 68: goto L_0x002d;
            case 69: goto L_0x00d4;
            case 70: goto L_0x00bb;
            case 71: goto L_0x0d36;
            case X.2EA.A02 :int: goto L_0x0899;
            case 73: goto L_0x0899;
            case 74: goto L_0x002e;
            case 75: goto L_0x1322;
            case 76: goto L_0x034d;
            case com.obwhatsapp.youbasha.ui.activity.CallsPrivacy.NOINTERNET_CALLING :int: goto L_0x0082;
            case 78: goto L_0x0d17;
            case 79: goto L_0x0899;
            case 80: goto L_0x0cf2;
            case 81: goto L_0x0cdb;
            case 82: goto L_0x004f;
            default: goto L_0x0027;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0ef0, code lost:
        if (r10 == false) goto L_0x0fe0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0ef2, code lost:
        r10 = 38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0ef4, code lost:
        r19 = X.AnonymousClass2Wa.A00(r2, r5.A0G(r10));
        r2 = new X.AnonymousClass050(r6.AGM());
        r2.A0I((java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0f0a, code lost:
        r21 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0f13, code lost:
        if (r11.equals("adjust_resize") == false) goto L_0x0eb6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0f15, code lost:
        r24 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0f1e, code lost:
        if (r11.equals("adjust_nothing") == false) goto L_0x0eb6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0f20, code lost:
        r24 = 48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x018d, code lost:
        if (r2.equals("w") != false) goto L_0x096d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0f27, code lost:
        if (r11.equals("adjust_pan") != false) goto L_0x0ece;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0f2a, code lost:
        r10 = X.C03870Ke.ANIMATED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0f2e, code lost:
        r10 = X.C03870Ke.DISABLED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0f32, code lost:
        r10 = X.C03870Ke.ANIMATED_WHILE_LOADING;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0f36, code lost:
        r13 = X.C03880Kf.HALF_SHEET;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0f3a, code lost:
        r12 = X.C03860Kd.ENABLED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0f40, code lost:
        if (r11 != 16085) goto L_0x0f8b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0f42, code lost:
        r11 = new X.AnonymousClass0XG(X.C03870Ke.A00(r4.A0K(35, "static")), X.C03850Kc.A00(r4.A0K(43, com.AssemMods.translator.Language.AUTO_DETECT)), X.C03860Kd.A00(r4.A0K(36, com.AssemMods.translator.Language.AUTO_DETECT)), X.C03880Kf.A00(r4.A0K(38, "full_sheet")), (X.C14990q7) null, r2, r4, r4.A0H(40), r4.A0P(48, false), false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0190, code lost:
        r15.AZy(A00(r2), (java.lang.String) r8.A00.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0f8b, code lost:
        r10 = new java.lang.StringBuilder("Error matching OpenCDSSCreenConfig from options styleId: ");
        r10.append(r4.A0G(132));
        X.C29691b2.A00("CdsOpenScreenConfig", r10.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0fa4, code lost:
        r9 = X.AnonymousClass0XG.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:?, code lost:
        r4.A0C = false;
        r4.A0D = true;
        r2.A0C(r4, (java.lang.String) null);
        r4.A0F = false;
        r4.A00 = r2.A00(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0fba, code lost:
        r2.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0fe8, code lost:
        throw new java.lang.IllegalArgumentException("screen should be an instance of BloksScreenData or BloksScreenV2Data");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01a1, code lost:
        r4 = r8.A00;
        r15.AZx(A00(r2), (java.lang.String) r4.get(0), (java.lang.String) r4.get(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0fe9, code lost:
        r4 = ((X.C31201dg) r8.A00.get(0)).A0J(35);
        r1 = X.AnonymousClass0T1.A01(X.AnonymousClass0T1.A00(A00(r2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x1001, code lost:
        if (r1 == null) goto L_0x1021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x1007, code lost:
        if (r1.isEmpty() != false) goto L_0x1021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x1009, code lost:
        r0 = A04(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x100d, code lost:
        r0 = (X.C13550mZ) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x100f, code lost:
        if (r0 == null) goto L_0x1027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x1011, code lost:
        r0 = (com.obwhatsapp.bloks.components.BkCdsBottomSheetFragment) r0;
        r1 = r0.A1J();
        r0 = r0.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x101b, code lost:
        if (r4 != null) goto L_0x1023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x101d, code lost:
        r1.A07(r0, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01b8, code lost:
        r15.Af8(A00(r2), (java.lang.String) r8.A00.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x1020, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x1021, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x1023, code lost:
        r1.A07(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x1026, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x102e, code lost:
        throw new java.lang.IllegalStateException("Cannot pop a without an existing bottom sheet.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x102f, code lost:
        r3 = (java.lang.String) r8.A00.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:?, code lost:
        java.lang.Integer.parseInt(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x103b, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("NumberUtil/Invalid long value:");
        r1.append(r3);
        r4 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01c9, code lost:
        r0 = (android.app.Dialog) r2.A00.A02.A00().get(com.obwhatsapp.R.id.bloks_host_progress_dialog);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x104e, code lost:
        switch("e".hashCode()) {
            case 97: goto L_0x106d;
            case 100: goto L_0x108f;
            case 101: goto L_0x1079;
            case 105: goto L_0x1080;
            case 118: goto L_0x108c;
            case 119: goto L_0x1096;
            default: goto L_0x1051;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x1051, code lost:
        r1 = new java.lang.StringBuilder("[Bloks logging] incorrect level: ");
        r1.append("e");
        com.whatsapp.util.Log.e(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x1062, code lost:
        com.whatsapp.util.Log.e(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x1065, code lost:
        A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x106c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x1073, code lost:
        if ("e".equals("a") != false) goto L_0x1075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x1075, code lost:
        com.whatsapp.util.Log.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01da, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x107d, code lost:
        if ("e".equals("e") == false) goto L_0x1051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x1086, code lost:
        if ("e".equals("i") != false) goto L_0x1088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x1088, code lost:
        com.whatsapp.util.Log.i(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x108c, code lost:
        r10 = "v";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x1093, code lost:
        if ("e".equals(r10) != false) goto L_0x1065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x109d, code lost:
        if ("e".equals("w") != false) goto L_0x109f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x109f, code lost:
        com.whatsapp.util.Log.w(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01dc, code lost:
        r0.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x10a3, code lost:
        X.C18450wi.A0H(r8, 0);
        X.C18450wi.A0H(r2, 1);
        r8 = r8.A00;
        r7 = r8.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x10af, code lost:
        if (r7 == null) goto L_0x1126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x10b1, code lost:
        r7 = (X.C14990q7) r7;
        r9 = r8.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x10b7, code lost:
        if (r9 == null) goto L_0x111e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x10b9, code lost:
        r8 = new X.AnonymousClass4RW(r7, r2, X.C31411e8.A01(r8.get(2)), X.C31411e8.A01(r8.get(3)));
        r4 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x10d1, code lost:
        if (r4 == null) goto L_0x10fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x10d3, code lost:
        r7 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x10d5, code lost:
        if (r7 == null) goto L_0x10fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x10d7, code lost:
        r10 = r7.getPackageManager();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x10db, code lost:
        if (r10 == null) goto L_0x10fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01e1, code lost:
        r15.Aaz(A00(r2), new com.facebook.redex.IDxMWrapperShape226S0100000_2_I0(r8, 1), ((java.lang.Boolean) r8.A00.get(1)).booleanValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x10dd, code lost:
        r9 = "front".equals(r9);
        r5 = r10.hasSystemFeature("android.hardware.camera.front");
        r4 = r10.hasSystemFeature("android.hardware.camera");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x10ef, code lost:
        if (r9 == false) goto L_0x10f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x10f1, code lost:
        if (r5 != false) goto L_0x10ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x10f3, code lost:
        r0 = X.C798441n.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x10f5, code lost:
        r8.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x10f8, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x10f9, code lost:
        if (r4 != false) goto L_0x10ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x10fc, code lost:
        r0 = X.C798441n.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x10ff, code lost:
        r5 = A00(r2);
        X.C18450wi.A0B(r5);
        r15.AcH(r5, new X.C100744w8(r5, r7, r8, r15), new java.lang.String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x111d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01fb, code lost:
        r3 = r8.A00;
        r15.Aa5(A00(r2), new com.facebook.redex.IDxMWrapperShape226S0100000_2_I0(r3.get(2), 7), (java.lang.String) r3.get(0), (java.lang.String) A07((java.util.Map) r3.get(1)).get("params"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x1125, code lost:
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x112d, code lost:
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:594:0x112e, code lost:
        r2 = r8.A00;
        r4 = (java.lang.String) r2.get(0);
        r3 = (java.util.AbstractList) r2.get(1);
        r2 = new java.lang.String[r3.size()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x1146, code lost:
        if (r0 >= r3.size()) goto L_0x1151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:597:0x1148, code lost:
        r2[r0] = r3.get(r0);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:599:0x1155, code lost:
        return java.text.MessageFormat.format(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0228, code lost:
        r15.A7t(A07((java.util.Map) r8.A00.get(0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:600:0x1156, code lost:
        r2 = r8.A00;
        r15.AbC(new com.facebook.redex.IDxMWrapperShape226S0100000_2_I0(r2.get(2), 3), ((java.lang.Number) r2.get(0)).intValue(), ((java.lang.Number) r2.get(1)).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:601:0x1179, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:602:0x117a, code lost:
        r5 = r8.A00;
        r15.Ab8((java.lang.String) r5.get(2), (java.lang.String) r5.get(3), ((java.lang.Number) r5.get(0)).intValue(), ((java.lang.Number) r5.get(1)).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x11a0, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:604:0x11a1, code lost:
        r4 = r8.A00;
        r15.Ab6((X.C108615Or) null, (java.util.Map) r4.get(2), ((java.lang.Number) r4.get(0)).intValue(), ((java.lang.Number) r4.get(1)).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:605:0x11c0, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:0x11c1, code lost:
        r2 = r8.A00;
        r15.Ab5(new com.facebook.redex.IDxMWrapperShape226S0100000_2_I0(r2.get(3), 5), (java.lang.String) r2.get(2), ((java.lang.Number) r2.get(0)).intValue(), ((java.lang.Number) r2.get(1)).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:607:0x11eb, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:0x11ec, code lost:
        r2 = r8.A00;
        r15.Ab4(new com.facebook.redex.IDxMWrapperShape226S0100000_2_I0(r2.get(3), 6), (java.util.Map) null, ((java.lang.Number) r2.get(0)).intValue(), ((java.lang.Number) r2.get(1)).intValue(), ((java.lang.Number) r2.get(2)).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:0x121c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0239, code lost:
        r4 = r8.A00;
        r15.AK5(A00(r2), (java.lang.String) r4.get(0), (java.lang.String) A07((java.util.Map) r4.get(1)).get("params"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:0x121d, code lost:
        r2 = r8.A00;
        r3 = (java.lang.String) r2.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:611:0x1227, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:612:?, code lost:
        r5 = java.lang.Long.parseLong(r3);
        r3 = 1000(0x3e8, double:4.94E-321);
        r5 = r5 * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:613:0x122f, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("NumberUtil/Invalid long value:");
        r0.append(r3);
        r4 = r0.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:615:0x1242, code lost:
        switch("e".hashCode()) {
            case 97: goto L_0x12be;
            case 100: goto L_0x12e2;
            case 101: goto L_0x12ca;
            case 105: goto L_0x12d2;
            case 118: goto L_0x12df;
            case 119: goto L_0x12ea;
            default: goto L_0x1245;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:616:0x1245, code lost:
        r0 = new java.lang.StringBuilder("[Bloks logging] incorrect level: ");
        r0.append("e");
        com.whatsapp.util.Log.e(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:617:0x1256, code lost:
        com.whatsapp.util.Log.e(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:618:0x1259, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:619:0x125b, code lost:
        r2 = (java.lang.String) r2.get(1);
        r5 = r5 - r15.ABT();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x025c, code lost:
        r3 = r8.A00;
        r7 = (java.lang.String) r3.get(0);
        r5 = (java.lang.String) r3.get(1);
        r4 = new java.util.ArrayList();
        r3 = ((java.util.List) r3.get(2)).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:620:0x1268, code lost:
        if (r5 <= 0) goto L_0x12f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:621:0x126a, code lost:
        r1 = java.lang.Long.valueOf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:622:0x1272, code lost:
        switch(r2.hashCode()) {
            case -1074026988: goto L_0x129f;
            case -906279820: goto L_0x128c;
            case 3208676: goto L_0x127a;
            default: goto L_0x1275;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:624:0x1279, code lost:
        return java.lang.String.valueOf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:626:0x1280, code lost:
        if (r2.equals("hour") == false) goto L_0x1275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:627:0x1282, code lost:
        r2 = r1.doubleValue();
        r0 = 3600000.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:629:0x1293, code lost:
        if (r2.equals("second") == false) goto L_0x1275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:630:0x1295, code lost:
        r2 = r1.doubleValue();
        r0 = 1000.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:632:0x12a5, code lost:
        if (r2.equals("minute") == false) goto L_0x1275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:633:0x12a7, code lost:
        r2 = r1.doubleValue();
        r0 = 60000.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:634:0x12b0, code lost:
        r5 = java.lang.Double.valueOf(java.lang.Math.ceil(r2 / r0)).longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:636:0x12c4, code lost:
        if ("e".equals("a") != false) goto L_0x12c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:637:0x12c6, code lost:
        com.whatsapp.util.Log.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:639:0x12ce, code lost:
        if ("e".equals("e") == false) goto L_0x1245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x027d, code lost:
        if (r3.hasNext() == false) goto L_0x028c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:641:0x12d8, code lost:
        if ("e".equals("i") != false) goto L_0x12da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:642:0x12da, code lost:
        com.whatsapp.util.Log.i(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:643:0x12df, code lost:
        r10 = "v";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:645:0x12e6, code lost:
        if ("e".equals(r10) != false) goto L_0x1259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:647:0x12f1, code lost:
        if ("e".equals("w") != false) goto L_0x12f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:648:0x12f3, code lost:
        com.whatsapp.util.Log.w(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:649:0x12f8, code lost:
        return "-1";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x027f, code lost:
        r4.add(new com.facebook.redex.IDxMWrapperShape226S0100000_2_I0(r3.next(), 2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:650:0x12fb, code lost:
        r5 = r8.A00;
        r15.Ab9((java.lang.String) r5.get(2), (java.lang.String) r5.get(3), ((java.lang.Number) r5.get(0)).intValue(), ((java.lang.Number) r5.get(1)).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:651:0x1321, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:652:0x1322, code lost:
        r4 = r8.A00;
        r15.Ab2((java.util.Map) r4.get(2), ((java.lang.Number) r4.get(0)).intValue(), ((java.lang.Number) r4.get(1)).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:653:0x1341, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:654:0x1342, code lost:
        r4 = r8.A00;
        r15.Ab3(((java.lang.Number) r4.get(0)).intValue(), ((java.lang.Number) r4.get(1)).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:655:0x135b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:656:0x135c, code lost:
        r15.AZw(A00(r2), (java.lang.String) r8.A00.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:657:0x136b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:658:0x136c, code lost:
        r5 = r8.A00;
        r8 = (java.lang.String) r5.get(0);
        r9 = (java.lang.String) r5.get(1);
        r10 = (java.lang.String) r5.get(2);
        r7 = (java.lang.String) r5.get(3);
        r6 = (java.lang.String) r5.get(4);
        r4 = X.C31411e8.A01(r5.get(5));
        r1 = X.C31411e8.A01(r5.get(6));
        r0 = X.C31411e8.A01(r5.get(7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:659:0x13a9, code lost:
        if (r4 == null) goto L_0x13ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x028c, code lost:
        r15.Aa1(A00(r2), r7, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:660:0x13ab, code lost:
        r5 = new X.AnonymousClass1Z6();
        r5.A00 = r2;
        r5.A01 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:661:0x13b4, code lost:
        if (r1 == null) goto L_0x13e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:662:0x13b6, code lost:
        r4 = new X.AnonymousClass1Z6();
        r4.A00 = r2;
        r4.A01 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:663:0x13bf, code lost:
        if (r0 == null) goto L_0x13e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:664:0x13c1, code lost:
        r1 = new X.AnonymousClass1Z6();
        r1.A00 = r2;
        r1.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:665:0x13ca, code lost:
        r15.AfZ((X.C000900k) A00(r2), r5, r4, r1, r8, r9, r10, r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:666:0x13e5, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:667:0x13e6, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:668:0x13e8, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:669:0x13ea, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0295, code lost:
        r4 = r8.A00;
        r15.Aa2(A00(r2), (java.lang.String) r4.get(0), (java.lang.String) A07((java.util.Map) r4.get(1)).get("params"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:670:0x13ec, code lost:
        r5 = r8.A00;
        r15.AcI(A05((X.C31201dg) r5.get(0)), A07((java.util.Map) r5.get(1)), ((java.lang.Number) r5.get(3)).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:671:0x1410, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:672:0x1411, code lost:
        r1 = r8.A00;
        r6 = (X.C14990q7) r1.get(2);
        r9 = X.C611937y.A00(r6, r2, ((X.AnonymousClass2Wa) r1.get(0)).A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:673:0x1425, code lost:
        r7 = new android.app.AlertDialog.Builder(A00(r2)).setTitle(r9.A0J(40)).setMessage(r9.A0J(35));
        r5 = r9.A0G(36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:674:0x1448, code lost:
        if (r5 == null) goto L_0x145d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:675:0x144a, code lost:
        r7.setPositiveButton(r5.A0K(36, ""), new com.facebook.redex.IDxCListenerShape4S0400000_2_I0(r5, r6, r4, r2, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:676:0x145d, code lost:
        r5 = r9.A0G(38);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:677:0x1463, code lost:
        if (r5 == null) goto L_0x1478;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:678:0x1465, code lost:
        r7.setNegativeButton(r5.A0K(36, ""), new com.facebook.redex.IDxCListenerShape4S0400000_2_I0(r5, r6, r4, r2, 3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:679:0x1478, code lost:
        r5 = r9.A0G(44);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02b8, code lost:
        r4 = r8.A00;
        r0 = ((X.C31411e8) r4.get(1)).A00;
        r1 = new X.AnonymousClass1Z6();
        r1.A01 = r0;
        r1.A00 = r2;
        r15.Abb(r1, A07((java.util.Map) r4.get(0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:680:0x147e, code lost:
        if (r5 == null) goto L_0x1492;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:681:0x1480, code lost:
        r7.setNeutralButton(r5.A0K(36, ""), new com.facebook.redex.IDxCListenerShape4S0400000_2_I0(r5, r6, r4, r2, 2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:682:0x1492, code lost:
        r7.create().show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:683:0x1499, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:684:0x149a, code lost:
        r4 = r8.A00;
        r15.AIR(A05((X.C31201dg) r4.get(0)), A07((java.util.Map) r4.get(1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:685:0x14b3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:686:0x14b4, code lost:
        r4 = r8.A00;
        r1 = (X.C31201dg) r4.get(0);
        r5 = A08((java.util.Map) r4.get(2));
        r4 = A05(r1);
        r11 = A06(r1);
        r10 = new X.AnonymousClass4DF(r4);
        r9 = X.AnonymousClass2Wa.A00(r2, (X.C31201dg) r4.get(0));
        r0 = new X.C04890Ok();
        r0.A01 = r4;
        r0.A02 = r5;
        r8 = new X.C05280Qa(r0);
        r4 = r2.A00;
        r6 = r4.A00;
        r2 = X.AnonymousClass0T1.A01(X.AnonymousClass0T1.A00(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:687:0x14f7, code lost:
        if (r2 == null) goto L_0x1538;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:689:0x14fd, code lost:
        if (r2.isEmpty() != false) goto L_0x1538;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02da, code lost:
        A00(r2).startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse((java.lang.String) r8.A00.get(0))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:690:0x14ff, code lost:
        r7 = A04(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:691:0x1503, code lost:
        r7 = (X.C13550mZ) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:692:0x1507, code lost:
        if ((r7 instanceof androidx.fragment.app.DialogFragment) == false) goto L_0x1547;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:693:0x1509, code lost:
        r7 = (androidx.fragment.app.DialogFragment) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:694:0x150b, code lost:
        if (r7 == null) goto L_0x1547;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:695:0x150d, code lost:
        r8 = X.AnonymousClass0T0.A00(r6, r7, r8, r9, r10, r11);
        r7 = (com.obwhatsapp.bloks.components.BkCdsBottomSheetFragment) ((X.C13550mZ) r7);
        r6 = r7.A1J();
        r7 = r7.A02();
        r5 = (X.C05070Pd) r6.A0C.peek();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:696:0x1529, code lost:
        if (r5 != null) goto L_0x1531;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:697:0x152b, code lost:
        r0 = "Cannot push to an empty bottom sheet. Please call open() to show new Screen content in the bottom sheet.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:698:0x152d, code lost:
        X.C29691b2.A00("CDSBloksBottomSheetDelegate", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:699:0x1530, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02f6, code lost:
        r3 = r8.A00;
        r2 = (java.lang.String) r3.get(0);
        r19 = ((java.lang.Number) r3.get(1)).intValue();
        r1 = r3.get(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002e, code lost:
        r15.AZu(A00(r2), new com.facebook.redex.IDxMWrapperShape226S0100000_2_I0(r8, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:701:0x1533, code lost:
        if (r6.A08 == false) goto L_0x153a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:702:0x1535, code lost:
        r0 = "Attempting to push to a dismissing sheet. The content will not be displayed properly";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:703:0x1538, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:704:0x153a, code lost:
        r5.A00.A08();
        r6.A06(r7, r8, (X.AnonymousClass0KW) null, r4, r1, (X.C14930q1) null, 32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:705:0x1546, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:707:0x154e, code lost:
        throw new java.lang.IllegalStateException("Cannot push a new Screen without an existing bottom sheet.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:708:0x154f, code lost:
        r4 = r8.A00;
        r7 = (java.lang.String) r4.get(0);
        r9 = (java.util.Map) r4.get(1);
        r6 = (X.C31201dg) r4.get(2);
        r0 = (java.util.List) r4.get(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:709:0x156a, code lost:
        if (r0 == null) goto L_0x15b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x030e, code lost:
        if ((r1 instanceof java.lang.Boolean) == false) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:710:0x156c, code lost:
        r4 = r0.iterator();
        r17 = null;
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:712:0x1578, code lost:
        if (r4.hasNext() == false) goto L_0x15b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:713:0x157a, code lost:
        r1 = (X.C31201dg) r4.next();
        r17 = r1.A0J(35);
        r0 = 36;
        r16 = r1.A0J(36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:714:0x158a, code lost:
        if (r17 == null) goto L_0x1574;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:715:0x158c, code lost:
        r15.A5C(new com.facebook.redex.IDxEWrapperShape173S0100000_2_I0(r6.A0H(r0), 3), new com.facebook.redex.IDxEWrapperShape173S0100000_2_I0(r6.A0H(35), 5), r2, r7, (java.lang.String) A07(r9).get("params"), r16, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:716:0x15b5, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:717:0x15b6, code lost:
        r0 = 36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:718:0x15b9, code lost:
        r0 = 36;
        r16 = null;
        r17 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0310, code lost:
        r20 = ((java.lang.Boolean) r1).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:720:0x15c7, code lost:
        throw new java.lang.IllegalStateException("Cannot unwind a without an existing bottom sheet.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:721:0x15c8, code lost:
        r0 = "Attempting to remove the current or only screen in the CDS bottom sheet, so the screen was not removed. Please use pop or dismiss instead.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:722:0x15cb, code lost:
        r0 = "No screen found with target ID, so the screen was not removed.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:723:0x15cd, code lost:
        X.C29691b2.A00("CDSBloksBottomSheetDelegate", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:724:0x15d0, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:725:0x15d1, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:726:0x15d2, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:727:0x15d3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:728:0x15d4, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:729:0x15d5, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0316, code lost:
        r15.AdQ(r2, (java.util.ArrayList) r3.get(4), A07((java.util.Map) r3.get(3)), r19, r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:730:0x15d6, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:731:0x15d7, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:733:0x15dd, code lost:
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Number");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:735:0x15e3, code lost:
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Number");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:737:0x15eb, code lost:
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:739:0x15f3, code lost:
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0331, code lost:
        r20 = ((java.lang.Number) r1).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:740:0x15f4, code lost:
        return "0";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:742:0x15fe, code lost:
        throw new java.lang.IllegalStateException("Cannot dismiss without an existing bottom sheet.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:744:0x1606, code lost:
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:746:0x160e, code lost:
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0338, code lost:
        r15.Ae9(A00(r2), new com.facebook.redex.IDxMWrapperShape226S0100000_2_I0(r8.A00.get(0), 4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x034d, code lost:
        r4 = r2.A00;
        r5 = (java.lang.String) r8.A00.get(0);
        r8.A01(1);
        r6 = X.AnonymousClass0T1.A01(X.AnonymousClass0T1.A00(r4.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:769:?, code lost:
        return r4.A00.A8l(r8, r7, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0364, code lost:
        if (r6 == null) goto L_0x03e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:770:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:771:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:772:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:773:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:774:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:775:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:776:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:777:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:778:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:779:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:780:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:781:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:782:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:783:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:784:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:785:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:786:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:787:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:788:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:789:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x036a, code lost:
        if (r6.isEmpty() != false) goto L_0x03e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:790:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:791:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:792:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:793:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:794:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:795:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:796:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:797:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:798:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:799:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x036c, code lost:
        r2 = new java.util.ArrayList();
        r4 = r6.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
        r15.Aae(A00(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:800:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:801:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:802:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:803:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:804:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:805:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:806:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:807:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:808:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:809:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0375, code lost:
        r4 = r4 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:810:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:811:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:812:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:813:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:814:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:815:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:816:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:817:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:818:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:819:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0377, code lost:
        if (r4 < 0) goto L_0x03e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:820:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:821:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:822:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:823:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:824:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0379, code lost:
        r1 = (X.AnonymousClass01A) r6.get(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0381, code lost:
        if ((r1 instanceof X.C13550mZ) == false) goto L_0x0375;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0385, code lost:
        if ((r1 instanceof androidx.fragment.app.DialogFragment) == false) goto L_0x0375;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0387, code lost:
        r1 = (androidx.fragment.app.DialogFragment) r1;
        r2.add(r1);
        r1 = ((com.obwhatsapp.bloks.components.BkCdsBottomSheetFragment) ((X.C13550mZ) r1)).A1J().A0C.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x039e, code lost:
        if (r1.hasNext() == false) goto L_0x03e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0046, code lost:
        A00(r2).finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x03ac, code lost:
        if (r5.equals(((X.C05070Pd) r1.next()).A02) == false) goto L_0x039a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x03ae, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x03af, code lost:
        if (r0 == false) goto L_0x0375;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x03b5, code lost:
        if (r2.isEmpty() != false) goto L_0x15c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x03b7, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x03be, code lost:
        if (r7 >= (r2.size() - 1)) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x03c0, code lost:
        r6 = ((com.obwhatsapp.bloks.components.BkCdsBottomSheetFragment) ((X.C13550mZ) ((androidx.fragment.app.DialogFragment) r2.get(r7)))).A1J();
        r6.A06 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x03d5, code lost:
        if (r6.A04 != X.C03880Kf.FULL_SCREEN) goto L_0x03dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004f, code lost:
        r4 = r8.A00;
        r5 = ((java.lang.Number) r4.get(0)).intValue();
        r0 = (java.util.Map) r4.get(1);
        r4 = A00(r2);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:212:0x06e2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0717  */
    /* JADX WARNING: Removed duplicated region for block: B:780:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A8l(X.C14950q3 r26, X.C99354tt r27, X.C14970q5 r28) {
        /*
            r25 = this;
            r2 = r28
            X.0q4 r2 = (X.C14960q4) r2
            r4 = r25
            X.1K5 r15 = r4.A01
            r7 = r27
            java.lang.String r8 = r7.A00
            int r3 = r8.hashCode()
            r5 = 35
            r6 = 2
            r1 = 1
            r0 = 0
            switch(r3) {
                case -2140546951: goto L_0x0cb3;
                case -2140338357: goto L_0x0cab;
                case -2117986441: goto L_0x0ca3;
                case -2068088578: goto L_0x0c9b;
                case -2067649951: goto L_0x0c93;
                case -1838906086: goto L_0x0c8b;
                case -1787809934: goto L_0x0c82;
                case -1655856867: goto L_0x0c7a;
                case -1604504565: goto L_0x0c71;
                case -1578886175: goto L_0x0c67;
                case -1556410467: goto L_0x0c5e;
                case -1507852311: goto L_0x0c55;
                case -1481223638: goto L_0x0c4c;
                case -1330718402: goto L_0x0c43;
                case -1242219886: goto L_0x0c39;
                case -1182895194: goto L_0x0c2f;
                case -1174424168: goto L_0x0c25;
                case -1030847255: goto L_0x0c1a;
                case -1003291191: goto L_0x0c10;
                case -993097054: goto L_0x0c06;
                case -990185100: goto L_0x0bfc;
                case -979462773: goto L_0x0bf2;
                case -921635786: goto L_0x0be8;
                case -884670392: goto L_0x0bde;
                case -809454050: goto L_0x0bd4;
                case -782725013: goto L_0x0bca;
                case -780036552: goto L_0x0bbf;
                case -773489556: goto L_0x0bb5;
                case -760967806: goto L_0x0bab;
                case -746705348: goto L_0x0ba0;
                case -647944134: goto L_0x0b95;
                case -629460340: goto L_0x0b8a;
                case -606722934: goto L_0x0b80;
                case -563655164: goto L_0x0b76;
                case -541608891: goto L_0x0b6b;
                case -534326238: goto L_0x0b60;
                case -531827055: goto L_0x0b55;
                case -363552265: goto L_0x0b4a;
                case -347836657: goto L_0x0b40;
                case -331653351: goto L_0x0b35;
                case -306959749: goto L_0x0b2b;
                case -269742372: goto L_0x0b20;
                case -188753299: goto L_0x0b16;
                case -161320099: goto L_0x0b0b;
                case -149567034: goto L_0x0b01;
                case -136229627: goto L_0x0af7;
                case -78052800: goto L_0x0aec;
                case -58496533: goto L_0x0ae2;
                case 3413278: goto L_0x0ad8;
                case 5923458: goto L_0x0acd;
                case 136195447: goto L_0x0ac3;
                case 156743102: goto L_0x0ab9;
                case 227600558: goto L_0x0aae;
                case 243158640: goto L_0x0aa3;
                case 313766265: goto L_0x0a98;
                case 361006941: goto L_0x0a8e;
                case 458561021: goto L_0x0a84;
                case 538167952: goto L_0x0a79;
                case 598814056: goto L_0x0a6e;
                case 610178701: goto L_0x0a64;
                case 683144274: goto L_0x0a5a;
                case 840594967: goto L_0x0a50;
                case 878253942: goto L_0x0a45;
                case 889592555: goto L_0x0a3a;
                case 941474804: goto L_0x0a30;
                case 959076350: goto L_0x0a26;
                case 1002037470: goto L_0x0a1b;
                case 1073657643: goto L_0x0a10;
                case 1093292105: goto L_0x0a05;
                case 1172555497: goto L_0x09fa;
                case 1246727742: goto L_0x09f0;
                case 1281868444: goto L_0x09e5;
                case 1293733961: goto L_0x09db;
                case 1323560766: goto L_0x09d0;
                case 1457845398: goto L_0x09c6;
                case 1559677690: goto L_0x09bc;
                case 1593718455: goto L_0x09b2;
                case 1643041589: goto L_0x09a7;
                case 1856118462: goto L_0x099d;
                case 1866424912: goto L_0x0992;
                case 1914861328: goto L_0x0988;
                case 2085194283: goto L_0x097d;
                case 2094846105: goto L_0x0972;
                default: goto L_0x0018;
            }
        L_0x0018:
            r13 = -1
        L_0x0019:
            java.lang.String r11 = "NumberUtil/Invalid long value:"
            java.lang.String r12 = "] on a null or empty parent node"
            java.lang.String r10 = "d"
            java.lang.String r9 = "e"
            r3 = 0
            r8 = r26
            switch(r13) {
                case 0: goto L_0x154f;
                case 1: goto L_0x14b4;
                case 2: goto L_0x0cd2;
                case 3: goto L_0x149a;
                case 4: goto L_0x1411;
                case 5: goto L_0x13ec;
                case 6: goto L_0x136c;
                case 7: goto L_0x0ccd;
                case 8: goto L_0x0338;
                case 9: goto L_0x135c;
                case 10: goto L_0x1342;
                case 11: goto L_0x1322;
                case 12: goto L_0x0cc8;
                case 13: goto L_0x12fb;
                case 14: goto L_0x02f6;
                case 15: goto L_0x08f0;
                case 16: goto L_0x0899;
                case 17: goto L_0x121d;
                case 18: goto L_0x11ec;
                case 19: goto L_0x11c1;
                case 20: goto L_0x11a1;
                case 21: goto L_0x002d;
                case 22: goto L_0x117a;
                case 23: goto L_0x0413;
                case 24: goto L_0x02da;
                case 25: goto L_0x1156;
                case 26: goto L_0x112e;
                case 27: goto L_0x0046;
                case 28: goto L_0x10a3;
                case 29: goto L_0x0875;
                case 30: goto L_0x02b8;
                case 31: goto L_0x102f;
                case 32: goto L_0x0295;
                case 33: goto L_0x0fe9;
                case 34: goto L_0x0899;
                case 35: goto L_0x025c;
                case 36: goto L_0x02da;
                case 37: goto L_0x0856;
                case 38: goto L_0x0239;
                case 39: goto L_0x0228;
                case 40: goto L_0x0e0d;
                case 41: goto L_0x01fb;
                case 42: goto L_0x0ddf;
                case 43: goto L_0x0dd8;
                case 44: goto L_0x01e1;
                case 45: goto L_0x0dca;
                case 46: goto L_0x0899;
                case 47: goto L_0x07f3;
                case 48: goto L_0x0cc3;
                case 49: goto L_0x0dba;
                case 50: goto L_0x0da0;
                case 51: goto L_0x0d79;
                case 52: goto L_0x02f6;
                case 53: goto L_0x01c9;
                case 54: goto L_0x0d76;
                case 55: goto L_0x0046;
                case 56: goto L_0x07a9;
                case 57: goto L_0x01b8;
                case 58: goto L_0x01a1;
                case 59: goto L_0x0cbe;
                case 60: goto L_0x00ae;
                case 61: goto L_0x003d;
                case 62: goto L_0x0046;
                case 63: goto L_0x0734;
                case 64: goto L_0x04a8;
                case 65: goto L_0x0d56;
                case 66: goto L_0x0190;
                case 67: goto L_0x00ea;
                case 68: goto L_0x002d;
                case 69: goto L_0x00d4;
                case 70: goto L_0x00bb;
                case 71: goto L_0x0d36;
                case 72: goto L_0x0899;
                case 73: goto L_0x0899;
                case 74: goto L_0x002e;
                case 75: goto L_0x1322;
                case 76: goto L_0x034d;
                case 77: goto L_0x0082;
                case 78: goto L_0x0d17;
                case 79: goto L_0x0899;
                case 80: goto L_0x0cf2;
                case 81: goto L_0x0cdb;
                case 82: goto L_0x004f;
                default: goto L_0x0027;
            }
        L_0x0027:
            X.1Jc r0 = r4.A00
            java.lang.Object r3 = r0.A8l(r8, r7, r2)
        L_0x002d:
            return r3
        L_0x002e:
            android.app.Activity r2 = A00(r2)
            r1 = 0
            com.facebook.redex.IDxMWrapperShape226S0100000_2_I0 r0 = new com.facebook.redex.IDxMWrapperShape226S0100000_2_I0
            r0.<init>(r8, r1)
            r15.AZu(r2, r0)
            goto L_0x0899
        L_0x003d:
            android.app.Activity r0 = A00(r2)
            r15.Aae(r0)
            goto L_0x0899
        L_0x0046:
            android.app.Activity r0 = A00(r2)
            r0.finish()
            goto L_0x0899
        L_0x004f:
            java.util.List r4 = r8.A00
            java.lang.Object r0 = r4.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            java.lang.Object r0 = r4.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            android.app.Activity r4 = A00(r2)
            if (r0 == 0) goto L_0x006b
            java.util.HashMap r3 = A07(r0)
        L_0x006b:
            r2 = 0
            if (r5 == 0) goto L_0x006f
            r2 = -1
        L_0x006f:
            android.content.Intent r1 = r4.getIntent()
            if (r3 == 0) goto L_0x007a
            java.lang.String r0 = "finish_activity_result"
            r1.putExtra(r0, r3)
        L_0x007a:
            r4.setResult(r2, r1)
            r4.finish()
            goto L_0x0899
        L_0x0082:
            java.util.List r3 = r8.A00
            java.lang.Object r4 = r3.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r0 = r3.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
            X.0q7 r0 = r2.A00
            X.22A r0 = r0.A02
            android.util.SparseArray r1 = r0.A00()
            r0 = 2131362294(0x7f0a01f6, float:1.8344365E38)
            java.lang.Object r1 = r1.get(r0)
            android.app.ProgressDialog r1 = (android.app.ProgressDialog) r1
            android.app.Activity r0 = A00(r2)
            r15.Afo(r0, r1, r4, r3)
            goto L_0x0899
        L_0x00ae:
            java.util.List r1 = r8.A00
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r15.Agu(r0)
            goto L_0x0899
        L_0x00bb:
            java.util.List r1 = r8.A00
            java.lang.Object r0 = r1.get(r0)
            X.1e8 r0 = (X.C31411e8) r0
            X.1e9 r3 = r0.A00
            android.app.Activity r2 = A00(r2)
            r1 = 6
            com.facebook.redex.IDxEWrapperShape173S0100000_2_I0 r0 = new com.facebook.redex.IDxEWrapperShape173S0100000_2_I0
            r0.<init>(r3, r1)
            r15.A82(r2, r0)
            goto L_0x0899
        L_0x00d4:
            java.util.List r1 = r8.A00
            java.lang.Object r1 = r1.get(r0)
            java.util.Map r1 = (java.util.Map) r1
            android.app.Activity r0 = A00(r2)
            if (r1 == 0) goto L_0x00e5
            A07(r1)
        L_0x00e5:
            r0.onBackPressed()
            goto L_0x0899
        L_0x00ea:
            java.util.List r2 = r8.A00
            java.util.List r5 = java.util.Collections.unmodifiableList(r2)
            java.lang.String r2 = "[Bloks logging] "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            java.lang.Object r2 = r5.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r5.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r4.append(r0)
            java.lang.Object r0 = r5.get(r6)
            if (r0 == 0) goto L_0x014c
            java.lang.Object r0 = r5.get(r6)
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r5 = r0.iterator()
        L_0x011a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x014c
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r0 = " "
            r4.append(r0)
            java.lang.Object r0 = r1.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r4.append(r0)
            java.lang.String r0 = " : "
            r4.append(r0)
            java.lang.Object r1 = r1.getValue()
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 != 0) goto L_0x0144
            r0 = 0
            if (r1 == r3) goto L_0x0148
        L_0x0144:
            java.lang.String r0 = r1.toString()
        L_0x0148:
            r4.append(r0)
            goto L_0x011a
        L_0x014c:
            java.lang.String r3 = r4.toString()
            int r0 = r2.hashCode()
            switch(r0) {
                case 97: goto L_0x0163;
                case 100: goto L_0x017f;
                case 101: goto L_0x016c;
                case 105: goto L_0x0173;
                case 118: goto L_0x017c;
                case 119: goto L_0x0186;
                default: goto L_0x0157;
            }
        L_0x0157:
            java.lang.String r0 = "[Bloks logging] incorrect level: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            goto L_0x0911
        L_0x0163:
            java.lang.String r0 = "a"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0963
            goto L_0x0157
        L_0x016c:
            boolean r0 = r2.equals(r9)
            if (r0 != 0) goto L_0x0918
            goto L_0x0157
        L_0x0173:
            java.lang.String r0 = "i"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0968
            goto L_0x0157
        L_0x017c:
            java.lang.String r10 = "v"
        L_0x017f:
            boolean r0 = r2.equals(r10)
            if (r0 != 0) goto L_0x0899
            goto L_0x0157
        L_0x0186:
            java.lang.String r0 = "w"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x096d
            goto L_0x0157
        L_0x0190:
            java.util.List r1 = r8.A00
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            android.app.Activity r0 = A00(r2)
            r15.AZy(r0, r1)
            goto L_0x0899
        L_0x01a1:
            java.util.List r4 = r8.A00
            java.lang.Object r3 = r4.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            android.app.Activity r0 = A00(r2)
            r15.AZx(r0, r3, r1)
            goto L_0x0899
        L_0x01b8:
            java.util.List r1 = r8.A00
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            android.app.Activity r0 = A00(r2)
            r15.Af8(r0, r1)
            goto L_0x0899
        L_0x01c9:
            X.0q7 r0 = r2.A00
            X.22A r0 = r0.A02
            android.util.SparseArray r1 = r0.A00()
            r0 = 2131362294(0x7f0a01f6, float:1.8344365E38)
            java.lang.Object r0 = r1.get(r0)
            android.app.Dialog r0 = (android.app.Dialog) r0
            if (r0 == 0) goto L_0x0899
            r0.dismiss()
            goto L_0x0899
        L_0x01e1:
            java.util.List r0 = r8.A00
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
            android.app.Activity r2 = A00(r2)
            com.facebook.redex.IDxMWrapperShape226S0100000_2_I0 r0 = new com.facebook.redex.IDxMWrapperShape226S0100000_2_I0
            r0.<init>(r8, r1)
            r15.Aaz(r2, r0, r3)
            goto L_0x0899
        L_0x01fb:
            java.util.List r3 = r8.A00
            java.lang.Object r5 = r3.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r3.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r4 = r3.get(r6)
            android.app.Activity r3 = A00(r2)
            java.util.HashMap r1 = A07(r0)
            java.lang.String r0 = "params"
            java.lang.Object r2 = r1.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            r1 = 7
            com.facebook.redex.IDxMWrapperShape226S0100000_2_I0 r0 = new com.facebook.redex.IDxMWrapperShape226S0100000_2_I0
            r0.<init>(r4, r1)
            r15.Aa5(r3, r0, r5, r2)
            goto L_0x0899
        L_0x0228:
            java.util.List r1 = r8.A00
            java.lang.Object r0 = r1.get(r0)
            java.util.Map r0 = (java.util.Map) r0
            java.util.HashMap r0 = A07(r0)
            r15.A7t(r0)
            goto L_0x0899
        L_0x0239:
            java.util.List r4 = r8.A00
            java.lang.Object r3 = r4.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r4.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            android.app.Activity r2 = A00(r2)
            java.util.HashMap r1 = A07(r0)
            java.lang.String r0 = "params"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r15.AK5(r2, r3, r0)
            goto L_0x0899
        L_0x025c:
            java.util.List r3 = r8.A00
            java.lang.Object r7 = r3.get(r0)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r3.get(r1)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r3.get(r6)
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x0279:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x028c
            java.lang.Object r1 = r3.next()
            com.facebook.redex.IDxMWrapperShape226S0100000_2_I0 r0 = new com.facebook.redex.IDxMWrapperShape226S0100000_2_I0
            r0.<init>(r1, r6)
            r4.add(r0)
            goto L_0x0279
        L_0x028c:
            android.app.Activity r0 = A00(r2)
            r15.Aa1(r0, r7, r5, r4)
            goto L_0x0899
        L_0x0295:
            java.util.List r4 = r8.A00
            java.lang.Object r3 = r4.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r4.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            android.app.Activity r2 = A00(r2)
            java.util.HashMap r1 = A07(r0)
            java.lang.String r0 = "params"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r15.Aa2(r2, r3, r0)
            goto L_0x0899
        L_0x02b8:
            java.util.List r4 = r8.A00
            java.lang.Object r3 = r4.get(r0)
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r0 = r4.get(r1)
            X.1e8 r0 = (X.C31411e8) r0
            X.1e9 r0 = r0.A00
            X.1Z6 r1 = new X.1Z6
            r1.<init>()
            r1.A01 = r0
            r1.A00 = r2
            java.util.HashMap r0 = A07(r3)
            r15.Abb(r1, r0)
            goto L_0x0899
        L_0x02da:
            java.util.List r1 = r8.A00
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.app.Activity r3 = A00(r2)
            android.net.Uri r2 = android.net.Uri.parse(r0)
            java.lang.String r1 = "android.intent.action.VIEW"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1, r2)
            r3.startActivity(r0)
            goto L_0x0899
        L_0x02f6:
            java.util.List r3 = r8.A00
            java.lang.Object r2 = r3.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r3.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r19 = r0.intValue()
            java.lang.Object r1 = r3.get(r6)
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0331
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r20 = r1.booleanValue()
        L_0x0316:
            r0 = 3
            java.lang.Object r1 = r3.get(r0)
            java.util.Map r1 = (java.util.Map) r1
            r0 = 4
            java.lang.Object r0 = r3.get(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.HashMap r18 = A07(r1)
            r16 = r2
            r17 = r0
            r15.AdQ(r16, r17, r18, r19, r20)
            goto L_0x0899
        L_0x0331:
            java.lang.Number r1 = (java.lang.Number) r1
            int r20 = r1.intValue()
            goto L_0x0316
        L_0x0338:
            java.util.List r1 = r8.A00
            java.lang.Object r3 = r1.get(r0)
            android.app.Activity r2 = A00(r2)
            r1 = 4
            com.facebook.redex.IDxMWrapperShape226S0100000_2_I0 r0 = new com.facebook.redex.IDxMWrapperShape226S0100000_2_I0
            r0.<init>(r3, r1)
            r15.Ae9(r2, r0)
            goto L_0x0899
        L_0x034d:
            X.0q7 r4 = r2.A00
            java.util.List r2 = r8.A00
            java.lang.Object r5 = r2.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            r8.A01(r1)
            android.content.Context r0 = r4.A00
            android.app.Activity r0 = X.AnonymousClass0T1.A00(r0)
            java.util.List r6 = X.AnonymousClass0T1.A01(r0)
            if (r6 == 0) goto L_0x03e8
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x03e8
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r4 = r6.size()
        L_0x0375:
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x03e8
            java.lang.Object r1 = r6.get(r4)
            X.01A r1 = (X.AnonymousClass01A) r1
            boolean r0 = r1 instanceof X.C13550mZ
            if (r0 == 0) goto L_0x0375
            boolean r0 = r1 instanceof androidx.fragment.app.DialogFragment
            if (r0 == 0) goto L_0x0375
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            r2.add(r1)
            X.0mZ r1 = (X.C13550mZ) r1
            com.obwhatsapp.bloks.components.BkCdsBottomSheetFragment r1 = (com.obwhatsapp.bloks.components.BkCdsBottomSheetFragment) r1
            X.0SF r0 = r1.A1J()
            java.util.Deque r0 = r0.A0C
            java.util.Iterator r1 = r0.iterator()
        L_0x039a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03e6
            java.lang.Object r0 = r1.next()
            X.0Pd r0 = (X.C05070Pd) r0
            java.lang.String r0 = r0.A02
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x039a
            r0 = 1
        L_0x03af:
            if (r0 == 0) goto L_0x0375
        L_0x03b1:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x15c0
            r7 = 0
        L_0x03b8:
            int r0 = r2.size()
            int r0 = r0 + -1
            if (r7 >= r0) goto L_0x03ee
            java.lang.Object r0 = r2.get(r7)
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            X.0mZ r0 = (X.C13550mZ) r0
            com.obwhatsapp.bloks.components.BkCdsBottomSheetFragment r0 = (com.obwhatsapp.bloks.components.BkCdsBottomSheetFragment) r0
            X.0SF r6 = r0.A1J()
            r6.A06 = r3
            X.0Kf r4 = r6.A04
            X.0Kf r0 = X.C03880Kf.FULL_SCREEN
            r1 = 1
            if (r4 != r0) goto L_0x03dc
            r6.A08 = r1
        L_0x03d9:
            int r7 = r7 + 1
            goto L_0x03b8
        L_0x03dc:
            X.0A2 r0 = r6.A05
            if (r0 == 0) goto L_0x03d9
            r6.A08 = r1
            r0.dismiss()
            goto L_0x03d9
        L_0x03e6:
            r0 = 0
            goto L_0x03af
        L_0x03e8:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            goto L_0x03b1
        L_0x03ee:
            int r0 = r2.size()
            int r0 = r0 + -1
            java.lang.Object r0 = r2.get(r0)
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            X.0mZ r0 = (X.C13550mZ) r0
            com.obwhatsapp.bloks.components.BkCdsBottomSheetFragment r0 = (com.obwhatsapp.bloks.components.BkCdsBottomSheetFragment) r0
            X.0SF r4 = r0.A1J()
            android.content.Context r2 = r0.A02()
            java.util.Deque r0 = r4.A0C
            int r1 = r0.size()
            r0 = 1
            if (r1 == r0) goto L_0x002d
            r4.A08(r2, r5)
            return r3
        L_0x0413:
            android.app.Activity r2 = A00(r2)
            java.util.List r1 = r8.A00
            java.lang.Object r9 = r1.get(r0)
            java.lang.String r9 = (java.lang.String) r9
            android.app.Activity r0 = X.AnonymousClass0T1.A00(r2)
            java.util.List r1 = X.AnonymousClass0T1.A01(r0)
            if (r1 == 0) goto L_0x043f
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x043f
            androidx.fragment.app.DialogFragment r0 = A01(r9, r1)
        L_0x0433:
            X.0mZ r0 = (X.C13550mZ) r0
            if (r0 != 0) goto L_0x0441
            java.lang.String r1 = "CDSBloksBottomSheetController"
            java.lang.String r0 = "Cannot remove without an existing bottom sheet - no bottom sheet contains the screen ID"
            X.C29691b2.A00(r1, r0)
            return r3
        L_0x043f:
            r0 = 0
            goto L_0x0433
        L_0x0441:
            com.obwhatsapp.bloks.components.BkCdsBottomSheetFragment r0 = (com.obwhatsapp.bloks.components.BkCdsBottomSheetFragment) r0
            X.0SF r2 = r0.A1J()
            java.util.Deque r1 = r2.A0C
            java.lang.Object r0 = r1.peekFirst()
            X.0Pd r0 = (X.C05070Pd) r0
            java.lang.String r8 = "CDSBloksBottomSheetDelegate"
            if (r0 == 0) goto L_0x15c8
            java.lang.String r0 = r0.A02
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x15c8
            java.util.Iterator r7 = r1.iterator()
            java.util.Deque r0 = r2.A0A
            java.util.Iterator r6 = r0.iterator()
            java.util.Deque r0 = r2.A0B
            java.util.Iterator r5 = r0.iterator()
            r4 = 0
            r2 = r3
        L_0x046d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x15cb
            java.lang.Object r1 = r7.next()
            X.0Pd r1 = (X.C05070Pd) r1
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0483
            java.lang.Object r4 = r6.next()
        L_0x0483:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x048d
            java.lang.Object r2 = r5.next()
        L_0x048d:
            java.lang.String r0 = r1.A02
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x046d
            X.0X5 r0 = r1.A00
            r0.A07()
            r7.remove()
            if (r4 == 0) goto L_0x04a2
            r6.remove()
        L_0x04a2:
            if (r2 == 0) goto L_0x002d
            r5.remove()
            return r3
        L_0x04a8:
            X.C18450wi.A0H(r8, r0)
            X.C18450wi.A0H(r2, r1)
            java.util.List r10 = r8.A00
            java.lang.Object r7 = r10.get(r0)
            if (r7 == 0) goto L_0x15ec
            X.0q7 r7 = (X.C14990q7) r7
            java.lang.Object r8 = r10.get(r1)
            if (r8 == 0) goto L_0x15e4
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r4 = r10.get(r6)
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Number"
            if (r4 == 0) goto L_0x15de
            java.lang.Number r4 = (java.lang.Number) r4
            int r6 = r4.intValue()
            r4 = 3
            java.lang.Object r4 = r10.get(r4)
            if (r4 == 0) goto L_0x15d8
            java.lang.Number r4 = (java.lang.Number) r4
            int r9 = r4.intValue()
            r4 = 4
            java.lang.Object r4 = r10.get(r4)
            X.1e9 r5 = X.C31411e8.A01(r4)
            r4 = 5
            java.lang.Object r4 = r10.get(r4)
            X.1e9 r4 = X.C31411e8.A01(r4)
            android.content.Context r14 = r7.A00
            X.4Lu r10 = new X.4Lu
            r10.<init>(r7, r2, r5, r4)
            X.4DH r11 = new X.4DH
            r11.<init>(r15)
            r7 = r9
            if (r9 <= 0) goto L_0x06e3
            if (r6 <= 0) goto L_0x06e3
            android.net.Uri r2 = X.C90214dk.A00(r8)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            java.lang.String r4 = r2.getPath()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            if (r4 != 0) goto L_0x052c
            X.0KZ r6 = X.AnonymousClass0KZ.INVALID_PARAMETER     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r5 = 0
            X.0q1 r4 = r10.A02     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            if (r4 == 0) goto L_0x002d
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.0q7 r0 = r10.A00     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r2[r5] = r0     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            java.lang.String r0 = r6.toString()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r2[r1] = r0     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            java.util.List r0 = X.AnonymousClass1JA.A0R(r2)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.0q3 r1 = new X.0q3     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.0q4 r0 = r10.A01     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.C14980q6.A00(r0, r1, r4)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            goto L_0x15d1
        L_0x052c:
            java.io.File r13 = new java.io.File     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r13.<init>(r4)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            java.lang.String r5 = r13.getCanonicalPath()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.03o r4 = new X.03o     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            int r5 = r4.A07(r0)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r4 = 6
            if (r5 == r4) goto L_0x0545
            r4 = 8
            if (r5 != r4) goto L_0x0547
        L_0x0545:
            r7 = r6
            r6 = r9
        L_0x0547:
            android.content.ContentResolver r4 = r14.getContentResolver()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            java.io.InputStream r8 = r4.openInputStream(r2)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            if (r8 != 0) goto L_0x0575
            X.0KZ r6 = X.AnonymousClass0KZ.INTERNAL_ERROR     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r5 = 0
            X.0q1 r4 = r10.A02     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            if (r4 == 0) goto L_0x002d
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.0q7 r0 = r10.A00     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r2[r5] = r0     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            java.lang.String r0 = r6.toString()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r2[r1] = r0     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            java.util.List r0 = X.AnonymousClass1JA.A0R(r2)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.0q3 r1 = new X.0q3     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.0q4 r0 = r10.A01     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.C14980q6.A00(r0, r1, r4)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            goto L_0x15d2
        L_0x0575:
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x06de }
            r4.<init>()     // Catch:{ all -> 0x06de }
            r4.inJustDecodeBounds = r1     // Catch:{ all -> 0x06de }
            android.graphics.BitmapFactory.decodeStream(r8, r3, r4)     // Catch:{ all -> 0x06de }
            int r5 = r4.outWidth     // Catch:{ all -> 0x06de }
            int r4 = r4.outHeight     // Catch:{ all -> 0x06de }
            android.graphics.Rect r12 = new android.graphics.Rect     // Catch:{ all -> 0x06de }
            r12.<init>(r0, r0, r5, r4)     // Catch:{ all -> 0x06de }
            r8.close()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            int r5 = r12.width()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            int r4 = r12.height()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            if (r5 <= 0) goto L_0x06ba
            if (r4 <= 0) goto L_0x06ba
            if (r5 > r6) goto L_0x05bc
            if (r4 > r7) goto L_0x05bc
            X.0q1 r6 = r10.A03     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            if (r6 == 0) goto L_0x002d
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.0q7 r4 = r10.A00     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r5[r0] = r4     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            java.lang.String r0 = r2.toString()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r5[r1] = r0     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            java.util.List r0 = X.AnonymousClass1JA.A0R(r5)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.0q3 r1 = new X.0q3     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.0q4 r0 = r10.A01     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.C14980q6.A00(r0, r1, r6)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            goto L_0x15d3
        L_0x05bc:
            android.graphics.Rect r8 = new android.graphics.Rect     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r8.<init>(r0, r0, r6, r7)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            int r4 = r12.width()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            double r6 = (double) r4     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r6 = r6 * r15
            int r4 = r8.width()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            double r4 = (double) r4     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            double r6 = r6 / r4
            int r4 = r12.height()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            double r4 = (double) r4     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            double r4 = r4 * r15
            int r8 = r8.height()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            double r8 = (double) r8     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            double r4 = r4 / r8
            double r6 = java.lang.Math.max(r6, r4)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            int r4 = r12.width()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            double r4 = (double) r4     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            double r4 = r4 / r6
            int r8 = (int) r4     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            int r4 = r12.height()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            double r4 = (double) r4     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            double r4 = r4 / r6
            int r6 = (int) r4     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            android.graphics.Rect r7 = new android.graphics.Rect     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r7.<init>(r0, r0, r8, r6)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            android.content.ContentResolver r4 = r14.getContentResolver()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            java.io.InputStream r8 = r4.openInputStream(r2)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r6 = 0
            if (r8 == 0) goto L_0x0696
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r8)     // Catch:{ all -> 0x06de }
            if (r5 == 0) goto L_0x060f
            int r4 = r7.width()     // Catch:{ all -> 0x06de }
            int r2 = r7.height()     // Catch:{ all -> 0x06de }
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createScaledBitmap(r5, r4, r2, r1)     // Catch:{ all -> 0x06de }
        L_0x060f:
            r8.close()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            if (r6 == 0) goto L_0x0696
            X.1K5 r4 = r11.A00     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            java.lang.String r1 = r1.toString()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r2.append(r1)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            java.lang.String r1 = ".jpg"
            r2.append(r1)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            java.lang.String r1 = r2.toString()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            java.io.File r5 = r4.AC7(r1)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0691 }
            r1 = 100
            r6.compress(r2, r1, r4)     // Catch:{ all -> 0x0691 }
            r4.flush()     // Catch:{ all -> 0x0691 }
            r4.close()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            java.lang.String r1 = r5.getCanonicalPath()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.03o r4 = new X.03o     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r4.<init>(r1)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            java.lang.String r2 = r13.getCanonicalPath()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.03o r1 = new X.03o     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            int r0 = r1.A07(r0)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            if (r0 == 0) goto L_0x0667
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r4.A0O(r0)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r4.A0A()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
        L_0x0667:
            android.net.Uri r5 = android.net.Uri.fromFile(r5)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r1 = 0
            X.C18450wi.A0H(r5, r1)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.0q1 r4 = r10.A03     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            if (r4 == 0) goto L_0x002d
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.0q7 r0 = r10.A00     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r2[r1] = r0     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r1 = 1
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r2[r1] = r0     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            java.util.List r0 = X.AnonymousClass1JA.A0R(r2)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.0q3 r1 = new X.0q3     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.0q4 r0 = r10.A01     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.C14980q6.A00(r0, r1, r4)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            goto L_0x15d4
        L_0x0691:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x06e2 }
            goto L_0x06e2
        L_0x0696:
            X.0KZ r6 = X.AnonymousClass0KZ.INTERNAL_ERROR     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r5 = 0
            X.0q1 r4 = r10.A02     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            if (r4 == 0) goto L_0x002d
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.0q7 r0 = r10.A00     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r2[r5] = r0     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            java.lang.String r0 = r6.toString()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r2[r1] = r0     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            java.util.List r0 = X.AnonymousClass1JA.A0R(r2)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.0q3 r1 = new X.0q3     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.0q4 r0 = r10.A01     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.C14980q6.A00(r0, r1, r4)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            goto L_0x15d5
        L_0x06ba:
            X.0KZ r6 = X.AnonymousClass0KZ.INVALID_PARAMETER     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r5 = 0
            X.0q1 r4 = r10.A02     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            if (r4 == 0) goto L_0x002d
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.0q7 r0 = r10.A00     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r2[r5] = r0     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            java.lang.String r0 = r6.toString()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r2[r1] = r0     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            java.util.List r0 = X.AnonymousClass1JA.A0R(r2)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.0q3 r1 = new X.0q3     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.0q4 r0 = r10.A01     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.C14980q6.A00(r0, r1, r4)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            goto L_0x15d6
        L_0x06de:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x06e2 }
        L_0x06e2:
            throw r0     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
        L_0x06e3:
            X.0KZ r6 = X.AnonymousClass0KZ.INVALID_PARAMETER     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r5 = 0
            X.0q1 r4 = r10.A02     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            if (r4 == 0) goto L_0x002d
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.0q7 r0 = r10.A00     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r2[r5] = r0     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            java.lang.String r0 = r6.toString()     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r2[r1] = r0     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            java.util.List r0 = X.AnonymousClass1JA.A0R(r2)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.0q3 r1 = new X.0q3     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.0q4 r0 = r10.A01     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            X.C14980q6.A00(r0, r1, r4)     // Catch:{ FileNotFoundException -> 0x070a, IOException -> 0x0707, SecurityException -> 0x070d }
            goto L_0x15d7
        L_0x0707:
            X.0KZ r5 = X.AnonymousClass0KZ.INTERNAL_ERROR
            goto L_0x070f
        L_0x070a:
            X.0KZ r5 = X.AnonymousClass0KZ.FILE_NOT_FOUND
            goto L_0x070f
        L_0x070d:
            X.0KZ r5 = X.AnonymousClass0KZ.INVALID_PARAMETER
        L_0x070f:
            r1 = 0
            X.C18450wi.A0H(r5, r1)
            X.0q1 r4 = r10.A02
            if (r4 == 0) goto L_0x002d
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            X.0q7 r0 = r10.A00
            r2[r1] = r0
            r1 = 1
            java.lang.String r0 = r5.toString()
            r2[r1] = r0
            java.util.List r0 = X.AnonymousClass1JA.A0R(r2)
            X.0q3 r1 = new X.0q3
            r1.<init>(r0)
            X.0q4 r0 = r10.A01
            X.C14980q6.A00(r0, r1, r4)
            return r3
        L_0x0734:
            java.util.List r4 = r8.A00
            java.lang.Object r5 = r4.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            android.app.Activity r1 = A00(r2)
            android.content.Intent r2 = r1.getIntent()
            if (r5 == 0) goto L_0x002d
            if (r4 == 0) goto L_0x002d
            int r1 = r4.hashCode()
            switch(r1) {
                case -891985903: goto L_0x0767;
                case 64711720: goto L_0x0775;
                case 97526364: goto L_0x0786;
                case 1958052158: goto L_0x0798;
                default: goto L_0x0755;
            }
        L_0x0755:
            java.lang.String r1 = "WABLOKS: getIntentParameter type not supported: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r3
        L_0x0767:
            java.lang.String r0 = "string"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0755
            java.lang.String r3 = r2.getStringExtra(r5)
            return r3
        L_0x0775:
            java.lang.String r1 = "boolean"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0755
            boolean r0 = r2.getBooleanExtra(r5, r0)
            if (r0 == 0) goto L_0x15f4
            java.lang.String r3 = "1"
            return r3
        L_0x0786:
            java.lang.String r0 = "float"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0755
            r0 = 0
            float r0 = r2.getFloatExtra(r5, r0)
            java.lang.String r3 = java.lang.Float.toString(r0)
            return r3
        L_0x0798:
            java.lang.String r1 = "integer"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0755
            int r0 = r2.getIntExtra(r5, r0)
            java.lang.String r3 = java.lang.Integer.toString(r0)
            return r3
        L_0x07a9:
            java.util.List r1 = r8.A00
            java.lang.Object r7 = r1.get(r0)
            X.1dg r7 = (X.C31201dg) r7
            android.app.Activity r0 = A00(r2)
            X.C62563Eb.A02(r2, r8, r6)
            if (r7 == 0) goto L_0x07bd
            r7.A0H(r5)
        L_0x07bd:
            android.app.Activity r0 = X.AnonymousClass0T1.A00(r0)
            java.util.List r1 = X.AnonymousClass0T1.A01(r0)
            if (r1 == 0) goto L_0x07e7
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x07e7
            java.lang.Object r0 = A04(r1)
        L_0x07d1:
            X.0mZ r0 = (X.C13550mZ) r0
            if (r0 == 0) goto L_0x15f7
            com.obwhatsapp.bloks.components.BkCdsBottomSheetFragment r0 = (com.obwhatsapp.bloks.components.BkCdsBottomSheetFragment) r0
            X.0SF r4 = r0.A1J()
            r4.A06 = r7
            X.0Kf r2 = r4.A04
            X.0Kf r0 = X.C03880Kf.FULL_SCREEN
            r1 = 1
            if (r2 != r0) goto L_0x07e9
            r4.A08 = r1
            return r3
        L_0x07e7:
            r0 = 0
            goto L_0x07d1
        L_0x07e9:
            X.0A2 r0 = r4.A05
            if (r0 == 0) goto L_0x002d
            r4.A08 = r1
            r0.dismiss()
            return r3
        L_0x07f3:
            X.C18450wi.A0H(r8, r0)
            X.C18450wi.A0H(r2, r1)
            java.util.List r4 = r8.A00
            java.lang.Object r6 = r4.get(r0)
            if (r6 == 0) goto L_0x1607
            X.0q7 r6 = (X.C14990q7) r6
            java.lang.Object r8 = r4.get(r1)
            if (r8 == 0) goto L_0x15ff
            X.1dg r8 = (X.C31201dg) r8
            X.0q1 r7 = r8.A0H(r5)
            r4 = 36
            java.lang.String r5 = r8.A0J(r4)
            if (r5 == 0) goto L_0x002d
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L_0x002d
            int r4 = r5.hashCode()
            switch(r4) {
                case -1367751899: goto L_0x0825;
                case -196315310: goto L_0x0830;
                case -94789412: goto L_0x083b;
                default: goto L_0x0824;
            }
        L_0x0824:
            return r3
        L_0x0825:
            java.lang.String r4 = "camera"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x002d
            java.lang.String r5 = "android.permission.CAMERA"
            goto L_0x0845
        L_0x0830:
            java.lang.String r4 = "gallery"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x002d
            java.lang.String r5 = "android.permission.WRITE_EXTERNAL_STORAGE"
            goto L_0x0845
        L_0x083b:
            java.lang.String r4 = "read_contacts"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x002d
            java.lang.String r5 = "android.permission.READ_CONTACTS"
        L_0x0845:
            android.app.Activity r4 = A00(r2)
            java.lang.String[] r1 = new java.lang.String[r1]
            r1[r0] = r5
            X.4w7 r0 = new X.4w7
            r0.<init>(r6, r2, r7)
            r15.AcH(r4, r0, r1)
            return r3
        L_0x0856:
            java.util.List r2 = r8.A00
            java.lang.Object r3 = r2.get(r0)
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r2 = r2.get(r1)
            if (r3 == 0) goto L_0x086d
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x086d
            java.lang.String r0 = "properties"
            goto L_0x088b
        L_0x086d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "WaExtensions/GetChildNode Cannot find the attribute ["
            goto L_0x08a2
        L_0x0875:
            java.util.List r2 = r8.A00
            java.lang.Object r3 = r2.get(r0)
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r2 = r2.get(r1)
            if (r3 == 0) goto L_0x089b
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x089b
            java.lang.String r0 = "children"
        L_0x088b:
            java.lang.Object r0 = r3.get(r0)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x0899
            java.lang.Object r3 = r0.get(r2)
            if (r3 != 0) goto L_0x002d
        L_0x0899:
            r3 = 0
            return r3
        L_0x089b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "WaExtensions/GetChildNode Cannot find the child node ["
        L_0x08a2:
            r1.append(r0)
            r1.append(r2)
            r1.append(r12)
            java.lang.String r3 = r1.toString()
            int r0 = r10.hashCode()
            switch(r0) {
                case 97: goto L_0x08c1;
                case 100: goto L_0x08ca;
                case 101: goto L_0x08cc;
                case 105: goto L_0x08d3;
                case 118: goto L_0x08dc;
                case 119: goto L_0x08e6;
                default: goto L_0x08b6;
            }
        L_0x08b6:
            java.lang.String r0 = "[Bloks logging] incorrect level: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r10)
            goto L_0x0911
        L_0x08c1:
            java.lang.String r0 = "a"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0963
            goto L_0x08b6
        L_0x08ca:
            r0 = r10
            goto L_0x08df
        L_0x08cc:
            boolean r0 = r10.equals(r9)
            if (r0 != 0) goto L_0x0918
            goto L_0x08b6
        L_0x08d3:
            java.lang.String r0 = "i"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0968
            goto L_0x08b6
        L_0x08dc:
            java.lang.String r0 = "v"
        L_0x08df:
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x0899
            goto L_0x08b6
        L_0x08e6:
            java.lang.String r0 = "w"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x096d
            goto L_0x08b6
        L_0x08f0:
            java.util.List r1 = r8.A00
            java.lang.Object r2 = r1.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x091d
            java.lang.String r3 = "WaExtensions/evaluate/bk.action.io.clipboard.SetString: text cannot be null or empty"
            int r0 = r9.hashCode()
            switch(r0) {
                case 97: goto L_0x0936;
                case 100: goto L_0x095c;
                case 101: goto L_0x093f;
                case 105: goto L_0x0946;
                case 118: goto L_0x0959;
                case 119: goto L_0x094f;
                default: goto L_0x0907;
            }
        L_0x0907:
            java.lang.String r0 = "[Bloks logging] incorrect level: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r9)
        L_0x0911:
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0918:
            com.whatsapp.util.Log.e((java.lang.String) r3)
            goto L_0x0899
        L_0x091d:
            android.content.ClipboardManager r1 = r15.AAf()
            if (r1 == 0) goto L_0x0899
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r2, r2)     // Catch:{ NullPointerException | SecurityException -> 0x092c }
            r1.setPrimaryClip(r0)     // Catch:{ NullPointerException | SecurityException -> 0x092c }
            goto L_0x0899
        L_0x092c:
            java.lang.String r3 = "bkinterpreter/clipboard/"
            int r0 = r9.hashCode()
            switch(r0) {
                case 97: goto L_0x0936;
                case 100: goto L_0x095c;
                case 101: goto L_0x093f;
                case 105: goto L_0x0946;
                case 118: goto L_0x0959;
                case 119: goto L_0x094f;
                default: goto L_0x0935;
            }
        L_0x0935:
            goto L_0x0907
        L_0x0936:
            java.lang.String r0 = "a"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0963
            goto L_0x0907
        L_0x093f:
            boolean r0 = r9.equals(r9)
            if (r0 != 0) goto L_0x0918
            goto L_0x0907
        L_0x0946:
            java.lang.String r0 = "i"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0968
            goto L_0x0907
        L_0x094f:
            java.lang.String r0 = "w"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x096d
            goto L_0x0907
        L_0x0959:
            java.lang.String r10 = "v"
        L_0x095c:
            boolean r0 = r9.equals(r10)
            if (r0 != 0) goto L_0x0899
            goto L_0x0907
        L_0x0963:
            com.whatsapp.util.Log.a((java.lang.String) r3)
            goto L_0x0899
        L_0x0968:
            com.whatsapp.util.Log.i((java.lang.String) r3)
            goto L_0x0899
        L_0x096d:
            com.whatsapp.util.Log.w((java.lang.String) r3)
            goto L_0x0899
        L_0x0972:
            java.lang.String r3 = "wa.action.FinishActivityWithResult"
            boolean r3 = r8.equals(r3)
            r13 = 82
            goto L_0x0cba
        L_0x097d:
            java.lang.String r3 = "wa.action.GetAbPropValue"
            boolean r3 = r8.equals(r3)
            r13 = 81
            goto L_0x0cba
        L_0x0988:
            java.lang.String r3 = "bk.action.qpl.MarkerStartV2"
            boolean r3 = r8.equals(r3)
            r13 = 80
            goto L_0x0cba
        L_0x0992:
            java.lang.String r3 = "wa.action.bloks.LaunchDialog"
            boolean r3 = r8.equals(r3)
            r13 = 79
            goto L_0x0cba
        L_0x099d:
            java.lang.String r3 = "bk.action.string.MatchesRegex"
            boolean r3 = r8.equals(r3)
            r13 = 78
            goto L_0x0cba
        L_0x09a7:
            java.lang.String r3 = "wa.action.ShowProgressBar"
            boolean r3 = r8.equals(r3)
            r13 = 77
            goto L_0x0cba
        L_0x09b2:
            java.lang.String r3 = "bk.action.cds.UnwindToScreen"
            boolean r3 = r8.equals(r3)
            r13 = 76
            goto L_0x0cba
        L_0x09bc:
            java.lang.String r3 = "bk.action.qpl.MarkerAnnotate"
            boolean r3 = r8.equals(r3)
            r13 = 75
            goto L_0x0cba
        L_0x09c6:
            java.lang.String r3 = "bk.action.bloks.OpenBottomSheet"
            boolean r3 = r8.equals(r3)
            r13 = 74
            goto L_0x0cba
        L_0x09d0:
            java.lang.String r3 = "wa.action.DismissDialog"
            boolean r3 = r8.equals(r3)
            r13 = 73
            goto L_0x0cba
        L_0x09db:
            java.lang.String r3 = "bk.action.io.DebugToast"
            boolean r3 = r8.equals(r3)
            r13 = 72
            goto L_0x0cba
        L_0x09e5:
            java.lang.String r3 = "wa.action.FormatString"
            boolean r3 = r8.equals(r3)
            r13 = 71
            goto L_0x0cba
        L_0x09f0:
            java.lang.String r3 = "bk.action.bloks.DismissBottomSheet"
            boolean r3 = r8.equals(r3)
            r13 = 70
            goto L_0x0cba
        L_0x09fa:
            java.lang.String r3 = "wa.action.PopScreen"
            boolean r3 = r8.equals(r3)
            r13 = 69
            goto L_0x0cba
        L_0x0a05:
            java.lang.String r3 = "wa.action.GetFieldStatEventId"
            boolean r3 = r8.equals(r3)
            r13 = 68
            goto L_0x0cba
        L_0x0a10:
            java.lang.String r3 = "wa.action.Logging"
            boolean r3 = r8.equals(r3)
            r13 = 67
            goto L_0x0cba
        L_0x0a1b:
            java.lang.String r3 = "wa.action.navigation.OpenContactInfo"
            boolean r3 = r8.equals(r3)
            r13 = 66
            goto L_0x0cba
        L_0x0a26:
            java.lang.String r3 = "bk.action.qpl.userflow.EndFlowCancelV2"
            boolean r3 = r8.equals(r3)
            r13 = 65
            goto L_0x0cba
        L_0x0a30:
            java.lang.String r3 = "bk.action.foa.media.ResizeImage"
            boolean r3 = r8.equals(r3)
            r13 = 64
            goto L_0x0cba
        L_0x0a3a:
            java.lang.String r3 = "wa.action.GetIntentParameter"
            boolean r3 = r8.equals(r3)
            r13 = 63
            goto L_0x0cba
        L_0x0a45:
            java.lang.String r3 = "wa.action.FinishActivity"
            boolean r3 = r8.equals(r3)
            r13 = 62
            goto L_0x0cba
        L_0x0a50:
            java.lang.String r3 = "bk.action.bloks.PopBottomSheet"
            boolean r3 = r8.equals(r3)
            r13 = 61
            goto L_0x0cba
        L_0x0a5a:
            java.lang.String r3 = "bk.action.io.Toast"
            boolean r3 = r8.equals(r3)
            r13 = 60
            goto L_0x0cba
        L_0x0a64:
            java.lang.String r3 = "bk.action.session_store.Get"
            boolean r3 = r8.equals(r3)
            r13 = 59
            goto L_0x0cba
        L_0x0a6e:
            java.lang.String r3 = "wa.action.navigation.OpenChat"
            boolean r3 = r8.equals(r3)
            r13 = 58
            goto L_0x0cba
        L_0x0a79:
            java.lang.String r3 = "wa.action.share.Text"
            boolean r3 = r8.equals(r3)
            r13 = 57
            goto L_0x0cba
        L_0x0a84:
            java.lang.String r3 = "bk.action.cds.DismissCdsBottomSheet"
            boolean r3 = r8.equals(r3)
            r13 = 56
            goto L_0x0cba
        L_0x0a8e:
            java.lang.String r3 = "bk.action.navigation.CloseScreen"
            boolean r3 = r8.equals(r3)
            r13 = 55
            goto L_0x0cba
        L_0x0a98:
            java.lang.String r3 = "wa.action.GetAppType"
            boolean r3 = r8.equals(r3)
            r13 = 54
            goto L_0x0cba
        L_0x0aa3:
            java.lang.String r3 = "wa.action.DismissProgressBar"
            boolean r3 = r8.equals(r3)
            r13 = 53
            goto L_0x0cba
        L_0x0aae:
            java.lang.String r3 = "wa.action.SendFieldStatV2"
            boolean r3 = r8.equals(r3)
            r13 = 52
            goto L_0x0cba
        L_0x0ab9:
            java.lang.String r3 = "bk.action.qpl.userflow.MarkPointV2"
            boolean r3 = r8.equals(r3)
            r13 = 51
            goto L_0x0cba
        L_0x0ac3:
            java.lang.String r3 = "bk.action.qpl.userflow.EndFlowSuccessV2"
            boolean r3 = r8.equals(r3)
            r13 = 50
            goto L_0x0cba
        L_0x0acd:
            java.lang.String r3 = "wa.action.care.OpenContactSupport"
            boolean r3 = r8.equals(r3)
            r13 = 49
            goto L_0x0cba
        L_0x0ad8:
            java.lang.String r3 = "bk.action.bloks.AsyncAction"
            boolean r3 = r8.equals(r3)
            r13 = 48
            goto L_0x0cba
        L_0x0ae2:
            java.lang.String r3 = "bk.action.RequestPermission"
            boolean r3 = r8.equals(r3)
            r13 = 47
            goto L_0x0cba
        L_0x0aec:
            java.lang.String r3 = "wa.action.ResetFieldStats"
            boolean r3 = r8.equals(r3)
            r13 = 46
            goto L_0x0cba
        L_0x0af7:
            java.lang.String r3 = "bk.action.dialog.OpenDialog"
            boolean r3 = r8.equals(r3)
            r13 = 45
            goto L_0x0cba
        L_0x0b01:
            java.lang.String r3 = "bk.action.bloks.PushBottomSheet"
            boolean r3 = r8.equals(r3)
            r13 = 44
            goto L_0x0cba
        L_0x0b0b:
            java.lang.String r3 = "wa.action.GetFieldStatElapsedTime"
            boolean r3 = r8.equals(r3)
            r13 = 43
            goto L_0x0cba
        L_0x0b16:
            java.lang.String r3 = "bk.action.qpl.MarkerEnd"
            boolean r3 = r8.equals(r3)
            r13 = 42
            goto L_0x0cba
        L_0x0b20:
            java.lang.String r3 = "wa.action.navigation.OpenScreenWithOptions"
            boolean r3 = r8.equals(r3)
            r13 = 41
            goto L_0x0cba
        L_0x0b2b:
            java.lang.String r3 = "bk.action.cds.OpenCdsBottomSheet"
            boolean r3 = r8.equals(r3)
            r13 = 40
            goto L_0x0cba
        L_0x0b35:
            java.lang.String r3 = "wa.action.DeregDeeplinkListener"
            boolean r3 = r8.equals(r3)
            r13 = 39
            goto L_0x0cba
        L_0x0b40:
            java.lang.String r3 = "bk.action.bloks.LaunchDialog"
            boolean r3 = r8.equals(r3)
            r13 = 38
            goto L_0x0cba
        L_0x0b4a:
            java.lang.String r3 = "wa.action.GetAttributeValue"
            boolean r3 = r8.equals(r3)
            r13 = 37
            goto L_0x0cba
        L_0x0b55:
            java.lang.String r3 = "wa.action.OpenUrl"
            boolean r3 = r8.equals(r3)
            r13 = 36
            goto L_0x0cba
        L_0x0b60:
            java.lang.String r3 = "wa.action.navigation.OpenNativeActionSheet"
            boolean r3 = r8.equals(r3)
            r13 = 35
            goto L_0x0cba
        L_0x0b6b:
            java.lang.String r3 = "wa.action.StartFieldStatTimer"
            boolean r3 = r8.equals(r3)
            r13 = 34
            goto L_0x0cba
        L_0x0b76:
            java.lang.String r3 = "bk.action.cds.PopCdsBottomSheet"
            boolean r3 = r8.equals(r3)
            r13 = 33
            goto L_0x0cba
        L_0x0b80:
            java.lang.String r3 = "bk.action.bloks.OpenScreen"
            boolean r3 = r8.equals(r3)
            r13 = 32
            goto L_0x0cba
        L_0x0b8a:
            java.lang.String r3 = "wa.action.HandleError"
            boolean r3 = r8.equals(r3)
            r13 = 31
            goto L_0x0cba
        L_0x0b95:
            java.lang.String r3 = "wa.action.RegDeeplinkListener"
            boolean r3 = r8.equals(r3)
            r13 = 30
            goto L_0x0cba
        L_0x0ba0:
            java.lang.String r3 = "wa.action.GetChildNode"
            boolean r3 = r8.equals(r3)
            r13 = 29
            goto L_0x0cba
        L_0x0bab:
            java.lang.String r3 = "bk.action.foa.media.OpenCamera"
            boolean r3 = r8.equals(r3)
            r13 = 28
            goto L_0x0cba
        L_0x0bb5:
            java.lang.String r3 = "bk.action.bloks.CloseScreenV2"
            boolean r3 = r8.equals(r3)
            r13 = 27
            goto L_0x0cba
        L_0x0bbf:
            java.lang.String r3 = "wa.action.FormatStringV2"
            boolean r3 = r8.equals(r3)
            r13 = 26
            goto L_0x0cba
        L_0x0bca:
            java.lang.String r3 = "bk.action.qpl.userflow.StartFlowV2"
            boolean r3 = r8.equals(r3)
            r13 = 25
            goto L_0x0cba
        L_0x0bd4:
            java.lang.String r3 = "bk.action.navigation.OpenUrl"
            boolean r3 = r8.equals(r3)
            r13 = 24
            goto L_0x0cba
        L_0x0bde:
            java.lang.String r3 = "bk.action.cds.internal.RemoveCdsBottomSheet"
            boolean r3 = r8.equals(r3)
            r13 = 23
            goto L_0x0cba
        L_0x0be8:
            java.lang.String r3 = "bk.action.qpl.userflow.MarkErrorV2"
            boolean r3 = r8.equals(r3)
            r13 = 22
            goto L_0x0cba
        L_0x0bf2:
            java.lang.String r3 = "bk.action.debug.internal.DeviceLog"
            boolean r3 = r8.equals(r3)
            r13 = 21
            goto L_0x0cba
        L_0x0bfc:
            java.lang.String r3 = "bk.action.qpl.MarkerStart"
            boolean r3 = r8.equals(r3)
            r13 = 20
            goto L_0x0cba
        L_0x0c06:
            java.lang.String r3 = "bk.action.qpl.MarkerPoint"
            boolean r3 = r8.equals(r3)
            r13 = 19
            goto L_0x0cba
        L_0x0c10:
            java.lang.String r3 = "bk.action.qpl.MarkerEndV2"
            boolean r3 = r8.equals(r3)
            r13 = 18
            goto L_0x0cba
        L_0x0c1a:
            java.lang.String r3 = "wa.action.TimeInFuture"
            boolean r3 = r8.equals(r3)
            r13 = 17
            goto L_0x0cba
        L_0x0c25:
            java.lang.String r3 = "bk.action.logging.LogEvent"
            boolean r3 = r8.equals(r3)
            r13 = 16
            goto L_0x0cba
        L_0x0c2f:
            java.lang.String r3 = "bk.action.io.clipboard.SetString"
            boolean r3 = r8.equals(r3)
            r13 = 15
            goto L_0x0cba
        L_0x0c39:
            java.lang.String r3 = "wa.action.SendFieldStat"
            boolean r3 = r8.equals(r3)
            r13 = 14
            goto L_0x0cba
        L_0x0c43:
            java.lang.String r3 = "bk.action.qpl.userflow.EndFlowFailureV2"
            boolean r3 = r8.equals(r3)
            r13 = 13
            goto L_0x0cba
        L_0x0c4c:
            java.lang.String r3 = "bk.fx.action.GetFamilyDeviceId"
            boolean r3 = r8.equals(r3)
            r13 = 12
            goto L_0x0cba
        L_0x0c55:
            java.lang.String r3 = "bk.action.qpl.userflow.AnnotateV2"
            boolean r3 = r8.equals(r3)
            r13 = 11
            goto L_0x0cba
        L_0x0c5e:
            java.lang.String r3 = "bk.action.qpl.MarkerDrop"
            boolean r3 = r8.equals(r3)
            r13 = 10
            goto L_0x0cba
        L_0x0c67:
            java.lang.String r3 = "wa.action.care.OpenReportThisPayment"
            boolean r3 = r8.equals(r3)
            r13 = 9
            goto L_0x0cba
        L_0x0c71:
            java.lang.String r3 = "bk.action.navigation.SetNavBar"
            boolean r3 = r8.equals(r3)
            r13 = 8
            goto L_0x0cba
        L_0x0c7a:
            java.lang.String r3 = "bk.action.bloks.AsyncActionWithDataManifest"
            boolean r3 = r8.equals(r3)
            r13 = 7
            goto L_0x0cba
        L_0x0c82:
            java.lang.String r3 = "wa.action.dialog.ShowDialogWithClientData"
            boolean r3 = r8.equals(r3)
            r13 = 6
            goto L_0x0cba
        L_0x0c8b:
            java.lang.String r3 = "bk.action.preload.RequestPreloadScreenV2"
            boolean r3 = r8.equals(r3)
            r13 = 5
            goto L_0x0cba
        L_0x0c93:
            java.lang.String r3 = "bk.action.dialog.OpenDialogV2"
            boolean r3 = r8.equals(r3)
            r13 = 4
            goto L_0x0cba
        L_0x0c9b:
            java.lang.String r3 = "bk.action.preload.InvalidatePreloadScreenV2"
            boolean r3 = r8.equals(r3)
            r13 = 3
            goto L_0x0cba
        L_0x0ca3:
            java.lang.String r3 = "bk.action.io.CurrentTimeMillis"
            boolean r3 = r8.equals(r3)
            r13 = 2
            goto L_0x0cba
        L_0x0cab:
            java.lang.String r3 = "bk.action.cds.PushCdsBottomSheet"
            boolean r3 = r8.equals(r3)
            r13 = 1
            goto L_0x0cba
        L_0x0cb3:
            java.lang.String r3 = "bk.action.bloks.AsyncActionWithDataManifestV2"
            boolean r3 = r8.equals(r3)
            r13 = 0
        L_0x0cba:
            if (r3 != 0) goto L_0x0019
            goto L_0x0018
        L_0x0cbe:
            java.util.Map r3 = r15.AAA()
            return r3
        L_0x0cc3:
            java.lang.Object r3 = r4.A0B(r2, r8, r0)
            return r3
        L_0x0cc8:
            java.lang.String r3 = r15.AEz()
            return r3
        L_0x0ccd:
            java.lang.Object r3 = r4.A0B(r2, r8, r1)
            return r3
        L_0x0cd2:
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L_0x0cdb:
            java.util.List r3 = r8.A00
            java.lang.Object r0 = r3.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.lang.Object r0 = r3.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = r15.A9d(r2, r0)
            return r3
        L_0x0cf2:
            java.util.List r2 = r8.A00
            java.lang.Object r0 = r2.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            java.lang.Object r2 = r2.get(r6)
            r1 = 8
            com.facebook.redex.IDxMWrapperShape226S0100000_2_I0 r0 = new com.facebook.redex.IDxMWrapperShape226S0100000_2_I0
            r0.<init>(r2, r1)
            r15.Ab6(r0, r3, r5, r4)
            return r3
        L_0x0d17:
            java.util.List r3 = r8.A00
            java.lang.Object r2 = r3.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r3.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r0.matcher(r2)
            boolean r0 = r0.matches()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x0d36:
            java.util.List r6 = r8.A00
            java.lang.Object r5 = r6.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            int r4 = r6.size()
            int r4 = r4 - r1
            java.lang.String[] r3 = new java.lang.String[r4]
        L_0x0d45:
            if (r0 >= r4) goto L_0x0d51
            int r2 = r0 + 1
            java.lang.Object r1 = r6.get(r2)
            r3[r0] = r1
            r0 = r2
            goto L_0x0d45
        L_0x0d51:
            java.lang.String r3 = java.text.MessageFormat.format(r5, r3)
            return r3
        L_0x0d56:
            java.util.List r4 = r8.A00
            java.lang.Object r0 = r4.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.lang.Object r0 = r4.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r4.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            r15.Ab7(r2, r0, r1)
            return r3
        L_0x0d76:
            java.lang.String r3 = "CONSUMER"
            return r3
        L_0x0d79:
            java.util.List r5 = r8.A00
            java.lang.Object r0 = r5.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            java.lang.Object r0 = r5.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.lang.Object r1 = r5.get(r6)
            java.lang.String r1 = (java.lang.String) r1
            r0 = 3
            java.lang.Object r0 = r5.get(r0)
            java.util.Map r0 = (java.util.Map) r0
            r15.AbB(r1, r0, r4, r2)
            return r3
        L_0x0da0:
            java.util.List r4 = r8.A00
            java.lang.Object r0 = r4.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.lang.Object r0 = r4.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r15.AbA(r2, r0)
            return r3
        L_0x0dba:
            java.util.List r1 = r8.A00
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            android.app.Activity r0 = A00(r2)
            r15.AZv(r0, r1)
            return r3
        L_0x0dca:
            java.util.List r1 = r8.A00
            java.lang.Object r9 = r1.get(r0)
            X.1dg r9 = (X.C31201dg) r9
            X.0q7 r6 = X.C62563Eb.A02(r2, r8, r6)
            goto L_0x1425
        L_0x0dd8:
            r0 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L_0x0ddf:
            java.util.List r2 = r8.A00
            java.lang.Object r0 = r2.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r7 = r0.intValue()
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r8 = r0.intValue()
            java.lang.Object r0 = r2.get(r6)
            java.lang.Number r0 = (java.lang.Number) r0
            int r9 = r0.intValue()
            r0 = 3
            java.lang.Object r0 = r2.get(r0)
            java.util.Map r0 = (java.util.Map) r0
            r4 = r15
            r5 = r3
            r6 = r0
            r4.Ab4(r5, r6, r7, r8, r9)
            return r3
        L_0x0e0d:
            java.util.List r7 = r8.A00
            java.lang.Object r5 = r7.get(r0)
            X.1dg r5 = (X.C31201dg) r5
            java.lang.Object r4 = r7.get(r1)
            X.1dg r4 = (X.C31201dg) r4
            java.lang.Object r6 = r7.get(r6)
            java.util.Map r6 = (java.util.Map) r6
            java.util.HashMap r7 = A08(r6)
            java.lang.String r6 = A05(r5)
            java.lang.String r23 = A06(r5)
            X.4DF r8 = new X.4DF
            r8.<init>(r6)
            if (r4 == 0) goto L_0x0fa4
            int r11 = r4.A01
            r9 = 14059(0x36eb, float:1.9701E-41)
            r10 = 40
            r12 = 36
            if (r11 != r9) goto L_0x0f3e
            boolean r12 = r4.A0P(r12, r0)
            java.lang.String r9 = "FULL_SHEET"
            java.lang.String r9 = r4.A0K(r10, r9)
            X.0JR r11 = X.AnonymousClass0XG.A01(r9)
            r10 = 46
            java.lang.String r9 = "NEVER_ANIMATED"
            java.lang.String r9 = r4.A0K(r10, r9)
            X.0JQ r10 = X.AnonymousClass0XG.A00(r9)
            r9 = 42
            X.0q1 r17 = r4.A0H(r9)
            if (r12 == 0) goto L_0x0f3a
            X.0Kd r12 = X.C03860Kd.DISABLED
        L_0x0e62:
            X.0JR r9 = X.AnonymousClass0JR.FULL_SHEET
            if (r11 != r9) goto L_0x0f36
            X.0Kf r13 = X.C03880Kf.FULL_SHEET
        L_0x0e68:
            int r9 = r10.ordinal()
            switch(r9) {
                case 0: goto L_0x0f2a;
                case 1: goto L_0x0f2e;
                case 2: goto L_0x0e6f;
                case 3: goto L_0x0f32;
                default: goto L_0x0e6f;
            }
        L_0x0e6f:
            X.0Ke r10 = X.C03870Ke.STATIC
        L_0x0e71:
            X.0Kc r11 = X.C03850Kc.AUTO
            r18 = 0
            r19 = 0
            r20 = 0
            X.0XG r9 = new X.0XG
            r14 = r3
            r15 = r2
            r16 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x0e82:
            com.obwhatsapp.bloks.components.BkCdsBottomSheetFragment r4 = com.obwhatsapp.bloks.components.BkCdsBottomSheetFragment.A01(r9, r6)
            X.0q7 r9 = r2.A00
            X.22A r10 = r9.A02
            r4.A02 = r10
            X.0Ok r10 = new X.0Ok
            r10.<init>()
            r10.A01 = r6
            r10.A02 = r7
            r6 = 812974081(0x30750001, float:8.9130486E-10)
            r10.A00 = r6
            X.0Qa r7 = new X.0Qa
            r7.<init>(r10)
            r6 = 15932(0x3e3c, float:2.2325E-41)
            X.1dg r10 = A03(r5, r6)
            r6 = 38
            if (r10 == 0) goto L_0x0ece
            java.lang.String r12 = "adjust_pan"
            java.lang.String r11 = r10.A0K(r6, r12)
            int r6 = r11.hashCode()
            switch(r6) {
                case -1009740956: goto L_0x0f0d;
                case -205076707: goto L_0x0f18;
                case 1976678381: goto L_0x0f23;
                default: goto L_0x0eb6;
            }
        L_0x0eb6:
            java.lang.String r6 = "Unexpected soft input mode "
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r6)
            r12.append(r11)
            java.lang.String r6 = "; using default instead"
            r12.append(r6)
            java.lang.String r11 = r12.toString()
            java.lang.String r6 = "WindowSoftInputUtils"
            X.C29691b2.A00(r6, r11)
        L_0x0ece:
            r24 = 32
        L_0x0ed0:
            if (r10 == 0) goto L_0x0f0a
            r6 = 40
            X.0q1 r21 = r10.A0H(r6)
        L_0x0ed8:
            android.app.Activity r6 = A00(r2)
            X.00l r6 = (X.C001000l) r6
            int r12 = r5.A01
            r10 = 13647(0x354f, float:1.9124E-41)
            r11 = 0
            if (r12 != r10) goto L_0x0ee6
            r11 = 1
        L_0x0ee6:
            r10 = 43
            if (r11 != 0) goto L_0x0ef4
            r11 = 13784(0x35d8, float:1.9315E-41)
            r10 = 0
            if (r12 != r11) goto L_0x0ef0
            r10 = 1
        L_0x0ef0:
            if (r10 == 0) goto L_0x0fe0
            r10 = 38
        L_0x0ef4:
            X.1dg r10 = r5.A0G(r10)
            X.2Wa r19 = X.AnonymousClass2Wa.A00(r2, r10)
            X.02C r10 = r6.AGM()
            X.050 r2 = new X.050
            r2.<init>(r10)
            r2.A0I(r3)
            goto L_0x0faa
        L_0x0f0a:
            r21 = r3
            goto L_0x0ed8
        L_0x0f0d:
            java.lang.String r6 = "adjust_resize"
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L_0x0eb6
            r24 = 16
            goto L_0x0ed0
        L_0x0f18:
            java.lang.String r6 = "adjust_nothing"
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L_0x0eb6
            r24 = 48
            goto L_0x0ed0
        L_0x0f23:
            boolean r6 = r11.equals(r12)
            if (r6 != 0) goto L_0x0ece
            goto L_0x0eb6
        L_0x0f2a:
            X.0Ke r10 = X.C03870Ke.ANIMATED
            goto L_0x0e71
        L_0x0f2e:
            X.0Ke r10 = X.C03870Ke.DISABLED
            goto L_0x0e71
        L_0x0f32:
            X.0Ke r10 = X.C03870Ke.ANIMATED_WHILE_LOADING
            goto L_0x0e71
        L_0x0f36:
            X.0Kf r13 = X.C03880Kf.HALF_SHEET
            goto L_0x0e68
        L_0x0f3a:
            X.0Kd r12 = X.C03860Kd.ENABLED
            goto L_0x0e62
        L_0x0f3e:
            r9 = 16085(0x3ed5, float:2.254E-41)
            if (r11 != r9) goto L_0x0f8b
            java.lang.String r11 = "auto"
            java.lang.String r9 = r4.A0K(r12, r11)
            X.0Kd r14 = X.C03860Kd.A00(r9)
            r12 = 38
            java.lang.String r9 = "full_sheet"
            java.lang.String r9 = r4.A0K(r12, r9)
            X.0Kf r15 = X.C03880Kf.A00(r9)
            r12 = 35
            java.lang.String r9 = "static"
            java.lang.String r9 = r4.A0K(r12, r9)
            X.0Ke r12 = X.C03870Ke.A00(r9)
            r9 = 43
            java.lang.String r9 = r4.A0K(r9, r11)
            X.0Kc r13 = X.C03850Kc.A00(r9)
            X.0q1 r19 = r4.A0H(r10)
            r9 = 48
            boolean r20 = r4.A0P(r9, r0)
            X.0XG r9 = new X.0XG
            r21 = 0
            r22 = 0
            r16 = r3
            r17 = r2
            r18 = r4
            r11 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0e82
        L_0x0f8b:
            java.lang.String r11 = "CdsOpenScreenConfig"
            java.lang.String r9 = "Error matching OpenCDSSCreenConfig from options styleId: "
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r9)
            r9 = 132(0x84, float:1.85E-43)
            X.1dg r4 = r4.A0G(r9)
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            X.C29691b2.A00(r11, r4)
        L_0x0fa4:
            X.0XG r9 = X.AnonymousClass0XG.A02()
            goto L_0x0e82
        L_0x0faa:
            r4.A0C = r0     // Catch:{ IllegalStateException -> 0x0fba }
            r4.A0D = r1     // Catch:{ IllegalStateException -> 0x0fba }
            r2.A0C(r4, r3)     // Catch:{ IllegalStateException -> 0x0fba }
            r4.A0F = r0     // Catch:{ IllegalStateException -> 0x0fba }
            int r0 = r2.A00(r0)     // Catch:{ IllegalStateException -> 0x0fba }
            r4.A00 = r0     // Catch:{ IllegalStateException -> 0x0fba }
            goto L_0x0fbd
        L_0x0fba:
            r2.A02()
        L_0x0fbd:
            X.0hS r2 = new X.0hS
            r14 = r2
            r15 = r4
            r16 = r6
            r17 = r7
            r18 = r9
            r20 = r5
            r22 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0)
            X.0h9 r0 = new X.0h9
            r0.<init>(r1, r4, r2)
            r1.post(r0)
            return r3
        L_0x0fe0:
            java.lang.String r1 = "screen should be an instance of BloksScreenData or BloksScreenV2Data"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0fe9:
            java.util.List r1 = r8.A00
            java.lang.Object r0 = r1.get(r0)
            X.1dg r0 = (X.C31201dg) r0
            java.lang.String r4 = r0.A0J(r5)
            android.app.Activity r0 = A00(r2)
            android.app.Activity r0 = X.AnonymousClass0T1.A00(r0)
            java.util.List r1 = X.AnonymousClass0T1.A01(r0)
            if (r1 == 0) goto L_0x1021
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x1021
            java.lang.Object r0 = A04(r1)
        L_0x100d:
            X.0mZ r0 = (X.C13550mZ) r0
            if (r0 == 0) goto L_0x1027
            com.obwhatsapp.bloks.components.BkCdsBottomSheetFragment r0 = (com.obwhatsapp.bloks.components.BkCdsBottomSheetFragment) r0
            X.0SF r1 = r0.A1J()
            android.content.Context r0 = r0.A02()
            if (r4 != 0) goto L_0x1023
            r1.A07(r0, r3)
            return r3
        L_0x1021:
            r0 = 0
            goto L_0x100d
        L_0x1023:
            r1.A07(r0, r4)
            return r3
        L_0x1027:
            java.lang.String r1 = "Cannot pop a without an existing bottom sheet."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x102f:
            java.util.List r1 = r8.A00
            java.lang.Object r3 = r1.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x103b }
            goto L_0x1065
        L_0x103b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            r1.append(r3)
            java.lang.String r4 = r1.toString()
            int r1 = r9.hashCode()
            switch(r1) {
                case 97: goto L_0x106d;
                case 100: goto L_0x108f;
                case 101: goto L_0x1079;
                case 105: goto L_0x1080;
                case 118: goto L_0x108c;
                case 119: goto L_0x1096;
                default: goto L_0x1051;
            }
        L_0x1051:
            java.lang.String r3 = "[Bloks logging] incorrect level: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x1062:
            com.whatsapp.util.Log.e((java.lang.String) r4)
        L_0x1065:
            A00(r2)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x106d:
            java.lang.String r1 = "a"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x1051
            com.whatsapp.util.Log.a((java.lang.String) r4)
            goto L_0x1065
        L_0x1079:
            boolean r1 = r9.equals(r9)
            if (r1 != 0) goto L_0x1062
            goto L_0x1051
        L_0x1080:
            java.lang.String r1 = "i"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x1051
            com.whatsapp.util.Log.i((java.lang.String) r4)
            goto L_0x1065
        L_0x108c:
            java.lang.String r10 = "v"
        L_0x108f:
            boolean r1 = r9.equals(r10)
            if (r1 != 0) goto L_0x1065
            goto L_0x1051
        L_0x1096:
            java.lang.String r1 = "w"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x1051
            com.whatsapp.util.Log.w((java.lang.String) r4)
            goto L_0x1065
        L_0x10a3:
            X.C18450wi.A0H(r8, r0)
            X.C18450wi.A0H(r2, r1)
            java.util.List r8 = r8.A00
            java.lang.Object r7 = r8.get(r0)
            if (r7 == 0) goto L_0x1126
            X.0q7 r7 = (X.C14990q7) r7
            java.lang.Object r9 = r8.get(r1)
            if (r9 == 0) goto L_0x111e
            java.lang.Object r4 = r8.get(r6)
            X.1e9 r5 = X.C31411e8.A01(r4)
            r4 = 3
            java.lang.Object r4 = r8.get(r4)
            X.1e9 r4 = X.C31411e8.A01(r4)
            X.4RW r8 = new X.4RW
            r8.<init>(r7, r2, r5, r4)
            X.0q7 r4 = r2.A00
            if (r4 == 0) goto L_0x10fc
            android.content.Context r7 = r4.A00
            if (r7 == 0) goto L_0x10fc
            android.content.pm.PackageManager r10 = r7.getPackageManager()
            if (r10 == 0) goto L_0x10fc
            java.lang.String r4 = "front"
            boolean r9 = r4.equals(r9)
            java.lang.String r4 = "android.hardware.camera.front"
            boolean r5 = r10.hasSystemFeature(r4)
            java.lang.String r4 = "android.hardware.camera"
            boolean r4 = r10.hasSystemFeature(r4)
            if (r9 == 0) goto L_0x10f9
            if (r5 != 0) goto L_0x10ff
        L_0x10f3:
            X.41n r0 = X.C798441n.NOT_AVAILABLE
        L_0x10f5:
            r8.A00(r0)
            return r3
        L_0x10f9:
            if (r4 != 0) goto L_0x10ff
            goto L_0x10f3
        L_0x10fc:
            X.41n r0 = X.C798441n.INTERNAL_ERROR
            goto L_0x10f5
        L_0x10ff:
            android.app.Activity r5 = A00(r2)
            X.C18450wi.A0B(r5)
            r2 = 3
            java.lang.String[] r4 = new java.lang.String[r2]
            java.lang.String r2 = "android.permission.CAMERA"
            r4[r0] = r2
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            r4[r1] = r0
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            r4[r6] = r0
            X.4w8 r0 = new X.4w8
            r0.<init>(r5, r7, r8, r15)
            r15.AcH(r5, r0, r4)
            return r3
        L_0x111e:
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x1126:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x112e:
            java.util.List r2 = r8.A00
            java.lang.Object r4 = r2.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r2.get(r1)
            java.util.AbstractList r3 = (java.util.AbstractList) r3
            int r1 = r3.size()
            java.lang.String[] r2 = new java.lang.String[r1]
        L_0x1142:
            int r1 = r3.size()
            if (r0 >= r1) goto L_0x1151
            java.lang.Object r1 = r3.get(r0)
            r2[r0] = r1
            int r0 = r0 + 1
            goto L_0x1142
        L_0x1151:
            java.lang.String r3 = java.text.MessageFormat.format(r4, r2)
            return r3
        L_0x1156:
            java.util.List r2 = r8.A00
            java.lang.Object r0 = r2.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            java.lang.Object r2 = r2.get(r6)
            r1 = 3
            com.facebook.redex.IDxMWrapperShape226S0100000_2_I0 r0 = new com.facebook.redex.IDxMWrapperShape226S0100000_2_I0
            r0.<init>(r2, r1)
            r15.AbC(r0, r5, r4)
            return r3
        L_0x117a:
            java.util.List r5 = r8.A00
            java.lang.Object r0 = r5.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            java.lang.Object r0 = r5.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.lang.Object r1 = r5.get(r6)
            java.lang.String r1 = (java.lang.String) r1
            r0 = 3
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r15.Ab8(r1, r0, r4, r2)
            return r3
        L_0x11a1:
            java.util.List r4 = r8.A00
            java.lang.Object r0 = r4.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.lang.Object r0 = r4.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r4.get(r6)
            java.util.Map r0 = (java.util.Map) r0
            r15.Ab6(r3, r0, r2, r1)
            return r3
        L_0x11c1:
            java.util.List r2 = r8.A00
            java.lang.Object r0 = r2.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r7 = r0.intValue()
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            java.lang.Object r4 = r2.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            r0 = 3
            java.lang.Object r2 = r2.get(r0)
            r1 = 5
            com.facebook.redex.IDxMWrapperShape226S0100000_2_I0 r0 = new com.facebook.redex.IDxMWrapperShape226S0100000_2_I0
            r0.<init>(r2, r1)
            r15.Ab5(r0, r4, r7, r5)
            return r3
        L_0x11ec:
            java.util.List r2 = r8.A00
            java.lang.Object r0 = r2.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            java.lang.Object r0 = r2.get(r6)
            java.lang.Number r0 = (java.lang.Number) r0
            int r6 = r0.intValue()
            r0 = 3
            java.lang.Object r2 = r2.get(r0)
            r1 = 6
            com.facebook.redex.IDxMWrapperShape226S0100000_2_I0 r0 = new com.facebook.redex.IDxMWrapperShape226S0100000_2_I0
            r0.<init>(r2, r1)
            r1 = r15
            r2 = r0
            r1.Ab4(r2, r3, r4, r5, r6)
            return r3
        L_0x121d:
            java.util.List r2 = r8.A00
            java.lang.Object r3 = r2.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            r7 = 0
            long r5 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x122f }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r3
            goto L_0x125b
        L_0x122f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r3)
            java.lang.String r4 = r0.toString()
            int r0 = r9.hashCode()
            switch(r0) {
                case 97: goto L_0x12be;
                case 100: goto L_0x12e2;
                case 101: goto L_0x12ca;
                case 105: goto L_0x12d2;
                case 118: goto L_0x12df;
                case 119: goto L_0x12ea;
                default: goto L_0x1245;
            }
        L_0x1245:
            java.lang.String r3 = "[Bloks logging] incorrect level: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x1256:
            com.whatsapp.util.Log.e((java.lang.String) r4)
        L_0x1259:
            r5 = 0
        L_0x125b:
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            long r0 = r15.ABT()
            long r5 = r5 - r0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x12f8
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            int r0 = r2.hashCode()
            switch(r0) {
                case -1074026988: goto L_0x129f;
                case -906279820: goto L_0x128c;
                case 3208676: goto L_0x127a;
                default: goto L_0x1275;
            }
        L_0x1275:
            java.lang.String r3 = java.lang.String.valueOf(r5)
            return r3
        L_0x127a:
            java.lang.String r0 = "hour"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x1275
            double r2 = r1.doubleValue()
            r0 = 4704985352480227328(0x414b774000000000, double:3600000.0)
            goto L_0x12b0
        L_0x128c:
            java.lang.String r0 = "second"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x1275
            double r2 = r1.doubleValue()
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            goto L_0x12b0
        L_0x129f:
            java.lang.String r0 = "minute"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x1275
            double r2 = r1.doubleValue()
            r0 = 4678479150791524352(0x40ed4c0000000000, double:60000.0)
        L_0x12b0:
            double r2 = r2 / r0
            double r0 = java.lang.Math.ceil(r2)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            long r5 = r0.longValue()
            goto L_0x1275
        L_0x12be:
            java.lang.String r0 = "a"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x1245
            com.whatsapp.util.Log.a((java.lang.String) r4)
            goto L_0x1259
        L_0x12ca:
            boolean r0 = r9.equals(r9)
            if (r0 != 0) goto L_0x1256
            goto L_0x1245
        L_0x12d2:
            java.lang.String r0 = "i"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x1245
            com.whatsapp.util.Log.i((java.lang.String) r4)
            goto L_0x1259
        L_0x12df:
            java.lang.String r10 = "v"
        L_0x12e2:
            boolean r0 = r9.equals(r10)
            if (r0 != 0) goto L_0x1259
            goto L_0x1245
        L_0x12ea:
            java.lang.String r0 = "w"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x1245
            com.whatsapp.util.Log.w((java.lang.String) r4)
            goto L_0x1259
        L_0x12f8:
            java.lang.String r3 = "-1"
            return r3
        L_0x12fb:
            java.util.List r5 = r8.A00
            java.lang.Object r0 = r5.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            java.lang.Object r0 = r5.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.lang.Object r1 = r5.get(r6)
            java.lang.String r1 = (java.lang.String) r1
            r0 = 3
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r15.Ab9(r1, r0, r4, r2)
            return r3
        L_0x1322:
            java.util.List r4 = r8.A00
            java.lang.Object r0 = r4.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.lang.Object r0 = r4.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.lang.Object r0 = r4.get(r6)
            java.util.Map r0 = (java.util.Map) r0
            r15.Ab2(r0, r2, r1)
            return r3
        L_0x1342:
            java.util.List r4 = r8.A00
            java.lang.Object r0 = r4.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.lang.Object r0 = r4.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r15.Ab3(r2, r0)
            return r3
        L_0x135c:
            java.util.List r1 = r8.A00
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            android.app.Activity r0 = A00(r2)
            r15.AZw(r0, r1)
            return r3
        L_0x136c:
            java.util.List r5 = r8.A00
            java.lang.Object r8 = r5.get(r0)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r5.get(r1)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r5.get(r6)
            java.lang.String r10 = (java.lang.String) r10
            r0 = 3
            java.lang.Object r7 = r5.get(r0)
            java.lang.String r7 = (java.lang.String) r7
            r0 = 4
            java.lang.Object r6 = r5.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            r0 = 5
            java.lang.Object r0 = r5.get(r0)
            X.1e9 r4 = X.C31411e8.A01(r0)
            r0 = 6
            java.lang.Object r0 = r5.get(r0)
            X.1e9 r1 = X.C31411e8.A01(r0)
            r0 = 7
            java.lang.Object r0 = r5.get(r0)
            X.1e9 r0 = X.C31411e8.A01(r0)
            if (r4 == 0) goto L_0x13ea
            X.1Z6 r5 = new X.1Z6
            r5.<init>()
            r5.A00 = r2
            r5.A01 = r4
        L_0x13b4:
            if (r1 == 0) goto L_0x13e8
            X.1Z6 r4 = new X.1Z6
            r4.<init>()
            r4.A00 = r2
            r4.A01 = r1
        L_0x13bf:
            if (r0 == 0) goto L_0x13e6
            X.1Z6 r1 = new X.1Z6
            r1.<init>()
            r1.A00 = r2
            r1.A01 = r0
        L_0x13ca:
            android.app.Activity r0 = A00(r2)
            X.00k r0 = (X.C000900k) r0
            r20 = r8
            r21 = r9
            r22 = r10
            r23 = r7
            r24 = r6
            r18 = r4
            r19 = r1
            r16 = r0
            r17 = r5
            r15.AfZ(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r3
        L_0x13e6:
            r1 = r3
            goto L_0x13ca
        L_0x13e8:
            r4 = r3
            goto L_0x13bf
        L_0x13ea:
            r5 = r3
            goto L_0x13b4
        L_0x13ec:
            java.util.List r5 = r8.A00
            java.lang.Object r0 = r5.get(r0)
            X.1dg r0 = (X.C31201dg) r0
            java.lang.String r4 = A05(r0)
            java.lang.Object r2 = r5.get(r1)
            java.util.Map r2 = (java.util.Map) r2
            r0 = 3
            java.lang.Object r0 = r5.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.util.HashMap r0 = A07(r2)
            r15.AcI(r4, r0, r1)
            return r3
        L_0x1411:
            java.util.List r1 = r8.A00
            java.lang.Object r0 = r1.get(r0)
            X.2Wa r0 = (X.AnonymousClass2Wa) r0
            java.lang.Object r6 = r1.get(r6)
            X.0q7 r6 = (X.C14990q7) r6
            X.1dg r0 = r0.A01
            X.1dg r9 = X.C611937y.A00(r6, r2, r0)
        L_0x1425:
            android.app.Activity r0 = A00(r2)
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r0)
            r0 = 40
            java.lang.String r0 = r9.A0J(r0)
            android.app.AlertDialog$Builder r1 = r1.setTitle(r0)
            java.lang.String r0 = r9.A0J(r5)
            android.app.AlertDialog$Builder r7 = r1.setMessage(r0)
            r10 = 36
            X.1dg r5 = r9.A0G(r10)
            java.lang.String r8 = ""
            if (r5 == 0) goto L_0x145d
            java.lang.String r1 = r5.A0K(r10, r8)
            r16 = 1
            com.facebook.redex.IDxCListenerShape4S0400000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape4S0400000_2_I0
            r11 = r0
            r12 = r5
            r13 = r6
            r14 = r4
            r15 = r2
            r11.<init>(r12, r13, r14, r15, r16)
            r7.setPositiveButton(r1, r0)
        L_0x145d:
            r0 = 38
            X.1dg r5 = r9.A0G(r0)
            if (r5 == 0) goto L_0x1478
            java.lang.String r1 = r5.A0K(r10, r8)
            r16 = 3
            com.facebook.redex.IDxCListenerShape4S0400000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape4S0400000_2_I0
            r11 = r0
            r12 = r5
            r13 = r6
            r14 = r4
            r15 = r2
            r11.<init>(r12, r13, r14, r15, r16)
            r7.setNegativeButton(r1, r0)
        L_0x1478:
            r0 = 44
            X.1dg r5 = r9.A0G(r0)
            if (r5 == 0) goto L_0x1492
            java.lang.String r1 = r5.A0K(r10, r8)
            r13 = 2
            com.facebook.redex.IDxCListenerShape4S0400000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape4S0400000_2_I0
            r8 = r0
            r9 = r5
            r10 = r6
            r11 = r4
            r12 = r2
            r8.<init>(r9, r10, r11, r12, r13)
            r7.setNeutralButton(r1, r0)
        L_0x1492:
            android.app.AlertDialog r0 = r7.create()
            r0.show()
            return r3
        L_0x149a:
            java.util.List r4 = r8.A00
            java.lang.Object r0 = r4.get(r0)
            X.1dg r0 = (X.C31201dg) r0
            java.lang.String r2 = A05(r0)
            java.lang.Object r0 = r4.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            java.util.HashMap r0 = A07(r0)
            r15.AIR(r2, r0)
            return r3
        L_0x14b4:
            java.util.List r4 = r8.A00
            java.lang.Object r1 = r4.get(r0)
            X.1dg r1 = (X.C31201dg) r1
            java.lang.Object r7 = r4.get(r0)
            X.1dg r7 = (X.C31201dg) r7
            java.lang.Object r0 = r4.get(r6)
            java.util.Map r0 = (java.util.Map) r0
            java.util.HashMap r5 = A08(r0)
            java.lang.String r4 = A05(r1)
            java.lang.String r11 = A06(r1)
            X.4DF r10 = new X.4DF
            r10.<init>(r4)
            X.2Wa r9 = X.AnonymousClass2Wa.A00(r2, r7)
            X.0Ok r0 = new X.0Ok
            r0.<init>()
            r0.A01 = r4
            r0.A02 = r5
            X.0Qa r8 = new X.0Qa
            r8.<init>(r0)
            X.0q7 r4 = r2.A00
            android.content.Context r6 = r4.A00
            android.app.Activity r0 = X.AnonymousClass0T1.A00(r6)
            java.util.List r2 = X.AnonymousClass0T1.A01(r0)
            if (r2 == 0) goto L_0x1538
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x1538
            java.lang.Object r7 = A04(r2)
        L_0x1503:
            X.0mZ r7 = (X.C13550mZ) r7
            boolean r0 = r7 instanceof androidx.fragment.app.DialogFragment
            if (r0 == 0) goto L_0x1547
            androidx.fragment.app.DialogFragment r7 = (androidx.fragment.app.DialogFragment) r7
            if (r7 == 0) goto L_0x1547
            X.0Pd r8 = X.AnonymousClass0T0.A00(r6, r7, r8, r9, r10, r11)
            X.0mZ r7 = (X.C13550mZ) r7
            com.obwhatsapp.bloks.components.BkCdsBottomSheetFragment r7 = (com.obwhatsapp.bloks.components.BkCdsBottomSheetFragment) r7
            X.0SF r6 = r7.A1J()
            android.content.Context r7 = r7.A02()
            r13 = 32
            java.util.Deque r0 = r6.A0C
            java.lang.Object r5 = r0.peek()
            X.0Pd r5 = (X.C05070Pd) r5
            java.lang.String r2 = "CDSBloksBottomSheetDelegate"
            if (r5 != 0) goto L_0x1531
            java.lang.String r0 = "Cannot push to an empty bottom sheet. Please call open() to show new Screen content in the bottom sheet."
        L_0x152d:
            X.C29691b2.A00(r2, r0)
            return r3
        L_0x1531:
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x153a
            java.lang.String r0 = "Attempting to push to a dismissing sheet. The content will not be displayed properly"
            goto L_0x152d
        L_0x1538:
            r7 = 0
            goto L_0x1503
        L_0x153a:
            X.0X5 r0 = r5.A00
            r0.A08()
            r12 = r3
            r9 = r3
            r10 = r4
            r11 = r1
            r6.A06(r7, r8, r9, r10, r11, r12, r13)
            return r3
        L_0x1547:
            java.lang.String r1 = "Cannot push a new Screen without an existing bottom sheet."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x154f:
            java.util.List r4 = r8.A00
            java.lang.Object r7 = r4.get(r0)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r9 = r4.get(r1)
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r6 = r4.get(r6)
            X.1dg r6 = (X.C31201dg) r6
            r0 = 3
            java.lang.Object r0 = r4.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x15b9
            java.util.Iterator r4 = r0.iterator()
            r17 = r3
            r16 = r3
        L_0x1574:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x15b6
            java.lang.Object r1 = r4.next()
            X.1dg r1 = (X.C31201dg) r1
            java.lang.String r17 = r1.A0J(r5)
            r0 = 36
            java.lang.String r16 = r1.A0J(r0)
            if (r17 == 0) goto L_0x1574
        L_0x158c:
            X.0q1 r8 = r6.A0H(r0)
            X.0q1 r6 = r6.A0H(r5)
            java.util.HashMap r1 = A07(r9)
            java.lang.String r0 = "params"
            java.lang.Object r5 = r1.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            r0 = 3
            com.facebook.redex.IDxEWrapperShape173S0100000_2_I0 r4 = new com.facebook.redex.IDxEWrapperShape173S0100000_2_I0
            r4.<init>(r8, r0)
            r1 = 5
            com.facebook.redex.IDxEWrapperShape173S0100000_2_I0 r0 = new com.facebook.redex.IDxEWrapperShape173S0100000_2_I0
            r0.<init>(r6, r1)
            r10 = r15
            r11 = r4
            r12 = r0
            r13 = r2
            r14 = r7
            r15 = r5
            r10.A5C(r11, r12, r13, r14, r15, r16, r17)
            return r3
        L_0x15b6:
            r0 = 36
            goto L_0x158c
        L_0x15b9:
            r0 = 36
            r16 = r3
            r17 = r3
            goto L_0x158c
        L_0x15c0:
            java.lang.String r1 = "Cannot unwind a without an existing bottom sheet."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x15c8:
            java.lang.String r0 = "Attempting to remove the current or only screen in the CDS bottom sheet, so the screen was not removed. Please use pop or dismiss instead."
            goto L_0x15cd
        L_0x15cb:
            java.lang.String r0 = "No screen found with target ID, so the screen was not removed."
        L_0x15cd:
            X.C29691b2.A00(r8, r0)
            return r3
        L_0x15d1:
            return r3
        L_0x15d2:
            return r3
        L_0x15d3:
            return r3
        L_0x15d4:
            return r3
        L_0x15d5:
            return r3
        L_0x15d6:
            return r3
        L_0x15d7:
            return r3
        L_0x15d8:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r5)
            throw r0
        L_0x15de:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r5)
            throw r0
        L_0x15e4:
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x15ec:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x15f4:
            java.lang.String r3 = "0"
            return r3
        L_0x15f7:
            java.lang.String r1 = "Cannot dismiss without an existing bottom sheet."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x15ff:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x1607:
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1K6.A8l(X.0q3, X.4tt, X.0q5):java.lang.Object");
    }
}
