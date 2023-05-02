package X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.03h  reason: invalid class name and case insensitive filesystem */
public final class C007203h {
    public static final C007203h A01 = new C007103g().A00();
    public static final String A02 = C06530Wm.A01("Data");
    public Map A00;

    public C007203h() {
    }

    public C007203h(C007203h r3) {
        this.A00 = new HashMap(r3.A00);
    }

    public C007203h(Map map) {
        this.A00 = new HashMap(map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[SYNTHETIC, Splitter:B:20:0x0043] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C007203h A00(byte[] r7) {
        /*
            java.lang.String r3 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r0) goto L_0x0073
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream
            r5.<init>(r7)
            r1 = 0
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x003a, all -> 0x0038 }
            r4.<init>(r5)     // Catch:{ IOException | ClassNotFoundException -> 0x003a, all -> 0x0038 }
            int r2 = r4.readInt()     // Catch:{ IOException | ClassNotFoundException -> 0x0036 }
        L_0x001b:
            if (r2 <= 0) goto L_0x002b
            java.lang.String r1 = r4.readUTF()     // Catch:{ IOException | ClassNotFoundException -> 0x0036 }
            java.lang.Object r0 = r4.readObject()     // Catch:{ IOException | ClassNotFoundException -> 0x0036 }
            r6.put(r1, r0)     // Catch:{ IOException | ClassNotFoundException -> 0x0036 }
            int r2 = r2 + -1
            goto L_0x001b
        L_0x002b:
            r4.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x004b
        L_0x002f:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
            goto L_0x004b
        L_0x0036:
            r0 = move-exception
            goto L_0x003c
        L_0x0038:
            r2 = move-exception
            goto L_0x0068
        L_0x003a:
            r0 = move-exception
            r4 = r1
        L_0x003c:
            java.lang.String r1 = A02     // Catch:{ all -> 0x005b }
            android.util.Log.e(r1, r3, r0)     // Catch:{ all -> 0x005b }
            if (r4 == 0) goto L_0x004b
            r4.close()     // Catch:{ IOException -> 0x0047 }
            goto L_0x004b
        L_0x0047:
            r0 = move-exception
            android.util.Log.e(r1, r3, r0)
        L_0x004b:
            r5.close()     // Catch:{ IOException -> 0x004f }
            goto L_0x0055
        L_0x004f:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
        L_0x0055:
            X.03h r0 = new X.03h
            r0.<init>((java.util.Map) r6)
            return r0
        L_0x005b:
            r2 = move-exception
            if (r4 == 0) goto L_0x0068
            r4.close()     // Catch:{ IOException -> 0x0062 }
            goto L_0x0068
        L_0x0062:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
        L_0x0068:
            r5.close()     // Catch:{ IOException -> 0x006c }
            throw r2
        L_0x006c:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
            throw r2
        L_0x0073:
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C007203h.A00(byte[]):X.03h");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0076 A[SYNTHETIC, Splitter:B:30:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008b A[SYNTHETIC, Splitter:B:42:0x008b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A01(X.C007203h r7) {
        /*
            java.lang.String r3 = "Error in Data#toByteArray: "
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            r6 = 0
            java.io.ObjectOutputStream r5 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x006a }
            r5.<init>(r4)     // Catch:{ IOException -> 0x006a }
            java.util.Map r1 = r7.A00     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            int r0 = r1.size()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            r5.writeInt(r0)     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.util.Set r0 = r1.entrySet()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
        L_0x001e:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            if (r0 == 0) goto L_0x003b
            java.lang.Object r1 = r2.next()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            r5.writeUTF(r0)     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            r5.writeObject(r0)     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            goto L_0x001e
        L_0x003b:
            r5.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x0045
        L_0x003f:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
        L_0x0045:
            r4.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x004f
        L_0x0049:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
        L_0x004f:
            int r1 = r4.size()
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r0) goto L_0x005c
            byte[] r1 = r4.toByteArray()
            return r1
        L_0x005c:
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            throw r2
        L_0x0064:
            r2 = move-exception
            r6 = r5
            goto L_0x0089
        L_0x0067:
            r0 = move-exception
            r6 = r5
            goto L_0x006b
        L_0x006a:
            r0 = move-exception
        L_0x006b:
            java.lang.String r2 = A02     // Catch:{ all -> 0x0088 }
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x0088 }
            byte[] r1 = r4.toByteArray()     // Catch:{ all -> 0x0088 }
            if (r6 == 0) goto L_0x007e
            r6.close()     // Catch:{ IOException -> 0x007a }
            goto L_0x007e
        L_0x007a:
            r0 = move-exception
            android.util.Log.e(r2, r3, r0)
        L_0x007e:
            r4.close()     // Catch:{ IOException -> 0x0082 }
            goto L_0x0087
        L_0x0082:
            r0 = move-exception
            android.util.Log.e(r2, r3, r0)
            return r1
        L_0x0087:
            return r1
        L_0x0088:
            r2 = move-exception
        L_0x0089:
            if (r6 == 0) goto L_0x0095
            r6.close()     // Catch:{ IOException -> 0x008f }
            goto L_0x0095
        L_0x008f:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
        L_0x0095:
            r4.close()     // Catch:{ IOException -> 0x0099 }
            throw r2
        L_0x0099:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C007203h.A01(X.03h):byte[]");
    }

    public int A02(String str, int i2) {
        Object obj = this.A00.get(str);
        return obj instanceof Integer ? ((Number) obj).intValue() : i2;
    }

    public String A03(String str) {
        Object obj = this.A00.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && C007203h.class == obj.getClass()) {
                Map map = this.A00;
                Set keySet = map.keySet();
                Map map2 = ((C007203h) obj).A00;
                if (keySet.equals(map2.keySet())) {
                    for (Object next : keySet) {
                        Object obj2 = map.get(next);
                        Object obj3 = map2.get(next);
                        if (obj2 != null) {
                            if (obj3 != null) {
                                if (!((!(obj2 instanceof Object[]) || !(obj3 instanceof Object[])) ? obj2.equals(obj3) : Arrays.deepEquals((Object[]) obj2, (Object[]) obj3))) {
                                }
                            }
                        } else if (obj2 == obj3) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode() * 31;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        Map map = this.A00;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = map.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
