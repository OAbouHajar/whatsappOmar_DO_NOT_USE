package X;

import android.os.Build;
import com.facebook.msys.mci.DefaultCrypto;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: X.01S  reason: invalid class name */
public class AnonymousClass01S {
    public static final long A00 = Runtime.getRuntime().maxMemory();
    public static final AnonymousClass00F A01 = new AnonymousClass00F(10, SearchActionVerificationClientService.NOTIFICATION_ID, 100000);
    public static final AnonymousClass00F A02 = new AnonymousClass00F(10, 1000, SearchActionVerificationClientService.NOTIFICATION_ID);
    public static final AnonymousClass00F A03 = new AnonymousClass00F(10, 100, 1000);
    public static final String A04;
    public static final String A05;
    public static final String A06 = Character.toString(160);
    public static final String A07;
    public static final String A08;
    public static final String A09;
    public static final Charset A0A;
    public static final byte[] A0B = {6, 0};
    public static final byte[] A0C = {6, 1};
    public static final byte[] A0D = {6, 2};
    public static final int[] A0E = {7776000, 604800, 86400, 0};
    public static final int[] A0F = {86400, 604800, 7776000, 0};
    public static final Long[] A0G = new Long[0];
    public static final String[] A0H = new String[0];

    static {
        StringBuilder sb = new StringBuilder("com.obwhatsapp");
        sb.append(".fileprovider");
        A05 = sb.toString();
        StringBuilder sb2 = new StringBuilder("android.resource://");
        sb2.append("com.obwhatsapp");
        sb2.append("/");
        A04 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("com.obwhatsapp");
        sb3.append("_preferences");
        A07 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("com.obwhatsapp");
        sb4.append(".permission.BROADCAST");
        A09 = sb4.toString();
        Charset forName = Build.VERSION.SDK_INT >= 19 ? StandardCharsets.UTF_8 : Charset.forName(DefaultCrypto.UTF_8);
        A0A = forName;
        A08 = forName.name();
    }
}
