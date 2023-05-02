package X;

import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.0V9  reason: invalid class name */
public abstract class AnonymousClass0V9 {
    public final JSONObject A00;

    public AnonymousClass0V9(JSONObject jSONObject) {
        this.A00 = jSONObject;
    }

    public static Enum parseEnum(String str, Enum enumR) {
        if (str == null) {
            return enumR;
        }
        try {
            return Enum.valueOf(enumR.getClass(), str.toUpperCase(Locale.US));
        } catch (IllegalArgumentException unused) {
            return enumR;
        }
    }

    public final C34641kb getBooleanList(String str) {
        JSONArray optJSONArray = this.A00.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        C67763cL r2 = new C67763cL();
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            r2.add((Object) Boolean.valueOf(optJSONArray.optBoolean(i2)));
        }
        return r2.build();
    }

    public final C34641kb getDoubleList(String str) {
        JSONArray optJSONArray = this.A00.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        C67763cL r3 = new C67763cL();
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            r3.add((Object) Double.valueOf(optJSONArray.optDouble(i2)));
        }
        return r3.build();
    }

    public final Enum getEnum(String str, Enum enumR) {
        return parseEnum(this.A00.optString(str), enumR);
    }

    public final C34641kb getEnumList(String str, Enum enumR) {
        JSONArray optJSONArray = this.A00.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        C67763cL r2 = new C67763cL();
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            r2.add((Object) parseEnum(optJSONArray.optString(i2), enumR));
        }
        return r2.build();
    }

    public final C34641kb getIntList(String str) {
        JSONArray optJSONArray = this.A00.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        C67763cL r2 = new C67763cL();
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            r2.add((Object) Integer.valueOf(optJSONArray.optInt(i2)));
        }
        return r2.build();
    }

    public final C34641kb getLongList(String str) {
        JSONArray optJSONArray = this.A00.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        C67763cL r3 = new C67763cL();
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            r3.add((Object) Long.valueOf(optJSONArray.optLong(i2)));
        }
        return r3.build();
    }

    public final Enum getNullableEnum(String str, Enum enumR) {
        JSONObject jSONObject = this.A00;
        if (jSONObject.isNull(str)) {
            return null;
        }
        return parseEnum(jSONObject.optString(str), enumR);
    }

    public final String getNullableString(String str) {
        JSONObject jSONObject = this.A00;
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    public JSONObject getRawJSONModel() {
        return this.A00;
    }

    public final C34641kb getStringList(String str) {
        JSONArray optJSONArray = this.A00.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        C67763cL r2 = new C67763cL();
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            r2.add((Object) optJSONArray.optString(i2));
        }
        return r2.build();
    }

    public final AnonymousClass0V9 getTree(String str, Class cls) {
        JSONObject optJSONObject = this.A00.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        try {
            return (AnonymousClass0V9) cls.getConstructor(new Class[]{JSONObject.class}).newInstance(new Object[]{optJSONObject});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[ExcHandler: IllegalAccessException | NoSuchMethodException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:4:0x000b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C34641kb getTreeList(java.lang.String r10, java.lang.Class r11) {
        /*
            r9 = this;
            org.json.JSONObject r0 = r9.A00
            org.json.JSONArray r8 = r0.optJSONArray(r10)
            r7 = 0
            if (r8 != 0) goto L_0x000a
            return r7
        L_0x000a:
            r6 = 1
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            r5 = 0
            r1[r5] = r0     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            java.lang.reflect.Constructor r4 = r11.getConstructor(r1)     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            X.3cL r3 = new X.3cL     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            r3.<init>()     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            r2 = 0
        L_0x001c:
            int r0 = r8.length()     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            if (r2 >= r0) goto L_0x0036
            org.json.JSONObject r1 = r8.optJSONObject(r2)     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            if (r1 == 0) goto L_0x0033
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ InstantiationException | InvocationTargetException -> 0x0033, IllegalAccessException | NoSuchMethodException -> 0x003b }
            r0[r5] = r1     // Catch:{ InstantiationException | InvocationTargetException -> 0x0033, IllegalAccessException | NoSuchMethodException -> 0x003b }
            java.lang.Object r0 = r4.newInstance(r0)     // Catch:{ InstantiationException | InvocationTargetException -> 0x0033, IllegalAccessException | NoSuchMethodException -> 0x003b }
            r3.add((java.lang.Object) r0)     // Catch:{ InstantiationException | InvocationTargetException -> 0x0033, IllegalAccessException | NoSuchMethodException -> 0x003b }
        L_0x0033:
            int r2 = r2 + 1
            goto L_0x001c
        L_0x0036:
            X.1kb r0 = r3.build()     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x003b }
            return r0
        L_0x003b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0V9.getTreeList(java.lang.String, java.lang.Class):X.1kb");
    }

    public boolean hasFieldValue(String str) {
        return !this.A00.isNull(str);
    }
}
