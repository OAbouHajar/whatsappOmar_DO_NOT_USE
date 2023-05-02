package X;

import android.support.v4.view.GravityCompat;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Bb  reason: invalid class name and case insensitive filesystem */
public class C23251Bb {
    public final AnonymousClass1CG A00;
    public final AnonymousClass129 A01;
    public final AnonymousClass1G1 A02;
    public final C16300so A03;
    public final C16180sb A04;
    public final C16040sK A05;
    public final C16600tK A06;
    public final AnonymousClass15P A07;
    public final C19670yo A08;
    public final AnonymousClass1RG A09;
    public final AnonymousClass1OL A0A;
    public final AnonymousClass1RE A0B;
    public final AnonymousClass1SS A0C;
    public final C18260wP A0D;
    public final C17030uP A0E;
    public final C16190sc A0F;
    public final AnonymousClass01V A0G;
    public final C16980tz A0H;
    public final C16260sj A0I;
    public final C15860rz A0J;
    public final C16250si A0K;
    public final C16900tq A0L;
    public final AnonymousClass11I A0M;
    public final C19410yO A0N;
    public final AnonymousClass11E A0O;
    public final C14710pd A0P;
    public final C17990vy A0Q;
    public final AnonymousClass12X A0R;
    public final C17690vU A0S;
    public final AnonymousClass16S A0T;
    public final C18090w8 A0U;
    public final C18990xa A0V;
    public final C18580wv A0W;
    public final C16220sf A0X;
    public final AnonymousClass1TB A0Y;
    public final C27831Th A0Z;
    public final C27821Tg A0a;
    public final C17660vR A0b;
    public final AnonymousClass01D A0c;

    public C23251Bb(AnonymousClass1CG r2, AnonymousClass129 r3, AnonymousClass1G1 r4, C16300so r5, C16180sb r6, C16040sK r7, C16600tK r8, AnonymousClass15P r9, C19670yo r10, AnonymousClass1RG r11, AnonymousClass1OL r12, AnonymousClass1RE r13, AnonymousClass1SS r14, C18260wP r15, C17030uP r16, C16190sc r17, AnonymousClass01V r18, C16980tz r19, C16260sj r20, C15860rz r21, C16250si r22, C16900tq r23, AnonymousClass11I r24, C19410yO r25, AnonymousClass11E r26, C14710pd r27, C17990vy r28, AnonymousClass12X r29, C17690vU r30, AnonymousClass16S r31, C18090w8 r32, C18990xa r33, C18580wv r34, C16220sf r35, AnonymousClass1TB r36, C27831Th r37, C27821Tg r38, C17660vR r39, AnonymousClass01D r40) {
        this.A0H = r19;
        this.A0P = r27;
        this.A03 = r5;
        this.A05 = r7;
        this.A0b = r39;
        this.A04 = r6;
        this.A0F = r17;
        this.A0a = r38;
        this.A00 = r2;
        this.A0V = r33;
        this.A07 = r9;
        this.A0G = r18;
        this.A02 = r4;
        this.A06 = r8;
        this.A0X = r35;
        this.A0T = r31;
        this.A0M = r24;
        this.A0K = r22;
        this.A01 = r3;
        this.A0L = r23;
        this.A0E = r16;
        this.A0I = r20;
        this.A0J = r21;
        this.A0c = r40;
        this.A0B = r13;
        this.A0U = r32;
        this.A0W = r34;
        this.A0A = r12;
        this.A0N = r25;
        this.A0S = r30;
        this.A0O = r26;
        this.A0D = r15;
        this.A0Y = r36;
        this.A0C = r14;
        this.A08 = r10;
        this.A0R = r29;
        this.A09 = r11;
        this.A0Q = r28;
        this.A0Z = r37;
    }

    public static void A00(String str, Object obj, Object obj2) {
        if (obj2 instanceof JSONObject) {
            try {
                ((JSONObject) obj2).put(str, obj);
            } catch (JSONException e2) {
                Log.e("debug-builder/json/error ", e2);
            }
        } else if (obj2 instanceof StringBuilder) {
            StringBuilder sb = (StringBuilder) obj2;
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    public static final boolean A01(File file) {
        if (!new File(file, ".nomedia").exists()) {
            return false;
        }
        StringBuilder sb = new StringBuilder("debug-builder/unexpected .nomedia in ");
        sb.append(file.getName());
        Log.w(sb.toString());
        return true;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x008d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File A02(java.io.File r12, boolean r13, boolean r14, boolean r15) {
        /*
            r11 = this;
            if (r13 == 0) goto L_0x0032
            r0 = 3
            java.util.ArrayList r2 = com.whatsapp.util.Log.getLatestLogs(r0)
        L_0x0007:
            if (r12 == 0) goto L_0x000c
            r2.add(r12)
        L_0x000c:
            if (r14 == 0) goto L_0x001a
            X.0tz r0 = r11.A0H
            java.io.File[] r1 = X.C205810s.A00(r0)
            int r0 = r1.length
            if (r0 <= 0) goto L_0x002c
            java.util.Collections.addAll(r2, r1)
        L_0x001a:
            int r0 = r2.size()
            r10 = 0
            if (r0 == 0) goto L_0x00b7
            if (r15 == 0) goto L_0x0038
            X.0sb r1 = r11.A04
            java.lang.String r0 = "logs"
            java.io.File r6 = r1.A0M(r0)
            goto L_0x0040
        L_0x002c:
            java.lang.String r0 = "debug-builder/getZippedInfoFiles no ANR traces to send"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x001a
        L_0x0032:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            goto L_0x0007
        L_0x0038:
            X.0sc r1 = r11.A0F
            java.lang.String r0 = "logs.zip"
            java.io.File r6 = r1.A07(r0)
        L_0x0040:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00b1 }
            r1.<init>(r6)     // Catch:{ IOException -> 0x00b1 }
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x00b1 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00b1 }
            java.util.zip.ZipOutputStream r5 = new java.util.zip.ZipOutputStream     // Catch:{ IOException -> 0x00b1 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x00b1 }
            r4 = 16384(0x4000, float:2.2959E-41)
            byte[] r3 = new byte[r4]     // Catch:{ all -> 0x00ac }
            java.util.Iterator r9 = r2.iterator()     // Catch:{ all -> 0x00ac }
        L_0x0057:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x00a8
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x00ac }
            java.io.File r8 = (java.io.File) r8     // Catch:{ all -> 0x00ac }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x008e }
            r0.<init>(r8)     // Catch:{ IOException -> 0x008e }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x008e }
            r7.<init>(r0, r4)     // Catch:{ IOException -> 0x008e }
            java.lang.String r1 = r8.getName()     // Catch:{ all -> 0x0089 }
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0089 }
            r0.<init>(r1)     // Catch:{ all -> 0x0089 }
            r5.putNextEntry(r0)     // Catch:{ all -> 0x0089 }
        L_0x0079:
            r2 = 0
            int r1 = r7.read(r3, r2, r4)     // Catch:{ all -> 0x0089 }
            r0 = -1
            if (r1 == r0) goto L_0x0085
            r5.write(r3, r2, r1)     // Catch:{ all -> 0x0089 }
            goto L_0x0079
        L_0x0085:
            r7.close()     // Catch:{ IOException -> 0x008e }
            goto L_0x0057
        L_0x0089:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x008d }
        L_0x008d:
            throw r0     // Catch:{ IOException -> 0x008e }
        L_0x008e:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ac }
            r1.<init>()     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = "debug-builder/cant zip file "
            r1.append(r0)     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = r8.getName()     // Catch:{ all -> 0x00ac }
            r1.append(r0)     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00ac }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x00ac }
            goto L_0x0057
        L_0x00a8:
            r5.close()     // Catch:{ IOException -> 0x00b1 }
            return r6
        L_0x00ac:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            throw r0     // Catch:{ IOException -> 0x00b1 }
        L_0x00b1:
            r1 = move-exception
            java.lang.String r0 = "debug-builder/zip "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00b7:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23251Bb.A02(java.io.File, boolean, boolean, boolean):java.io.File");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:413:0x0919 */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0308 A[Catch:{ all -> 0x091e, Exception -> 0x091f }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0313 A[Catch:{ all -> 0x091e, Exception -> 0x091f }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0325 A[Catch:{ all -> 0x091e, Exception -> 0x091f }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0343 A[Catch:{ all -> 0x091e, Exception -> 0x091f }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x034e A[Catch:{ all -> 0x091e, Exception -> 0x091f }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x034f A[Catch:{ all -> 0x091e, Exception -> 0x091f }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0354 A[Catch:{ all -> 0x091e, Exception -> 0x091f }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x035e A[Catch:{ all -> 0x091e, Exception -> 0x091f }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0377 A[SYNTHETIC, Splitter:B:143:0x0377] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04a4 A[Catch:{ all -> 0x091e, Exception -> 0x091f }] */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x0878 A[Catch:{ all -> 0x091e, Exception -> 0x091f }, LOOP:12: B:376:0x0872->B:378:0x0878, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x088a A[Catch:{ all -> 0x091e, Exception -> 0x091f }] */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x08d5 A[Catch:{ all -> 0x091e, Exception -> 0x091f }] */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x0905 A[Catch:{ all -> 0x091e, Exception -> 0x091f }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:118:0x0302=Splitter:B:118:0x0302, B:44:0x0105=Splitter:B:44:0x0105, B:418:0x091e=Splitter:B:418:0x091e} */
    public java.lang.String A03(android.content.Context r38, android.util.Pair r39, X.C16050sL r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.util.List r45, java.util.List r46, long r47, long r49, boolean r51, boolean r52) {
        /*
            r37 = this;
            java.lang.String r27 = "%s:%s"
            java.lang.String r16 = ""
            java.lang.StringBuilder r17 = new java.lang.StringBuilder
            r17.<init>()
            r2 = r37
            java.lang.String r3 = "yyyy-MM-dd HH:mm:ss.SSSZ"
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ Exception -> 0x091f }
            java.text.SimpleDateFormat r20 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x091f }
            r0 = r20
            r0.<init>(r3, r1)     // Catch:{ Exception -> 0x091f }
            X.0rz r0 = r2.A0J     // Catch:{ Exception -> 0x091f }
            r35 = r0
            java.lang.String r6 = r35.A0O()     // Catch:{ Exception -> 0x091f }
            java.lang.String r5 = r35.A0Q()     // Catch:{ Exception -> 0x091f }
            X.0tK r1 = r2.A06     // Catch:{ Exception -> 0x091f }
            boolean r0 = r1.A08()     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x002e
            java.lang.String r4 = "UP"
            goto L_0x0044
        L_0x002e:
            int r1 = r1.A03     // Catch:{ Exception -> 0x091f }
            r0 = 1
            if (r1 == r0) goto L_0x0034
            r0 = 0
        L_0x0034:
            if (r0 == 0) goto L_0x0039
            java.lang.String r4 = "SC/XC"
            goto L_0x0044
        L_0x0039:
            X.0xa r0 = r2.A0V     // Catch:{ Exception -> 0x091f }
            boolean r0 = r0.A00     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x0042
            java.lang.String r4 = "PW"
            goto L_0x0044
        L_0x0042:
            java.lang.String r4 = "DN"
        L_0x0044:
            java.lang.String r19 = ")"
            java.lang.String r13 = " ("
            java.lang.String r3 = "Not Calculated"
            r9 = -1
            r0 = r49
            int r7 = (r49 > r9 ? 1 : (r49 == r9 ? 0 : -1))
            r36 = r38
            if (r7 != 0) goto L_0x0064
            r8 = r3
        L_0x0055:
            r0 = r47
            int r7 = (r47 > r9 ? 1 : (r47 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x00cd
            r9 = -2
            int r3 = (r47 > r9 ? 1 : (r47 == r9 ? 0 : -1))
            r7 = r44
            if (r3 != 0) goto L_0x0093
            goto L_0x0086
        L_0x0064:
            java.lang.String r7 = java.lang.Long.toString(r0)     // Catch:{ Exception -> 0x091f }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x091f }
            r8.<init>()     // Catch:{ Exception -> 0x091f }
            r8.append(r7)     // Catch:{ Exception -> 0x091f }
            r8.append(r13)     // Catch:{ Exception -> 0x091f }
            r7 = r36
            java.lang.String r0 = android.text.format.Formatter.formatFileSize(r7, r0)     // Catch:{ Exception -> 0x091f }
            r8.append(r0)     // Catch:{ Exception -> 0x091f }
            r0 = r19
            r8.append(r0)     // Catch:{ Exception -> 0x091f }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x091f }
            goto L_0x0055
        L_0x0086:
            java.lang.String r0 = "removed"
            boolean r0 = r0.equals(r7)     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x0091
            java.lang.String r3 = "Not present"
            goto L_0x00cd
        L_0x0091:
            r3 = r7
            goto L_0x00cd
        L_0x0093:
            java.lang.String r3 = java.lang.Long.toString(r0)     // Catch:{ Exception -> 0x091f }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x091f }
            r9.<init>()     // Catch:{ Exception -> 0x091f }
            r9.append(r3)     // Catch:{ Exception -> 0x091f }
            r9.append(r13)     // Catch:{ Exception -> 0x091f }
            r3 = r36
            java.lang.String r0 = android.text.format.Formatter.formatFileSize(r3, r0)     // Catch:{ Exception -> 0x091f }
            r9.append(r0)     // Catch:{ Exception -> 0x091f }
            r0 = r19
            r9.append(r0)     // Catch:{ Exception -> 0x091f }
            java.lang.String r3 = r9.toString()     // Catch:{ Exception -> 0x091f }
            java.lang.String r0 = "mounted_ro"
            boolean r0 = r0.equals(r7)     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x00cd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x091f }
            r0.<init>()     // Catch:{ Exception -> 0x091f }
            r0.append(r3)     // Catch:{ Exception -> 0x091f }
            java.lang.String r1 = " (read-only)"
            r0.append(r1)     // Catch:{ Exception -> 0x091f }
            java.lang.String r3 = r0.toString()     // Catch:{ Exception -> 0x091f }
        L_0x00cd:
            X.0uP r0 = r2.A0E     // Catch:{ Exception -> 0x091f }
            X.18c r1 = r0.A05     // Catch:{ Exception -> 0x091f }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x091f }
            r0.<init>()     // Catch:{ Exception -> 0x091f }
            X.11X r1 = r1.A00     // Catch:{ Exception -> 0x091f }
            X.0tf r28 = r1.get()     // Catch:{ Exception -> 0x091f }
            java.lang.String r29 = "wa_vnames"
            java.lang.String[] r33 = X.C224818c.A0B     // Catch:{ all -> 0x091a }
            r21 = 0
            java.lang.String r32 = "CONTACT_VNAMES"
            r31 = r21
            r34 = r21
            r30 = r21
            android.database.Cursor r7 = X.AnonymousClass15L.A03(r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x091a }
            if (r7 != 0) goto L_0x00f2
            goto L_0x0105
        L_0x00f2:
            boolean r1 = r7.moveToNext()     // Catch:{ all -> 0x0915 }
            if (r1 == 0) goto L_0x0102
            X.1Vq r1 = X.C40101tZ.A00(r7)     // Catch:{ all -> 0x0915 }
            if (r1 == 0) goto L_0x00f2
            r0.add(r1)     // Catch:{ all -> 0x0915 }
            goto L_0x00f2
        L_0x0102:
            r7.close()     // Catch:{ all -> 0x091a }
        L_0x0105:
            r28.close()     // Catch:{ Exception -> 0x091f }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ Exception -> 0x091f }
            r14 = 0
            r12 = 0
        L_0x010e:
            boolean r0 = r7.hasNext()     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x0130
            java.lang.Object r1 = r7.next()     // Catch:{ Exception -> 0x091f }
            X.1Vq r1 = (X.C28331Vq) r1     // Catch:{ Exception -> 0x091f }
            java.lang.String r0 = r1.A07     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x010e
            boolean r0 = r1.A02()     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x0127
            int r14 = r14 + 1
            goto L_0x010e
        L_0x0127:
            boolean r0 = r1.A01()     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x010e
            int r12 = r12 + 1
            goto L_0x010e
        L_0x0130:
            if (r51 != 0) goto L_0x013e
            java.lang.String r1 = "\n\n\n\n"
            r0 = r17
            r0.append(r1)     // Catch:{ Exception -> 0x091f }
            java.lang.String r1 = "--Support Info--\n"
            r0.append(r1)     // Catch:{ Exception -> 0x091f }
        L_0x013e:
            org.json.JSONObject r18 = new org.json.JSONObject     // Catch:{ Exception -> 0x091f }
            r18.<init>()     // Catch:{ Exception -> 0x091f }
            r7 = r17
            if (r51 == 0) goto L_0x0149
            r7 = r18
        L_0x0149:
            X.2JM r9 = new X.2JM     // Catch:{ Exception -> 0x091f }
            r1 = r52
            r0 = r36
            r9.<init>(r0, r1)     // Catch:{ Exception -> 0x091f }
            X.01D r0 = r2.A0c     // Catch:{ Exception -> 0x091f }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x091f }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x091f }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ Exception -> 0x091f }
        L_0x015e:
            boolean r0 = r10.hasNext()     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x016e
            java.lang.Object r0 = r10.next()     // Catch:{ Exception -> 0x091f }
            X.1Tm r0 = (X.C27881Tm) r0     // Catch:{ Exception -> 0x091f }
            r0.AKN(r9)     // Catch:{ Exception -> 0x091f }
            goto L_0x015e
        L_0x016e:
            java.util.Map r0 = r9.A01     // Catch:{ Exception -> 0x091f }
            java.util.Set r0 = r0.entrySet()     // Catch:{ Exception -> 0x091f }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ Exception -> 0x091f }
        L_0x0178:
            boolean r0 = r10.hasNext()     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x0192
            java.lang.Object r0 = r10.next()     // Catch:{ Exception -> 0x091f }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ Exception -> 0x091f }
            java.lang.Object r9 = r0.getKey()     // Catch:{ Exception -> 0x091f }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x091f }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x091f }
            A00(r9, r0, r7)     // Catch:{ Exception -> 0x091f }
            goto L_0x0178
        L_0x0192:
            if (r52 != 0) goto L_0x01e9
            java.lang.String r9 = "Debug info"
            X.0sK r11 = r2.A05     // Catch:{ Exception -> 0x091f }
            r11.A0B()     // Catch:{ Exception -> 0x091f }
            X.1ZT r10 = r11.A05     // Catch:{ Exception -> 0x091f }
            if (r10 == 0) goto L_0x025d
            java.lang.String r1 = "+"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x091f }
            r0.<init>(r1)     // Catch:{ Exception -> 0x091f }
            java.lang.String r1 = r10.user     // Catch:{ Exception -> 0x091f }
            r0.append(r1)     // Catch:{ Exception -> 0x091f }
            java.lang.String r10 = r0.toString()     // Catch:{ Exception -> 0x091f }
        L_0x01af:
            X.129 r0 = r2.A01     // Catch:{ Exception -> 0x091f }
            boolean r0 = r0.A03()     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x01e6
            java.lang.String r1 = "chnum "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x091f }
            r0.<init>(r1)     // Catch:{ Exception -> 0x091f }
            r0.append(r10)     // Catch:{ Exception -> 0x091f }
            java.lang.String r10 = r0.toString()     // Catch:{ Exception -> 0x091f }
            com.obwhatsapp.Me r0 = r11.A01()     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x01e6
            java.lang.String r0 = r0.jabber_id     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x01e6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x091f }
            r1.<init>()     // Catch:{ Exception -> 0x091f }
            r1.append(r10)     // Catch:{ Exception -> 0x091f }
            r1.append(r13)     // Catch:{ Exception -> 0x091f }
            r1.append(r0)     // Catch:{ Exception -> 0x091f }
            r0 = r19
            r1.append(r0)     // Catch:{ Exception -> 0x091f }
            java.lang.String r10 = r1.toString()     // Catch:{ Exception -> 0x091f }
        L_0x01e6:
            A00(r9, r10, r7)     // Catch:{ Exception -> 0x091f }
        L_0x01e9:
            java.lang.String r1 = "MDEnabled"
            X.16S r0 = r2.A0T     // Catch:{ Exception -> 0x091f }
            X.0rz r0 = r0.A01     // Catch:{ Exception -> 0x091f }
            boolean r0 = r0.A1d()     // Catch:{ Exception -> 0x091f }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x091f }
            A00(r1, r0, r7)     // Catch:{ Exception -> 0x091f }
            java.lang.String r1 = "HasMdCompanion"
            X.0yO r0 = r2.A0N     // Catch:{ Exception -> 0x091f }
            java.util.List r0 = r0.A06()     // Catch:{ Exception -> 0x091f }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x091f }
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x091f }
            A00(r1, r0, r7)     // Catch:{ Exception -> 0x091f }
            java.lang.String r1 = "Context"
            r31 = r41
            r0 = r31
            A00(r1, r0, r7)     // Catch:{ Exception -> 0x091f }
            java.lang.String r1 = "useragent"
            X.0vR r0 = r2.A0b     // Catch:{ Exception -> 0x091f }
            java.lang.String r0 = r0.A00()     // Catch:{ Exception -> 0x091f }
            A00(r1, r0, r7)     // Catch:{ Exception -> 0x091f }
            java.lang.String r0 = "Socket Conn"
            A00(r0, r4, r7)     // Catch:{ Exception -> 0x091f }
            java.lang.String r0 = "Free Space Built-In"
            A00(r0, r8, r7)     // Catch:{ Exception -> 0x091f }
            java.lang.String r0 = "Free Space Removable"
            A00(r0, r3, r7)     // Catch:{ Exception -> 0x091f }
            java.lang.String r1 = "Smb count"
            java.lang.String r0 = java.lang.Integer.toString(r14)     // Catch:{ Exception -> 0x091f }
            A00(r1, r0, r7)     // Catch:{ Exception -> 0x091f }
            java.lang.String r1 = "Ent count"
            java.lang.String r0 = java.lang.Integer.toString(r12)     // Catch:{ Exception -> 0x091f }
            A00(r1, r0, r7)     // Catch:{ Exception -> 0x091f }
            X.01V r0 = r2.A0G     // Catch:{ Exception -> 0x091f }
            r30 = r0
            android.net.ConnectivityManager r26 = r30.A0H()     // Catch:{ Exception -> 0x091f }
            java.lang.String r8 = "Connection"
            X.0wP r0 = r2.A0D     // Catch:{ Exception -> 0x091f }
            r29 = r0
            X.1UW r9 = r29.A06()     // Catch:{ Exception -> 0x091f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x091f }
            r4.<init>()     // Catch:{ Exception -> 0x091f }
            goto L_0x0262
        L_0x025d:
            java.lang.String r10 = "unregistered"
            goto L_0x01af
        L_0x0262:
            if (r9 == 0) goto L_0x02a7
            java.lang.String r3 = r9.A02     // Catch:{ Exception -> 0x091f }
            if (r3 == 0) goto L_0x027e
            r1 = 0
        L_0x0269:
            int r0 = r3.length()     // Catch:{ Exception -> 0x091f }
            if (r1 >= r0) goto L_0x027e
            char r0 = r3.charAt(r1)     // Catch:{ Exception -> 0x091f }
            r4.append(r0)     // Catch:{ Exception -> 0x091f }
            r0 = 46
            r4.append(r0)     // Catch:{ Exception -> 0x091f }
            int r1 = r1 + 1
            goto L_0x0269
        L_0x027e:
            java.lang.String r3 = r9.A01     // Catch:{ Exception -> 0x091f }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x091f }
            if (r0 != 0) goto L_0x02ac
            r4.append(r13)     // Catch:{ Exception -> 0x091f }
            if (r3 == 0) goto L_0x02a1
            r1 = 0
        L_0x028c:
            int r0 = r3.length()     // Catch:{ Exception -> 0x091f }
            if (r1 >= r0) goto L_0x02a1
            char r0 = r3.charAt(r1)     // Catch:{ Exception -> 0x091f }
            r4.append(r0)     // Catch:{ Exception -> 0x091f }
            r0 = 46
            r4.append(r0)     // Catch:{ Exception -> 0x091f }
            int r1 = r1 + 1
            goto L_0x028c
        L_0x02a1:
            r0 = 41
            r4.append(r0)     // Catch:{ Exception -> 0x091f }
            goto L_0x02ac
        L_0x02a7:
            java.lang.String r0 = "NONE"
            r4.append(r0)     // Catch:{ Exception -> 0x091f }
        L_0x02ac:
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x091f }
            A00(r8, r0, r7)     // Catch:{ Exception -> 0x091f }
            r1 = r42
            if (r42 == 0) goto L_0x02bc
            java.lang.String r0 = "Server"
            A00(r0, r1, r7)     // Catch:{ Exception -> 0x091f }
        L_0x02bc:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x091f }
            r4.<init>()     // Catch:{ Exception -> 0x091f }
            X.1Tg r3 = r2.A0a     // Catch:{ Exception -> 0x02f3 }
            r1 = 0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x02f3 }
            X.2Iw r8 = r3.A01(r0, r1)     // Catch:{ Exception -> 0x02f3 }
            java.util.Set r3 = r8.A00     // Catch:{ Exception -> 0x02f3 }
            r1 = 32
            if (r3 == 0) goto L_0x02df
            java.lang.String r0 = "TK-NP-"
            r4.append(r0)     // Catch:{ Exception -> 0x02f3 }
            int r0 = r3.size()     // Catch:{ Exception -> 0x02f3 }
            r4.append(r0)     // Catch:{ Exception -> 0x02f3 }
            r4.append(r1)     // Catch:{ Exception -> 0x02f3 }
        L_0x02df:
            java.util.Set r3 = r8.A01     // Catch:{ Exception -> 0x02f3 }
            if (r3 == 0) goto L_0x02f8
            java.lang.String r0 = "TK-NS-"
            r4.append(r0)     // Catch:{ Exception -> 0x02f3 }
            int r0 = r3.size()     // Catch:{ Exception -> 0x02f3 }
            r4.append(r0)     // Catch:{ Exception -> 0x02f3 }
            r4.append(r1)     // Catch:{ Exception -> 0x02f3 }
            goto L_0x02f8
        L_0x02f3:
            java.lang.String r0 = "TK-FG-0 "
            r4.append(r0)     // Catch:{ Exception -> 0x091f }
        L_0x02f8:
            java.lang.String r0 = "org.acra.ACRA"
            java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0302 }
            java.lang.String r0 = "NW-WAP-1 "
            r4.append(r0)     // Catch:{ ClassNotFoundException -> 0x0302 }
        L_0x0302:
            boolean r0 = X.C004101u.A0C(r30)     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x030d
            java.lang.String r0 = "DC-RTED "
            r4.append(r0)     // Catch:{ Exception -> 0x091f }
        L_0x030d:
            boolean r0 = X.C004101u.A0A()     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x0318
            java.lang.String r0 = "DC-BACRM "
            r4.append(r0)     // Catch:{ Exception -> 0x091f }
        L_0x0318:
            java.lang.String r0 = "FE-GDE "
            r4.append(r0)     // Catch:{ Exception -> 0x091f }
            X.0yo r0 = r2.A08     // Catch:{ Exception -> 0x091f }
            boolean r0 = r0.A0A()     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x034f
            java.lang.String r0 = "FE-GDC "
            r4.append(r0)     // Catch:{ Exception -> 0x091f }
            java.lang.String r0 = "debug-builder/generate-diagnostics/gdrive-capable"
        L_0x032c:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x091f }
            java.lang.String r0 = "FE-VIDC "
            r4.append(r0)     // Catch:{ Exception -> 0x091f }
            java.lang.String r0 = "debug-builder/generate-diagnostics/video-call-capable"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x091f }
            X.0tz r1 = r2.A0H     // Catch:{ Exception -> 0x091f }
            android.content.Context r0 = r1.A00     // Catch:{ Exception -> 0x091f }
            boolean r0 = X.C437421i.A01(r0)     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x0348
            java.lang.String r0 = "FE-SMSRTV "
            r4.append(r0)     // Catch:{ Exception -> 0x091f }
        L_0x0348:
            int r0 = r4.length()     // Catch:{ Exception -> 0x091f }
            if (r0 != 0) goto L_0x0354
            goto L_0x0352
        L_0x034f:
            java.lang.String r0 = "debug-builder/generate-diagnostics/gdrive-not-capable"
            goto L_0x032c
        L_0x0352:
            r3 = 0
            goto L_0x0358
        L_0x0354:
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x091f }
        L_0x0358:
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x091f }
            if (r0 != 0) goto L_0x0363
            java.lang.String r0 = "Diagnostic Codes"
            A00(r0, r3, r7)     // Catch:{ Exception -> 0x091f }
        L_0x0363:
            android.telephony.TelephonyManager r25 = r30.A0N()     // Catch:{ Exception -> 0x091f }
            X.0sK r0 = r2.A05     // Catch:{ Exception -> 0x091f }
            r28 = r0
            r28.A0B()     // Catch:{ Exception -> 0x091f }
            com.obwhatsapp.Me r0 = r0.A00     // Catch:{ Exception -> 0x091f }
            java.lang.String r12 = "unknown"
            r23 = r12
            if (r0 != 0) goto L_0x049e
            X.0sj r3 = r2.A0I     // Catch:{ Exception -> 0x091f }
            r0 = r30
            java.lang.String r4 = X.C39851tA.A01(r0, r1, r3)     // Catch:{ Exception -> 0x091f }
            if (r25 == 0) goto L_0x0399
            int r0 = r25.getSimState()     // Catch:{ Exception -> 0x091f }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x091f }
        L_0x0389:
            java.lang.String r3 = "Sim"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x091f }
            r1.<init>()     // Catch:{ Exception -> 0x091f }
            r1.append(r4)     // Catch:{ Exception -> 0x091f }
            java.lang.String r0 = " "
            r1.append(r0)     // Catch:{ Exception -> 0x091f }
            goto L_0x039b
        L_0x0399:
            r8 = 0
            goto L_0x0389
        L_0x039b:
            if (r8 != 0) goto L_0x039f
            r8 = r16
        L_0x039f:
            r1.append(r8)     // Catch:{ Exception -> 0x091f }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x091f }
            A00(r3, r0, r7)     // Catch:{ Exception -> 0x091f }
            if (r4 == 0) goto L_0x049e
            java.lang.String r1 = "\\D"
            r0 = r16
            java.lang.String r11 = r4.replaceAll(r1, r0)     // Catch:{ Exception -> 0x091f }
            java.lang.String r24 = "L Distance"
            int r10 = r11.length()     // Catch:{ Exception -> 0x091f }
            if (r10 != 0) goto L_0x03d1
            int r10 = r5.length()     // Catch:{ Exception -> 0x091f }
        L_0x03bf:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x091f }
            r0 = r24
            A00(r0, r1, r7)     // Catch:{ Exception -> 0x091f }
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x091f }
            int r3 = X.AnonymousClass2JN.A01(r5, r11)     // Catch:{ Exception -> 0x091f }
            if (r3 == 0) goto L_0x0441
            goto L_0x043e
        L_0x03d1:
            int r9 = r5.length()     // Catch:{ Exception -> 0x091f }
            if (r9 == 0) goto L_0x03bf
            r8 = 1
            int r4 = r9 + 1
            int r3 = r10 + 1
            r0 = 2
            int[] r1 = new int[r0]     // Catch:{ Exception -> 0x091f }
            r1[r8] = r3     // Catch:{ Exception -> 0x091f }
            r3 = 0
            r1[r3] = r4     // Catch:{ Exception -> 0x091f }
            java.lang.Class<int> r0 = int.class
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r0, r1)     // Catch:{ Exception -> 0x091f }
            int[][] r4 = (int[][]) r4     // Catch:{ Exception -> 0x091f }
            r0 = 0
        L_0x03ed:
            if (r0 > r9) goto L_0x03f6
            r1 = r4[r0]     // Catch:{ Exception -> 0x091f }
            r1[r3] = r0     // Catch:{ Exception -> 0x091f }
            int r0 = r0 + 1
            goto L_0x03ed
        L_0x03f6:
            r0 = 0
        L_0x03f7:
            if (r0 > r10) goto L_0x0400
            r1 = r4[r3]     // Catch:{ Exception -> 0x091f }
            r1[r0] = r0     // Catch:{ Exception -> 0x091f }
            int r0 = r0 + 1
            goto L_0x03f7
        L_0x0400:
            if (r8 > r10) goto L_0x0439
            r3 = 1
        L_0x0403:
            if (r3 > r9) goto L_0x0436
            int r1 = r3 + -1
            char r15 = r5.charAt(r1)     // Catch:{ Exception -> 0x091f }
            int r0 = r8 + -1
            char r14 = r11.charAt(r0)     // Catch:{ Exception -> 0x091f }
            r22 = r4[r3]     // Catch:{ Exception -> 0x091f }
            if (r15 != r14) goto L_0x041c
            r1 = r4[r1]     // Catch:{ Exception -> 0x091f }
            r0 = r1[r0]     // Catch:{ Exception -> 0x091f }
        L_0x0419:
            r22[r8] = r0     // Catch:{ Exception -> 0x091f }
            goto L_0x0433
        L_0x041c:
            r15 = r4[r1]     // Catch:{ Exception -> 0x091f }
            r1 = r15[r0]     // Catch:{ Exception -> 0x091f }
            int r14 = r1 + 1
            r1 = r15[r8]     // Catch:{ Exception -> 0x091f }
            int r1 = r1 + 1
            r0 = r22[r0]     // Catch:{ Exception -> 0x091f }
            int r0 = r0 + 1
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ Exception -> 0x091f }
            int r0 = java.lang.Math.min(r14, r0)     // Catch:{ Exception -> 0x091f }
            goto L_0x0419
        L_0x0433:
            int r3 = r3 + 1
            goto L_0x0403
        L_0x0436:
            int r8 = r8 + 1
            goto L_0x0400
        L_0x0439:
            r0 = r4[r9]     // Catch:{ Exception -> 0x091f }
            r10 = r0[r10]     // Catch:{ Exception -> 0x091f }
            goto L_0x03bf
        L_0x043e:
            r0 = 1
            if (r3 != r0) goto L_0x049e
        L_0x0441:
            X.1G1 r4 = r2.A02     // Catch:{ Exception -> 0x091f }
            java.lang.String r0 = X.AnonymousClass2JN.A0C(r4, r5, r6, r11)     // Catch:{ Exception -> 0x091f }
            java.lang.String r1 = "Mistyped"
            if (r0 != 0) goto L_0x0451
            java.lang.String r0 = "false"
        L_0x044d:
            A00(r1, r0, r7)     // Catch:{ Exception -> 0x091f }
            goto L_0x0455
        L_0x0451:
            java.lang.String r0 = "true"
            goto L_0x044d
        L_0x0455:
            if (r3 != 0) goto L_0x0491
            java.lang.String r3 = X.AnonymousClass2JO.A02(r4, r6, r11)     // Catch:{ Exception -> 0x091f }
            java.lang.String r1 = X.AnonymousClass2JO.A02(r4, r6, r5)     // Catch:{ Exception -> 0x091f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x091f }
            r0.<init>()     // Catch:{ Exception -> 0x091f }
            r0.append(r6)     // Catch:{ Exception -> 0x091f }
            r0.append(r1)     // Catch:{ Exception -> 0x091f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x091f }
            boolean r1 = r3.equals(r1)     // Catch:{ Exception -> 0x091f }
            if (r1 != 0) goto L_0x048f
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x091f }
            if (r0 != 0) goto L_0x048f
            boolean r0 = X.AnonymousClass2JO.A04(r11, r5, r3, r6)     // Catch:{ Exception -> 0x091f }
            if (r0 != 0) goto L_0x048f
            boolean r0 = r5.endsWith(r3)     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x0491
            int r1 = X.AnonymousClass2JO.A00(r4, r6, r3)     // Catch:{ Exception -> 0x091f }
            r0 = 5
            if (r1 != r0) goto L_0x0491
            r8 = 0
            goto L_0x0491
        L_0x048f:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x091f }
        L_0x0491:
            java.lang.String r1 = "Mistyped Last6"
            if (r8 != 0) goto L_0x0497
            r0 = r12
            goto L_0x049b
        L_0x0497:
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x091f }
        L_0x049b:
            A00(r1, r0, r7)     // Catch:{ Exception -> 0x091f }
        L_0x049e:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x091f }
            r0 = 21
            if (r1 < r0) goto L_0x0530
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x091f }
            r8.<init>()     // Catch:{ Exception -> 0x091f }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x091f }
            r6.<init>()     // Catch:{ Exception -> 0x091f }
            if (r26 != 0) goto L_0x04b1
            goto L_0x0519
        L_0x04b1:
            android.net.Network[] r5 = r26.getAllNetworks()     // Catch:{ Exception -> 0x091f }
            int r4 = r5.length     // Catch:{ Exception -> 0x091f }
            r3 = 0
            r15 = 0
        L_0x04b8:
            if (r3 >= r4) goto L_0x051e
            r9 = r5[r3]     // Catch:{ Exception -> 0x091f }
            if (r15 == 0) goto L_0x04c6
            r0 = 59
            r8.append(r0)     // Catch:{ Exception -> 0x091f }
            r6.append(r0)     // Catch:{ Exception -> 0x091f }
        L_0x04c6:
            r0 = r26
            android.net.NetworkCapabilities r10 = r0.getNetworkCapabilities(r9)     // Catch:{ Exception -> 0x091f }
            if (r10 == 0) goto L_0x0514
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x091f }
            java.lang.String r0 = r9.toString()     // Catch:{ Exception -> 0x091f }
            r14 = 0
            r1[r14] = r0     // Catch:{ Exception -> 0x091f }
            r0 = 11
            boolean r11 = r10.hasCapability(r0)     // Catch:{ Exception -> 0x091f }
            r0 = 0
            if (r11 != 0) goto L_0x04e2
            r0 = 1
        L_0x04e2:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x091f }
            r11 = 1
            r1[r11] = r0     // Catch:{ Exception -> 0x091f }
            r0 = r27
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ Exception -> 0x091f }
            r8.append(r0)     // Catch:{ Exception -> 0x091f }
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x091f }
            java.lang.String r0 = r9.toString()     // Catch:{ Exception -> 0x091f }
            r1[r14] = r0     // Catch:{ Exception -> 0x091f }
            r0 = 13
            boolean r9 = r10.hasCapability(r0)     // Catch:{ Exception -> 0x091f }
            r0 = 0
            if (r9 != 0) goto L_0x0505
            r0 = 1
        L_0x0505:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x091f }
            r1[r11] = r0     // Catch:{ Exception -> 0x091f }
            r0 = r27
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ Exception -> 0x091f }
            r6.append(r0)     // Catch:{ Exception -> 0x091f }
        L_0x0514:
            int r15 = r15 + 1
            int r3 = r3 + 1
            goto L_0x04b8
        L_0x0519:
            java.lang.String r0 = "debug-builder/get-debug-info cm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x091f }
        L_0x051e:
            java.lang.String r1 = "Network metered"
            java.lang.String r0 = r8.toString()     // Catch:{ Exception -> 0x091f }
            A00(r1, r0, r7)     // Catch:{ Exception -> 0x091f }
            java.lang.String r1 = "Network restricted"
            java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x091f }
            A00(r1, r0, r7)     // Catch:{ Exception -> 0x091f }
        L_0x0530:
            r0 = r29
            java.lang.Object r1 = r0.A06     // Catch:{ Exception -> 0x091f }
            monitor-enter(r1)     // Catch:{ Exception -> 0x091f }
            X.1UX r0 = r0.A00     // Catch:{ all -> 0x0912 }
            monitor-exit(r1)     // Catch:{ all -> 0x0912 }
            if (r0 == 0) goto L_0x0545
            java.lang.String r1 = "Data roaming"
            boolean r0 = r0.A02     // Catch:{ Exception -> 0x091f }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x091f }
            A00(r1, r0, r7)     // Catch:{ Exception -> 0x091f }
        L_0x0545:
            java.lang.String r1 = "Tel roaming"
            if (r25 == 0) goto L_0x0551
            boolean r0 = r25.isNetworkRoaming()     // Catch:{ Exception -> 0x091f }
            java.lang.String r12 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x091f }
        L_0x0551:
            A00(r1, r12, r7)     // Catch:{ Exception -> 0x091f }
            X.1OL r0 = r2.A0A     // Catch:{ Exception -> 0x091f }
            android.content.SharedPreferences r3 = r0.A01()     // Catch:{ Exception -> 0x091f }
            java.lang.String r1 = "previous_call_tslog_call_id"
            r0 = r21
            java.lang.String r1 = r3.getString(r1, r0)     // Catch:{ Exception -> 0x091f }
            if (r1 == 0) goto L_0x0569
            java.lang.String r0 = "last tslog call id"
            A00(r0, r1, r7)     // Catch:{ Exception -> 0x091f }
        L_0x0569:
            X.0vy r0 = r2.A0Q     // Catch:{ Exception -> 0x091f }
            com.whatsapp.fieldstats.events.WamCall r3 = r0.A01     // Catch:{ Exception -> 0x091f }
            if (r3 == 0) goto L_0x05bc
            java.lang.Integer r1 = r3.callSide     // Catch:{ Exception -> 0x091f }
            if (r1 == 0) goto L_0x0579
            java.lang.String r0 = "voip call side"
            A00(r0, r1, r7)     // Catch:{ Exception -> 0x091f }
        L_0x0579:
            java.lang.Integer r1 = r3.callResult     // Catch:{ Exception -> 0x091f }
            if (r1 == 0) goto L_0x0583
            java.lang.String r0 = "voip call result"
            A00(r0, r1, r7)     // Catch:{ Exception -> 0x091f }
        L_0x0583:
            java.lang.Integer r1 = r3.callSetupErrorType     // Catch:{ Exception -> 0x091f }
            if (r1 == 0) goto L_0x058d
            java.lang.String r0 = "voip call setup error"
            A00(r0, r1, r7)     // Catch:{ Exception -> 0x091f }
        L_0x058d:
            java.lang.Integer r1 = r3.callTermReason     // Catch:{ Exception -> 0x091f }
            if (r1 == 0) goto L_0x0597
            java.lang.String r0 = "voip call terminate reason"
            A00(r0, r1, r7)     // Catch:{ Exception -> 0x091f }
        L_0x0597:
            java.lang.String r1 = r3.callTestBucket     // Catch:{ Exception -> 0x091f }
            if (r1 == 0) goto L_0x05a1
            java.lang.String r0 = "voip call test bucket"
            A00(r0, r1, r7)     // Catch:{ Exception -> 0x091f }
        L_0x05a1:
            java.lang.Integer r0 = r3.callRelayBindStatus     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x05ad
            int r3 = r0.intValue()     // Catch:{ Exception -> 0x091f }
            r1 = 2
            r0 = 1
            if (r3 == r1) goto L_0x05ae
        L_0x05ad:
            r0 = 0
        L_0x05ae:
            java.lang.String r1 = "voip bind to any relay"
            if (r0 == 0) goto L_0x05b9
            java.lang.String r0 = "Yes"
        L_0x05b5:
            A00(r1, r0, r7)     // Catch:{ Exception -> 0x091f }
            goto L_0x05bc
        L_0x05b9:
            java.lang.String r0 = "No"
            goto L_0x05b5
        L_0x05bc:
            r1 = r43
            if (r43 == 0) goto L_0x05c5
            java.lang.String r0 = "ref"
            A00(r0, r1, r7)     // Catch:{ Exception -> 0x091f }
        L_0x05c5:
            java.lang.String r1 = "ABprops hash state"
            X.0wv r3 = r2.A0W     // Catch:{ Exception -> 0x091f }
            java.lang.String r0 = r3.A00()     // Catch:{ Exception -> 0x091f }
            A00(r1, r0, r7)     // Catch:{ Exception -> 0x091f }
            java.lang.String r1 = "Serverprops hash state"
            java.lang.String r0 = r3.A01()     // Catch:{ Exception -> 0x091f }
            A00(r1, r0, r7)     // Catch:{ Exception -> 0x091f }
            X.0pd r5 = r2.A0P     // Catch:{ Exception -> 0x091f }
            r0 = 422(0x1a6, float:5.91E-43)
            X.0tM r3 = X.C16620tM.A02     // Catch:{ Exception -> 0x091f }
            boolean r0 = r5.A0E(r3, r0)     // Catch:{ Exception -> 0x091f }
            int r4 = X.C43291zl.A01(r0)     // Catch:{ Exception -> 0x091f }
            java.lang.String r1 = "Video transcode"
            r0 = 1
            if (r4 == r0) goto L_0x05fc
            r0 = 2
            if (r4 == r0) goto L_0x05f5
            java.lang.String r0 = "no encoders"
            A00(r1, r0, r7)     // Catch:{ Exception -> 0x091f }
            goto L_0x0602
        L_0x05f5:
            java.lang.String r0 = "unsupported device"
            A00(r1, r0, r7)     // Catch:{ Exception -> 0x091f }
            goto L_0x0602
        L_0x05fc:
            java.lang.String r0 = "supported"
            A00(r1, r0, r7)     // Catch:{ Exception -> 0x091f }
        L_0x0602:
            r0 = r39
            if (r39 == 0) goto L_0x060f
            java.lang.Object r1 = r0.first     // Catch:{ Exception -> 0x091f }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x091f }
            java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x091f }
            A00(r1, r0, r7)     // Catch:{ Exception -> 0x091f }
        L_0x060f:
            X.0w8 r0 = r2.A0U     // Catch:{ Exception -> 0x091f }
            boolean r0 = r0.A09()     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x0640
            java.lang.String r1 = "Payments"
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x091f }
            A00(r1, r0, r7)     // Catch:{ Exception -> 0x091f }
            if (r45 == 0) goto L_0x0640
            boolean r0 = X.AnonymousClass1Y4.A00(r31)     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x0640
            java.util.Iterator r4 = r45.iterator()     // Catch:{ Exception -> 0x091f }
        L_0x062a:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x0640
            java.lang.Object r0 = r4.next()     // Catch:{ Exception -> 0x091f }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ Exception -> 0x091f }
            java.lang.Object r1 = r0.first     // Catch:{ Exception -> 0x091f }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x091f }
            java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x091f }
            A00(r1, r0, r7)     // Catch:{ Exception -> 0x091f }
            goto L_0x062a
        L_0x0640:
            X.0tq r0 = r2.A0L     // Catch:{ Exception -> 0x091f }
            r0.A04()     // Catch:{ Exception -> 0x091f }
            boolean r0 = r0.A01     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x0653
            X.11I r1 = r2.A0M     // Catch:{ Exception -> 0x091f }
            java.lang.String r0 = "cross_platform_migration_completed"
            r4 = 0
            int r0 = r1.A00(r0, r4)     // Catch:{ Exception -> 0x091f }
            goto L_0x0655
        L_0x0653:
            r4 = 0
            r0 = 0
        L_0x0655:
            if (r0 == 0) goto L_0x066d
            X.11I r8 = r2.A0M     // Catch:{ Exception -> 0x091f }
            java.lang.String r6 = "cross_platform_migration_completed_timestamp"
            r0 = 0
            long r0 = r8.A01(r6, r0)     // Catch:{ Exception -> 0x091f }
            java.util.Date r6 = new java.util.Date     // Catch:{ Exception -> 0x091f }
            r6.<init>(r0)     // Catch:{ Exception -> 0x091f }
            r0 = r20
            java.lang.String r1 = r0.format(r6)     // Catch:{ Exception -> 0x091f }
            goto L_0x066f
        L_0x066d:
            java.lang.String r1 = "no"
        L_0x066f:
            java.lang.String r0 = "XPMigrated"
            A00(r0, r1, r7)     // Catch:{ Exception -> 0x091f }
            r0 = r35
            X.01D r0 = r0.A01     // Catch:{ Exception -> 0x091f }
            java.lang.Object r6 = r0.get()     // Catch:{ Exception -> 0x091f }
            android.content.SharedPreferences r6 = (android.content.SharedPreferences) r6     // Catch:{ Exception -> 0x091f }
            java.lang.String r1 = "last_datacenter"
            r0 = r21
            java.lang.String r1 = r6.getString(r1, r0)     // Catch:{ Exception -> 0x091f }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x091f }
            if (r0 != 0) goto L_0x0691
            java.lang.String r0 = "Datacenter"
            A00(r0, r1, r7)     // Catch:{ Exception -> 0x091f }
        L_0x0691:
            java.lang.String r1 = "Screen reader"
            android.view.accessibility.AccessibilityManager r0 = r30.A0P()     // Catch:{ Exception -> 0x091f }
            boolean r0 = X.AnonymousClass2JP.A06(r0)     // Catch:{ Exception -> 0x091f }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x091f }
            A00(r1, r0, r7)     // Catch:{ Exception -> 0x091f }
            java.lang.String r1 = "Fingerprint eligible"
            X.15P r0 = r2.A07     // Catch:{ Exception -> 0x091f }
            boolean r0 = r0.A05()     // Catch:{ Exception -> 0x091f }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x091f }
            A00(r1, r0, r7)     // Catch:{ Exception -> 0x091f }
            X.0si r0 = r2.A0K     // Catch:{ Exception -> 0x091f }
            long r0 = r0.A07()     // Catch:{ Exception -> 0x091f }
            r8 = 0
            int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x06d9
            java.lang.String r1 = "never"
        L_0x06bf:
            java.lang.String r0 = "Last local backup time"
            A00(r0, r1, r7)     // Catch:{ Exception -> 0x091f }
            java.lang.String r9 = r35.A0M()     // Catch:{ Exception -> 0x091f }
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x091f }
            r8 = 1
            r6 = r0 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x091f }
            java.lang.String r0 = "Google account added"
            A00(r0, r1, r7)     // Catch:{ Exception -> 0x091f }
            goto L_0x06ee
        L_0x06d9:
            r8 = -1
            int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x06e2
            r1 = r23
            goto L_0x06bf
        L_0x06e2:
            java.util.Date r6 = new java.util.Date     // Catch:{ Exception -> 0x091f }
            r6.<init>(r0)     // Catch:{ Exception -> 0x091f }
            r0 = r20
            java.lang.String r1 = r0.format(r6)     // Catch:{ Exception -> 0x091f }
            goto L_0x06bf
        L_0x06ee:
            if (r6 == 0) goto L_0x0778
            r0 = r35
            long r0 = r0.A0H(r9)     // Catch:{ Exception -> 0x091f }
            r10 = 0
            int r6 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x0745
            java.lang.String r1 = "never"
        L_0x06fe:
            java.lang.String r0 = "Last successful Google Drive backup time"
            A00(r0, r1, r7)     // Catch:{ Exception -> 0x091f }
            r0 = r35
            long r0 = r0.A0I(r9)     // Catch:{ Exception -> 0x091f }
            r9 = 0
            int r6 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0731
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x091f }
            r9.<init>()     // Catch:{ Exception -> 0x091f }
            r9.append(r0)     // Catch:{ Exception -> 0x091f }
            r9.append(r13)     // Catch:{ Exception -> 0x091f }
            r6 = r36
            java.lang.String r0 = android.text.format.Formatter.formatFileSize(r6, r0)     // Catch:{ Exception -> 0x091f }
            r9.append(r0)     // Catch:{ Exception -> 0x091f }
            r0 = r19
            r9.append(r0)     // Catch:{ Exception -> 0x091f }
            java.lang.String r1 = r9.toString()     // Catch:{ Exception -> 0x091f }
            java.lang.String r0 = "Size of Google Drive backup"
            A00(r0, r1, r7)     // Catch:{ Exception -> 0x091f }
        L_0x0731:
            int r0 = r35.A06()     // Catch:{ Exception -> 0x091f }
            java.lang.String r1 = X.AnonymousClass2GK.A05(r0)     // Catch:{ Exception -> 0x091f }
            java.lang.String r0 = "Backup to Google Drive frequency"
            A00(r0, r1, r7)     // Catch:{ Exception -> 0x091f }
            int r0 = r35.A07()     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x075d
            goto L_0x075a
        L_0x0745:
            r10 = -1
            int r6 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x074e
            r1 = r23
            goto L_0x06fe
        L_0x074e:
            java.util.Date r6 = new java.util.Date     // Catch:{ Exception -> 0x091f }
            r6.<init>(r0)     // Catch:{ Exception -> 0x091f }
            r0 = r20
            java.lang.String r1 = r0.format(r6)     // Catch:{ Exception -> 0x091f }
            goto L_0x06fe
        L_0x075a:
            if (r0 != r8) goto L_0x0764
            goto L_0x0761
        L_0x075d:
            java.lang.String r23 = "wifi only"
            goto L_0x0764
        L_0x0761:
            java.lang.String r23 = "wifi or cellular"
        L_0x0764:
            java.lang.String r1 = "Backed up over"
            r0 = r23
            A00(r1, r0, r7)     // Catch:{ Exception -> 0x091f }
            boolean r0 = r35.A1a()     // Catch:{ Exception -> 0x091f }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x091f }
            java.lang.String r0 = "Videos included in backup"
            A00(r0, r1, r7)     // Catch:{ Exception -> 0x091f }
        L_0x0778:
            java.lang.String r6 = "Groups media visibility"
            X.0sf r9 = r2.A0X     // Catch:{ Exception -> 0x091f }
            X.1WS r0 = r9.A02()     // Catch:{ Exception -> 0x091f }
            int r1 = r0.A01     // Catch:{ Exception -> 0x091f }
            if (r1 == 0) goto L_0x0790
            if (r1 == r8) goto L_0x078d
            r0 = 2
            if (r1 == r0) goto L_0x078a
            goto L_0x0793
        L_0x078a:
            java.lang.String r0 = "on"
            goto L_0x0795
        L_0x078d:
            java.lang.String r0 = "off"
            goto L_0x0795
        L_0x0790:
            java.lang.String r0 = "default"
            goto L_0x0795
        L_0x0793:
            java.lang.String r0 = "<unknown>"
        L_0x0795:
            A00(r6, r0, r7)     // Catch:{ Exception -> 0x091f }
            java.lang.String r6 = "Individual media visibility"
            X.1WS r0 = r9.A03()     // Catch:{ Exception -> 0x091f }
            int r1 = r0.A01     // Catch:{ Exception -> 0x091f }
            if (r1 == 0) goto L_0x07ae
            if (r1 == r8) goto L_0x07ab
            r0 = 2
            if (r1 == r0) goto L_0x07a8
            goto L_0x07b1
        L_0x07a8:
            java.lang.String r0 = "on"
            goto L_0x07b3
        L_0x07ab:
            java.lang.String r0 = "off"
            goto L_0x07b3
        L_0x07ae:
            java.lang.String r0 = "default"
            goto L_0x07b3
        L_0x07b1:
            java.lang.String r0 = "<unknown>"
        L_0x07b3:
            A00(r6, r0, r7)     // Catch:{ Exception -> 0x091f }
            java.lang.String r6 = "In scoped mode"
            X.0sc r1 = r2.A0F     // Catch:{ Exception -> 0x091f }
            boolean r0 = r1.A0A()     // Catch:{ Exception -> 0x091f }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x091f }
            A00(r6, r0, r7)     // Catch:{ Exception -> 0x091f }
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x091f }
            r0 = 30
            if (r6 < r0) goto L_0x07e1
            boolean r0 = r1.A0A()     // Catch:{ Exception -> 0x091f }
            if (r0 != 0) goto L_0x07e1
            java.io.File r0 = r1.A05()     // Catch:{ Exception -> 0x091f }
            java.lang.String r6 = "scoped root"
            if (r0 == 0) goto L_0x0843
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x091f }
        L_0x07de:
            A00(r6, r0, r7)     // Catch:{ Exception -> 0x091f }
        L_0x07e1:
            java.lang.String r6 = "Has unexpected .nomedia"
            X.0sb r8 = r2.A04     // Catch:{ Exception -> 0x091f }
            X.1jH r0 = r8.A05()     // Catch:{ Exception -> 0x091f }
            java.io.File r0 = r0.A01     // Catch:{ Exception -> 0x091f }
            boolean r0 = A01(r0)     // Catch:{ Exception -> 0x091f }
            if (r0 != 0) goto L_0x0846
            X.1jH r0 = r8.A05()     // Catch:{ Exception -> 0x091f }
            java.io.File r0 = r0.A00     // Catch:{ Exception -> 0x091f }
            boolean r0 = A01(r0)     // Catch:{ Exception -> 0x091f }
            if (r0 != 0) goto L_0x0846
            X.1jH r0 = r8.A05()     // Catch:{ Exception -> 0x091f }
            java.io.File r0 = r0.A0N     // Catch:{ Exception -> 0x091f }
            boolean r0 = A01(r0)     // Catch:{ Exception -> 0x091f }
            if (r0 != 0) goto L_0x0846
            X.1jH r0 = r8.A05()     // Catch:{ Exception -> 0x091f }
            java.io.File r0 = r0.A05     // Catch:{ Exception -> 0x091f }
            boolean r0 = A01(r0)     // Catch:{ Exception -> 0x091f }
            if (r0 != 0) goto L_0x0846
            X.1jH r0 = r8.A05()     // Catch:{ Exception -> 0x091f }
            java.io.File r0 = r0.A02     // Catch:{ Exception -> 0x091f }
            X.C16180sb.A04(r0, r4)     // Catch:{ Exception -> 0x091f }
            boolean r0 = A01(r0)     // Catch:{ Exception -> 0x091f }
            if (r0 != 0) goto L_0x0846
            X.1jH r0 = r8.A05()     // Catch:{ Exception -> 0x091f }
            java.io.File r0 = r0.A0A     // Catch:{ Exception -> 0x091f }
            X.C16180sb.A04(r0, r4)     // Catch:{ Exception -> 0x091f }
            boolean r0 = A01(r0)     // Catch:{ Exception -> 0x091f }
            if (r0 != 0) goto L_0x0846
            X.01D r0 = r1.A03     // Catch:{ Exception -> 0x091f }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x091f }
            java.io.File r0 = (java.io.File) r0     // Catch:{ Exception -> 0x091f }
            boolean r1 = A01(r0)     // Catch:{ Exception -> 0x091f }
            r0 = 0
            if (r1 == 0) goto L_0x0847
            goto L_0x0846
        L_0x0843:
            java.lang.String r0 = "null"
            goto L_0x07de
        L_0x0846:
            r0 = 1
        L_0x0847:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x091f }
            A00(r6, r0, r7)     // Catch:{ Exception -> 0x091f }
            X.1Th r0 = r2.A0Z     // Catch:{ Exception -> 0x091f }
            X.0tz r0 = r0.A00     // Catch:{ Exception -> 0x091f }
            android.content.Context r1 = r0.A00     // Catch:{ Exception -> 0x091f }
            java.lang.Class<X.01F> r0 = X.AnonymousClass01F.class
            java.lang.Object r0 = X.C004501y.A00(r0, r1)     // Catch:{ Exception -> 0x091f }
            X.01F r0 = (X.AnonymousClass01F) r0     // Catch:{ Exception -> 0x091f }
            X.0sX r0 = (X.C16150sX) r0     // Catch:{ Exception -> 0x091f }
            X.01J r0 = r0.A2w     // Catch:{ Exception -> 0x091f }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x091f }
            X.1Ag r0 = (X.C23041Ag) r0     // Catch:{ Exception -> 0x091f }
            X.C16340ss.A01(r0)     // Catch:{ Exception -> 0x091f }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x091f }
            r0.<init>()     // Catch:{ Exception -> 0x091f }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ Exception -> 0x091f }
        L_0x0872:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x0888
            java.lang.Object r0 = r6.next()     // Catch:{ Exception -> 0x091f }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ Exception -> 0x091f }
            java.lang.Object r1 = r0.first     // Catch:{ Exception -> 0x091f }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x091f }
            java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x091f }
            A00(r1, r0, r7)     // Catch:{ Exception -> 0x091f }
            goto L_0x0872
        L_0x0888:
            if (r46 == 0) goto L_0x08b2
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x091f }
            r8.<init>()     // Catch:{ Exception -> 0x091f }
            java.util.Iterator r6 = r46.iterator()     // Catch:{ Exception -> 0x091f }
        L_0x0893:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x08a9
            java.lang.Object r0 = r6.next()     // Catch:{ Exception -> 0x091f }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ Exception -> 0x091f }
            java.lang.Object r1 = r0.first     // Catch:{ Exception -> 0x091f }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x091f }
            java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x091f }
            r8.put(r1, r0)     // Catch:{ Exception -> 0x091f }
            goto L_0x0893
        L_0x08a9:
            java.lang.String r1 = "User context"
            java.lang.String r0 = r8.toString()     // Catch:{ Exception -> 0x091f }
            A00(r1, r0, r7)     // Catch:{ Exception -> 0x091f }
        L_0x08b2:
            r6 = r40
            if (r40 == 0) goto L_0x08c5
            r0 = 2057(0x809, float:2.882E-42)
            boolean r0 = r5.A0E(r3, r0)     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x08c5
            java.lang.String r1 = "entity id"
            java.lang.String r0 = r6.user     // Catch:{ Exception -> 0x091f }
            A00(r1, r0, r7)     // Catch:{ Exception -> 0x091f }
        L_0x08c5:
            java.lang.String r5 = "Is Companion"
            X.1RE r8 = r2.A0B     // Catch:{ Exception -> 0x091f }
            X.0tz r0 = r8.A03     // Catch:{ Exception -> 0x091f }
            android.content.Context r6 = r0.A00     // Catch:{ Exception -> 0x091f }
            android.content.pm.PackageManager r3 = r6.getPackageManager()     // Catch:{ Exception -> 0x091f }
            android.content.ComponentName r1 = r8.A02     // Catch:{ Exception -> 0x091f }
            if (r1 != 0) goto L_0x08de
            java.lang.Class<com.obwhatsapp.companionmode.CompanionStateHolder$CompanionPreferenceStateReceiver> r0 = com.obwhatsapp.companionmode.CompanionStateHolder$CompanionPreferenceStateReceiver.class
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ Exception -> 0x091f }
            r1.<init>(r6, r0)     // Catch:{ Exception -> 0x091f }
            r8.A02 = r1     // Catch:{ Exception -> 0x091f }
        L_0x08de:
            int r1 = r3.getComponentEnabledSetting(r1)     // Catch:{ Exception -> 0x091f }
            r0 = 2
            if (r1 != r0) goto L_0x08f5
            X.1SS r0 = r2.A0C     // Catch:{ Exception -> 0x091f }
            X.2Hs r1 = r0.A00()     // Catch:{ Exception -> 0x091f }
            X.2Hs r0 = X.C47132Hs.A01     // Catch:{ Exception -> 0x091f }
            if (r1 == r0) goto L_0x08f5
            boolean r0 = r8.A01()     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x08fb
        L_0x08f5:
            boolean r0 = r28.A0G()     // Catch:{ Exception -> 0x091f }
            if (r0 == 0) goto L_0x08fc
        L_0x08fb:
            r4 = 1
        L_0x08fc:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x091f }
            A00(r5, r0, r7)     // Catch:{ Exception -> 0x091f }
            if (r51 == 0) goto L_0x0927
            r1 = 1
            r0 = r18
            java.lang.String r1 = r0.toString(r1)     // Catch:{ Exception -> 0x091f }
            r0 = r17
            r0.append(r1)     // Catch:{ Exception -> 0x091f }
            goto L_0x0927
        L_0x0912:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0912 }
            throw r0     // Catch:{ Exception -> 0x091f }
        L_0x0915:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0919 }
        L_0x0919:
            throw r0     // Catch:{ all -> 0x091a }
        L_0x091a:
            r0 = move-exception
            r28.close()     // Catch:{ all -> 0x091e }
        L_0x091e:
            throw r0     // Catch:{ Exception -> 0x091f }
        L_0x091f:
            r1 = move-exception
            boolean r0 = r1 instanceof android.database.sqlite.SQLiteException
            if (r0 == 0) goto L_0x092c
            X.AnonymousClass00B.A0E(r1)
        L_0x0927:
            java.lang.String r0 = r17.toString()
            return r0
        L_0x092c:
            java.lang.String r0 = "exception during email composition"
            com.whatsapp.util.Log.e(r0, r1)
            X.0so r3 = r2.A03
            java.lang.String r2 = r1.getMessage()
            java.lang.String r1 = "Exception building debug info"
            r0 = 1
            r3.AcB(r1, r2, r0)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23251Bb.A03(android.content.Context, android.util.Pair, X.0sL, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, long, long, boolean, boolean):java.lang.String");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x008e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A04(java.io.File r18, java.lang.String r19, boolean r20) {
        /*
            r17 = this;
            java.lang.String r8 = "https://crashlogs.whatsapp.net/wa_clb_data"
            r3 = 0
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            android.os.ConditionVariable r4 = new android.os.ConditionVariable
            r4.<init>()
            r0 = r17
            X.2JQ r6 = new X.2JQ
            r6.<init>(r4, r0, r2)
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ Exception -> 0x008f }
            r7 = r18
            r9.<init>(r7)     // Catch:{ Exception -> 0x008f }
            X.0vU r5 = r0.A0S     // Catch:{ all -> 0x008a }
            r1 = 6
            X.1ao r1 = r5.A00(r6, r8, r1)     // Catch:{ all -> 0x008a }
            java.lang.String r6 = "access_token"
            java.lang.String r5 = "1063127757113399|745146ffa34413f9dbb5469f5370b7af"
            r1.A07(r6, r5)     // Catch:{ all -> 0x008a }
            r12 = 2
            if (r20 == 0) goto L_0x002d
            r12 = 1
        L_0x002d:
            java.lang.String r10 = "file"
            java.lang.String r11 = r7.getName()     // Catch:{ all -> 0x008a }
            long r15 = r7.length()     // Catch:{ all -> 0x008a }
            r13 = 0
            java.util.List r5 = r1.A0A     // Catch:{ all -> 0x008a }
            X.2JR r8 = new X.2JR     // Catch:{ all -> 0x008a }
            r8.<init>(r9, r10, r11, r12, r13, r15)     // Catch:{ all -> 0x008a }
            r5.add(r8)     // Catch:{ all -> 0x008a }
            java.lang.String r6 = "type"
            java.lang.String r5 = "support"
            r1.A07(r6, r5)     // Catch:{ all -> 0x008a }
            java.lang.String r5 = "from_jid"
            X.0so r6 = r0.A03     // Catch:{ all -> 0x008a }
            java.lang.String r0 = r6.A00()     // Catch:{ all -> 0x008a }
            r1.A07(r5, r0)     // Catch:{ all -> 0x008a }
            java.lang.String r5 = "forced"
            java.lang.String r0 = "true"
            r1.A07(r5, r0)     // Catch:{ all -> 0x008a }
            java.lang.String r5 = "android_hprof_extras"
            java.lang.String r0 = r6.A01(r3)     // Catch:{ all -> 0x008a }
            r1.A07(r5, r0)     // Catch:{ all -> 0x008a }
            r5 = r19
            if (r19 == 0) goto L_0x0072
            java.lang.String r0 = "ticket_id"
            r1.A07(r0, r5)     // Catch:{ all -> 0x008a }
        L_0x0072:
            r1.A02(r3)     // Catch:{ all -> 0x008a }
            r9.close()     // Catch:{ Exception -> 0x008f }
            r0 = 100000(0x186a0, double:4.94066E-319)
            r4.block(r0)
            int r0 = r2.length()
            if (r0 != 0) goto L_0x0085
            return r3
        L_0x0085:
            java.lang.String r0 = r2.toString()
            return r0
        L_0x008a:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x008e }
        L_0x008e:
            throw r0     // Catch:{ Exception -> 0x008f }
        L_0x008f:
            r2 = move-exception
            java.lang.String r1 = "debug-builder/uploadLogsInternal/error-uploading-logs exception:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23251Bb.A04(java.io.File, java.lang.String, boolean):java.lang.String");
    }

    public String A05(String str) {
        ArrayList latestLogs = Log.getLatestLogs(1);
        if (latestLogs.size() < 1) {
            Log.e("debug-builder/upload-logs no logs found to be uploaded.");
        } else {
            Pair A022 = AnonymousClass1XI.A02(this.A0R, (File) latestLogs.get(0), GravityCompat.RELATIVE_LAYOUT_DIRECTION, 41943040);
            boolean booleanValue = ((Boolean) A022.first).booleanValue();
            File file = (File) A022.second;
            if (file != null) {
                String A042 = A04(file, str, false);
                if (booleanValue) {
                    file.delete();
                }
                return A042;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0183, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0187, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06() {
        /*
            r8 = this;
            java.lang.String r0 = "app-state: APP STATE DEBUG INFO BEGIN"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.01D r0 = r8.A0c
            java.lang.Object r0 = r0.get()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x0011:
            boolean r0 = r1.hasNext()
            java.lang.String r6 = "app-state"
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = r1.next()
            X.1Tm r0 = (X.C27881Tm) r0
            r0.AKL(r6)
            goto L_0x0011
        L_0x0023:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x0048
            java.lang.String r0 = "app-state/auth-keystore-result:"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            X.1CG r1 = r8.A00
            monitor-enter(r1)
            X.1fK r0 = r1.A02()     // Catch:{ all -> 0x0045 }
            monitor-exit(r1)
            int r0 = r0.A00
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0048
        L_0x0045:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0048:
            X.11E r1 = r8.A0O
            X.0tq r4 = r1.A09
            r4.A04()
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0188
            X.0tf r2 = r4.get()
            X.11D r0 = r1.A0B     // Catch:{ all -> 0x0183 }
            X.0vs r0 = r0.A00()     // Catch:{ all -> 0x0183 }
            X.0v0 r0 = r0.values()     // Catch:{ all -> 0x0183 }
            X.1Ub r5 = r0.iterator()     // Catch:{ all -> 0x0183 }
        L_0x0065:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0183 }
            if (r0 == 0) goto L_0x0097
            java.lang.Object r3 = r5.next()     // Catch:{ all -> 0x0183 }
            X.1bl r3 = (X.C30111bl) r3     // Catch:{ all -> 0x0183 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0183 }
            r1.<init>()     // Catch:{ all -> 0x0183 }
            r1.append(r6)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = "/db-migration-status/"
            r1.append(r0)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = r3.A0C     // Catch:{ all -> 0x0183 }
            r1.append(r0)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = ":"
            r1.append(r0)     // Catch:{ all -> 0x0183 }
            int r0 = r3.A04()     // Catch:{ all -> 0x0183 }
            r1.append(r0)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0183 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0183 }
            goto L_0x0065
        L_0x0097:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0183 }
            r3.<init>()     // Catch:{ all -> 0x0183 }
            r3.append(r6)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = "/db-migration-status-overall:"
            r3.append(r0)     // Catch:{ all -> 0x0183 }
            r4.A04()     // Catch:{ all -> 0x0183 }
            X.1jC r1 = r4.A04     // Catch:{ all -> 0x0183 }
            monitor-enter(r1)     // Catch:{ all -> 0x0183 }
            X.0tg r0 = r1.A00     // Catch:{ all -> 0x0180 }
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x0180 }
            monitor-exit(r1)     // Catch:{ all -> 0x0183 }
            r3.append(r0)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0183 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0183 }
            r4.A04()     // Catch:{ all -> 0x0183 }
            X.0tg r0 = r1.A00     // Catch:{ all -> 0x0183 }
            if (r0 == 0) goto L_0x019d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0183 }
            r1.<init>()     // Catch:{ all -> 0x0183 }
            r1.append(r6)     // Catch:{ all -> 0x0183 }
            java.lang.String r7 = "/"
            r1.append(r7)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = "message_view"
            r1.append(r0)     // Catch:{ all -> 0x0183 }
            java.lang.String r5 = ":"
            r1.append(r5)     // Catch:{ all -> 0x0183 }
            X.0tg r4 = r2.A02     // Catch:{ all -> 0x0183 }
            X.AnonymousClass00B.A06(r4)     // Catch:{ all -> 0x0183 }
            java.lang.String r3 = "view"
            java.lang.String r0 = X.C33961jT.A00(r4, r3, r0)     // Catch:{ all -> 0x0183 }
            r1.append(r0)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0183 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0183 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0183 }
            r1.<init>()     // Catch:{ all -> 0x0183 }
            r1.append(r6)     // Catch:{ all -> 0x0183 }
            r1.append(r7)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = "available_message_view"
            r1.append(r0)     // Catch:{ all -> 0x0183 }
            r1.append(r5)     // Catch:{ all -> 0x0183 }
            X.AnonymousClass00B.A06(r4)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = X.C33961jT.A00(r4, r3, r0)     // Catch:{ all -> 0x0183 }
            r1.append(r0)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0183 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0183 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0183 }
            r1.<init>()     // Catch:{ all -> 0x0183 }
            r1.append(r6)     // Catch:{ all -> 0x0183 }
            r1.append(r7)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = "legacy_available_messages_view"
            r1.append(r0)     // Catch:{ all -> 0x0183 }
            r1.append(r5)     // Catch:{ all -> 0x0183 }
            X.AnonymousClass00B.A06(r4)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = X.C33961jT.A00(r4, r3, r0)     // Catch:{ all -> 0x0183 }
            r1.append(r0)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0183 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0183 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0183 }
            r1.<init>()     // Catch:{ all -> 0x0183 }
            r1.append(r6)     // Catch:{ all -> 0x0183 }
            r1.append(r7)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = "deleted_messages_view"
            r1.append(r0)     // Catch:{ all -> 0x0183 }
            r1.append(r5)     // Catch:{ all -> 0x0183 }
            X.AnonymousClass00B.A06(r4)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = X.C33961jT.A00(r4, r3, r0)     // Catch:{ all -> 0x0183 }
            r1.append(r0)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0183 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0183 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0183 }
            r1.<init>()     // Catch:{ all -> 0x0183 }
            r1.append(r6)     // Catch:{ all -> 0x0183 }
            r1.append(r7)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = "deleted_messages_ids_view"
            r1.append(r0)     // Catch:{ all -> 0x0183 }
            r1.append(r5)     // Catch:{ all -> 0x0183 }
            X.AnonymousClass00B.A06(r4)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = X.C33961jT.A00(r4, r3, r0)     // Catch:{ all -> 0x0183 }
            r1.append(r0)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0183 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0183 }
            goto L_0x019d
        L_0x0180:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0183 }
            throw r0     // Catch:{ all -> 0x0183 }
        L_0x0183:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0187 }
        L_0x0187:
            throw r0
        L_0x0188:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r0 = "/db-migration-status-not-ready"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x01a0
        L_0x019d:
            r2.close()
        L_0x01a0:
            java.lang.String r0 = "app-state: APP STATE DEBUG INFO END"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23251Bb.A06():void");
    }
}
