package X;

import com.obwhatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;

/* renamed from: X.3EI  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3EI implements AnonymousClass5OA {
    public final /* synthetic */ DirectorySetLocationMapActivity A00;

    public /* synthetic */ AnonymousClass3EI(DirectorySetLocationMapActivity directorySetLocationMapActivity) {
        this.A00 = directorySetLocationMapActivity;
    }

    public final void AO1() {
        DirectorySetLocationMapActivity directorySetLocationMapActivity = this.A00;
        if (directorySetLocationMapActivity.A09.A01.getVisibility() == 0) {
            directorySetLocationMapActivity.A09.A01.setVisibility(8);
            directorySetLocationMapActivity.A09.A02.startAnimation(C13680ns.A0I(-directorySetLocationMapActivity.A09.A01.getHeight()));
        }
        AnonymousClass2NT r1 = directorySetLocationMapActivity.A01;
        AnonymousClass00B.A07(r1, "DirectorySetLocationMapActivity/setUpMap map is not available");
        directorySetLocationMapActivity.A09.A09 = Double.valueOf(r1.A02().A03.A00);
        directorySetLocationMapActivity.A09.A0A = Double.valueOf(directorySetLocationMapActivity.A01.A02().A03.A01);
        directorySetLocationMapActivity.A09.A0B = Float.valueOf(directorySetLocationMapActivity.A01.A02().A02);
        if (directorySetLocationMapActivity.A09.A0G) {
            directorySetLocationMapActivity.A38();
            return;
        }
        AnonymousClass26B A002 = directorySetLocationMapActivity.A07.A00();
        if (A002 == null) {
            A002 = directorySetLocationMapActivity.A08.A00();
        }
        AnonymousClass2R7 r12 = directorySetLocationMapActivity.A09;
        String str = A002.A07;
        AnonymousClass00B.A06(str);
        r12.A03(str);
        AnonymousClass2R7 r13 = directorySetLocationMapActivity.A09;
        r13.A08 = A002;
        r13.A0G = true;
    }
}
