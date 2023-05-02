package X;

import android.util.JsonWriter;
import android.util.Pair;
import com.obwhatsapp.backup.google.IDxDTask3Shape0S1100000_2_I1;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3By  reason: invalid class name and case insensitive filesystem */
public final class C62173By {
    public static int A00(C61743Ad r9, C16190sc r10, C16260sj r11, String str) {
        File A0D = C13700nu.A0D(str);
        if (!A0D.exists()) {
            return 1;
        }
        if (r9 == null) {
            return 2;
        }
        long length = A0D.length();
        AnonymousClass4WW r3 = r9.A02;
        if (length != (r3 != null ? r3.A00 : r9.A00)) {
            return 4;
        }
        String A09 = AnonymousClass2GK.A09(r10, r11, A0D, A0D.length());
        if (A09 == null) {
            Log.i(AnonymousClass000.A0g("gdrive/v2/utils/is-local-same-as-remote/md5-is-null/ ", A0D));
            return 1;
        }
        return A09.equals(r3 != null ? r3.A03 : r9.A03) ? 3 : 4;
    }

    public static Map A01(AnonymousClass2GJ r6, AnonymousClass3BK r7) {
        HashMap hashMap = new HashMap(1000);
        String str = null;
        do {
            Pair pair = (Pair) AnonymousClass2GS.A00(new IDxDTask3Shape0S1100000_2_I1(r7, str, 0), r6, "gdrive/v2/load-files");
            if (pair == null) {
                return null;
            }
            str = (String) pair.second;
            for (C61743Ad r1 : (List) pair.first) {
                AnonymousClass4WW r0 = r1.A02;
                hashMap.put(r0 != null ? r0.A04 : r1.A06, r1);
            }
        } while (str != null);
        StringBuilder A0r = AnonymousClass000.A0r("gdrive/v2/load-files result ");
        A0r.append(hashMap.size());
        C13680ns.A1V(A0r);
        return Collections.unmodifiableMap(hashMap);
    }

    public static Map A02(AnonymousClass2GJ r8, AnonymousClass3BK r9, List list) {
        HashMap hashMap = new HashMap(1000);
        String str = null;
        do {
            Pair pair = (Pair) AnonymousClass2GS.A00(new IDxDTask3Shape0S1100000_2_I1(r9, str, 1), r8, "gdrive/v2/load-files");
            if (pair == null) {
                return null;
            }
            str = (String) pair.second;
            for (C61743Ad r3 : (List) pair.first) {
                AnonymousClass4WW r0 = r3.A02;
                String str2 = r0 != null ? r0.A04 : r3.A06;
                C61743Ad r1 = (C61743Ad) hashMap.put(str2, r3);
                if (r1 != null) {
                    if (str2.equals(r3.A06)) {
                        list.add(r3);
                        AnonymousClass4WW r02 = r1.A02;
                        hashMap.put(r02 != null ? r02.A04 : r1.A06, r1);
                    } else {
                        list.add(r1);
                    }
                }
            }
        } while (str != null);
        StringBuilder A0r = AnonymousClass000.A0r("gdrive/v2/load-files result ");
        A0r.append(hashMap.size());
        C13680ns.A1V(A0r);
        return Collections.unmodifiableMap(hashMap);
    }

    public static void A03(JsonWriter jsonWriter, Map map) {
        jsonWriter.beginObject();
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0y);
            jsonWriter.name(C13690nt.A0f(A0z));
            Object value = A0z.getValue();
            if (value instanceof Number) {
                jsonWriter.value((Number) value);
            } else if (value instanceof String) {
                jsonWriter.value((String) value);
            } else if (value instanceof Boolean) {
                jsonWriter.value(AnonymousClass000.A1X(value));
            } else if (value instanceof Map) {
                A03(jsonWriter, (Map) value);
            } else if (value instanceof Set) {
                jsonWriter.beginArray();
                for (Object obj : ((Set) value).toArray()) {
                    jsonWriter.value((String) obj);
                }
                jsonWriter.endArray();
            } else {
                StringBuilder A0r = AnonymousClass000.A0r("Unexpected value type ");
                A0r.append(value);
                A0r.append(" for ");
                throw AnonymousClass000.A0T(AnonymousClass000.A0h(C13690nt.A0f(A0z), A0r));
            }
        }
        jsonWriter.endObject();
    }

    public static void A04(C16200sd r4, Collection collection) {
        String A0M;
        int i2;
        C15860rz r42 = r4.A03;
        if (r42.A1f()) {
            boolean z2 = true;
            Iterator it = collection.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!A07((C61743Ad) it.next())) {
                        z2 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (r42.A1f() && (A0M = r42.A0M()) != null) {
                if (!z2) {
                    i2 = 1;
                    if (r42.A0F(A0M) == 1) {
                        return;
                    }
                } else {
                    i2 = 2;
                }
                r42.A0z(A0M, i2);
            }
        }
    }

    public static boolean A05(C108465Oc r3, AnonymousClass2GJ r4, AnonymousClass2GM r5, C61743Ad r6, File file) {
        Boolean bool = (Boolean) AnonymousClass2GS.A00(new C70973iE(r3, r4, r5, r6, file), r4, AnonymousClass000.A0h(file.getAbsolutePath(), AnonymousClass000.A0r("restore>gdrive/restore/file ")));
        return bool != null && bool.booleanValue();
    }

    public static boolean A06(AnonymousClass2GJ r3, AnonymousClass2GM r4) {
        Boolean bool = (Boolean) AnonymousClass2GS.A01(new C70903i7(r4), r3, "gdrive-backup-util/fetch-token", 14);
        return bool != null && bool.booleanValue();
    }

    public static boolean A07(C61743Ad r7) {
        for (C16960tx r3 : C16960tx.values()) {
            if (r7.A06.endsWith(AnonymousClass000.A0l(AnonymousClass000.A0r(".crypt"), r3.version))) {
                return true;
            }
        }
        return r7.A06.endsWith(".mcrypt1");
    }

    public static boolean A08(C15860rz r2) {
        int A08 = r2.A08();
        return A08 == 11 || A08 == 31 || A08 == 30 || A08 == 28 || A08 == 29;
    }
}
