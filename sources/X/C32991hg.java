package X;

/* renamed from: X.1hg  reason: invalid class name and case insensitive filesystem */
public abstract class C32991hg extends C33001hh {
    public static void A00(String str, String str2, String str3, AnonymousClass1UO r6) {
        StringBuilder sb = new StringBuilder("HMAC");
        sb.append(str);
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder("Mac.");
        sb2.append(obj);
        r6.A4W(sb2.toString(), str2);
        StringBuilder sb3 = new StringBuilder("Alg.Alias.Mac.HMAC-");
        sb3.append(str);
        r6.A4W(sb3.toString(), obj);
        StringBuilder sb4 = new StringBuilder("Alg.Alias.Mac.HMAC/");
        sb4.append(str);
        r6.A4W(sb4.toString(), obj);
        StringBuilder sb5 = new StringBuilder("KeyGenerator.");
        sb5.append(obj);
        r6.A4W(sb5.toString(), str3);
        StringBuilder sb6 = new StringBuilder("Alg.Alias.KeyGenerator.HMAC-");
        sb6.append(str);
        r6.A4W(sb6.toString(), obj);
        StringBuilder sb7 = new StringBuilder("Alg.Alias.KeyGenerator.HMAC/");
        sb7.append(str);
        r6.A4W(sb7.toString(), obj);
    }

    public static void A01(String str, C32041fY r3, AnonymousClass1UO r4) {
        StringBuilder sb = new StringBuilder("HMAC");
        sb.append(str);
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder("Alg.Alias.Mac.");
        sb2.append(r3);
        r4.A4W(sb2.toString(), obj);
        StringBuilder sb3 = new StringBuilder("Alg.Alias.KeyGenerator.");
        sb3.append(r3);
        r4.A4W(sb3.toString(), obj);
    }
}
