package X;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: X.5x5  reason: invalid class name */
public class AnonymousClass5x5 {
    public static final Pattern A02 = Pattern.compile("(?:\\b|$|^|_)(?:(?:[a-zA-Z\\d.-]+)@(?i:icici|hdfcbank|sbi|axisbank|axis|okhdfcbank|okicici|okaxis|oksbi|wasbi|waicici|apl|abfspay|fbl|axisb|indusind|yesbank|hdfcbankjd|kmbl|myicici|ikwik|ybl|ibl|rmhdfcbank|pingpay|barodapay|idfcbank|waaxis|wahdfcbank|airtel|airtelpaymentsbank|apb|allbank|albk|allahabadbank|andb|axisgo|lime|barodampay|boi|mahb|cnrb|csbpay|csbcash|centralbank|cbin|cboi|cub|dbs|dcb|dcbbank|denabank|purz|federal|finobank|payzapp|rajgovhdfcbank|hsbc|imobile|pockets|ezeepay|eazypay|idbi|idbibank|idfc|idfcnetc|cmsidfc|indianbank|indbank|indianbk|iob|indus|jkb|jsbp|jio|kbl|karb|kbl052|kvb|karurvysyabank|kvbank|kotak|kaypay|kmb|obc|paytm|psb|pnb|sib|srcb|sc|scmobile|scb|scbl|syndicate|syndbank|synd|lvb|lvbank|rbl|tjsb|uco|unionbankofindia|unionbank|uboi|ubi|united|upi|utbi|vjb|vijb|vijayabank|yesbankltd|bandhan|dlb|aubank|corp|dnsbank|okbizaxis|axl))(?![.])(?:\\b|$|^|_)");
    public static final Pattern A03 = Pattern.compile("(?i)(upi://pay)[/?#](?:(?:[a-zA-Z0-9[ -퟿豈-﷏ﷰ-￯𐀀-🿽𠀀-𯿽𰀀-𿿽񀀀-񏿽񐀀-񟿽񠀀-񯿽񰀀-񿿽򀀀-򏿽򐀀-򟿽򠀀-򯿽򰀀-򿿽󀀀-󏿽󐀀-󟿽󡀀-󯿽&&[^ [ - ]   　]];/?:@&=#~$|\\[\\]\\-.+!*'(),_])|(?:%[a-fA-F0-9]{2}))*[^.\\s]");
    public static final Pattern A04 = Pattern.compile("[a-zA-Z\\d.-]+@[a-zA-Z\\d.-]+");
    public final C227819g A00;
    public final C117675tN A01;

    public AnonymousClass5x5(C227819g r1, C117675tN r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static boolean A00(String str) {
        return !TextUtils.isEmpty(str) && str.length() <= 255 && !str.equalsIgnoreCase("facebook2@icici") && A04.matcher(str).matches();
    }
}
