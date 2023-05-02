package X;

import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5xd  reason: invalid class name and case insensitive filesystem */
public class C119385xd {
    public static final Rect A00 = new Rect(-1000, -1000, 1000, 1000);
    public static final boolean A01;

    static {
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 17) {
            z2 = true;
        }
        A01 = z2;
    }

    public static C117345sq A00(Camera.Parameters parameters, String str, String str2) {
        String str3 = str;
        String str4 = parameters.get(str);
        ArrayList A02 = A02(str2);
        SparseArray sparseArray = new SparseArray();
        ArrayList A0i = C13690nt.A0i(A02.size());
        Iterator it = A02.iterator();
        int i2 = -1;
        while (it.hasNext()) {
            String A0m = AnonymousClass000.A0m(it);
            try {
                String str5 = A0m;
                if (A0m.startsWith("ISO")) {
                    str5 = A0m.substring(3);
                }
                int parseInt = Integer.parseInt(str5);
                Integer valueOf = Integer.valueOf(parseInt);
                sparseArray.put(parseInt, A0m);
                A0i.add(valueOf);
                if (A0m.equals(str4)) {
                    i2 = parseInt;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return new C117345sq(sparseArray, str3, str4, A0i, i2);
    }

    public static String A01(List list) {
        if (list.isEmpty()) {
            return "()";
        }
        StringBuilder A0r = AnonymousClass000.A0r("(");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Camera.Area area = (Camera.Area) list.get(i2);
            A0r.append('[');
            A0r.append(area.rect.flattenToString());
            A0r.append(' ');
            A0r.append(area.weight);
            A0r.append("] ");
        }
        return AnonymousClass000.A0j(A0r);
    }

    public static ArrayList A02(String str) {
        if (TextUtils.isEmpty(str)) {
            return AnonymousClass000.A0u();
        }
        TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(',');
        simpleStringSplitter.setString(str);
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator<String> it = simpleStringSplitter.iterator();
        while (it.hasNext()) {
            A0u.add(it.next());
        }
        return A0u;
    }

    public static ArrayList A03(String str) {
        if (str == null || str.isEmpty() || str.charAt(0) != '(' || str.charAt(str.length() - 1) != ')') {
            Log.e("ParametersHelper", AnonymousClass000.A0h(str, AnonymousClass000.A0r("Invalid area string=")));
        } else if (!str.equals("(0,0,0,0,0)") && !str.equals("(0, 0, 0, 0, 0)")) {
            ArrayList A0u = AnonymousClass000.A0u();
            int i2 = 0;
            do {
                int indexOf = str.indexOf(41, i2);
                String substring = str.substring(i2, indexOf + 1);
                Camera.Area area = null;
                if (substring == null || substring.isEmpty() || substring.charAt(0) != '(' || substring.charAt(substring.length() - 1) != ')') {
                    Log.e("ParametersHelper", AnonymousClass000.A0h(substring, AnonymousClass000.A0q("Invalid area string=")));
                } else {
                    Rect rect = new Rect();
                    try {
                        int indexOf2 = substring.indexOf(44);
                        rect.left = C110115dX.A02(substring, 1, indexOf2);
                        int i3 = indexOf2 + 1;
                        int indexOf3 = substring.indexOf(44, i3);
                        rect.top = C110115dX.A02(substring, i3, indexOf3);
                        int i4 = indexOf3 + 1;
                        int indexOf4 = substring.indexOf(44, i4);
                        rect.right = C110115dX.A02(substring, i4, indexOf4);
                        int i5 = indexOf4 + 1;
                        int indexOf5 = substring.indexOf(44, i5);
                        rect.bottom = C110115dX.A02(substring, i5, indexOf5);
                        int i6 = indexOf5 + 1;
                        int indexOf6 = substring.indexOf(44, i6);
                        if (indexOf6 == -1) {
                            indexOf6 = substring.indexOf(41, i6);
                        }
                        area = new Camera.Area(rect, Integer.parseInt(substring.substring(i6, indexOf6).trim()));
                    } catch (NumberFormatException | StringIndexOutOfBoundsException e2) {
                        Log.e("ParametersHelper", AnonymousClass000.A0h(substring, AnonymousClass000.A0q("Invalid area string=")), e2);
                    }
                }
                if (area != null) {
                    A0u.add(area);
                }
                i2 = str.indexOf(40, indexOf);
            } while (i2 != -1);
            if (!A0u.isEmpty()) {
                if (A0u.size() == 1) {
                    Camera.Area area2 = (Camera.Area) A0u.get(0);
                    Rect rect2 = area2.rect;
                    if (rect2.left == 0 && rect2.top == 0 && rect2.right == 0 && rect2.bottom == 0 && area2.weight == 0) {
                        return null;
                    }
                    return A0u;
                }
                return A0u;
            }
        }
        return null;
    }

    public static List A04(Rect rect) {
        int i2;
        Rect rect2 = A00;
        if (!rect.intersect(rect2) && !rect2.contains(rect)) {
            int i3 = rect.right;
            int i4 = rect2.left;
            int i5 = 0;
            if (i3 <= i4) {
                i2 = i4 - rect.left;
            } else {
                int i6 = rect.left;
                int i7 = rect2.right;
                i2 = i7 - i3;
                if (i6 < i7) {
                    i2 = 0;
                }
            }
            int i8 = rect.bottom;
            int i9 = rect2.top;
            if (i8 <= i9) {
                i5 = i9 - rect.top;
            } else {
                int i10 = rect.top;
                int i11 = rect2.bottom;
                if (i10 >= i11) {
                    i5 = i11 - i8;
                }
            }
            rect.offset(i2, i5);
            rect.intersect(rect2);
        }
        ArrayList A0u = AnonymousClass000.A0u();
        A0u.add(new Camera.Area(rect, 1000));
        return A0u;
    }
}
