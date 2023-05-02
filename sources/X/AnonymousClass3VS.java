package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.Layout;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3VS  reason: invalid class name */
public final class AnonymousClass3VS extends C65323Ui {
    public final C90784en A00;

    public AnonymousClass3VS(List list) {
        super("DvbDecoder");
        C90504eH r0 = new C90504eH((byte[]) C13690nt.A0Z(list));
        this.A00 = new C90784en(r0.A0F(), r0.A0F());
    }

    public C109535Sn A07(byte[] bArr, int i2, boolean z2) {
        List unmodifiableList;
        int[] iArr;
        int i3;
        C85394Og r2;
        int i4;
        int i5;
        int i6;
        int i7;
        if (z2) {
            C85334Oa r1 = this.A00.A06;
            r1.A08.clear();
            r1.A06.clear();
            r1.A07.clear();
            r1.A04.clear();
            r1.A05.clear();
            r1.A00 = null;
            r1.A01 = null;
        }
        C90784en r3 = this.A00;
        C90204dh r0 = new C90204dh(bArr, i2);
        while (true) {
            int i8 = r0.A01;
            if (((i8 - r0.A02) << 3) - r0.A00 < 48 || r0.A04(8) != 15) {
                C85334Oa r22 = r3.A06;
                C84054Jb r6 = r22.A01;
            } else {
                C85334Oa r12 = r3.A06;
                int A04 = r0.A04(8);
                int A042 = r0.A04(16);
                int A043 = r0.A04(16);
                C90524eJ.A04(AnonymousClass000.A1P(r0.A00));
                int i9 = r0.A02;
                int i10 = i9 + A043;
                if ((A043 << 3) > ((i8 - i9) << 3) - r0.A00) {
                    Log.w("DvbParser", "Data field length exceeds limit");
                    r0.A08(C90204dh.A00(r0));
                } else {
                    switch (A04) {
                        case 16:
                            if (A042 == r12.A03) {
                                C84054Jb r11 = r12.A01;
                                r0.A04(8);
                                int A044 = r0.A04(4);
                                int A045 = r0.A04(2);
                                r0.A08(2);
                                int i11 = A043 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i11 > 0) {
                                    int A046 = r0.A04(8);
                                    r0.A08(8);
                                    i11 -= 6;
                                    sparseArray.put(A046, new AnonymousClass4GH(r0.A04(16), r0.A04(16)));
                                }
                                C84054Jb r5 = new C84054Jb(sparseArray, A044, A045);
                                if (r5.A00 == 0) {
                                    if (!(r11 == null || r11.A01 == r5.A01)) {
                                        r12.A01 = r5;
                                        break;
                                    }
                                } else {
                                    r12.A01 = r5;
                                    r12.A08.clear();
                                    r12.A06.clear();
                                    r12.A07.clear();
                                    break;
                                }
                            }
                            break;
                        case 17:
                            C84054Jb r4 = r12.A01;
                            if (A042 == r12.A03 && r4 != null) {
                                int A047 = r0.A04(8);
                                r0.A08(4);
                                boolean A0C = r0.A0C();
                                r0.A08(3);
                                int i12 = 16;
                                int A048 = r0.A04(16);
                                int A049 = r0.A04(16);
                                r0.A04(3);
                                int A0410 = r0.A04(3);
                                int i13 = 2;
                                int A01 = C90204dh.A01(r0, 2, 8);
                                int A0411 = r0.A04(8);
                                int A0412 = r0.A04(4);
                                int A0413 = r0.A04(2);
                                r0.A08(2);
                                int i14 = A043 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i14 > 0) {
                                    int A0414 = r0.A04(i12);
                                    int A0415 = r0.A04(i13);
                                    r0.A04(i13);
                                    int A0416 = r0.A04(12);
                                    int A012 = C90204dh.A01(r0, 4, 12);
                                    i14 -= 6;
                                    if (A0415 == 1 || A0415 == 2) {
                                        r0.A04(8);
                                        r0.A04(8);
                                        i14 -= 2;
                                    }
                                    sparseArray2.put(A0414, new AnonymousClass4GI(A0416, A012));
                                    i13 = 2;
                                    i12 = 16;
                                }
                                C85394Og r10 = new C85394Og(sparseArray2, A047, A048, A049, A0410, A01, A0411, A0412, A0413, A0C);
                                if (r4.A00 == 0 && (r2 = (C85394Og) r12.A08.get(r10.A03)) != null) {
                                    SparseArray sparseArray3 = r2.A08;
                                    for (int i15 = 0; i15 < sparseArray3.size(); i15++) {
                                        r10.A08.put(sparseArray3.keyAt(i15), sparseArray3.valueAt(i15));
                                    }
                                }
                                r12.A08.put(r10.A03, r10);
                                break;
                            }
                            break;
                        case 18:
                            if (A042 != r12.A03) {
                                if (A042 == r12.A02) {
                                    AnonymousClass4LV A002 = C90784en.A00(r0, A043);
                                    r12.A04.put(A002.A00, A002);
                                    break;
                                }
                            } else {
                                AnonymousClass4LV A003 = C90784en.A00(r0, A043);
                                r12.A06.put(A003.A00, A003);
                                break;
                            }
                            break;
                        case 19:
                            if (A042 != r12.A03) {
                                if (A042 == r12.A02) {
                                    AnonymousClass4LW A013 = C90784en.A01(r0);
                                    r12.A05.put(A013.A00, A013);
                                    break;
                                }
                            } else {
                                AnonymousClass4LW A014 = C90784en.A01(r0);
                                r12.A07.put(A014.A00, A014);
                                break;
                            }
                            break;
                        case 20:
                            if (A042 == r12.A03) {
                                r0.A08(4);
                                boolean A0C2 = r0.A0C();
                                r0.A08(3);
                                int A0417 = r0.A04(16);
                                int A0418 = r0.A04(16);
                                if (A0C2) {
                                    i6 = r0.A04(16);
                                    i4 = r0.A04(16);
                                    i7 = r0.A04(16);
                                    i5 = r0.A04(16);
                                } else {
                                    i4 = A0417;
                                    i5 = A0418;
                                    i6 = 0;
                                    i7 = 0;
                                }
                                r12.A00 = new C85124Nf(A0417, A0418, i6, i4, i7, i5);
                                break;
                            }
                            break;
                    }
                    C90524eJ.A04(AnonymousClass000.A1P(r0.A00));
                    r0.A09(i10 - r0.A02);
                }
            }
        }
        C85334Oa r222 = r3.A06;
        C84054Jb r62 = r222.A01;
        if (r62 == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            C85124Nf r13 = r222.A00;
            if (r13 == null) {
                r13 = r3.A05;
            }
            Bitmap bitmap = r3.A00;
            if (!(bitmap != null && r13.A05 + 1 == bitmap.getWidth() && r13.A00 + 1 == r3.A00.getHeight())) {
                Bitmap createBitmap = Bitmap.createBitmap(r13.A05 + 1, r13.A00 + 1, Bitmap.Config.ARGB_8888);
                r3.A00 = createBitmap;
                r3.A01.setBitmap(createBitmap);
            }
            ArrayList A0u = AnonymousClass000.A0u();
            SparseArray sparseArray4 = r62.A02;
            for (int i16 = 0; i16 < sparseArray4.size(); i16++) {
                Canvas canvas = r3.A01;
                canvas.save();
                SparseArray sparseArray5 = sparseArray4;
                AnonymousClass4GH r63 = (AnonymousClass4GH) sparseArray5.valueAt(i16);
                C85394Og r122 = (C85394Og) r222.A08.get(sparseArray5.keyAt(i16));
                int i17 = r63.A00 + r13.A02;
                int i18 = r63.A01 + r13.A04;
                canvas.clipRect(i17, i18, Math.min(r122.A07 + i17, r13.A01), Math.min(r122.A02 + i18, r13.A03));
                AnonymousClass4LV r132 = (AnonymousClass4LV) r222.A06.get(r122.A00);
                if (r132 == null && (r132 = (AnonymousClass4LV) r222.A04.get(r122.A00)) == null) {
                    r132 = r3.A04;
                }
                SparseArray sparseArray6 = r122.A08;
                for (int i19 = 0; i19 < sparseArray6.size(); i19++) {
                    int keyAt = sparseArray6.keyAt(i19);
                    AnonymousClass4GI r52 = (AnonymousClass4GI) sparseArray6.valueAt(i19);
                    AnonymousClass4LW r14 = (AnonymousClass4LW) r222.A07.get(keyAt);
                    if (r14 != null || (r14 = (AnonymousClass4LW) r222.A05.get(keyAt)) != null) {
                        Paint paint = r14.A01 ? null : r3.A02;
                        int i20 = r122.A01;
                        int i21 = r52.A00 + i17;
                        int i22 = i18 + r52.A01;
                        Canvas canvas2 = canvas;
                        Paint paint2 = paint;
                        int[] iArr2 = i20 == 3 ? r132.A03 : i20 == 2 ? r132.A02 : r132.A01;
                        int i23 = i20;
                        int i24 = i21;
                        C90784en.A02(canvas2, paint2, r14.A03, iArr2, i23, i24, i22);
                        C90784en.A02(canvas2, paint2, r14.A02, iArr2, i23, i24, i22 + 1);
                    }
                }
                if (r122.A09) {
                    int i25 = r122.A01;
                    if (i25 == 3) {
                        iArr = r132.A03;
                        i3 = r122.A06;
                    } else if (i25 == 2) {
                        iArr = r132.A02;
                        i3 = r122.A05;
                    } else {
                        iArr = r132.A01;
                        i3 = r122.A04;
                    }
                    int i26 = iArr[i3];
                    Paint paint3 = r3.A03;
                    paint3.setColor(i26);
                    canvas.drawRect((float) i17, (float) i18, (float) (r122.A07 + i17), (float) (r122.A02 + i18), paint3);
                }
                Bitmap bitmap2 = r3.A00;
                int i27 = r122.A07;
                int i28 = r122.A02;
                Bitmap createBitmap2 = Bitmap.createBitmap(bitmap2, i17, i18, i27, i28);
                float f2 = (float) r13.A05;
                float f3 = (float) r13.A00;
                A0u.add(new C88444aV(createBitmap2, (Layout.Alignment) null, (CharSequence) null, ((float) i18) / f3, ((float) i17) / f2, -3.4028235E38f, ((float) i27) / f2, ((float) i28) / f3, 0.0f, 0, 0, 0, Integer.MIN_VALUE, -16777216, Integer.MIN_VALUE, false));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
            }
            unmodifiableList = Collections.unmodifiableList(A0u);
        }
        return new C97444q0(unmodifiableList);
    }
}
