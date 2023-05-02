package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONException;

/* renamed from: X.2ed  reason: invalid class name and case insensitive filesystem */
public class C52902ed implements C52852eY {
    public final C18180wH A00;

    public C52902ed(C18180wH r1) {
        this.A00 = r1;
    }

    public void AaR(Context context, C16740tZ r5, C16880tn r6, int i2) {
        C35191lW r0 = r6.A03;
        if (r0 != null) {
            List list = r0.A00;
            if (list.size() > i2 && (context instanceof Activity)) {
                try {
                    this.A00.A02(C19980zJ.A00(context), r5, ((C35181lV) list.get(i2)).A01);
                } catch (JSONException unused) {
                    Log.e("NativeFlowAction/perform : ConversationRow exception processing NFM message");
                }
            }
        }
    }
}
