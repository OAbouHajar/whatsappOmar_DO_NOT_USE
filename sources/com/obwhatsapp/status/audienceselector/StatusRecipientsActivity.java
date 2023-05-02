package com.obwhatsapp.status.audienceselector;

import X.AnonymousClass11G;
import X.AnonymousClass1L1;
import X.AnonymousClass4Y7;
import X.C16620tM;
import X.C19000xb;
import X.C49342So;
import X.C49352Sp;
import android.os.Bundle;
import com.obwhatsapp.yo.yo;
import java.util.Set;

public class StatusRecipientsActivity extends C49342So {
    public C49352Sp A00;
    public C19000xb A01;
    public AnonymousClass11G A02;
    public AnonymousClass1L1 A03;

    public void A37() {
        super.A37();
        if (this.A0C.A0E(C16620tM.A01, 815) && !this.A0K) {
            Set set = this.A0T;
            if (set.size() == 0 && this.A02.getVisibility() == 0) {
                AnonymousClass4Y7.A01(this.A02, false, true);
            } else if (set.size() != 0 && this.A02.getVisibility() == 4) {
                AnonymousClass4Y7.A01(this.A02, true, true);
            }
        }
    }

    public boolean A39() {
        if (!this.A0C.A0E(C16620tM.A01, 2611) || !this.A0K || this.A0T.size() != this.A0J.size()) {
            return false;
        }
        this.A05.A0H("You cannot exclude everyone", 1);
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        yo.ArchivedChats(this);
    }
}
