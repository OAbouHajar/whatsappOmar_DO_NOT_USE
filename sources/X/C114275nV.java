package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5nV  reason: invalid class name and case insensitive filesystem */
public class C114275nV extends C214614e implements AnonymousClass1JF {
    public AnonymousClass4FT A00;
    public final C118235uM A01;
    public final AnonymousClass01V A02;
    public final C17020u3 A03;

    public C114275nV(C118235uM r1, AnonymousClass01V r2, C17020u3 r3, C214414c r4) {
        super(r4);
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r1;
    }

    public int A9c() {
        return C42971z5.A02(this.A02, this.A03);
    }

    public String AGG() {
        StringBuilder A0r = AnonymousClass000.A0r("bkch=");
        C42001x2 r0 = this.A01.A00;
        A0r.append(r0 == null ? 0 : r0.A07());
        return A0r.toString();
    }

    public void AIE(C20140zZ r20) {
        InputStreamReader inputStreamReader;
        C118235uM r7 = this.A01;
        C42001x2 r2 = r7.A00;
        if (r2 != null) {
            HashMap A0x = AnonymousClass000.A0x();
            try {
                JSONArray jSONArray = new JSONArray(r7.A03.A00("bloks").getString("bk_cache_lookup_map", "{}"));
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    String obj = jSONArray.get(i2).toString();
                    if (!TextUtils.isEmpty(obj)) {
                        try {
                            JSONObject A0K = C13700nu.A0K(obj);
                            C118225uL r12 = new C118225uL(A0K.getString("shard-key"), A0K.getString("entry-key"), A0K.getLong("expiration-time"), A0K.getLong("create-time"));
                            if (System.currentTimeMillis() > r12.A01 + r12.A00) {
                                StringBuilder A0o = AnonymousClass000.A0o();
                                A0o.append(r12.A03);
                                A0o.append(":");
                                try {
                                    r2.A0D(AnonymousClass000.A0h(r12.A02, A0o));
                                } catch (IOException unused) {
                                    Log.e("BkCacheSaveOnDiskHelper/saveOnDisk failed to remove the bk-cache");
                                }
                            } else {
                                StringBuilder A0o2 = AnonymousClass000.A0o();
                                A0o2.append(r12.A03);
                                A0o2.append(":");
                                A0x.put(AnonymousClass000.A0h(r12.A02, A0o2), r12);
                            }
                        } catch (JSONException unused2) {
                            Log.e("BkCacheSaveOnDiskHelper:BkCacheValueHelper/fromJsonString threw exception");
                        }
                    }
                }
            } catch (JSONException unused3) {
                Log.e("BkCacheSaveOnDiskHelper/syncLookUpMapToDisk parsing lookUpMap from disk threw exception");
            }
            r7.A02 = A0x;
            r7.A00();
            for (C118225uL r4 : r7.A02.values()) {
                String str = null;
                try {
                    StringBuilder A0o3 = AnonymousClass000.A0o();
                    A0o3.append(r4.A03);
                    A0o3.append(":");
                    C42011x3 A09 = r2.A09(AnonymousClass000.A0h(r4.A02, A0o3));
                    if (A09 == null) {
                        Log.i("BkCacheSaveOnDiskHelper/initDiskCache snapshot is null");
                    } else {
                        inputStreamReader = new InputStreamReader(A09.A00[0], C42001x2.A0D);
                        StringWriter stringWriter = new StringWriter();
                        char[] cArr = new char[1024];
                        while (true) {
                            int read = inputStreamReader.read(cArr);
                            if (read == -1) {
                                break;
                            }
                            stringWriter.write(cArr, 0, read);
                        }
                        String obj2 = stringWriter.toString();
                        inputStreamReader.close();
                        str = obj2;
                        if (!TextUtils.isEmpty(str)) {
                            C20140zZ r3 = r20;
                            r3.A02(new C89924dA((Object) str, r4.A01, r4.A00), r4.A03, r4.A02);
                        }
                    }
                } catch (IOException unused4) {
                    Log.e("BkCacheSaveOnDiskHelper/initDiskCache unable to fetch content from disk");
                } catch (Throwable th) {
                    inputStreamReader.close();
                    throw th;
                }
            }
        }
    }

    public void AZG(boolean z2) {
        AnonymousClass4FT r0 = this.A00;
        if (r0 != null) {
            r0.A00.A01.A05(-1);
        }
    }

    public void Abe(AnonymousClass4FT r1) {
        this.A00 = r1;
    }

    public void Abx(String str, String str2) {
        C118235uM r3 = this.A01;
        StringBuilder A0q = AnonymousClass000.A0q(str);
        A0q.append(":");
        String A0h = AnonymousClass000.A0h(str2, A0q);
        C42001x2 r0 = r3.A00;
        if (r0 == null) {
            Log.e("BkCacheSaveOnDiskHelper/removeOnDisk disk cache is not setup for bk cache");
        } else {
            try {
                r0.A0D(A0h);
            } catch (IOException unused) {
                Log.e("BkCacheSaveOnDiskHelper/saveOnDisk failed to remove the bk-cache");
            }
        }
        Map map = r3.A02;
        StringBuilder A0q2 = AnonymousClass000.A0q(str);
        A0q2.append(":");
        map.remove(AnonymousClass000.A0h(str2, A0q2));
        r3.A00();
    }

    public void Ad2(C89924dA r15, String str, String str2) {
        OutputStream outputStream;
        OutputStreamWriter outputStreamWriter;
        String str3;
        C118235uM r4 = this.A01;
        C42001x2 r1 = r4.A00;
        if (r1 == null) {
            str3 = "BkCacheSaveOnDiskHelper/saveOnDisk disk cache is not setup for bk cache";
        } else {
            Object obj = r15.A02;
            if (obj == null) {
                str3 = "BkCacheSaveOnDiskHelper/saveOnDisk invalid value in CacheValue";
            } else {
                String str4 = str;
                try {
                    StringBuilder A0q = AnonymousClass000.A0q(str4);
                    A0q.append(":");
                    String str5 = str2;
                    C42021x6 A08 = r1.A08(AnonymousClass000.A0h(str5, A0q));
                    String str6 = (String) obj;
                    OutputStreamWriter outputStreamWriter2 = null;
                    try {
                        outputStream = A08.A00();
                        try {
                            outputStreamWriter = new OutputStreamWriter(outputStream, C42001x2.A0D);
                        } catch (Throwable th) {
                            th = th;
                            C42001x2.A03(outputStreamWriter2);
                            C42001x2.A03(outputStream);
                            throw th;
                        }
                        try {
                            outputStreamWriter.write(str6);
                            C42001x2.A03(outputStreamWriter);
                            C42001x2.A03(outputStream);
                            A08.A01();
                            Map map = r4.A02;
                            StringBuilder A0q2 = AnonymousClass000.A0q(str4);
                            A0q2.append(":");
                            map.put(AnonymousClass000.A0h(str5, A0q2), new C118225uL(str4, str5, r15.A01, r15.A00));
                            r4.A00();
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            outputStreamWriter2 = outputStreamWriter;
                            C42001x2.A03(outputStreamWriter2);
                            C42001x2.A03(outputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        outputStream = null;
                        C42001x2.A03(outputStreamWriter2);
                        C42001x2.A03(outputStream);
                        throw th;
                    }
                } catch (IOException unused) {
                    Log.e("BkCacheSaveOnDiskHelper/saveOnDisk failed to save the bk-cache");
                    return;
                }
            }
        }
        Log.e(str3);
    }
}
