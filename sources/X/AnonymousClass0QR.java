package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.0QR  reason: invalid class name */
public final class AnonymousClass0QR {
    public Rect A00;
    public final Bitmap A01;
    public final List A02;
    public final List A03;

    public AnonymousClass0QR(Bitmap bitmap) {
        ArrayList A0u = AnonymousClass000.A0u();
        this.A03 = A0u;
        ArrayList A0u2 = AnonymousClass000.A0u();
        this.A02 = A0u2;
        if (!bitmap.isRecycled()) {
            A0u2.add(AnonymousClass0UB.A05);
            this.A01 = bitmap;
            A0u.add(AnonymousClass0U5.A06);
            A0u.add(AnonymousClass0U5.A08);
            A0u.add(AnonymousClass0U5.A04);
            A0u.add(AnonymousClass0U5.A05);
            A0u.add(AnonymousClass0U5.A07);
            A0u.add(AnonymousClass0U5.A03);
            return;
        }
        throw AnonymousClass000.A0T("Bitmap is not valid");
    }

    public AnonymousClass0UB A00() {
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            Bitmap bitmap2 = bitmap;
            int width = bitmap.getWidth() * bitmap.getHeight();
            if (width > 12544) {
                double sqrt = Math.sqrt(((double) 12544) / ((double) width));
                if (sqrt > 0.0d) {
                    bitmap2 = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * sqrt), (int) Math.ceil(((double) bitmap.getHeight()) * sqrt), false);
                }
            }
            Rect rect = this.A00;
            if (!(bitmap2 == bitmap || rect == null)) {
                double width2 = ((double) bitmap2.getWidth()) / ((double) bitmap.getWidth());
                rect.left = (int) Math.floor(((double) rect.left) * width2);
                rect.top = (int) Math.floor(((double) rect.top) * width2);
                rect.right = Math.min((int) Math.ceil(((double) rect.right) * width2), bitmap2.getWidth());
                rect.bottom = Math.min((int) Math.ceil(((double) rect.bottom) * width2), bitmap2.getHeight());
            }
            int width3 = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            int[] iArr = new int[(width3 * height)];
            bitmap2.getPixels(iArr, 0, width3, 0, 0, width3, height);
            Rect rect2 = this.A00;
            if (rect2 != null) {
                int width4 = rect2.width();
                int height2 = this.A00.height();
                int[] iArr2 = new int[(width4 * height2)];
                for (int i2 = 0; i2 < height2; i2++) {
                    Rect rect3 = this.A00;
                    System.arraycopy(iArr, ((rect3.top + i2) * width3) + rect3.left, iArr2, i2 * width4, width4);
                }
                iArr = iArr2;
            }
            List list = this.A02;
            AnonymousClass0W9 r1 = new AnonymousClass0W9(iArr, list.isEmpty() ? null : (C11930jZ[]) list.toArray(new C11930jZ[list.size()]));
            if (bitmap2 != bitmap) {
                bitmap2.recycle();
            }
            AnonymousClass0UB r8 = new AnonymousClass0UB(r1.A00, this.A03);
            List list2 = r8.A03;
            int size = list2.size();
            for (int i3 = 0; i3 < size; i3++) {
                AnonymousClass0U5 r5 = (AnonymousClass0U5) list2.get(i3);
                float[] fArr = r5.A02;
                float f2 = 0.0f;
                for (float f3 : fArr) {
                    if (f3 > 0.0f) {
                        f2 += f3;
                    }
                }
                if (f2 != 0.0f) {
                    for (int i4 = 0; i4 < r10; i4++) {
                        if (fArr[i4] > 0.0f) {
                            fArr[i4] = fArr[i4] / f2;
                        }
                    }
                }
                Map map = r8.A04;
                List list3 = r8.A02;
                int size2 = list3.size();
                float f4 = 0.0f;
                AnonymousClass0S5 r3 = null;
                for (int i5 = 0; i5 < size2; i5++) {
                    AnonymousClass0S5 r2 = (AnonymousClass0S5) list3.get(i5);
                    float[] A012 = r2.A01();
                    int i6 = 1;
                    float f5 = A012[1];
                    float[] fArr2 = r5.A01;
                    if (f5 >= fArr2[0] && f5 <= fArr2[2]) {
                        float f6 = A012[2];
                        float[] fArr3 = r5.A00;
                        if (f6 >= fArr3[0] && f6 <= fArr3[2] && !r8.A00.get(r2.A08)) {
                            float[] A013 = r2.A01();
                            AnonymousClass0S5 r0 = r8.A01;
                            if (r0 != null) {
                                i6 = r0.A06;
                            }
                            float[] fArr4 = r5.A02;
                            float f7 = fArr4[0];
                            float f8 = 0.0f;
                            float abs = f7 > 0.0f ? f7 * (1.0f - Math.abs(A013[1] - fArr2[1])) : 0.0f;
                            float f9 = fArr4[1];
                            float abs2 = f9 > 0.0f ? f9 * (1.0f - Math.abs(A013[2] - fArr3[1])) : 0.0f;
                            float f10 = fArr4[2];
                            if (f10 > 0.0f) {
                                f8 = f10 * (((float) r2.A06) / ((float) i6));
                            }
                            float f11 = abs + abs2 + f8;
                            if (r3 == null || f11 > f4) {
                                r3 = r2;
                                f4 = f11;
                            }
                        }
                    }
                }
                if (r3 != null) {
                    r8.A00.append(r3.A08, true);
                }
                map.put(r5, r3);
            }
            r8.A00.clear();
            return r8;
        }
        throw new AssertionError();
    }

    public void A01(int i2, int i3, int i4, int i5) {
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            Rect rect = this.A00;
            if (rect == null) {
                rect = AnonymousClass000.A0J();
                this.A00 = rect;
            }
            rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            if (!this.A00.intersect(i2, i3, i4, i5)) {
                throw AnonymousClass000.A0T("The given region must intersect with the Bitmap's dimensions.");
            }
        }
    }
}
