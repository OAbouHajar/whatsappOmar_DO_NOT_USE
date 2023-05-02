package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1st  reason: invalid class name and case insensitive filesystem */
public class C39681st {
    public final C16000sG A00;
    public final C16980tz A01;
    public final AnonymousClass013 A02;
    public final C39701sv A03 = new C39701sv();

    public C39681st(C16000sG r2, C16980tz r3, AnonymousClass013 r4) {
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public static final String A00(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public String A01(String str) {
        C39701sv r0;
        AnonymousClass25N A002 = C39701sv.A00(str);
        if (A002 != null) {
            Iterator it = A002.A02.iterator();
            C87294We r6 = null;
            C87294We r5 = null;
            C87294We r3 = null;
            while (it.hasNext()) {
                C87294We r2 = (C87294We) it.next();
                String str2 = r2.A01;
                if (!TextUtils.isEmpty(r2.A02)) {
                    if ("FN".equals(str2)) {
                        r6 = r2;
                    } else if ("NAME".equals(str2)) {
                        r5 = r2;
                    } else if ("ORG".equals(str2) && r3 == null) {
                        r3 = r2;
                    }
                }
            }
            if (r6 != null) {
                return r6.A02;
            }
            if (r5 != null) {
                return r5.A02;
            }
            if (r3 != null) {
                return A00(r3.A03);
            }
            C39681st r02 = new C39681st(this.A00, this.A01, this.A02);
            try {
                r02.A07(A002);
                r0 = r02.A03;
            } catch (AnonymousClass25G unused) {
                r0 = null;
            }
            if (r0 != null) {
                return r0.A02();
            }
        }
        return null;
    }

    public List A02(List list) {
        int i2 = 0;
        int i3 = 0;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C39681st r0 = new C39681st(this.A00, this.A01, this.A02);
            try {
                r0.A06(str);
                C39701sv r1 = r0.A03;
                arrayList.add(new C39691su(str, r1));
                AnonymousClass4JK r12 = r1.A0A;
                i3 += r12.A01;
                i2 += r12.A00;
            } catch (AnonymousClass25G unused) {
            }
        }
        if (i3 > 0 || i2 > 0) {
            StringBuilder sb = new StringBuilder("contactstruct/construct/too_long=");
            sb.append(i3);
            sb.append("; exceed_max=");
            sb.append(i2);
            Log.w(sb.toString());
        }
        return arrayList;
    }

    public Map A03(String str) {
        HashMap hashMap = new HashMap();
        Uri.Builder buildUpon = ContactsContract.RawContacts.CONTENT_URI.buildUpon();
        Context context = this.A01.A00;
        Uri build = buildUpon.appendQueryParameter("account_name", context.getString(R.string.str1bd4)).appendQueryParameter("account_type", "com.obwhatsapp").build();
        ContentResolver contentResolver = context.getContentResolver();
        Cursor query = contentResolver.query(build, new String[]{"sync1", "_id"}, "contact_id=?", new String[]{str}, (String) null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    String string = query.getString(query.getColumnIndexOrThrow("_id"));
                    UserJid nullable = UserJid.getNullable(query.getString(query.getColumnIndexOrThrow("sync1")));
                    if (nullable != null) {
                        hashMap.put(string, nullable);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        if (query != null) {
            query.close();
        }
        return hashMap;
        throw th;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public X.C39691su A04(X.C38741rL r8) {
        /*
            r7 = this;
            monitor-enter(r8)
            java.lang.Object r6 = r8.A12     // Catch:{ all -> 0x0037 }
            monitor-enter(r6)     // Catch:{ all -> 0x0037 }
            X.1su r5 = r8.A02     // Catch:{ all -> 0x0034 }
            monitor-exit(r6)     // Catch:{ all -> 0x0034 }
            if (r5 != 0) goto L_0x0032
            r5 = 0
            java.lang.String r4 = r8.A12()     // Catch:{ 25G -> 0x002c }
            X.0tz r3 = r7.A01     // Catch:{ 25G -> 0x002c }
            X.0sG r2 = r7.A00     // Catch:{ 25G -> 0x002c }
            X.013 r1 = r7.A02     // Catch:{ 25G -> 0x002c }
            X.1st r0 = new X.1st     // Catch:{ 25G -> 0x002c }
            r0.<init>(r2, r3, r1)     // Catch:{ 25G -> 0x002c }
            r0.A06(r4)     // Catch:{ 25G -> 0x002c }
            X.1sv r1 = r0.A03     // Catch:{ 25G -> 0x002c }
            X.1su r0 = new X.1su     // Catch:{ 25G -> 0x002c }
            r0.<init>(r4, r1)     // Catch:{ 25G -> 0x002c }
            monitor-enter(r6)     // Catch:{ 25G -> 0x002c }
            r8.A02 = r0     // Catch:{ all -> 0x0029 }
            monitor-exit(r6)     // Catch:{ all -> 0x0029 }
            monitor-exit(r8)     // Catch:{ all -> 0x0037 }
            return r0
        L_0x0029:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0029 }
            throw r0     // Catch:{ 25G -> 0x002c }
        L_0x002c:
            r1 = move-exception
            java.lang.String r0 = "Can't read VCard contact."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0037 }
        L_0x0032:
            monitor-exit(r8)     // Catch:{ all -> 0x0037 }
            return r5
        L_0x0034:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0034 }
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0037 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39681st.A04(X.1rL):X.1su");
    }

    public void A05(C17150uc r7) {
        C39701sv r4 = this.A03;
        List<C39711sw> list = r4.A05;
        if (list != null) {
            for (C39711sw r3 : list) {
                C16010sH A0C = this.A00.A0C(r3.A02);
                if (A0C != null) {
                    if (A0C.A0H()) {
                        AnonymousClass4SC r1 = r4.A08;
                        r1.A08 = r1.A01;
                        String A012 = r7.A01((UserJid) A0C.A08(UserJid.class));
                        if (!TextUtils.isEmpty(A012)) {
                            r4.A01 = A012;
                        }
                    }
                    UserJid userJid = (UserJid) A0C.A08(UserJid.class);
                    if (A0C.A0i && userJid != null) {
                        r3.A01 = userJid;
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void A06(String str) {
        SystemClock.uptimeMillis();
        AnonymousClass25N A002 = C39701sv.A00(str);
        SystemClock.uptimeMillis();
        if (A002 != null) {
            try {
                A07(A002);
                SystemClock.uptimeMillis();
                return;
            } catch (AnonymousClass25G unused) {
                Log.e("Failed to construct VCard from node.");
            }
        }
        throw new AnonymousClass25G("Invalid VCard node.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0542, code lost:
        r1 = r4.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x059d, code lost:
        r1 = r4.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AnonymousClass25N r27) {
        /*
            r26 = this;
            r5 = 0
            r2 = r27
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "VCARD"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x05b4
            java.util.ArrayList r0 = r2.A02
            java.util.Iterator r19 = r0.iterator()
            r18 = 0
            r17 = 0
            r16 = 0
            r15 = 0
        L_0x001a:
            boolean r0 = r19.hasNext()
            r4 = r26
            if (r0 == 0) goto L_0x0540
            java.lang.Object r2 = r19.next()
            X.4We r2 = (X.C87294We) r2
            java.lang.String r1 = r2.A01
            java.lang.String r0 = r2.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = "VERSION"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = "FN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004b
            X.1sv r0 = r4.A03
            X.4SC r1 = r0.A08
            java.lang.String r0 = r2.A02
            r1.A01 = r0
            goto L_0x001a
        L_0x004b:
            java.lang.String r0 = "NAME"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0060
            X.1sv r0 = r4.A03
            X.4SC r3 = r0.A08
            java.lang.String r0 = r3.A01
            if (r0 != 0) goto L_0x0060
            java.lang.String r0 = r2.A02
            r3.A01 = r0
            goto L_0x001a
        L_0x0060:
            java.lang.String r0 = "N"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0072
            X.1sv r0 = r4.A03
            X.4SC r1 = r0.A08
            java.util.List r0 = r2.A03
            X.C39701sv.A01(r0, r1)
            goto L_0x001a
        L_0x0072:
            java.lang.String r0 = "SORT-STRING"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0081
            X.1sv r1 = r4.A03
            java.lang.String r0 = r2.A02
            r1.A00 = r0
            goto L_0x001a
        L_0x0081:
            java.lang.String r0 = "SOUND"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00bd
            java.util.Set r1 = r2.A04
            java.lang.String r0 = "X-IRMC-N"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0511
            X.1sv r7 = r4.A03
            java.lang.String r0 = r7.A00
            if (r0 != 0) goto L_0x0511
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r4 = r2.A02
            int r3 = r4.length()
            r2 = 0
        L_0x00a5:
            if (r2 >= r3) goto L_0x00b5
            char r1 = r4.charAt(r2)
            r0 = 59
            if (r1 == r0) goto L_0x00b2
            r6.append(r1)
        L_0x00b2:
            int r2 = r2 + 1
            goto L_0x00a5
        L_0x00b5:
            java.lang.String r0 = r6.toString()
            r7.A00 = r0
            goto L_0x001a
        L_0x00bd:
            java.lang.String r0 = "ADR"
            boolean r0 = r1.equals(r0)
            java.lang.String r10 = "X-"
            r6 = -1
            java.lang.String r9 = "PREF"
            java.lang.String r3 = ""
            java.lang.String r8 = "WORK"
            java.lang.String r7 = "HOME"
            if (r0 == 0) goto L_0x01f0
            java.util.List r13 = r2.A03
            java.util.Iterator r1 = r13.iterator()
        L_0x00d6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x00d6
            java.util.Set r0 = r2.A04
            java.util.Iterator r14 = r0.iterator()
            r12 = r3
            r11 = 0
        L_0x00f0:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x015b
            java.lang.Object r1 = r14.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r1.equals(r9)
            if (r0 == 0) goto L_0x0108
            if (r17 != 0) goto L_0x0108
            r17 = 1
            r11 = 1
            goto L_0x00f0
        L_0x0108:
            boolean r0 = r1.equalsIgnoreCase(r7)
            if (r0 == 0) goto L_0x0111
            r12 = r3
            r6 = 1
            goto L_0x00f0
        L_0x0111:
            boolean r0 = r1.equalsIgnoreCase(r8)
            if (r0 != 0) goto L_0x0158
            java.lang.String r0 = "COMPANY"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0158
            java.lang.String r0 = "POSTAL"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00f0
            java.lang.String r0 = "PARCEL"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00f0
            java.lang.String r0 = "DOM"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00f0
            java.lang.String r0 = "INTL"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00f0
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r1.toUpperCase(r0)
            boolean r0 = r0.startsWith(r10)
            if (r0 == 0) goto L_0x0154
            if (r6 >= 0) goto L_0x00f0
            r0 = 2
            java.lang.String r12 = r1.substring(r0)
        L_0x0152:
            r6 = 0
            goto L_0x00f0
        L_0x0154:
            if (r6 >= 0) goto L_0x00f0
            r12 = r1
            goto L_0x0152
        L_0x0158:
            r12 = r3
            r6 = 2
            goto L_0x00f0
        L_0x015b:
            if (r6 >= 0) goto L_0x015e
            r6 = 1
        L_0x015e:
            int r1 = r13.size()
            r0 = 1
            if (r1 <= r0) goto L_0x01ec
            X.4bQ r7 = new X.4bQ
            r7.<init>()
            int r1 = r13.size()
            r0 = 2
            if (r1 <= r0) goto L_0x0179
            java.lang.Object r0 = r13.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r7.A03 = r0
        L_0x0179:
            int r1 = r13.size()
            r0 = 3
            if (r1 <= r0) goto L_0x0188
            java.lang.Object r0 = r13.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r7.A00 = r0
        L_0x0188:
            int r1 = r13.size()
            r0 = 4
            if (r1 <= r0) goto L_0x0197
            java.lang.Object r0 = r13.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r7.A02 = r0
        L_0x0197:
            int r1 = r13.size()
            r0 = 5
            if (r1 <= r0) goto L_0x01a6
            java.lang.Object r0 = r13.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r7.A04 = r0
        L_0x01a6:
            int r1 = r13.size()
            r0 = 6
            if (r1 <= r0) goto L_0x01b5
            java.lang.Object r0 = r13.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r7.A01 = r0
        L_0x01b5:
            int r1 = r13.size()
            r0 = 7
            if (r1 <= r0) goto L_0x01bf
            r13.get(r0)
        L_0x01bf:
            java.lang.String r0 = r7.toString()
            java.lang.String r3 = r0.trim()
        L_0x01c7:
            X.1sv r0 = r4.A03
            java.util.List r2 = r0.A02
            if (r2 != 0) goto L_0x01d4
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.A02 = r2
        L_0x01d4:
            X.4Nw r1 = new X.4Nw
            r1.<init>()
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$StructuredPostal> r0 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class
            r1.A01 = r0
            r1.A00 = r6
            r1.A02 = r3
            r1.A04 = r7
            r1.A03 = r12
            r1.A05 = r11
            r2.add(r1)
            goto L_0x001a
        L_0x01ec:
            java.lang.String r3 = r2.A02
            r7 = 0
            goto L_0x01c7
        L_0x01f0:
            java.lang.String r0 = "ORG"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0221
            java.util.Set r0 = r2.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x01fe:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0214
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x01fe
            if (r15 != 0) goto L_0x01fe
            r15 = 1
            goto L_0x01fe
        L_0x0214:
            X.1sv r1 = r4.A03
            java.util.List r0 = r2.A03
            java.lang.String r0 = A00(r0)
            r1.A04(r0, r3)
            goto L_0x001a
        L_0x0221:
            java.lang.String r0 = "TITLE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0518
            java.lang.String r0 = "ROLE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0518
            java.lang.String r0 = "PHOTO"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0259
            java.lang.String r0 = r2.A02
            byte[] r2 = r0.getBytes()
            X.1sv r1 = r4.A03
            r0 = 0
            r1.A09 = r0
            if (r2 == 0) goto L_0x001a
            int r0 = r2.length
            if (r0 <= 0) goto L_0x001a
            byte[] r0 = android.util.Base64.decode(r2, r5)     // Catch:{ ArrayIndexOutOfBoundsException | IllegalArgumentException | StringIndexOutOfBoundsException -> 0x0251 }
            r1.A09 = r0     // Catch:{ ArrayIndexOutOfBoundsException | IllegalArgumentException | StringIndexOutOfBoundsException -> 0x0251 }
            goto L_0x001a
        L_0x0251:
            r1 = move-exception
            java.lang.String r0 = "contactstruct/constructcontactfromvnode/base64-decode/error"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x001a
        L_0x0259:
            java.lang.String r0 = "LOGO"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0268
            java.lang.String r0 = "name/LOGO/we_don't_support"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x001a
        L_0x0268:
            java.lang.String r0 = "EMAIL"
            boolean r0 = r1.equals(r0)
            java.lang.String r3 = "CELL"
            if (r0 == 0) goto L_0x02eb
            java.util.Set r0 = r2.A04
            java.util.Iterator r13 = r0.iterator()
            r12 = 0
            r11 = 0
        L_0x027a:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x02c3
            java.lang.Object r1 = r13.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r1.equals(r9)
            if (r0 == 0) goto L_0x0292
            if (r16 != 0) goto L_0x0292
            r16 = 1
            r11 = 1
            goto L_0x027a
        L_0x0292:
            boolean r0 = r1.equalsIgnoreCase(r7)
            if (r0 == 0) goto L_0x029a
            r6 = 1
            goto L_0x027a
        L_0x029a:
            boolean r0 = r1.equalsIgnoreCase(r8)
            if (r0 == 0) goto L_0x02a2
            r6 = 2
            goto L_0x027a
        L_0x02a2:
            boolean r0 = r1.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x02aa
            r6 = 4
            goto L_0x027a
        L_0x02aa:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r1.toUpperCase(r0)
            boolean r0 = r0.startsWith(r10)
            if (r0 == 0) goto L_0x02c0
            if (r6 >= 0) goto L_0x027a
            r0 = 2
            java.lang.String r1 = r1.substring(r0)
        L_0x02bd:
            r12 = r1
            r6 = 0
            goto L_0x027a
        L_0x02c0:
            if (r6 >= 0) goto L_0x027a
            goto L_0x02bd
        L_0x02c3:
            if (r6 >= 0) goto L_0x02c6
            r6 = 3
        L_0x02c6:
            X.1sv r0 = r4.A03
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Email> r3 = android.provider.ContactsContract.CommonDataKinds.Email.class
            java.lang.String r2 = r2.A02
            java.util.List r1 = r0.A02
            if (r1 != 0) goto L_0x02d7
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.A02 = r1
        L_0x02d7:
            X.4Nw r0 = new X.4Nw
            r0.<init>()
            r0.A01 = r3
            r0.A00 = r6
            r0.A02 = r2
            r0.A03 = r12
            r0.A05 = r11
            r1.add(r0)
            goto L_0x001a
        L_0x02eb:
            java.lang.String r0 = "TEL"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03a5
            java.util.Set r0 = r2.A04
            java.util.Iterator r12 = r0.iterator()
            r23 = r7
            r11 = 0
            r25 = 0
        L_0x02fe:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x038b
            java.lang.Object r1 = r12.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r11 == 0) goto L_0x0327
            boolean r0 = r1.equals(r7)
            if (r0 == 0) goto L_0x031f
            r6 = 5
        L_0x0313:
            android.content.ContentValues r1 = r2.A00
            java.lang.String r0 = "waId"
            java.lang.String r0 = r1.getAsString(r0)
            if (r0 == 0) goto L_0x0394
            goto L_0x038f
        L_0x031f:
            boolean r0 = r1.equals(r8)
            if (r0 == 0) goto L_0x038b
            r6 = 4
            goto L_0x0313
        L_0x0327:
            boolean r0 = r1.equals(r9)
            if (r0 == 0) goto L_0x0334
            if (r18 != 0) goto L_0x0334
            r18 = 1
            r25 = 1
            goto L_0x02fe
        L_0x0334:
            boolean r0 = r1.equalsIgnoreCase(r7)
            if (r0 == 0) goto L_0x033c
            r6 = 1
            goto L_0x02fe
        L_0x033c:
            boolean r0 = r1.equalsIgnoreCase(r8)
            if (r0 == 0) goto L_0x0344
            r6 = 3
            goto L_0x02fe
        L_0x0344:
            boolean r0 = r1.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x034c
            r6 = 2
            goto L_0x02fe
        L_0x034c:
            java.lang.String r0 = "PAGER"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0356
            r6 = 6
            goto L_0x02fe
        L_0x0356:
            java.lang.String r0 = "FAX"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0360
            r11 = 1
            goto L_0x02fe
        L_0x0360:
            java.lang.String r0 = "VOICE"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x02fe
            java.lang.String r0 = "MSG"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x02fe
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r1.toUpperCase(r0)
            boolean r0 = r0.startsWith(r10)
            if (r0 == 0) goto L_0x0386
            if (r6 >= 0) goto L_0x02fe
            r0 = 2
            java.lang.String r23 = r1.substring(r0)
        L_0x0383:
            r6 = 0
            goto L_0x02fe
        L_0x0386:
            if (r6 >= 0) goto L_0x02fe
            r23 = r1
            goto L_0x0383
        L_0x038b:
            if (r6 >= 0) goto L_0x0313
            r6 = 1
            goto L_0x0313
        L_0x038f:
            X.1ZT r21 = X.AnonymousClass1ZT.A03(r0)     // Catch:{ 1W4 -> 0x0394 }
            goto L_0x0396
        L_0x0394:
            r21 = 0
        L_0x0396:
            X.1sv r1 = r4.A03
            java.lang.String r0 = r2.A02
            r20 = r1
            r22 = r0
            r24 = r6
            r20.A03(r21, r22, r23, r24, r25)
            goto L_0x001a
        L_0x03a5:
            java.lang.String r0 = "NOTE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03b8
            X.1sv r0 = r4.A03
            java.util.List r1 = r0.A03
            java.lang.String r0 = r2.A02
            r1.add(r0)
            goto L_0x001a
        L_0x03b8:
            java.lang.String r0 = "BDAY"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03e8
            X.1sv r4 = r4.A03
            java.lang.String r3 = r2.A02
            if (r3 == 0) goto L_0x03e3
            java.lang.String r0 = "1604"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x03e3
            java.lang.String r0 = "-"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 4
            java.lang.String r0 = r3.substring(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.A02 = r0
        L_0x03e3:
            r4.A05(r2)
            goto L_0x001a
        L_0x03e8:
            java.lang.String r0 = "URL"
            boolean r0 = r1.equals(r0)
            java.lang.String r3 = "PROFILE"
            if (r0 == 0) goto L_0x0465
            java.lang.String r6 = r2.A02
            java.util.Set r0 = r2.A04
            java.util.Iterator r9 = r0.iterator()
            r2 = -1
        L_0x03fb:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0447
            java.lang.Object r1 = r9.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "BLOG"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0411
            r2 = 2
            goto L_0x03fb
        L_0x0411:
            java.lang.String r0 = "FTP"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x041b
            r2 = 6
            goto L_0x03fb
        L_0x041b:
            boolean r0 = r1.equalsIgnoreCase(r7)
            if (r0 == 0) goto L_0x0423
            r2 = 4
            goto L_0x03fb
        L_0x0423:
            java.lang.String r0 = "HOMEPAGE"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x042d
            r2 = 1
            goto L_0x03fb
        L_0x042d:
            java.lang.String r0 = "OTHER"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0437
            r2 = 7
            goto L_0x03fb
        L_0x0437:
            boolean r0 = r1.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x043f
            r2 = 3
            goto L_0x03fb
        L_0x043f:
            boolean r0 = r1.equalsIgnoreCase(r8)
            if (r0 == 0) goto L_0x03fb
            r2 = 5
            goto L_0x03fb
        L_0x0447:
            X.1sv r0 = r4.A03
            java.util.List r1 = r0.A06
            if (r1 != 0) goto L_0x0454
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.A06 = r1
        L_0x0454:
            X.4JL r0 = new X.4JL
            r0.<init>()
            r0.A00 = r2
            X.AnonymousClass00B.A06(r6)
            r0.A01 = r6
            r1.add(r0)
            goto L_0x001a
        L_0x0465:
            java.lang.String r0 = "REV"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0511
            java.lang.String r0 = "UID"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0511
            java.lang.String r0 = "KEY"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0511
            java.lang.String r0 = "MAILER"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0511
            java.lang.String r0 = "TZ"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0511
            java.lang.String r0 = "GEO"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0511
            java.lang.String r0 = "NICKNAME"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0511
            java.lang.String r0 = "CLASS"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0511
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x0511
            java.lang.String r0 = "CATEGORIES"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0511
            java.lang.String r0 = "SOURCE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0511
            java.lang.String r0 = "PRODID"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0511
            java.lang.String r0 = "X-PHONETIC-FIRST-NAME"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x04d5
            X.1sv r0 = r4.A03
            X.4SC r1 = r0.A08
            java.lang.String r0 = r2.A02
            r1.A04 = r0
            goto L_0x001a
        L_0x04d5:
            java.lang.String r0 = "X-PHONETIC-MIDDLE-NAME"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = "X-PHONETIC-LAST-NAME"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x04ef
            X.1sv r0 = r4.A03
            X.4SC r1 = r0.A08
            java.lang.String r0 = r2.A02
            r1.A05 = r0
            goto L_0x001a
        L_0x04ef:
            java.lang.String r0 = "X-WA-BIZ-NAME"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0501
            X.1sv r0 = r4.A03
            X.4SC r1 = r0.A08
            java.lang.String r0 = r2.A02
            r1.A08 = r0
            goto L_0x001a
        L_0x0501:
            java.lang.String r0 = "X-WA-BIZ-DESCRIPTION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0511
            X.1sv r1 = r4.A03
            java.lang.String r0 = r2.A02
            r1.A01 = r0
            goto L_0x001a
        L_0x0511:
            X.1sv r0 = r4.A03
            r0.A05(r2)
            goto L_0x001a
        L_0x0518:
            X.1sv r6 = r4.A03
            java.lang.String r4 = r2.A02
            java.util.List r0 = r6.A04
            if (r0 != 0) goto L_0x0527
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.A04 = r0
        L_0x0527:
            int r2 = r0.size()
            r1 = 1
            if (r2 != 0) goto L_0x0533
            r0 = 0
            r6.A04(r3, r0)
            r2 = 1
        L_0x0533:
            java.util.List r0 = r6.A04
            int r2 = r2 - r1
            java.lang.Object r0 = r0.get(r2)
            X.4JJ r0 = (X.AnonymousClass4JJ) r0
            r0.A01 = r4
            goto L_0x001a
        L_0x0540:
            if (r18 != 0) goto L_0x0559
            X.1sv r1 = r4.A03
            java.util.List r0 = r1.A05
            if (r0 == 0) goto L_0x0559
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0559
            java.util.List r0 = r1.A05
            java.lang.Object r1 = r0.get(r5)
            X.1sw r1 = (X.C39711sw) r1
            r0 = 1
            r1.A04 = r0
        L_0x0559:
            if (r17 != 0) goto L_0x057a
            X.1sv r0 = r4.A03
            java.util.List r0 = r0.A02
            if (r0 == 0) goto L_0x057a
            java.util.Iterator r3 = r0.iterator()
        L_0x0565:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x057a
            java.lang.Object r2 = r3.next()
            X.4Nw r2 = (X.C85294Nw) r2
            java.lang.Class r1 = r2.A01
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$StructuredPostal> r0 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class
            if (r1 != r0) goto L_0x0565
            r0 = 1
            r2.A05 = r0
        L_0x057a:
            if (r16 != 0) goto L_0x059b
            X.1sv r0 = r4.A03
            java.util.List r0 = r0.A02
            if (r0 == 0) goto L_0x059b
            java.util.Iterator r3 = r0.iterator()
        L_0x0586:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x059b
            java.lang.Object r2 = r3.next()
            X.4Nw r2 = (X.C85294Nw) r2
            java.lang.Class r1 = r2.A01
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Email> r0 = android.provider.ContactsContract.CommonDataKinds.Email.class
            if (r1 != r0) goto L_0x0586
            r0 = 1
            r2.A05 = r0
        L_0x059b:
            if (r15 != 0) goto L_0x05ae
            X.1sv r1 = r4.A03
            java.util.List r0 = r1.A04
            if (r0 == 0) goto L_0x05ae
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x05ae
            java.util.List r0 = r1.A04
            r0.get(r5)
        L_0x05ae:
            X.1sv r0 = r4.A03
            r4.A08(r0)
            return
        L_0x05b4:
            java.lang.String r1 = "Non VCARD data is inserted."
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.25G r0 = new X.25G
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39681st.A07(X.25N):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x01bb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.C39701sv r15) {
        /*
            r14 = this;
            java.util.List r0 = r15.A05
            if (r0 == 0) goto L_0x01c1
            int r0 = r0.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.List r0 = r15.A05
            java.util.Iterator r3 = r0.iterator()
        L_0x0013:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0041
            java.lang.Object r1 = r3.next()
            X.1sw r1 = (X.C39711sw) r1
            com.whatsapp.jid.UserJid r0 = r1.A01
            if (r0 != 0) goto L_0x0013
            java.lang.String r2 = r1.A02
            if (r2 == 0) goto L_0x0013
            r0 = 44
            int r1 = r2.indexOf(r0)
            r0 = -1
            if (r1 == r0) goto L_0x0035
            r0 = 0
            java.lang.String r2 = r2.substring(r0, r1)
        L_0x0035:
            java.lang.String r0 = r2.trim()
            java.lang.String r0 = android.telephony.PhoneNumberUtils.stripSeparators(r0)
            r4.add(r0)
            goto L_0x0013
        L_0x0041:
            android.os.SystemClock.uptimeMillis()
            X.0sG r0 = r14.A00
            X.18c r8 = r0.A06
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x00d7
            java.util.Map r3 = java.util.Collections.emptyMap()
        L_0x0052:
            android.os.SystemClock.uptimeMillis()
            java.util.List r0 = r15.A05
            java.util.Iterator r6 = r0.iterator()
        L_0x005b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0187
            java.lang.Object r4 = r6.next()
            X.1sw r4 = (X.C39711sw) r4
            com.whatsapp.jid.UserJid r0 = r4.A01
            if (r0 != 0) goto L_0x0094
            java.lang.String r2 = r4.A02
            r0 = 44
            int r1 = r2.indexOf(r0)
            r0 = -1
            if (r1 == r0) goto L_0x007b
            r0 = 0
            java.lang.String r2 = r2.substring(r0, r1)
        L_0x007b:
            java.lang.String r0 = r2.trim()
            java.lang.String r0 = android.telephony.PhoneNumberUtils.stripSeparators(r0)
            java.lang.Object r0 = r3.get(r0)
            X.0rv r0 = (X.C15830rv) r0
            if (r0 != 0) goto L_0x0094
            java.lang.String r0 = r4.A02
            java.lang.String r5 = r0.trim()
        L_0x0091:
            r4.A02 = r5
            goto L_0x005b
        L_0x0094:
            java.lang.String r5 = X.C24561Gk.A04(r0)
            if (r5 == 0) goto L_0x0091
            java.lang.String r2 = r4.A02
            if (r2 == 0) goto L_0x0091
            com.whatsapp.jid.UserJid r0 = r4.A01
            if (r0 != 0) goto L_0x0091
            r0 = 44
            int r1 = r2.indexOf(r0)
            r0 = -1
            if (r1 == r0) goto L_0x00d4
            int r0 = r1 + 1
            java.lang.String r0 = r2.substring(r0)
        L_0x00b1:
            java.lang.String r0 = r0.trim()
            java.lang.String r2 = android.telephony.PhoneNumberUtils.stripSeparators(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0091
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r0 = 44
            r1.append(r0)
            r1.append(r2)
            java.lang.String r5 = r1.toString()
            goto L_0x0091
        L_0x00d4:
            java.lang.String r0 = ""
            goto L_0x00b1
        L_0x00d7:
            int r2 = r4.size()
            r9 = 1
            r5 = 0
            r1 = 10
            r0 = 0
            if (r2 > r1) goto L_0x00e3
            r0 = 1
        L_0x00e3:
            X.AnonymousClass00B.A0G(r0)
            java.util.Iterator r3 = r4.iterator()
        L_0x00ea:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0106
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0101
            int r2 = r0.length()
            r1 = 30
            r0 = 1
            if (r2 <= r1) goto L_0x0102
        L_0x0101:
            r0 = 0
        L_0x0102:
            X.AnonymousClass00B.A0G(r0)
            goto L_0x00ea
        L_0x0106:
            int r0 = r4.size()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>(r0)
            java.lang.String r0 = "number IN ("
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            int r6 = r4.size()
            int r6 = r6 - r9
            java.lang.String r2 = "?, "
            r0 = 3
            int r0 = r0 * r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 0
        L_0x0125:
            if (r0 >= r6) goto L_0x012d
            r1.append(r2)
            int r0 = r0 + 1
            goto L_0x0125
        L_0x012d:
            java.lang.String r0 = r1.toString()
            r7.append(r0)
            java.lang.String r0 = "?)"
            r7.append(r0)
            java.lang.String r9 = r7.toString()
            X.11X r0 = r8.A00
            X.0tf r7 = r0.get()
            java.lang.String r8 = "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)"
            java.lang.String[] r12 = X.C224818c.A0A     // Catch:{ all -> 0x01bc }
            java.lang.String[] r0 = new java.lang.String[r5]     // Catch:{ all -> 0x01bc }
            java.lang.Object[] r13 = r4.toArray(r0)     // Catch:{ all -> 0x01bc }
            java.lang.String[] r13 = (java.lang.String[]) r13     // Catch:{ all -> 0x01bc }
            r10 = 0
            java.lang.String r11 = "CONTACTS"
            android.database.Cursor r5 = X.AnonymousClass15L.A03(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x01bc }
            if (r5 == 0) goto L_0x0182
            java.lang.String r0 = "jid"
            int r4 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = "number"
            int r2 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01b7 }
        L_0x0165:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x01b7 }
            if (r0 == 0) goto L_0x017f
            java.lang.String r0 = r5.getString(r4)     // Catch:{ all -> 0x01b7 }
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.getNullable(r0)     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = r5.getString(r2)     // Catch:{ all -> 0x01b7 }
            if (r1 == 0) goto L_0x0165
            if (r0 == 0) goto L_0x0165
            r3.put(r0, r1)     // Catch:{ all -> 0x01b7 }
            goto L_0x0165
        L_0x017f:
            r5.close()     // Catch:{ all -> 0x01bc }
        L_0x0182:
            r7.close()
            goto L_0x0052
        L_0x0187:
            java.util.List r0 = r15.A05
            java.util.Iterator r3 = r0.iterator()
        L_0x018d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01c1
            java.lang.Object r2 = r3.next()
            X.1sw r2 = (X.C39711sw) r2
            int r0 = r2.A00
            if (r0 != 0) goto L_0x018d
            java.lang.String r1 = r2.A03
            if (r1 == 0) goto L_0x01a9
            java.lang.String r0 = "null"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x018d
        L_0x01a9:
            X.0tz r0 = r14.A01
            android.content.Context r1 = r0.A00
            r0 = 2131889669(0x7f120e05, float:1.9414008E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A03 = r0
            goto L_0x018d
        L_0x01b7:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x01bb }
        L_0x01bb:
            throw r0     // Catch:{ all -> 0x01bc }
        L_0x01bc:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x01c0 }
        L_0x01c0:
            throw r0
        L_0x01c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39681st.A08(X.1sv):void");
    }
}
