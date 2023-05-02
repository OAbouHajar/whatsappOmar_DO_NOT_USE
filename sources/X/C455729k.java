package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.29k  reason: invalid class name and case insensitive filesystem */
public class C455729k {
    public AnonymousClass4MV A00;
    public C455829l A01;
    public C455829l A02;
    public final AnonymousClass393 A03 = new AnonymousClass393();
    public final List A04;
    public final List A05;

    public C455729k() {
        ArrayList arrayList = new ArrayList();
        this.A04 = arrayList;
        this.A05 = Collections.unmodifiableList(arrayList);
    }

    public C455829l A00(PointF pointF) {
        List list = this.A04;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return null;
            }
            C455829l r4 = (C455829l) list.get(size);
            if (!(r4 instanceof AnonymousClass32x)) {
                float f2 = pointF.x;
                float f3 = pointF.y;
                if (r4 instanceof AnonymousClass32v) {
                    RectF rectF = r4.A02;
                    if (rectF.contains(f2, f3)) {
                        float centerX = f2 - rectF.centerX();
                        float centerY = f3 - rectF.centerY();
                        float width = rectF.width() / 2.0f;
                        float height = rectF.height() / 2.0f;
                        if (((centerX * centerX) / (width * width)) + ((centerY * centerY) / (height * height)) <= 1.0f) {
                            return r4;
                        }
                    } else {
                        continue;
                    }
                } else {
                    boolean z2 = r4 instanceof C605332s;
                    float f4 = -r4.A00;
                    if (z2) {
                        RectF rectF2 = r4.A02;
                        float centerX2 = rectF2.centerX();
                        float centerY2 = rectF2.centerY();
                        Matrix matrix = new Matrix();
                        float[] fArr = {f2, f3};
                        matrix.setRotate(f4, centerX2, centerY2);
                        matrix.mapPoints(fArr);
                        float f5 = fArr[0];
                        float f6 = fArr[1];
                        if (rectF2.contains(f5, f6)) {
                            float f7 = rectF2.left;
                            float f8 = rectF2.bottom;
                            float f9 = rectF2.right;
                            float f10 = rectF2.top;
                            float f11 = f10 - f8;
                            float f12 = f9 - f7;
                            if (((double) Math.abs((((f5 * f11) - (f6 * f12)) + (f9 * f8)) - (f10 * f7))) / Math.sqrt((double) ((f11 * f11) + (f12 * f12))) < ((double) C455829l.A06)) {
                                return r4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        RectF rectF3 = r4.A02;
                        float centerX3 = rectF3.centerX();
                        float centerY3 = rectF3.centerY();
                        Matrix matrix2 = new Matrix();
                        float[] fArr2 = {f2, f3};
                        matrix2.setRotate(f4, centerX3, centerY3);
                        matrix2.mapPoints(fArr2);
                        if (rectF3.contains(fArr2[0], fArr2[1])) {
                            return r4;
                        }
                    }
                }
            }
        }
    }

    public List A01() {
        ArrayList arrayList = new ArrayList();
        for (Object next : this.A04) {
            if (next instanceof AnonymousClass32x) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public void A02() {
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A04.clear();
        this.A03.A00.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045 A[LOOP:1: B:15:0x003f->B:17:0x0045, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e A[EDGE_INSN: B:28:0x005e->B:22:0x005e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C455829l r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X.AnonymousClass32x
            if (r0 == 0) goto L_0x0063
            java.util.List r3 = r4.A04
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0063
            r0 = r5
            X.32x r0 = (X.AnonymousClass32x) r0
            X.3Ag r0 = r0.A03
            boolean r0 = r0 instanceof X.AnonymousClass333
            java.util.Iterator r2 = r3.iterator()
            if (r0 == 0) goto L_0x004f
        L_0x0019:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r1 = r2.next()
            X.29l r1 = (X.C455829l) r1
            boolean r0 = r1 instanceof X.AnonymousClass32x
            if (r0 == 0) goto L_0x0032
            r0 = r1
            X.32x r0 = (X.AnonymousClass32x) r0
            X.3Ag r0 = r0.A03
            boolean r0 = r0 instanceof X.AnonymousClass333
            if (r0 != 0) goto L_0x0019
        L_0x0032:
            int r0 = r3.indexOf(r1)
        L_0x0036:
            r3.add(r0, r5)
        L_0x0039:
            r4.A01 = r5
            java.util.Iterator r1 = r3.iterator()
        L_0x003f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0069
            java.lang.Object r0 = r1.next()
            X.29l r0 = (X.C455829l) r0
            r0.A05()
            goto L_0x003f
        L_0x004f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.AnonymousClass32x
            if (r0 != 0) goto L_0x004f
            goto L_0x0032
        L_0x005e:
            int r0 = r3.size()
            goto L_0x0036
        L_0x0063:
            java.util.List r3 = r4.A04
            r3.add(r5)
            goto L_0x0039
        L_0x0069:
            X.3ur r1 = new X.3ur
            r1.<init>(r5)
            X.393 r0 = r4.A03
            java.util.LinkedList r0 = r0.A00
            r0.add(r1)
            r0 = 0
            r4.A02 = r0
            r4.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C455729k.A03(X.29l):void");
    }

    public void A04(C455829l r5) {
        List list = this.A04;
        int indexOf = list.indexOf(r5);
        if (indexOf != -1) {
            this.A03.A00.add(new C76913ut(r5, indexOf));
            list.remove(r5);
            if (r5 == this.A01) {
                this.A01 = null;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        r2.A02(r1);
        r1 = r1.getInt("shape_index");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r1 < 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007b, code lost:
        if (r1 >= r5.size()) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        r2.A00 = (X.C455829l) r5.get(r1);
        r4.add(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(java.lang.String r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x0091
            X.393 r2 = r7.A03     // Catch:{ JSONException -> 0x008b }
            java.util.List r5 = r7.A04     // Catch:{ JSONException -> 0x008b }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x008b }
            r1.<init>(r8)     // Catch:{ JSONException -> 0x008b }
            java.lang.String r0 = "actions"
            org.json.JSONArray r6 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x008b }
            java.util.LinkedList r4 = r2.A00     // Catch:{ JSONException -> 0x008b }
            r4.clear()     // Catch:{ JSONException -> 0x008b }
            r3 = 0
        L_0x0017:
            int r0 = r6.length()     // Catch:{ JSONException -> 0x008b }
            if (r3 >= r0) goto L_0x0091
            org.json.JSONObject r1 = r6.getJSONObject(r3)     // Catch:{ JSONException -> 0x008b }
            java.lang.String r0 = "type"
            java.lang.String r2 = r1.getString(r0)     // Catch:{ JSONException -> 0x008b }
            int r0 = r2.hashCode()     // Catch:{ JSONException -> 0x008b }
            switch(r0) {
                case 49116392: goto L_0x0030;
                case 1021915016: goto L_0x003f;
                case 1953129077: goto L_0x004e;
                case 1971936087: goto L_0x005d;
                default: goto L_0x002f;
            }     // Catch:{ JSONException -> 0x008b }
        L_0x002f:
            goto L_0x0088
        L_0x0030:
            java.lang.String r0 = "undo_add_shape"
            boolean r0 = r2.equals(r0)     // Catch:{ JSONException -> 0x008b }
            if (r0 == 0) goto L_0x0088
            X.3ur r2 = new X.3ur     // Catch:{ JSONException -> 0x008b }
            r2.<init>()     // Catch:{ JSONException -> 0x008b }
            goto L_0x006b
        L_0x003f:
            java.lang.String r0 = "undo_delete_shape"
            boolean r0 = r2.equals(r0)     // Catch:{ JSONException -> 0x008b }
            if (r0 == 0) goto L_0x0088
            X.3ut r2 = new X.3ut     // Catch:{ JSONException -> 0x008b }
            r2.<init>()     // Catch:{ JSONException -> 0x008b }
            goto L_0x006b
        L_0x004e:
            java.lang.String r0 = "undo_change_z_order"
            boolean r0 = r2.equals(r0)     // Catch:{ JSONException -> 0x008b }
            if (r0 == 0) goto L_0x0088
            X.3us r2 = new X.3us     // Catch:{ JSONException -> 0x008b }
            r2.<init>()     // Catch:{ JSONException -> 0x008b }
            goto L_0x006b
        L_0x005d:
            java.lang.String r0 = "undo_modify_shape"
            boolean r0 = r2.equals(r0)     // Catch:{ JSONException -> 0x008b }
            if (r0 == 0) goto L_0x0088
            X.332 r2 = new X.332     // Catch:{ JSONException -> 0x008b }
            r2.<init>()     // Catch:{ JSONException -> 0x008b }
        L_0x006b:
            r2.A02(r1)     // Catch:{ JSONException -> 0x008b }
            java.lang.String r0 = "shape_index"
            int r1 = r1.getInt(r0)     // Catch:{ JSONException -> 0x008b }
            if (r1 < 0) goto L_0x0088
            int r0 = r5.size()     // Catch:{ JSONException -> 0x008b }
            if (r1 >= r0) goto L_0x0088
            java.lang.Object r0 = r5.get(r1)     // Catch:{ JSONException -> 0x008b }
            X.29l r0 = (X.C455829l) r0     // Catch:{ JSONException -> 0x008b }
            r2.A00 = r0     // Catch:{ JSONException -> 0x008b }
            r4.add(r2)     // Catch:{ JSONException -> 0x008b }
        L_0x0088:
            int r3 = r3 + 1
            goto L_0x0017
        L_0x008b:
            r1 = move-exception
            java.lang.String r0 = "ShapeRepository/loadUndoState"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C455729k.A05(java.lang.String):void");
    }

    public boolean A06() {
        for (C455829l A0B : this.A04) {
            if (A0B.A0B()) {
                return true;
            }
        }
        return false;
    }
}
