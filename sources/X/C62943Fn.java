package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.3Fn  reason: invalid class name and case insensitive filesystem */
public final class C62943Fn implements C448025p {
    public final /* synthetic */ AnonymousClass236 A00;
    public final /* synthetic */ AnonymousClass16E A01;
    public final /* synthetic */ UserJid A02;

    public C62943Fn(AnonymousClass236 r1, AnonymousClass16E r2, UserJid userJid) {
        this.A01 = r2;
        this.A02 = userJid;
        this.A00 = r1;
    }

    public void A5s(AnonymousClass2JT r13) {
        C18450wi.A0H(r13, 0);
        if (r13.A00 == 0) {
            AnonymousClass14O r0 = r13.A02;
            C18450wi.A0B(r0);
            Iterable iterable = (Iterable) r0.A00;
            if (iterable == null) {
                AnonymousClass236 r02 = this.A00;
                if (r02 != null) {
                    r02.ALZ((AnonymousClass239) null);
                    return;
                }
                return;
            }
            ArrayList A0N = AnonymousClass1J9.A0N(iterable);
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                A0N.add(AnonymousClass237.A00(C13700nu.A0K(AnonymousClass000.A0m(it))));
            }
            AnonymousClass239 r6 = new AnonymousClass239(A0N);
            AnonymousClass16E r4 = this.A01;
            C15860rz r7 = r4.A04;
            UserJid userJid = this.A02;
            String rawString = userJid.getRawString();
            JSONArray jSONArray = new JSONArray();
            for (AnonymousClass238 r10 : r6.A00) {
                C18450wi.A0H(r10, 0);
                JSONObject A0J = C13700nu.A0J();
                A0J.put("flow_id", r10.A03);
                A0J.put("flow_message_version", r10.A00);
                A0J.put("data_api_version", r10.A02);
                A0J.put("state", r10.A01);
                A0J.put("flow_version_ids", r10.A04);
                jSONArray.put(A0J);
            }
            JSONObject A0J2 = C13700nu.A0J();
            A0J2.put("extensionIdLinks", jSONArray);
            C13680ns.A0y(r7.A0K(), C13680ns.A0h("extensions_metadata_", rawString), A0J2.toString());
            C13680ns.A0x(r7.A0K(), C13680ns.A0h("extensions_metadata_timestamp_", userJid.getRawString()), System.currentTimeMillis() + (((long) r4.A06.A03(C16620tM.A02, 2891)) * 60000));
            AnonymousClass236 r03 = this.A00;
            if (r03 != null) {
                r03.ALZ(r6);
                return;
            }
            return;
        }
        AnonymousClass236 r04 = this.A00;
        if (r04 != null) {
            r04.ALZ((AnonymousClass239) null);
        }
        this.A01.A00.AcB("extensions-metadata-failed", "", true);
        Log.w("ExtensionsConnectionManager/extensionsMetaDataRequest/callbackResponse/ response is not success");
    }

    public void APZ(IOException iOException) {
        C18450wi.A0H(iOException, 0);
        AnonymousClass236 r1 = this.A00;
        if (r1 != null) {
            r1.ALZ((AnonymousClass239) null);
        }
        this.A01.A00.AcB("extensions-metadata-failed", "", true);
        StringBuilder A0r = AnonymousClass000.A0r("ExtensionsConnectionManager/extensionsMetaDataRequest/onDeliveryFailure/");
        A0r.append(iOException);
        Log.w(AnonymousClass000.A0h(".message", A0r));
    }

    public void AQa(Exception exc) {
        C18450wi.A0H(exc, 0);
        AnonymousClass236 r1 = this.A00;
        if (r1 != null) {
            r1.ALZ((AnonymousClass239) null);
        }
        this.A01.A00.AcB("extensions-metadata-failed", "", true);
        StringBuilder A0r = AnonymousClass000.A0r("ExtensionsConnectionManager/extensionsMetaDataRequest/onError/");
        A0r.append(exc);
        Log.w(AnonymousClass000.A0h(".message", A0r));
    }
}
