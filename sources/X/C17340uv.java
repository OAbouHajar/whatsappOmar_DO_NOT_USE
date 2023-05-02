package X;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.msys.mci.DefaultCrypto;
import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import com.mod.bomfab.bomb.BuildConfig;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0uv  reason: invalid class name and case insensitive filesystem */
public class C17340uv {
    public static final int A0H = 10;
    public static final int A0I = 5000;
    public static final long A0J = 64092211200L;
    public static final String A0K = "xpm-messages-exporter-";
    public long A00;
    public int A01;
    public long A02;
    public final C16440t3 A03;
    public final C16300so A04;
    public final C17120uZ A05;
    public final C15860rz A06;
    public final C15810rt A07;
    public final C16900tq A08;
    public final C17310us A09;
    public final C17290uq A0A;
    public final C17300ur A0B;
    public final C17320ut A0C;
    public final C16370sv A0D;
    public final C17330uu A0E;
    public final C16220sf A0F;
    public final C16230sg A0G;

    public C17340uv(C16440t3 r1, C16300so r2, C15810rt r3, C17290uq r4, C17300ur r5, C16220sf r6, C16900tq r7, C15860rz r8, C17310us r9, C16370sv r10, C16230sg r11, C17320ut r12, C17330uu r13, C17120uZ r14) {
        this.A03 = r1;
        this.A04 = r2;
        this.A07 = r3;
        this.A0A = r4;
        this.A0B = r5;
        this.A0F = r6;
        this.A06 = r8;
        this.A08 = r7;
        this.A09 = r9;
        this.A0D = r10;
        this.A0G = r11;
        this.A0C = r12;
        this.A0E = r13;
        this.A05 = r14;
    }

    public static /* synthetic */ int A00(Pair pair, Pair pair2) {
        return -((Long) pair.second).compareTo((Long) pair2.second);
    }

    public static int A01(String str) {
        return str.hashCode() & Integer.MAX_VALUE;
    }

    public static C58792u7 A02(int i2) {
        if (i2 == 0) {
            return null;
        }
        C28581Wr A0U = C58792u7.A05.A0U();
        if ((i2 & 1) > 0) {
            A0U.A03();
            C58792u7 r2 = (C58792u7) A0U.A00;
            r2.A00 |= 1;
            r2.A03 = true;
        }
        if ((i2 & 2) > 0) {
            A0U.A03();
            C58792u7 r22 = (C58792u7) A0U.A00;
            r22.A00 |= 2;
            r22.A01 = true;
        }
        if ((i2 & 4) > 0) {
            A0U.A03();
            C58792u7 r23 = (C58792u7) A0U.A00;
            r23.A00 |= 4;
            r23.A04 = true;
        }
        if ((i2 & 8) > 0) {
            A0U.A03();
            C58792u7 r24 = (C58792u7) A0U.A00;
            r24.A00 |= 8;
            r24.A02 = true;
        }
        return (C58792u7) A0U.A02();
    }

    public static C58512tc A03(AnonymousClass28T r4) {
        C28581Wr A0U = C58512tc.A03.A0U();
        String obj = r4.A03.A00.toString();
        A0U.A03();
        C58512tc r1 = (C58512tc) A0U.A00;
        r1.A00 |= 1;
        r1.A01 = obj;
        A0U.A03();
        C58512tc r12 = (C58512tc) A0U.A00;
        r12.A00 |= 2;
        r12.A02 = (String) r4.A04.A00;
        return (C58512tc) A0U.A02();
    }

    public static /* synthetic */ void A04() {
    }

    public static void A05(AnonymousClass4OH r8, OutputStream outputStream) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("creation_date", r8.A00);
            jSONObject2.put("os", r8.A05);
            jSONObject2.put("os_version", r8.A06);
            jSONObject2.put("app_name", r8.A02);
            jSONObject2.put("app_version", r8.A03);
            jSONObject2.put("format_version", r8.A04);
            jSONObject.put("header", jSONObject2);
            if (r8.A01 != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject.put("messages", jSONObject3);
                jSONObject3.put("filename", r8.A01.A00);
                jSONObject3.put("format", r8.A01.A01);
                JSONArray jSONArray = new JSONArray();
                jSONObject3.put("chunks", jSONArray);
                List<AnonymousClass4II> list = r8.A01.A02;
                if (list != null) {
                    for (AnonymousClass4II r2 : list) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("chunk_number", r2.A00);
                        jSONObject4.put("messages_count", r2.A01);
                        jSONArray.put(jSONObject4);
                    }
                }
            }
            outputStream.write(jSONObject.toString(4).getBytes(DefaultCrypto.UTF_8));
        } catch (IOException | JSONException e2) {
            Log.e("Failed to write header information.", e2);
            throw e2;
        }
    }

    public Cursor A08(int i2, long j2, long j3, long j4) {
        String[] strArr = {String.valueOf(j2), String.valueOf(j3), String.valueOf(j4), String.valueOf(i2)};
        C16800tf A012 = this.A08.get();
        try {
            Cursor A082 = A012.A02.A08(AnonymousClass1WW.A0G, strArr);
            A012.close();
            return A082;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public C29911bQ A09(Cursor cursor, CancellationSignal cancellationSignal, Map map) {
        Map A042 = this.A0B.A04(cursor, new C29891bO(this));
        if (A042.size() == 0) {
            return null;
        }
        C29911bQ r3 = (C29911bQ) C29901bP.A0D.A0U();
        r3.A07(C29921bR.A01);
        for (Map.Entry entry : A042.entrySet()) {
            cancellationSignal.throwIfCanceled();
            C15830rv r2 = (C15830rv) entry.getKey();
            C29931bS r4 = (C29931bS) entry.getValue();
            if (this.A07.A06(C15830rv.A02(((C29941bT) r4.A00).A0P)) != null) {
                if (r2 instanceof C16060sN) {
                    this.A0B.A05((C16060sN) r2, r4);
                }
                A0I(r2, r4, map);
                r3.A03();
                C29901bP r22 = (C29901bP) r3.A00;
                AnonymousClass1XE r1 = r22.A07;
                if (!((AnonymousClass1XF) r1).A00) {
                    r1 = C28541Wm.A0G(r1);
                    r22.A07 = r1;
                }
                r1.add(r4.A02());
            }
        }
        return r3;
    }

    public C69373ew A0A(C15830rv r6, boolean z2) {
        String str;
        C40931uv AH3 = this.A0G.AH3(r6, z2);
        C69373ew r3 = null;
        if (AH3 != null && AH3.A01.equals("USER_PROVIDED") && (str = AH3.A02) != null && !TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null) {
                str = parse.getPath();
            }
            String A0B2 = A0B(new File(str));
            if (A0B2 != null) {
                r3 = (C69373ew) C58522td.A03.A0U();
                r3.A03();
                C58522td r1 = (C58522td) r3.A00;
                r1.A00 |= 1;
                r1.A02 = A0B2;
                Integer num = AH3.A00;
                int intValue = num != null ? num.intValue() : 100;
                r3.A03();
                C58522td r12 = (C58522td) r3.A00;
                r12.A00 |= 2;
                r12.A01 = intValue;
            }
        }
        return r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r8 = r0.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ae, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00af, code lost:
        r3 = true;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00a2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a7 */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e9 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0B(java.io.File r15) {
        /*
            r14 = this;
            r4 = 0
            if (r15 == 0) goto L_0x010c
            boolean r0 = r15.exists()
            if (r0 == 0) goto L_0x010c
            r5 = 1
            java.lang.String r7 = r15.getCanonicalPath()     // Catch:{ IOException -> 0x00ea }
            int r13 = A01(r7)
            r6 = 0
            java.lang.String r8 = ""
            r9 = 0
        L_0x0016:
            r0 = 10
            if (r9 >= r0) goto L_0x00ab
            X.0sv r0 = r14.A0D     // Catch:{ IOException -> 0x00a8 }
            X.0zW r0 = r0.A01     // Catch:{ IOException -> 0x00a8 }
            X.0zX r0 = r0.A00     // Catch:{ IOException -> 0x00a8 }
            X.0tf r2 = r0.A00()     // Catch:{ IOException -> 0x00a8 }
            X.0tg r3 = r2.A02     // Catch:{ all -> 0x00a3 }
            java.lang.String r1 = "SELECT   f._id, f.local_path, f.exported_path, f.file_size, f.required, f.encryption_iv FROM exported_files_metadata AS f WHERE f.local_path = ?"
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch:{ all -> 0x00a3 }
            r0[r6] = r7     // Catch:{ all -> 0x00a3 }
            android.database.Cursor r1 = r3.A08(r1, r0)     // Catch:{ all -> 0x00a3 }
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x009c }
            if (r0 != 0) goto L_0x0038
            r0 = 0
            goto L_0x003c
        L_0x0038:
            X.4No r0 = X.C20110zW.A00(r1)     // Catch:{ all -> 0x009c }
        L_0x003c:
            r1.close()     // Catch:{ all -> 0x00a3 }
            r2.close()     // Catch:{ IOException -> 0x00a8 }
            if (r0 == 0) goto L_0x0045
            goto L_0x0099
        L_0x0045:
            int r0 = r13 % 100
            long r2 = (long) r0     // Catch:{ IOException -> 0x00a8 }
            int r0 = r13 / 100
            int r0 = r0 % 100
            long r0 = (long) r0     // Catch:{ IOException -> 0x00a8 }
            java.util.Locale r12 = java.util.Locale.US     // Catch:{ IOException -> 0x00a8 }
            java.lang.String r11 = "Media/%d/%d/%d-%s"
            r10 = 4
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ IOException -> 0x00a8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ IOException -> 0x00a8 }
            r10[r6] = r2     // Catch:{ IOException -> 0x00a8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x00a8 }
            r10[r5] = r0     // Catch:{ IOException -> 0x00a8 }
            r1 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ IOException -> 0x00a8 }
            r10[r1] = r0     // Catch:{ IOException -> 0x00a8 }
            r1 = 3
            java.lang.String r0 = r15.getName()     // Catch:{ IOException -> 0x00a8 }
            r10[r1] = r0     // Catch:{ IOException -> 0x00a8 }
            java.lang.String r8 = java.lang.String.format(r12, r11, r10)     // Catch:{ IOException -> 0x00a8 }
            X.0sv r0 = r14.A0D     // Catch:{ IOException -> 0x00a8 }
            long r10 = r0.A02(r15, r8, r6)     // Catch:{ IOException -> 0x00a8 }
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a8 }
            r1.<init>()     // Catch:{ IOException -> 0x00a8 }
            r1.append(r7)     // Catch:{ IOException -> 0x00a8 }
            java.lang.String r0 = java.lang.String.valueOf(r13)     // Catch:{ IOException -> 0x00a8 }
            r1.append(r0)     // Catch:{ IOException -> 0x00a8 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x00a8 }
            int r13 = A01(r0)     // Catch:{ IOException -> 0x00a8 }
            int r9 = r9 + 1
            goto L_0x0016
        L_0x0099:
            java.lang.String r8 = r0.A04     // Catch:{ IOException -> 0x00ae }
            goto L_0x00ac
        L_0x009c:
            r0 = move-exception
            if (r1 == 0) goto L_0x00a2
            r1.close()     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            throw r0     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            throw r0     // Catch:{ IOException -> 0x00a8 }
        L_0x00a8:
            r9 = move-exception
            r3 = 0
            goto L_0x00b0
        L_0x00ab:
            r5 = 0
        L_0x00ac:
            r3 = r5
            goto L_0x00cd
        L_0x00ae:
            r9 = move-exception
            r3 = 1
        L_0x00b0:
            java.lang.String r1 = "MessagesExporter/exportMediaFile/IOException during file registration. Local path: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r9)
            X.0so r2 = r14.A04
            java.lang.String r1 = r9.getMessage()
            java.lang.String r0 = "xpm-messages-exporter-exportMediaFile/IOException"
            r2.AcB(r0, r1, r5)
        L_0x00cd:
            if (r3 != 0) goto L_0x00e9
            java.lang.String r1 = "MessagesExporter/exportMediaFile/File is not registered. Local path: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0so r1 = r14.A04
            java.lang.String r0 = "xpm-messages-exporter-exportMediaFile/registerFile"
            r1.AcB(r0, r4, r6)
            return r4
        L_0x00e9:
            return r8
        L_0x00ea:
            r3 = move-exception
            java.lang.String r0 = "MessagesExporter/exportMediaFile/Failed to get canonical file path: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r15.getName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0so r2 = r14.A04
            java.lang.String r1 = r3.getMessage()
            java.lang.String r0 = "xpm-messages-exporter-exportMediaFile/getCanonicalPath"
            r2.AcB(r0, r1, r5)
        L_0x010c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17340uv.A0B(java.io.File):java.lang.String");
    }

    public List A0C(CancellationSignal cancellationSignal, C108895Px r19, OutputStream outputStream) {
        ArrayList arrayList = new ArrayList();
        long j2 = 1;
        long A012 = this.A0A.A01() + 1;
        this.A00 = (long) this.A0A.A00(1, A012);
        this.A02 = 0;
        Map A0D2 = A0D();
        int i2 = 0;
        while (j2 < A012) {
            CancellationSignal cancellationSignal2 = cancellationSignal;
            cancellationSignal2.throwIfCanceled();
            AnonymousClass4II r2 = new AnonymousClass4II();
            Cursor ABX = r19.ABX(5000, j2, A012, System.currentTimeMillis());
            if (ABX == null) {
                break;
            }
            try {
                r2.A01 = (long) ABX.getCount();
                if (ABX.moveToLast()) {
                    j2 = ABX.getLong(ABX.getColumnIndexOrThrow("_id"));
                    ABX.moveToFirst();
                    ABX.move(-1);
                    C29911bQ A092 = A09(ABX, cancellationSignal2, A0D2);
                    if (A092 != null) {
                        A092.A05(i2);
                        if (i2 == 0) {
                            A0J(A092);
                        }
                        ((C29901bP) A092.A02()).A01(outputStream);
                        r2.A00 = i2;
                        arrayList.add(r2);
                        i2++;
                        ABX.close();
                    }
                }
                ABX.close();
                return arrayList;
            } catch (Throwable unused) {
            }
        }
        return arrayList;
        throw th;
    }

    public Map A0D() {
        HashMap hashMap = new HashMap();
        Set<Jid> A0A2 = this.A0F.A0A();
        if (A0A2.size() != 0) {
            ArrayList arrayList = new ArrayList(A0A2.size());
            for (Jid jid : A0A2) {
                AnonymousClass1WS A072 = this.A0F.A07(jid.getRawString());
                arrayList.add(new Pair(jid, Long.valueOf(A072.A0G ? A072.A04 : 0)));
            }
            Collections.sort(arrayList, new IDxComparatorShape19S0000000_2_I0(30));
            int i2 = 0;
            while (i2 < arrayList.size()) {
                i2++;
                hashMap.put(((Pair) arrayList.get(i2)).first, Integer.valueOf(i2));
            }
        }
        return hashMap;
    }

    public void A0E() {
        AnonymousClass4OH r2 = new AnonymousClass4OH();
        r2.A00 = System.currentTimeMillis();
        r2.A05 = "android";
        r2.A06 = String.valueOf(Build.VERSION.SDK_INT);
        r2.A02 = "consumer";
        r2.A03 = "2.23.1.76";
        r2.A04 = BuildConfig.VERSION_NAME;
    }

    public void A0F(long j2) {
        this.A00 = j2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x016e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0173 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(android.os.CancellationSignal r19, X.C108895Px r20, java.io.File r21) {
        /*
            r18 = this;
            java.lang.String r1 = "messages.bin"
            r3 = 0
            X.1Zf r16 = new X.1Zf
            r0 = r16
            r0.<init>((boolean) r3)
            r16.A03()
            r2 = 0
            r7 = r18
            r7.A01 = r3
            X.0ut r0 = r7.A0C
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r3 = r0.iterator()
        L_0x001c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r3.next()
            X.5T7 r0 = (X.AnonymousClass5T7) r0
            r0.AVL(r2)
            goto L_0x001c
        L_0x002c:
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r15 = "android"
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r14 = java.lang.String.valueOf(r0)
            java.lang.String r13 = "consumer"
            java.lang.String r12 = "2.23.1.76"
            java.lang.String r11 = "1.0"
            r3 = 1
            r17 = r21
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ JSONException -> 0x0174 }
            r0 = r17
            r4.<init>(r0)     // Catch:{ JSONException -> 0x0174 }
            java.util.zip.ZipOutputStream r8 = new java.util.zip.ZipOutputStream     // Catch:{ all -> 0x016f }
            r8.<init>(r4)     // Catch:{ all -> 0x016f }
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x016a }
            r0.<init>(r1)     // Catch:{ all -> 0x016a }
            r8.putNextEntry(r0)     // Catch:{ all -> 0x016a }
            r17.getParentFile()     // Catch:{ all -> 0x016a }
            r9 = r19
            r0 = r20
            java.util.List r9 = r7.A0C(r9, r0, r8)     // Catch:{ all -> 0x016a }
            r8.closeEntry()     // Catch:{ all -> 0x016a }
            X.4Kw r10 = new X.4Kw     // Catch:{ all -> 0x016a }
            r10.<init>()     // Catch:{ all -> 0x016a }
            r10.A00 = r1     // Catch:{ all -> 0x016a }
            java.lang.String r0 = "protobuf"
            r10.A01 = r0     // Catch:{ all -> 0x016a }
            r10.A02 = r9     // Catch:{ all -> 0x016a }
            java.lang.String r1 = "header.json"
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x016a }
            r0.<init>(r1)     // Catch:{ all -> 0x016a }
            r8.putNextEntry(r0)     // Catch:{ all -> 0x016a }
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ IOException | JSONException -> 0x0163 }
            r9.<init>()     // Catch:{ IOException | JSONException -> 0x0163 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ IOException | JSONException -> 0x0163 }
            r1.<init>()     // Catch:{ IOException | JSONException -> 0x0163 }
            java.lang.String r0 = "creation_date"
            r1.put(r0, r5)     // Catch:{ IOException | JSONException -> 0x0163 }
            java.lang.String r0 = "os"
            r1.put(r0, r15)     // Catch:{ IOException | JSONException -> 0x0163 }
            java.lang.String r0 = "os_version"
            r1.put(r0, r14)     // Catch:{ IOException | JSONException -> 0x0163 }
            java.lang.String r0 = "app_name"
            r1.put(r0, r13)     // Catch:{ IOException | JSONException -> 0x0163 }
            java.lang.String r0 = "app_version"
            r1.put(r0, r12)     // Catch:{ IOException | JSONException -> 0x0163 }
            java.lang.String r0 = "format_version"
            r1.put(r0, r11)     // Catch:{ IOException | JSONException -> 0x0163 }
            java.lang.String r0 = "header"
            r9.put(r0, r1)     // Catch:{ IOException | JSONException -> 0x0163 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ IOException | JSONException -> 0x0163 }
            r5.<init>()     // Catch:{ IOException | JSONException -> 0x0163 }
            java.lang.String r0 = "messages"
            r9.put(r0, r5)     // Catch:{ IOException | JSONException -> 0x0163 }
            java.lang.String r1 = r10.A00     // Catch:{ IOException | JSONException -> 0x0163 }
            java.lang.String r0 = "filename"
            r5.put(r0, r1)     // Catch:{ IOException | JSONException -> 0x0163 }
            java.lang.String r1 = r10.A01     // Catch:{ IOException | JSONException -> 0x0163 }
            java.lang.String r0 = "format"
            r5.put(r0, r1)     // Catch:{ IOException | JSONException -> 0x0163 }
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ IOException | JSONException -> 0x0163 }
            r11.<init>()     // Catch:{ IOException | JSONException -> 0x0163 }
            java.lang.String r0 = "chunks"
            r5.put(r0, r11)     // Catch:{ IOException | JSONException -> 0x0163 }
            java.util.List r0 = r10.A02     // Catch:{ IOException | JSONException -> 0x0163 }
            if (r0 == 0) goto L_0x00f4
            java.util.Iterator r10 = r0.iterator()     // Catch:{ IOException | JSONException -> 0x0163 }
        L_0x00d1:
            boolean r0 = r10.hasNext()     // Catch:{ IOException | JSONException -> 0x0163 }
            if (r0 == 0) goto L_0x00f4
            java.lang.Object r5 = r10.next()     // Catch:{ IOException | JSONException -> 0x0163 }
            X.4II r5 = (X.AnonymousClass4II) r5     // Catch:{ IOException | JSONException -> 0x0163 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ IOException | JSONException -> 0x0163 }
            r6.<init>()     // Catch:{ IOException | JSONException -> 0x0163 }
            int r1 = r5.A00     // Catch:{ IOException | JSONException -> 0x0163 }
            java.lang.String r0 = "chunk_number"
            r6.put(r0, r1)     // Catch:{ IOException | JSONException -> 0x0163 }
            long r0 = r5.A01     // Catch:{ IOException | JSONException -> 0x0163 }
            java.lang.String r5 = "messages_count"
            r6.put(r5, r0)     // Catch:{ IOException | JSONException -> 0x0163 }
            r11.put(r6)     // Catch:{ IOException | JSONException -> 0x0163 }
            goto L_0x00d1
        L_0x00f4:
            r0 = 4
            java.lang.String r1 = r9.toString(r0)     // Catch:{ IOException | JSONException -> 0x0163 }
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r1.getBytes(r0)     // Catch:{ IOException | JSONException -> 0x0163 }
            r8.write(r0)     // Catch:{ IOException | JSONException -> 0x0163 }
            r8.closeEntry()     // Catch:{ all -> 0x016a }
            r8.close()     // Catch:{ all -> 0x016f }
            r4.close()     // Catch:{ JSONException -> 0x0174 }
            long r6 = r16.A00()
            java.util.Locale r9 = java.util.Locale.US
            r0 = 3
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r10.toHours(r6)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8[r2] = r0
            long r4 = r10.toMinutes(r6)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS
            long r0 = r10.toHours(r6)
            long r0 = r2.toMinutes(r0)
            long r4 = r4 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r8[r3] = r0
            r5 = 2
            long r3 = r10.toSeconds(r6)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            long r0 = r10.toMinutes(r6)
            long r0 = r2.toSeconds(r0)
            long r3 = r3 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r8[r5] = r0
            java.lang.String r0 = "%02d:%02d:%02d"
            java.lang.String r2 = java.lang.String.format(r9, r0, r8)
            java.lang.String r1 = "exportMessages - messages exporting is completed, consumed time: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0163:
            r1 = move-exception
            java.lang.String r0 = "Failed to write header information."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x016a }
            throw r1     // Catch:{ all -> 0x016a }
        L_0x016a:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x016e }
        L_0x016e:
            throw r0     // Catch:{ all -> 0x016f }
        L_0x016f:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0173 }
        L_0x0173:
            throw r0     // Catch:{ JSONException -> 0x0174 }
        L_0x0174:
            r2 = move-exception
            X.0ut r0 = r7.A0C
            r0.A04(r3)
            java.lang.String r1 = "Failed to write metadata; data export is not completed."
            com.whatsapp.util.Log.e((java.lang.String) r1)
            r17.delete()
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17340uv.A0G(android.os.CancellationSignal, X.5Px, java.io.File):void");
    }

    public void A0H(CancellationSignal cancellationSignal, File file) {
        A0G(cancellationSignal, new C102964zo(this), file);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r1 != 0) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006d A[PHI: r0 
      PHI: (r0v8 X.3ew) = (r0v7 X.3ew), (r0v12 X.3ew) binds: [B:14:0x0065, B:16:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(X.C15830rv r9, X.C29931bS r10, java.util.Map r11) {
        /*
            r8 = this;
            java.lang.Object r0 = r11.get(r9)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x001c
            int r3 = r0.intValue()
            r10.A03()
            X.1Wm r2 = r10.A00
            X.1bT r2 = (X.C29941bT) r2
            int r1 = r2.A01
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r0
            r2.A01 = r1
            r2.A06 = r3
        L_0x001c:
            X.0sf r1 = r8.A0F
            java.lang.String r0 = r9.getRawString()
            X.1WS r7 = r1.A07(r0)
            long r1 = r7.A00()
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x008a
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
        L_0x0033:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0047
        L_0x0037:
            r10.A03()
            X.1Wm r4 = r10.A00
            X.1bT r4 = (X.C29941bT) r4
            int r3 = r4.A01
            r0 = 4194304(0x400000, float:5.877472E-39)
            r3 = r3 | r0
            r4.A01 = r3
            r4.A0D = r1
        L_0x0047:
            int r1 = r7.A01
            r4 = 1
            if (r1 != r4) goto L_0x0084
            X.430 r3 = X.AnonymousClass430.A02
        L_0x004e:
            r10.A03()
            X.1Wm r2 = r10.A00
            X.1bT r2 = (X.C29941bT) r2
            int r1 = r2.A01
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 | r0
            r2.A01 = r1
            int r0 = r3.value
            r2.A05 = r0
        L_0x0060:
            r0 = 0
            X.3ew r0 = r8.A0A(r9, r0)
            if (r0 != 0) goto L_0x006d
            X.3ew r0 = r8.A0A(r9, r4)
            if (r0 == 0) goto L_0x0083
        L_0x006d:
            r10.A03()
            X.1Wm r2 = r10.A00
            X.1bT r2 = (X.C29941bT) r2
            X.1Wm r0 = r0.A02()
            X.2td r0 = (X.C58522td) r0
            r2.A0L = r0
            int r1 = r2.A01
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r0
            r2.A01 = r1
        L_0x0083:
            return
        L_0x0084:
            r0 = 2
            if (r1 != r0) goto L_0x0060
            X.430 r3 = X.AnonymousClass430.A03
            goto L_0x004e
        L_0x008a:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0033
            r1 = 64092211200(0xeec318800, double:3.166575972E-313)
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17340uv.A0I(X.0rv, X.1bS, java.util.Map):void");
    }

    public void A0J(C29911bQ r5) {
        C28581Wr A0U = C58962uR.A0C.A0U();
        C69373ew A0A2 = A0A((C15830rv) null, false);
        if (A0A2 != null) {
            A0U.A03();
            C58962uR r1 = (C58962uR) A0U.A00;
            r1.A09 = (C58522td) A0A2.A02();
            r1.A00 |= 1;
        }
        C69373ew A0A3 = A0A((C15830rv) null, true);
        if (A0A3 != null) {
            A0U.A03();
            C58962uR r12 = (C58962uR) A0U.A00;
            r12.A08 = (C58522td) A0A3.A02();
            r12.A00 |= 4;
        }
        int i2 = this.A0F.A03().A01;
        AnonymousClass430 A002 = i2 == 0 ? AnonymousClass430.A01 : AnonymousClass430.A00(i2);
        A0U.A03();
        C58962uR r13 = (C58962uR) A0U.A00;
        r13.A00 |= 2;
        r13.A02 = A002.value;
        C58792u7 A022 = A02(((SharedPreferences) this.A06.A01.get()).getInt("autodownload_wifi_mask", 15));
        if (A022 != null) {
            A0U.A03();
            C58962uR r14 = (C58962uR) A0U.A00;
            r14.A06 = A022;
            r14.A00 |= 8;
        }
        C58792u7 A023 = A02(this.A06.A03());
        if (A023 != null) {
            A0U.A03();
            C58962uR r15 = (C58962uR) A0U.A00;
            r15.A04 = A023;
            r15.A00 |= 16;
        }
        C58792u7 A024 = A02(((SharedPreferences) this.A06.A01.get()).getInt("autodownload_roaming_mask", 0));
        if (A024 != null) {
            A0U.A03();
            C58962uR r16 = (C58962uR) A0U.A00;
            r16.A05 = A024;
            r16.A00 |= 32;
        }
        this.A0F.A03();
        boolean z2 = !this.A0F.A03().A0B();
        A0U.A03();
        C58962uR r17 = (C58962uR) A0U.A00;
        r17.A00 |= 64;
        r17.A0B = z2;
        this.A0F.A02();
        boolean z3 = !this.A0F.A02().A0B();
        A0U.A03();
        C58962uR r18 = (C58962uR) A0U.A00;
        r18.A00 |= 128;
        r18.A0A = z3;
        AnonymousClass28T A003 = this.A0E.A00();
        if (!(A003 == null || A003.A03.A00 == null || A003.A04.A00 == null)) {
            C58512tc A032 = A03(A003);
            A0U.A03();
            C58962uR r19 = (C58962uR) A0U.A00;
            r19.A07 = A032;
            r19.A00 |= 1024;
        }
        r5.A03();
        C29901bP r110 = (C29901bP) r5.A00;
        r110.A0C = (C58962uR) A0U.A02();
        r110.A01 |= 8;
    }

    public void A0K(C16740tZ r7) {
        C16750ta r2;
        String A0B2;
        long j2 = this.A02 + 1;
        this.A02 = j2;
        int i2 = (int) ((((double) j2) * 100.0d) / ((double) this.A00));
        if (this.A01 != i2) {
            this.A01 = i2;
            for (AnonymousClass5T7 AVL : this.A0C.A01()) {
                AVL.AVL(i2);
            }
        }
        if (r7 instanceof C16730tY) {
            C15830rv r1 = r7.A11.A00;
            if (C16030sJ.A0Q(r1)) {
                return;
            }
            if ((r1 == null || r1.getType() != 11) && (r2 = ((C16730tY) r7).A02) != null && (A0B2 = A0B(r2.A0F)) != null) {
                r2.A0F = new File(A0B2);
            }
        }
    }
}
