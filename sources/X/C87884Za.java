package X;

import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;

/* renamed from: X.4Za  reason: invalid class name and case insensitive filesystem */
public class C87884Za {
    public AnonymousClass4CO A00;
    public String A01;

    public static C85424Oj A00(String str) {
        AnonymousClass4CN r0;
        try {
            C90154da.A00();
            C99244ti r02 = new C99244ti(new JsonReader(new StringReader(str)));
            r02.ALo();
            AnonymousClass4CO A002 = AnonymousClass383.A00(r02);
            if (A002 != null && (r0 = A002.A00) != null) {
                return r0.A00;
            }
            throw AnonymousClass000.A0T("Encountered empty BloksResponse. Could not parse embedded payload");
        } catch (IOException unused) {
            throw AnonymousClass000.A0T("Could not parse embedded payload");
        }
    }
}
