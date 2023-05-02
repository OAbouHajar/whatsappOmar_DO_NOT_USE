package com.facebook.redex;

import X.AnonymousClass050;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14750ph;
import X.C55862kX;
import X.C59162ux;
import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.backup.google.PromptDialogFragment;
import com.obwhatsapp.backup.google.RestoreFromBackupActivity;
import com.obwhatsapp.migration.export.ui.ExportMigrationActivity;
import com.obwhatsapp.text.SeeMoreTextView;

public class IDxCSpanShape14S0100000_2_I1 extends ClickableSpan {
    public Object A00;
    public final int A01;

    public IDxCSpanShape14S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onClick(View view) {
        switch (this.A01) {
            case 0:
                Intent A02 = C13700nu.A02("android.settings.DATE_SETTINGS");
                C59162ux r0 = (C59162ux) this.A00;
                r0.A00.A06(r0.A01, A02);
                return;
            case 1:
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A00;
                C55862kX r1 = new C55862kX(16);
                r1.A02(restoreFromBackupActivity.getString(R.string.str09a1));
                r1.A07(false);
                r1.A05(restoreFromBackupActivity.getString(R.string.str0e87));
                r1.A03(restoreFromBackupActivity.getString(R.string.str1da7));
                PromptDialogFragment A002 = r1.A00();
                if (!restoreFromBackupActivity.A3V()) {
                    AnonymousClass050 A0O = C13680ns.A0O(restoreFromBackupActivity);
                    A0O.A0C(A002, "one-time-setup-taking-too-long");
                    A0O.A02();
                    return;
                }
                return;
            case 2:
                ExportMigrationActivity exportMigrationActivity = (ExportMigrationActivity) this.A00;
                exportMigrationActivity.A0I.A00(exportMigrationActivity.A0J, 2);
                exportMigrationActivity.A00.A06(exportMigrationActivity, C14750ph.A00(exportMigrationActivity));
                return;
            default:
                SeeMoreTextView seeMoreTextView = (SeeMoreTextView) this.A00;
                if (!seeMoreTextView.A03) {
                    seeMoreTextView.A03 = true;
                    seeMoreTextView.setText(seeMoreTextView.A01);
                    return;
                }
                return;
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        if (2 - this.A01 != 0) {
            super.updateDrawState(textPaint);
            return;
        }
        textPaint.setUnderlineText(false);
        C13690nt.A0r((Context) this.A00, textPaint, R.color.color04f8);
    }
}
