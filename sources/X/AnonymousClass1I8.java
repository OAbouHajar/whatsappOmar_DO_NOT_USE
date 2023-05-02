package X;

import com.squareup.picasso.BuildConfig;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* renamed from: X.1I8  reason: invalid class name */
public class AnonymousClass1I8 {
    public final List A00;

    public AnonymousClass1I8() {
        try {
            this.A00 = Collections.unmodifiableList(Arrays.asList(new C47192Hy[]{new C47192Hy(new AnonymousClass2I4(new AnonymousClass2I2("android", "platform"), new AnonymousClass2I2(BuildConfig.BUILD_TYPE, "release_channel")), Arrays.asList(new C47202Hz[]{new C47202Hz(Arrays.asList(new AnonymousClass2I0[]{new AnonymousClass2I0("control", Arrays.asList(new AnonymousClass2I1[]{new AnonymousClass2I1(Boolean.FALSE)})), new AnonymousClass2I0("test", Arrays.asList(new AnonymousClass2I1[]{new AnonymousClass2I1(Boolean.TRUE)}))}))}))}));
        } catch (JSONException e2) {
            StringBuilder sb = new StringBuilder("ABConfig/invalid json format for ab property from code gen:");
            sb.append(e2.toString());
            Log.w(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ABConfig/invalid json format for ab property from code gen:");
            sb2.append(e2.toString());
            throw new RuntimeException(sb2.toString());
        }
    }
}
