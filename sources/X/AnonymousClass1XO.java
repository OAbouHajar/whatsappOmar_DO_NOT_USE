package X;

import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1XO  reason: invalid class name */
public class AnonymousClass1XO {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final C37781pj[] A09;

    public AnonymousClass1XO(String str, String str2, String str3, String str4, String str5, String str6, C37781pj[] r7, boolean z2, boolean z3, boolean z4) {
        this.A09 = r7;
        this.A02 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A01 = str5;
        this.A04 = str4;
        this.A06 = z4;
        this.A00 = str6;
        this.A08 = z3;
        this.A07 = z2;
    }

    public static AnonymousClass1XO A00(byte[] bArr) {
        String str;
        Object opt;
        byte[] bArr2 = bArr;
        if (bArr != null) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr2, AnonymousClass01S.A08));
                ArrayList arrayList = new ArrayList();
                if (jSONObject.has("emojis") && (opt = jSONObject.opt("emojis")) != null) {
                    if (opt instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) opt;
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            String optString = jSONArray.optString(i2, (String) null);
                            if (optString != null) {
                                arrayList.add(C37941pz.A00(optString));
                            }
                        }
                    } else if (opt instanceof String) {
                        String str2 = (String) opt;
                        int length = str2.length();
                        if (length > 2) {
                            for (String str3 : str2.substring(1, length - 1).split(",")) {
                                if (str3 != null) {
                                    arrayList.add(C37941pz.A00(str3));
                                }
                            }
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("StickerMetadata/createFromWebpMetadata unrecognizable type of emoji metadata:");
                        sb.append(opt.getClass());
                        Log.w(sb.toString());
                    }
                }
                String optString2 = jSONObject.has("sticker-pack-id") ? jSONObject.optString("sticker-pack-id", (String) null) : null;
                C37781pj[] r15 = !arrayList.isEmpty() ? (C37781pj[]) arrayList.toArray(new C37781pj[0]) : null;
                String optString3 = jSONObject.optString("sticker-pack-name", (String) null);
                String optString4 = jSONObject.optString("sticker-pack-publisher", (String) null);
                String optString5 = jSONObject.optString("android-app-store-link", (String) null);
                String optString6 = jSONObject.optString("ios-app-store-link", (String) null);
                int optInt = jSONObject.optInt("is-first-party-sticker", 0);
                int optInt2 = jSONObject.optInt("is-from-sticker-maker", 0);
                int optInt3 = jSONObject.optInt("is-avatar-sticker", 0);
                String optString7 = jSONObject.optString("avatar-sticker-template-id", (String) null);
                boolean z2 = false;
                if (optInt == 1) {
                    z2 = true;
                }
                boolean z3 = false;
                if (optInt2 == 1) {
                    z3 = true;
                }
                boolean z4 = false;
                if (optInt3 == 1) {
                    z4 = true;
                }
                return new AnonymousClass1XO(optString2, optString3, optString4, optString5, optString6, optString7, r15, z2, z3, z4);
            } catch (JSONException unused) {
                str = "WebpUtils/extractWebpMetadata invalid metadata";
                Log.e(str);
                return null;
            } catch (UnsupportedEncodingException unused2) {
                str = "WebpUtils/extractWebpMetadata invalid metadata encoding";
                Log.e(str);
                return null;
            }
        }
        return null;
    }

    public byte[] A01() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sticker-pack-id", this.A02);
            jSONObject.put("sticker-pack-name", this.A03);
            jSONObject.put("sticker-pack-publisher", this.A05);
            String str = this.A04;
            if (str != null) {
                jSONObject.put("android-app-store-link", str);
            }
            String str2 = this.A01;
            if (str2 != null) {
                jSONObject.put("ios-app-store-link", str2);
            }
            C37781pj[] r5 = this.A09;
            if (r5 != null) {
                ArrayList arrayList = new ArrayList(r4);
                for (C37781pj obj : r5) {
                    arrayList.add(obj.toString());
                }
                jSONObject.put("emojis", new JSONArray(arrayList));
            }
            if (this.A07) {
                jSONObject.put("is-first-party-sticker", 1);
            }
            if (this.A08) {
                jSONObject.put("is-from-sticker-maker", 1);
            }
            if (this.A06) {
                jSONObject.put("is-avatar-sticker", 1);
            }
            String str3 = this.A00;
            if (str3 != null) {
                jSONObject.put("avatar-sticker-template-id", str3);
            }
            return jSONObject.toString().getBytes();
        } catch (JSONException e2) {
            Log.e("StickerMetadata/convertToBytes error during JSON conversion", e2);
            return null;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("StickerMetadata{");
        stringBuffer.append("emojis=");
        C37781pj[] r0 = this.A09;
        stringBuffer.append(r0 == null ? "null" : Arrays.asList(r0).toString());
        stringBuffer.append(", isFirstPartySticker=");
        stringBuffer.append(this.A07);
        stringBuffer.append(", isFromStickerMaker=");
        stringBuffer.append(this.A08);
        stringBuffer.append(", isAvatarSticker=");
        stringBuffer.append(this.A06);
        stringBuffer.append(", avatarStickerTemplateId=");
        stringBuffer.append(this.A00);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
