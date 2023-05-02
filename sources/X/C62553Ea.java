package X;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.3Ea  reason: invalid class name and case insensitive filesystem */
public class C62553Ea implements C25261Jc {
    public static String A00(Object obj, boolean z2, boolean z3) {
        if (!(obj instanceof List) && !(obj instanceof Map)) {
            return obj == null ? "" : String.valueOf(obj);
        }
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            A03(jsonWriter, obj, z2, z3);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e2) {
            return AnonymousClass000.A0g("Exception in serialization ", e2);
        }
    }

    public static ArrayList A01(AnonymousClass4K0 r5, JSONArray jSONArray) {
        int length = jSONArray.length();
        ArrayList A0i = C13690nt.A0i(length);
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = jSONArray.get(i2);
            if (!(obj instanceof String)) {
                if (obj instanceof JSONObject) {
                    A0i.add(A02(r5, (JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    A0i.add(A01(r5, (JSONArray) obj));
                } else if (!(obj instanceof Integer)) {
                    if (obj instanceof Double) {
                        A0i.add(C89554cQ.A00(((Number) obj).doubleValue()));
                    } else if (obj instanceof Float) {
                        A0i.add(C89554cQ.A00((double) AnonymousClass000.A04(obj)));
                    } else if (!(obj instanceof Boolean) && !(obj instanceof Long)) {
                    }
                }
            }
            A0i.add(obj);
        }
        return A0i;
    }

    public static HashMap A02(AnonymousClass4K0 r5, JSONObject jSONObject) {
        HashMap A0x = AnonymousClass000.A0x();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String A0m = AnonymousClass000.A0m(keys);
            Object obj = jSONObject.get(A0m);
            if (!(obj instanceof String)) {
                if (obj instanceof JSONObject) {
                    A0x.put(A0m, A02(r5, (JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    A0x.put(A0m, A01(r5, (JSONArray) obj));
                } else if (!(obj instanceof Integer)) {
                    if (obj instanceof Double) {
                        A0x.put(A0m, C89554cQ.A00(((Number) obj).doubleValue()));
                    } else if (obj instanceof Float) {
                        A0x.put(A0m, C89554cQ.A00((double) AnonymousClass000.A04(obj)));
                    } else if (!(obj instanceof Boolean) && !(obj instanceof Long)) {
                    }
                }
            }
            A0x.put(A0m, obj);
        }
        return A0x;
    }

    public static void A03(JsonWriter jsonWriter, Object obj, boolean z2, boolean z3) {
        String valueOf;
        if (obj == null) {
            jsonWriter.nullValue();
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
        } else if (obj instanceof Boolean) {
            boolean A1X = AnonymousClass000.A1X(obj);
            if (z3) {
                jsonWriter.value(A1X ? 1 : 0);
            } else {
                jsonWriter.value(A1X);
            }
        } else {
            if (obj instanceof String) {
                valueOf = (String) obj;
            } else if (obj instanceof Map) {
                jsonWriter.beginObject();
                if (z2) {
                    TreeMap treeMap = new TreeMap();
                    Iterator A0y = AnonymousClass000.A0y((Map) obj);
                    while (A0y.hasNext()) {
                        Map.Entry A0z = AnonymousClass000.A0z(A0y);
                        treeMap.put(String.valueOf(A0z.getKey()), A0z.getValue());
                    }
                    Iterator A0j = C13690nt.A0j(treeMap);
                    while (A0j.hasNext()) {
                        Map.Entry A0z2 = AnonymousClass000.A0z(A0j);
                        jsonWriter.name(C13690nt.A0f(A0z2));
                        A03(jsonWriter, A0z2.getValue(), z2, z3);
                    }
                } else {
                    Iterator A0y2 = AnonymousClass000.A0y((Map) obj);
                    while (A0y2.hasNext()) {
                        Map.Entry A0z3 = AnonymousClass000.A0z(A0y2);
                        jsonWriter.name(String.valueOf(A0z3.getKey()));
                        A03(jsonWriter, A0z3.getValue(), z2, z3);
                    }
                }
                jsonWriter.endObject();
                return;
            } else if (obj instanceof List) {
                jsonWriter.beginArray();
                for (Object A03 : (List) obj) {
                    A03(jsonWriter, A03, z2, z3);
                }
                jsonWriter.endArray();
                return;
            } else {
                valueOf = String.valueOf(obj);
            }
            jsonWriter.value(valueOf);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0094, code lost:
        r0 = X.C89554cQ.A00((double) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00df, code lost:
        X.C89644cb.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        throw new X.AnonymousClass5An(X.C13680ns.A0h("Unknown lispy action type: ", r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A8l(X.C14950q3 r5, X.C99354tt r6, X.C14970q5 r7) {
        /*
            r4 = this;
            java.lang.String r1 = r6.A00     // Catch:{ all -> 0x00e3 }
            X.C89644cb.A01(r1)     // Catch:{ all -> 0x00e3 }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x00e3 }
            r3 = 1
            r2 = 0
            switch(r0) {
                case -2044261771: goto L_0x00bc;
                case -863899808: goto L_0x00ab;
                case -826958968: goto L_0x009a;
                case -791813135: goto L_0x0084;
                case -791813134: goto L_0x0073;
                case -362131820: goto L_0x0062;
                case -138615772: goto L_0x0047;
                case -138615771: goto L_0x002b;
                case 1225820697: goto L_0x001a;
                default: goto L_0x000e;
            }     // Catch:{ all -> 0x00e3 }
        L_0x000e:
            java.lang.String r0 = "Unknown lispy action type: "
            java.lang.String r1 = X.C13680ns.A0h(r0, r1)     // Catch:{ all -> 0x00e3 }
            X.5An r0 = new X.5An     // Catch:{ all -> 0x00e3 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e3 }
            throw r0     // Catch:{ all -> 0x00e3 }
        L_0x001a:
            java.lang.String r0 = "bk.action.textspan.GetHeight"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00e3 }
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = X.C14950q3.A00(r5)     // Catch:{ all -> 0x00e3 }
            X.4Lf r0 = (X.C84614Lf) r0     // Catch:{ all -> 0x00e3 }
            float r0 = r0.A02     // Catch:{ all -> 0x00e3 }
            goto L_0x0094
        L_0x002b:
            java.lang.String r0 = "bk.action.string.JsonEncodeV3"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00e3 }
            if (r0 == 0) goto L_0x000e
            java.util.List r0 = r5.A00     // Catch:{ all -> 0x00e3 }
            java.lang.Object r1 = r0.get(r2)     // Catch:{ all -> 0x00e3 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x00e3 }
            boolean r0 = X.C89554cQ.A02(r0)     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = A00(r1, r0, r2)     // Catch:{ all -> 0x00e3 }
            goto L_0x00df
        L_0x0047:
            java.lang.String r0 = "bk.action.string.JsonEncodeV2"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00e3 }
            if (r0 == 0) goto L_0x000e
            java.util.List r0 = r5.A00     // Catch:{ all -> 0x00e3 }
            java.lang.Object r1 = r0.get(r2)     // Catch:{ all -> 0x00e3 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x00e3 }
            boolean r0 = X.C89554cQ.A02(r0)     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = A00(r1, r0, r3)     // Catch:{ all -> 0x00e3 }
            goto L_0x00df
        L_0x0062:
            java.lang.String r0 = "bk.action.textspan.GetWidth"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00e3 }
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = X.C14950q3.A00(r5)     // Catch:{ all -> 0x00e3 }
            X.4Lf r0 = (X.C84614Lf) r0     // Catch:{ all -> 0x00e3 }
            float r0 = r0.A03     // Catch:{ all -> 0x00e3 }
            goto L_0x0094
        L_0x0073:
            java.lang.String r0 = "bk.action.textspan.GetCenterY"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00e3 }
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = X.C14950q3.A00(r5)     // Catch:{ all -> 0x00e3 }
            X.4Lf r0 = (X.C84614Lf) r0     // Catch:{ all -> 0x00e3 }
            float r0 = r0.A01     // Catch:{ all -> 0x00e3 }
            goto L_0x0094
        L_0x0084:
            java.lang.String r0 = "bk.action.textspan.GetCenterX"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00e3 }
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = X.C14950q3.A00(r5)     // Catch:{ all -> 0x00e3 }
            X.4Lf r0 = (X.C84614Lf) r0     // Catch:{ all -> 0x00e3 }
            float r0 = r0.A00     // Catch:{ all -> 0x00e3 }
        L_0x0094:
            double r0 = (double) r0     // Catch:{ all -> 0x00e3 }
            java.lang.Number r0 = X.C89554cQ.A00(r0)     // Catch:{ all -> 0x00e3 }
            goto L_0x00df
        L_0x009a:
            java.lang.String r0 = "bk.action.string.JsonEncode"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00e3 }
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = X.C14950q3.A00(r5)     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = A00(r0, r2, r3)     // Catch:{ all -> 0x00e3 }
            goto L_0x00df
        L_0x00ab:
            java.lang.String r0 = "bk.action.string.JsonDecode"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00e3 }
            if (r0 == 0) goto L_0x000e
            java.util.List r0 = r5.A00     // Catch:{ all -> 0x00e3 }
            java.lang.String r0 = X.AnonymousClass000.A0n(r0, r2)     // Catch:{ all -> 0x00e3 }
            X.4K0 r1 = r7.A01     // Catch:{ all -> 0x00e3 }
            goto L_0x00cd
        L_0x00bc:
            java.lang.String r0 = "bk.action.bloks.DangerouslyGetTreeFromParseResult"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00e3 }
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = X.C14950q3.A00(r5)     // Catch:{ all -> 0x00e3 }
            X.2Wa r0 = (X.AnonymousClass2Wa) r0     // Catch:{ all -> 0x00e3 }
            X.1dg r0 = r0.A01     // Catch:{ all -> 0x00e3 }
            goto L_0x00df
        L_0x00cd:
            org.json.JSONObject r0 = X.C13700nu.A0K(r0)     // Catch:{ JSONException -> 0x00d6 }
            java.util.HashMap r0 = A02(r1, r0)     // Catch:{ JSONException -> 0x00d6 }
            goto L_0x00df
        L_0x00d6:
            r2 = move-exception
            java.lang.String r1 = "Trying to decode malformed json"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00e3 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00e3 }
            throw r0     // Catch:{ all -> 0x00e3 }
        L_0x00df:
            X.C89644cb.A00()
            return r0
        L_0x00e3:
            r0 = move-exception
            X.C89644cb.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62553Ea.A8l(X.0q3, X.4tt, X.0q5):java.lang.Object");
    }
}
