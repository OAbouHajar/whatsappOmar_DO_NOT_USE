package X;

import android.util.Pair;
import com.AssemMods.translator.Language;
import com.obwhatsapp.Me;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.0wF  reason: invalid class name and case insensitive filesystem */
public class C18160wF {
    public static final AnonymousClass00N A06;
    public static final Charset A07 = AnonymousClass01S.A0A;
    public static final Pattern A08 = Pattern.compile("\t");
    public C29201aD A00 = new C29201aD(0);
    public String A01 = "";
    public final AnonymousClass1G1 A02;
    public final C16040sK A03;
    public final C16980tz A04;
    public final Object A05 = new Object();

    static {
        AnonymousClass00N r2 = new AnonymousClass00N(59);
        A06 = r2;
        r2.put("af", Arrays.asList(new String[]{"ZA", "NA"}));
        r2.put(Language.ARABIC, Arrays.asList(new String[]{"EG", "SA", "SY", "IQ"}));
        r2.put("sq", Arrays.asList(new String[]{"AL", "XK", "GR", "MK", "IT"}));
        r2.put("az", Collections.singletonList("AZ"));
        r2.put(Language.BENGALI, Arrays.asList(new String[]{"IN", "BD"}));
        r2.put("bg", Collections.singletonList("BG"));
        r2.put("ca", Arrays.asList(new String[]{"ES", "AD"}));
        r2.put("zh-Hans", Arrays.asList(new String[]{"MY", "SG", "CN", "HK"}));
        r2.put("zh-Hant", Arrays.asList(new String[]{"HK", "TW", "MY", "MO"}));
        r2.put("hr", Arrays.asList(new String[]{"HR", "BA"}));
        r2.put("cs", Collections.singletonList("CZ"));
        r2.put("da", Collections.singletonList("DK"));
        r2.put("nl", Arrays.asList(new String[]{"NL", "BE", "SR"}));
        r2.put(Language.ENGLISH, Arrays.asList(new String[]{"IN", "PK", "ZA", "GB", "US"}));
        r2.put("et", Collections.singletonList("EE"));
        r2.put("fil", Collections.singletonList("PH"));
        r2.put("fi", Collections.singletonList("FI"));
        r2.put(Language.FRENCH, Collections.singletonList("FR"));
        r2.put(Language.GERMAN, Arrays.asList(new String[]{"DE", "AT", "CH"}));
        r2.put("el", Arrays.asList(new String[]{"GR", "CY"}));
        r2.put(Language.GUJARATI, Collections.singletonList("IN"));
        r2.put("he", Collections.singletonList("IL"));
        r2.put(Language.HINDI, Collections.singletonList("IN"));
        r2.put("hu", Arrays.asList(new String[]{"HU", "RO"}));
        r2.put("id", Collections.singletonList("ID"));
        r2.put("ga", Arrays.asList(new String[]{"IE", "GB"}));
        r2.put(Language.ITALIAN, Arrays.asList(new String[]{"IT", "CH"}));
        r2.put(Language.JAPANESE, Collections.singletonList("JP"));
        r2.put(Language.KANNADA, Collections.singletonList("IN"));
        r2.put("kk", Arrays.asList(new String[]{"KZ", "UZ", "MN"}));
        r2.put("ko", Collections.singletonList("KR"));
        r2.put("lo", Collections.singletonList("LA"));
        r2.put("lv", Collections.singletonList("LV"));
        r2.put("lt", Collections.singletonList("LT"));
        r2.put("mk", Collections.singletonList("MK"));
        r2.put("ms", Collections.singletonList("MY"));
        r2.put(Language.MALAYALAM, Collections.singletonList("IN"));
        r2.put(Language.MARATHI, Collections.singletonList("IN"));
        r2.put("nb", Collections.singletonList("NO"));
        r2.put("fa", Arrays.asList(new String[]{"IR", "AF"}));
        r2.put("pl", Collections.singletonList("PL"));
        r2.put("pt-BR", Collections.singletonList("BR"));
        r2.put("pt-PT", Arrays.asList(new String[]{"PT", "AO", "BR", "MZ"}));
        r2.put(Language.PUNJABI, Collections.singletonList("IN"));
        r2.put("ro", Arrays.asList(new String[]{"RO", "MD"}));
        r2.put(Language.RUSSIAN, Arrays.asList(new String[]{"RU", "KZ", "KG", "UA"}));
        r2.put("sr", Arrays.asList(new String[]{"RS", "BA", "ME"}));
        r2.put("sk", Collections.singletonList("SK"));
        r2.put("sl", Collections.singletonList("SI"));
        r2.put(Language.SPANISH, Arrays.asList(new String[]{"MX", "AR", "CL", "CO", "ES", "PE"}));
        r2.put("sw", Arrays.asList(new String[]{"TZ", "KE", "RW", "BI"}));
        r2.put("sv", Arrays.asList(new String[]{"SE", "FI"}));
        r2.put(Language.TAMIL, Arrays.asList(new String[]{"IN", "LK", "MY", "SG"}));
        r2.put(Language.TELUGU, Collections.singletonList("IN"));
        r2.put("th", Arrays.asList(new String[]{"TH", "LA"}));
        r2.put(Language.TURKISH, Collections.singletonList("TR"));
        r2.put("uk", Collections.singletonList("UA"));
        r2.put(Language.URDU, Arrays.asList(new String[]{"PK", "IN"}));
        r2.put("uz", Arrays.asList(new String[]{"UZ", "RU", "KZ", "KG"}));
        r2.put(Language.VIETNAMESE, Collections.singletonList("VN"));
    }

    public C18160wF(AnonymousClass1G1 r3, C16040sK r4, C16980tz r5) {
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
    }

    public static String A00(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = (String) C29221aF.A01.get(parseInt);
            return "ZZ".equals(str2) ? (String) C29221aF.A00.get(parseInt) : str2;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String A01(String str, String str2) {
        Pattern pattern;
        try {
            int parseInt = Integer.parseInt(str);
            String str3 = (String) C29221aF.A01.get(parseInt);
            if (str3 != null) {
                if (!str3.equals("ZZ")) {
                    return str3;
                }
                List list = (List) C29221aF.A02.get(parseInt);
                for (int i2 = 0; i2 < list.size(); i2++) {
                    Pair pair = (Pair) list.get(i2);
                    Object obj = pair.second;
                    if (obj instanceof String) {
                        pattern = Pattern.compile((String) obj);
                        list.set(i2, Pair.create(pair.first, pattern));
                    } else {
                        pattern = (Pattern) obj;
                    }
                    if (pattern.matcher(str2).matches()) {
                        return (String) pair.first;
                    }
                }
            }
            return "ZZ";
        } catch (NumberFormatException unused) {
            return "ZZ";
        }
    }

    public String A02(AnonymousClass013 r7, String str) {
        String str2;
        synchronized (this.A05) {
            String A042 = AnonymousClass1WH.A04(AnonymousClass013.A00(r7.A00));
            if (!A042.equals(this.A01)) {
                List<C29231aG> A032 = A03(A042);
                if (A032.isEmpty()) {
                    A032 = A03(Language.ENGLISH);
                }
                this.A00 = new C29201aD(A032.size());
                for (C29231aG r0 : A032) {
                    this.A00.A03(r0.A00, r0.A01);
                }
                this.A01 = A042;
            }
            str2 = (String) this.A00.A01(str);
        }
        return str2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:15|18|19|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0066 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A03(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "country_names_"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r9)
            java.lang.String r0 = ".tsv"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r3 = 0
            X.0tz r0 = r8.A04     // Catch:{ IOException -> 0x0067 }
            android.content.Context r0 = r0.A00     // Catch:{ IOException -> 0x0067 }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ IOException -> 0x0067 }
            java.io.InputStream r2 = r0.open(r1)     // Catch:{ IOException -> 0x0067 }
            java.nio.charset.Charset r1 = A07     // Catch:{ IOException -> 0x0067 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0067 }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x0067 }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0067 }
            r7.<init>(r0)     // Catch:{ IOException -> 0x0067 }
            r0 = 243(0xf3, float:3.4E-43)
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0061 }
            r6.<init>(r0)     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = r7.readLine()     // Catch:{ all -> 0x005f }
        L_0x0037:
            if (r1 == 0) goto L_0x005b
            java.util.regex.Pattern r0 = A08     // Catch:{ all -> 0x005f }
            java.lang.String[] r5 = r0.split(r1)     // Catch:{ all -> 0x005f }
            int r4 = r5.length     // Catch:{ all -> 0x005f }
            r3 = 1
            r2 = 0
            r1 = 2
            r0 = 0
            if (r4 != r1) goto L_0x0047
            r0 = 1
        L_0x0047:
            X.AnonymousClass00B.A0G(r0)     // Catch:{ all -> 0x005f }
            r2 = r5[r2]     // Catch:{ all -> 0x005f }
            r1 = r5[r3]     // Catch:{ all -> 0x005f }
            X.1aG r0 = new X.1aG     // Catch:{ all -> 0x005f }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x005f }
            r6.add(r0)     // Catch:{ all -> 0x005f }
            java.lang.String r1 = r7.readLine()     // Catch:{ all -> 0x005f }
            goto L_0x0037
        L_0x005b:
            r7.close()     // Catch:{ IOException -> 0x006a }
            goto L_0x007c
        L_0x005f:
            r0 = move-exception
            goto L_0x0063
        L_0x0061:
            r0 = move-exception
            r6 = r3
        L_0x0063:
            r7.close()     // Catch:{ all -> 0x0066 }
        L_0x0066:
            throw r0     // Catch:{ IOException -> 0x006a }
        L_0x0067:
            r2 = move-exception
            r6 = r3
            goto L_0x006b
        L_0x006a:
            r2 = move-exception
        L_0x006b:
            java.lang.String r1 = "countryutils/getcountrylist error:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x007c:
            if (r6 != 0) goto L_0x0082
            java.util.List r6 = java.util.Collections.emptyList()
        L_0x0082:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18160wF.A03(java.lang.String):java.util.List");
    }

    public boolean A04() {
        C16040sK r0 = this.A03;
        r0.A0B();
        Me me = r0.A00;
        if (me == null) {
            return false;
        }
        try {
            return "eu".equals(this.A02.A03(me.cc));
        } catch (IOException e2) {
            StringBuilder sb = new StringBuilder("countryutils/is-eu failed for ");
            sb.append(me.cc);
            Log.e(sb.toString(), e2);
            return false;
        }
    }

    public boolean A05(String str) {
        C16040sK r0 = this.A03;
        r0.A0B();
        Me me = r0.A00;
        if (me == null) {
            return false;
        }
        return str.equals(A01(me.cc, me.number));
    }
}
