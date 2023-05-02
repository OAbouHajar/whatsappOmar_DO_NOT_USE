package X;

import android.content.Context;
import com.obwhatsapp.R;
import java.util.Map;

/* renamed from: X.0zM  reason: invalid class name and case insensitive filesystem */
public abstract class C20010zM {
    public String A00(Context context, Object... objArr) {
        int i2;
        String string;
        if (this instanceof AnonymousClass2ZE) {
            C18450wi.A0H(context, 0);
            i2 = R.string.str0d12;
        } else if (this instanceof AnonymousClass2ZH) {
            C18450wi.A0H(context, 0);
            i2 = R.string.str0d10;
        } else if (this instanceof C20280zn) {
            return "[Internal Only] Export Messages";
        } else {
            if (this instanceof C20290zo) {
                C18450wi.A0H(context, 0);
                i2 = R.string.str1cf2;
            } else if (this instanceof AnonymousClass10I) {
                C18450wi.A0H(context, 0);
                i2 = R.string.str13fc;
            } else if (this instanceof AnonymousClass10D) {
                C18450wi.A0H(context, 0);
                i2 = R.string.str00c2;
            } else if (this instanceof AnonymousClass1LP) {
                C18450wi.A0H(context, 0);
                i2 = R.string.str05ca;
            } else if (this instanceof C20000zL) {
                C18450wi.A0H(context, 0);
                i2 = R.string.str05fd;
            } else if (this instanceof AnonymousClass1LN) {
                C18450wi.A0H(context, 0);
                i2 = R.string.str1c4c;
            } else {
                if (this instanceof AnonymousClass1LI) {
                    C18450wi.A0H(context, 0);
                    if (objArr.length == 1) {
                        string = context.getString(R.string.str1421, new Object[]{objArr[0]});
                    } else {
                        string = context.getString(R.string.str1420);
                    }
                } else if (this instanceof AnonymousClass1LG) {
                    C18450wi.A0H(context, 0);
                    string = context.getResources().getString(R.string.str0e57);
                } else if (this instanceof AnonymousClass1LJ) {
                    C18450wi.A0H(context, 0);
                    i2 = R.string.str1405;
                } else if (this instanceof AnonymousClass1LE) {
                    C18450wi.A0H(context, 0);
                    i2 = R.string.str05cb;
                } else if (this instanceof AnonymousClass1LL) {
                    C18450wi.A0H(context, 0);
                    i2 = R.string.str15f0;
                } else if (this instanceof AnonymousClass1LQ) {
                    C18450wi.A0H(context, 0);
                    i2 = R.string.str133c;
                } else if (this instanceof AnonymousClass1LW) {
                    C18450wi.A0H(context, 0);
                    if (objArr.length != 1) {
                        string = context.getString(R.string.str0d31);
                    } else {
                        string = context.getString(R.string.str0d32, new Object[]{objArr[0]});
                    }
                } else if (this instanceof AnonymousClass1LY) {
                    C18450wi.A0H(context, 0);
                    i2 = R.string.str1887;
                } else if (this instanceof AnonymousClass1LU) {
                    C18450wi.A0H(context, 0);
                    i2 = R.string.str00b4;
                } else if (this instanceof AnonymousClass1LO) {
                    C18450wi.A0H(context, 0);
                    i2 = R.string.str0b72;
                } else if (this instanceof AnonymousClass1LS) {
                    C18450wi.A0H(context, 0);
                    i2 = R.string.str0394;
                } else {
                    C18450wi.A0H(context, 0);
                    i2 = R.string.str00a6;
                }
                C18450wi.A0B(string);
                return string;
            }
        }
        string = context.getString(i2);
        C18450wi.A0B(string);
        return string;
    }

    public abstract boolean A01(Map map);
}
