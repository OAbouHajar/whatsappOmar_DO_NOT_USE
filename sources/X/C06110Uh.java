package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.youbasha.ui.activity.CallsPrivacy;

/* renamed from: X.0Uh  reason: invalid class name and case insensitive filesystem */
public class C06110Uh {
    public static SparseIntArray A10;
    public float A00 = 0.0f;
    public float A01 = -1.0f;
    public float A02 = 1.0f;
    public float A03 = 0.5f;
    public float A04 = -1.0f;
    public float A05 = 0.5f;
    public float A06 = -1.0f;
    public float A07 = 1.0f;
    public int A08 = -1;
    public int A09 = -1;
    public int A0A = -1;
    public int A0B = -1;
    public int A0C = -1;
    public int A0D = 0;
    public int A0E = -1;
    public int A0F = -1;
    public int A0G = -1;
    public int A0H = -1;
    public int A0I = -1;
    public int A0J = -1;
    public int A0K = -1;
    public int A0L = -1;
    public int A0M = -1;
    public int A0N = -1;
    public int A0O = -1;
    public int A0P = -1;
    public int A0Q = -1;
    public int A0R = 0;
    public int A0S = -1;
    public int A0T = -1;
    public int A0U = 0;
    public int A0V = -1;
    public int A0W = -1;
    public int A0X = -1;
    public int A0Y = -1;
    public int A0Z = 0;
    public int A0a;
    public int A0b = -1;
    public int A0c;
    public int A0d = -1;
    public int A0e = -1;
    public int A0f = -1;
    public int A0g = -1;
    public int A0h = -1;
    public int A0i = -1;
    public int A0j = -1;
    public int A0k = -1;
    public int A0l = -1;
    public int A0m = -1;
    public int A0n = 0;
    public int A0o = 0;
    public int A0p = -1;
    public int A0q = -1;
    public String A0r = null;
    public String A0s;
    public String A0t;
    public boolean A0u = false;
    public boolean A0v = false;
    public boolean A0w = false;
    public boolean A0x = true;
    public boolean A0y = false;
    public int[] A0z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A10 = sparseIntArray;
        A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(sparseIntArray, 38, 24), 39, 25), 41, 28), 42, 29), 47, 35), 46, 34), 20, 4), 19, 3), 17, 1), 55, 6), 56, 7), 27, 17), 28, 18), 29, 19), 0, 26), 43, 31), 44, 32), 26, 10), 25, 9), 59, 13), 62, 16), 60, 14), 57, 11), 61, 15), 58, 12), 50, 38), 36, 37), 35, 39), 49, 40), 34, 20), 48, 36), 24, 5), 37, 76), 45, 76), 40, 76), 18, 76), 16, 76), 3, 23), 5, 27), 7, 30).append(8, 8);
        A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A00(A10, 4, 33), 6, 2), 1, 22), 2, 21), 21, 61), 23, 62), 22, 63), 54, 69), 33, 70), 12, 71), 10, 72), 11, 73), 13, 74).append(9, 75);
    }

    public static SparseIntArray A00(SparseIntArray sparseIntArray, int i2, int i3) {
        sparseIntArray.append(i2, i3);
        return A10;
    }

    public void A01(Context context, AttributeSet attributeSet) {
        StringBuilder A0o2;
        String str;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0NK.A03);
        this.A0w = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            SparseIntArray sparseIntArray = A10;
            int i3 = sparseIntArray.get(index);
            if (i3 == 80) {
                this.A0v = obtainStyledAttributes.getBoolean(index, this.A0v);
            } else if (i3 != 81) {
                switch (i3) {
                    case 1:
                        this.A08 = C06500Wj.A00(obtainStyledAttributes, index, this.A08);
                        break;
                    case 2:
                        this.A09 = obtainStyledAttributes.getDimensionPixelSize(index, this.A09);
                        break;
                    case 3:
                        this.A0A = C06500Wj.A00(obtainStyledAttributes, index, this.A0A);
                        break;
                    case 4:
                        this.A0B = C06500Wj.A00(obtainStyledAttributes, index, this.A0B);
                        break;
                    case 5:
                        this.A0r = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.A0E = obtainStyledAttributes.getDimensionPixelOffset(index, this.A0E);
                        break;
                    case 7:
                        this.A0F = obtainStyledAttributes.getDimensionPixelOffset(index, this.A0F);
                        break;
                    case 8:
                        if (Build.VERSION.SDK_INT < 17) {
                            break;
                        } else {
                            this.A0G = obtainStyledAttributes.getDimensionPixelSize(index, this.A0G);
                            break;
                        }
                    case 9:
                        this.A0H = C06500Wj.A00(obtainStyledAttributes, index, this.A0H);
                        break;
                    case 10:
                        this.A0I = C06500Wj.A00(obtainStyledAttributes, index, this.A0I);
                        break;
                    case 11:
                        this.A0J = obtainStyledAttributes.getDimensionPixelSize(index, this.A0J);
                        break;
                    case 12:
                        this.A0K = obtainStyledAttributes.getDimensionPixelSize(index, this.A0K);
                        break;
                    case 13:
                        this.A0L = obtainStyledAttributes.getDimensionPixelSize(index, this.A0L);
                        break;
                    case 14:
                        this.A0M = obtainStyledAttributes.getDimensionPixelSize(index, this.A0M);
                        break;
                    case 15:
                        this.A0N = obtainStyledAttributes.getDimensionPixelSize(index, this.A0N);
                        break;
                    case 16:
                        this.A0O = obtainStyledAttributes.getDimensionPixelSize(index, this.A0O);
                        break;
                    case 17:
                        this.A0P = obtainStyledAttributes.getDimensionPixelOffset(index, this.A0P);
                        break;
                    case 18:
                        this.A0Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.A0Q);
                        break;
                    case 19:
                        this.A01 = obtainStyledAttributes.getFloat(index, this.A01);
                        break;
                    case 20:
                        this.A03 = obtainStyledAttributes.getFloat(index, this.A03);
                        break;
                    case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                        this.A0a = obtainStyledAttributes.getLayoutDimension(index, this.A0a);
                        break;
                    case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                        this.A0c = obtainStyledAttributes.getLayoutDimension(index, this.A0c);
                        break;
                    case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                        this.A0V = obtainStyledAttributes.getDimensionPixelSize(index, this.A0V);
                        break;
                    case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                        this.A0W = C06500Wj.A00(obtainStyledAttributes, index, this.A0W);
                        break;
                    case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                        this.A0X = C06500Wj.A00(obtainStyledAttributes, index, this.A0X);
                        break;
                    case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                        this.A0d = obtainStyledAttributes.getInt(index, this.A0d);
                        break;
                    case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                        this.A0e = obtainStyledAttributes.getDimensionPixelSize(index, this.A0e);
                        break;
                    case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                        this.A0f = C06500Wj.A00(obtainStyledAttributes, index, this.A0f);
                        break;
                    case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                        this.A0g = C06500Wj.A00(obtainStyledAttributes, index, this.A0g);
                        break;
                    case 30:
                        if (Build.VERSION.SDK_INT < 17) {
                            break;
                        } else {
                            this.A0h = obtainStyledAttributes.getDimensionPixelSize(index, this.A0h);
                            break;
                        }
                    case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                        this.A0i = C06500Wj.A00(obtainStyledAttributes, index, this.A0i);
                        break;
                    case 32:
                        this.A0j = C06500Wj.A00(obtainStyledAttributes, index, this.A0j);
                        break;
                    case R$styleable.FloatingActionMenu_menu_colorRipple /*33*/:
                        this.A0k = obtainStyledAttributes.getDimensionPixelSize(index, this.A0k);
                        break;
                    case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                        this.A0l = C06500Wj.A00(obtainStyledAttributes, index, this.A0l);
                        break;
                    case R$styleable.FloatingActionMenu_menu_backgroundColor /*35*/:
                        this.A0m = C06500Wj.A00(obtainStyledAttributes, index, this.A0m);
                        break;
                    case R$styleable.FloatingActionMenu_menu_fab_label /*36*/:
                        this.A05 = obtainStyledAttributes.getFloat(index, this.A05);
                        break;
                    case R$styleable.FloatingActionMenu_menu_fab_show_animation /*37*/:
                        this.A04 = obtainStyledAttributes.getFloat(index, this.A04);
                        break;
                    case R$styleable.FloatingActionMenu_menu_fab_hide_animation /*38*/:
                        this.A06 = obtainStyledAttributes.getFloat(index, this.A06);
                        break;
                    case 39:
                        this.A0U = obtainStyledAttributes.getInt(index, this.A0U);
                        break;
                    case 40:
                        this.A0n = obtainStyledAttributes.getInt(index, this.A0n);
                        break;
                    default:
                        switch (i3) {
                            case 54:
                                this.A0o = obtainStyledAttributes.getInt(index, this.A0o);
                                break;
                            case 55:
                                this.A0R = obtainStyledAttributes.getInt(index, this.A0R);
                                break;
                            case 56:
                                this.A0p = obtainStyledAttributes.getDimensionPixelSize(index, this.A0p);
                                break;
                            case 57:
                                this.A0S = obtainStyledAttributes.getDimensionPixelSize(index, this.A0S);
                                break;
                            case 58:
                                this.A0q = obtainStyledAttributes.getDimensionPixelSize(index, this.A0q);
                                break;
                            case 59:
                                this.A0T = obtainStyledAttributes.getDimensionPixelSize(index, this.A0T);
                                break;
                            default:
                                switch (i3) {
                                    case 61:
                                        this.A0C = C06500Wj.A00(obtainStyledAttributes, index, this.A0C);
                                        break;
                                    case 62:
                                        this.A0D = obtainStyledAttributes.getDimensionPixelSize(index, this.A0D);
                                        break;
                                    case 63:
                                        this.A00 = obtainStyledAttributes.getFloat(index, this.A00);
                                        break;
                                    default:
                                        switch (i3) {
                                            case 69:
                                                this.A07 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                continue;
                                            case 70:
                                                this.A02 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                continue;
                                            case 71:
                                                Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                continue;
                                            case AnonymousClass2EA.A02 /*72*/:
                                                this.A0Y = obtainStyledAttributes.getInt(index, this.A0Y);
                                                continue;
                                            case 73:
                                                this.A0Z = obtainStyledAttributes.getDimensionPixelSize(index, this.A0Z);
                                                continue;
                                            case 74:
                                                this.A0t = obtainStyledAttributes.getString(index);
                                                continue;
                                            case 75:
                                                this.A0x = obtainStyledAttributes.getBoolean(index, this.A0x);
                                                continue;
                                            case 76:
                                                A0o2 = AnonymousClass000.A0o();
                                                str = "unused attribute 0x";
                                                break;
                                            case CallsPrivacy.NOINTERNET_CALLING /*77*/:
                                                this.A0s = obtainStyledAttributes.getString(index);
                                                continue;
                                            default:
                                                A0o2 = AnonymousClass000.A0o();
                                                str = "Unknown attribute 0x";
                                                break;
                                        }
                                        A0o2.append(str);
                                        AnonymousClass000.A1J(A0o2, index);
                                        A0o2.append("   ");
                                        Log.w("ConstraintSet", AnonymousClass000.A0l(A0o2, sparseIntArray.get(index)));
                                        break;
                                }
                        }
                }
            } else {
                this.A0u = obtainStyledAttributes.getBoolean(index, this.A0u);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
