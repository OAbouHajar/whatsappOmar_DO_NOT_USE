package a;

import android.content.Context;
import android.widget.Toast;
import com.obwhatsapp.yo.i1;
import com.obwhatsapp.yo.yo;

/* compiled from: XFMFile */
public abstract /* synthetic */ class a {
    public static /* synthetic */ int a(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        throw null;
    }

    public static /* synthetic */ int b(int i2) {
        if (i2 == 1) {
            return 96;
        }
        if (i2 == 2) {
            return 384;
        }
        if (i2 == 3) {
            return -1;
        }
        throw null;
    }

    public static /* synthetic */ int c(int i2) {
        if (i2 == 1) {
            return 96;
        }
        if (i2 == 2) {
            return 512;
        }
        if (i2 == 3) {
            return -1;
        }
        throw null;
    }

    public static String d(String str, int i2) {
        return str + i2;
    }

    public static String e(String str, long j2) {
        return str + j2;
    }

    public static String f(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder g(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static void h(int i2, i1 i1Var, String str, int i3, String str2, int i4, String str3, int i5, String str4) {
        i1Var.put(str, Integer.valueOf(i2));
        i1Var.put(str2, Integer.valueOf(i3));
        i1Var.put(str3, Integer.valueOf(i4));
        i1Var.put(str4, Integer.valueOf(i5));
    }

    public static void i(String str, Context context, int i2) {
        Toast.makeText(context, yo.getString(str), i2).show();
    }
}
