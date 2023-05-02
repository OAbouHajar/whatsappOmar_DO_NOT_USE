package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.v4.view.MotionEventCompat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0dQ  reason: invalid class name and case insensitive filesystem */
public class C08310dQ implements C13520mW, C12650kk, C13160lZ, C13530mX {
    public Paint A00;
    public RectF A01;
    public AnonymousClass0S6 A02;
    public List A03;
    public final Matrix A04;
    public final Path A05;
    public final RectF A06;
    public final AnonymousClass0Ak A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;

    public C08310dQ(AnonymousClass0Ak r5, C08450df r6, C08360dV r7, String str, List list, boolean z2) {
        this.A00 = new AnonymousClass0AR();
        this.A01 = AnonymousClass000.A0K();
        this.A04 = AnonymousClass000.A0H();
        this.A05 = AnonymousClass000.A0I();
        this.A06 = AnonymousClass000.A0K();
        this.A08 = str;
        this.A07 = r5;
        this.A0A = z2;
        this.A09 = list;
        if (r6 != null) {
            AnonymousClass0S6 r0 = new AnonymousClass0S6(r6);
            this.A02 = r0;
            r0.A03(r7);
            this.A02.A02(this);
        }
        ArrayList A0u = AnonymousClass000.A0u();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            Object obj = list.get(size);
            if (obj instanceof C12640kj) {
                A0u.add(obj);
            }
        }
        int size2 = A0u.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                ((C12640kj) A0u.get(size2)).A4J(list.listIterator(list.size()));
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C08310dQ(X.AnonymousClass0Ak r10, X.C08500dk r11, X.C08360dV r12) {
        /*
            r9 = this;
            java.lang.String r6 = r11.A00
            boolean r8 = r11.A02
            java.util.List r2 = r11.A01
            java.util.ArrayList r7 = X.AnonymousClass000.A0w(r2)
            r1 = 0
        L_0x000b:
            int r0 = r2.size()
            r3 = r10
            r5 = r12
            if (r1 >= r0) goto L_0x0025
            java.lang.Object r0 = r2.get(r1)
            X.0kl r0 = (X.C12660kl) r0
            X.0lY r0 = r0.Agn(r10, r12)
            if (r0 == 0) goto L_0x0022
            r7.add(r0)
        L_0x0022:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x0025:
            r1 = 0
        L_0x0026:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x0040
            java.lang.Object r4 = r2.get(r1)
            X.0kl r4 = (X.C12660kl) r4
            boolean r0 = r4 instanceof X.C08450df
            if (r0 == 0) goto L_0x003d
            X.0df r4 = (X.C08450df) r4
        L_0x0038:
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        L_0x003d:
            int r1 = r1 + 1
            goto L_0x0026
        L_0x0040:
            r4 = 0
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08310dQ.<init>(X.0Ak, X.0dk, X.0dV):void");
    }

    public List A00() {
        if (this.A03 == null) {
            this.A03 = AnonymousClass000.A0u();
            int i2 = 0;
            while (true) {
                List list = this.A09;
                if (i2 >= list.size()) {
                    break;
                }
                Object obj = list.get(i2);
                if (obj instanceof C13520mW) {
                    this.A03.add(obj);
                }
                i2++;
            }
        }
        return this.A03;
    }

    public void A4l(AnonymousClass0UV r2, Object obj) {
        AnonymousClass0S6 r0 = this.A02;
        if (r0 != null) {
            r0.A04(r2, obj);
        }
    }

    public void A8F(Canvas canvas, Matrix matrix, int i2) {
        boolean z2;
        if (!this.A0A) {
            Matrix matrix2 = this.A04;
            matrix2.set(matrix);
            AnonymousClass0S6 r1 = this.A02;
            if (r1 != null) {
                matrix2.preConcat(r1.A00());
                AnonymousClass0SI r0 = r1.A02;
                i2 = (int) ((((((float) (r0 == null ? 100 : AnonymousClass000.A0D(r0.A08()))) / 100.0f) * ((float) i2)) / 255.0f) * 255.0f);
            }
            if (this.A07.A0C) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    List list = this.A09;
                    if (i3 >= list.size()) {
                        break;
                    } else if (!(list.get(i3) instanceof C13530mX) || (i4 = i4 + 1) < 2) {
                        i3++;
                    } else if (i2 != 255) {
                        z2 = true;
                        RectF rectF = this.A01;
                        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                        AAB(matrix2, rectF, true);
                        Paint paint = this.A00;
                        paint.setAlpha(i2);
                        AnonymousClass0XD.A03(canvas, paint, rectF, 31);
                        i2 = MotionEventCompat.ACTION_MASK;
                    }
                }
            }
            z2 = false;
            List list2 = this.A09;
            for (int size = list2.size() - 1; size >= 0; size--) {
                Object obj = list2.get(size);
                if (obj instanceof C13530mX) {
                    ((C13530mX) obj).A8F(canvas, matrix2, i2);
                }
            }
            if (z2) {
                canvas.restore();
            }
        }
    }

    public void AAB(Matrix matrix, RectF rectF, boolean z2) {
        Matrix matrix2 = this.A04;
        matrix2.set(matrix);
        AnonymousClass0S6 r0 = this.A02;
        if (r0 != null) {
            matrix2.preConcat(r0.A00());
        }
        RectF rectF2 = this.A06;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List list = this.A09;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C13150lY r1 = (C13150lY) list.get(size);
                if (r1 instanceof C13530mX) {
                    ((C13530mX) r1).AAB(matrix2, rectF2, z2);
                    rectF.union(rectF2);
                }
            } else {
                return;
            }
        }
    }

    public Path AEK() {
        Matrix matrix = this.A04;
        matrix.reset();
        AnonymousClass0S6 r0 = this.A02;
        if (r0 != null) {
            matrix.set(r0.A00());
        }
        Path path = this.A05;
        path.reset();
        if (!this.A0A) {
            List list = this.A09;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C13150lY r1 = (C13150lY) list.get(size);
                if (r1 instanceof C13520mW) {
                    path.addPath(((C13520mW) r1).AEK(), matrix);
                }
            }
        }
        return path;
    }

    public void AZV() {
        this.A07.invalidateSelf();
    }

    public void AcW(AnonymousClass0WM r4, AnonymousClass0WM r5, List list, int i2) {
        String str = this.A08;
        if (r4.A02(str, i2) || "__container".equals(str)) {
            if (!"__container".equals(str)) {
                AnonymousClass0WM r1 = new AnonymousClass0WM(r5);
                r1.A01.add(str);
                r5 = r1;
                if (r4.A01(str, i2)) {
                    AnonymousClass0WM r0 = new AnonymousClass0WM(r1);
                    r0.A00 = this;
                    list.add(r0);
                }
            }
            if (r4.A03(str, i2)) {
                int A002 = i2 + r4.A00(str, i2);
                int i3 = 0;
                while (true) {
                    List list2 = this.A09;
                    if (i3 < list2.size()) {
                        C13150lY r12 = (C13150lY) list2.get(i3);
                        if (r12 instanceof C13160lZ) {
                            ((C13160lZ) r12).AcW(r4, r5, list, A002);
                        }
                        i3++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void Adk(List list, List list2) {
        int size = list.size();
        List list3 = this.A09;
        ArrayList arrayList = new ArrayList(size + list3.size());
        arrayList.addAll(list);
        int size2 = list3.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                C13150lY r1 = (C13150lY) list3.get(size2);
                r1.Adk(arrayList, list3.subList(0, size2));
                arrayList.add(r1);
            } else {
                return;
            }
        }
    }

    public String getName() {
        return this.A08;
    }
}
