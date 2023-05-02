package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape163S0100000_3_I1;
import com.obwhatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.5o4  reason: invalid class name */
public class AnonymousClass5o4 extends C16690tT {
    public ProgressDialog A00;
    public final Bundle A01;
    public final AnonymousClass1KO A02;
    public final C15900s5 A03;
    public final C17130ua A04;
    public final AnonymousClass013 A05;
    public final C30671cl A06;
    public final AnonymousClass1Vt A07;
    public final C19950zG A08;
    public final AnonymousClass174 A09;
    public final AnonymousClass1Vo A0A = C110105dW.A0Q("PaymentSupportTask", "payment-settings");
    public final String A0B;
    public final WeakReference A0C;

    public AnonymousClass5o4(Bundle bundle, C14550pN r4, AnonymousClass1KO r5, C15900s5 r6, C17130ua r7, AnonymousClass013 r8, C30671cl r9, AnonymousClass1Vt r10, C19950zG r11, AnonymousClass174 r12, String str) {
        this.A0C = new WeakReference(r4);
        this.A04 = r7;
        this.A03 = r6;
        this.A02 = r5;
        this.A05 = r8;
        this.A08 = r11;
        this.A09 = r12;
        this.A0B = str;
        this.A06 = r9;
        this.A07 = r10;
        this.A01 = bundle;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x01cb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x01d0 */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x017a A[Catch:{ all -> 0x01c7, all -> 0x01cb, all -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x018a A[Catch:{ all -> 0x01c7, all -> 0x01cb, all -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01be A[Catch:{ all -> 0x01c7, all -> 0x01cb, all -> 0x01cc }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:56:0x01c0=Splitter:B:56:0x01c0, B:64:0x01cb=Splitter:B:64:0x01cb} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r20) {
        /*
            r19 = this;
            r1 = r19
            java.lang.ref.WeakReference r0 = r1.A0C
            java.lang.Object r0 = r0.get()
            r16 = 0
            if (r0 == 0) goto L_0x01e5
            org.json.JSONObject r5 = X.C13700nu.A0J()     // Catch:{ IOException | JSONException -> 0x01d1 }
            java.lang.String r0 = "android"
            java.lang.String r8 = "platform"
            r5.put(r8, r0)     // Catch:{ IOException | JSONException -> 0x01d1 }
            X.174 r2 = r1.A09     // Catch:{ IOException | JSONException -> 0x01d1 }
            X.1cm r0 = r2.A01()     // Catch:{ IOException | JSONException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d1
            X.1cm r0 = r2.A01()     // Catch:{ IOException | JSONException -> 0x01d1 }
            java.lang.String r2 = r0.A03     // Catch:{ IOException | JSONException -> 0x01d1 }
        L_0x0025:
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IOException | JSONException -> 0x01d1 }
            if (r0 != 0) goto L_0x0030
            java.lang.String r0 = "country"
            r5.put(r0, r2)     // Catch:{ IOException | JSONException -> 0x01d1 }
        L_0x0030:
            X.013 r0 = r1.A05     // Catch:{ IOException | JSONException -> 0x01d1 }
            java.lang.String r0 = r0.A06()     // Catch:{ IOException | JSONException -> 0x01d1 }
            java.lang.String r2 = "lang"
            r5.put(r2, r0)     // Catch:{ IOException | JSONException -> 0x01d1 }
            java.lang.String r3 = r1.A0B     // Catch:{ IOException | JSONException -> 0x01d1 }
            java.lang.String r0 = "context"
            r5.put(r0, r3)     // Catch:{ IOException | JSONException -> 0x01d1 }
            java.lang.String r3 = "version"
            java.lang.String r0 = "v2"
            r5.put(r3, r0)     // Catch:{ IOException | JSONException -> 0x01d1 }
            org.json.JSONObject r6 = X.C13700nu.A0J()     // Catch:{ IOException | JSONException -> 0x01d1 }
            X.1Vt r7 = r1.A07     // Catch:{ IOException | JSONException -> 0x01d1 }
            if (r7 == 0) goto L_0x0096
            java.lang.String r0 = r7.A0J     // Catch:{ IOException | JSONException -> 0x01d1 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IOException | JSONException -> 0x01d1 }
            if (r0 != 0) goto L_0x0060
            java.lang.String r4 = r7.A0J     // Catch:{ IOException | JSONException -> 0x01d1 }
            java.lang.String r0 = "error_code"
            r6.put(r0, r4)     // Catch:{ IOException | JSONException -> 0x01d1 }
        L_0x0060:
            int r0 = r7.A03     // Catch:{ IOException | JSONException -> 0x01d1 }
            java.lang.String r4 = X.AnonymousClass1W1.A03(r0)     // Catch:{ IOException | JSONException -> 0x01d1 }
            java.lang.String r0 = "type"
            r6.put(r0, r4)     // Catch:{ IOException | JSONException -> 0x01d1 }
            int r4 = r7.A03     // Catch:{ IOException | JSONException -> 0x01d1 }
            int r0 = r7.A02     // Catch:{ IOException | JSONException -> 0x01d1 }
            java.lang.String r4 = X.AnonymousClass1W1.A04(r4, r0)     // Catch:{ IOException | JSONException -> 0x01d1 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ IOException | JSONException -> 0x01d1 }
            if (r0 != 0) goto L_0x007e
            java.lang.String r0 = "transaction_status"
            r6.put(r0, r4)     // Catch:{ IOException | JSONException -> 0x01d1 }
        L_0x007e:
            X.1cl r4 = r1.A06     // Catch:{ IOException | JSONException -> 0x01d1 }
            if (r4 == 0) goto L_0x0091
            java.lang.String r0 = r4.A0B     // Catch:{ IOException | JSONException -> 0x01d1 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IOException | JSONException -> 0x01d1 }
            if (r0 != 0) goto L_0x0091
            java.lang.String r4 = r4.A0B     // Catch:{ IOException | JSONException -> 0x01d1 }
            java.lang.String r0 = "bank_name"
            r6.put(r0, r4)     // Catch:{ IOException | JSONException -> 0x01d1 }
        L_0x0091:
            java.lang.String r0 = "transaction_info"
            r5.put(r0, r6)     // Catch:{ IOException | JSONException -> 0x01d1 }
        L_0x0096:
            android.net.Uri$Builder r4 = new android.net.Uri$Builder     // Catch:{ IOException | JSONException -> 0x01d1 }
            r4.<init>()     // Catch:{ IOException | JSONException -> 0x01d1 }
            java.lang.String r0 = "https"
            r4.scheme(r0)     // Catch:{ IOException | JSONException -> 0x01d1 }
            java.lang.String r0 = "faq.whatsapp.com"
            r4.authority(r0)     // Catch:{ IOException | JSONException -> 0x01d1 }
            java.lang.String r0 = "inappsupport"
            r4.appendPath(r0)     // Catch:{ IOException | JSONException -> 0x01d1 }
            java.lang.String r0 = "payments"
            r4.appendPath(r0)     // Catch:{ IOException | JSONException -> 0x01d1 }
            X.0zG r11 = r1.A08     // Catch:{ IOException | JSONException -> 0x01d1 }
            android.net.Uri r0 = r4.build()     // Catch:{ IOException | JSONException -> 0x01d1 }
            java.lang.String r13 = r0.toString()     // Catch:{ IOException | JSONException -> 0x01d1 }
            java.lang.String r14 = r5.toString()     // Catch:{ IOException | JSONException -> 0x01d1 }
            r0 = 14
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException | JSONException -> 0x01d1 }
            X.16H r11 = (X.AnonymousClass16H) r11     // Catch:{ IOException | JSONException -> 0x01d1 }
            r7 = 0
            r17 = 1
            r18 = 0
            r15 = r16
            X.1pl r4 = r11.A00(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ IOException | JSONException -> 0x01d1 }
            goto L_0x00d4
        L_0x00d1:
            r2 = 0
            goto L_0x0025
        L_0x00d4:
            X.0ua r6 = r1.A04     // Catch:{ all -> 0x01cc }
            r0 = 20
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01cc }
            java.io.InputStream r5 = r4.A9k(r6, r15, r5)     // Catch:{ all -> 0x01cc }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x01cc }
            r0.<init>(r5)     // Catch:{ all -> 0x01cc }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x01cc }
            r6.<init>(r0)     // Catch:{ all -> 0x01cc }
            r11 = 2048(0x800, float:2.87E-42)
            char[] r10 = new char[r11]     // Catch:{ all -> 0x01c7 }
            int r9 = r6.read(r10, r7, r11)     // Catch:{ all -> 0x01c7 }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x01c7 }
        L_0x00f6:
            r0 = -1
            if (r9 == r0) goto L_0x0101
            r5.append(r10, r7, r9)     // Catch:{ all -> 0x01c7 }
            int r9 = r6.read(r10, r7, r11)     // Catch:{ all -> 0x01c7 }
            goto L_0x00f6
        L_0x0101:
            java.lang.String r10 = r5.toString()     // Catch:{ all -> 0x01c7 }
            X.1Vo r7 = r1.A0A     // Catch:{ all -> 0x01c7 }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x01c7 }
            java.lang.String r0 = "result="
            r5.append(r0)     // Catch:{ all -> 0x01c7 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r10, r5)     // Catch:{ all -> 0x01c7 }
            r7.A07(r0)     // Catch:{ all -> 0x01c7 }
            r9 = 0
            if (r10 != 0) goto L_0x011d
            r0 = r15
            goto L_0x01c0
        L_0x011d:
            org.json.JSONObject r10 = X.C13700nu.A0K(r10)     // Catch:{ all -> 0x01c7 }
            boolean r0 = r10.has(r3)     // Catch:{ all -> 0x01c7 }
            if (r0 == 0) goto L_0x016f
            int r12 = r10.getInt(r3)     // Catch:{ all -> 0x01c7 }
        L_0x012b:
            java.lang.String r3 = "payment_faqs"
            boolean r0 = r10.has(r3)     // Catch:{ all -> 0x01c7 }
            if (r0 == 0) goto L_0x0171
            org.json.JSONArray r15 = r10.getJSONArray(r3)     // Catch:{ all -> 0x01c7 }
            int r0 = r15.length()     // Catch:{ all -> 0x01c7 }
            if (r0 == 0) goto L_0x0171
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01c7 }
            r14 = 0
        L_0x0142:
            int r0 = r15.length()     // Catch:{ all -> 0x01c7 }
            if (r14 >= r0) goto L_0x0172
            org.json.JSONObject r3 = r15.getJSONObject(r14)     // Catch:{ all -> 0x01c7 }
            java.lang.String r0 = "title"
            java.lang.String r13 = r3.getString(r0)     // Catch:{ all -> 0x01c7 }
            java.lang.String r0 = "description"
            java.lang.String r11 = r3.getString(r0)     // Catch:{ all -> 0x01c7 }
            java.lang.String r0 = "url"
            java.lang.String r5 = r3.getString(r0)     // Catch:{ all -> 0x01c7 }
            java.lang.String r0 = "id"
            java.lang.String r3 = r3.getString(r0)     // Catch:{ all -> 0x01c7 }
            X.4jH r0 = new X.4jH     // Catch:{ all -> 0x01c7 }
            r0.<init>(r13, r11, r5, r3)     // Catch:{ all -> 0x01c7 }
            r7.add(r0)     // Catch:{ all -> 0x01c7 }
            int r14 = r14 + 1
            goto L_0x0142
        L_0x016f:
            r12 = 1
            goto L_0x012b
        L_0x0171:
            r7 = r9
        L_0x0172:
            java.lang.String r3 = "topics"
            boolean r0 = r10.has(r3)     // Catch:{ all -> 0x01c7 }
            if (r0 == 0) goto L_0x01be
            org.json.JSONArray r0 = r10.getJSONArray(r3)     // Catch:{ all -> 0x01c7 }
            java.util.ArrayList r5 = r1.A0B(r0, r12)     // Catch:{ all -> 0x01c7 }
        L_0x0182:
            java.lang.String r3 = "mapped_faq"
            boolean r0 = r10.has(r3)     // Catch:{ all -> 0x01c7 }
            if (r0 == 0) goto L_0x01b8
            org.json.JSONObject r3 = r10.getJSONObject(r3)     // Catch:{ all -> 0x01c7 }
            java.lang.String r0 = "title"
            java.lang.String r10 = r3.optString(r0)     // Catch:{ all -> 0x01c7 }
            r3.optString(r8)     // Catch:{ all -> 0x01c7 }
            r3.optString(r2)     // Catch:{ all -> 0x01c7 }
            java.lang.String r0 = "url"
            java.lang.String r11 = r3.optString(r0)     // Catch:{ all -> 0x01c7 }
            java.lang.String r0 = "id"
            java.lang.String r12 = r3.optString(r0)     // Catch:{ all -> 0x01c7 }
            java.lang.String r0 = "description"
            java.lang.String r13 = r3.optString(r0)     // Catch:{ all -> 0x01c7 }
            java.lang.String r2 = "open_flow"
            r0 = 1
            boolean r14 = r3.optBoolean(r2, r0)     // Catch:{ all -> 0x01c7 }
            X.5st r9 = new X.5st     // Catch:{ all -> 0x01c7 }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x01c7 }
        L_0x01b8:
            X.5sO r0 = new X.5sO     // Catch:{ all -> 0x01c7 }
            r0.<init>(r9, r7, r5)     // Catch:{ all -> 0x01c7 }
            goto L_0x01c0
        L_0x01be:
            r5 = r9
            goto L_0x0182
        L_0x01c0:
            r6.close()     // Catch:{ all -> 0x01cc }
            r4.close()     // Catch:{ IOException | JSONException -> 0x01d1 }
            return r0
        L_0x01c7:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x01cb }
        L_0x01cb:
            throw r0     // Catch:{ all -> 0x01cc }
        L_0x01cc:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x01d0 }
        L_0x01d0:
            throw r0     // Catch:{ IOException | JSONException -> 0x01d1 }
        L_0x01d1:
            r3 = move-exception
            X.1Vo r2 = r1.A0A
            java.lang.String r0 = "error e="
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r3.getMessage()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            r2.A0A(r0, r3)
        L_0x01e5:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5o4.A08(java.lang.Object[]):java.lang.Object");
    }

    public void A09() {
        Context context = (Context) this.A0C.get();
        if (context != null) {
            if (this.A00 == null) {
                ProgressDialog progressDialog = new ProgressDialog(context);
                this.A00 = progressDialog;
                progressDialog.setOnCancelListener(new IDxCListenerShape163S0100000_3_I1(this, 1));
                this.A00.setCanceledOnTouchOutside(false);
            }
            if (!this.A00.isShowing()) {
                this.A00.setMessage(context.getString(R.string.str0b25));
                this.A00.setIndeterminate(true);
                this.A00.show();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0A(java.lang.Object r23) {
        /*
            r22 = this;
            r3 = r23
            X.5sO r3 = (X.C117065sO) r3
            r2 = r22
            java.lang.ref.WeakReference r0 = r2.A0C
            java.lang.Object r13 = r0.get()
            X.0pN r13 = (X.C14550pN) r13
            if (r13 == 0) goto L_0x0080
            if (r3 == 0) goto L_0x00cf
            X.5st r5 = r3.A00
            r4 = 48
            if (r5 == 0) goto L_0x0081
            android.os.Bundle r7 = r2.A01
            r1 = 3
            java.lang.String r0 = "com.obwhatsapp.support.DescribeProblemActivity.type"
            r7.putInt(r0, r1)
            java.lang.String r12 = r5.A02
            java.lang.String r11 = r5.A00
            java.lang.String r10 = r5.A03
            java.lang.String r9 = r5.A01
            boolean r6 = r5.A04
            java.lang.String r8 = r2.A0B
            android.content.Intent r5 = X.C13680ns.A09()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.support.faq.FaqItemActivity"
            r5.setClassName(r1, r0)
            java.lang.String r0 = "title"
            r5.putExtra(r0, r12)
            java.lang.String r0 = "content"
            r5.putExtra(r0, r11)
            java.lang.String r0 = "url"
            r5.putExtra(r0, r10)
            java.lang.String r0 = "article_id"
            r5.putExtra(r0, r9)
            java.lang.String r0 = "show_contact_support_button"
            r5.putExtra(r0, r6)
            java.lang.String r0 = "contact_us_context"
            r5.putExtra(r0, r8)
            java.lang.String r0 = "describe_problem_fields"
            r5.putExtra(r0, r7)
            if (r6 == 0) goto L_0x0065
            java.util.ArrayList r1 = r3.A02
            java.lang.String r0 = "payments_support_topics"
            r5.putParcelableArrayListExtra(r0, r1)
        L_0x0065:
            r13.Ag3(r5, r4)
            r1 = 2130772030(0x7f01003e, float:1.7147167E38)
            r0 = 2130772032(0x7f010040, float:1.714717E38)
            r13.overridePendingTransition(r1, r0)
        L_0x0071:
            android.app.ProgressDialog r0 = r2.A00
            if (r0 == 0) goto L_0x0080
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0080
            android.app.ProgressDialog r0 = r2.A00
            r0.cancel()
        L_0x0080:
            return
        L_0x0081:
            java.util.ArrayList r7 = r3.A01
            if (r7 == 0) goto L_0x00be
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x00be
            java.lang.String r1 = r2.A0B
            android.os.Bundle r6 = r2.A01
            java.util.ArrayList r5 = r3.A02
            java.lang.Class<com.obwhatsapp.support.faq.SearchFAQ> r0 = com.obwhatsapp.support.faq.SearchFAQ.class
            android.content.Intent r3 = X.C110105dW.A04(r13, r0)
            java.lang.String r0 = "com.obwhatsapp.support.faq.SearchFAQ.from"
            r3.putExtra(r0, r1)
            int r1 = r7.size()
            java.lang.String r0 = "com.obwhatsapp.support.faq.SearchFAQ.count"
            r3.putExtra(r0, r1)
            java.lang.String r0 = "describe_problem_bundle"
            r3.putExtra(r0, r6)
            java.lang.String r0 = "payments_support_faqs"
            r3.putExtra(r0, r7)
            java.lang.String r0 = "payments_support_topics"
            r3.putExtra(r0, r5)
            java.lang.String r1 = "com.obwhatsapp.support.faq.SearchFAQ.usePaymentsFlow"
            r0 = 1
            r3.putExtra(r1, r0)
        L_0x00ba:
            r13.Ag3(r3, r4)
            goto L_0x0071
        L_0x00be:
            java.util.ArrayList r1 = r3.A02
            if (r1 == 0) goto L_0x00cf
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00cf
            android.os.Bundle r0 = r2.A01
            android.content.Intent r3 = com.obwhatsapp.inappsupport.ui.SupportTopicsActivity.A02(r13, r0, r1)
            goto L_0x00ba
        L_0x00cf:
            X.0s5 r1 = r2.A03
            X.0s8 r0 = X.C15910s6.A0i
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x00e0
            r0 = 2131890190(0x7f12100e, float:1.9415065E38)
            r13.Afg(r0)
            goto L_0x0071
        L_0x00e0:
            X.1KO r12 = r2.A02
            r21 = 0
            java.lang.String r0 = r2.A0B
            r15 = 0
            java.lang.Integer r16 = X.C13680ns.A0a()
            android.os.Bundle r14 = r2.A01
            r19 = r15
            r20 = r15
            r17 = r0
            r18 = r15
            android.content.Intent r1 = r12.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1.putExtras(r14)
            r0 = 48
            r13.Ag3(r1, r0)
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5o4.A0A(java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        if (r2.getBoolean("children_skippable") == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        if (r15 == 2) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A0B(org.json.JSONArray r14, int r15) {
        /*
            r13 = this;
            int r0 = r14.length()
            r10 = 0
            if (r0 != 0) goto L_0x0008
            return r10
        L_0x0008:
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()
            r3 = 0
        L_0x000d:
            int r0 = r14.length()
            if (r3 >= r0) goto L_0x00a4
            org.json.JSONObject r2 = r14.getJSONObject(r3)
            java.lang.String r0 = "id"
            java.lang.String r7 = r2.getString(r0)
            java.lang.String r0 = "title"
            java.lang.String r8 = r2.getString(r0)
            java.lang.String r1 = "children"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x00a2
            org.json.JSONArray r0 = r2.getJSONArray(r1)
            java.util.ArrayList r11 = r13.A0B(r0, r15)
        L_0x0033:
            java.lang.String r1 = "children_skippable"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x0042
            boolean r0 = r2.getBoolean(r1)
            r12 = 1
            if (r0 != 0) goto L_0x0043
        L_0x0042:
            r12 = 0
        L_0x0043:
            r5 = 2
            if (r15 != r5) goto L_0x008b
            java.lang.String r1 = "description"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x008b
            java.lang.String r9 = r2.getString(r1)
        L_0x0052:
            java.lang.String r1 = "chat_support"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x008f
            org.json.JSONObject r6 = r2.getJSONObject(r1)
            java.lang.String r0 = "auth_required"
            boolean r5 = r6.getBoolean(r0)
            java.lang.String r1 = "required_data"
            boolean r0 = r6.has(r1)
            if (r0 == 0) goto L_0x0085
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            org.json.JSONArray r6 = r6.getJSONArray(r1)
            r1 = 0
        L_0x0075:
            int r0 = r6.length()
            if (r1 >= r0) goto L_0x0091
            java.lang.String r0 = r6.getString(r1)
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x0075
        L_0x0085:
            X.4jD r6 = new X.4jD
            r6.<init>(r10, r5)
            goto L_0x0096
        L_0x008b:
            r9 = r10
            if (r15 != r5) goto L_0x008f
            goto L_0x0052
        L_0x008f:
            r6 = r10
            goto L_0x0096
        L_0x0091:
            X.4jD r6 = new X.4jD
            r6.<init>(r2, r5)
        L_0x0096:
            X.3CN r5 = new X.3CN
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r4.add(r5)
            int r3 = r3 + 1
            goto L_0x000d
        L_0x00a2:
            r11 = r10
            goto L_0x0033
        L_0x00a4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5o4.A0B(org.json.JSONArray, int):java.util.ArrayList");
    }
}
