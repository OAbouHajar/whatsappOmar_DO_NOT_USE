package X;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.redex.IDxCListenerShape13S0101000_3_I1;
import com.facebook.redex.IDxCListenerShape163S0100000_3_I1;
import com.facebook.redex.IDxCListenerShape1S0201000_3_I1;
import com.facebook.redex.IDxCListenerShape8S0101000_3_I1;
import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.actions.IDxNCallbackShape21S0200000_3_I1;
import com.obwhatsapp.payments.ui.IndiaUpiChangePinActivity;
import com.obwhatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.obwhatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import com.obwhatsapp.payments.ui.IndiaUpiMandatePaymentActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPauseMandateActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.obwhatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.obwhatsapp.payments.ui.IndiaUpiStepUpActivity;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.npci.commonlibrary.GetCredential;

/* renamed from: X.5km  reason: invalid class name and case insensitive filesystem */
public abstract class C112935km extends AnonymousClass5kn implements C1222868z {
    public static final HashMap A0J;
    public int A00;
    public AnonymousClass013 A01;
    public AnonymousClass173 A02;
    public C1204661t A03;
    public AnonymousClass69M A04 = new AnonymousClass60M(this);
    public C118535uq A05;
    public AnonymousClass4XO A06;
    public C224918d A07;
    public C118805vH A08;
    public C112265iD A09;
    public C112325iJ A0A;
    public C1200960h A0B;
    public C18280wR A0C;
    public String A0D;
    public String A0E;
    public C118985vj A0F;
    public boolean A0G;
    public boolean A0H;
    public final AnonymousClass1Vo A0I = C110105dW.A0P("IndiaUpiPinHandlerActivity");

    static {
        HashMap A0x = AnonymousClass000.A0x();
        A0J = A0x;
        A0x.put("karur vysya bank", 8);
        A0x.put("dena bank", 4);
    }

    public static C119265wo A24(C112935km r3) {
        C119265wo A042 = r3.A0B.A04(r3.A06, 0);
        r3.A3I();
        if (A042.A00 == 0) {
            A042.A00 = R.string.str1031;
        }
        return A042;
    }

    public Dialog A3S(C35521m4 r10, int i2) {
        if (i2 == 11) {
            return A3T(new C1213365c(r10, this), getString(R.string.str044e), 11, R.string.str090e, R.string.str0e87);
        } else if (i2 != 28) {
            return super.onCreateDialog(i2);
        } else {
            C32241fu A002 = C32241fu.A00(this);
            A002.A01(R.string.str1031);
            C110105dW.A0w(A002, this, 50, R.string.str0e87);
            return A002.create();
        }
    }

    public Dialog A3T(Runnable runnable, String str, int i2, int i3, int i4) {
        AnonymousClass1Vo r2 = this.A0I;
        StringBuilder A0r = AnonymousClass000.A0r("IndiaUpiPinHandlerActivity showMessageDialog id:");
        A0r.append(i2);
        A0r.append(" message:");
        r2.A06(AnonymousClass000.A0h(str, A0r));
        C32241fu A002 = C32241fu.A00(this);
        A002.A06(str);
        A002.setPositiveButton(i3, new IDxCListenerShape1S0201000_3_I1(this, runnable, i2, 0));
        A002.setNegativeButton(i4, new IDxCListenerShape8S0101000_3_I1(this, i2, 1));
        A002.A07(true);
        A002.A03(new IDxCListenerShape13S0101000_3_I1(this, i2, 1));
        return A002.create();
    }

    public Dialog A3U(Runnable runnable, String str, String str2, int i2, int i3, int i4) {
        AnonymousClass1Vo r2 = this.A0I;
        StringBuilder A0r = AnonymousClass000.A0r("IndiaUpiPinHandlerActivity showMessageDialog id:");
        A0r.append(i2);
        A0r.append(" message:");
        A0r.append(str2);
        A0r.append("title: ");
        r2.A06(AnonymousClass000.A0h(str, A0r));
        C32241fu A002 = C32241fu.A00(this);
        A002.A06(str2);
        A002.setTitle(str);
        A002.setPositiveButton(i3, new IDxCListenerShape1S0201000_3_I1(this, runnable, i2, 1));
        A002.setNegativeButton(i4, new IDxCListenerShape8S0101000_3_I1(this, i2, 0));
        A002.A07(true);
        A002.A03(new IDxCListenerShape13S0101000_3_I1(this, i2, 0));
        return A002.create();
    }

    public final String A3V(int i2) {
        try {
            JSONObject A0J2 = C13700nu.A0J();
            JSONArray jSONArray = new JSONArray();
            if (i2 <= 0) {
                i2 = 4;
            }
            JSONObject A0J3 = C13700nu.A0J();
            A0J3.put("type", "PIN");
            A0J3.put("subtype", "MPIN");
            A0J3.put("dType", "NUM");
            A0J3.put("dLength", i2);
            jSONArray.put(A0J3);
            return C110115dX.A0f(jSONArray, "CredAllowed", A0J2);
        } catch (JSONException e2) {
            this.A0I.A0A("createCredRequired threw: ", e2);
            return null;
        }
    }

    public final JSONArray A3W(C28401Vy r6, String str, String str2, String str3, String str4, String str5) {
        JSONArray jSONArray = new JSONArray();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONArray.put(C13700nu.A0J().putOpt(FacebookFacade.RequestParameter.NAME, getString(R.string.str1d5e)).putOpt("value", str));
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONArray.put(C13700nu.A0J().putOpt(FacebookFacade.RequestParameter.NAME, getString(R.string.str1d5c)).putOpt("value", str2));
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONArray.put(C13700nu.A0J().putOpt(FacebookFacade.RequestParameter.NAME, getString(R.string.str0f31)).putOpt("value", str4));
            }
            if (r6 != null) {
                jSONArray.put(C13700nu.A0J().putOpt(FacebookFacade.RequestParameter.NAME, getString(R.string.str0f33)).putOpt("value", r6.toString()));
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONArray.put(C13700nu.A0J().putOpt(FacebookFacade.RequestParameter.NAME, getString(R.string.str1d5d)).putOpt("value", str3));
            }
            if (!TextUtils.isEmpty(str5)) {
                jSONArray.put(C13700nu.A0J().putOpt(FacebookFacade.RequestParameter.NAME, getString(R.string.str0f32)).putOpt("value", str5));
            }
            return jSONArray;
        } catch (JSONException e2) {
            throw C110115dX.A0Z(e2);
        }
    }

    public final JSONObject A3X(String str) {
        JSONObject A0J2 = C13700nu.A0J();
        try {
            A0J2.put("txnId", str);
            A0J2.put("deviceId", this.A0D);
            A0J2.put("appId", "com.whatsapp");
            A0J2.put("mobileNumber", this.A0E);
            return A0J2;
        } catch (JSONException e2) {
            throw C110115dX.A0Z(e2);
        }
    }

    public void A3Y() {
        C118535uq r0 = this.A05;
        if (r0 != null) {
            r0.A00();
            return;
        }
        C13680ns.A1U(new C114355nd(this, true), this.A05);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if ((r1 instanceof com.obwhatsapp.payments.ui.IndiaUpiCheckBalanceActivity) == false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3Z() {
        /*
            r1 = this;
            boolean r0 = r1 instanceof com.obwhatsapp.payments.ui.IndiaUpiStepUpActivity
            if (r0 != 0) goto L_0x0013
            boolean r0 = r1 instanceof X.C112825ja
            if (r0 == 0) goto L_0x0014
            r0 = 0
            r1.A0G = r0
        L_0x000b:
            r1.Ac1()
        L_0x000e:
            r0 = 19
            X.AnonymousClass29T.A01(r1, r0)
        L_0x0013:
            return
        L_0x0014:
            boolean r0 = r1 instanceof com.obwhatsapp.payments.ui.IndiaUpiPauseMandateActivity
            if (r0 != 0) goto L_0x000b
            boolean r0 = r1 instanceof com.obwhatsapp.payments.ui.IndiaUpiMandatePaymentActivity
            if (r0 != 0) goto L_0x000b
            boolean r0 = r1 instanceof com.obwhatsapp.payments.ui.IndiaUpiCheckBalanceActivity
            if (r0 == 0) goto L_0x000e
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112935km.A3Z():void");
    }

    public void A3a() {
        Afq(R.string.str13db);
        this.A0G = true;
        AnonymousClass29T.A00(this, 19);
        this.A0H = true;
        this.A00++;
        this.A0I.A06("showUPIAppErrorAndConfirmRetry got yes; deleting tokens and keys");
        this.A0C.A0F();
        A3Y();
    }

    public void A3b() {
        C119265wo A042;
        if (!(this instanceof IndiaUpiStepUpActivity)) {
            if (this instanceof C112825ja) {
                C112825ja r2 = (C112825ja) this;
                r2.A41(new AnonymousClass2HJ(C1200960h.A00(r2.A06, 0)));
                return;
            }
            if (this instanceof IndiaUpiPauseMandateActivity) {
                A042 = A24(this);
                overridePendingTransition(0, 0);
            } else if (this instanceof IndiaUpiMandatePaymentActivity) {
                A042 = this.A0B.A04(this.A06, 0);
                A3I();
                if (A042.A00 == 0) {
                    A042.A00 = R.string.str1031;
                }
                overridePendingTransition(0, 0);
            } else if (!(this instanceof IndiaUpiCheckBalanceActivity)) {
                if (this instanceof IndiaUpiChangePinActivity) {
                    C119265wo A043 = this.A0B.A04(this.A06, 0);
                    A3I();
                    if (A043.A00 == 0) {
                        A043.A00 = R.string.str1006;
                    }
                    Afh(A043.A01(this));
                    return;
                }
                C112815jT r3 = (C112815jT) this;
                r3.A3j(r3.A0B.A04(r3.A06, 0));
                return;
            }
            C111345g2.A1i(this, A042);
            return;
        }
        C111345g2.A1i(this, A24(this));
    }

    public void A3c() {
        String str;
        UserJid userJid;
        UserJid userJid2;
        if (!(this instanceof IndiaUpiStepUpActivity) && !(this instanceof IndiaUpiPauseMandateActivity) && !(this instanceof IndiaUpiMandatePaymentActivity)) {
            if (this instanceof IndiaUpiSendPaymentActivity) {
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = (IndiaUpiSendPaymentActivity) this;
                C15830rv r1 = indiaUpiSendPaymentActivity.A0E;
                if (C16030sJ.A0L(r1)) {
                    userJid = indiaUpiSendPaymentActivity.A0G;
                    if (userJid == null) {
                        indiaUpiSendPaymentActivity.A39(C13690nt.A0E(indiaUpiSendPaymentActivity));
                        return;
                    }
                } else {
                    userJid = UserJid.of(r1);
                }
                indiaUpiSendPaymentActivity.A0C = userJid;
                indiaUpiSendPaymentActivity.A08 = indiaUpiSendPaymentActivity.A47() ? null : indiaUpiSendPaymentActivity.A08.A01(indiaUpiSendPaymentActivity.A0C);
                boolean z2 = false;
                if (C39841t9.A03(indiaUpiSendPaymentActivity.A09) && indiaUpiSendPaymentActivity.A0C != null) {
                    C114595o1 r12 = new C114595o1(indiaUpiSendPaymentActivity, true);
                    indiaUpiSendPaymentActivity.A02 = r12;
                    C13700nu.A0W(r12, indiaUpiSendPaymentActivity.A05);
                    indiaUpiSendPaymentActivity.Afq(R.string.str13db);
                } else if ((C39841t9.A03(indiaUpiSendPaymentActivity.A09) || !indiaUpiSendPaymentActivity.A0F.AId(indiaUpiSendPaymentActivity.A09)) && ((userJid2 = indiaUpiSendPaymentActivity.A0C) == null || !indiaUpiSendPaymentActivity.A00.A0V(UserJid.of(userJid2)))) {
                    indiaUpiSendPaymentActivity.A4C();
                } else {
                    indiaUpiSendPaymentActivity.A0K.A00(indiaUpiSendPaymentActivity, new C119825zg(indiaUpiSendPaymentActivity), indiaUpiSendPaymentActivity.A0C, indiaUpiSendPaymentActivity.A09, true, false);
                }
                if (indiaUpiSendPaymentActivity.A0R == null && C111345g2.A21(indiaUpiSendPaymentActivity)) {
                    AnonymousClass5vS r2 = indiaUpiSendPaymentActivity.A0Y;
                    boolean A47 = indiaUpiSendPaymentActivity.A47();
                    if (indiaUpiSendPaymentActivity.A0I != null) {
                        z2 = true;
                    }
                    if (A47 && !z2 && r2.A01.A0C(1718)) {
                        indiaUpiSendPaymentActivity.A05.Aco(new AnonymousClass64R(indiaUpiSendPaymentActivity));
                    }
                }
            } else if (!(this instanceof IndiaUpiCheckOrderDetailsActivity) && !(this instanceof IndiaUpiCheckBalanceActivity)) {
                C112815jT r22 = (C112815jT) this;
                if (!r22.A06.A07.contains("pin-entry-ui")) {
                    AnonymousClass1Vo r3 = r22.A07;
                    StringBuilder A0r = AnonymousClass000.A0r("showMainPaneAfterPayAppRegistered: bankAccount: ");
                    A0r.append(r22.A00);
                    A0r.append(" inSetup: ");
                    A0r.append(r22.A0R);
                    C110105dW.A1L(r3, A0r);
                    r22.A06.A02("pin-entry-ui");
                    C35521m4 r0 = r22.A00;
                    if (r0 != null) {
                        C111805hR r13 = (C111805hR) r0.A08;
                        if (r13 == null) {
                            str = "could not find bank info to reset pin";
                        } else if (!r22.A0R || !AnonymousClass000.A1X(r13.A05.A00)) {
                            r22.A3e();
                            return;
                        } else {
                            r3.A06("showOrCheckPin insetup and upi pin already set; showSuccessAndFinish");
                            r22.A0I.A09("2fa");
                            r22.Ac1();
                            C112815jT.A02(r22);
                            r22.finish();
                            return;
                        }
                    } else {
                        str = "could not find bank account";
                    }
                    r3.A06(str);
                    r22.A3b();
                }
            }
        }
    }

    public void A3d() {
        int i2;
        if (!(this instanceof IndiaUpiStepUpActivity)) {
            if (this instanceof C112825ja) {
                i2 = R.string.str1102;
            } else if (!(this instanceof IndiaUpiPauseMandateActivity) && !(this instanceof IndiaUpiMandatePaymentActivity) && !(this instanceof IndiaUpiCheckBalanceActivity)) {
                if (this instanceof IndiaUpiChangePinActivity) {
                    ((IndiaUpiChangePinActivity) this).A01.setText(R.string.str1102);
                    return;
                }
                i2 = R.string.str1179;
            } else {
                return;
            }
            Afq(i2);
        }
    }

    public void A3e() {
        int i2 = this.A00;
        if (i2 < 3) {
            C112325iJ r0 = this.A0A;
            if (r0 != null) {
                r0.A00();
                return;
            }
            return;
        }
        AnonymousClass1Vo r2 = this.A0I;
        StringBuilder A0r = AnonymousClass000.A0r("startShowPinFlow at count: ");
        A0r.append(i2);
        A0r.append(" max: ");
        A0r.append(3);
        r2.A06(AnonymousClass000.A0h("; showErrorAndFinish", A0r));
        A3b();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3f(X.C28401Vy r27, X.C35301lh r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36) {
        /*
            r26 = this;
            r12 = r32
            r13 = r26
            X.1Vo r5 = r13.A0I
            java.lang.String r0 = "getCredentials for pin check called"
            r5.A06(r0)
            r0 = r28
            java.lang.Object r0 = r0.A00
            int r0 = X.AnonymousClass000.A0D(r0)
            java.lang.String r21 = r13.A3V(r0)
            X.60V r0 = r13.A0C
            X.1lh r1 = r0.A06()
            r20 = r29
            boolean r0 = android.text.TextUtils.isEmpty(r20)
            if (r0 != 0) goto L_0x00be
            boolean r0 = android.text.TextUtils.isEmpty(r21)
            if (r0 != 0) goto L_0x00be
            java.lang.Object r4 = r1.A00
            if (r4 == 0) goto L_0x00be
            org.json.JSONObject r3 = X.C13700nu.A0J()
            java.lang.String r0 = "payerBankName"
            r1 = r30
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x00b8 }
            java.lang.String r1 = "backgroundColor"
            java.lang.String r0 = "#FFFFFF"
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x00b8 }
            java.lang.String r1 = "color"
            java.lang.String r0 = "#00FF00"
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x00b8 }
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x0054
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r12 = r12.toLowerCase(r0)
        L_0x0054:
            r14 = r27
            java.lang.String r1 = r14.toString()
            r6 = r33
            org.json.JSONObject r2 = r13.A3X(r6)
            java.lang.String r0 = "txnAmount"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x00b8 }
            java.lang.String r0 = "payerAddr"
            r11 = r31
            r2.put(r0, r11)     // Catch:{ JSONException -> 0x00b8 }
            java.lang.String r0 = "payeeAddr"
            r2.put(r0, r12)     // Catch:{ JSONException -> 0x00b8 }
            java.lang.String r0 = "getKeySaltWithTransactionDetails"
            r5.A04(r0)     // Catch:{ JSONException -> 0x00b8 }
            java.lang.String r7 = r14.toString()
            java.lang.String r9 = r13.A0D
            java.lang.String r10 = r13.A0E
            java.lang.String r8 = "com.whatsapp"
            java.lang.String r1 = X.AnonymousClass5wB.A00(r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r0 = "decrypted trust params"
            r5.A04(r0)
            byte[] r0 = X.AnonymousClass5xS.A02(r1)     // Catch:{  }
            byte[] r4 = (byte[]) r4     // Catch:{  }
            byte[] r1 = X.AnonymousClass5xS.A04(r0, r4)     // Catch:{  }
            r0 = 2
            java.lang.String r22 = android.util.Base64.encodeToString(r1, r0)     // Catch:{  }
            X.5iD r0 = r13.A09
            r0.A01 = r2
            java.lang.String r1 = r13.A0P
            java.lang.String r0 = r13.A0N
            r16 = r34
            r15 = r35
            r17 = r36
            r18 = r1
            r19 = r0
            org.json.JSONArray r23 = r13.A3W(r14, r15, r16, r17, r18, r19)
            r19 = r13
            r24 = r3
            r25 = r2
            r19.A3h(r20, r21, r22, r23, r24, r25)
            return
        L_0x00b8:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C110115dX.A0Z(r0)
            throw r0
        L_0x00be:
            java.lang.String r0 = "getCredentials for set got empty xml or controls or token"
            r5.A06(r0)
            r13.A3Z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112935km.A3f(X.1Vy, X.1lh, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3g(X.C111805hR r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, int r33) {
        /*
            r27 = this;
            r14 = r27
            X.1Vo r7 = r14.A0I
            java.lang.String r0 = "getCredentials for pin setup called."
            r7.A06(r0)
            r13 = r28
            if (r28 == 0) goto L_0x0189
            r0 = 1
            r2 = r33
            if (r2 == r0) goto L_0x0095
            r1 = 2
            X.1lh r0 = r13.A08
            java.lang.Object r0 = r0.A00
            if (r2 == r1) goto L_0x003f
            int r0 = X.AnonymousClass000.A0D(r0)
            java.lang.String r22 = r14.A3V(r0)
        L_0x0021:
            X.60V r0 = r14.A0C
            X.1lh r1 = r0.A06()
            r21 = r29
            boolean r0 = android.text.TextUtils.isEmpty(r21)
            if (r0 != 0) goto L_0x01fe
            boolean r0 = android.text.TextUtils.isEmpty(r22)
            if (r0 != 0) goto L_0x01fe
            java.lang.Object r4 = r1.A00
            if (r4 == 0) goto L_0x01fe
            org.json.JSONObject r2 = X.C13700nu.A0J()
            goto L_0x018d
        L_0x003f:
            int r11 = X.AnonymousClass000.A0D(r0)
            java.lang.String r10 = "dLength"
            java.lang.String r9 = "NUM"
            java.lang.String r8 = "dType"
            java.lang.String r6 = "subtype"
            java.lang.String r5 = "PIN"
            java.lang.String r4 = "type"
            org.json.JSONObject r3 = X.C13700nu.A0J()     // Catch:{ JSONException -> 0x008c }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x008c }
            r2.<init>()     // Catch:{ JSONException -> 0x008c }
            if (r11 > 0) goto L_0x005b
            r11 = 4
        L_0x005b:
            org.json.JSONObject r1 = X.C13700nu.A0J()     // Catch:{ JSONException -> 0x008c }
            r1.put(r4, r5)     // Catch:{ JSONException -> 0x008c }
            java.lang.String r0 = "MPIN"
            r1.put(r6, r0)     // Catch:{ JSONException -> 0x008c }
            r1.put(r8, r9)     // Catch:{ JSONException -> 0x008c }
            r1.put(r10, r11)     // Catch:{ JSONException -> 0x008c }
            r2.put(r1)     // Catch:{ JSONException -> 0x008c }
            org.json.JSONObject r1 = X.C13700nu.A0J()     // Catch:{ JSONException -> 0x008c }
            r1.put(r4, r5)     // Catch:{ JSONException -> 0x008c }
            java.lang.String r0 = "NMPIN"
            r1.put(r6, r0)     // Catch:{ JSONException -> 0x008c }
            r1.put(r8, r9)     // Catch:{ JSONException -> 0x008c }
            r1.put(r10, r11)     // Catch:{ JSONException -> 0x008c }
            r2.put(r1)     // Catch:{ JSONException -> 0x008c }
            java.lang.String r0 = "CredAllowed"
            java.lang.String r22 = X.C110115dX.A0f(r2, r0, r3)     // Catch:{ JSONException -> 0x008c }
            goto L_0x0021
        L_0x008c:
            r1 = move-exception
            java.lang.String r0 = "createCredRequired threw: "
            r7.A0A(r0, r1)
            r22 = 0
            goto L_0x0021
        L_0x0095:
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            X.1lh r3 = r13.A07
            X.1lh r12 = r13.A08
            X.1lh r2 = r13.A04
            r22 = 0
            org.json.JSONObject r9 = X.C13700nu.A0J()     // Catch:{ JSONException -> 0x0181 }
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0181 }
            r8.<init>()     // Catch:{ JSONException -> 0x0181 }
            X.1lh r0 = r13.A07     // Catch:{ JSONException -> 0x0181 }
            java.lang.Object r0 = r0.A00     // Catch:{ JSONException -> 0x0181 }
            int r0 = X.AnonymousClass000.A0D(r0)     // Catch:{ JSONException -> 0x0181 }
            if (r0 != 0) goto L_0x00fe
            X.1lh r0 = r13.A06     // Catch:{ JSONException -> 0x0181 }
            if (r0 != 0) goto L_0x00b8
            r0 = 0
            goto L_0x00ba
        L_0x00b8:
            java.lang.Object r0 = r0.A00     // Catch:{ JSONException -> 0x0181 }
        L_0x00ba:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x0181 }
            org.json.JSONObject r1 = X.C13700nu.A0K(r0)     // Catch:{ JSONException -> 0x0181 }
            java.lang.String r0 = "bank_name"
            java.lang.String r3 = r1.optString(r0)     // Catch:{ JSONException -> 0x0181 }
            if (r3 == 0) goto L_0x00dd
            java.util.HashMap r1 = A0J     // Catch:{ JSONException -> 0x0181 }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ JSONException -> 0x0181 }
            java.lang.String r0 = r3.toLowerCase(r0)     // Catch:{ JSONException -> 0x0181 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ JSONException -> 0x0181 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ JSONException -> 0x0181 }
        L_0x00d6:
            java.lang.String r3 = "otpLength"
            X.2gP r1 = X.C110105dW.A0L()     // Catch:{ JSONException -> 0x0181 }
            goto L_0x00e0
        L_0x00dd:
            r0 = r22
            goto L_0x00d6
        L_0x00e0:
            if (r0 == 0) goto L_0x00e3
            goto L_0x00e5
        L_0x00e3:
            r0 = 6
            goto L_0x00e9
        L_0x00e5:
            int r0 = r0.intValue()     // Catch:{ JSONException -> 0x0181 }
        L_0x00e9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x0181 }
            X.1lh r3 = X.C110105dW.A0J(r1, r4, r0, r3)     // Catch:{ JSONException -> 0x0181 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ JSONException -> 0x0181 }
            java.lang.String r0 = "createCredRequired otpLength override: "
            java.lang.String r0 = X.AnonymousClass000.A0e(r3, r0, r1)     // Catch:{ JSONException -> 0x0181 }
            r7.A06(r0)     // Catch:{ JSONException -> 0x0181 }
        L_0x00fe:
            java.lang.Object r3 = r3.A00     // Catch:{ JSONException -> 0x0181 }
            r0 = r3
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ JSONException -> 0x0181 }
            int r0 = r0.intValue()     // Catch:{ JSONException -> 0x0181 }
            java.lang.String r10 = "dLength"
            java.lang.String r6 = "NUM"
            java.lang.String r5 = "dType"
            java.lang.String r4 = "subtype"
            java.lang.String r11 = "type"
            if (r0 <= 0) goto L_0x012a
            org.json.JSONObject r1 = X.C13700nu.A0J()     // Catch:{ JSONException -> 0x0181 }
            java.lang.String r0 = "OTP"
            r1.put(r11, r0)     // Catch:{ JSONException -> 0x0181 }
            java.lang.String r0 = "SMS"
            r1.put(r4, r0)     // Catch:{ JSONException -> 0x0181 }
            r1.put(r5, r6)     // Catch:{ JSONException -> 0x0181 }
            r1.put(r10, r3)     // Catch:{ JSONException -> 0x0181 }
            r8.put(r1)     // Catch:{ JSONException -> 0x0181 }
        L_0x012a:
            java.lang.Object r0 = r12.A00     // Catch:{ JSONException -> 0x0181 }
            int r0 = X.AnonymousClass000.A0D(r0)     // Catch:{ JSONException -> 0x0181 }
            if (r0 > 0) goto L_0x0133
            r0 = 4
        L_0x0133:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x0181 }
            int r0 = r12.intValue()     // Catch:{ JSONException -> 0x0181 }
            java.lang.String r3 = "PIN"
            if (r0 <= 0) goto L_0x0154
            org.json.JSONObject r1 = X.C13700nu.A0J()     // Catch:{ JSONException -> 0x0181 }
            r1.put(r11, r3)     // Catch:{ JSONException -> 0x0181 }
            java.lang.String r0 = "MPIN"
            r1.put(r4, r0)     // Catch:{ JSONException -> 0x0181 }
            r1.put(r5, r6)     // Catch:{ JSONException -> 0x0181 }
            r1.put(r10, r12)     // Catch:{ JSONException -> 0x0181 }
            r8.put(r1)     // Catch:{ JSONException -> 0x0181 }
        L_0x0154:
            int r1 = r13.A01     // Catch:{ JSONException -> 0x0181 }
            r0 = 2
            if (r1 != r0) goto L_0x0176
            java.lang.Object r2 = r2.A00     // Catch:{ JSONException -> 0x0181 }
            int r0 = X.AnonymousClass000.A0D(r2)     // Catch:{ JSONException -> 0x0181 }
            if (r0 <= 0) goto L_0x0176
            org.json.JSONObject r1 = X.C13700nu.A0J()     // Catch:{ JSONException -> 0x0181 }
            r1.put(r11, r3)     // Catch:{ JSONException -> 0x0181 }
            java.lang.String r0 = "ATMPIN"
            r1.put(r4, r0)     // Catch:{ JSONException -> 0x0181 }
            r1.put(r5, r6)     // Catch:{ JSONException -> 0x0181 }
            r1.put(r10, r2)     // Catch:{ JSONException -> 0x0181 }
            r8.put(r1)     // Catch:{ JSONException -> 0x0181 }
        L_0x0176:
            java.lang.String r0 = "CredAllowed"
            r9.put(r0, r8)     // Catch:{ JSONException -> 0x0181 }
            java.lang.String r22 = r9.toString()     // Catch:{ JSONException -> 0x0181 }
            goto L_0x0021
        L_0x0181:
            r1 = move-exception
            java.lang.String r0 = "createCredRequired threw: "
            r7.A0A(r0, r1)
            goto L_0x0021
        L_0x0189:
            r22 = 0
            goto L_0x0021
        L_0x018d:
            java.lang.String r0 = "payerBankName"
            r1 = r30
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x01f8 }
            java.lang.String r1 = "backgroundColor"
            java.lang.String r0 = "#FFFFFF"
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x01f8 }
            java.lang.String r1 = "color"
            java.lang.String r0 = "#00FF00"
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x01f8 }
            java.lang.String r1 = "resendOTPFeature"
            java.lang.String r0 = "true"
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x01f8 }
            r0 = r31
            org.json.JSONObject r26 = r14.A3X(r0)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0q(r0)
            java.lang.String r1 = "|"
            r3.append(r1)
            java.lang.String r0 = "com.whatsapp"
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r14.A0E
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r14.A0D
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r3)
            byte[] r0 = X.AnonymousClass5xS.A02(r0)     // Catch:{  }
            byte[] r4 = (byte[]) r4     // Catch:{  }
            byte[] r1 = X.AnonymousClass5xS.A04(r0, r4)     // Catch:{  }
            r0 = 2
            java.lang.String r23 = android.util.Base64.encodeToString(r1, r0)     // Catch:{  }
            r15 = 0
            java.lang.String r1 = r14.A0P
            java.lang.String r0 = r14.A0N
            r18 = r15
            r17 = r32
            r16 = r15
            r19 = r1
            r20 = r0
            org.json.JSONArray r24 = r14.A3W(r15, r16, r17, r18, r19, r20)
            r20 = r14
            r25 = r2
            r20.A3h(r21, r22, r23, r24, r25, r26)
            return
        L_0x01f8:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C110115dX.A0Z(r0)
            throw r0
        L_0x01fe:
            java.lang.String r0 = "getCredentials for set got empty xml or controls or token"
            r7.A06(r0)
            r14.A3Z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112935km.A3g(X.5hR, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    public final void A3h(String str, String str2, String str3, JSONArray jSONArray, JSONObject jSONObject, JSONObject jSONObject2) {
        if (this.A0D.A0P()) {
            AnonymousClass60V r2 = this.A0C;
            String A082 = r2.A08();
            if (TextUtils.isEmpty(A082) || !r2.A0T(A082)) {
                A2X(C110105dW.A04(this, IndiaUpiPaymentsAccountSetupActivity.class), true);
                A3H();
                return;
            }
        }
        if (C119075vs.A00(this.A0C, this.A05, this.A04, "pinEntry")) {
            AnonymousClass3K4.A0r(this, R.string.str147d, R.string.str147c);
            return;
        }
        Intent putExtra = C110105dW.A04(getApplicationContext(), GetCredential.class).putExtra("keyCode", "NPCI").putExtra("keyXmlPayload", str).putExtra("controls", str2).putExtra("configuration", jSONObject.toString()).putExtra("salt", jSONObject2.toString()).putExtra("payInfo", jSONArray.toString()).putExtra("trust", str3).putExtra("languagePref", C13690nt.A0m(this.A01).toString());
        putExtra.setFlags(536870912);
        Ag3(putExtra, 200);
    }

    public void A3i(HashMap hashMap) {
        HashMap hashMap2 = hashMap;
        if (this instanceof IndiaUpiStepUpActivity) {
            IndiaUpiStepUpActivity indiaUpiStepUpActivity = (IndiaUpiStepUpActivity) this;
            indiaUpiStepUpActivity.A07.A06("onGetCredentials called");
            C110585eT r4 = indiaUpiStepUpActivity.A04;
            AnonymousClass027 r3 = r4.A00;
            String string = r4.A04.A00.getString(R.string.str0fde);
            C116815rz r0 = new C116815rz();
            r0.A00 = string;
            r3.A0B(r0);
            C35521m4 r5 = r4.A05;
            C111805hR r6 = (C111805hR) r5.A08;
            if (r6 == null) {
                C116815rz.A00(r3);
                r4.A01.A0B(new C117605tG(2));
                return;
            }
            ArrayList A0u = AnonymousClass000.A0u();
            C110105dW.A1P("vpa", (String) C39841t9.A02(r6.A09), A0u);
            if (!TextUtils.isEmpty(r6.A0F)) {
                C110105dW.A1P("vpa-id", r6.A0F, A0u);
            }
            C110105dW.A1P("seq-no", r4.A02, A0u);
            C110105dW.A1P("upi-bank-info", (String) C110105dW.A0d(r6.A06), A0u);
            C110105dW.A1P("device-id", r4.A09.A01(), A0u);
            C110105dW.A1P("credential-id", r5.A0A, A0u);
            C110105dW.A1P("mpin", C119365wy.A00("MPIN", hashMap2), A0u);
            r4.A08.A00(new AnonymousClass61M(r4), r4.A06.A02(), new C28371Vv("mpin", C110115dX.A1F(A0u, 0)));
        } else if (this instanceof C112825ja) {
            C112825ja r2 = (C112825ja) this;
            if (r2.A0B != null) {
                r2.A0B.A08 = hashMap2;
                r2.A3q();
                r2.Ac1();
                r2.Afq(R.string.str13db);
                if (r2.A49()) {
                    r2.A0l = true;
                    if (r2.A0n) {
                        Intent A3k = r2.A3k();
                        r2.finish();
                        r2.startActivity(A3k);
                        return;
                    } else if (r2.A0o) {
                        return;
                    }
                }
                r2.A45(r2.A3l(r2.A0A, r2.A01), false);
            }
        } else if (this instanceof IndiaUpiCheckBalanceActivity) {
            IndiaUpiCheckBalanceActivity indiaUpiCheckBalanceActivity = (IndiaUpiCheckBalanceActivity) this;
            indiaUpiCheckBalanceActivity.A05.A06("onGetCredentials called");
            C110575eS r7 = indiaUpiCheckBalanceActivity.A02;
            AnonymousClass027 r32 = r7.A01;
            String string2 = r7.A02.A00.getString(R.string.str09b5);
            C116815rz r02 = new C116815rz();
            r02.A00 = string2;
            r32.A0B(r02);
            C35521m4 r62 = r7.A04;
            C111805hR r22 = (C111805hR) r62.A08;
            C112315iI r03 = r7.A05;
            C35301lh r52 = r22.A09;
            String str = r22.A0F;
            C35301lh r42 = r22.A06;
            C35301lh r33 = r7.A00;
            String str2 = r62.A0A;
            C117985ts r15 = new C117985ts(r7);
            C17190ug r23 = r03.A06;
            String A022 = r23.A02();
            String A002 = hashMap != null ? C119365wy.A00("MPIN", hashMap2) : null;
            String A0e = C110115dX.A0e(r33);
            String str3 = r03.A0F;
            String A0e2 = C110115dX.A0e(r52);
            String str4 = (String) C39841t9.A02(r42);
            AnonymousClass2BJ r72 = new AnonymousClass2BJ(A022);
            C32461gQ A0X = C110105dW.A0X();
            C32461gQ A0Y = C110105dW.A0Y(A0X);
            C32461gQ.A00(A0Y, "action", "upi-check-balance");
            if (C110105dW.A1W(str2, 1, false)) {
                C32461gQ.A00(A0Y, "credential-id", str2);
            }
            if (C32271fx.A0D(A0e, 35, 35, false)) {
                C32461gQ.A00(A0Y, "seq-no", A0e);
            }
            if (C110105dW.A1V(str3, 1, false)) {
                C32461gQ.A00(A0Y, "device-id", str3);
            }
            if (C110105dW.A1W(A002, 0, false)) {
                C32461gQ.A00(A0Y, "mpin", A002);
            }
            if (C32271fx.A0D(A0e2, 1, 100, false)) {
                C32461gQ.A00(A0Y, "vpa", A0e2);
            }
            if (str != null && C32271fx.A0D(str, 1, 100, true)) {
                C32461gQ.A00(A0Y, "vpa-id", str);
            }
            if (C110115dX.A1D(str4, false)) {
                C32461gQ.A00(A0Y, "upi-bank-info", str4);
            }
            C17190ug r9 = r23;
            r9.A0A(new IDxNCallbackShape21S0200000_3_I1(r03.A00, r03.A01, r03.A09, C116635rh.A02(r03, "upi-check-balance"), r03, r15), C110105dW.A0S(A0Y, A0X, r72), A022, 204, 0);
        } else if (this instanceof IndiaUpiChangePinActivity) {
            IndiaUpiChangePinActivity indiaUpiChangePinActivity = (IndiaUpiChangePinActivity) this;
            C39901tF r43 = indiaUpiChangePinActivity.A02.A08;
            AnonymousClass00B.A07(r43, indiaUpiChangePinActivity.A05.A02("IndiaUpiChangePinActivity could not cast country data to IndiaUpiMethodData"));
            C111805hR r44 = (C111805hR) r43;
            C112325iJ r53 = indiaUpiChangePinActivity.A0A;
            C35301lh r63 = r44.A09;
            String str5 = r44.A0F;
            C35301lh r73 = r44.A06;
            String str6 = indiaUpiChangePinActivity.A02.A0A;
            String str7 = indiaUpiChangePinActivity.A03;
            if (C39841t9.A03(r63)) {
                r53.A0D.A01(r53.A01, (AnonymousClass4XO) null, new AnonymousClass616(r73, r53, str6, str7, hashMap2));
            } else {
                r53.A02(r63, r73, str5, str6, str7, hashMap2);
            }
        } else if (this instanceof C112815jT) {
            C112815jT r24 = (C112815jT) this;
            r24.Afq(R.string.str117a);
            C35521m4 r45 = r24.A00;
            C39901tF r34 = r45.A08;
            AnonymousClass00B.A07(r34, "could not cast country data to IndiaUpiMethodData");
            C111805hR r35 = (C111805hR) r34;
            C112325iJ r54 = r24.A0A;
            C35301lh r64 = r35.A09;
            String str8 = r35.A0F;
            C35301lh r74 = r35.A06;
            String str9 = r45.A0A;
            String str10 = r24.A04;
            String str11 = r24.A02;
            String str12 = r24.A03;
            String str13 = r24.A05;
            if (C39841t9.A03(r64)) {
                r54.A0D.A01(r54.A01, r54.A00, new AnonymousClass617(r74, r54, str9, str10, str11, str12, str13, hashMap2));
            } else {
                r54.A01(r64, r74, str8, str9, str10, str11, str12, str13, hashMap2);
            }
        } else {
            AnonymousClass5kl r25 = (AnonymousClass5kl) this;
            r25.A0H.A06("onGetCredentials called");
            r25.A3l(r25.A02, hashMap2);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 200) {
            boolean z2 = false;
            if (i3 == 250) {
                HashMap hashMap = (HashMap) intent.getSerializableExtra("credBlocks");
                this.A0I.A07(AnonymousClass000.A0g("onLibraryResult for credentials: ", hashMap));
                if (hashMap != null && !hashMap.isEmpty()) {
                    z2 = true;
                }
                AnonymousClass00B.A0G(z2);
                A3i(hashMap);
            } else if (i3 == 251) {
                A3Z();
            } else if (i3 == 252) {
                this.A0I.A06("user canceled");
                this.A0H = false;
                if (this.A0G) {
                    this.A0G = false;
                    Ac1();
                    return;
                }
                A3H();
                finish();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        C110105dW.A0m(this);
        String A062 = this.A01.A06();
        AnonymousClass00B.A06(A062);
        this.A0E = A062;
        this.A0D = this.A0C.A01();
        this.A06 = this.A0B.A04;
        C13700nu.A0W(new C114355nd(this, false), this.A05);
        if (getIntent() != null) {
            getIntent().getStringExtra("extra_request_id");
        }
        if (bundle != null) {
            this.A0H = bundle2.getBoolean("payAppShowPinErrorSavedInst");
            this.A00 = bundle2.getInt("showPinConfirmCountSavedInst");
            this.A03 = bundle2.getInt("setupModeSavedInst", 1);
        }
        C14710pd r22 = this.A0C;
        C14870pt r15 = this.A05;
        C16040sK r14 = this.A01;
        C17190ug r23 = this.A0H;
        C18280wR r13 = this.A0C;
        C18290wS r12 = this.A0P;
        AnonymousClass175 r11 = this.A0I;
        C119365wy r24 = this.A0B;
        C18310wU r10 = this.A0M;
        C118805vH r9 = this.A08;
        AnonymousClass173 r8 = this.A02;
        AnonymousClass174 r7 = this.A0N;
        AnonymousClass61W r6 = this.A0E;
        C18260wP r5 = this.A07;
        C18340wX r4 = this.A0K;
        AnonymousClass60V r25 = this.A0C;
        AnonymousClass175 r26 = r11;
        C18340wX r27 = r4;
        C18260wP r20 = r5;
        AnonymousClass173 r21 = r8;
        C14870pt r18 = r15;
        C16040sK r19 = r14;
        this.A0A = new C112325iJ(this, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r10, r7, r12, r9, this, r6, this.A0F, r13);
        this.A09 = new C112265iD(this.A05, r22, r23, r24, r10);
    }

    public Dialog onCreateDialog(int i2) {
        if (i2 != 19) {
            return super.onCreateDialog(i2);
        }
        C32241fu A002 = C32241fu.A00(this);
        A002.A01(R.string.str107e);
        C110105dW.A0w(A002, this, 48, R.string.str1ba6);
        C110105dW.A0v(A002, this, 49, R.string.str0de3);
        A002.A07(true);
        A002.A03(new IDxCListenerShape163S0100000_3_I1(this, 8));
        return A002.create();
    }

    public void onDestroy() {
        super.onDestroy();
        C112325iJ r1 = this.A0A;
        if (r1 != null) {
            r1.A00 = null;
        }
        this.A04 = null;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("payAppShowPinErrorSavedInst", this.A0H);
        bundle.putInt("showPinConfirmCountSavedInst", this.A00);
        bundle.putInt("setupModeSavedInst", this.A03);
    }
}
