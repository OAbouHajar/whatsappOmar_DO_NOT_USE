package X;

import android.app.Activity;
import com.obwhatsapp.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5zU  reason: invalid class name */
public class AnonymousClass5zU implements C25261Jc {
    public final C25261Jc A00;
    public final C119275wp A01;
    public final C1223269d A02;

    public AnonymousClass5zU(C25261Jc r1, C119275wp r2, C1223269d r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public static Activity A00(C14960q4 r1) {
        return (Activity) r1.A00.A02.A00().get(R.id.bloks_host_activity);
    }

    public static AnonymousClass1Z6 A01(List list, int i2) {
        C31421e9 r1 = ((C31411e8) list.get(i2)).A00;
        AnonymousClass1Z6 r0 = new AnonymousClass1Z6();
        r0.A01 = r1;
        return r0;
    }

    public static final HashMap A02(Map map) {
        String str;
        HashMap A0x = AnonymousClass000.A0x();
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0y);
            boolean z2 = A0z.getValue() instanceof Number;
            Object key = A0z.getKey();
            if (!z2) {
                str = null;
                if (A0z.getValue() == null) {
                    A0x.put(key, str);
                }
            }
            str = A0z.getValue().toString();
            A0x.put(key, str);
        }
        return A0x;
    }

    public final HashMap A03(Map map) {
        HashMap A0x = AnonymousClass000.A0x();
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0y);
            Object key = A0z.getKey();
            String str = null;
            try {
                A0x.put(key, A0z.getValue() != null ? A03((Map) A0z.getValue()) : null);
            } catch (ClassCastException unused) {
                if (A0z.getValue() != null) {
                    str = A0z.getValue().toString();
                }
                A0x.put(key, str);
            }
        }
        return A0x;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v46, resolved type: X.1Z7} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v27, types: [java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r8v36, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r8v71 */
    /* JADX WARNING: type inference failed for: r8v72 */
    /* JADX WARNING: type inference failed for: r8v73 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x03d1, code lost:
        android.util.Log.i("Whatsapp", r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x03da, code lost:
        android.util.Log.v("Whatsapp", r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x03e3, code lost:
        android.util.Log.w("Whatsapp", r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03ec, code lost:
        r0 = X.C110115dX.A0j(r12.A00, 0);
        r1 = A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x03f6, code lost:
        if (r0 == null) goto L_0x03fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x03f8, code lost:
        r8 = A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x03fc, code lost:
        r0 = (X.AnonymousClass68C) r1;
        r1.onBackPressed();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0402, code lost:
        if (r8 == 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0404, code lost:
        ((java.util.AbstractMap) ((X.C111675hA) r0).A09.A02.peek()).putAll(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0415, code lost:
        ((X.C119885zm) r9.A02).A01.A0H(X.AnonymousClass000.A0n(r12.A00, 0), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0053, code lost:
        A00(r1).finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0426, code lost:
        r4 = X.AnonymousClass000.A0n(r12.A00, 0);
        r2 = (X.C111675hA) ((X.AnonymousClass68C) A00(r1));
        r3 = (androidx.fragment.app.DialogFragment) r2.AGM().A0B("bloks-dialog");
        r2 = r2.A09;
        r0 = r2.A01;
        r1 = (X.AnonymousClass1Z7) r0.get("dialog");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x044c, code lost:
        if (r3 == null) goto L_0x0459;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x044e, code lost:
        r3.A1C();
        X.C119275wp.A00(r0);
        r2.A02.pop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0459, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x045b, code lost:
        r1.A00 = true;
        r1.A00(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0463, code lost:
        r0 = r12.A00;
        r2 = X.AnonymousClass000.A0n(r0, 0);
        r6 = (java.lang.Boolean) r0.get(1);
        r0 = r1.A00.A02;
        r5 = r9.A02;
        r4 = A00(r1);
        r5 = (X.C119885zm) r5;
        r3 = (android.app.ProgressDialog) r0.A08.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0483, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0489, code lost:
        if (r3.isShowing() == false) goto L_0x048e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x048b, code lost:
        r3.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005c, code lost:
        r4 = r12.A00;
        r0 = X.C110115dX.A0j(r4, 0);
        r6 = A01(r4, 1);
        r6.A00 = r1;
        r1 = A00(r1);
        r5 = A02(r0);
        r4 = r5.remove("case");
        X.AnonymousClass00B.A06(r4);
        r4 = (java.lang.String) r4;
        ((X.AnonymousClass69L) r1).AaT(((X.C111675hA) ((X.AnonymousClass68C) r1)).A09.A01(r6.A00, r6.A01, r4), r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x048e, code lost:
        r3.setMessage(r2);
        r3.setIndeterminate(true);
        r3.setCanceledOnTouchOutside(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x049d, code lost:
        if (r6.booleanValue() == false) goto L_0x04af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x049f, code lost:
        r3.setCancelable(true);
        r3.setOnCancelListener(new X.C119465xv(r4, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x04aa, code lost:
        r3.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x04af, code lost:
        r3.setCancelable(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x04b3, code lost:
        r0 = r12.A00;
        r6 = X.AnonymousClass000.A0n(r0, 0);
        r3 = X.C110115dX.A0j(r0, 1);
        r7 = A01(r0, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x04c1, code lost:
        r7.A00 = r1;
        r2 = A00(r1);
        r5 = r1.A00.A02;
        r4 = A02(r3);
        r3 = ((X.C111675hA) ((X.AnonymousClass68C) r2)).A09;
        X.C119885zm.A00(r2, r3, r7, r4);
        r2 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x04db, code lost:
        if (r2 == null) goto L_0x04e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x04dd, code lost:
        r3.A01(r7.A00, r2, "dialog");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x04e4, code lost:
        r2 = (X.AnonymousClass02C) r5.A07.get();
        r0 = (androidx.fragment.app.DialogFragment) r2.A0B("bloks-dialog");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0091, code lost:
        r7 = r12.A00;
        r6 = X.AnonymousClass000.A0n(r7, 0);
        r1 = r7.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x04f4, code lost:
        if (r0 == null) goto L_0x04f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x04f6, code lost:
        r0.A1C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x04f9, code lost:
        com.obwhatsapp.bloks.ui.BloksDialogFragment.A01(r6, r4).A1G(r2, "bloks-dialog");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0502, code lost:
        r5 = r12.A00;
        r4 = X.AnonymousClass000.A0D(r5.get(0));
        r0 = X.C110115dX.A0j(r5, 1);
        r3 = A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0514, code lost:
        if (r0 == null) goto L_0x051a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0516, code lost:
        r8 = A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x051a, code lost:
        if (r4 == 0) goto L_0x051d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x051c, code lost:
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x051d, code lost:
        r1 = r3.getIntent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0521, code lost:
        if (r8 == 0) goto L_0x0528;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x009d, code lost:
        if ((r1 instanceof java.lang.Boolean) == false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0523, code lost:
        r1.putExtra("finish_activity_result", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0528, code lost:
        r3.setResult(r2, r1);
        r3.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0530, code lost:
        r0 = r12.A00;
        r7 = (java.util.AbstractList) r0.get(0);
        r6 = ((X.C31411e8) r0.get(1)).A00;
        r8 = X.C13690nt.A0i(r7.size());
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x054d, code lost:
        if (r5 >= r7.size()) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x054f, code lost:
        r4 = new X.C14940q2();
        r4.A03(java.lang.Integer.valueOf(r5), 0);
        r4.A03(r7.get(r5), 1);
        r8.add(X.C14980q6.A00(r1, r4.A01(), r6));
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0570, code lost:
        r0 = r12.A00;
        r2 = X.C110115dX.A0j(r0, 0);
        r1 = r0.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x057a, code lost:
        if (r2 == null) goto L_0x0586;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0580, code lost:
        if (r2.size() <= 0) goto L_0x0586;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009f, code lost:
        r5 = X.AnonymousClass000.A1X(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0582, code lost:
        r0 = "children";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0586, code lost:
        r2 = X.AnonymousClass000.A0o();
        r0 = "WaExtensions/GetChildNode Cannot find the child node [";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x058e, code lost:
        r0 = r12.A00;
        r5 = (java.util.List) r0.get(0);
        r8 = r0.get(1);
        r6 = ((X.C31411e8) r0.get(2)).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x05a6, code lost:
        if (r5.size() == 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x05a8, code lost:
        r5 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x05b0, code lost:
        if (r5.hasNext() == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x05b2, code lost:
        r4 = r5.next();
        r0 = new X.C14940q2();
        r0.A03(r8, 0);
        r0.A03(r4, 1);
        r8 = X.C14980q6.A00(r1, r0.A01(), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x05ca, code lost:
        r0 = r12.A00;
        r4 = X.AnonymousClass000.A0n(r0, 0);
        r3 = X.AnonymousClass000.A0n(r0, 1);
        r1 = ((android.app.Activity) r1.A00.A02.A06.get()).getIntent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x05e4, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a3, code lost:
        r1 = r7.get(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x05e6, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x05ec, code lost:
        switch(r3.hashCode()) {
            case -891985903: goto L_0x05fd;
            case 64711720: goto L_0x060a;
            case 97526364: goto L_0x061b;
            case 1958052158: goto L_0x062d;
            default: goto L_0x05ef;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x05ef, code lost:
        android.util.Log.d("", X.AnonymousClass000.A0h(r3, X.AnonymousClass000.A0r("PAY: BloksActivity/getIntentParameter type not supported: ")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x05fc, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0603, code lost:
        if (r3.equals("string") == false) goto L_0x05ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0609, code lost:
        return r1.getStringExtra(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a9, code lost:
        if ((r1 instanceof java.lang.Boolean) == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0610, code lost:
        if (r3.equals("boolean") == false) goto L_0x05ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0616, code lost:
        if (r1.getBooleanExtra(r4, false) == false) goto L_0x09af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0618, code lost:
        return "1";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0621, code lost:
        if (r3.equals("float") == false) goto L_0x05ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x062c, code lost:
        return java.lang.Float.toString(r1.getFloatExtra(r4, 0.0f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0633, code lost:
        if (r3.equals("integer") == false) goto L_0x05ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ab, code lost:
        r0 = X.AnonymousClass000.A1X(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x063d, code lost:
        return java.lang.Integer.toString(r1.getIntExtra(r4, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x063e, code lost:
        r2 = r12.A00.get(0);
        r0 = r9.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0646, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0648, code lost:
        r1 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x064e, code lost:
        if (r1.isEmpty() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x065a, code lost:
        return ((java.util.AbstractMap) r1.peek()).get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x065b, code lost:
        r0 = r12.A00;
        r2 = X.C110115dX.A0j(r0, 0);
        r1 = r0.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0665, code lost:
        if (r2 == null) goto L_0x067f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00af, code lost:
        if (r0 == 1) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x066b, code lost:
        if (r2.size() <= 0) goto L_0x067f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x066d, code lost:
        r0 = "properties";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x066f, code lost:
        r0 = (java.util.Map) r2.get(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0675, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0677, code lost:
        r8 = r0.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x067b, code lost:
        if (r8 != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x067f, code lost:
        r2 = X.AnonymousClass000.A0o();
        r0 = "WaExtensions/GetChildNode Cannot find the attribute [";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0685, code lost:
        r2.append(r0);
        r2.append(r1);
        r2.append("] on a null or empty parent node");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x068f, code lost:
        r2 = X.AnonymousClass000.A0r("WaExtensions/Bloks function: [");
        r2.append(r6);
        r2.append("] not implemented on client");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b1, code lost:
        if (r0 == 2) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x069d, code lost:
        android.util.Log.d("", r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b3, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b4, code lost:
        r3 = X.C110115dX.A0j(r7, 3);
        r2 = r9.A02;
        ((X.C119885zm) r2).A08.A06(X.C115155pE.A00(r6, (java.util.ArrayList) r7.get(4), A02(r3), r5, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d3, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d5, code lost:
        r0 = X.AnonymousClass000.A0D(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x083b, code lost:
        if (r0 == false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0847, code lost:
        return java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0848, code lost:
        r5 = ((X.C112855jo) ((X.AnonymousClass69L) A00(r1))).A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0858, code lost:
        if (r5.A00 <= 0) goto L_0x0868;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x085a, code lost:
        r2 = r5.A01.A00() - r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00da, code lost:
        r5 = X.AnonymousClass000.A0D(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0867, code lost:
        return java.lang.Long.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0868, code lost:
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x086b, code lost:
        r2 = (X.C119885zm) r9.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x087b, code lost:
        return r2.A03.A00(r2.A02.A05());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x088a, code lost:
        return ((X.C112855jo) ((X.AnonymousClass69L) A00(r1))).A0L.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x088b, code lost:
        r6 = r12.A00;
        r1 = X.AnonymousClass000.A0n(r6, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0891, code lost:
        if (r1 == null) goto L_0x08ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00df, code lost:
        r2 = X.AnonymousClass000.A0n(r12.A00, 0);
        r1 = (X.C119885zm) r9.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0897, code lost:
        if (r1.length() == 0) goto L_0x08ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:?, code lost:
        r4 = java.lang.Long.parseLong(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x089e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x089f, code lost:
        android.util.Log.d("Whatsapp", X.AnonymousClass000.A0h(r1, X.AnonymousClass000.A0r("NumberUtil/Invalid long value:")), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ed, code lost:
        if (android.text.TextUtils.isEmpty(r2) == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ef, code lost:
        com.whatsapp.util.Log.e("WaExtensions/evaluate/bk.action.io.clipboard.SetString: text cannot be null or empty");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0911, code lost:
        r4 = java.lang.Double.valueOf(java.lang.Math.ceil(r2 / r0)).longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0922, code lost:
        r0 = r12.A00;
        r4 = X.AnonymousClass000.A0n(r0, 0);
        r3 = (java.util.AbstractList) r0.get(1);
        r1 = new java.lang.String[r3.size()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0938, code lost:
        if (r2 >= r3.size()) goto L_0x0943;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x093a, code lost:
        r1[r2] = r3.get(r2);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0947, code lost:
        return java.text.MessageFormat.format(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f6, code lost:
        r1 = r1.A05.A0B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0960, code lost:
        return java.lang.Boolean.valueOf(((X.AnonymousClass69L) A00(r1)).AHK(X.C87604Xq.A00(X.AnonymousClass000.A0n(r12.A00, 0))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0961, code lost:
        r4 = r12.A00;
        r0 = X.C110115dX.A0j(r4, 0);
        r2 = X.AnonymousClass000.A0n(r4, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0979, code lost:
        return ((X.AnonymousClass69L) A00(r1)).AaW(r2, A02(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x097a, code lost:
        r6 = r12.A00;
        r5 = X.AnonymousClass000.A0n(r6, 0);
        r4 = r6.size() - 1;
        r3 = new java.lang.String[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0987, code lost:
        if (r2 >= r4) goto L_0x0993;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0989, code lost:
        r1 = r2 + 1;
        r3[r2] = r6.get(r1);
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0997, code lost:
        return java.text.MessageFormat.format(r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0998, code lost:
        r0 = r12.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x09ae, code lost:
        return java.lang.Boolean.valueOf(X.C110115dX.A0k(X.AnonymousClass000.A0n(r0, 0), X.AnonymousClass000.A0n(r0, 1)).matches());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00fc, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x09af, code lost:
        return "0";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:?, code lost:
        return r0.A8l(r12, r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:?, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:?, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:?, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:?, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r1.setPrimaryClip(android.content.ClipData.newPlainText(r2, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0107, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0108, code lost:
        com.whatsapp.util.Log.e("bkinterpreter/clipboard/", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010f, code lost:
        r0 = r12.A00;
        r4 = X.C110115dX.A0j(r0, 0);
        r7 = A01(r0, 1);
        r7.A00 = r1;
        r2 = r9.A02;
        r0 = A00(r1);
        r5 = A02(r4);
        r3 = ((X.C111675hA) ((X.AnonymousClass68C) r0)).A09;
        r6 = ((X.C119885zm) r2).A07;
        r1 = r7.A00.A00.A02;
        r8 = r5.get("message");
        X.AnonymousClass00B.A06(r8);
        r8 = (java.lang.String) r8;
        r2 = X.C110115dX.A0g("title", r5);
        r4 = new X.C005302h((android.content.Context) r1.A06.get()).create();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x015b, code lost:
        if (android.text.TextUtils.isEmpty(r2) != false) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x015d, code lost:
        r4.setTitle(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0160, code lost:
        r0 = r4.A00;
        r0.A0Q = r8;
        r0 = r0.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0166, code lost:
        if (r0 == null) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0168, code lost:
        r0.setText(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        r8 = 0;
        r9 = r21;
        r12 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x016b, code lost:
        r4.setCanceledOnTouchOutside(false);
        r3 = r3.A01(r7.A00, r7.A01, "alert_dialog");
        r1 = X.C110115dX.A0g("button_info", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0184, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0186, code lost:
        r7 = r1.split("\\|");
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0190, code lost:
        if (r6 > (r7.length - 2)) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0192, code lost:
        r5 = r7[r6 + 1];
        r2 = new com.facebook.redex.IDxCListenerShape30S0200000_3_I1(r4, 1, r3);
        r1 = r7[r6];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01a2, code lost:
        switch(r1.hashCode()) {
            case -518392103: goto L_0x01ac;
            case 1820734407: goto L_0x01b7;
            case 2113821835: goto L_0x01c7;
            default: goto L_0x01a5;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01a5, code lost:
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01a6, code lost:
        r4.A03(r1, r5, r2);
        r6 = r6 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0029, code lost:
        switch(r11) {
            case 0: goto L_0x083f;
            case 1: goto L_0x067d;
            case 2: goto L_0x005c;
            case 3: goto L_0x0530;
            case 4: goto L_0x0091;
            case 5: goto L_0x00df;
            case 6: goto L_0x088b;
            case 7: goto L_0x010f;
            case 8: goto L_0x01fc;
            case 9: goto L_0x0922;
            case 10: goto L_0x0570;
            case 11: goto L_0x0948;
            case 12: goto L_0x020f;
            case 13: goto L_0x0035;
            case 14: goto L_0x01fc;
            case 15: goto L_0x0235;
            case 16: goto L_0x0258;
            case 17: goto L_0x065b;
            case 18: goto L_0x026b;
            case 19: goto L_0x0848;
            case 20: goto L_0x027e;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_labels_singleLine :int: goto L_0x0044;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_labels_ellipsize :int: goto L_0x058e;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_labels_maxLines :int: goto L_0x0091;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_fab_size :int: goto L_0x0340;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_labels_style :int: goto L_0x067d;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_labels_customFont :int: goto L_0x086b;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_shadowColor :int: goto L_0x0415;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_shadowRadius :int: goto L_0x0961;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_shadowXOffset :int: goto L_0x0053;
            case 30: goto L_0x05ca;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_colorNormal :int: goto L_0x063e;
            case 32: goto L_0x067d;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_colorRipple :int: goto L_0x0353;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_openDirection :int: goto L_0x087c;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_backgroundColor :int: goto L_0x03ec;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_fab_label :int: goto L_0x097a;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_fab_show_animation :int: goto L_0x067d;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_fab_hide_animation :int: goto L_0x0426;
            case 39: goto L_0x0463;
            case 40: goto L_0x0998;
            case 41: goto L_0x04b3;
            case 42: goto L_0x0502;
            default: goto L_0x002c;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01b2, code lost:
        if (r1.equals("neutral_btn_label") == false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01b4, code lost:
        r1 = -3;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01bd, code lost:
        if (r1.equals("negative_btn_label") == false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01bf, code lost:
        r1 = -2;
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01c1, code lost:
        r2 = new com.facebook.redex.IDxCListenerShape30S0200000_3_I1(r4, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01cd, code lost:
        if (r1.equals("positive_btn_label") == false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01cf, code lost:
        r2 = new com.facebook.redex.IDxCListenerShape30S0200000_3_I1(r4, 3, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01d6, code lost:
        r4.A03(-1, r6.A09(com.obwhatsapp.R.string.str0e87), new com.facebook.redex.IDxCListenerShape30S0200000_3_I1(r4, 4, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        r0 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01e6, code lost:
        r4.setOnKeyListener(new com.facebook.redex.IDxKListenerShape225S0100000_3_I1(r3, 0));
        r4.setOnDismissListener(new com.facebook.redex.IDxDListenerShape160S0100000_3_I1(r3, 0));
        r4.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01fc, code lost:
        A00(r1).startActivity(X.C13680ns.A0A(X.AnonymousClass000.A0n(r12.A00, 0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x020f, code lost:
        r0 = r12.A00;
        r7 = X.AnonymousClass000.A0n(r0, 0);
        r2 = X.C110115dX.A0j(r0, 1);
        r5 = new X.AnonymousClass1Z6();
        r5.A01 = null;
        r5.A00 = r1;
        r9.A02.Aa3(A00(r1), r5, r1.A00.A02, r7, A02(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0235, code lost:
        r0 = r12.A00;
        r7 = X.AnonymousClass000.A0n(r0, 0);
        r2 = X.C110115dX.A0j(r0, 1);
        r5 = A01(r0, 2);
        r5.A00 = r1;
        r9.A02.Aa4(A00(r1), r5, r1.A00.A02, r7, A02(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0258, code lost:
        r0 = X.C110115dX.A0j(r12.A00, 0);
        r1 = r9.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0260, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0262, code lost:
        r1.A02(A02(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x026b, code lost:
        r0 = r12.A00;
        r6 = X.AnonymousClass000.A0n(r0, 0);
        r3 = X.C110115dX.A0j(r0, 1);
        r7 = new X.AnonymousClass1Z6();
        r7.A01 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x027e, code lost:
        r5 = r12.A00;
        r11 = X.AnonymousClass000.A0n(r5, 0);
        r10 = X.AnonymousClass000.A0n(r5, 1);
        r13 = X.AnonymousClass000.A0n(r5, 2);
        r2 = X.C110115dX.A0j(r5, 3);
        r7 = A01(r5, 4);
        r7.A00 = r1;
        r6 = r9.A02;
        r12 = A00(r1);
        r2 = A03(r2);
        r6 = (X.C119885zm) r6;
        r12 = (X.AnonymousClass68C) r12;
        r5 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02a8, code lost:
        if (r5 == null) goto L_0x02b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002e, code lost:
        if (r0 == null) goto L_0x068f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02aa, code lost:
        r8 = ((X.C111675hA) r12).A09.A01(r7.A00, r5, "case");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02b7, code lost:
        r7 = r6.A04;
        r6 = java.lang.Integer.parseInt(r13);
        r12 = (X.C112855jo) r12;
        r1 = r12.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02c1, code lost:
        if (r1 != null) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02c3, code lost:
        r1 = new X.C115195pK();
        r12.A08 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02ca, code lost:
        r3 = new X.C116615rf(r12.A06, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02d7, code lost:
        if (X.C119195wh.A02.contains(r10) != false) goto L_0x02e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02d9, code lost:
        com.whatsapp.util.Log.e("Bloks: IQRequestHelper/sendIQRequest: Invalid XMLNS");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x02de, code lost:
        if (r8 == 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x02e0, code lost:
        r8.A00("on_failure");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x02e7, code lost:
        r1 = X.AnonymousClass000.A0m(r2.keySet().iterator());
        r9 = r7.A00(r3, r1, (java.util.Map) r2.get(r1));
        r14 = r7.A01;
        r5 = r14.A02();
        r2 = new X.C35081lL[4];
        r2[0] = new X.C35081lL((com.whatsapp.jid.Jid) X.C34791ks.A00, "to");
        X.C35081lL.A02("type", r11, r2, 1);
        X.C35081lL.A02("id", r5, r2, 2);
        X.C35081lL.A02("xmlns", r10, r2, 3);
        r14.A0A(new X.AnonymousClass62S(r8, r7, r3), new X.C28371Vv(r9, "iq", r2), r5, 204, ((long) r6) * 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0340, code lost:
        r0 = (android.app.Dialog) r1.A00.A02.A08.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x034c, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x034e, code lost:
        r0.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0353, code lost:
        r1 = java.util.Collections.unmodifiableList(r12.A00);
        r5 = X.AnonymousClass000.A0r("[Bloks logging] ");
        r6 = 0;
        r2 = X.AnonymousClass000.A0n(r1, 0);
        r5.append(X.AnonymousClass000.A0n(r1, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x036f, code lost:
        if (r1.get(2) == null) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0371, code lost:
        r5.append(" ");
        r5.append(r1.get(2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0381, code lost:
        switch(r2.hashCode()) {
            case 97: goto L_0x03a0;
            case 100: goto L_0x03a7;
            case 101: goto L_0x03af;
            case 105: goto L_0x03b7;
            case 118: goto L_0x03bf;
            case 119: goto L_0x03c7;
            default: goto L_0x0384;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0384, code lost:
        r6 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        ((X.C112855jo) ((X.AnonymousClass69L) A00(r1))).A0L.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0387, code lost:
        switch(r6) {
            case 0: goto L_0x0397;
            case 1: goto L_0x0397;
            case 2: goto L_0x0397;
            case 3: goto L_0x03d1;
            case 4: goto L_0x03da;
            case 5: goto L_0x03e3;
            default: goto L_0x038a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x038a, code lost:
        android.util.Log.d("Whatsapp", X.AnonymousClass000.A0h(r2, X.AnonymousClass000.A0r("[Bloks logging] incorrect level: ")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0397, code lost:
        android.util.Log.d("Whatsapp", r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x03a0, code lost:
        r0 = r2.equals("a");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x03a7, code lost:
        r0 = r2.equals("d");
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x03af, code lost:
        r0 = r2.equals("e");
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x03b7, code lost:
        r0 = r2.equals("i");
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x03bf, code lost:
        r0 = r2.equals("v");
        r6 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x03c7, code lost:
        r0 = r2.equals("w");
        r6 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x03ce, code lost:
        if (r0 != false) goto L_0x0385;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        ((X.C112855jo) ((X.AnonymousClass69L) A00(r1))).A0L.A01();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A8l(X.C14950q3 r22, X.C99354tt r23, X.C14970q5 r24) {
        /*
            r21 = this;
            r1 = r24
            X.0q4 r1 = (X.C14960q4) r1
            java.lang.String r0 = "WaGlobalExtensions evaluate: action="
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            r7 = r23
            java.lang.String r6 = r7.A00
            java.lang.String r0 = X.AnonymousClass000.A0h(r6, r0)
            java.lang.String r5 = ""
            android.util.Log.d(r5, r0)
            int r0 = r6.hashCode()
            r4 = 2
            r3 = 1
            r2 = 0
            switch(r0) {
                case -2117986441: goto L_0x06a5;
                case -1747557034: goto L_0x06ae;
                case -1551525849: goto L_0x06b7;
                case -1483567756: goto L_0x06c0;
                case -1242219886: goto L_0x06c9;
                case -1182895194: goto L_0x06d2;
                case -1030847255: goto L_0x06db;
                case -877110701: goto L_0x06e4;
                case -809454050: goto L_0x06ed;
                case -780036552: goto L_0x06f7;
                case -746705348: goto L_0x0701;
                case -629460340: goto L_0x070b;
                case -606722934: goto L_0x0715;
                case -541608891: goto L_0x071f;
                case -531827055: goto L_0x0729;
                case -444732597: goto L_0x0733;
                case -384355952: goto L_0x073d;
                case -363552265: goto L_0x0747;
                case -347836657: goto L_0x0751;
                case -161320099: goto L_0x075b;
                case -131830477: goto L_0x0765;
                case -78052800: goto L_0x076f;
                case 151157378: goto L_0x0779;
                case 227600558: goto L_0x0783;
                case 243158640: goto L_0x078d;
                case 598814056: goto L_0x0797;
                case 610178701: goto L_0x07a1;
                case 683144274: goto L_0x07ab;
                case 764653078: goto L_0x07b5;
                case 878253942: goto L_0x07be;
                case 889592555: goto L_0x07c7;
                case 902242951: goto L_0x07d0;
                case 1002037470: goto L_0x07d9;
                case 1073657643: goto L_0x07e2;
                case 1093292105: goto L_0x07eb;
                case 1172555497: goto L_0x07f4;
                case 1281868444: goto L_0x07fd;
                case 1293733961: goto L_0x0806;
                case 1323560766: goto L_0x080f;
                case 1643041589: goto L_0x0818;
                case 1856118462: goto L_0x0821;
                case 1866424912: goto L_0x082a;
                case 2094846105: goto L_0x0833;
                default: goto L_0x0021;
            }
        L_0x0021:
            r11 = -1
        L_0x0022:
            java.lang.String r10 = "] on a null or empty parent node"
            r8 = 0
            r9 = r21
            r12 = r22
            switch(r11) {
                case 0: goto L_0x083f;
                case 1: goto L_0x067d;
                case 2: goto L_0x005c;
                case 3: goto L_0x0530;
                case 4: goto L_0x0091;
                case 5: goto L_0x00df;
                case 6: goto L_0x088b;
                case 7: goto L_0x010f;
                case 8: goto L_0x01fc;
                case 9: goto L_0x0922;
                case 10: goto L_0x0570;
                case 11: goto L_0x0948;
                case 12: goto L_0x020f;
                case 13: goto L_0x0035;
                case 14: goto L_0x01fc;
                case 15: goto L_0x0235;
                case 16: goto L_0x0258;
                case 17: goto L_0x065b;
                case 18: goto L_0x026b;
                case 19: goto L_0x0848;
                case 20: goto L_0x027e;
                case 21: goto L_0x0044;
                case 22: goto L_0x058e;
                case 23: goto L_0x0091;
                case 24: goto L_0x0340;
                case 25: goto L_0x067d;
                case 26: goto L_0x086b;
                case 27: goto L_0x0415;
                case 28: goto L_0x0961;
                case 29: goto L_0x0053;
                case 30: goto L_0x05ca;
                case 31: goto L_0x063e;
                case 32: goto L_0x067d;
                case 33: goto L_0x0353;
                case 34: goto L_0x087c;
                case 35: goto L_0x03ec;
                case 36: goto L_0x097a;
                case 37: goto L_0x067d;
                case 38: goto L_0x0426;
                case 39: goto L_0x0463;
                case 40: goto L_0x0998;
                case 41: goto L_0x04b3;
                case 42: goto L_0x0502;
                default: goto L_0x002c;
            }
        L_0x002c:
            X.1Jc r0 = r9.A00
            if (r0 == 0) goto L_0x068f
            java.lang.Object r8 = r0.A8l(r12, r7, r1)
        L_0x0034:
            return r8
        L_0x0035:
            android.app.Activity r0 = A00(r1)
            X.69L r0 = (X.AnonymousClass69L) r0
            X.5jo r0 = (X.C112855jo) r0
            X.5vV r0 = r0.A0L
            r0.A02()
            goto L_0x067d
        L_0x0044:
            android.app.Activity r0 = A00(r1)
            X.69L r0 = (X.AnonymousClass69L) r0
            X.5jo r0 = (X.C112855jo) r0
            X.5vV r0 = r0.A0L
            r0.A01()
            goto L_0x067d
        L_0x0053:
            android.app.Activity r0 = A00(r1)
            r0.finish()
            goto L_0x067d
        L_0x005c:
            java.util.List r4 = r12.A00
            java.util.Map r0 = X.C110115dX.A0j(r4, r2)
            X.1Z6 r6 = A01(r4, r3)
            r6.A00 = r1
            android.app.Activity r1 = A00(r1)
            java.util.HashMap r5 = A02(r0)
            java.lang.String r0 = "case"
            java.lang.Object r4 = r5.remove(r0)
            X.AnonymousClass00B.A06(r4)
            java.lang.String r4 = (java.lang.String) r4
            r3 = r1
            X.69L r3 = (X.AnonymousClass69L) r3
            X.68C r1 = (X.AnonymousClass68C) r1
            X.5hA r1 = (X.C111675hA) r1
            X.5wp r2 = r1.A09
            X.0q4 r1 = r6.A00
            X.0q1 r0 = r6.A01
            X.1Z7 r0 = r2.A01(r1, r0, r4)
            r3.AaT(r0, r4, r5)
            goto L_0x067d
        L_0x0091:
            java.util.List r7 = r12.A00
            java.lang.String r6 = X.AnonymousClass000.A0n(r7, r2)
            java.lang.Object r1 = r7.get(r3)
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x00da
            boolean r5 = X.AnonymousClass000.A1X(r1)
        L_0x00a3:
            java.lang.Object r1 = r7.get(r4)
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x00d5
            boolean r0 = X.AnonymousClass000.A1X(r1)
        L_0x00af:
            if (r0 == r3) goto L_0x00d3
            if (r0 == r4) goto L_0x00b4
            r4 = 0
        L_0x00b4:
            r0 = 3
            java.util.Map r3 = X.C110115dX.A0j(r7, r0)
            r0 = 4
            java.lang.Object r1 = r7.get(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            X.69d r2 = r9.A02
            java.util.HashMap r0 = A02(r3)
            X.5zm r2 = (X.C119885zm) r2
            X.5hc r1 = X.C115155pE.A00(r6, r1, r0, r5, r4)
            X.0t9 r0 = r2.A08
            r0.A06(r1)
            goto L_0x067d
        L_0x00d3:
            r4 = 1
            goto L_0x00b4
        L_0x00d5:
            int r0 = X.AnonymousClass000.A0D(r1)
            goto L_0x00af
        L_0x00da:
            int r5 = X.AnonymousClass000.A0D(r1)
            goto L_0x00a3
        L_0x00df:
            java.util.List r0 = r12.A00
            java.lang.String r2 = X.AnonymousClass000.A0n(r0, r2)
            X.69d r1 = r9.A02
            X.5zm r1 = (X.C119885zm) r1
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x00f6
            java.lang.String r0 = "WaExtensions/evaluate/bk.action.io.clipboard.SetString: text cannot be null or empty"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x067d
        L_0x00f6:
            X.01V r0 = r1.A05
            android.content.ClipboardManager r1 = r0.A0B()
            if (r1 == 0) goto L_0x067d
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r2, r2)     // Catch:{ NullPointerException | SecurityException -> 0x0107 }
            r1.setPrimaryClip(r0)     // Catch:{ NullPointerException | SecurityException -> 0x0107 }
            goto L_0x067d
        L_0x0107:
            r1 = move-exception
            java.lang.String r0 = "bkinterpreter/clipboard/"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x067d
        L_0x010f:
            java.util.List r0 = r12.A00
            java.util.Map r4 = X.C110115dX.A0j(r0, r2)
            X.1Z6 r7 = A01(r0, r3)
            r7.A00 = r1
            X.69d r2 = r9.A02
            android.app.Activity r0 = A00(r1)
            java.util.HashMap r5 = A02(r4)
            X.5zm r2 = (X.C119885zm) r2
            X.68C r0 = (X.AnonymousClass68C) r0
            X.5hA r0 = (X.C111675hA) r0
            X.5wp r3 = r0.A09
            X.013 r6 = r2.A07
            X.0q4 r0 = r7.A00
            X.0q7 r0 = r0.A00
            X.22A r1 = r0.A02
            java.lang.String r0 = "message"
            java.lang.Object r8 = r5.get(r0)
            X.AnonymousClass00B.A06(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r0 = "title"
            java.lang.String r2 = X.C110115dX.A0g(r0, r5)
            java.lang.ref.WeakReference r0 = r1.A06
            java.lang.Object r1 = r0.get()
            android.content.Context r1 = (android.content.Context) r1
            X.02h r0 = new X.02h
            r0.<init>(r1)
            X.02l r4 = r0.create()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0160
            r4.setTitle(r2)
        L_0x0160:
            X.0Wi r0 = r4.A00
            r0.A0Q = r8
            android.widget.TextView r0 = r0.A0K
            if (r0 == 0) goto L_0x016b
            r0.setText(r8)
        L_0x016b:
            r0 = 0
            r4.setCanceledOnTouchOutside(r0)
            X.0q4 r2 = r7.A00
            X.0q1 r1 = r7.A01
            java.lang.String r0 = "alert_dialog"
            X.1Z7 r3 = r3.A01(r2, r1, r0)
            java.lang.String r0 = "button_info"
            java.lang.String r1 = X.C110115dX.A0g(r0, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r5 = -1
            if (r0 != 0) goto L_0x01d6
            java.lang.String r0 = "\\|"
            java.lang.String[] r7 = r1.split(r0)
            r6 = 0
        L_0x018d:
            int r1 = r7.length
            r0 = 2
            int r1 = r1 - r0
            if (r6 > r1) goto L_0x01e6
            int r0 = r6 + 1
            r5 = r7[r0]
            r0 = 1
            com.facebook.redex.IDxCListenerShape30S0200000_3_I1 r2 = new com.facebook.redex.IDxCListenerShape30S0200000_3_I1
            r2.<init>(r4, r0, r3)
            r1 = r7[r6]
            int r0 = r1.hashCode()
            switch(r0) {
                case -518392103: goto L_0x01ac;
                case 1820734407: goto L_0x01b7;
                case 2113821835: goto L_0x01c7;
                default: goto L_0x01a5;
            }
        L_0x01a5:
            r1 = -1
        L_0x01a6:
            r4.A03(r1, r5, r2)
            int r6 = r6 + 2
            goto L_0x018d
        L_0x01ac:
            java.lang.String r0 = "neutral_btn_label"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01a5
            r1 = -3
            r0 = 0
            goto L_0x01c1
        L_0x01b7:
            java.lang.String r0 = "negative_btn_label"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01a5
            r1 = -2
            r0 = 2
        L_0x01c1:
            com.facebook.redex.IDxCListenerShape30S0200000_3_I1 r2 = new com.facebook.redex.IDxCListenerShape30S0200000_3_I1
            r2.<init>(r4, r0, r3)
            goto L_0x01a6
        L_0x01c7:
            java.lang.String r0 = "positive_btn_label"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01a5
            r0 = 3
            com.facebook.redex.IDxCListenerShape30S0200000_3_I1 r2 = new com.facebook.redex.IDxCListenerShape30S0200000_3_I1
            r2.<init>(r4, r0, r3)
            goto L_0x01a5
        L_0x01d6:
            r0 = 2131889799(0x7f120e87, float:1.9414272E38)
            java.lang.String r2 = r6.A09(r0)
            r1 = 4
            com.facebook.redex.IDxCListenerShape30S0200000_3_I1 r0 = new com.facebook.redex.IDxCListenerShape30S0200000_3_I1
            r0.<init>(r4, r1, r3)
            r4.A03(r5, r2, r0)
        L_0x01e6:
            r1 = 0
            com.facebook.redex.IDxKListenerShape225S0100000_3_I1 r0 = new com.facebook.redex.IDxKListenerShape225S0100000_3_I1
            r0.<init>(r3, r1)
            r4.setOnKeyListener(r0)
            com.facebook.redex.IDxDListenerShape160S0100000_3_I1 r0 = new com.facebook.redex.IDxDListenerShape160S0100000_3_I1
            r0.<init>(r3, r1)
            r4.setOnDismissListener(r0)
            r4.show()
            goto L_0x067d
        L_0x01fc:
            java.util.List r0 = r12.A00
            java.lang.String r0 = X.AnonymousClass000.A0n(r0, r2)
            android.app.Activity r1 = A00(r1)
            android.content.Intent r0 = X.C13680ns.A0A(r0)
            r1.startActivity(r0)
            goto L_0x067d
        L_0x020f:
            java.util.List r0 = r12.A00
            java.lang.String r7 = X.AnonymousClass000.A0n(r0, r2)
            java.util.Map r2 = X.C110115dX.A0j(r0, r3)
            X.1Z6 r5 = new X.1Z6
            r5.<init>()
            r5.A01 = r8
            r5.A00 = r1
            X.69d r3 = r9.A02
            X.0q7 r0 = r1.A00
            X.22A r6 = r0.A02
            android.app.Activity r4 = A00(r1)
            java.util.HashMap r8 = A02(r2)
            r3.Aa3(r4, r5, r6, r7, r8)
            goto L_0x067d
        L_0x0235:
            java.util.List r0 = r12.A00
            java.lang.String r7 = X.AnonymousClass000.A0n(r0, r2)
            java.util.Map r2 = X.C110115dX.A0j(r0, r3)
            X.1Z6 r5 = A01(r0, r4)
            r5.A00 = r1
            X.69d r3 = r9.A02
            X.0q7 r0 = r1.A00
            X.22A r6 = r0.A02
            android.app.Activity r4 = A00(r1)
            java.util.HashMap r8 = A02(r2)
            r3.Aa4(r4, r5, r6, r7, r8)
            goto L_0x067d
        L_0x0258:
            java.util.List r0 = r12.A00
            java.util.Map r0 = X.C110115dX.A0j(r0, r2)
            X.5wp r1 = r9.A01
            if (r1 == 0) goto L_0x067d
            java.util.HashMap r0 = A02(r0)
            r1.A02(r0)
            goto L_0x067d
        L_0x026b:
            java.util.List r0 = r12.A00
            java.lang.String r6 = X.AnonymousClass000.A0n(r0, r2)
            java.util.Map r3 = X.C110115dX.A0j(r0, r3)
            X.1Z6 r7 = new X.1Z6
            r7.<init>()
            r7.A01 = r8
            goto L_0x04c1
        L_0x027e:
            java.util.List r5 = r12.A00
            java.lang.String r11 = X.AnonymousClass000.A0n(r5, r2)
            java.lang.String r10 = X.AnonymousClass000.A0n(r5, r3)
            java.lang.String r13 = X.AnonymousClass000.A0n(r5, r4)
            r0 = 3
            java.util.Map r2 = X.C110115dX.A0j(r5, r0)
            r0 = 4
            X.1Z6 r7 = A01(r5, r0)
            r7.A00 = r1
            X.69d r6 = r9.A02
            android.app.Activity r12 = A00(r1)
            java.util.HashMap r2 = r9.A03(r2)
            X.5zm r6 = (X.C119885zm) r6
            X.68C r12 = (X.AnonymousClass68C) r12
            X.0q1 r5 = r7.A01
            if (r5 == 0) goto L_0x02b7
            r0 = r12
            X.5hA r0 = (X.C111675hA) r0
            X.5wp r3 = r0.A09
            X.0q4 r1 = r7.A00
            java.lang.String r0 = "case"
            X.1Z7 r8 = r3.A01(r1, r5, r0)
        L_0x02b7:
            X.5wh r7 = r6.A04
            int r6 = java.lang.Integer.parseInt(r13)
            X.5jo r12 = (X.C112855jo) r12
            X.5pK r1 = r12.A08
            if (r1 != 0) goto L_0x02ca
            X.5pK r1 = new X.5pK
            r1.<init>()
            r12.A08 = r1
        L_0x02ca:
            X.124 r0 = r12.A06
            X.5rf r3 = new X.5rf
            r3.<init>(r0, r1)
            java.util.List r0 = X.C119195wh.A02
            boolean r0 = r0.contains(r10)
            if (r0 != 0) goto L_0x02e7
            java.lang.String r0 = "Bloks: IQRequestHelper/sendIQRequest: Invalid XMLNS"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            if (r8 == 0) goto L_0x067d
            java.lang.String r0 = "on_failure"
            r8.A00(r0)
            goto L_0x067d
        L_0x02e7:
            java.util.Set r0 = r2.keySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = X.AnonymousClass000.A0m(r0)
            java.lang.Object r0 = r2.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            X.1Vv r9 = r7.A00(r3, r1, r0)
            X.0ug r14 = r7.A01
            java.lang.String r5 = r14.A02()
            r0 = 4
            X.1lL[] r2 = new X.C35081lL[r0]
            r13 = 0
            X.1ks r12 = X.C34791ks.A00
            java.lang.String r1 = "to"
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r12, (java.lang.String) r1)
            r2[r13] = r0
            r1 = 1
            java.lang.String r0 = "type"
            X.C35081lL.A02(r0, r11, r2, r1)
            java.lang.String r0 = "id"
            X.C35081lL.A02(r0, r5, r2, r4)
            r1 = 3
            java.lang.String r0 = "xmlns"
            X.C35081lL.A02(r0, r10, r2, r1)
            java.lang.String r0 = "iq"
            X.1Vv r4 = new X.1Vv
            r4.<init>((X.C28371Vv) r9, (java.lang.String) r0, (X.C35081lL[]) r2)
            r18 = 204(0xcc, float:2.86E-43)
            X.62S r15 = new X.62S
            r15.<init>(r8, r7, r3)
            long r2 = (long) r6
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            r17 = r5
            r19 = r2
            r16 = r4
            r14.A0A(r15, r16, r17, r18, r19)
            goto L_0x067d
        L_0x0340:
            X.0q7 r0 = r1.A00
            X.22A r0 = r0.A02
            java.lang.ref.WeakReference r0 = r0.A08
            java.lang.Object r0 = r0.get()
            android.app.Dialog r0 = (android.app.Dialog) r0
            if (r0 == 0) goto L_0x067d
            r0.dismiss()
            goto L_0x067d
        L_0x0353:
            java.util.List r0 = r12.A00
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            java.lang.String r0 = "[Bloks logging] "
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0r(r0)
            r6 = 0
            java.lang.String r2 = X.AnonymousClass000.A0n(r1, r2)
            java.lang.String r0 = X.AnonymousClass000.A0n(r1, r3)
            r5.append(r0)
            java.lang.Object r0 = r1.get(r4)
            if (r0 == 0) goto L_0x037d
            java.lang.String r0 = " "
            r5.append(r0)
            java.lang.Object r0 = r1.get(r4)
            r5.append(r0)
        L_0x037d:
            int r0 = r2.hashCode()
            switch(r0) {
                case 97: goto L_0x03a0;
                case 100: goto L_0x03a7;
                case 101: goto L_0x03af;
                case 105: goto L_0x03b7;
                case 118: goto L_0x03bf;
                case 119: goto L_0x03c7;
                default: goto L_0x0384;
            }
        L_0x0384:
            r6 = -1
        L_0x0385:
            java.lang.String r1 = "Whatsapp"
            switch(r6) {
                case 0: goto L_0x0397;
                case 1: goto L_0x0397;
                case 2: goto L_0x0397;
                case 3: goto L_0x03d1;
                case 4: goto L_0x03da;
                case 5: goto L_0x03e3;
                default: goto L_0x038a;
            }
        L_0x038a:
            java.lang.String r0 = "[Bloks logging] incorrect level: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r0)
            android.util.Log.d(r1, r0)
        L_0x0397:
            java.lang.String r0 = r5.toString()
            android.util.Log.d(r1, r0)
            goto L_0x067d
        L_0x03a0:
            java.lang.String r0 = "a"
            boolean r0 = r2.equals(r0)
            goto L_0x03ce
        L_0x03a7:
            java.lang.String r0 = "d"
            boolean r0 = r2.equals(r0)
            r6 = 1
            goto L_0x03ce
        L_0x03af:
            java.lang.String r0 = "e"
            boolean r0 = r2.equals(r0)
            r6 = 2
            goto L_0x03ce
        L_0x03b7:
            java.lang.String r0 = "i"
            boolean r0 = r2.equals(r0)
            r6 = 3
            goto L_0x03ce
        L_0x03bf:
            java.lang.String r0 = "v"
            boolean r0 = r2.equals(r0)
            r6 = 4
            goto L_0x03ce
        L_0x03c7:
            java.lang.String r0 = "w"
            boolean r0 = r2.equals(r0)
            r6 = 5
        L_0x03ce:
            if (r0 != 0) goto L_0x0385
            goto L_0x0384
        L_0x03d1:
            java.lang.String r0 = r5.toString()
            android.util.Log.i(r1, r0)
            goto L_0x067d
        L_0x03da:
            java.lang.String r0 = r5.toString()
            android.util.Log.v(r1, r0)
            goto L_0x067d
        L_0x03e3:
            java.lang.String r0 = r5.toString()
            android.util.Log.w(r1, r0)
            goto L_0x067d
        L_0x03ec:
            java.util.List r0 = r12.A00
            java.util.Map r0 = X.C110115dX.A0j(r0, r2)
            android.app.Activity r1 = A00(r1)
            if (r0 == 0) goto L_0x03fc
            java.util.HashMap r8 = A02(r0)
        L_0x03fc:
            r0 = r1
            X.68C r0 = (X.AnonymousClass68C) r0
            r1.onBackPressed()
            if (r8 == 0) goto L_0x067d
            X.5hA r0 = (X.C111675hA) r0
            X.5wp r0 = r0.A09
            java.util.Stack r0 = r0.A02
            java.lang.Object r0 = r0.peek()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            r0.putAll(r8)
            goto L_0x067d
        L_0x0415:
            java.util.List r0 = r12.A00
            java.lang.String r1 = X.AnonymousClass000.A0n(r0, r2)
            X.69d r0 = r9.A02
            X.5zm r0 = (X.C119885zm) r0
            X.0pt r0 = r0.A01
            r0.A0H(r1, r2)
            goto L_0x067d
        L_0x0426:
            java.util.List r0 = r12.A00
            java.lang.String r4 = X.AnonymousClass000.A0n(r0, r2)
            android.app.Activity r2 = A00(r1)
            X.68C r2 = (X.AnonymousClass68C) r2
            X.5hA r2 = (X.C111675hA) r2
            X.02C r1 = r2.AGM()
            java.lang.String r0 = "bloks-dialog"
            X.01A r3 = r1.A0B(r0)
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            X.5wp r2 = r2.A09
            java.lang.String r1 = "dialog"
            java.util.HashMap r0 = r2.A01
            java.lang.Object r1 = r0.get(r1)
            X.1Z7 r1 = (X.AnonymousClass1Z7) r1
            if (r3 == 0) goto L_0x0459
            r3.A1C()
            X.C119275wp.A00(r0)
            java.util.Stack r0 = r2.A02
            r0.pop()
        L_0x0459:
            if (r1 == 0) goto L_0x067d
            r0 = 1
            r1.A00 = r0
            r1.A00(r4)
            goto L_0x067d
        L_0x0463:
            java.util.List r0 = r12.A00
            java.lang.String r2 = X.AnonymousClass000.A0n(r0, r2)
            java.lang.Object r6 = r0.get(r3)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            X.0q7 r0 = r1.A00
            X.22A r0 = r0.A02
            X.69d r5 = r9.A02
            android.app.Activity r4 = A00(r1)
            X.5zm r5 = (X.C119885zm) r5
            java.lang.ref.WeakReference r0 = r0.A08
            java.lang.Object r3 = r0.get()
            android.app.ProgressDialog r3 = (android.app.ProgressDialog) r3
            if (r3 == 0) goto L_0x067d
            boolean r0 = r3.isShowing()
            if (r0 == 0) goto L_0x048e
            r3.dismiss()
        L_0x048e:
            r3.setMessage(r2)
            r2 = 1
            r3.setIndeterminate(r2)
            r1 = 0
            r3.setCanceledOnTouchOutside(r1)
            boolean r0 = r6.booleanValue()
            if (r0 == 0) goto L_0x04af
            r3.setCancelable(r2)
            X.5xv r0 = new X.5xv
            r0.<init>(r4, r5)
            r3.setOnCancelListener(r0)
        L_0x04aa:
            r3.show()
            goto L_0x067d
        L_0x04af:
            r3.setCancelable(r1)
            goto L_0x04aa
        L_0x04b3:
            java.util.List r0 = r12.A00
            java.lang.String r6 = X.AnonymousClass000.A0n(r0, r2)
            java.util.Map r3 = X.C110115dX.A0j(r0, r3)
            X.1Z6 r7 = A01(r0, r4)
        L_0x04c1:
            r7.A00 = r1
            android.app.Activity r2 = A00(r1)
            X.0q7 r0 = r1.A00
            X.22A r5 = r0.A02
            java.util.HashMap r4 = A02(r3)
            r0 = r2
            X.68C r0 = (X.AnonymousClass68C) r0
            X.5hA r0 = (X.C111675hA) r0
            X.5wp r3 = r0.A09
            X.C119885zm.A00(r2, r3, r7, r4)
            X.0q1 r2 = r7.A01
            if (r2 == 0) goto L_0x04e4
            X.0q4 r1 = r7.A00
            java.lang.String r0 = "dialog"
            r3.A01(r1, r2, r0)
        L_0x04e4:
            java.lang.ref.WeakReference r0 = r5.A07
            java.lang.Object r2 = r0.get()
            X.02C r2 = (X.AnonymousClass02C) r2
            java.lang.String r1 = "bloks-dialog"
            X.01A r0 = r2.A0B(r1)
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            if (r0 == 0) goto L_0x04f9
            r0.A1C()
        L_0x04f9:
            com.obwhatsapp.bloks.ui.BloksDialogFragment r0 = com.obwhatsapp.bloks.ui.BloksDialogFragment.A01(r6, r4)
            r0.A1G(r2, r1)
            goto L_0x067d
        L_0x0502:
            java.util.List r5 = r12.A00
            java.lang.Object r0 = r5.get(r2)
            int r4 = X.AnonymousClass000.A0D(r0)
            java.util.Map r0 = X.C110115dX.A0j(r5, r3)
            android.app.Activity r3 = A00(r1)
            if (r0 == 0) goto L_0x051a
            java.util.HashMap r8 = A02(r0)
        L_0x051a:
            if (r4 == 0) goto L_0x051d
            r2 = -1
        L_0x051d:
            android.content.Intent r1 = r3.getIntent()
            if (r8 == 0) goto L_0x0528
            java.lang.String r0 = "finish_activity_result"
            r1.putExtra(r0, r8)
        L_0x0528:
            r3.setResult(r2, r1)
            r3.finish()
            goto L_0x067d
        L_0x0530:
            java.util.List r0 = r12.A00
            java.lang.Object r7 = r0.get(r2)
            java.util.AbstractList r7 = (java.util.AbstractList) r7
            java.lang.Object r0 = r0.get(r3)
            X.1e8 r0 = (X.C31411e8) r0
            X.1e9 r6 = r0.A00
            int r0 = r7.size()
            java.util.ArrayList r8 = X.C13690nt.A0i(r0)
            r5 = 0
        L_0x0549:
            int r0 = r7.size()
            if (r5 >= r0) goto L_0x0034
            X.0q2 r4 = new X.0q2
            r4.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r4.A03(r0, r2)
            java.lang.Object r0 = r7.get(r5)
            r4.A03(r0, r3)
            X.0q3 r0 = r4.A01()
            java.lang.Object r0 = X.C14980q6.A00(r1, r0, r6)
            r8.add(r0)
            int r5 = r5 + 1
            goto L_0x0549
        L_0x0570:
            java.util.List r0 = r12.A00
            java.util.Map r2 = X.C110115dX.A0j(r0, r2)
            java.lang.Object r1 = r0.get(r3)
            if (r2 == 0) goto L_0x0586
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x0586
            java.lang.String r0 = "children"
            goto L_0x066f
        L_0x0586:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "WaExtensions/GetChildNode Cannot find the child node ["
            goto L_0x0685
        L_0x058e:
            java.util.List r0 = r12.A00
            java.lang.Object r5 = r0.get(r2)
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r8 = r0.get(r3)
            java.lang.Object r0 = r0.get(r4)
            X.1e8 r0 = (X.C31411e8) r0
            X.1e9 r6 = r0.A00
            int r0 = r5.size()
            if (r0 == 0) goto L_0x0034
            java.util.Iterator r5 = r5.iterator()
        L_0x05ac:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r4 = r5.next()
            X.0q2 r0 = new X.0q2
            r0.<init>()
            r0.A03(r8, r2)
            r0.A03(r4, r3)
            X.0q3 r0 = r0.A01()
            java.lang.Object r8 = X.C14980q6.A00(r1, r0, r6)
            goto L_0x05ac
        L_0x05ca:
            java.util.List r0 = r12.A00
            java.lang.String r4 = X.AnonymousClass000.A0n(r0, r2)
            java.lang.String r3 = X.AnonymousClass000.A0n(r0, r3)
            X.0q7 r0 = r1.A00
            X.22A r0 = r0.A02
            java.lang.ref.WeakReference r0 = r0.A06
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            android.content.Intent r1 = r0.getIntent()
            if (r4 == 0) goto L_0x0034
            if (r3 == 0) goto L_0x0034
            int r0 = r3.hashCode()
            switch(r0) {
                case -891985903: goto L_0x05fd;
                case 64711720: goto L_0x060a;
                case 97526364: goto L_0x061b;
                case 1958052158: goto L_0x062d;
                default: goto L_0x05ef;
            }
        L_0x05ef:
            java.lang.String r0 = "PAY: BloksActivity/getIntentParameter type not supported: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r0)
            android.util.Log.d(r5, r0)
            return r8
        L_0x05fd:
            java.lang.String r0 = "string"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x05ef
            java.lang.String r8 = r1.getStringExtra(r4)
            return r8
        L_0x060a:
            java.lang.String r0 = "boolean"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x05ef
            boolean r0 = r1.getBooleanExtra(r4, r2)
            if (r0 == 0) goto L_0x09af
            java.lang.String r8 = "1"
            return r8
        L_0x061b:
            java.lang.String r0 = "float"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x05ef
            r0 = 0
            float r0 = r1.getFloatExtra(r4, r0)
            java.lang.String r8 = java.lang.Float.toString(r0)
            return r8
        L_0x062d:
            java.lang.String r0 = "integer"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x05ef
            int r0 = r1.getIntExtra(r4, r2)
            java.lang.String r8 = java.lang.Integer.toString(r0)
            return r8
        L_0x063e:
            java.util.List r0 = r12.A00
            java.lang.Object r2 = r0.get(r2)
            X.5wp r0 = r9.A01
            if (r0 == 0) goto L_0x067d
            java.util.Stack r1 = r0.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0034
            java.lang.Object r0 = r1.peek()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.lang.Object r8 = r0.get(r2)
            return r8
        L_0x065b:
            java.util.List r0 = r12.A00
            java.util.Map r2 = X.C110115dX.A0j(r0, r2)
            java.lang.Object r1 = r0.get(r3)
            if (r2 == 0) goto L_0x067f
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x067f
            java.lang.String r0 = "properties"
        L_0x066f:
            java.lang.Object r0 = r2.get(r0)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x067d
            java.lang.Object r8 = r0.get(r1)
            if (r8 != 0) goto L_0x0034
        L_0x067d:
            r8 = 0
            return r8
        L_0x067f:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "WaExtensions/GetChildNode Cannot find the attribute ["
        L_0x0685:
            r2.append(r0)
            r2.append(r1)
            r2.append(r10)
            goto L_0x069d
        L_0x068f:
            java.lang.String r0 = "WaExtensions/Bloks function: ["
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            r2.append(r6)
            java.lang.String r0 = "] not implemented on client"
            r2.append(r0)
        L_0x069d:
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r5, r0)
            goto L_0x067d
        L_0x06a5:
            java.lang.String r0 = "bk.action.io.CurrentTimeMillis"
            boolean r0 = r6.equals(r0)
            r11 = 0
            goto L_0x083b
        L_0x06ae:
            java.lang.String r0 = "wa.action.perf.TrackPerformance"
            boolean r0 = r6.equals(r0)
            r11 = 1
            goto L_0x083b
        L_0x06b7:
            java.lang.String r0 = "wa.action.AsyncRequest"
            boolean r0 = r6.equals(r0)
            r11 = 2
            goto L_0x083b
        L_0x06c0:
            java.lang.String r0 = "bk.action.array.Map"
            boolean r0 = r6.equals(r0)
            r11 = 3
            goto L_0x083b
        L_0x06c9:
            java.lang.String r0 = "wa.action.SendFieldStat"
            boolean r0 = r6.equals(r0)
            r11 = 4
            goto L_0x083b
        L_0x06d2:
            java.lang.String r0 = "bk.action.io.clipboard.SetString"
            boolean r0 = r6.equals(r0)
            r11 = 5
            goto L_0x083b
        L_0x06db:
            java.lang.String r0 = "wa.action.TimeInFuture"
            boolean r0 = r6.equals(r0)
            r11 = 6
            goto L_0x083b
        L_0x06e4:
            java.lang.String r0 = "wa.action.ShowAlertDialog"
            boolean r0 = r6.equals(r0)
            r11 = 7
            goto L_0x083b
        L_0x06ed:
            java.lang.String r0 = "bk.action.navigation.OpenUrl"
            boolean r0 = r6.equals(r0)
            r11 = 8
            goto L_0x083b
        L_0x06f7:
            java.lang.String r0 = "wa.action.FormatStringV2"
            boolean r0 = r6.equals(r0)
            r11 = 9
            goto L_0x083b
        L_0x0701:
            java.lang.String r0 = "wa.action.GetChildNode"
            boolean r0 = r6.equals(r0)
            r11 = 10
            goto L_0x083b
        L_0x070b:
            java.lang.String r0 = "wa.action.HandleError"
            boolean r0 = r6.equals(r0)
            r11 = 11
            goto L_0x083b
        L_0x0715:
            java.lang.String r0 = "bk.action.bloks.OpenScreen"
            boolean r0 = r6.equals(r0)
            r11 = 12
            goto L_0x083b
        L_0x071f:
            java.lang.String r0 = "wa.action.StartFieldStatTimer"
            boolean r0 = r6.equals(r0)
            r11 = 13
            goto L_0x083b
        L_0x0729:
            java.lang.String r0 = "wa.action.OpenUrl"
            boolean r0 = r6.equals(r0)
            r11 = 14
            goto L_0x083b
        L_0x0733:
            java.lang.String r0 = "wa.action.bloks.OpenScreenWithBackpress"
            boolean r0 = r6.equals(r0)
            r11 = 15
            goto L_0x083b
        L_0x073d:
            java.lang.String r0 = "wa.action.SaveScreenParam"
            boolean r0 = r6.equals(r0)
            r11 = 16
            goto L_0x083b
        L_0x0747:
            java.lang.String r0 = "wa.action.GetAttributeValue"
            boolean r0 = r6.equals(r0)
            r11 = 17
            goto L_0x083b
        L_0x0751:
            java.lang.String r0 = "bk.action.bloks.LaunchDialog"
            boolean r0 = r6.equals(r0)
            r11 = 18
            goto L_0x083b
        L_0x075b:
            java.lang.String r0 = "wa.action.GetFieldStatElapsedTime"
            boolean r0 = r6.equals(r0)
            r11 = 19
            goto L_0x083b
        L_0x0765:
            java.lang.String r0 = "wa.action.IQRequest"
            boolean r0 = r6.equals(r0)
            r11 = 20
            goto L_0x083b
        L_0x076f:
            java.lang.String r0 = "wa.action.ResetFieldStats"
            boolean r0 = r6.equals(r0)
            r11 = 21
            goto L_0x083b
        L_0x0779:
            java.lang.String r0 = "wa.action.array.Foldl"
            boolean r0 = r6.equals(r0)
            r11 = 22
            goto L_0x083b
        L_0x0783:
            java.lang.String r0 = "wa.action.SendFieldStatV2"
            boolean r0 = r6.equals(r0)
            r11 = 23
            goto L_0x083b
        L_0x078d:
            java.lang.String r0 = "wa.action.DismissProgressBar"
            boolean r0 = r6.equals(r0)
            r11 = 24
            goto L_0x083b
        L_0x0797:
            java.lang.String r0 = "wa.action.navigation.OpenChat"
            boolean r0 = r6.equals(r0)
            r11 = 25
            goto L_0x083b
        L_0x07a1:
            java.lang.String r0 = "bk.action.session_store.Get"
            boolean r0 = r6.equals(r0)
            r11 = 26
            goto L_0x083b
        L_0x07ab:
            java.lang.String r0 = "bk.action.io.Toast"
            boolean r0 = r6.equals(r0)
            r11 = 27
            goto L_0x083b
        L_0x07b5:
            java.lang.String r0 = "wa.action.GetProcessedData"
            boolean r0 = r6.equals(r0)
            r11 = 28
            goto L_0x083b
        L_0x07be:
            java.lang.String r0 = "wa.action.FinishActivity"
            boolean r0 = r6.equals(r0)
            r11 = 29
            goto L_0x083b
        L_0x07c7:
            java.lang.String r0 = "wa.action.GetIntentParameter"
            boolean r0 = r6.equals(r0)
            r11 = 30
            goto L_0x083b
        L_0x07d0:
            java.lang.String r0 = "wa.action.LoadScreenParam"
            boolean r0 = r6.equals(r0)
            r11 = 31
            goto L_0x083b
        L_0x07d9:
            java.lang.String r0 = "wa.action.navigation.OpenContactInfo"
            boolean r0 = r6.equals(r0)
            r11 = 32
            goto L_0x083b
        L_0x07e2:
            java.lang.String r0 = "wa.action.Logging"
            boolean r0 = r6.equals(r0)
            r11 = 33
            goto L_0x083b
        L_0x07eb:
            java.lang.String r0 = "wa.action.GetFieldStatEventId"
            boolean r0 = r6.equals(r0)
            r11 = 34
            goto L_0x083b
        L_0x07f4:
            java.lang.String r0 = "wa.action.PopScreen"
            boolean r0 = r6.equals(r0)
            r11 = 35
            goto L_0x083b
        L_0x07fd:
            java.lang.String r0 = "wa.action.FormatString"
            boolean r0 = r6.equals(r0)
            r11 = 36
            goto L_0x083b
        L_0x0806:
            java.lang.String r0 = "bk.action.io.DebugToast"
            boolean r0 = r6.equals(r0)
            r11 = 37
            goto L_0x083b
        L_0x080f:
            java.lang.String r0 = "wa.action.DismissDialog"
            boolean r0 = r6.equals(r0)
            r11 = 38
            goto L_0x083b
        L_0x0818:
            java.lang.String r0 = "wa.action.ShowProgressBar"
            boolean r0 = r6.equals(r0)
            r11 = 39
            goto L_0x083b
        L_0x0821:
            java.lang.String r0 = "bk.action.string.MatchesRegex"
            boolean r0 = r6.equals(r0)
            r11 = 40
            goto L_0x083b
        L_0x082a:
            java.lang.String r0 = "wa.action.bloks.LaunchDialog"
            boolean r0 = r6.equals(r0)
            r11 = 41
            goto L_0x083b
        L_0x0833:
            java.lang.String r0 = "wa.action.FinishActivityWithResult"
            boolean r0 = r6.equals(r0)
            r11 = 42
        L_0x083b:
            if (r0 != 0) goto L_0x0022
            goto L_0x0021
        L_0x083f:
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            return r8
        L_0x0848:
            android.app.Activity r0 = A00(r1)
            X.69L r0 = (X.AnonymousClass69L) r0
            X.5jo r0 = (X.C112855jo) r0
            X.5vV r5 = r0.A0L
            long r3 = r5.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0868
            X.0t3 r0 = r5.A01
            long r2 = r0.A00()
            long r0 = r5.A00
            long r2 = r2 - r0
        L_0x0863:
            java.lang.Long r8 = java.lang.Long.valueOf(r2)
            return r8
        L_0x0868:
            r2 = -1
            goto L_0x0863
        L_0x086b:
            X.69d r2 = r9.A02
            X.5zm r2 = (X.C119885zm) r2
            X.0sK r0 = r2.A02
            X.1ZT r1 = r0.A05()
            X.5ty r0 = r2.A03
            java.util.Map r8 = r0.A00(r1)
            return r8
        L_0x087c:
            android.app.Activity r0 = A00(r1)
            X.69L r0 = (X.AnonymousClass69L) r0
            X.5jo r0 = (X.C112855jo) r0
            X.5vV r0 = r0.A0L
            java.lang.String r8 = r0.A00()
            return r8
        L_0x088b:
            java.util.List r6 = r12.A00
            java.lang.String r1 = X.AnonymousClass000.A0n(r6, r2)
            if (r1 == 0) goto L_0x08ae
            int r0 = r1.length()
            if (r0 == 0) goto L_0x08ae
            long r4 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x089e }
            goto L_0x08b0
        L_0x089e:
            r2 = move-exception
            java.lang.String r0 = "NumberUtil/Invalid long value:"
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r0)
            java.lang.String r0 = "Whatsapp"
            android.util.Log.d(r0, r1, r2)
        L_0x08ae:
            r4 = 0
        L_0x08b0:
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
            java.lang.String r3 = X.AnonymousClass000.A0n(r6, r3)
            X.69d r0 = r9.A02
            X.5zm r0 = (X.C119885zm) r0
            X.0t3 r0 = r0.A06
            long r0 = r0.A00()
            long r4 = r4 - r0
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x091f
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            int r0 = r3.hashCode()
            switch(r0) {
                case -1074026988: goto L_0x0900;
                case -906279820: goto L_0x08ee;
                case 3208676: goto L_0x08dc;
                default: goto L_0x08d3;
            }
        L_0x08d3:
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.lang.String r8 = java.lang.String.valueOf(r0)
            return r8
        L_0x08dc:
            java.lang.String r0 = "hour"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x08d3
            double r2 = r1.doubleValue()
            r0 = 4704985352480227328(0x414b774000000000, double:3600000.0)
            goto L_0x0911
        L_0x08ee:
            java.lang.String r0 = "second"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x08d3
            double r2 = r1.doubleValue()
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            goto L_0x0911
        L_0x0900:
            java.lang.String r0 = "minute"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x08d3
            double r2 = r1.doubleValue()
            r0 = 4678479150791524352(0x40ed4c0000000000, double:60000.0)
        L_0x0911:
            double r2 = r2 / r0
            double r0 = java.lang.Math.ceil(r2)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            long r4 = r0.longValue()
            goto L_0x08d3
        L_0x091f:
            r4 = -1
            goto L_0x08d3
        L_0x0922:
            java.util.List r0 = r12.A00
            java.lang.String r4 = X.AnonymousClass000.A0n(r0, r2)
            java.lang.Object r3 = r0.get(r3)
            java.util.AbstractList r3 = (java.util.AbstractList) r3
            int r0 = r3.size()
            java.lang.String[] r1 = new java.lang.String[r0]
        L_0x0934:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x0943
            java.lang.Object r0 = r3.get(r2)
            r1[r2] = r0
            int r2 = r2 + 1
            goto L_0x0934
        L_0x0943:
            java.lang.String r8 = java.text.MessageFormat.format(r4, r1)
            return r8
        L_0x0948:
            java.util.List r0 = r12.A00
            java.lang.String r0 = X.AnonymousClass000.A0n(r0, r2)
            int r2 = X.C87604Xq.A00(r0)
            android.app.Activity r0 = A00(r1)
            X.69L r0 = (X.AnonymousClass69L) r0
            boolean r0 = r0.AHK(r2)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            return r8
        L_0x0961:
            java.util.List r4 = r12.A00
            java.util.Map r0 = X.C110115dX.A0j(r4, r2)
            java.lang.String r2 = X.AnonymousClass000.A0n(r4, r3)
            android.app.Activity r1 = A00(r1)
            java.util.HashMap r0 = A02(r0)
            X.69L r1 = (X.AnonymousClass69L) r1
            java.lang.String r8 = r1.AaW(r2, r0)
            return r8
        L_0x097a:
            java.util.List r6 = r12.A00
            java.lang.String r5 = X.AnonymousClass000.A0n(r6, r2)
            int r4 = r6.size()
            int r4 = r4 - r3
            java.lang.String[] r3 = new java.lang.String[r4]
        L_0x0987:
            if (r2 >= r4) goto L_0x0993
            int r1 = r2 + 1
            java.lang.Object r0 = r6.get(r1)
            r3[r2] = r0
            r2 = r1
            goto L_0x0987
        L_0x0993:
            java.lang.String r8 = java.text.MessageFormat.format(r5, r3)
            return r8
        L_0x0998:
            java.util.List r0 = r12.A00
            java.lang.String r1 = X.AnonymousClass000.A0n(r0, r2)
            java.lang.String r0 = X.AnonymousClass000.A0n(r0, r3)
            java.util.regex.Matcher r0 = X.C110115dX.A0k(r1, r0)
            boolean r0 = r0.matches()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            return r8
        L_0x09af:
            java.lang.String r8 = "0"
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5zU.A8l(X.0q3, X.4tt, X.0q5):java.lang.Object");
    }
}
