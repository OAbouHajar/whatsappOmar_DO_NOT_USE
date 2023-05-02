package X;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.3BU  reason: invalid class name */
public final class AnonymousClass3BU {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r3 == r1) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        if (r1 == r0) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        r0 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Integer A00(java.lang.Object r4, java.lang.Object r5) {
        /*
            r2 = 1
            r1 = 0
            boolean r0 = X.AnonymousClass000.A1W(r4)
            if (r5 == 0) goto L_0x0009
            r2 = 0
        L_0x0009:
            r2 = r2 ^ r0
            if (r2 != 0) goto L_0x0090
            if (r4 == 0) goto L_0x008b
            if (r5 == 0) goto L_0x008b
            X.1Jq r0 = A01(r4, r5)
            java.lang.Object r3 = r0.first
            java.lang.Object r5 = r0.second
            java.lang.Class r0 = r3.getClass()
            X.2BO r2 = new X.2BO
            r2.<init>(r0)
            java.lang.Class r1 = r5.getClass()
            X.2BO r0 = new X.2BO
            r0.<init>(r1)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0083
            boolean r0 = r3 instanceof java.lang.Long
            if (r0 == 0) goto L_0x004a
            long r3 = X.C13700nu.A01(r3)
            long r1 = X.C13700nu.A01(r5)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0072
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0070
        L_0x0044:
            r0 = 0
        L_0x0045:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x004a:
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 == 0) goto L_0x005f
            java.lang.Number r3 = (java.lang.Number) r3
            double r2 = r3.doubleValue()
            java.lang.Number r5 = (java.lang.Number) r5
            double r0 = r5.doubleValue()
            int r0 = java.lang.Double.compare(r2, r0)
            goto L_0x0045
        L_0x005f:
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0074
            boolean r1 = X.AnonymousClass000.A1X(r3)
            boolean r0 = X.AnonymousClass000.A1X(r5)
            if (r1 < r0) goto L_0x0072
            if (r1 != r0) goto L_0x0070
            goto L_0x0044
        L_0x0070:
            r0 = 1
            goto L_0x0045
        L_0x0072:
            r0 = -1
            goto L_0x0045
        L_0x0074:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L_0x0081
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r5 = (java.lang.String) r5
            int r0 = r3.compareTo(r5)
            goto L_0x0045
        L_0x0081:
            r0 = 0
            return r0
        L_0x0083:
            java.lang.String r1 = "Two input are not the same type"
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>(r1)
            throw r0
        L_0x008b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L_0x0090:
            java.lang.String r0 = "One of the input is null, but the other one is not"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3BU.A00(java.lang.Object, java.lang.Object):java.lang.Integer");
    }

    public static final C25401Jq A01(Object obj, Object obj2) {
        if ((obj instanceof Double) && (obj2 instanceof Number)) {
            obj2 = Double.valueOf(((Number) obj2).doubleValue());
        } else if (!(obj instanceof Number) || !(obj2 instanceof Double)) {
            if (obj instanceof Integer) {
                obj = C13690nt.A0W(AnonymousClass000.A0D(obj));
            }
            if (obj2 instanceof Integer) {
                obj2 = C13690nt.A0W(AnonymousClass000.A0D(obj2));
            }
        } else {
            obj = Double.valueOf(((Number) obj).doubleValue());
        }
        return new C25401Jq(obj, obj2);
    }

    public static final boolean A02(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return C18450wi.A0R(obj2, obj);
        }
        C25401Jq A01 = A01(obj, obj2);
        Object obj3 = A01.first;
        Object obj4 = A01.second;
        if (!new AnonymousClass2BO(obj3.getClass()).equals(new AnonymousClass2BO(obj4.getClass()))) {
            StringBuilder A0r = AnonymousClass000.A0r("The two values for comparison are different classes. Expected: ");
            A0r.append(new AnonymousClass2BO(obj.getClass()).AG5());
            A0r.append(", Actual: ");
            throw new AssertionError(AnonymousClass000.A0f(new AnonymousClass2BO(obj2.getClass()).AG5(), A0r));
        } else if (obj3 instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj3;
            JSONObject jSONObject2 = (JSONObject) obj4;
            if (jSONObject.length() != jSONObject2.length()) {
                return false;
            }
            Iterator<String> keys = jSONObject.keys();
            C18450wi.A0B(keys);
            while (keys.hasNext()) {
                String A0m = AnonymousClass000.A0m(keys);
                if (!A02(jSONObject.opt(A0m), jSONObject2.opt(A0m))) {
                    return false;
                }
            }
            return true;
        } else if (obj3 instanceof JSONArray) {
            return A03((JSONArray) obj3, (JSONArray) obj4);
        } else {
            if ((obj3 instanceof Number) || (obj3 instanceof Boolean) || (obj3 instanceof String)) {
                return obj3.equals(obj4);
            }
            throw new AssertionError("The class type is currently not supported, only supports Number, Boolean, String, JSONObject, and JSONArray");
        }
    }

    public static final boolean A03(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray.length() == jSONArray2.length()) {
            int length = jSONArray.length();
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                if (A02(jSONArray.get(i2), jSONArray2.get(i2))) {
                    i2 = i3;
                }
            }
            return true;
        }
        return false;
    }
}
