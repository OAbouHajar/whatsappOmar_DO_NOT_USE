package X;

import android.text.TextUtils;
import android.util.Base64;
import com.mod2.fblibs.Facebook;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.14O  reason: invalid class name */
public abstract class AnonymousClass14O {
    public Object A00;

    public void A00(JSONObject jSONObject, long j2) {
        JSONObject jSONObject2 = jSONObject;
        if (this instanceof AnonymousClass1AU) {
            C18450wi.A0H(jSONObject2, 0);
            JSONObject jSONObject3 = jSONObject2.getJSONObject("whatsapp_crossposting_eligibility");
            JSONArray jSONArray = jSONObject3.getJSONArray("whatsapp_status_unique_fbids");
            JSONObject jSONObject4 = jSONObject3.getJSONObject("purpose_public_keys");
            JSONArray jSONArray2 = jSONObject3.getJSONArray("whatsapp_status_has_crossposted_state");
            if (jSONArray2.length() == 1) {
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    arrayList.add(jSONArray.getString(i2));
                }
                JSONArray jSONArray3 = jSONArray2.getJSONObject(0).getJSONArray("waffle_hcbc");
                ArrayList arrayList2 = new ArrayList();
                int length2 = jSONArray3.length();
                for (int i3 = 0; i3 < length2; i3++) {
                    arrayList2.add(Boolean.valueOf(jSONArray3.getBoolean(i3)));
                }
                byte[] decode = Base64.decode(jSONObject4.getString("purpose_public_ek"), 8);
                byte[] decode2 = Base64.decode(jSONObject4.getString("purpose_public_ik"), 8);
                String string = jSONObject4.getString("purpose_public_ik_sig");
                String string2 = jSONObject4.getString("purpose_public_ik_enc_certificate");
                byte[] decode3 = Base64.decode(jSONObject4.getString("purpose_dummy_ciphertext"), 8);
                byte[] decode4 = Base64.decode(jSONObject4.getString("purpose_dummy_nonce"), 8);
                C18450wi.A0B(decode);
                C18450wi.A0B(decode2);
                C18450wi.A0B(string);
                C18450wi.A0B(string2);
                C18450wi.A0B(decode3);
                C18450wi.A0B(decode4);
                this.A00 = new AnonymousClass4WB(new C87274Wc(string, string2, decode, decode2, decode3, decode4), arrayList, arrayList2);
                return;
            }
            throw new JSONException("Error: unexpected crossposted state length");
        } else if (this instanceof C22991Ab) {
            C18450wi.A0H(jSONObject2, 0);
            JSONArray jSONArray4 = jSONObject2.getJSONObject("xfb_whatsapp_crossposting").getJSONArray("status_crosspost_results");
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            int length3 = jSONArray4.length();
            int i4 = 0;
            while (i4 < length3) {
                int i5 = i4 + 1;
                JSONObject jSONObject5 = jSONArray4.getJSONObject(i4);
                long j3 = jSONObject5.getLong("wa_status_id");
                int i6 = jSONObject5.getInt("response_code");
                if (i6 != 0) {
                    if (i6 == 2) {
                        arrayList5.add(Long.valueOf(j3));
                    } else if (i6 != 3) {
                        arrayList4.add(Long.valueOf(j3));
                    }
                    i4 = i5;
                }
                arrayList3.add(Long.valueOf(j3));
                i4 = i5;
            }
            this.A00 = new AnonymousClass4WA(arrayList3, arrayList4, arrayList5);
        } else if (this instanceof C50342Zc) {
            C18450wi.A0H(jSONObject2, 0);
            String string3 = jSONObject2.getJSONObject("xfb_whatsapp_xfamily_access_token_exchange").getString(Facebook.TOKEN);
            if (string3 == null || string3.length() == 0) {
                throw new JSONException("NativeAuthTokenExchangeDataProcessor/missing return access token");
            }
            this.A00 = new AnonymousClass4VU(new C35301lh(new C53852gP(), String.class, string3, "XFamilyFbAccessTokenForCrossposting"));
        } else if (this instanceof AnonymousClass1KH) {
            C18450wi.A0H(jSONObject2, 0);
            this.A00 = jSONObject2.getJSONObject("xwa_product_catalog_get_product_list_by_retailer_id").getString("product_list");
        } else if (this instanceof AnonymousClass1I5) {
            AnonymousClass1I5 r0 = (AnonymousClass1I5) this;
            r0.A00 = jSONObject2.getJSONObject(r0 instanceof AnonymousClass1I7 ? "whatsapp_support_process_ban_appeal_request" : "whatsapp_support_ban_appeal_status");
        } else if (this instanceof AnonymousClass1JT) {
            JSONObject jSONObject6 = jSONObject2.getJSONObject("whatsapp_commerce_message_type_getmetadata");
            this.A00 = new C93644jX(jSONObject6.getString("title"), jSONObject6.getString("subtitle"), jSONObject6.getString("stitched_image_url"), jSONObject6.getString("stitched_image_bytes"));
        } else if (this instanceof AnonymousClass14N) {
            if (jSONObject != null && jSONObject2.has("fetch__WAAvatar")) {
                JSONObject jSONObject7 = jSONObject2.getJSONObject("fetch__WAAvatar");
                if (jSONObject7.has("id") && jSONObject7.has("wa_stickers")) {
                    String string4 = jSONObject7.getString("id");
                    JSONObject jSONObject8 = jSONObject7.getJSONObject("wa_stickers");
                    List<String> A0R = AnonymousClass1JA.A0R("sticker_pack_id", "sticker_pack_description", "sticker_pack_publisher", "sticker_pack_name", "default_templates_info", "stickers");
                    if (!(A0R instanceof Collection) || !A0R.isEmpty()) {
                        for (String has : A0R) {
                            if (!jSONObject8.has(has)) {
                                return;
                            }
                        }
                    }
                    String string5 = jSONObject8.getString("sticker_pack_id");
                    String string6 = jSONObject8.getString("sticker_pack_description");
                    String string7 = jSONObject8.getString("sticker_pack_publisher");
                    String string8 = jSONObject8.getString("sticker_pack_name");
                    JSONObject jSONObject9 = jSONObject8.getJSONObject("default_templates_info");
                    String string9 = jSONObject9.getString("sticker_pack_tray_icon_template_id");
                    String string10 = jSONObject9.getString("recents_empty_state_template_id");
                    String string11 = jSONObject9.getString("favorites_empty_state_template_id");
                    JSONArray jSONArray5 = jSONObject8.getJSONArray("stickers");
                    ArrayList arrayList6 = new ArrayList();
                    int length4 = jSONArray5.length();
                    int i7 = 0;
                    while (i7 < length4) {
                        int i8 = i7 + 1;
                        JSONObject jSONObject10 = jSONArray5.getJSONObject(i7);
                        JSONArray jSONArray6 = jSONObject10.getJSONArray("emojis");
                        ArrayList arrayList7 = new ArrayList();
                        int length5 = jSONArray6.length();
                        int i9 = 0;
                        while (i9 < length5) {
                            int i10 = i9 + 1;
                            String string12 = jSONArray6.getString(i9);
                            C18450wi.A0B(string12);
                            arrayList7.add(string12);
                            i9 = i10;
                        }
                        String string13 = jSONObject10.getString("url");
                        C18450wi.A0B(string13);
                        String join = TextUtils.join(" ", arrayList7);
                        C18450wi.A0B(join);
                        int i11 = jSONObject10.getInt("file_size");
                        String string14 = jSONObject10.getString("mimetype");
                        C18450wi.A0B(string14);
                        int i12 = jSONObject10.getInt("height");
                        int i13 = jSONObject10.getInt("width");
                        String string15 = jSONObject10.getString("file_hash");
                        C18450wi.A0B(string15);
                        String string16 = jSONObject10.getString("template_id");
                        C18450wi.A0B(string16);
                        arrayList6.add(new C93434jB(string13, join, string14, string15, string16, i11, i12, i13));
                        i7 = i8;
                    }
                    C18450wi.A0B(string4);
                    C18450wi.A0B(string5);
                    C18450wi.A0B(string6);
                    C18450wi.A0B(string8);
                    C18450wi.A0B(string7);
                    C18450wi.A0B(string9);
                    C18450wi.A0B(string10);
                    C18450wi.A0B(string11);
                    this.A00 = new C93444jC(string4, string5, string6, string8, string7, string9, string10, string11, new ArrayList(arrayList6));
                }
            }
        } else if (this instanceof AnonymousClass32M) {
            if (jSONObject != null && jSONObject2.has("fetch__WAAvatar")) {
                JSONObject jSONObject11 = jSONObject2.getJSONObject("fetch__WAAvatar");
                if (jSONObject11.has("wa_stickers")) {
                    JSONObject jSONObject12 = jSONObject11.getJSONObject("wa_stickers");
                    if (jSONObject12.has("stickers")) {
                        JSONArray jSONArray7 = jSONObject12.getJSONArray("stickers");
                        if (jSONArray7.length() != 0) {
                            ArrayList arrayList8 = new ArrayList();
                            int i14 = 0;
                            int length6 = jSONArray7.length();
                            while (i14 < length6) {
                                int i15 = i14 + 1;
                                JSONObject jSONObject13 = jSONArray7.getJSONObject(i14);
                                String string17 = jSONObject13.getString("url");
                                C18450wi.A0B(string17);
                                JSONArray jSONArray8 = jSONObject13.getJSONArray("emojis");
                                ArrayList arrayList9 = new ArrayList();
                                int length7 = jSONArray8.length();
                                int i16 = 0;
                                while (i16 < length7) {
                                    int i17 = i16 + 1;
                                    String string18 = jSONArray8.getString(i16);
                                    C18450wi.A0B(string18);
                                    arrayList9.add(string18);
                                    i16 = i17;
                                }
                                String join2 = TextUtils.join(" ", arrayList9);
                                C18450wi.A0B(join2);
                                arrayList8.add(new C93394j7(string17, join2));
                                i14 = i15;
                            }
                            this.A00 = new C93384j6(arrayList8);
                        }
                    }
                }
            }
        } else if (this instanceof C27491Ry) {
            this.A00 = new C93374j5(jSONObject == null ? false : !jSONObject2.isNull("avatar_static_config"));
        } else if (this instanceof AnonymousClass1TH) {
            AnonymousClass1TH r02 = (AnonymousClass1TH) this;
            r02.A00 = r02.A00.A6j(jSONObject2, j2);
        } else if (this instanceof C26271Nb) {
            C26271Nb r03 = (C26271Nb) this;
            JSONObject jSONObject14 = jSONObject2.getJSONObject("xwa_linked_business_account_posts");
            JSONObject optJSONObject = jSONObject14.optJSONObject("linked_ig_professional");
            JSONObject optJSONObject2 = jSONObject14.optJSONObject("linked_fb_page");
            AnonymousClass4VS r3 = null;
            AnonymousClass4VS A01 = optJSONObject != null ? r03.A01(optJSONObject) : null;
            if (optJSONObject2 != null) {
                r3 = r03.A01(optJSONObject2);
            }
            r03.A00 = new AnonymousClass4VX(r3, A01);
        } else {
            C18450wi.A0H(jSONObject2, 0);
            JSONArray jSONArray9 = jSONObject2.getJSONObject("xwa_extensions_get_flow_data").getJSONArray("extensions_flow_data");
            ArrayList arrayList10 = new ArrayList();
            int length8 = jSONArray9.length();
            for (int i18 = 0; i18 < length8; i18++) {
                arrayList10.add(jSONArray9.get(i18).toString());
            }
            this.A00 = C003101j.A0A(arrayList10);
        }
    }
}
