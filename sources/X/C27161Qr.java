package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.redex.RunnableRunnableShape0S2200000_I0;
import com.obwhatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Qr  reason: invalid class name and case insensitive filesystem */
public abstract class C27161Qr {
    public String A00() {
        if (this instanceof C27201Qv) {
            return "wa_payment_transaction_details";
        }
        if (this instanceof C27181Qt) {
            return "wa_payment_fbpin_reset";
        }
        if (this instanceof C27191Qu) {
            return "wa_payment_learn_more";
        }
        if (this instanceof C27171Qs) {
            return "payments_care_csat";
        }
        if (!(this instanceof C27241Qz)) {
            return this instanceof AnonymousClass1R3 ? "novi_report_transaction" : this instanceof AnonymousClass1R5 ? "novi_login" : this instanceof AnonymousClass1R6 ? "novi_hub" : this instanceof AnonymousClass1R2 ? ((AnonymousClass1R2) this) instanceof AnonymousClass1R1 ? "novi_view_card_detail" : "novi_view_bank_detail" : this instanceof AnonymousClass1RB ? "mpm" : this instanceof AnonymousClass1S2 ? "menu_options" : this instanceof AnonymousClass1R7 ? ((AnonymousClass1R7) this).A00 : this instanceof C27141Qp ? "send_location" : this instanceof AnonymousClass1R9 ? "galaxy_message" : "address_message";
        }
        C27241Qz r1 = (C27241Qz) this;
        return r1 instanceof AnonymousClass1R0 ? "novi_view_transaction" : r1 instanceof AnonymousClass1R4 ? "novi_tpp_complete_transaction" : "novi_view_code";
    }

    public String A01(Context context, C35071lK r5) {
        Object obj;
        int i2;
        if (this instanceof C27201Qv) {
            i2 = R.string.str0dbb;
        } else if (this instanceof C27181Qt) {
            i2 = R.string.str0db3;
        } else if (this instanceof C27191Qu) {
            i2 = R.string.str0db2;
        } else if (this instanceof C27171Qs) {
            i2 = R.string.str0db1;
        } else if (this instanceof C27241Qz) {
            C27241Qz r1 = (C27241Qz) this;
            i2 = r1 instanceof AnonymousClass1R0 ? R.string.str0dbd : r1 instanceof AnonymousClass1R4 ? R.string.str0db9 : R.string.str0dbe;
        } else if (this instanceof AnonymousClass1R3) {
            i2 = R.string.str0dbc;
        } else if (this instanceof AnonymousClass1R5) {
            i2 = R.string.str0dba;
        } else if (this instanceof AnonymousClass1R6) {
            i2 = R.string.str0db5;
        } else if (this instanceof AnonymousClass1R2) {
            i2 = ((AnonymousClass1R2) this) instanceof AnonymousClass1R1 ? R.string.str0db8 : R.string.str0db7;
        } else if (this instanceof AnonymousClass1RB) {
            return "View items";
        } else {
            if (this instanceof AnonymousClass1S2) {
                String str = r5.A01;
                if (str == null || (obj = new JSONObject(str).opt("title")) == null) {
                    return null;
                }
            } else if (this instanceof AnonymousClass1R7) {
                return null;
            } else {
                if (this instanceof C27141Qp) {
                    i2 = R.string.str0db4;
                } else if (this instanceof AnonymousClass1R9) {
                    Map A01 = C438921y.A01(r5.A01);
                    if (!A01.containsKey("flow_cta")) {
                        return "";
                    }
                    obj = A01.get("flow_cta");
                    AnonymousClass00B.A06(obj);
                } else {
                    i2 = R.string.str0db6;
                }
            }
            return obj.toString();
        }
        return context.getString(i2);
    }

    public void A02(Intent intent, C16460t6 r17, C25321Ji r18, C16320sq r19, int i2) {
        String str;
        String str2;
        if (intent != null && intent.getExtras() != null) {
            Bundle extras = intent.getExtras();
            String str3 = null;
            if (extras.getSerializable("screen_params") instanceof Map) {
                Map map = (Map) extras.getSerializable("screen_params");
                if (map != null) {
                    str = (String) map.get("message_id");
                    str2 = (String) map.get("chat_id");
                    str3 = (String) map.get("action_name");
                }
                str = null;
                str2 = null;
            } else {
                Log.e("missing screen_params in result intent");
                str = null;
                str2 = null;
            }
            int i3 = i2;
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sb = new StringBuilder("{  \"cta\":\"");
                sb.append(str3);
                sb.append("\"}");
                String obj = sb.toString();
                int i4 = 2;
                if (i3 != -1) {
                    i4 = 1;
                }
                r18.A00((Jid) null, (Integer) null, obj, i4, 4, 1, true);
                if (i3 != -1) {
                    return;
                }
            } else if (i3 != -1) {
                return;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                r19.Acl(new RunnableRunnableShape0S2200000_I0(this, r17, str, str2, 0));
            }
        }
    }

    public boolean A03(C14710pd r6, C33211iD r7) {
        int i2;
        String str;
        if (this instanceof AnonymousClass1R6) {
            i2 = 509;
        } else if (this instanceof C27141Qp) {
            return !r6.A0E(C16620tM.A02, 2386);
        } else {
            if (this instanceof AnonymousClass1R9) {
                C16620tM r3 = C16620tM.A02;
                if (!r6.A0E(r3, 1694)) {
                    Map A01 = C438921y.A01(((AnonymousClass222) C439021z.A00(r7).A0d().A02.get(0)).A01);
                    if (!(!A01.containsKey("flow_message_version") || (str = (String) A01.get("flow_message_version")) == null || str.length() == 0)) {
                        AnonymousClass223 A00 = AnonymousClass223.A00("2.23.1.76");
                        String A06 = r6.A06(r3, 2306);
                        AnonymousClass223 r32 = null;
                        if (A06 != null) {
                            try {
                                JSONObject optJSONObject = new JSONObject(A06).optJSONObject(str);
                                if (optJSONObject != null) {
                                    r32 = AnonymousClass223.A00(optJSONObject.optString("min_android_app_supported_version"));
                                }
                            } catch (JSONException e2) {
                                StringBuilder sb = new StringBuilder("MessageUtil/isGalaxyMessageOwnedByJid/");
                                sb.append(e2.getMessage());
                                Log.w(sb.toString());
                            }
                        }
                        return A00 == null || r32 == null || A00.A01(r32) < 0;
                    }
                }
            } else if (!(this instanceof C27231Qy)) {
                return false;
            } else {
                i2 = 1538;
            }
        }
        return r6.A0E(C16620tM.A02, i2);
    }

    public boolean A04(C33211iD r2, C30161br r3) {
        return false;
    }
}
