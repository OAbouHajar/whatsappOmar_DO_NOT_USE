package X;

/* renamed from: X.25O  reason: invalid class name */
public class AnonymousClass25O {
    public int A00 = 0;
    public String A01;
    public StringBuilder A02;
    public final AnonymousClass1G1 A03;
    public final AnonymousClass013 A04;

    public AnonymousClass25O(AnonymousClass1G1 r2, AnonymousClass013 r3) {
        this.A04 = r3;
        this.A03 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01fe, code lost:
        if (r10.trim().equals("") != false) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02b8, code lost:
        if (r9.trim().equals("") != false) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0364, code lost:
        if (r8.trim().equals("") != false) goto L_0x0366;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0116, code lost:
        if (r1 != false) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01bd, code lost:
        if (r6.A00 == -1) goto L_0x0183;
     */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00(X.C39701sv r14) {
        /*
            r13 = this;
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r13.A02 = r2
            X.4SC r4 = r14.A08
            java.lang.String r1 = r4.A01
            if (r1 != 0) goto L_0x0011
            java.lang.String r1 = ""
            r4.A01 = r1
        L_0x0011:
            java.lang.String r8 = "\n"
            r13.A01 = r8
            java.lang.String r0 = "BEGIN:VCARD"
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = "VERSION:3.0"
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = "N:"
            r2.append(r0)
            java.lang.String r0 = r4.A00
            java.lang.String r5 = ";"
            if (r0 == 0) goto L_0x0033
            r2.append(r0)
        L_0x0033:
            r2.append(r5)
            java.lang.String r0 = r4.A02
            if (r0 == 0) goto L_0x003d
            r2.append(r0)
        L_0x003d:
            r2.append(r5)
            java.lang.String r0 = r4.A03
            if (r0 == 0) goto L_0x0047
            r2.append(r0)
        L_0x0047:
            r2.append(r5)
            java.lang.String r0 = r4.A06
            if (r0 == 0) goto L_0x0051
            r2.append(r0)
        L_0x0051:
            r2.append(r5)
            java.lang.String r0 = r4.A07
            if (r0 == 0) goto L_0x005b
            r2.append(r0)
        L_0x005b:
            r2.append(r8)
            java.lang.String r0 = "FN:"
            r2.append(r0)
            r2.append(r1)
            r2.append(r8)
            java.util.Map r0 = r14.A07
            r3 = 0
            if (r0 == 0) goto L_0x0095
            java.lang.String r2 = "NICKNAME"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x0095
            java.lang.StringBuilder r1 = r13.A02
            java.lang.String r0 = "NICKNAME:"
            r1.append(r0)
            java.util.Map r0 = r14.A07
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r3)
            X.4We r0 = (X.C87294We) r0
            java.lang.String r0 = r0.A02
            r1.append(r0)
            java.lang.String r0 = r13.A01
            r1.append(r0)
        L_0x0095:
            java.lang.String r2 = r4.A04
            if (r2 == 0) goto L_0x00a8
            java.lang.StringBuilder r1 = r13.A02
            java.lang.String r0 = "X-PHONETIC-FIRST-NAME:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r13.A01
            r1.append(r0)
        L_0x00a8:
            java.lang.String r2 = r4.A05
            if (r2 == 0) goto L_0x00bb
            java.lang.StringBuilder r1 = r13.A02
            java.lang.String r0 = "X-PHONETIC-LAST-NAME:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r13.A01
            r1.append(r0)
        L_0x00bb:
            java.util.List r0 = r14.A04
            if (r0 == 0) goto L_0x00fb
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00fb
            java.util.List r0 = r14.A04
            java.lang.Object r0 = r0.get(r3)
            X.4JJ r0 = (X.AnonymousClass4JJ) r0
            java.lang.String r6 = r0.A00
            java.util.List r0 = r14.A04
            java.lang.Object r0 = r0.get(r3)
            X.4JJ r0 = (X.AnonymousClass4JJ) r0
            java.lang.String r2 = r0.A01
            if (r6 == 0) goto L_0x00ea
            java.lang.StringBuilder r1 = r13.A02
            java.lang.String r0 = "ORG:"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r13.A01
            r1.append(r0)
        L_0x00ea:
            if (r2 == 0) goto L_0x00fb
            java.lang.StringBuilder r1 = r13.A02
            java.lang.String r0 = "TITLE:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r13.A01
            r1.append(r0)
        L_0x00fb:
            java.util.List r2 = r14.A03
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x014e
            java.lang.Object r0 = r2.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0118
            java.lang.String r1 = r0.trim()
            java.lang.String r0 = ""
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0119
        L_0x0118:
            r0 = 1
        L_0x0119:
            if (r0 != 0) goto L_0x014e
            java.lang.StringBuilder r7 = r13.A02
            java.lang.String r0 = "NOTE:"
            r7.append(r0)
            java.lang.Object r10 = r2.get(r3)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r9 = "\r\n"
            boolean r0 = r10.endsWith(r9)
            r6 = 1
            r2 = 0
            r1 = 2
            if (r0 == 0) goto L_0x01ce
            int r0 = r10.length()
            int r0 = r0 - r1
        L_0x0138:
            java.lang.String r0 = r10.substring(r3, r0)
            java.lang.String r1 = r0.replaceAll(r9, r8)
            java.lang.String r0 = "\n "
            java.lang.String r2 = r1.replaceAll(r8, r0)
        L_0x0146:
            r7.append(r2)
            java.lang.String r0 = r13.A01
            r7.append(r0)
        L_0x014e:
            java.util.List r0 = r14.A05
            if (r0 == 0) goto L_0x0295
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Iterator r11 = r0.iterator()
        L_0x015b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01db
            java.lang.Object r6 = r11.next()
            X.1sw r6 = (X.C39711sw) r6
            java.lang.String r0 = r6.A02
            boolean r1 = r2.containsKey(r0)
            java.lang.String r0 = r6.A02
            if (r1 == 0) goto L_0x01ca
            java.lang.Object r1 = r2.get(r0)
            X.1sw r1 = (X.C39711sw) r1
            int r0 = r1.A00
            r7 = 1
            r8 = -1
            if (r0 != r8) goto L_0x01b7
            int r0 = r6.A00
            if (r0 != r8) goto L_0x01bf
            r1.A00 = r7
        L_0x0183:
            java.lang.String r10 = r1.A03
            java.lang.String r9 = "null"
            if (r10 == 0) goto L_0x018f
            boolean r0 = r10.equalsIgnoreCase(r9)
            if (r0 == 0) goto L_0x019b
        L_0x018f:
            java.lang.String r8 = r6.A03
            if (r8 == 0) goto L_0x01b0
            boolean r0 = r8.equalsIgnoreCase(r9)
            if (r0 != 0) goto L_0x01b0
            r1.A03 = r8
        L_0x019b:
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x01a3
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x01a5
        L_0x01a3:
            r1.A04 = r7
        L_0x01a5:
            com.whatsapp.jid.UserJid r0 = r1.A01
            if (r0 != 0) goto L_0x015b
            com.whatsapp.jid.UserJid r0 = r6.A01
            if (r0 == 0) goto L_0x015b
            r1.A01 = r0
            goto L_0x015b
        L_0x01b0:
            if (r10 != 0) goto L_0x019b
            java.lang.String r0 = "HOME"
            r1.A03 = r0
            goto L_0x019b
        L_0x01b7:
            if (r0 == r8) goto L_0x01bf
            if (r0 != 0) goto L_0x0183
            int r0 = r6.A00
            if (r0 == r8) goto L_0x0183
        L_0x01bf:
            int r0 = r6.A00
            r1.A00 = r0
            if (r0 != 0) goto L_0x0183
            java.lang.String r0 = r6.A03
            r1.A03 = r0
            goto L_0x0183
        L_0x01ca:
            r2.put(r0, r6)
            goto L_0x015b
        L_0x01ce:
            boolean r0 = r10.endsWith(r8)
            if (r0 == 0) goto L_0x0146
            int r0 = r10.length()
            int r0 = r0 - r6
            goto L_0x0138
        L_0x01db:
            java.util.Collection r0 = r2.values()
            java.util.Iterator r11 = r0.iterator()
        L_0x01e3:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0295
            java.lang.Object r7 = r11.next()
            X.1sw r7 = (X.C39711sw) r7
            java.lang.String r10 = r7.A02
            if (r10 == 0) goto L_0x0200
            java.lang.String r1 = r10.trim()
            java.lang.String r0 = ""
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0201
        L_0x0200:
            r0 = 1
        L_0x0201:
            if (r0 != 0) goto L_0x01e3
            int r1 = r7.A00
            r6 = 58
            if (r1 != 0) goto L_0x024d
            int r0 = r13.A00
            int r9 = r0 + 1
            r13.A00 = r9
            java.lang.StringBuilder r8 = r13.A02
            java.lang.String r2 = "item"
            r8.append(r2)
            r8.append(r9)
            java.lang.String r0 = ".TEL"
            r8.append(r0)
            com.whatsapp.jid.UserJid r0 = r7.A01
            if (r0 == 0) goto L_0x022e
            java.lang.String r1 = r0.user
            if (r1 == 0) goto L_0x022e
            java.lang.String r0 = ";waid="
            r8.append(r0)
            r8.append(r1)
        L_0x022e:
            r8.append(r6)
            r8.append(r10)
            java.lang.String r1 = r13.A01
            r8.append(r1)
            r8.append(r2)
            r8.append(r9)
            java.lang.String r0 = ".X-ABLabel:"
            r8.append(r0)
            java.lang.String r0 = r7.A03
            r8.append(r0)
            r8.append(r1)
            goto L_0x01e3
        L_0x024d:
            X.013 r0 = r13.A04
            int r1 = android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(r1)
            android.content.Context r0 = r0.A00
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r8 = r0.getString(r1)
            r2 = 59
            int r1 = r8.indexOf(r2)
            r0 = -1
            if (r1 == r0) goto L_0x026c
            r0 = 44
            java.lang.String r8 = r8.replace(r2, r0)
        L_0x026c:
            java.lang.StringBuilder r2 = r13.A02
            java.lang.String r0 = "TEL;type="
            r2.append(r0)
            r2.append(r8)
            com.whatsapp.jid.UserJid r0 = r7.A01
            if (r0 == 0) goto L_0x0286
            java.lang.String r1 = r0.user
            if (r1 == 0) goto L_0x0286
            java.lang.String r0 = ";waid="
            r2.append(r0)
            r2.append(r1)
        L_0x0286:
            r2.append(r6)
            java.lang.String r0 = r7.A02
            r2.append(r0)
            java.lang.String r0 = r13.A01
            r2.append(r0)
            goto L_0x01e3
        L_0x0295:
            java.util.List r0 = r14.A06
            if (r0 == 0) goto L_0x033b
            java.util.Iterator r10 = r0.iterator()
        L_0x029d:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x033b
            java.lang.Object r6 = r10.next()
            X.4JL r6 = (X.AnonymousClass4JL) r6
            java.lang.String r9 = r6.A01
            if (r9 == 0) goto L_0x02ba
            java.lang.String r1 = r9.trim()
            java.lang.String r0 = ""
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x02bb
        L_0x02ba:
            r0 = 1
        L_0x02bb:
            if (r0 != 0) goto L_0x029d
            int r7 = r6.A00
            r2 = 2
            r0 = 4
            r1 = 1
            if (r7 == r0) goto L_0x0311
            r0 = 5
            if (r7 == r0) goto L_0x030e
            if (r7 == r1) goto L_0x030b
            if (r7 == r2) goto L_0x0308
            r0 = 3
            if (r7 == r0) goto L_0x0305
            r0 = 6
            if (r7 == r0) goto L_0x0302
            java.lang.String r8 = "OTHER"
        L_0x02d3:
            int r0 = r13.A00
            int r7 = r0 + 1
            r13.A00 = r7
            java.lang.StringBuilder r6 = r13.A02
            java.lang.String r2 = "item"
            r6.append(r2)
            r6.append(r7)
            java.lang.String r0 = ".URL:"
            r6.append(r0)
            r6.append(r9)
            java.lang.String r1 = r13.A01
            r6.append(r1)
            r6.append(r2)
            r6.append(r7)
            java.lang.String r0 = ".X-ABLabel:"
            r6.append(r0)
            r6.append(r8)
            r6.append(r1)
            goto L_0x029d
        L_0x0302:
            java.lang.String r8 = "FTP"
            goto L_0x02d3
        L_0x0305:
            java.lang.String r8 = "PROFILE"
            goto L_0x02d3
        L_0x0308:
            java.lang.String r8 = "BLOG"
            goto L_0x02d3
        L_0x030b:
            java.lang.String r8 = "HOMEPAGE"
            goto L_0x02d3
        L_0x030e:
            java.lang.String r2 = "WORK"
            goto L_0x0313
        L_0x0311:
            java.lang.String r2 = "HOME"
        L_0x0313:
            int r1 = r2.indexOf(r5)
            r0 = -1
            if (r1 == r0) goto L_0x0320
            java.lang.String r0 = ","
            java.lang.String r2 = r2.replace(r5, r0)
        L_0x0320:
            java.lang.StringBuilder r1 = r13.A02
            java.lang.String r0 = "URL;type="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ":"
            r1.append(r0)
            java.lang.String r0 = r6.A01
            r1.append(r0)
            java.lang.String r0 = r13.A01
            r1.append(r0)
            goto L_0x029d
        L_0x033b:
            java.util.List r0 = r14.A02
            if (r0 == 0) goto L_0x04d6
            java.util.Iterator r12 = r0.iterator()
        L_0x0343:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x04d6
            java.lang.Object r10 = r12.next()
            X.4Nw r10 = (X.C85294Nw) r10
            java.lang.Class r1 = r10.A01
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Email> r0 = android.provider.ContactsContract.CommonDataKinds.Email.class
            if (r1 != r0) goto L_0x039e
            java.lang.String r8 = r10.A02
            if (r8 == 0) goto L_0x0366
            java.lang.String r1 = r8.trim()
            java.lang.String r0 = ""
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0367
        L_0x0366:
            r0 = 1
        L_0x0367:
            if (r0 != 0) goto L_0x0343
            int r1 = r10.A00
            if (r1 != 0) goto L_0x04a4
            int r0 = r13.A00
            int r7 = r0 + 1
            r13.A00 = r7
            java.lang.StringBuilder r6 = r13.A02
            java.lang.String r2 = "item"
            r6.append(r2)
            r6.append(r7)
            java.lang.String r0 = ".EMAIL;type=INTERNET:"
            r6.append(r0)
            r6.append(r8)
            java.lang.String r1 = r13.A01
            r6.append(r1)
            r6.append(r2)
            r6.append(r7)
            java.lang.String r0 = ".X-ABLabel:"
            r6.append(r0)
            java.lang.String r0 = r10.A03
            r6.append(r0)
            r6.append(r1)
            goto L_0x0343
        L_0x039e:
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$StructuredPostal> r0 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class
            if (r1 != r0) goto L_0x0343
            int r0 = r13.A00
            int r11 = r0 + 1
            r13.A00 = r11
            X.4bQ r7 = r10.A04
            if (r7 == 0) goto L_0x04cf
            int r1 = r10.A00
            java.lang.String r6 = "vcardcomposer/appendwapostalstr failed isoFromNativeName"
            java.lang.String r9 = ".X-ABADR:"
            java.lang.String r8 = "item"
            if (r1 != 0) goto L_0x042d
            java.lang.StringBuilder r2 = r13.A02
            r2.append(r8)
            r2.append(r11)
            java.lang.String r0 = ".ADR:;;"
            r2.append(r0)
            java.lang.String r0 = r7.A01()
            r2.append(r0)
            java.lang.String r0 = r13.A01
            r2.append(r0)
            r2.append(r8)
            r2.append(r11)
            r2.append(r9)
            java.lang.String r9 = r7.A01
            if (r9 == 0) goto L_0x040f
            X.1G1 r0 = r13.A03     // Catch:{ IOException -> 0x040b }
            r0.A05()     // Catch:{ IOException -> 0x040b }
            java.util.ArrayList r0 = r0.A02     // Catch:{ IOException -> 0x040b }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ IOException -> 0x040b }
        L_0x03e8:
            boolean r0 = r7.hasNext()     // Catch:{ IOException -> 0x040b }
            if (r0 == 0) goto L_0x0408
            java.lang.Object r1 = r7.next()     // Catch:{ IOException -> 0x040b }
            X.1aE r1 = (X.C29211aE) r1     // Catch:{ IOException -> 0x040b }
            java.lang.String r0 = r1.A03     // Catch:{ IOException -> 0x040b }
            boolean r0 = r0.startsWith(r9)     // Catch:{ IOException -> 0x040b }
            if (r0 == 0) goto L_0x03e8
            java.lang.String r1 = r1.A02     // Catch:{ IOException -> 0x040b }
        L_0x03fe:
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IOException -> 0x040b }
            java.lang.String r0 = r1.toLowerCase(r0)     // Catch:{ IOException -> 0x040b }
            r2.append(r0)     // Catch:{ IOException -> 0x040b }
            goto L_0x040f
        L_0x0408:
            java.lang.String r1 = ""
            goto L_0x03fe
        L_0x040b:
            r0 = move-exception
            com.whatsapp.util.Log.e(r6, r0)
        L_0x040f:
            java.lang.StringBuilder r2 = r13.A02
            java.lang.String r1 = r13.A01
            r2.append(r1)
            r2.append(r8)
            int r0 = r13.A00
            r2.append(r0)
            java.lang.String r0 = ".X-ABLabel:"
            r2.append(r0)
            java.lang.String r0 = r10.A03
            r2.append(r0)
            r2.append(r1)
            goto L_0x0343
        L_0x042d:
            X.013 r0 = r13.A04
            int r1 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.getTypeLabelResource(r1)
            android.content.Context r0 = r0.A00
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r1 = r0.getString(r1)
            java.lang.StringBuilder r7 = r13.A02
            r7.append(r8)
            int r2 = r13.A00
            r7.append(r2)
            java.lang.String r0 = ".ADR;type="
            r7.append(r0)
            r7.append(r1)
            java.lang.String r0 = ":;;"
            r7.append(r0)
            X.4bQ r1 = r10.A04
            java.lang.String r0 = r1.A01()
            r7.append(r0)
            java.lang.String r0 = r13.A01
            r7.append(r0)
            r7.append(r8)
            r7.append(r2)
            r7.append(r9)
            java.lang.String r8 = r1.A01
            if (r8 == 0) goto L_0x04a1
            X.1G1 r0 = r13.A03     // Catch:{ IOException -> 0x049d }
            r0.A05()     // Catch:{ IOException -> 0x049d }
            java.util.ArrayList r0 = r0.A02     // Catch:{ IOException -> 0x049d }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ IOException -> 0x049d }
        L_0x047a:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x049d }
            if (r0 == 0) goto L_0x049a
            java.lang.Object r1 = r2.next()     // Catch:{ IOException -> 0x049d }
            X.1aE r1 = (X.C29211aE) r1     // Catch:{ IOException -> 0x049d }
            java.lang.String r0 = r1.A03     // Catch:{ IOException -> 0x049d }
            boolean r0 = r0.startsWith(r8)     // Catch:{ IOException -> 0x049d }
            if (r0 == 0) goto L_0x047a
            java.lang.String r1 = r1.A02     // Catch:{ IOException -> 0x049d }
        L_0x0490:
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IOException -> 0x049d }
            java.lang.String r0 = r1.toLowerCase(r0)     // Catch:{ IOException -> 0x049d }
            r7.append(r0)     // Catch:{ IOException -> 0x049d }
            goto L_0x04a1
        L_0x049a:
            java.lang.String r1 = ""
            goto L_0x0490
        L_0x049d:
            r0 = move-exception
            com.whatsapp.util.Log.e(r6, r0)
        L_0x04a1:
            java.lang.StringBuilder r1 = r13.A02
            goto L_0x04c8
        L_0x04a4:
            X.013 r0 = r13.A04
            int r1 = android.provider.ContactsContract.CommonDataKinds.Email.getTypeLabelResource(r1)
            android.content.Context r0 = r0.A00
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r2 = r0.getString(r1)
            java.lang.StringBuilder r1 = r13.A02
            java.lang.String r0 = "EMAIL;TYPE="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ":"
            r1.append(r0)
            java.lang.String r0 = r10.A02
            r1.append(r0)
        L_0x04c8:
            java.lang.String r0 = r13.A01
            r1.append(r0)
            goto L_0x0343
        L_0x04cf:
            java.lang.String r0 = "appendWAPostalStr addr_data is NULL"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0343
        L_0x04d6:
            java.util.Map r0 = r14.A07
            if (r0 == 0) goto L_0x0501
            java.lang.String r2 = "BDAY"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x0501
            java.lang.StringBuilder r1 = r13.A02
            java.lang.String r0 = "BDAY;value=date:"
            r1.append(r0)
            java.util.Map r0 = r14.A07
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r3)
            X.4We r0 = (X.C87294We) r0
            java.lang.String r0 = r0.A02
            r1.append(r0)
            java.lang.String r0 = r13.A01
            r1.append(r0)
        L_0x0501:
            java.util.Map r0 = r14.A07
            if (r0 == 0) goto L_0x056a
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r8 = r0.iterator()
        L_0x050d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x056a
            java.lang.Object r1 = r8.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.HashMap r0 = X.C39701sv.A0C
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x050d
            java.util.Map r0 = r14.A07
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            r7 = 0
            java.lang.Object r6 = r0.get(r7)
            X.4We r6 = (X.C87294We) r6
            java.lang.StringBuilder r0 = r13.A02
            r0.append(r1)
            r0.append(r5)
            java.util.Set r3 = r6.A04
            java.lang.String r2 = ":"
            int r0 = r3.size()
            java.lang.StringBuilder r1 = r13.A02
            if (r0 <= 0) goto L_0x0563
            java.lang.String r0 = "type="
            r1.append(r0)
            java.lang.Object[] r0 = r3.toArray()
            r0 = r0[r7]
            r1.append(r0)
        L_0x0553:
            r1.append(r2)
            java.lang.StringBuilder r1 = r13.A02
            java.lang.String r0 = r6.A02
            r1.append(r0)
            java.lang.String r0 = r13.A01
            r1.append(r0)
            goto L_0x050d
        L_0x0563:
            java.lang.String r0 = "type=HOME"
            r1.append(r0)
            goto L_0x0553
        L_0x056a:
            byte[] r2 = r14.A09
            if (r2 == 0) goto L_0x0582
            java.lang.StringBuilder r1 = r13.A02
            java.lang.String r0 = "PHOTO;BASE64:"
            r1.append(r0)
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r2, r0)
            r1.append(r0)
            java.lang.String r0 = r13.A01
            r1.append(r0)
        L_0x0582:
            java.lang.String r0 = r4.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x05c6
            java.lang.String r3 = r14.A01
            if (r3 == 0) goto L_0x05ac
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x05ac
            java.lang.StringBuilder r2 = r13.A02
            java.lang.String r1 = "X-WA-BIZ-DESCRIPTION:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r13.A01
            r2.append(r0)
        L_0x05ac:
            java.lang.StringBuilder r2 = r13.A02
            java.lang.String r0 = "X-WA-BIZ-NAME:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r4.A08
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.append(r0)
            java.lang.String r0 = r13.A01
            r2.append(r0)
        L_0x05c6:
            java.lang.StringBuilder r1 = r13.A02
            java.lang.String r0 = "END:VCARD"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass25O.A00(X.1sv):java.lang.String");
    }
}
