package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.obwhatsapp.InteractiveAnnotation;
import com.obwhatsapp.SerializablePoint;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Bj  reason: invalid class name and case insensitive filesystem */
public class C62033Bj {
    public int A00;
    public int A01;
    public int A02;
    public RectF A03;
    public RectF A04;
    public String A05;
    public List A06;

    public C62033Bj(RectF rectF, RectF rectF2, List list, int i2) {
        this.A04 = rectF;
        this.A03 = rectF2;
        this.A06 = list;
        this.A02 = i2;
    }

    public static Matrix A00(float f2, float f3, float f4, float f5, float f6, boolean z2, boolean z3) {
        float f7;
        float f8;
        float f9;
        Matrix A0H = AnonymousClass000.A0H();
        float f10 = f4 % 180.0f;
        if (f10 == 90.0f) {
            f7 = f3 / f5;
            f8 = f2 / f6;
        } else {
            float f11 = f3 / f6;
            f7 = f2 / f5;
            f8 = f11;
        }
        A0H.preScale(f7, f8);
        float f12 = 0.0f;
        if (z2) {
            Matrix A0H2 = AnonymousClass000.A0H();
            A0H2.setValues(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
            A0H.preConcat(A0H2);
            float f13 = f5;
            if (f10 == 90.0f) {
                f13 = f6;
            }
            A0H.preTranslate(-f13, 0.0f);
        }
        if (z3) {
            Matrix A0H3 = AnonymousClass000.A0H();
            A0H3.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
            A0H.preConcat(A0H3);
            float f14 = f6;
            if (f10 == 90.0f) {
                f14 = f5;
            }
            A0H.preTranslate(-f14, 0.0f);
        }
        A0H.preRotate(f4);
        if (f4 == 90.0f) {
            A0H.preTranslate(0.0f, -f6);
        } else {
            if (f4 == 180.0f) {
                f9 = -f5;
                f12 = -f6;
            } else {
                f9 = -f5;
                if (f4 != 270.0f) {
                    if (f4 != 0.0f) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            A0H.preTranslate(f9, f12);
            return A0H;
        }
        return A0H;
    }

    public static C62033Bj A01(Context context, AnonymousClass013 r4, C17250um r5, AnonymousClass1MF r6, File file) {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            StringBuilder A0o = AnonymousClass000.A0o();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    A0o.append(readLine);
                } else {
                    C62033Bj A032 = A03(context, r4, r5, r6, A0o.toString());
                    bufferedReader.close();
                    return A032;
                }
            }
        } catch (Throwable unused) {
        }
        throw th;
    }

    public static C62033Bj A02(Context context, AnonymousClass013 r1, C17250um r2, AnonymousClass1MF r3, File file) {
        try {
            return A01(context, r1, r2, r3, file);
        } catch (IOException e2) {
            Log.e("Doodle/safeLoad could not load doodle from file", e2);
            return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0157, code lost:
        r10.A05();
        r3.add(r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C62033Bj A03(android.content.Context r12, X.AnonymousClass013 r13, X.C17250um r14, X.AnonymousClass1MF r15, java.lang.String r16) {
        /*
            java.lang.String r8 = "blurred-bitmap-provider"
            boolean r0 = android.text.TextUtils.isEmpty(r16)
            r11 = 0
            if (r0 != 0) goto L_0x01be
            org.json.JSONObject r7 = X.C13700nu.A0K(r16)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            android.graphics.RectF r9 = X.AnonymousClass000.A0K()     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            java.lang.String r0 = "l"
            int r0 = r7.getInt(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r1
            r9.left = r0     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            java.lang.String r0 = "t"
            int r0 = r7.getInt(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            float r0 = r0 / r1
            r9.top = r0     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            java.lang.String r0 = "r"
            int r0 = r7.getInt(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            float r0 = r0 / r1
            r9.right = r0     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            java.lang.String r0 = "b"
            int r0 = r7.getInt(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            float r0 = r0 / r1
            r9.bottom = r0     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            android.graphics.RectF r6 = X.AnonymousClass000.A0K()     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            java.lang.String r0 = "crop-l"
            int r0 = r7.getInt(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            float r0 = r0 / r1
            r6.left = r0     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            java.lang.String r0 = "crop-t"
            int r0 = r7.getInt(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            float r0 = r0 / r1
            r6.top = r0     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            java.lang.String r0 = "crop-r"
            int r0 = r7.getInt(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            float r0 = r0 / r1
            r6.right = r0     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            java.lang.String r0 = "crop-b"
            int r0 = r7.getInt(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            float r0 = (float) r0     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            float r0 = r0 / r1
            r6.bottom = r0     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            java.lang.String r0 = "rotate"
            int r5 = r7.getInt(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            java.lang.String r0 = "shapes"
            org.json.JSONArray r4 = r7.getJSONArray(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            r2 = 0
        L_0x007b:
            int r0 = r4.length()     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            if (r2 >= r0) goto L_0x0161
            org.json.JSONObject r1 = r4.getJSONObject(r2)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            java.lang.String r0 = "type"
            java.lang.String r10 = r1.getString(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            int r0 = r10.hashCode()     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            switch(r0) {
                case -2069773495: goto L_0x0149;
                case -1890252483: goto L_0x013a;
                case -1676415975: goto L_0x012c;
                case -1493474063: goto L_0x011e;
                case -841189240: goto L_0x010f;
                case -841116134: goto L_0x0100;
                case 110873: goto L_0x00ee;
                case 3423314: goto L_0x00e0;
                case 3496420: goto L_0x00d2;
                case 3556653: goto L_0x00c2;
                case 93090825: goto L_0x00b3;
                case 96632902: goto L_0x00a4;
                case 1901043637: goto L_0x0095;
                default: goto L_0x0093;
            }     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
        L_0x0093:
            goto L_0x015d
        L_0x0095:
            java.lang.String r0 = "location"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            if (r0 == 0) goto L_0x015d
            X.331 r10 = new X.331     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            r10.<init>(r12, r13, r1)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            goto L_0x0157
        L_0x00a4:
            java.lang.String r0 = "emoji"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            if (r0 == 0) goto L_0x015d
            X.32p r10 = new X.32p     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            r10.<init>(r12, r14, r1)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            goto L_0x0157
        L_0x00b3:
            java.lang.String r0 = "arrow"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            if (r0 == 0) goto L_0x015d
            X.32s r10 = new X.32s     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            r10.<init>(r1)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            goto L_0x0157
        L_0x00c2:
            java.lang.String r0 = "text"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            if (r0 == 0) goto L_0x015d
            X.32z r10 = new X.32z     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            r10.<init>(r12, r13, r14, r1)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            goto L_0x0157
        L_0x00d2:
            java.lang.String r0 = "rect"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            if (r0 == 0) goto L_0x015d
            X.32u r10 = new X.32u     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            r10.<init>(r1)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            goto L_0x0157
        L_0x00e0:
            java.lang.String r0 = "oval"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            if (r0 == 0) goto L_0x015d
            X.32t r10 = new X.32t     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            r10.<init>(r1)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            goto L_0x0157
        L_0x00ee:
            java.lang.String r0 = "pen"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            if (r0 == 0) goto L_0x015d
            float r0 = X.C13680ns.A01(r12)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            X.32x r10 = new X.32x     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            r10.<init>(r1, r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            goto L_0x0157
        L_0x0100:
            java.lang.String r0 = "speech-bubble-rect"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            if (r0 == 0) goto L_0x015d
            X.32w r10 = new X.32w     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            r10.<init>(r1)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            goto L_0x0157
        L_0x010f:
            java.lang.String r0 = "speech-bubble-oval"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            if (r0 == 0) goto L_0x015d
            X.32v r10 = new X.32v     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            r10.<init>(r1)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            goto L_0x0157
        L_0x011e:
            java.lang.String r0 = "analog-clock"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            if (r0 == 0) goto L_0x015d
            X.330 r10 = new X.330     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            r10.<init>((android.content.Context) r12, (X.AnonymousClass013) r13, (org.json.JSONObject) r1)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            goto L_0x0157
        L_0x012c:
            java.lang.String r0 = "digital-clock"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            if (r0 == 0) goto L_0x015d
            X.32q r10 = new X.32q     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            r10.<init>((android.content.Context) r12, (X.AnonymousClass013) r13, (org.json.JSONObject) r1)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            goto L_0x0157
        L_0x013a:
            java.lang.String r0 = "sticker"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            if (r0 == 0) goto L_0x015d
            X.32r r10 = new X.32r     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            r10.<init>(r12, r15, r1)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            goto L_0x0157
        L_0x0149:
            java.lang.String r0 = "thinking-bubble"
            boolean r0 = r10.equals(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            if (r0 == 0) goto L_0x015d
            X.32y r10 = new X.32y     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            r10.<init>(r1)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
        L_0x0157:
            r10.A05()     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            r3.add(r10)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
        L_0x015d:
            int r2 = r2 + 1
            goto L_0x007b
        L_0x0161:
            X.3Bj r4 = new X.3Bj     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            r4.<init>(r9, r6, r3, r5)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            boolean r0 = r7.has(r8)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            if (r0 == 0) goto L_0x01b0
            org.json.JSONObject r3 = r7.getJSONObject(r8)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            if (r3 == 0) goto L_0x01b0
            java.lang.String r0 = "small-bitmap"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            r2 = 0
            byte[] r1 = android.util.Base64.decode(r0, r2)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            int r0 = r1.length     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeByteArray(r1, r2, r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            java.lang.String r0 = "origin-width"
            int r1 = r3.getInt(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            java.lang.String r0 = "origin-height"
            int r0 = r3.getInt(r0)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            X.4aC r3 = new X.4aC     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            r3.<init>(r1, r0, r2)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            java.util.List r0 = r4.A06     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
        L_0x019a:
            boolean r0 = r2.hasNext()     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            if (r0 == 0) goto L_0x01b0
            java.lang.Object r1 = r2.next()     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            X.29l r1 = (X.C455829l) r1     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            boolean r0 = r1 instanceof X.AnonymousClass32x     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            if (r0 == 0) goto L_0x019a
            X.32x r1 = (X.AnonymousClass32x) r1     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            r1.A0R(r3)     // Catch:{ JSONException -> 0x01b8, IllegalArgumentException -> 0x01b1 }
            goto L_0x019a
        L_0x01b0:
            return r4
        L_0x01b1:
            r1 = move-exception
            java.lang.String r0 = "Doodle/Drawable or picture unable to load from JSON"
            com.whatsapp.util.Log.e(r0, r1)
            return r11
        L_0x01b8:
            r1 = move-exception
            java.lang.String r0 = "Doodle/load unable to load from JSON"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x01be:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62033Bj.A03(android.content.Context, X.013, X.0um, X.1MF, java.lang.String):X.3Bj");
    }

    public String A04() {
        C88254aC r5;
        JSONObject jSONObject;
        try {
            JSONObject A0J = C13700nu.A0J();
            A0J.put("version", 1);
            RectF rectF = this.A04;
            A0J.put("l", (int) (rectF.left * 100.0f));
            A0J.put("t", (int) (rectF.top * 100.0f));
            A0J.put("r", (int) (rectF.right * 100.0f));
            A0J.put("b", (int) (rectF.bottom * 100.0f));
            RectF rectF2 = this.A03;
            A0J.put("crop-l", (int) (rectF2.left * 100.0f));
            A0J.put("crop-t", (int) (rectF2.top * 100.0f));
            A0J.put("crop-r", (int) (rectF2.right * 100.0f));
            A0J.put("crop-b", (int) (rectF2.bottom * 100.0f));
            A0J.put("rotate", this.A02);
            List<C455829l> list = this.A06;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    r5 = null;
                    break;
                }
                C455829l r1 = (C455829l) it.next();
                if ((r1 instanceof AnonymousClass32x) && (r5 = ((AnonymousClass32x) r1).A04) != null) {
                    break;
                }
            }
            if (r5 != null) {
                if (r5.A03 == null) {
                    jSONObject = null;
                } else {
                    jSONObject = C13700nu.A0J();
                    jSONObject.put("origin-width", r5.A01);
                    jSONObject.put("origin-height", r5.A00);
                    jSONObject.put("small-bitmap", C37741pe.A07(r5.A03));
                }
                A0J.put("blurred-bitmap-provider", jSONObject);
            }
            JSONArray jSONArray = new JSONArray();
            for (C455829l A0N : list) {
                JSONObject A0J2 = C13700nu.A0J();
                A0N.A0N(A0J2);
                jSONArray.put(A0J2);
            }
            A0J.put("shapes", jSONArray);
            return A0J.toString();
        } catch (JSONException e2) {
            Log.e("Doodle/toJson error while constructing JSON", e2);
            return null;
        }
    }

    public List A05(float f2, float f3) {
        ArrayList A0u = AnonymousClass000.A0u();
        for (Object next : this.A06) {
            if (next instanceof AnonymousClass331) {
                A0u.add(next);
            }
        }
        if (A0u.isEmpty()) {
            return null;
        }
        RectF rectF = this.A03;
        float f4 = f2;
        float f5 = f3;
        Matrix A002 = A00(f4, f5, (float) this.A02, rectF.width(), rectF.height(), false, false);
        ArrayList A0u2 = AnonymousClass000.A0u();
        Iterator it = A0u.iterator();
        while (it.hasNext()) {
            AnonymousClass331 r7 = (AnonymousClass331) it.next();
            PointF pointF = new PointF(f4, f5);
            RectF rectF2 = r7.A02;
            rectF2.sort();
            Matrix A0H = AnonymousClass000.A0H();
            A0H.preConcat(A002);
            A0H.preTranslate(-rectF.left, -rectF.top);
            A0H.preRotate(r7.A00, rectF2.centerX(), rectF2.centerY());
            float f6 = rectF2.left;
            float f7 = rectF2.top;
            float f8 = rectF2.right;
            float f9 = rectF2.bottom;
            float[] fArr = {f6, f7, f8, f7, f8, f9, f6, f9};
            A0H.mapPoints(fArr);
            float f10 = fArr[0];
            float f11 = pointF.x;
            double d2 = (double) (f10 / f11);
            float f12 = fArr[1];
            float f13 = pointF.y;
            A0u2.add(new InteractiveAnnotation(r7.A06, new SerializablePoint[]{new SerializablePoint(d2, (double) (f12 / f13)), new SerializablePoint((double) (fArr[2] / f11), (double) (fArr[3] / f13)), new SerializablePoint((double) (fArr[4] / f11), (double) (fArr[5] / f13)), new SerializablePoint((double) (fArr[6] / f11), (double) (fArr[7] / f13))}, r7.A00, r7.A01));
        }
        return A0u2;
    }

    public void A06(int i2, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        A08(bitmap, canvas, i2, false, false);
        for (C455829l A0I : this.A06) {
            A0I.A0I(canvas);
        }
    }

    public void A07(Bitmap bitmap, int i2, boolean z2, boolean z3) {
        Canvas canvas = new Canvas(bitmap);
        A08(bitmap, canvas, i2, z2, z3);
        for (C455829l A0P : this.A06) {
            A0P.A0P(canvas);
        }
    }

    public void A08(Bitmap bitmap, Canvas canvas, int i2, boolean z2, boolean z3) {
        RectF rectF = this.A04;
        canvas.concat(A00((float) bitmap.getWidth(), (float) bitmap.getHeight(), (float) i2, rectF.width(), rectF.height(), z2, z3));
    }

    public void A09(AnonymousClass322 r5) {
        if (A0B(new String[]{"pen"})) {
            r5.A0A = C13690nt.A0X(r5.A0A);
        }
        if (A0B(new String[]{"arrow", "oval", "thinking-bubble", "speech-bubble-oval", "speech-bubble-rect", "digital-clock", "analog-clock", "location", "sticker", "emoji"})) {
            r5.A0E = C13690nt.A0X(r5.A0E);
        }
        if (A0B(new String[]{"text"})) {
            r5.A0G = C13690nt.A0X(r5.A0G);
        }
        r5.A03 = Boolean.valueOf(A0B(new String[]{"location"}));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0A(java.io.File r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.A04()
            r2 = 0
            if (r0 != 0) goto L_0x0008
            return r2
        L_0x0008:
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ IOException -> 0x001a }
            r1.<init>(r4)     // Catch:{ IOException -> 0x001a }
            r1.write(r0)     // Catch:{ all -> 0x0015 }
            r0 = 1
            r1.close()     // Catch:{ IOException -> 0x001a }
            return r0
        L_0x0015:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0019 }
        L_0x0019:
            throw r0     // Catch:{ IOException -> 0x001a }
        L_0x001a:
            r1 = move-exception
            java.lang.String r0 = "Doodle/save failed to save doodle string to file"
            com.whatsapp.util.Log.e(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62033Bj.A0A(java.io.File):boolean");
    }

    public final boolean A0B(String[] strArr) {
        List<C455829l> list = this.A06;
        if (list != null) {
            for (C455829l A0G : list) {
                if (C43041zF.A03(A0G.A0G(), strArr)) {
                    return true;
                }
            }
        }
        return false;
    }
}
