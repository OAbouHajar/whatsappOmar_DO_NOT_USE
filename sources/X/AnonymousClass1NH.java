package X;

import android.os.CancellationSignal;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.text.TextUtils;
import com.facebook.msys.mci.DefaultCrypto;
import com.facebook.redex.IDxUCallbackShape360S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape6S0100000_I0_5;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1NH  reason: invalid class name */
public class AnonymousClass1NH {
    public static final int A0S = 3;
    public static final int A0T = 30;
    public static final String A0U = "MessagesImporter/";
    public final C16300so A00;
    public final C16180sb A01;
    public final AnonymousClass01Z A02;
    public final AnonymousClass12G A03;
    public final C16190sc A04;
    public final C16440t3 A05;
    public final C15860rz A06;
    public final C18910xS A07;
    public final C16920ts A08;
    public final C15810rt A09;
    public final C16460t6 A0A;
    public final AnonymousClass182 A0B;
    public final C26901Pr A0C;
    public final C17310us A0D;
    public final AnonymousClass16V A0E;
    public final C26891Pq A0F;
    public final C17290uq A0G;
    public final AnonymousClass15B A0H;
    public final AnonymousClass15G A0I;
    public final C17300ur A0J;
    public final AnonymousClass1NG A0K;
    public final AnonymousClass1NI A0L;
    public final C26871Po A0M;
    public final C16350st A0N;
    public final C17330uu A0O;
    public final C16220sf A0P;
    public final C16230sg A0Q;
    public final AnonymousClass01D A0R;

    public AnonymousClass1NH(C16440t3 r2, C16920ts r3, C16300so r4, C15810rt r5, C17290uq r6, C16180sb r7, AnonymousClass15B r8, C18910xS r9, C16190sc r10, AnonymousClass1NG r11, C16460t6 r12, C17300ur r13, C26891Pq r14, C16220sf r15, AnonymousClass1NI r16, C16350st r17, AnonymousClass15G r18, C15860rz r19, C17310us r20, AnonymousClass16V r21, AnonymousClass182 r22, C26901Pr r23, AnonymousClass12G r24, C16230sg r25, C26871Po r26, AnonymousClass01D r27, C17330uu r28, AnonymousClass01Z r29) {
        this.A05 = r2;
        this.A08 = r3;
        this.A00 = r4;
        this.A09 = r5;
        this.A0G = r6;
        this.A01 = r7;
        this.A0H = r8;
        this.A07 = r9;
        this.A04 = r10;
        this.A0K = r11;
        this.A0A = r12;
        this.A0J = r13;
        this.A0F = r14;
        this.A0P = r15;
        this.A0L = r16;
        this.A0N = r17;
        this.A0I = r18;
        this.A06 = r19;
        this.A0D = r20;
        this.A0E = r21;
        this.A0B = r22;
        this.A0C = r23;
        this.A03 = r24;
        this.A0Q = r25;
        this.A0M = r26;
        this.A0R = r27;
        this.A0O = r28;
        this.A02 = r29;
    }

    public static int A00(C58792u7 r4) {
        int i2 = 0;
        if (r4 == null) {
            return 0;
        }
        int i3 = r4.A00;
        if ((i3 & 1) == 1 && r4.A03) {
            i2 = 1;
        }
        if ((i3 & 2) == 2 && r4.A01) {
            i2 |= 2;
        }
        if ((i3 & 4) == 4 && r4.A04) {
            i2 |= 4;
        }
        return ((i3 & 8) != 8 || !r4.A02) ? i2 : i2 | 8;
    }

    public static int A01(List list) {
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 = (int) (((long) i2) + ((AnonymousClass4II) it.next()).A01);
        }
        return i2;
    }

    public static InputStream A02(String str, String str2) {
        File file = new File(str);
        if (file.exists()) {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
            try {
                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                    if (nextEntry.getName().equalsIgnoreCase(str2)) {
                        return zipInputStream;
                    }
                }
                try {
                    zipInputStream.close();
                } catch (IOException unused) {
                }
                StringBuilder sb = new StringBuilder("Failed to find entry '");
                sb.append(str2);
                sb.append("' in '");
                sb.append(str);
                sb.append("' archive.");
                throw new FileNotFoundException(sb.toString());
            } catch (IOException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("MessagesImporter/Failed to read entry '");
                sb2.append(str2);
                sb2.append("' in '");
                sb2.append(str);
                sb2.append("' archive.");
                Log.e(sb2.toString(), e2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("MessagesImporter/Failed to read entry '");
                sb3.append(str2);
                sb3.append("' in '");
                sb3.append(str);
                sb3.append("' archive.");
                throw new IOException(sb3.toString(), e2);
            } catch (Throwable th) {
                try {
                    zipInputStream.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } else {
            StringBuilder sb4 = new StringBuilder("Unable to locate input data file '");
            sb4.append(str);
            sb4.append("'.");
            throw new FileNotFoundException(sb4.toString());
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0041 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x004d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0052 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A03(android.os.CancellationSignal r7, java.io.File r8) {
        /*
            r6 = this;
            boolean r0 = r8.exists()
            if (r0 == 0) goto L_0x006a
            X.01D r0 = r6.A0R
            java.lang.Object r4 = r0.get()
            X.1Pp r4 = (X.C26881Pp) r4
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0053 }
            r5.<init>(r8)     // Catch:{ IOException -> 0x0053 }
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x004e }
            r3.<init>(r5)     // Catch:{ all -> 0x004e }
            r0 = 131072(0x20000, float:1.83671E-40)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x0049 }
            java.util.zip.ZipEntry r0 = r3.getNextEntry()     // Catch:{ all -> 0x0049 }
        L_0x0020:
            if (r0 == 0) goto L_0x0042
            r7.throwIfCanceled()     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0049 }
            java.io.File r0 = r4.A00(r0)     // Catch:{ all -> 0x0049 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0049 }
            r1.<init>(r0)     // Catch:{ all -> 0x0049 }
            X.C16350st.A01(r7, r3, r1, r2)     // Catch:{ all -> 0x003d }
            r1.close()     // Catch:{ all -> 0x0049 }
            java.util.zip.ZipEntry r0 = r3.getNextEntry()     // Catch:{ all -> 0x0049 }
            goto L_0x0020
        L_0x003d:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0041 }
        L_0x0041:
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0042:
            r3.close()     // Catch:{ all -> 0x004e }
            r5.close()     // Catch:{ IOException -> 0x0053 }
            return
        L_0x0049:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x004d }
        L_0x004d:
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0052 }
        L_0x0052:
            throw r0     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            r3 = move-exception
            java.lang.String r0 = "MessagesImporter/Failed to unpack files from archive."
            com.whatsapp.util.Log.e(r0, r3)
            android.content.Context r0 = r4.A00
            java.io.File r2 = r0.getFilesDir()
            java.lang.String r1 = "migration/import/sandbox"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            X.AnonymousClass1XI.A0D(r0)
            throw r3
        L_0x006a:
            java.lang.String r0 = "Unable to locate input data file '"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r8.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = "'."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NH.A03(android.os.CancellationSignal, java.io.File):void");
    }

    private void A04(C30441cM r6, String str, Throwable th) {
        Locale locale = Locale.US;
        Object[] objArr = new Object[4];
        objArr[0] = str;
        C33231iF r0 = r6.A0M;
        if (r0 == null) {
            r0 = C33231iF.A05;
        }
        objArr[1] = r0.A01;
        objArr[2] = r6.A0c();
        objArr[3] = Integer.valueOf(r6.A0G.size());
        String format = String.format(locale, "%s; key=%s, stub_type=%s, params=%d", objArr);
        StringBuilder sb = new StringBuilder(A0U);
        sb.append(format);
        Log.e(sb.toString(), th);
        if (th != null) {
            C16300so r2 = this.A00;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(format);
            sb2.append("; ex=");
            sb2.append(th);
            r2.A03("xpm-msg-importer-parsing-failed", sb2.toString(), th);
            return;
        }
        this.A00.AcB("xpm-msg-importer-parsing-failed", format, false);
    }

    public static void A05(InputStream inputStream) {
        try {
            JSONObject jSONObject = new JSONObject(new String(AnonymousClass45C.A00(inputStream), DefaultCrypto.UTF_8));
            JSONObject jSONObject2 = jSONObject.getJSONObject("header");
            AnonymousClass4OH r7 = new AnonymousClass4OH();
            r7.A00 = jSONObject2.getLong("creation_date");
            r7.A05 = jSONObject2.getString("os");
            r7.A06 = jSONObject2.getString("os_version");
            r7.A02 = jSONObject2.getString("app_name");
            r7.A03 = jSONObject2.getString("app_version");
            r7.A04 = jSONObject2.getString("format_version");
            if (jSONObject.has("messages")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("messages");
                C84524Kw r6 = new C84524Kw();
                r6.A00 = jSONObject3.getString("filename");
                r6.A01 = jSONObject3.getString("format");
                if (jSONObject3.has("chunks")) {
                    JSONArray jSONArray = jSONObject3.getJSONArray("chunks");
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i2);
                        AnonymousClass4II r2 = new AnonymousClass4II();
                        r2.A00 = jSONObject4.getInt("chunk_number");
                        r2.A01 = (long) jSONObject4.getInt("messages_count");
                        arrayList.add(r2);
                    }
                    r6.A02 = arrayList;
                }
                r7.A01 = r6;
            }
        } catch (IOException | JSONException e2) {
            throw new IOException("Unable to parse JSON header.", e2);
        }
    }

    private void A06(Map map, Map map2) {
        int i2;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            C15840rx r7 = (C15840rx) entry.getValue();
            C29941bT r3 = (C29941bT) map2.get(key);
            if (r3 != null) {
                int i3 = r3.A01;
                if ((i3 & 131072) == 131072 && r3.A0b) {
                    r7.A0C(-1, 0, 0, 0);
                } else if ((i3 & 16) == 16 && (i2 = r3.A07) > 0) {
                    long A032 = this.A0G.A03(r7.A05(), i2) - 1;
                    r7.A0C(this.A0H.A00(r7.A05(), A032), this.A0H.A01(r7.A05(), A032), i2, this.A0C.A00(r7.A05(), A032));
                }
                this.A08.A0I(r7.A04((Long) null), r7);
            }
        }
    }

    public C15840rx A07(CancellationSignal cancellationSignal, C15830rv r23, C108905Py r24, C29941bT r25, Map map, Map map2, byte[] bArr) {
        C30411cJ r0;
        long j2;
        int i2;
        C445724p r02;
        C15830rv r12 = r23;
        C15840rx A062 = this.A09.A06(r12);
        long j3 = 0;
        int i3 = 0;
        C29941bT r14 = r25;
        if (A062 == null) {
            A0N(r12, r14.A0R);
            if (r12 instanceof UserJid) {
                int i4 = r14.A01;
                if ((i4 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144 && (i4 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
                    this.A03.A00((UserJid) r12, r14.A0H.A04(), r14.A0F);
                }
                if ((r14.A01 & 33554432) == 33554432) {
                    this.A03.A07((UserJid) r12, Long.valueOf(r14.A0E));
                }
            }
            if (r14.A0I.size() > 0) {
                C30441cM r03 = ((C442223g) r14.A0I.get(0)).A03;
                if (r03 == null) {
                    r03 = C30441cM.A0l;
                }
                j2 = r03.A0A * 1000;
            } else {
                j2 = 0;
            }
            A062 = this.A09.A06(r12);
            if (A062 == null) {
                return null;
            }
            this.A08.A0I(A062.A04(Long.valueOf(j2)), A062);
            A0E(cancellationSignal, r12, r24, r14, bArr);
            if (r12 instanceof C16060sN) {
                for (C445624o r6 : r14.A0J) {
                    UserJid nullable = UserJid.getNullable(r6.A03);
                    if (nullable != null) {
                        if ((r6.A01 & 2) == 2) {
                            int i5 = r6.A02;
                            if (i5 != 0) {
                                if (i5 == 1) {
                                    r02 = C445724p.A01;
                                } else if (i5 == 2) {
                                    r02 = C445724p.A03;
                                }
                                i2 = r02.value;
                            }
                            r02 = C445724p.A02;
                            i2 = r02.value;
                        } else {
                            i2 = 0;
                        }
                        this.A0D.A08(new C30661ck(nullable, i2, false, true, true), (C16060sN) r12);
                    }
                }
            }
        }
        if ((r14.A01 & 8192) != 8192) {
            A062.A09(0);
        } else if (r14.A0c) {
            A062.A09(1);
        } else {
            A062.A09(-1);
        }
        synchronized (A062) {
            A062.A00 = 1;
        }
        synchronized (A062) {
            A062.A09 = -1;
        }
        A062.A0B(r14.A09 * 1000);
        if ((r14.A01 & 2048) == 2048) {
            String str = r14.A0R;
            synchronized (A062) {
                A062.A0d = str;
            }
        }
        int i6 = r14.A01;
        if ((i6 & 16384) == 16384) {
            A062.A0e = r14.A0X;
        }
        int i7 = (i6 & 128) == 128 ? r14.A04 : 0;
        if ((i6 & 256) == 256) {
            j3 = r14.A0B;
        }
        if ((i6 & 32768) == 32768) {
            C30391cH r04 = r14.A0K;
            if (r04 == null) {
                r04 = C30391cH.A02;
            }
            int i8 = r04.A01;
            if (i8 != 0) {
                if (i8 == 1) {
                    r0 = C30411cJ.A02;
                } else if (i8 == 2) {
                    r0 = C30411cJ.A03;
                }
                i3 = Math.min(2, Math.max(0, r0.value));
            }
            r0 = C30411cJ.A01;
            i3 = Math.min(2, Math.max(0, r0.value));
        }
        AnonymousClass1WV r1 = A062.A0X;
        A062.A0A(Math.max(r1.expiration, i7), Math.max(r1.ephemeralSettingTimestamp, j3), i3);
        map.put(r12, A062);
        map2.put(r12, r14);
        return A062;
    }

    public C16740tZ A08(C442223g r6) {
        C16740tZ r0;
        if (r6 == null) {
            this.A0L.A00("import/msg/failed").incrementAndGet();
            Log.e("MessagesImporter/Conversation message is null.");
            return null;
        }
        C30441cM r3 = r6.A03;
        if (r3 == null) {
            r3 = C30441cM.A0l;
        }
        try {
            C445124j A022 = this.A0J.A02(r3);
            if (A022 != null && (r0 = A022.A00) != null) {
                return r0;
            }
            this.A0L.A00("import/msg/failed").incrementAndGet();
            A04(r3, "Parsed WMI message is null.", (Throwable) null);
            return null;
        } catch (Exception e2) {
            this.A0L.A00("import/msg/failed").incrementAndGet();
            A04(r3, "Failed to parse message from WMI.", e2);
            return null;
        }
    }

    public File A09(String str, byte b2, boolean z2) {
        String name = new File(str).getName();
        C16180sb r2 = this.A01;
        int i2 = 2;
        if (z2) {
            i2 = 1;
        }
        return new File(r2.A0C(b2, 0, i2), name);
    }

    public void A0A() {
        throw new IOException("Unsupported build version.");
    }

    public void A0B(CancellationSignal cancellationSignal) {
        A0H(cancellationSignal, new C102984zq(this.A0K));
    }

    public void A0C(CancellationSignal cancellationSignal, C15840rx r7, C108905Py r8, C30441cM r9, C16740tZ r10, byte[] bArr) {
        A0J(cancellationSignal, r8, r10, bArr);
        if (r10.A11.A02) {
            A0M(r7, r9, r10);
        }
        if (C38621r6.A0w(r10, true)) {
            synchronized (r7) {
                r7.A0Y = r10;
            }
            long j2 = r10.A13;
            synchronized (r7) {
                r7.A0L = j2;
            }
            long j3 = r10.A14;
            synchronized (r7) {
                r7.A0M = j3;
            }
            long j4 = r10.A14;
            synchronized (r7) {
                r7.A0T = j4;
            }
            long j5 = r10.A13;
            synchronized (r7) {
                r7.A0S = j5;
            }
        }
        if (r10.A0I > r7.A02()) {
            r7.A0B(r10.A0I);
        }
    }

    public void A0D(CancellationSignal cancellationSignal, C15840rx r11, C108905Py r12, List list, byte[] bArr) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C442223g r0 = (C442223g) it.next();
            CancellationSignal cancellationSignal2 = cancellationSignal;
            cancellationSignal.throwIfCanceled();
            C16740tZ A082 = A08(r0);
            if (A082 != null) {
                C30441cM r6 = r0.A03;
                if (r6 == null) {
                    r6 = C30441cM.A0l;
                }
                A0C(cancellationSignal2, r11, r12, r6, A082, bArr);
            }
        }
    }

    public void A0E(CancellationSignal cancellationSignal, C15830rv r16, C108905Py r17, C29941bT r18, byte[] bArr) {
        C29941bT r2 = r18;
        if ((r2.A01 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) == 8388608) {
            C15830rv r3 = r16;
            if (this.A0Q.AH3(r3, true) == null) {
                C58522td r5 = r2.A0L;
                if (r5 == null) {
                    r5 = C58522td.A03;
                }
                C108905Py r4 = r17;
                byte[] bArr2 = bArr;
                A0F(cancellationSignal, r3, r4, r5, bArr2, false);
                A0F(cancellationSignal, r3, r4, r5, bArr2, true);
            }
        }
    }

    public void A0F(CancellationSignal cancellationSignal, C15830rv r12, C108905Py r13, C58522td r14, byte[] bArr, boolean z2) {
        StringBuilder sb;
        String str;
        String str2 = r14.A02;
        if (!TextUtils.isEmpty(str2)) {
            String A082 = this.A04.A08(new File(str2));
            try {
                File A092 = A09(A082, (byte) 1, true);
                if (!A092.exists()) {
                    try {
                        A0L(cancellationSignal, r13, A092, A082, bArr);
                        this.A0L.A00("import/msg/file/success").incrementAndGet();
                    } catch (IOException e2) {
                        e = e2;
                        this.A0L.A00("import/msg/file/failed").incrementAndGet();
                        sb = new StringBuilder();
                        str = "MessagesImporter/cannot import file for wallpaper, file=";
                        sb.append(str);
                        sb.append(A082);
                        Log.e(sb.toString(), e);
                    }
                }
                try {
                    C40931uv r2 = new C40931uv(Integer.valueOf((r14.A00 & 2) == 2 ? r14.A01 : 100), "USER_PROVIDED", A092.getCanonicalPath());
                    C16220sf r1 = (C16220sf) this.A0Q;
                    AnonymousClass1WS A032 = r12 == null ? r1.A03() : r1.A07(r12.getRawString());
                    if (z2) {
                        A032.A05 = r2;
                    } else {
                        A032.A06 = r2;
                    }
                    r1.A0K(A032);
                } catch (IOException e3) {
                    e = e3;
                    sb = new StringBuilder();
                    str = "MessagesImporter/cannot get path for imported file, file=";
                    sb.append(str);
                    sb.append(A082);
                    Log.e(sb.toString(), e);
                }
            } catch (IOException e4) {
                e = e4;
                sb = new StringBuilder();
                str = "MessagesImporter/cannot get corrected media file for wallpaper, file=";
                sb.append(str);
                sb.append(A082);
                Log.e(sb.toString(), e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009e, code lost:
        r17 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(android.os.CancellationSignal r26, X.C84524Kw r27, X.C108905Py r28, java.lang.String r29) {
        /*
            r25 = this;
            java.lang.String r10 = "Failed to parse serialized messages file."
            java.lang.String r16 = "MessagesImporter/Failed to parse serialized messages file."
            r13 = r27
            java.util.List r0 = r13.A02
            if (r0 == 0) goto L_0x0107
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0107
            r0 = 131072(0x20000, float:1.83671E-40)
            byte[] r12 = new byte[r0]
            java.util.List r0 = r13.A02
            int r11 = A01(r0)
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.TreeMap r7 = new java.util.TreeMap
            r7.<init>()
            java.lang.String r0 = r13.A00
            r1 = r29
            java.io.InputStream r6 = A02(r1, r0)
            r5 = 0
            r4 = 0
        L_0x0033:
            java.util.List r0 = r13.A02     // Catch:{ all -> 0x0102 }
            int r0 = r0.size()     // Catch:{ all -> 0x0102 }
            r3 = r25
            if (r4 >= r0) goto L_0x00f8
            java.util.List r0 = r13.A02     // Catch:{ all -> 0x0102 }
            r0.get(r4)     // Catch:{ all -> 0x0102 }
            X.1bP r0 = X.C29901bP.A0D     // Catch:{ IOException -> 0x00ec }
            X.1Wm r2 = X.C28541Wm.A0D(r0, r6)     // Catch:{ IOException -> 0x00ec }
            X.1bP r2 = (X.C29901bP) r2     // Catch:{ IOException -> 0x00ec }
            if (r2 == 0) goto L_0x00e3
            r18 = r26
            r20 = r28
            if (r4 != 0) goto L_0x0059
            r1 = r18
            r0 = r20
            r3.A0I(r1, r0, r2, r12)     // Catch:{ all -> 0x0102 }
        L_0x0059:
            r1 = 0
        L_0x005a:
            X.1XE r0 = r2.A07     // Catch:{ all -> 0x0102 }
            int r0 = r0.size()     // Catch:{ all -> 0x0102 }
            if (r1 >= r0) goto L_0x00df
            X.1XE r0 = r2.A07     // Catch:{ all -> 0x0102 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0102 }
            X.1bT r0 = (X.C29941bT) r0     // Catch:{ all -> 0x0102 }
            boolean r14 = r3.A0T(r0)     // Catch:{ all -> 0x0102 }
            if (r14 == 0) goto L_0x0096
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0102 }
            r14.<init>()     // Catch:{ all -> 0x0102 }
            java.lang.String r15 = "MessagesImporter/Skipping chat, messages count: "
            r14.append(r15)     // Catch:{ all -> 0x0102 }
            X.1XE r0 = r0.A0I     // Catch:{ all -> 0x0102 }
            int r0 = r0.size()     // Catch:{ all -> 0x0102 }
            r14.append(r0)     // Catch:{ all -> 0x0102 }
            java.lang.String r0 = r14.toString()     // Catch:{ all -> 0x0102 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0102 }
            X.1NI r14 = r3.A0L     // Catch:{ all -> 0x0102 }
            java.lang.String r0 = "import/chat/skipped"
            java.util.concurrent.atomic.AtomicInteger r0 = r14.A00(r0)     // Catch:{ all -> 0x0102 }
            r0.incrementAndGet()     // Catch:{ all -> 0x0102 }
            goto L_0x00db
        L_0x0096:
            java.lang.String r14 = r0.A0P     // Catch:{ all -> 0x0102 }
            X.0rv r19 = X.C15830rv.A02(r14)     // Catch:{ all -> 0x0102 }
            if (r19 == 0) goto L_0x00db
            r22 = r9
            r23 = r8
            r24 = r12
            r21 = r0
            r17 = r3
            X.0rx r19 = r17.A07(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0102 }
            if (r19 == 0) goto L_0x00db
            X.1XE r14 = r0.A0I     // Catch:{ all -> 0x0102 }
            r21 = r14
            r22 = r12
            r17.A0D(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0102 }
            r3.A0P(r0, r7)     // Catch:{ all -> 0x0102 }
            X.1XE r0 = r0.A0I     // Catch:{ all -> 0x0102 }
            int r0 = r0.size()     // Catch:{ all -> 0x0102 }
            int r5 = r5 + r0
            X.1Po r0 = r3.A0M     // Catch:{ all -> 0x0102 }
            java.lang.Iterable r0 = r0.A01()     // Catch:{ all -> 0x0102 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x0102 }
        L_0x00cb:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0102 }
            if (r0 == 0) goto L_0x00db
            java.lang.Object r0 = r14.next()     // Catch:{ all -> 0x0102 }
            X.5Pw r0 = (X.C108885Pw) r0     // Catch:{ all -> 0x0102 }
            r0.AS8(r5, r11)     // Catch:{ all -> 0x0102 }
            goto L_0x00cb
        L_0x00db:
            int r1 = r1 + 1
            goto L_0x005a
        L_0x00df:
            int r4 = r4 + 1
            goto L_0x0033
        L_0x00e3:
            com.whatsapp.util.Log.e((java.lang.String) r16)     // Catch:{ all -> 0x0102 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0102 }
            r0.<init>(r10)     // Catch:{ all -> 0x0102 }
            goto L_0x00f7
        L_0x00ec:
            r1 = move-exception
            r0 = r16
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0102 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0102 }
            r0.<init>(r10, r1)     // Catch:{ all -> 0x0102 }
        L_0x00f7:
            throw r0     // Catch:{ all -> 0x0102 }
        L_0x00f8:
            r6.close()
            r3.A06(r9, r8)
            r3.A0S(r7)
            return
        L_0x0102:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0106 }
        L_0x0106:
            throw r0
        L_0x0107:
            java.lang.String r0 = "MessagesImporter/Messages chunks are not specified."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r1 = "Messages chunks are not specified."
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NH.A0G(android.os.CancellationSignal, X.4Kw, X.5Py, java.lang.String):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00c8 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:13:0x00a0=Splitter:B:13:0x00a0, B:29:0x00c8=Splitter:B:29:0x00c8} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(android.os.CancellationSignal r10, X.C108905Py r11) {
        /*
            r9 = this;
            java.lang.String r0 = "migration/messages_export.zip"
            java.io.File r0 = r11.ACE(r0)
            java.lang.String r3 = r0.getAbsolutePath()
            java.lang.String r0 = "header.json"
            java.io.InputStream r8 = A02(r3, r0)     // Catch:{ IOException -> 0x00c9 }
            byte[] r2 = X.AnonymousClass45C.A00(r8)     // Catch:{ IOException | JSONException -> 0x00bb }
            java.lang.String r1 = "UTF-8"
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException | JSONException -> 0x00bb }
            r0.<init>(r2, r1)     // Catch:{ IOException | JSONException -> 0x00bb }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ IOException | JSONException -> 0x00bb }
            r4.<init>(r0)     // Catch:{ IOException | JSONException -> 0x00bb }
            java.lang.String r0 = "header"
            org.json.JSONObject r1 = r4.getJSONObject(r0)     // Catch:{ IOException | JSONException -> 0x00bb }
            r2 = 0
            java.lang.String r0 = "creation_date"
            r1.getLong(r0)     // Catch:{ IOException | JSONException -> 0x00bb }
            java.lang.String r0 = "os"
            r1.getString(r0)     // Catch:{ IOException | JSONException -> 0x00bb }
            java.lang.String r0 = "os_version"
            r1.getString(r0)     // Catch:{ IOException | JSONException -> 0x00bb }
            java.lang.String r0 = "app_name"
            r1.getString(r0)     // Catch:{ IOException | JSONException -> 0x00bb }
            java.lang.String r0 = "app_version"
            r1.getString(r0)     // Catch:{ IOException | JSONException -> 0x00bb }
            java.lang.String r0 = "format_version"
            r1.getString(r0)     // Catch:{ IOException | JSONException -> 0x00bb }
            java.lang.String r1 = "messages"
            boolean r0 = r4.has(r1)     // Catch:{ IOException | JSONException -> 0x00bb }
            if (r0 == 0) goto L_0x00a0
            org.json.JSONObject r4 = r4.getJSONObject(r1)     // Catch:{ IOException | JSONException -> 0x00bb }
            X.4Kw r2 = new X.4Kw     // Catch:{ IOException | JSONException -> 0x00bb }
            r2.<init>()     // Catch:{ IOException | JSONException -> 0x00bb }
            java.lang.String r0 = "filename"
            java.lang.String r0 = r4.getString(r0)     // Catch:{ IOException | JSONException -> 0x00bb }
            r2.A00 = r0     // Catch:{ IOException | JSONException -> 0x00bb }
            java.lang.String r0 = "format"
            java.lang.String r0 = r4.getString(r0)     // Catch:{ IOException | JSONException -> 0x00bb }
            r2.A01 = r0     // Catch:{ IOException | JSONException -> 0x00bb }
            java.lang.String r1 = "chunks"
            boolean r0 = r4.has(r1)     // Catch:{ IOException | JSONException -> 0x00bb }
            if (r0 == 0) goto L_0x00a0
            org.json.JSONArray r7 = r4.getJSONArray(r1)     // Catch:{ IOException | JSONException -> 0x00bb }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ IOException | JSONException -> 0x00bb }
            r6.<init>()     // Catch:{ IOException | JSONException -> 0x00bb }
            r5 = 0
        L_0x0078:
            int r0 = r7.length()     // Catch:{ IOException | JSONException -> 0x00bb }
            if (r5 >= r0) goto L_0x009e
            org.json.JSONObject r1 = r7.getJSONObject(r5)     // Catch:{ IOException | JSONException -> 0x00bb }
            X.4II r4 = new X.4II     // Catch:{ IOException | JSONException -> 0x00bb }
            r4.<init>()     // Catch:{ IOException | JSONException -> 0x00bb }
            java.lang.String r0 = "chunk_number"
            int r0 = r1.getInt(r0)     // Catch:{ IOException | JSONException -> 0x00bb }
            r4.A00 = r0     // Catch:{ IOException | JSONException -> 0x00bb }
            java.lang.String r0 = "messages_count"
            int r0 = r1.getInt(r0)     // Catch:{ IOException | JSONException -> 0x00bb }
            long r0 = (long) r0     // Catch:{ IOException | JSONException -> 0x00bb }
            r4.A01 = r0     // Catch:{ IOException | JSONException -> 0x00bb }
            r6.add(r4)     // Catch:{ IOException | JSONException -> 0x00bb }
            int r5 = r5 + 1
            goto L_0x0078
        L_0x009e:
            r2.A02 = r6     // Catch:{ IOException | JSONException -> 0x00bb }
        L_0x00a0:
            r8.close()     // Catch:{ IOException -> 0x00c9 }
            if (r2 == 0) goto L_0x00ba
            java.lang.String r0 = r2.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00ba
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "protobuf"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x00ba
            r9.A0G(r10, r2, r11, r3)
        L_0x00ba:
            return
        L_0x00bb:
            r2 = move-exception
            java.lang.String r1 = "Unable to parse JSON header."
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00c4 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00c4 }
            throw r0     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            throw r0     // Catch:{ IOException -> 0x00c9 }
        L_0x00c9:
            r3 = move-exception
            r2 = 202(0xca, float:2.83E-43)
            java.lang.String r1 = "Unable to locate header metadata file in messages archive."
            X.40S r0 = new X.40S
            r0.<init>(r1, r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NH.A0H(android.os.CancellationSignal, X.5Py):void");
    }

    public void A0I(CancellationSignal cancellationSignal, C108905Py r15, C29901bP r16, byte[] bArr) {
        C29901bP r2 = r16;
        if ((r2.A01 & 8) == 8) {
            C58962uR r3 = r2.A0C;
            if (r3 == null) {
                r3 = C58962uR.A0C;
            }
            CancellationSignal cancellationSignal2 = cancellationSignal;
            C108905Py r9 = r15;
            byte[] bArr2 = bArr;
            if ((r3.A00 & 1) == 1) {
                C58522td r10 = r3.A09;
                if (r10 == null) {
                    r10 = C58522td.A03;
                }
                A0F(cancellationSignal2, (C15830rv) null, r9, r10, bArr2, false);
            }
            if ((r3.A00 & 4) == 4) {
                C58522td r102 = r3.A08;
                if (r102 == null) {
                    r102 = C58522td.A03;
                }
                A0F(cancellationSignal2, (C15830rv) null, r9, r102, bArr2, true);
            }
            boolean z2 = false;
            if ((r3.A00 & 2) == 2) {
                z2 = true;
            }
            if (z2) {
                AnonymousClass430 A002 = AnonymousClass430.A00(r3.A02);
                if (A002 == null) {
                    A002 = AnonymousClass430.A01;
                }
                if (A002 != AnonymousClass430.A01) {
                    C16220sf r4 = this.A0P;
                    int i2 = A002 == AnonymousClass430.A03 ? 2 : 1;
                    AnonymousClass1WS A072 = r4.A07("individual_chat_defaults");
                    if (i2 != A072.A01) {
                        A072.A01 = i2;
                        r4.A0K(A072);
                    }
                }
            }
            if ((r3.A00 & 8) == 8) {
                C15860rz r1 = this.A06;
                C58792u7 r0 = r3.A06;
                if (r0 == null) {
                    r0 = C58792u7.A05;
                }
                r1.A0K().putInt("autodownload_wifi_mask", A00(r0)).apply();
            }
            if ((r3.A00 & 16) == 16) {
                C15860rz r12 = this.A06;
                C58792u7 r02 = r3.A04;
                if (r02 == null) {
                    r02 = C58792u7.A05;
                }
                r12.A0K().putInt("autodownload_cellular_mask", A00(r02)).apply();
            }
            if ((r3.A00 & 32) == 32) {
                C15860rz r13 = this.A06;
                C58792u7 r03 = r3.A05;
                if (r03 == null) {
                    r03 = C58792u7.A05;
                }
                r13.A0K().putInt("autodownload_roaming_mask", A00(r03)).apply();
            }
            if ((r3.A00 & 64) == 64) {
                C16220sf r42 = this.A0P;
                boolean z3 = !r3.A0B;
                AnonymousClass1WS A073 = r42.A07("individual_chat_defaults");
                if (z3 != A073.A0E) {
                    A073.A0E = z3;
                    r42.A0K(A073);
                }
            }
            if ((r3.A00 & 128) == 128) {
                C16220sf r22 = this.A0P;
                boolean z4 = true ^ r3.A0A;
                AnonymousClass1WS A074 = r22.A07("group_chat_defaults");
                if (z4 != A074.A0E) {
                    A074.A0E = z4;
                    r22.A0K(A074);
                }
            }
            if ((r3.A00 & 1024) == 1024) {
                C58512tc r04 = r3.A07;
                if (r04 == null) {
                    r04 = C58512tc.A03;
                }
                A0O(r04);
            }
        }
    }

    public void A0J(CancellationSignal cancellationSignal, C108905Py r6, C16740tZ r7, byte[] bArr) {
        try {
            r7.A0S(16384);
            if (r7 instanceof C16730tY) {
                A0K(cancellationSignal, r6, (C16730tY) r7, bArr);
            } else if (r7 instanceof AnonymousClass1WU) {
                A0R((AnonymousClass1WU) r7);
            }
            C16740tZ A0D2 = r7.A0D();
            if (A0D2 != null && (A0D2 instanceof C16730tY)) {
                A0K(cancellationSignal, r6, (C16730tY) A0D2, bArr);
            }
            if (r7.A04 > 0) {
                this.A0B.A02(r7, r7.A0I);
            }
            this.A0A.A0X(r7);
            this.A0L.A00("import/msg/success").incrementAndGet();
            A0Q(r7);
        } catch (Exception e2) {
            this.A0L.A00("import/msg/failed").incrementAndGet();
            Log.e("MessagesImporter/Failed to insert message.", e2);
            C16300so r2 = this.A00;
            StringBuilder sb = new StringBuilder("Failed to insert message: ");
            sb.append(e2.toString());
            r2.A03("xpm-msg-importer-insert-failed", sb.toString(), e2);
        }
    }

    public void A0K(CancellationSignal cancellationSignal, C108905Py r14, C16730tY r15, byte[] bArr) {
        File file;
        boolean z2;
        C16750ta r3 = r15.A02;
        if (r3 != null && (file = r3.A0F) != null) {
            String A082 = this.A04.A08(file);
            File A092 = A09(A082, r15.A10, r15.A11.A02);
            if (!A092.exists()) {
                try {
                    A0L(cancellationSignal, r14, A092, A082, bArr);
                    this.A0L.A00("import/msg/file/success").incrementAndGet();
                } catch (IOException e2) {
                    this.A0L.A00("import/msg/file/failed").incrementAndGet();
                    StringBuilder sb = new StringBuilder("MessagesImporter/processMediaMessage; cannot import file for message, file=");
                    sb.append(A082);
                    Log.e(sb.toString(), e2);
                    z2 = true;
                }
            }
            z2 = false;
            if (!A092.exists() || z2) {
                r3.A0F = null;
                r3.A0P = false;
                return;
            }
            this.A02.A05(A092, 1, true);
            r3.A0F = A092;
            r3.A0P = true;
        }
    }

    public void A0L(CancellationSignal cancellationSignal, C108905Py r4, File file, String str, byte[] bArr) {
        this.A0N.A03(cancellationSignal, r4.ACE(str), file, bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0055, code lost:
        if (r8 < r16.A01("migration_receipt_index", 0)) goto L_0x0057;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x010e */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ad A[SYNTHETIC, Splitter:B:85:0x01ad] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x000b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0M(X.C15840rx r25, X.C30441cM r26, X.C16740tZ r27) {
        /*
            r24 = this;
            java.lang.String r22 = "xpm-failed-receipt-import"
            r0 = r26
            X.1XE r0 = r0.A0J
            java.util.Iterator r21 = r0.iterator()
        L_0x000b:
            boolean r0 = r21.hasNext()
            if (r0 == 0) goto L_0x01d7
            java.lang.Object r13 = r21.next()
            X.23i r13 = (X.C442423i) r13
            r11 = r24
            r12 = r27
            X.1Pq r0 = r11.A0F     // Catch:{ SQLiteConstraintException -> 0x010f }
            r23 = r0
            long r8 = r12.A13     // Catch:{ SQLiteConstraintException -> 0x010f }
            java.lang.String r0 = r13.A07     // Catch:{ SQLiteConstraintException -> 0x010f }
            com.whatsapp.jid.UserJid r14 = com.whatsapp.jid.UserJid.getNullable(r0)     // Catch:{ SQLiteConstraintException -> 0x010f }
            long r6 = r13.A04     // Catch:{ SQLiteConstraintException -> 0x010f }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r0
            long r4 = r13.A03     // Catch:{ SQLiteConstraintException -> 0x010f }
            long r4 = r4 * r0
            long r2 = r13.A02     // Catch:{ SQLiteConstraintException -> 0x010f }
            long r2 = r2 * r0
            r0 = r23
            X.11I r0 = r0.A03     // Catch:{ SQLiteConstraintException -> 0x010f }
            r16 = r0
            java.lang.String r10 = "receipt_user_ready"
            r20 = 0
            r1 = 0
            int r1 = r0.A00(r10, r1)     // Catch:{ SQLiteConstraintException -> 0x010f }
            r0 = 2
            if (r1 == r0) goto L_0x0057
            r0 = 0
            int r10 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x0120
            java.lang.String r10 = "migration_receipt_index"
            r15 = r10
            r10 = r16
            long r15 = r10.A01(r15, r0)     // Catch:{ SQLiteConstraintException -> 0x010f }
            int r0 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0120
        L_0x0057:
            r0 = r23
            X.21M r10 = r0.A00(r8)     // Catch:{ SQLiteConstraintException -> 0x010f }
            r1 = 5
            r18 = 0
            int r0 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x0069
            boolean r15 = r10.A00(r14, r1, r6)     // Catch:{ SQLiteConstraintException -> 0x010f }
            goto L_0x006a
        L_0x0069:
            r15 = 0
        L_0x006a:
            int r0 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x0075
            r0 = 13
            boolean r0 = r10.A00(r14, r0, r4)     // Catch:{ SQLiteConstraintException -> 0x010f }
            r15 = r15 | r0
        L_0x0075:
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x0080
            r0 = 8
            boolean r0 = r10.A00(r14, r0, r2)     // Catch:{ SQLiteConstraintException -> 0x010f }
            r15 = r15 | r0
        L_0x0080:
            if (r15 == 0) goto L_0x0120
            r0 = r23
            X.14v r0 = r0.A01     // Catch:{ SQLiteConstraintException -> 0x010f }
            long r16 = r0.A01(r14)     // Catch:{ SQLiteConstraintException -> 0x010f }
            r14 = -1
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            r10 = 0
            if (r0 == 0) goto L_0x0092
            r10 = 1
        L_0x0092:
            java.lang.String r0 = "invalid jid"
            X.AnonymousClass00B.A0D(r0, r10)     // Catch:{ SQLiteConstraintException -> 0x010f }
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ SQLiteConstraintException -> 0x010f }
            r10.<init>(r1)     // Catch:{ SQLiteConstraintException -> 0x010f }
            java.lang.Long r1 = java.lang.Long.valueOf(r8)     // Catch:{ SQLiteConstraintException -> 0x010f }
            java.lang.String r0 = "message_row_id"
            r10.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x010f }
            java.lang.Long r1 = java.lang.Long.valueOf(r16)     // Catch:{ SQLiteConstraintException -> 0x010f }
            java.lang.String r0 = "receipt_user_jid_row_id"
            r10.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x010f }
            int r0 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bb
            java.lang.Long r1 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteConstraintException -> 0x010f }
            java.lang.String r0 = "receipt_timestamp"
            r10.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x010f }
        L_0x00bb:
            int r0 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c8
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteConstraintException -> 0x010f }
            java.lang.String r0 = "read_timestamp"
            r10.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x010f }
        L_0x00c8:
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d5
            java.lang.Long r1 = java.lang.Long.valueOf(r2)     // Catch:{ SQLiteConstraintException -> 0x010f }
            java.lang.String r0 = "played_timestamp"
            r10.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x010f }
        L_0x00d5:
            r0 = r23
            X.0tq r0 = r0.A02     // Catch:{ SQLiteConstraintException -> 0x010f }
            X.0tf r3 = r0.A02()     // Catch:{ SQLiteConstraintException -> 0x010f }
            X.0tg r6 = r3.A02     // Catch:{ all -> 0x010a }
            java.lang.String r5 = "receipt_user"
            java.lang.String r4 = "message_row_id = ? AND receipt_user_jid_row_id = ?"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x010a }
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x010a }
            r2[r20] = r0     // Catch:{ all -> 0x010a }
            java.lang.String r1 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x010a }
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x010a }
            int r0 = r6.A00(r5, r10, r4, r2)     // Catch:{ all -> 0x010a }
            if (r0 > 0) goto L_0x0106
            long r1 = r6.A02(r10, r5)     // Catch:{ all -> 0x010a }
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0106
            java.lang.String r0 = "ReceiptUserStore/insertOrUpdateEntireUserReceiptForMessage/insert failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x010a }
        L_0x0106:
            r3.close()     // Catch:{ SQLiteConstraintException -> 0x010f }
            goto L_0x0120
        L_0x010a:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x010e }
        L_0x010e:
            throw r0     // Catch:{ SQLiteConstraintException -> 0x010f }
        L_0x010f:
            r3 = move-exception
            java.lang.String r0 = "MessagesImporter/Failed to insert user receipt."
            com.whatsapp.util.Log.e(r0, r3)
            X.0so r2 = r11.A00
            java.lang.String r1 = r3.toString()
            r0 = r22
            r2.A03(r0, r1, r3)
        L_0x0120:
            long r3 = r13.A03
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0136
            long r0 = r12.A13
            r2 = r25
            monitor-enter(r2)
            r2.A0P = r0     // Catch:{ all -> 0x01d4 }
            monitor-exit(r2)
            long r0 = r12.A14
            monitor-enter(r2)
            r2.A0Q = r0     // Catch:{ all -> 0x01d4 }
            monitor-exit(r2)
        L_0x0136:
            X.1XE r0 = r13.A06
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0165
            X.1XE r0 = r13.A06
            int r0 = r0.size()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r0)
            X.1XE r0 = r13.A06
            java.util.Iterator r1 = r0.iterator()
        L_0x014f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x016a
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.getNullable(r0)
            if (r0 == 0) goto L_0x014f
            r4.add(r0)
            goto L_0x014f
        L_0x0165:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
        L_0x016a:
            X.1XE r0 = r13.A05
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01a7
            X.1XE r0 = r13.A05
            java.util.Iterator r5 = r0.iterator()
        L_0x0178:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x01a7
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            com.whatsapp.jid.DeviceJid r3 = com.whatsapp.jid.DeviceJid.getNullable(r0)
            if (r3 == 0) goto L_0x0178
            r4.remove(r3)
            X.16V r2 = r11.A0E     // Catch:{ SQLiteConstraintException -> 0x0195 }
            long r0 = r12.A0I     // Catch:{ SQLiteConstraintException -> 0x0195 }
            r2.A01(r3, r12, r0)     // Catch:{ SQLiteConstraintException -> 0x0195 }
            goto L_0x0178
        L_0x0195:
            r3 = move-exception
            java.lang.String r0 = "MessagesImporter/Failed to insert device receipt."
            com.whatsapp.util.Log.e(r0, r3)
            X.0so r2 = r11.A00
            java.lang.String r1 = r3.toString()
            r0 = r22
            r2.A03(r0, r1, r3)
            goto L_0x0178
        L_0x01a7:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x000b
            X.16V r1 = r11.A0E     // Catch:{ SQLiteConstraintException -> 0x01c1 }
            boolean r0 = r12 instanceof X.C38541qx     // Catch:{ SQLiteConstraintException -> 0x01c1 }
            if (r0 == 0) goto L_0x01be
            X.179 r1 = r1.A01     // Catch:{ SQLiteConstraintException -> 0x01c1 }
        L_0x01b5:
            r4.size()     // Catch:{ SQLiteConstraintException -> 0x01c1 }
            r0 = 0
            r1.A02(r12, r4, r0)     // Catch:{ SQLiteConstraintException -> 0x01c1 }
            goto L_0x000b
        L_0x01be:
            X.17B r1 = r1.A02     // Catch:{ SQLiteConstraintException -> 0x01c1 }
            goto L_0x01b5
        L_0x01c1:
            r3 = move-exception
            java.lang.String r0 = "MessagesImporter/Failed to insert blank device receipt."
            com.whatsapp.util.Log.e(r0, r3)
            X.0so r2 = r11.A00
            java.lang.String r1 = r3.toString()
            r0 = r22
            r2.A03(r0, r1, r3)
            goto L_0x000b
        L_0x01d4:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NH.A0M(X.0rx, X.1cM, X.0tZ):void");
    }

    public void A0N(C15830rv r7, String str) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.A07.A05(r7, new RunnableRunnableShape6S0100000_I0_5(countDownLatch, 33), str);
        try {
            countDownLatch.await(30, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            Log.e("MessagesImporter/Chat creation interrupted.", e2);
        }
        if (countDownLatch.getCount() > 0) {
            StringBuilder sb = new StringBuilder("Failed to create chat for ");
            sb.append(r7);
            throw new AnonymousClass40S(1, sb.toString());
        }
    }

    public void A0O(C58512tc r7) {
        if (r7 != null) {
            int i2 = r7.A00;
            if ((i2 & 1) == 1 && (i2 & 2) == 2) {
                C35301lh r5 = new C35301lh(new C53852gP(), Long.class, Long.valueOf(Long.parseLong(r7.A01)), "WaFbid");
                C35301lh r0 = new C35301lh(new C53852gP(), String.class, r7.A02, "WaFbPassword");
                C17330uu r3 = this.A0O;
                r3.A02(new AnonymousClass2HX(r5, r0), new IDxUCallbackShape360S0100000_2_I0(r3, 2));
            }
        }
    }

    public void A0P(C29941bT r8, Map map) {
        int i2;
        C15830rv A022 = C15830rv.A02(r8.A0P);
        AnonymousClass00B.A06(A022);
        if ((r8.A01 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) == 2097152 && (i2 = r8.A06) > 0) {
            map.put(Integer.valueOf(i2), A022);
        }
        if ((r8.A01 & 4194304) == 4194304) {
            long j2 = r8.A0D;
            if (j2 > 0) {
                j2 *= 1000;
            }
            if (j2 != 0) {
                this.A0P.A0S(A022, j2, false);
            }
        }
        if ((r8.A01 & 16777216) == 16777216) {
            AnonymousClass430 A002 = AnonymousClass430.A00(r8.A05);
            if (A002 == null) {
                A002 = AnonymousClass430.A01;
            }
            if (A002 != AnonymousClass430.A01) {
                C16220sf r3 = this.A0P;
                int i3 = A002.value;
                AnonymousClass1WS A072 = r3.A07(A022.getRawString());
                if (i3 != A072.A01) {
                    A072.A01 = i3;
                    r3.A0K(A072);
                }
            }
        }
    }

    public void A0Q(C16740tZ r5) {
        int i2 = r5.A07;
        if (i2 != 0) {
            AnonymousClass23T r2 = r5.A0W;
            if ((i2 & 1) == 1 && r2 != null) {
                for (C38541qx A012 : r2.A02()) {
                    this.A0I.A01(A012, false);
                }
            }
        }
    }

    public void A0R(AnonymousClass1WU r3) {
        int i2 = r3.A00;
        if ((i2 == 11 || i2 == 9) && TextUtils.isEmpty(r3.A0I())) {
            C15810rt r1 = this.A09;
            C15830rv r0 = r3.A11.A00;
            AnonymousClass00B.A06(r0);
            r3.A0k(r1.A09(r0));
        }
    }

    public void A0S(TreeMap treeMap) {
        long A002 = this.A05.A00();
        for (Number number : treeMap.descendingKeySet()) {
            int intValue = number.intValue();
            Object obj = treeMap.get(number);
            AnonymousClass00B.A06(obj);
            C15830rv r8 = (C15830rv) obj;
            C16220sf r7 = this.A0P;
            long j2 = A002 - ((long) intValue);
            boolean z2 = false;
            if (j2 > 0) {
                z2 = true;
            }
            AnonymousClass00B.A0B("Pinned time should be strictly positive", z2);
            r7.A08(r8, j2, true);
        }
    }

    public boolean A0T(C29941bT r5) {
        AnonymousClass1XE<C442223g> r3 = r5.A0I;
        if (r3.size() <= 3) {
            for (C442223g A082 : r3) {
                C16740tZ A083 = A08(A082);
                if (A083 == null || (A083 instanceof AnonymousClass1WU)) {
                }
            }
            return true;
        }
        return false;
    }
}
