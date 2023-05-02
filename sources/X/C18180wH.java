package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0wH  reason: invalid class name and case insensitive filesystem */
public class C18180wH {
    public Map A00;
    public Map A01;
    public final C17030uP A02;
    public final C16460t6 A03;
    public final C16490t9 A04;
    public final C25321Ji A05;
    public final C18290wS A06;
    public final C16320sq A07;
    public final Set A08;
    public final Set A09;

    public C18180wH(C17030uP r1, C16460t6 r2, C16490t9 r3, C25321Ji r4, C18290wS r5, C16320sq r6, Map map, Map map2, Set set, Set set2) {
        this.A07 = r6;
        this.A04 = r3;
        this.A00 = map;
        this.A06 = r5;
        this.A03 = r2;
        this.A08 = set;
        this.A02 = r1;
        this.A09 = set2;
        this.A01 = map2;
        this.A05 = r4;
    }

    public static int A00(C28331Vq r1) {
        if (r1 == null) {
            return 1;
        }
        if (r1.A01()) {
            return 3;
        }
        return !r1.A02() ? 1 : 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r1 = (java.lang.String) r2.get("flow_message_version");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C27161Qr A01(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r3 = "galaxy_message"
            boolean r0 = r3.equals(r5)
            if (r0 == 0) goto L_0x002c
            java.util.Map r2 = X.C438921y.A01(r6)
            java.lang.String r1 = "flow_message_version"
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0035
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0035
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = "2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0035
            java.lang.String r5 = "extensions_message_v2"
        L_0x002c:
            java.util.Map r0 = r4.A00
            java.lang.Object r0 = r0.get(r5)
            X.1Qr r0 = (X.C27161Qr) r0
            return r0
        L_0x0035:
            r5 = r3
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18180wH.A01(java.lang.String, java.lang.String):X.1Qr");
    }

    public void A02(Activity activity, C16740tZ r17, C35071lK r18) {
        Intent intent;
        String str;
        String str2;
        Intent intent2;
        int i2;
        Intent intent3;
        String str3;
        String optString;
        C35071lK r10 = r18;
        AnonymousClass00B.A06(r10);
        String str4 = r10.A00;
        String str5 = r10.A01;
        C27161Qr A012 = A01(str4, str5);
        if (A012 == null) {
            StringBuilder sb = new StringBuilder("NativeFlowActionUtils/handleRequest -- can not recognize NFM action: ");
            sb.append(str4);
            str2 = sb.toString();
        } else {
            Activity activity2 = activity;
            C16740tZ r2 = r17;
            if (this.A08.contains(str4)) {
                if (!(A012 instanceof C27151Qq)) {
                    str2 = "NativeFlowActionUtils/processCommerceNativeFlow. Base class for commerce action should be CommerceNativeFlowAction.";
                } else {
                    int A002 = C42141xI.A00(r2.A10, r2.A08, C30921dB.A04(r2));
                    String obj = UUID.randomUUID().toString();
                    C28381Vw r0 = r2.A11;
                    String str6 = r0.A01;
                    A03(A012, r0.A00, r10, str6, obj, str4, A002);
                    ((C27151Qq) A012).A05(activity2, r10, str6, obj, r2.A13);
                    return;
                }
            } else if (!this.A09.contains(str4)) {
                Bundle bundle = new Bundle();
                bundle.putString("nfm_action", str4);
                Class ADt = this.A06.A03().ADt(bundle);
                if (ADt == null) {
                    StringBuilder sb2 = new StringBuilder("NativeFlowActionUtils/handleRequest/processPaymentNativeFlow -- NFM action support class not found: ");
                    sb2.append(str4);
                    str2 = sb2.toString();
                } else {
                    int A003 = C42141xI.A00(r2.A10, r2.A08, C30921dB.A04(r2));
                    String obj2 = UUID.randomUUID().toString();
                    C28381Vw r02 = r2.A11;
                    String str7 = r02.A01;
                    C15830rv r9 = r02.A00;
                    A03(A012, r9, r10, str7, obj2, str4, A003);
                    if (!(A012 instanceof C27151Qq)) {
                        if (A012 instanceof C27201Qv) {
                            intent = new Intent(activity2, ADt);
                            AnonymousClass00B.A06(r10);
                            if (TextUtils.isEmpty(str5)) {
                                str5 = "{}";
                            }
                            str = new JSONObject(str5).optString("id");
                            if (TextUtils.isEmpty(str)) {
                                str2 = "[NFM]: WaViewTransactionAction - ConversationRow -- transaction-id is unavailable";
                            }
                        } else {
                            if (A012 instanceof C27181Qt) {
                                intent3 = new Intent(activity2, ADt);
                                AnonymousClass00B.A06(r10);
                                str3 = "screen_name";
                                optString = "brpay_p_pin_change_verify";
                            } else if (A012 instanceof C27191Qu) {
                                intent = new Intent(activity2, ADt);
                                AnonymousClass00B.A06(r10);
                                if (TextUtils.isEmpty(str5)) {
                                    str5 = "{}";
                                }
                                String optString2 = new JSONObject(str5).optString("url");
                                if (TextUtils.isEmpty(optString2)) {
                                    str2 = "[NFM]: ConversationRow -- NFM url is unavailable to redirect.";
                                } else {
                                    intent.putExtra("webview_url", optString2);
                                    intent.putExtra("webview_hide_url", true);
                                    intent.putExtra("webview_javascript_enabled", true);
                                    intent.putExtra("webview_avoid_external", true);
                                    activity2.startActivity(intent);
                                    return;
                                }
                            } else if (A012 instanceof C27171Qs) {
                                AnonymousClass00B.A06(r10);
                                if (TextUtils.isEmpty(str5)) {
                                    str5 = "{}";
                                }
                                JSONObject jSONObject = new JSONObject(str5);
                                intent3 = new Intent(activity2, ADt);
                                intent3.putExtra("survey_id", jSONObject.optString("survey_id"));
                                intent3.putExtra("entry_point", jSONObject.optString("entry_point"));
                                str3 = "session_id";
                                optString = jSONObject.optString(str3);
                            } else {
                                if (!(A012 instanceof C27241Qz)) {
                                    if (A012 instanceof AnonymousClass1R3) {
                                        intent2 = new Intent(activity2, ADt);
                                        intent2.putExtra("report_transaction_origin", "report_transaction_nfm");
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("message_id", str7);
                                        hashMap.put("action_name", str4);
                                        if (r9 != null) {
                                            hashMap.put("chat_id", r9.getRawString());
                                        }
                                        intent2.putExtra("screen_params", hashMap);
                                        intent2.putExtra("screen_name", "novipay_p_report_transaction");
                                        i2 = 901;
                                    } else if (A012 instanceof AnonymousClass1R5) {
                                        intent2 = new Intent(activity2, ADt);
                                        HashMap hashMap2 = new HashMap();
                                        hashMap2.put("login_entry_point", "novi_care_navigate_to_login");
                                        hashMap2.put("message_id", str7);
                                        hashMap2.put("action_name", str4);
                                        if (r9 != null) {
                                            hashMap2.put("chat_id", r9.getRawString());
                                        }
                                        intent2.putExtra("screen_params", hashMap2);
                                        intent2.putExtra("screen_name", "novipay_p_login_password");
                                        i2 = 900;
                                    } else if (A012 instanceof AnonymousClass1R6) {
                                        Intent intent4 = new Intent(activity2, ADt);
                                        HashMap hashMap3 = new HashMap();
                                        hashMap3.put("login_entry_point", "novi_care_navigate_to_hub");
                                        intent4.putExtra("screen_params", hashMap3);
                                        intent4.putExtra("screen_name", "novipay_p_login_password");
                                        activity2.startActivity(intent4);
                                    } else if (A012 instanceof AnonymousClass1R2) {
                                        intent = new Intent(activity2, ADt);
                                        AnonymousClass00B.A06(r10);
                                        if (TextUtils.isEmpty(str5)) {
                                            str5 = "{}";
                                        }
                                        String optString3 = new JSONObject(str5).optString("id");
                                        if (TextUtils.isEmpty(optString3)) {
                                            str2 = "[PAY]: ConversationRow -- NFM novi bank account or card id unavailable";
                                        } else {
                                            intent.putExtra("extra_bank_account_or_card_credential_id", optString3);
                                            activity2.startActivity(intent);
                                            return;
                                        }
                                    } else if (!(A012 instanceof AnonymousClass1RB) && (A012 instanceof AnonymousClass1S2)) {
                                        throw new UnsupportedOperationException();
                                    } else {
                                        return;
                                    }
                                    activity2.startActivityForResult(intent2, i2);
                                    return;
                                } else if (((C27241Qz) A012) instanceof AnonymousClass1R4) {
                                    HashMap hashMap4 = new HashMap();
                                    hashMap4.put("login_entry_point", "novi_care_navigate_to_payment");
                                    intent.putExtra("screen_params", hashMap4);
                                    HashMap hashMap5 = new HashMap();
                                    hashMap5.put("message_id", str7);
                                    hashMap5.put("action_name", str4);
                                    if (r9 != null) {
                                        hashMap5.put("chat_id", r9.getRawString());
                                    }
                                    intent.putExtra("finish_activity_result", hashMap5);
                                    intent.putExtra("screen_name", "novipay_p_login_password");
                                    if (TextUtils.isEmpty(str5)) {
                                        str5 = "{}";
                                    }
                                    String optString4 = new JSONObject(str5).optString("id");
                                    if (TextUtils.isEmpty(optString4)) {
                                        str2 = "[PAY]: ConversationRow -- NFM tpp transaction-id is unavailable";
                                    } else {
                                        intent.putExtra("extra_tpp_transaction_request_id", optString4);
                                        activity2.startActivityForResult(intent, 903);
                                    }
                                } else {
                                    intent = new Intent(activity2, ADt);
                                    AnonymousClass00B.A06(r10);
                                    if (TextUtils.isEmpty(str5)) {
                                        str5 = "{}";
                                    }
                                    str = new JSONObject(str5).optString("id");
                                    if (TextUtils.isEmpty(str)) {
                                        str2 = "[PAY]: ConversationRow -- NFM transaction-id is unavailable";
                                    }
                                }
                                activity2.overridePendingTransition(R.anim.layout_keyline, R.anim.alpha);
                                return;
                            }
                            intent3.putExtra(str3, optString);
                            activity2.startActivity(intent3);
                            return;
                        }
                        intent.putExtra("referral_screen", "chat");
                        intent.putExtra("extra_transaction_id", str);
                        activity2.startActivity(intent);
                        return;
                    }
                    return;
                }
            } else if (!(A012 instanceof AnonymousClass1S2)) {
                str2 = "NativeFlowActionUtils/processMenuOptionsNativeFlow. Base class for action should be MenuOptionsNativeFlowAction.";
            } else if (str5 != null) {
                JSONObject jSONObject2 = new JSONObject(str5);
                AnonymousClass00B.A06(jSONObject2);
                AnonymousClass1S1 r8 = (AnonymousClass1S1) ((AnonymousClass1S2) A012);
                C18450wi.A0H(r2, 1);
                C222617g r3 = r8.A02;
                C15830rv r1 = r2.A11.A00;
                C39041rp r4 = new C39041rp(r3.A05.A02(r1, true), r8.A00.A00());
                r3.A05(r4, r2);
                r4.A00 = new C35101lN(new C35091lM("menu_options", jSONObject2.toString()), jSONObject2.getString("title"));
                r8.A01.A0W(r4);
                return;
            } else {
                return;
            }
        }
        Log.e(str2);
    }

    public void A03(C27161Qr r11, C15830rv r12, C35071lK r13, String str, String str2, String str3, int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cta", str3);
            if (r11 instanceof AnonymousClass1R9) {
                jSONObject.put("flow_id", C438921y.A01(r13.A01).get("flow_id"));
                jSONObject.put("extensions_message_id", AnonymousClass22T.A00(str));
                jSONObject.put("session_id", str2);
            }
        } catch (JSONException e2) {
            StringBuilder sb = new StringBuilder("NativeFlowActionUtils/sendWamEvent/");
            sb.append(e2.getMessage());
            Log.w(sb.toString());
        }
        C25321Ji r2 = this.A05;
        String obj = jSONObject.toString();
        C15830rv r3 = r12;
        r2.A00(r3, r12 instanceof UserJid ? Integer.valueOf(A00(this.A02.A00((UserJid) r3))) : null, obj, 0, 4, i2, true);
    }
}
