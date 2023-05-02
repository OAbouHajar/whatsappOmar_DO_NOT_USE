package X;

import android.util.JsonWriter;
import com.whatsapp.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.19u  reason: invalid class name and case insensitive filesystem */
public class C229219u {
    public final C16300so A00;
    public final C16440t3 A01;
    public final C16980tz A02;

    public C229219u(C16300so r1, C16440t3 r2, C16980tz r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void A00(List list) {
        JsonWriter jsonWriter = new JsonWriter(new BufferedWriter(new FileWriter(new File(this.A02.A00.getFilesDir(), "fbips"))));
        try {
            jsonWriter.beginObject();
            jsonWriter.name("fbips");
            jsonWriter.beginArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C35761mS r4 = (C35761mS) it.next();
                jsonWriter.beginObject();
                jsonWriter.name("ip").value(r4.A03.getHostAddress());
                jsonWriter.name("port").value(r4.A02);
                jsonWriter.name("exp").value(r4.A01);
                jsonWriter.name("secure").value(r4.A05);
                jsonWriter.name("override").value(r4.A04);
                jsonWriter.name("resolver").value((long) r4.A00);
                jsonWriter.endObject();
            }
            jsonWriter.endArray();
            jsonWriter.endObject();
            jsonWriter.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public synchronized void A01(String[] strArr) {
        synchronized (this) {
            AnonymousClass00B.A00();
            if (r6 != 1 || !strArr[0].equalsIgnoreCase("CLEAR")) {
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    if (str != null) {
                        String[] split = str.split("\\|", 6);
                        if (split.length != 6) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("DnsCacheEntry/parseFallbackIpString/");
                            sb.append(str);
                            Log.e(sb.toString());
                        } else {
                            try {
                                InetAddress byName = InetAddress.getByName(split[0]);
                                short parseShort = Short.parseShort(split[1]);
                                long parseLong = Long.parseLong(split[2]);
                                arrayList.add(new C35761mS(Long.valueOf((Long.parseLong(split[3]) + parseLong) * 1000), Short.valueOf(parseShort), byName, 4, Boolean.parseBoolean(split[4]), Boolean.parseBoolean(split[5])));
                            } catch (NumberFormatException | UnknownHostException e2) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("DnsCacheEntry/parseFallbackIpString/");
                                sb2.append(str);
                                Log.e(sb2.toString(), e2);
                            }
                        }
                    }
                }
                try {
                    A00(arrayList);
                } catch (IOException e3) {
                    Log.e("FallbackManager/saveFallbacks", e3);
                    this.A00.AcB("fallback-manager/save-error", e3.toString(), false);
                }
            } else {
                this.A02.A00.deleteFile("fbips");
            }
        }
        return;
    }
}
