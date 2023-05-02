package X;

import android.view.View;

/* renamed from: X.3EX  reason: invalid class name */
public class AnonymousClass3EX implements AnonymousClass5OM {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public View A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;

    public boolean AdZ(C14990q7 r6, Object obj, int i2) {
        if (i2 == 35) {
            float A042 = AnonymousClass000.A04(obj);
            this.A04 = A042;
            View view = this.A08;
            if (view != null) {
                view.setScaleX(A042);
                return true;
            }
        } else if (i2 == 36) {
            float A043 = AnonymousClass000.A04(obj);
            this.A05 = A043;
            View view2 = this.A08;
            if (view2 != null) {
                view2.setScaleY(A043);
                return true;
            }
        } else if (i2 == 38) {
            try {
                String str = (String) obj;
                this.A06 = str == null ? 0.0f : C62163Bx.A01(str);
                this.A0C = str.endsWith("%");
            } catch (AnonymousClass40K e2) {
                C29691b2.A01("ViewTransformsExtensionBinderUtils", "Could not parse translation_x value. ", e2);
            }
            View view3 = this.A08;
            if (view3 != null) {
                float width = (float) view3.getWidth();
                float f2 = this.A06;
                if (this.A0C) {
                    f2 = (f2 * width) / 100.0f;
                }
                view3.setTranslationX(f2);
                return true;
            }
        } else if (i2 == 138) {
            float A044 = AnonymousClass000.A04(obj);
            this.A03 = A044;
            View view4 = this.A08;
            if (view4 != null) {
                view4.setRotation(A044);
                return true;
            }
        } else if (i2 != 141) {
            switch (i2) {
                case 40:
                    try {
                        String str2 = (String) obj;
                        this.A07 = str2 == null ? 0.0f : C62163Bx.A01(str2);
                        this.A0D = str2.endsWith("%");
                    } catch (AnonymousClass40K e3) {
                        C29691b2.A01("ViewTransformsExtensionBinderUtils", "Could not parse translation_y value. ", e3);
                    }
                    View view5 = this.A08;
                    if (view5 != null) {
                        float height = (float) view5.getHeight();
                        float f3 = this.A07;
                        if (this.A0D) {
                            f3 = (f3 * height) / 100.0f;
                        }
                        view5.setTranslationY(f3);
                        break;
                    }
                    break;
                case 41:
                    try {
                        String str3 = (String) obj;
                        this.A01 = C62163Bx.A01(str3);
                        this.A0A = str3.endsWith("%");
                        this.A09 = true;
                    } catch (AnonymousClass40K e4) {
                        C29691b2.A01("ViewTransformsExtensionBinderUtils", "Could not parse pivot_x value. ", e4);
                    }
                    View view6 = this.A08;
                    if (view6 != null) {
                        float width2 = (float) view6.getWidth();
                        float f4 = this.A01;
                        if (this.A0A) {
                            f4 = (f4 * width2) / 100.0f;
                        }
                        view6.setPivotX(f4);
                        return true;
                    }
                    break;
                case 42:
                    try {
                        String str4 = (String) obj;
                        this.A02 = C62163Bx.A01(str4);
                        this.A0B = str4.endsWith("%");
                        this.A09 = true;
                    } catch (AnonymousClass40K e5) {
                        C29691b2.A01("ViewTransformsExtensionBinderUtils", "Could not parse pivot_y value. ", e5);
                    }
                    View view7 = this.A08;
                    if (view7 != null) {
                        float height2 = (float) view7.getHeight();
                        float f5 = this.A02;
                        if (this.A0B) {
                            f5 = (f5 * height2) / 100.0f;
                        }
                        view7.setPivotY(f5);
                        return true;
                    }
                    break;
                default:
                    return false;
            }
        } else {
            float A045 = AnonymousClass000.A04(obj);
            this.A00 = A045;
            View view8 = this.A08;
            if (view8 != null) {
                view8.setAlpha(A045);
                return true;
            }
        }
        return true;
    }
}
