package X;

import android.os.Build;
import android.view.View;
import android.view.Window;
import com.obwhatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet;

/* renamed from: X.3be  reason: invalid class name and case insensitive filesystem */
public class C67463be extends C54882iQ {
    public final /* synthetic */ GroupCallParticipantPickerSheet A00;

    public C67463be(GroupCallParticipantPickerSheet groupCallParticipantPickerSheet) {
        this.A00 = groupCallParticipantPickerSheet;
    }

    public void A01(View view, float f2) {
        GroupCallParticipantPickerSheet groupCallParticipantPickerSheet = this.A00;
        groupCallParticipantPickerSheet.A02.setColor(((int) (((groupCallParticipantPickerSheet.A01 - ((float) view.getTop())) / groupCallParticipantPickerSheet.A00) * 127.0f)) << 24);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = groupCallParticipantPickerSheet.getWindow();
        }
    }

    public void A02(View view, int i2) {
        if (i2 == 5) {
            AnonymousClass3K4.A0j(this.A00);
        }
    }
}
