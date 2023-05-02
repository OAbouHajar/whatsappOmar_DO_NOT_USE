package com.obwhatsapp.base;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass01J;
import X.AnonymousClass01V;
import X.AnonymousClass01Y;
import X.AnonymousClass01Z;
import X.AnonymousClass04o;
import X.AnonymousClass10Y;
import X.AnonymousClass11A;
import X.AnonymousClass11G;
import X.AnonymousClass122;
import X.AnonymousClass124;
import X.AnonymousClass127;
import X.AnonymousClass15U;
import X.AnonymousClass15X;
import X.AnonymousClass16S;
import X.AnonymousClass18G;
import X.AnonymousClass192;
import X.AnonymousClass1A9;
import X.AnonymousClass1BQ;
import X.AnonymousClass1BZ;
import X.AnonymousClass1CX;
import X.AnonymousClass1D0;
import X.AnonymousClass1G1;
import X.AnonymousClass1L1;
import X.AnonymousClass1L6;
import X.AnonymousClass1PX;
import X.AnonymousClass1RS;
import X.AnonymousClass1SP;
import X.AnonymousClass2TA;
import X.C14710pd;
import X.C14760pi;
import X.C14770pj;
import X.C14860ps;
import X.C14870pt;
import X.C15480r5;
import X.C15810rt;
import X.C15860rz;
import X.C15900s5;
import X.C16000sG;
import X.C16040sK;
import X.C16070sO;
import X.C16080sP;
import X.C16150sX;
import X.C16180sb;
import X.C16220sf;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C16490t9;
import X.C16500tA;
import X.C16760tb;
import X.C17020u3;
import X.C17050uS;
import X.C17060uT;
import X.C17070uU;
import X.C17080uV;
import X.C17090uW;
import X.C17110uY;
import X.C17130ua;
import X.C17190ug;
import X.C17220uj;
import X.C17230uk;
import X.C17240ul;
import X.C17250um;
import X.C18260wP;
import X.C18890xQ;
import X.C18900xR;
import X.C18910xS;
import X.C18930xU;
import X.C19000xb;
import X.C19110xm;
import X.C19410yO;
import X.C19430yQ;
import X.C19710ys;
import X.C19760yx;
import X.C19980zJ;
import X.C204310c;
import X.C206711d;
import X.C212613k;
import X.C23061Ai;
import X.C24961Hy;
import X.C25841Li;
import X.C25861Lk;
import X.C25931Lr;
import X.C25951Lt;
import X.C26141Mm;
import X.C26801Pf;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.DialogFragment;
import com.obwhatsapp.CallConfirmationFragment;
import com.obwhatsapp.DisplayExceptionDialogFactory$ClockWrongDialogFragment;
import com.obwhatsapp.DisplayExceptionDialogFactory$CompanionModeIncorrectAccessFragment;
import com.obwhatsapp.DisplayExceptionDialogFactory$ContactBlockedDialogFragment;
import com.obwhatsapp.DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment;
import com.obwhatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment;
import com.obwhatsapp.DisplayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment;
import com.obwhatsapp.DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment;
import com.obwhatsapp.Hilt_BaseMessageDialogFragment;
import com.obwhatsapp.Hilt_CallConfirmationFragment;
import com.obwhatsapp.Hilt_DisplayExceptionDialogFactory_ClockWrongDialogFragment;
import com.obwhatsapp.Hilt_DisplayExceptionDialogFactory_CompanionModeIncorrectAccessFragment;
import com.obwhatsapp.Hilt_DisplayExceptionDialogFactory_ContactBlockedDialogFragment;
import com.obwhatsapp.Hilt_DisplayExceptionDialogFactory_DoNotShareCodeDialogFragment;
import com.obwhatsapp.Hilt_DisplayExceptionDialogFactory_LoginFailedDialogFragment;
import com.obwhatsapp.Hilt_DisplayExceptionDialogFactory_SoftwareAboutToExpireDialogFragment;
import com.obwhatsapp.Hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment;
import com.obwhatsapp.Hilt_DisplayExceptionDialogFactory_UnsupportedDeviceDialogFragment;
import com.obwhatsapp.Hilt_LegacyMessageDialogFragment;
import com.obwhatsapp.Hilt_MuteDialogFragment;
import com.obwhatsapp.Hilt_SuspiciousLinkWarningDialogFragment;
import com.obwhatsapp.LegacyMessageDialogFragment;
import com.obwhatsapp.MuteDialogFragment;
import com.obwhatsapp.authentication.Hilt_VerifyTwoFactorAuthCodeDialogFragment;
import com.obwhatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment;
import com.obwhatsapp.backup.google.Hilt_PromptDialogFragment;
import com.obwhatsapp.backup.google.Hilt_SettingsGoogleDrive_AuthRequestDialogFragment;
import com.obwhatsapp.backup.google.Hilt_SingleChoiceListDialogFragment;
import com.obwhatsapp.backup.google.PromptDialogFragment;
import com.obwhatsapp.backup.google.SingleChoiceListDialogFragment;
import com.obwhatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment;
import com.obwhatsapp.blockbusiness.blockreasonlist.Hilt_BlockReasonListFragment;
import com.obwhatsapp.blocklist.BlockConfirmationDialogFragment;
import com.obwhatsapp.blocklist.Hilt_BlockConfirmationDialogFragment;
import com.obwhatsapp.businessdirectory.view.custom.ClearLocationDialogFragment;
import com.obwhatsapp.businessdirectory.view.custom.Hilt_ClearLocationDialogFragment;
import com.obwhatsapp.calling.callhistory.CallsHistoryFragment;
import com.obwhatsapp.calling.callhistory.Hilt_CallsHistoryFragment_ClearCallLogDialogFragment;
import com.obwhatsapp.calling.callhistory.view.CallsHistoryClearCallLogDialogFragment;
import com.obwhatsapp.calling.callhistory.view.Hilt_CallsHistoryClearCallLogDialogFragment;
import com.obwhatsapp.calling.spam.CallSpamActivity;
import com.obwhatsapp.calling.spam.Hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment;
import com.obwhatsapp.calling.videoparticipant.Hilt_MaximizedParticipantVideoDialogFragment;
import com.obwhatsapp.calling.videoparticipant.MaximizedParticipantVideoDialogFragment;
import com.obwhatsapp.calling.views.Hilt_JoinableEducationDialogFragment;
import com.obwhatsapp.calling.views.Hilt_VoipContactPickerDialogFragment;
import com.obwhatsapp.chatinfo.Hilt_ViewPhotoOrStatusDialogFragment;
import com.obwhatsapp.community.CommunityExitDialogFragment;
import com.obwhatsapp.community.Hilt_CommunityExitDialogFragment;
import com.obwhatsapp.community.deactivate.DeactivateCommunityConfirmationFragment;
import com.obwhatsapp.community.deactivate.Hilt_DeactivateCommunityConfirmationFragment;
import com.obwhatsapp.communitysuspend.CommunitySuspendDialogFragment;
import com.obwhatsapp.communitysuspend.Hilt_CommunitySuspendDialogFragment;
import com.obwhatsapp.companiondevice.Hilt_LinkedDevicesDetailDialogFragment;
import com.obwhatsapp.companiondevice.Hilt_WifiSpeedBumpDialogFragment;
import com.obwhatsapp.companiondevice.LinkedDevicesDetailDialogFragment;
import com.obwhatsapp.contact.picker.BaseSharedPreviewDialogFragment;
import com.obwhatsapp.contact.picker.Hilt_BaseSharedPreviewDialogFragment;
import com.obwhatsapp.contact.picker.Hilt_PhoneNumberSelectionDialog;
import com.obwhatsapp.contact.picker.Hilt_SharedTextPreviewDialogFragment;
import com.obwhatsapp.contact.picker.PhoneNumberSelectionDialog;
import com.obwhatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.obwhatsapp.conversation.Hilt_CapturePictureOrVideoDialogFragment;
import com.obwhatsapp.conversation.conversationrow.ChatWithBusinessInDirectoryDialogFragment;
import com.obwhatsapp.conversation.conversationrow.ConversationRow$ConversationRowDialogFragment;
import com.obwhatsapp.conversation.conversationrow.ConversationRowContact$MessageSharedContactDialogFragment;
import com.obwhatsapp.conversation.conversationrow.Hilt_ChatWithBusinessInDirectoryDialogFragment;
import com.obwhatsapp.conversation.conversationrow.Hilt_ConversationRowContact_MessageSharedContactDialogFragment;
import com.obwhatsapp.conversation.conversationrow.Hilt_ConversationRow_ConversationRowDialogFragment;
import com.obwhatsapp.conversation.conversationrow.googlesearch.GoogleSearchDialogFragment;
import com.obwhatsapp.conversation.conversationrow.googlesearch.Hilt_GoogleSearchDialogFragment;
import com.obwhatsapp.conversationslist.Hilt_LeaveGroupsDialogFragment;
import com.obwhatsapp.conversationslist.LeaveGroupsDialogFragment;
import com.obwhatsapp.dialogs.Hilt_ProgressDialogFragment;
import com.obwhatsapp.documentpicker.DocumentPickerActivity;
import com.obwhatsapp.documentpicker.Hilt_DocumentPickerActivity_SendDocumentsConfirmationDialogFragment;
import com.obwhatsapp.ephemeral.EphemeralNUXDialog;
import com.obwhatsapp.ephemeral.Hilt_EphemeralNUXDialog;
import com.obwhatsapp.ephemeral.Hilt_ViewOnceNUXDialog;
import com.obwhatsapp.ephemeral.ViewOnceNUXDialog;
import com.obwhatsapp.group.GroupSettingsLayoutV1$AdminSettingsDialogFragment;
import com.obwhatsapp.group.Hilt_GroupSettingMembershipApprovalRowV1_MembershipApprovalModeDialogFragment;
import com.obwhatsapp.group.Hilt_GroupSettingsLayoutV1_AdminSettingsDialogFragment;
import com.obwhatsapp.group.Hilt_GroupSettingsLayoutV1_EditGroupInfoDialogFragment;
import com.obwhatsapp.group.Hilt_GroupSettingsLayoutV1_RestrictFrequentlyForwardedDialogFragment;
import com.obwhatsapp.group.Hilt_GroupSettingsLayoutV1_SendMessagesDialogFragment;
import com.obwhatsapp.invites.Hilt_PromptSendGroupInviteDialogFragment;
import com.obwhatsapp.invites.PromptSendGroupInviteDialogFragment;
import com.obwhatsapp.location.Hilt_StopLiveLocationDialogFragment;
import com.obwhatsapp.location.StopLiveLocationDialogFragment;
import com.obwhatsapp.picker.search.GifSearchDialogFragment;
import com.obwhatsapp.picker.search.Hilt_GifSearchDialogFragment;
import com.obwhatsapp.picker.search.Hilt_PickerSearchDialogFragment;
import com.obwhatsapp.picker.search.Hilt_StickerSearchDialogFragment;
import com.obwhatsapp.picker.search.StickerSearchDialogFragment;
import com.obwhatsapp.picker.searchexpressions.ExpressionsSearchDialogFragment;
import com.obwhatsapp.picker.searchexpressions.Hilt_ExpressionsSearchDialogFragment;
import com.obwhatsapp.qrcode.contactqr.Hilt_ErrorDialogFragment;
import com.obwhatsapp.qrcode.contactqr.Hilt_WebCodeDialogFragment;
import com.obwhatsapp.qrcode.contactqr.WebCodeDialogFragment;
import com.obwhatsapp.registration.Hilt_SelectPhoneNumberDialog;
import com.obwhatsapp.registration.Hilt_VerifyTwoFactorAuth_ConfirmResetCode;
import com.obwhatsapp.registration.SelectPhoneNumberDialog;
import com.obwhatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment;
import com.obwhatsapp.registration.accountdefence.ui.Hilt_DeviceConfirmationRegAlertDialogFragment;
import com.obwhatsapp.settings.Hilt_MultiSelectionDialogFragment;
import com.obwhatsapp.settings.Hilt_SettingsCompanionLogoutDialog;
import com.obwhatsapp.settings.SettingsCompanionLogoutDialog;
import com.obwhatsapp.status.playback.fragment.Hilt_OpenLinkConfirmationDialogFragment;
import com.obwhatsapp.status.playback.fragment.Hilt_OpenLinkDialogFragment;
import com.obwhatsapp.status.playback.fragment.OpenLinkDialogFragment;
import com.obwhatsapp.status.posting.FirstStatusConfirmationDialogFragment;
import com.obwhatsapp.status.posting.Hilt_FirstStatusConfirmationDialogFragment;
import com.obwhatsapp.storage.Hilt_StorageUsageDeleteCompleteDialogFragment;
import com.obwhatsapp.storage.Hilt_StorageUsageDeleteMessagesDialogFragment;
import com.obwhatsapp.storage.StorageUsageDeleteCompleteDialogFragment;
import com.obwhatsapp.storage.StorageUsageDeleteMessagesDialogFragment;
import com.obwhatsapp.twofactor.Hilt_SetEmailFragment_ConfirmSkipEmailDialog;
import com.obwhatsapp.twofactor.Hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog;
import com.whatsapp.stickers.Hilt_StarOrRemoveFromRecentsStickerDialogFragment;
import com.whatsapp.stickers.Hilt_StarStickerFromPickerDialogFragment;
import com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment;
import com.whatsapp.stickers.StarStickerFromPickerDialogFragment;
import com.whatsapp.stickers.picker.pages.Hilt_ThirdPartyPackPage_StickerBlockedDialogFragment;
import com.whatsapp.stickers.thirdparty.AddThirdPartyStickerPackActivity;
import com.whatsapp.stickers.thirdparty.Hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment;
import com.whatsapp.util.DocumentWarningDialogFragment;
import com.whatsapp.util.Hilt_DocumentWarningDialogFragment;
import com.whatsapp.voipcalling.Hilt_VoipActivityV2_MessageDialogFragment;
import com.whatsapp.voipcalling.Hilt_VoipActivityV2_ReplyWithMessageDialogFragment;
import com.whatsapp.voipcalling.Hilt_VoipErrorDialogFragment;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;

public abstract class Hilt_WaDialogFragment extends DialogFragment implements AnonymousClass006 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = new Object();
    public volatile C54442hW A04;

    private void A01() {
        if (this.A00 == null) {
            this.A00 = new C54452hX(super.A0u(), (AnonymousClass01A) this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A01();
        return this.A00;
    }

    public LayoutInflater A0v(Bundle bundle) {
        LayoutInflater A0v = super.A0v(bundle);
        return A0v.cloneInContext(new C54452hX(A0v, (AnonymousClass01A) this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (X.C54442hW.A00(r0) == r4) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0y(android.app.Activity r4) {
        /*
            r3 = this;
            r0 = 1
            r3.A0V = r0
            android.content.ContextWrapper r0 = r3.A00
            r1 = 0
            if (r0 == 0) goto L_0x000f
            android.content.Context r0 = X.C54442hW.A00(r0)
            r2 = 0
            if (r0 != r4) goto L_0x0010
        L_0x000f:
            r2 = 1
        L_0x0010:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "onAttach called multiple times with different Context! Hilt Fragments should not be retained."
            X.C52772eQ.A00(r0, r1, r2)
            r3.A01()
            r3.A1J()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.base.Hilt_WaDialogFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A01();
        A1J();
    }

    public void A1J() {
        if (this instanceof Hilt_VoipErrorDialogFragment) {
            Hilt_VoipErrorDialogFragment hilt_VoipErrorDialogFragment = (Hilt_VoipErrorDialogFragment) this;
            if (!hilt_VoipErrorDialogFragment.A02) {
                hilt_VoipErrorDialogFragment.A02 = true;
                VoipErrorDialogFragment voipErrorDialogFragment = (VoipErrorDialogFragment) hilt_VoipErrorDialogFragment;
                C16150sX r2 = ((C17050uS) ((C17060uT) hilt_VoipErrorDialogFragment.generatedComponent())).A0b;
                voipErrorDialogFragment.A01 = (C17070uU) r2.ABg.get();
                voipErrorDialogFragment.A03 = (C17080uV) r2.APK.get();
                voipErrorDialogFragment.A04 = (C14710pd) r2.A05.get();
                voipErrorDialogFragment.A02 = (AnonymousClass013) r2.AR8.get();
                voipErrorDialogFragment.A02 = (C15900s5) r2.ALm.get();
                voipErrorDialogFragment.A04 = (C16000sG) r2.A4x.get();
                voipErrorDialogFragment.A05 = (C16080sP) r2.AQ9.get();
            }
        } else if (this instanceof Hilt_VoipActivityV2_ReplyWithMessageDialogFragment) {
            Hilt_VoipActivityV2_ReplyWithMessageDialogFragment hilt_VoipActivityV2_ReplyWithMessageDialogFragment = (Hilt_VoipActivityV2_ReplyWithMessageDialogFragment) this;
            if (!hilt_VoipActivityV2_ReplyWithMessageDialogFragment.A02) {
                hilt_VoipActivityV2_ReplyWithMessageDialogFragment.A02 = true;
                VoipActivityV2.ReplyWithMessageDialogFragment replyWithMessageDialogFragment = (VoipActivityV2.ReplyWithMessageDialogFragment) hilt_VoipActivityV2_ReplyWithMessageDialogFragment;
                C16150sX r1 = ((C17050uS) ((C17060uT) hilt_VoipActivityV2_ReplyWithMessageDialogFragment.generatedComponent())).A0b;
                replyWithMessageDialogFragment.A01 = (C17070uU) r1.ABg.get();
                replyWithMessageDialogFragment.A03 = (C17080uV) r1.APK.get();
                replyWithMessageDialogFragment.A04 = (C14710pd) r1.A05.get();
                replyWithMessageDialogFragment.A02 = (AnonymousClass013) r1.AR8.get();
                replyWithMessageDialogFragment.A00 = (C16440t3) r1.AP2.get();
            }
        } else if (this instanceof Hilt_VoipActivityV2_MessageDialogFragment) {
            Hilt_VoipActivityV2_MessageDialogFragment hilt_VoipActivityV2_MessageDialogFragment = (Hilt_VoipActivityV2_MessageDialogFragment) this;
            if (!hilt_VoipActivityV2_MessageDialogFragment.A02) {
                hilt_VoipActivityV2_MessageDialogFragment.A02 = true;
                VoipActivityV2.MessageDialogFragment messageDialogFragment = (VoipActivityV2.MessageDialogFragment) hilt_VoipActivityV2_MessageDialogFragment;
                C16150sX r12 = ((C17050uS) ((C17060uT) hilt_VoipActivityV2_MessageDialogFragment.generatedComponent())).A0b;
                messageDialogFragment.A01 = (C17070uU) r12.ABg.get();
                messageDialogFragment.A03 = (C17080uV) r12.APK.get();
                messageDialogFragment.A04 = (C14710pd) r12.A05.get();
                messageDialogFragment.A02 = (AnonymousClass013) r12.AR8.get();
                messageDialogFragment.A00 = C16150sX.A0J(r12);
            }
        } else if (this instanceof Hilt_DocumentWarningDialogFragment) {
            Hilt_DocumentWarningDialogFragment hilt_DocumentWarningDialogFragment = (Hilt_DocumentWarningDialogFragment) this;
            if (!hilt_DocumentWarningDialogFragment.A02) {
                hilt_DocumentWarningDialogFragment.A02 = true;
                DocumentWarningDialogFragment documentWarningDialogFragment = (DocumentWarningDialogFragment) hilt_DocumentWarningDialogFragment;
                C16150sX r22 = ((C17050uS) ((C17060uT) hilt_DocumentWarningDialogFragment.generatedComponent())).A0b;
                documentWarningDialogFragment.A01 = (C17070uU) r22.ABg.get();
                documentWarningDialogFragment.A03 = (C17080uV) r22.APK.get();
                documentWarningDialogFragment.A04 = (C14710pd) r22.A05.get();
                documentWarningDialogFragment.A02 = (AnonymousClass013) r22.AR8.get();
                documentWarningDialogFragment.A02 = (C14870pt) r22.AB3.get();
                documentWarningDialogFragment.A01 = (C16300so) r22.A5p.get();
                documentWarningDialogFragment.A05 = (C16320sq) r22.ARB.get();
                documentWarningDialogFragment.A00 = (C19980zJ) r22.A0P.get();
                documentWarningDialogFragment.A03 = (C16460t6) r22.A5k.get();
                documentWarningDialogFragment.A04 = (C16500tA) r22.AMF.get();
            }
        } else if (this instanceof Hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog) {
            Hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog = (Hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog) this;
            if (!hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog.A02) {
                hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog.A02 = true;
                C16150sX r13 = ((C17050uS) ((C17060uT) hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog.generatedComponent())).A0b;
                hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog.A01 = (C17070uU) r13.ABg.get();
                hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog.A03 = (C17080uV) r13.APK.get();
                hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog.A04 = (C14710pd) r13.A05.get();
                hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog.A02 = (AnonymousClass013) r13.AR8.get();
            }
        } else if (this instanceof Hilt_SetEmailFragment_ConfirmSkipEmailDialog) {
            Hilt_SetEmailFragment_ConfirmSkipEmailDialog hilt_SetEmailFragment_ConfirmSkipEmailDialog = (Hilt_SetEmailFragment_ConfirmSkipEmailDialog) this;
            if (!hilt_SetEmailFragment_ConfirmSkipEmailDialog.A02) {
                hilt_SetEmailFragment_ConfirmSkipEmailDialog.A02 = true;
                C16150sX r14 = ((C17050uS) ((C17060uT) hilt_SetEmailFragment_ConfirmSkipEmailDialog.generatedComponent())).A0b;
                hilt_SetEmailFragment_ConfirmSkipEmailDialog.A01 = (C17070uU) r14.ABg.get();
                hilt_SetEmailFragment_ConfirmSkipEmailDialog.A03 = (C17080uV) r14.APK.get();
                hilt_SetEmailFragment_ConfirmSkipEmailDialog.A04 = (C14710pd) r14.A05.get();
                hilt_SetEmailFragment_ConfirmSkipEmailDialog.A02 = (AnonymousClass013) r14.AR8.get();
            }
        } else if (this instanceof Hilt_StorageUsageDeleteMessagesDialogFragment) {
            Hilt_StorageUsageDeleteMessagesDialogFragment hilt_StorageUsageDeleteMessagesDialogFragment = (Hilt_StorageUsageDeleteMessagesDialogFragment) this;
            if (!hilt_StorageUsageDeleteMessagesDialogFragment.A02) {
                hilt_StorageUsageDeleteMessagesDialogFragment.A02 = true;
                StorageUsageDeleteMessagesDialogFragment storageUsageDeleteMessagesDialogFragment = (StorageUsageDeleteMessagesDialogFragment) hilt_StorageUsageDeleteMessagesDialogFragment;
                C16150sX r15 = ((C17050uS) ((C17060uT) hilt_StorageUsageDeleteMessagesDialogFragment.generatedComponent())).A0b;
                storageUsageDeleteMessagesDialogFragment.A01 = (C17070uU) r15.ABg.get();
                storageUsageDeleteMessagesDialogFragment.A03 = (C17080uV) r15.APK.get();
                storageUsageDeleteMessagesDialogFragment.A04 = (C14710pd) r15.A05.get();
                storageUsageDeleteMessagesDialogFragment.A02 = (AnonymousClass013) r15.AR8.get();
                storageUsageDeleteMessagesDialogFragment.A02 = (C16320sq) r15.ARB.get();
                storageUsageDeleteMessagesDialogFragment.A00 = (C16760tb) r15.APV.get();
            }
        } else if (this instanceof Hilt_StorageUsageDeleteCompleteDialogFragment) {
            Hilt_StorageUsageDeleteCompleteDialogFragment hilt_StorageUsageDeleteCompleteDialogFragment = (Hilt_StorageUsageDeleteCompleteDialogFragment) this;
            if (!hilt_StorageUsageDeleteCompleteDialogFragment.A02) {
                hilt_StorageUsageDeleteCompleteDialogFragment.A02 = true;
                StorageUsageDeleteCompleteDialogFragment storageUsageDeleteCompleteDialogFragment = (StorageUsageDeleteCompleteDialogFragment) hilt_StorageUsageDeleteCompleteDialogFragment;
                C16150sX r16 = ((C17050uS) ((C17060uT) hilt_StorageUsageDeleteCompleteDialogFragment.generatedComponent())).A0b;
                storageUsageDeleteCompleteDialogFragment.A01 = (C17070uU) r16.ABg.get();
                storageUsageDeleteCompleteDialogFragment.A03 = (C17080uV) r16.APK.get();
                storageUsageDeleteCompleteDialogFragment.A04 = (C14710pd) r16.A05.get();
                storageUsageDeleteCompleteDialogFragment.A02 = (AnonymousClass013) r16.AR8.get();
                storageUsageDeleteCompleteDialogFragment.A00 = (C14870pt) r16.AB3.get();
            }
        } else if (this instanceof Hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment) {
            Hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment = (Hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment) this;
            if (!hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment.A02) {
                hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment.A02 = true;
                AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment = (AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment) hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment;
                C17050uS r23 = (C17050uS) ((C17060uT) hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment.generatedComponent());
                C16150sX r17 = r23.A0b;
                addStickerPackDialogFragment.A01 = (C17070uU) r17.ABg.get();
                addStickerPackDialogFragment.A03 = (C17080uV) r17.APK.get();
                addStickerPackDialogFragment.A04 = (C14710pd) r17.A05.get();
                addStickerPackDialogFragment.A02 = (AnonymousClass013) r17.AR8.get();
                addStickerPackDialogFragment.A00 = (C14870pt) r17.AB3.get();
                addStickerPackDialogFragment.A01 = r23.A0Y.A0f();
            }
        } else if (this instanceof Hilt_ThirdPartyPackPage_StickerBlockedDialogFragment) {
            Hilt_ThirdPartyPackPage_StickerBlockedDialogFragment hilt_ThirdPartyPackPage_StickerBlockedDialogFragment = (Hilt_ThirdPartyPackPage_StickerBlockedDialogFragment) this;
            if (!hilt_ThirdPartyPackPage_StickerBlockedDialogFragment.A02) {
                hilt_ThirdPartyPackPage_StickerBlockedDialogFragment.A02 = true;
                C16150sX r18 = ((C17050uS) ((C17060uT) hilt_ThirdPartyPackPage_StickerBlockedDialogFragment.generatedComponent())).A0b;
                hilt_ThirdPartyPackPage_StickerBlockedDialogFragment.A01 = (C17070uU) r18.ABg.get();
                hilt_ThirdPartyPackPage_StickerBlockedDialogFragment.A03 = (C17080uV) r18.APK.get();
                hilt_ThirdPartyPackPage_StickerBlockedDialogFragment.A04 = (C14710pd) r18.A05.get();
                hilt_ThirdPartyPackPage_StickerBlockedDialogFragment.A02 = (AnonymousClass013) r18.AR8.get();
            }
        } else if (this instanceof Hilt_StarStickerFromPickerDialogFragment) {
            Hilt_StarStickerFromPickerDialogFragment hilt_StarStickerFromPickerDialogFragment = (Hilt_StarStickerFromPickerDialogFragment) this;
            if (!hilt_StarStickerFromPickerDialogFragment.A02) {
                hilt_StarStickerFromPickerDialogFragment.A02 = true;
                StarStickerFromPickerDialogFragment starStickerFromPickerDialogFragment = (StarStickerFromPickerDialogFragment) hilt_StarStickerFromPickerDialogFragment;
                C16150sX r24 = ((C17050uS) ((C17060uT) hilt_StarStickerFromPickerDialogFragment.generatedComponent())).A0b;
                starStickerFromPickerDialogFragment.A01 = (C17070uU) r24.ABg.get();
                starStickerFromPickerDialogFragment.A03 = (C17080uV) r24.APK.get();
                starStickerFromPickerDialogFragment.A04 = (C14710pd) r24.A05.get();
                starStickerFromPickerDialogFragment.A02 = (AnonymousClass013) r24.AR8.get();
                starStickerFromPickerDialogFragment.A04 = (C16320sq) r24.ARB.get();
                starStickerFromPickerDialogFragment.A03 = (AnonymousClass1CX) r24.ANk.get();
                starStickerFromPickerDialogFragment.A00 = (AnonymousClass01Z) r24.AKu.get();
            }
        } else if (this instanceof Hilt_StarOrRemoveFromRecentsStickerDialogFragment) {
            Hilt_StarOrRemoveFromRecentsStickerDialogFragment hilt_StarOrRemoveFromRecentsStickerDialogFragment = (Hilt_StarOrRemoveFromRecentsStickerDialogFragment) this;
            if (!hilt_StarOrRemoveFromRecentsStickerDialogFragment.A02) {
                hilt_StarOrRemoveFromRecentsStickerDialogFragment.A02 = true;
                StarOrRemoveFromRecentsStickerDialogFragment starOrRemoveFromRecentsStickerDialogFragment = (StarOrRemoveFromRecentsStickerDialogFragment) hilt_StarOrRemoveFromRecentsStickerDialogFragment;
                C16150sX r25 = ((C17050uS) ((C17060uT) hilt_StarOrRemoveFromRecentsStickerDialogFragment.generatedComponent())).A0b;
                starOrRemoveFromRecentsStickerDialogFragment.A01 = (C17070uU) r25.ABg.get();
                starOrRemoveFromRecentsStickerDialogFragment.A03 = (C17080uV) r25.APK.get();
                starOrRemoveFromRecentsStickerDialogFragment.A04 = (C14710pd) r25.A05.get();
                starOrRemoveFromRecentsStickerDialogFragment.A02 = (AnonymousClass013) r25.AR8.get();
                starOrRemoveFromRecentsStickerDialogFragment.A02 = (C212613k) r25.AK2.get();
                starOrRemoveFromRecentsStickerDialogFragment.A01 = (C212613k) r25.AJf.get();
                starOrRemoveFromRecentsStickerDialogFragment.A05 = (C16320sq) r25.ARB.get();
                starOrRemoveFromRecentsStickerDialogFragment.A00 = (C18930xU) r25.AOL.get();
                starOrRemoveFromRecentsStickerDialogFragment.A04 = (AnonymousClass1CX) r25.ANk.get();
            }
        } else if (this instanceof Hilt_FirstStatusConfirmationDialogFragment) {
            Hilt_FirstStatusConfirmationDialogFragment hilt_FirstStatusConfirmationDialogFragment = (Hilt_FirstStatusConfirmationDialogFragment) this;
            if (!hilt_FirstStatusConfirmationDialogFragment.A02) {
                hilt_FirstStatusConfirmationDialogFragment.A02 = true;
                FirstStatusConfirmationDialogFragment firstStatusConfirmationDialogFragment = (FirstStatusConfirmationDialogFragment) hilt_FirstStatusConfirmationDialogFragment;
                C16150sX r19 = ((C17050uS) ((C17060uT) hilt_FirstStatusConfirmationDialogFragment.generatedComponent())).A0b;
                firstStatusConfirmationDialogFragment.A01 = (C17070uU) r19.ABg.get();
                firstStatusConfirmationDialogFragment.A03 = (C17080uV) r19.APK.get();
                firstStatusConfirmationDialogFragment.A04 = (C14710pd) r19.A05.get();
                firstStatusConfirmationDialogFragment.A02 = (AnonymousClass013) r19.AR8.get();
                firstStatusConfirmationDialogFragment.A02 = (AnonymousClass11G) r19.ANN.get();
                firstStatusConfirmationDialogFragment.A01 = (C19000xb) r19.AQX.get();
            }
        } else if (this instanceof Hilt_SettingsCompanionLogoutDialog) {
            Hilt_SettingsCompanionLogoutDialog hilt_SettingsCompanionLogoutDialog = (Hilt_SettingsCompanionLogoutDialog) this;
            if (!hilt_SettingsCompanionLogoutDialog.A02) {
                hilt_SettingsCompanionLogoutDialog.A02 = true;
                SettingsCompanionLogoutDialog settingsCompanionLogoutDialog = (SettingsCompanionLogoutDialog) hilt_SettingsCompanionLogoutDialog;
                C17050uS r3 = (C17050uS) ((C17060uT) hilt_SettingsCompanionLogoutDialog.generatedComponent());
                C16150sX r110 = r3.A0b;
                settingsCompanionLogoutDialog.A01 = (C17070uU) r110.ABg.get();
                settingsCompanionLogoutDialog.A03 = (C17080uV) r110.APK.get();
                settingsCompanionLogoutDialog.A04 = (C14710pd) r110.A05.get();
                settingsCompanionLogoutDialog.A02 = (AnonymousClass013) r110.AR8.get();
                settingsCompanionLogoutDialog.A00 = (C14870pt) r110.AB3.get();
                settingsCompanionLogoutDialog.A02 = (C16320sq) r110.ARB.get();
                settingsCompanionLogoutDialog.A01 = new C15480r5((C19110xm) r3.A0Y.A0E.get());
            }
        } else if (this instanceof Hilt_MultiSelectionDialogFragment) {
            Hilt_MultiSelectionDialogFragment hilt_MultiSelectionDialogFragment = (Hilt_MultiSelectionDialogFragment) this;
            if (!hilt_MultiSelectionDialogFragment.A02) {
                hilt_MultiSelectionDialogFragment.A02 = true;
                C16150sX r111 = ((C17050uS) ((C17060uT) hilt_MultiSelectionDialogFragment.generatedComponent())).A0b;
                hilt_MultiSelectionDialogFragment.A01 = (C17070uU) r111.ABg.get();
                hilt_MultiSelectionDialogFragment.A03 = (C17080uV) r111.APK.get();
                hilt_MultiSelectionDialogFragment.A04 = (C14710pd) r111.A05.get();
                hilt_MultiSelectionDialogFragment.A02 = (AnonymousClass013) r111.AR8.get();
            }
        } else if (this instanceof Hilt_DeviceConfirmationRegAlertDialogFragment) {
            Hilt_DeviceConfirmationRegAlertDialogFragment hilt_DeviceConfirmationRegAlertDialogFragment = (Hilt_DeviceConfirmationRegAlertDialogFragment) this;
            if (!hilt_DeviceConfirmationRegAlertDialogFragment.A02) {
                hilt_DeviceConfirmationRegAlertDialogFragment.A02 = true;
                DeviceConfirmationRegAlertDialogFragment deviceConfirmationRegAlertDialogFragment = (DeviceConfirmationRegAlertDialogFragment) hilt_DeviceConfirmationRegAlertDialogFragment;
                C16150sX r26 = ((C17050uS) ((C17060uT) hilt_DeviceConfirmationRegAlertDialogFragment.generatedComponent())).A0b;
                deviceConfirmationRegAlertDialogFragment.A01 = (C17070uU) r26.ABg.get();
                deviceConfirmationRegAlertDialogFragment.A03 = (C17080uV) r26.APK.get();
                deviceConfirmationRegAlertDialogFragment.A04 = (C14710pd) r26.A05.get();
                deviceConfirmationRegAlertDialogFragment.A02 = (AnonymousClass013) r26.AR8.get();
                deviceConfirmationRegAlertDialogFragment.A04 = (C16440t3) r26.AP2.get();
                deviceConfirmationRegAlertDialogFragment.A03 = (C16040sK) r26.ADr.get();
                deviceConfirmationRegAlertDialogFragment.A05 = (C17190ug) r26.AEu.get();
            }
        } else if (this instanceof Hilt_VerifyTwoFactorAuth_ConfirmResetCode) {
            Hilt_VerifyTwoFactorAuth_ConfirmResetCode hilt_VerifyTwoFactorAuth_ConfirmResetCode = (Hilt_VerifyTwoFactorAuth_ConfirmResetCode) this;
            if (!hilt_VerifyTwoFactorAuth_ConfirmResetCode.A02) {
                hilt_VerifyTwoFactorAuth_ConfirmResetCode.A02 = true;
                C16150sX r112 = ((C17050uS) ((C17060uT) hilt_VerifyTwoFactorAuth_ConfirmResetCode.generatedComponent())).A0b;
                hilt_VerifyTwoFactorAuth_ConfirmResetCode.A01 = (C17070uU) r112.ABg.get();
                hilt_VerifyTwoFactorAuth_ConfirmResetCode.A03 = (C17080uV) r112.APK.get();
                hilt_VerifyTwoFactorAuth_ConfirmResetCode.A04 = (C14710pd) r112.A05.get();
                hilt_VerifyTwoFactorAuth_ConfirmResetCode.A02 = (AnonymousClass013) r112.AR8.get();
            }
        } else if (this instanceof Hilt_SelectPhoneNumberDialog) {
            Hilt_SelectPhoneNumberDialog hilt_SelectPhoneNumberDialog = (Hilt_SelectPhoneNumberDialog) this;
            if (!hilt_SelectPhoneNumberDialog.A02) {
                hilt_SelectPhoneNumberDialog.A02 = true;
                SelectPhoneNumberDialog selectPhoneNumberDialog = (SelectPhoneNumberDialog) hilt_SelectPhoneNumberDialog;
                C16150sX r113 = ((C17050uS) ((C17060uT) hilt_SelectPhoneNumberDialog.generatedComponent())).A0b;
                selectPhoneNumberDialog.A01 = (C17070uU) r113.ABg.get();
                selectPhoneNumberDialog.A03 = (C17080uV) r113.APK.get();
                selectPhoneNumberDialog.A04 = (C14710pd) r113.A05.get();
                selectPhoneNumberDialog.A02 = (AnonymousClass013) r113.AR8.get();
                selectPhoneNumberDialog.A00 = (AnonymousClass1G1) r113.AJl.get();
            }
        } else if (this instanceof Hilt_WebCodeDialogFragment) {
            Hilt_WebCodeDialogFragment hilt_WebCodeDialogFragment = (Hilt_WebCodeDialogFragment) this;
            if (!hilt_WebCodeDialogFragment.A02) {
                hilt_WebCodeDialogFragment.A02 = true;
                WebCodeDialogFragment webCodeDialogFragment = (WebCodeDialogFragment) hilt_WebCodeDialogFragment;
                C16150sX r27 = ((C17050uS) ((C17060uT) hilt_WebCodeDialogFragment.generatedComponent())).A0b;
                webCodeDialogFragment.A01 = (C17070uU) r27.ABg.get();
                webCodeDialogFragment.A03 = (C17080uV) r27.APK.get();
                webCodeDialogFragment.A04 = (C14710pd) r27.A05.get();
                webCodeDialogFragment.A02 = (AnonymousClass013) r27.AR8.get();
                webCodeDialogFragment.A00 = (C15900s5) r27.ALm.get();
                webCodeDialogFragment.A02 = (AnonymousClass16S) r27.AFt.get();
                webCodeDialogFragment.A01 = (AnonymousClass15X) r27.AMk.get();
            }
        } else if (this instanceof Hilt_ErrorDialogFragment) {
            Hilt_ErrorDialogFragment hilt_ErrorDialogFragment = (Hilt_ErrorDialogFragment) this;
            if (!hilt_ErrorDialogFragment.A02) {
                hilt_ErrorDialogFragment.A02 = true;
                C16150sX r114 = ((C17050uS) ((C17060uT) hilt_ErrorDialogFragment.generatedComponent())).A0b;
                hilt_ErrorDialogFragment.A01 = (C17070uU) r114.ABg.get();
                hilt_ErrorDialogFragment.A03 = (C17080uV) r114.APK.get();
                hilt_ErrorDialogFragment.A04 = (C14710pd) r114.A05.get();
                hilt_ErrorDialogFragment.A02 = (AnonymousClass013) r114.AR8.get();
            }
        } else if (this instanceof Hilt_PickerSearchDialogFragment) {
            Hilt_PickerSearchDialogFragment hilt_PickerSearchDialogFragment = (Hilt_PickerSearchDialogFragment) this;
            if (hilt_PickerSearchDialogFragment instanceof Hilt_ExpressionsSearchDialogFragment) {
                Hilt_ExpressionsSearchDialogFragment hilt_ExpressionsSearchDialogFragment = (Hilt_ExpressionsSearchDialogFragment) hilt_PickerSearchDialogFragment;
                if (!hilt_ExpressionsSearchDialogFragment.A02) {
                    hilt_ExpressionsSearchDialogFragment.A02 = true;
                    ExpressionsSearchDialogFragment expressionsSearchDialogFragment = (ExpressionsSearchDialogFragment) hilt_ExpressionsSearchDialogFragment;
                    C16150sX r4 = ((C17050uS) ((C17060uT) hilt_ExpressionsSearchDialogFragment.generatedComponent())).A0b;
                    expressionsSearchDialogFragment.A01 = (C17070uU) r4.ABg.get();
                    expressionsSearchDialogFragment.A03 = (C17080uV) r4.APK.get();
                    AnonymousClass01J r32 = r4.A05;
                    expressionsSearchDialogFragment.A04 = (C14710pd) r32.get();
                    AnonymousClass01J r115 = r4.AR8;
                    expressionsSearchDialogFragment.A02 = (AnonymousClass013) r115.get();
                    expressionsSearchDialogFragment.A06 = (C14710pd) r32.get();
                    expressionsSearchDialogFragment.A02 = (C16040sK) r4.ADr.get();
                    expressionsSearchDialogFragment.A07 = (C16490t9) r4.AQz.get();
                    expressionsSearchDialogFragment.A09 = (C26141Mm) r4.A10.get();
                    expressionsSearchDialogFragment.A0A = (AnonymousClass18G) r4.ANS.get();
                    expressionsSearchDialogFragment.A05 = (AnonymousClass013) r115.get();
                }
            } else if (hilt_PickerSearchDialogFragment instanceof Hilt_StickerSearchDialogFragment) {
                Hilt_StickerSearchDialogFragment hilt_StickerSearchDialogFragment = (Hilt_StickerSearchDialogFragment) hilt_PickerSearchDialogFragment;
                if (!hilt_StickerSearchDialogFragment.A02) {
                    hilt_StickerSearchDialogFragment.A02 = true;
                    StickerSearchDialogFragment stickerSearchDialogFragment = (StickerSearchDialogFragment) hilt_StickerSearchDialogFragment;
                    C16150sX r116 = ((C17050uS) ((C17060uT) hilt_StickerSearchDialogFragment.generatedComponent())).A0b;
                    stickerSearchDialogFragment.A01 = (C17070uU) r116.ABg.get();
                    stickerSearchDialogFragment.A03 = (C17080uV) r116.APK.get();
                    stickerSearchDialogFragment.A04 = (C14710pd) r116.A05.get();
                    stickerSearchDialogFragment.A02 = (AnonymousClass013) r116.AR8.get();
                    stickerSearchDialogFragment.A07 = (C16490t9) r116.AQz.get();
                    stickerSearchDialogFragment.A0A = (C212613k) r116.AK2.get();
                    stickerSearchDialogFragment.A06 = (AnonymousClass1BQ) r116.A7f.get();
                    stickerSearchDialogFragment.A0C = (AnonymousClass18G) r116.ANS.get();
                }
            } else if (hilt_PickerSearchDialogFragment instanceof Hilt_GifSearchDialogFragment) {
                Hilt_GifSearchDialogFragment hilt_GifSearchDialogFragment = (Hilt_GifSearchDialogFragment) hilt_PickerSearchDialogFragment;
                if (!hilt_GifSearchDialogFragment.A02) {
                    hilt_GifSearchDialogFragment.A02 = true;
                    GifSearchDialogFragment gifSearchDialogFragment = (GifSearchDialogFragment) hilt_GifSearchDialogFragment;
                    C16150sX r117 = ((C17050uS) ((C17060uT) hilt_GifSearchDialogFragment.generatedComponent())).A0b;
                    gifSearchDialogFragment.A01 = (C17070uU) r117.ABg.get();
                    gifSearchDialogFragment.A03 = (C17080uV) r117.APK.get();
                    gifSearchDialogFragment.A04 = (C14710pd) r117.A05.get();
                    gifSearchDialogFragment.A02 = (AnonymousClass013) r117.AR8.get();
                    gifSearchDialogFragment.A03 = (C25841Li) r117.AB1.get();
                    gifSearchDialogFragment.A06 = (C23061Ai) r117.AC0.get();
                    gifSearchDialogFragment.A02 = (C16490t9) r117.AQz.get();
                    gifSearchDialogFragment.A00 = (AnonymousClass01V) r117.AOi.get();
                    gifSearchDialogFragment.A01 = (C15860rz) r117.AQh.get();
                    gifSearchDialogFragment.A05 = (C17020u3) r117.AMG.get();
                    gifSearchDialogFragment.A04 = (C25861Lk) r117.AJq.get();
                }
            } else if (!hilt_PickerSearchDialogFragment.A02) {
                hilt_PickerSearchDialogFragment.A02 = true;
                C16150sX r118 = ((C17050uS) ((C17060uT) hilt_PickerSearchDialogFragment.generatedComponent())).A0b;
                hilt_PickerSearchDialogFragment.A01 = (C17070uU) r118.ABg.get();
                hilt_PickerSearchDialogFragment.A03 = (C17080uV) r118.APK.get();
                hilt_PickerSearchDialogFragment.A04 = (C14710pd) r118.A05.get();
                hilt_PickerSearchDialogFragment.A02 = (AnonymousClass013) r118.AR8.get();
            }
        } else if (this instanceof Hilt_StopLiveLocationDialogFragment) {
            Hilt_StopLiveLocationDialogFragment hilt_StopLiveLocationDialogFragment = (Hilt_StopLiveLocationDialogFragment) this;
            if (!hilt_StopLiveLocationDialogFragment.A02) {
                hilt_StopLiveLocationDialogFragment.A02 = true;
                StopLiveLocationDialogFragment stopLiveLocationDialogFragment = (StopLiveLocationDialogFragment) hilt_StopLiveLocationDialogFragment;
                C16150sX r119 = ((C17050uS) ((C17060uT) hilt_StopLiveLocationDialogFragment.generatedComponent())).A0b;
                stopLiveLocationDialogFragment.A01 = (C17070uU) r119.ABg.get();
                stopLiveLocationDialogFragment.A03 = (C17080uV) r119.APK.get();
                stopLiveLocationDialogFragment.A04 = (C14710pd) r119.A05.get();
                stopLiveLocationDialogFragment.A02 = (AnonymousClass013) r119.AR8.get();
                stopLiveLocationDialogFragment.A01 = (C16320sq) r119.ARB.get();
                stopLiveLocationDialogFragment.A00 = (C19430yQ) r119.ADa.get();
            }
        } else if (this instanceof Hilt_PromptSendGroupInviteDialogFragment) {
            Hilt_PromptSendGroupInviteDialogFragment hilt_PromptSendGroupInviteDialogFragment = (Hilt_PromptSendGroupInviteDialogFragment) this;
            if (!hilt_PromptSendGroupInviteDialogFragment.A02) {
                hilt_PromptSendGroupInviteDialogFragment.A02 = true;
                PromptSendGroupInviteDialogFragment promptSendGroupInviteDialogFragment = (PromptSendGroupInviteDialogFragment) hilt_PromptSendGroupInviteDialogFragment;
                C16150sX r120 = ((C17050uS) ((C17060uT) hilt_PromptSendGroupInviteDialogFragment.generatedComponent())).A0b;
                promptSendGroupInviteDialogFragment.A01 = (C17070uU) r120.ABg.get();
                promptSendGroupInviteDialogFragment.A03 = (C17080uV) r120.APK.get();
                promptSendGroupInviteDialogFragment.A04 = (C14710pd) r120.A05.get();
                promptSendGroupInviteDialogFragment.A02 = (AnonymousClass013) r120.AR8.get();
                promptSendGroupInviteDialogFragment.A00 = (C16080sP) r120.AQ9.get();
                promptSendGroupInviteDialogFragment.A01 = (C17240ul) r120.ABK.get();
            }
        } else if (this instanceof Hilt_GroupSettingsLayoutV1_AdminSettingsDialogFragment) {
            Hilt_GroupSettingsLayoutV1_AdminSettingsDialogFragment hilt_GroupSettingsLayoutV1_AdminSettingsDialogFragment = (Hilt_GroupSettingsLayoutV1_AdminSettingsDialogFragment) this;
            if (hilt_GroupSettingsLayoutV1_AdminSettingsDialogFragment instanceof Hilt_GroupSettingsLayoutV1_SendMessagesDialogFragment) {
                Hilt_GroupSettingsLayoutV1_SendMessagesDialogFragment hilt_GroupSettingsLayoutV1_SendMessagesDialogFragment = (Hilt_GroupSettingsLayoutV1_SendMessagesDialogFragment) hilt_GroupSettingsLayoutV1_AdminSettingsDialogFragment;
                if (!hilt_GroupSettingsLayoutV1_SendMessagesDialogFragment.A02) {
                    hilt_GroupSettingsLayoutV1_SendMessagesDialogFragment.A02 = true;
                    C16150sX r28 = ((C17050uS) ((C17060uT) hilt_GroupSettingsLayoutV1_SendMessagesDialogFragment.generatedComponent())).A0b;
                    hilt_GroupSettingsLayoutV1_SendMessagesDialogFragment.A01 = (C17070uU) r28.ABg.get();
                    hilt_GroupSettingsLayoutV1_SendMessagesDialogFragment.A03 = (C17080uV) r28.APK.get();
                    hilt_GroupSettingsLayoutV1_SendMessagesDialogFragment.A04 = (C14710pd) r28.A05.get();
                    hilt_GroupSettingsLayoutV1_SendMessagesDialogFragment.A02 = (AnonymousClass013) r28.AR8.get();
                    hilt_GroupSettingsLayoutV1_SendMessagesDialogFragment.A04 = (C16440t3) r28.AP2.get();
                    hilt_GroupSettingsLayoutV1_SendMessagesDialogFragment.A00 = (C14870pt) r28.AB3.get();
                    hilt_GroupSettingsLayoutV1_SendMessagesDialogFragment.A0B = (AnonymousClass124) r28.ALe.get();
                    hilt_GroupSettingsLayoutV1_SendMessagesDialogFragment.A01 = (C15900s5) r28.ALm.get();
                    hilt_GroupSettingsLayoutV1_SendMessagesDialogFragment.A03 = (C16000sG) r28.A4x.get();
                    hilt_GroupSettingsLayoutV1_SendMessagesDialogFragment.A06 = (C16460t6) r28.A5k.get();
                    hilt_GroupSettingsLayoutV1_SendMessagesDialogFragment.A09 = (C17240ul) r28.ABK.get();
                    hilt_GroupSettingsLayoutV1_SendMessagesDialogFragment.A0C = (AnonymousClass122) r28.AOe.get();
                    hilt_GroupSettingsLayoutV1_SendMessagesDialogFragment.A05 = (AnonymousClass11A) r28.A5U.get();
                    hilt_GroupSettingsLayoutV1_SendMessagesDialogFragment.A07 = (C16070sO) r28.ABY.get();
                    hilt_GroupSettingsLayoutV1_SendMessagesDialogFragment.A02 = (C18260wP) r28.A4p.get();
                }
            } else if (hilt_GroupSettingsLayoutV1_AdminSettingsDialogFragment instanceof Hilt_GroupSettingsLayoutV1_RestrictFrequentlyForwardedDialogFragment) {
                Hilt_GroupSettingsLayoutV1_RestrictFrequentlyForwardedDialogFragment hilt_GroupSettingsLayoutV1_RestrictFrequentlyForwardedDialogFragment = (Hilt_GroupSettingsLayoutV1_RestrictFrequentlyForwardedDialogFragment) hilt_GroupSettingsLayoutV1_AdminSettingsDialogFragment;
                if (!hilt_GroupSettingsLayoutV1_RestrictFrequentlyForwardedDialogFragment.A02) {
                    hilt_GroupSettingsLayoutV1_RestrictFrequentlyForwardedDialogFragment.A02 = true;
                    C16150sX r29 = ((C17050uS) ((C17060uT) hilt_GroupSettingsLayoutV1_RestrictFrequentlyForwardedDialogFragment.generatedComponent())).A0b;
                    hilt_GroupSettingsLayoutV1_RestrictFrequentlyForwardedDialogFragment.A01 = (C17070uU) r29.ABg.get();
                    hilt_GroupSettingsLayoutV1_RestrictFrequentlyForwardedDialogFragment.A03 = (C17080uV) r29.APK.get();
                    hilt_GroupSettingsLayoutV1_RestrictFrequentlyForwardedDialogFragment.A04 = (C14710pd) r29.A05.get();
                    hilt_GroupSettingsLayoutV1_RestrictFrequentlyForwardedDialogFragment.A02 = (AnonymousClass013) r29.AR8.get();
                    hilt_GroupSettingsLayoutV1_RestrictFrequentlyForwardedDialogFragment.A04 = (C16440t3) r29.AP2.get();
                    hilt_GroupSettingsLayoutV1_RestrictFrequentlyForwardedDialogFragment.A00 = (C14870pt) r29.AB3.get();
                    hilt_GroupSettingsLayoutV1_RestrictFrequentlyForwardedDialogFragment.A0B = (AnonymousClass124) r29.ALe.get();
                    hilt_GroupSettingsLayoutV1_RestrictFrequentlyForwardedDialogFragment.A01 = (C15900s5) r29.ALm.get();
                    hilt_GroupSettingsLayoutV1_RestrictFrequentlyForwardedDialogFragment.A03 = (C16000sG) r29.A4x.get();
                    hilt_GroupSettingsLayoutV1_RestrictFrequentlyForwardedDialogFragment.A06 = (C16460t6) r29.A5k.get();
                    hilt_GroupSettingsLayoutV1_RestrictFrequentlyForwardedDialogFragment.A09 = (C17240ul) r29.ABK.get();
                    hilt_GroupSettingsLayoutV1_RestrictFrequentlyForwardedDialogFragment.A0C = (AnonymousClass122) r29.AOe.get();
                    hilt_GroupSettingsLayoutV1_RestrictFrequentlyForwardedDialogFragment.A05 = (AnonymousClass11A) r29.A5U.get();
                    hilt_GroupSettingsLayoutV1_RestrictFrequentlyForwardedDialogFragment.A07 = (C16070sO) r29.ABY.get();
                    hilt_GroupSettingsLayoutV1_RestrictFrequentlyForwardedDialogFragment.A02 = (C18260wP) r29.A4p.get();
                }
            } else if (hilt_GroupSettingsLayoutV1_AdminSettingsDialogFragment instanceof Hilt_GroupSettingsLayoutV1_EditGroupInfoDialogFragment) {
                Hilt_GroupSettingsLayoutV1_EditGroupInfoDialogFragment hilt_GroupSettingsLayoutV1_EditGroupInfoDialogFragment = (Hilt_GroupSettingsLayoutV1_EditGroupInfoDialogFragment) hilt_GroupSettingsLayoutV1_AdminSettingsDialogFragment;
                if (!hilt_GroupSettingsLayoutV1_EditGroupInfoDialogFragment.A02) {
                    hilt_GroupSettingsLayoutV1_EditGroupInfoDialogFragment.A02 = true;
                    C16150sX r210 = ((C17050uS) ((C17060uT) hilt_GroupSettingsLayoutV1_EditGroupInfoDialogFragment.generatedComponent())).A0b;
                    hilt_GroupSettingsLayoutV1_EditGroupInfoDialogFragment.A01 = (C17070uU) r210.ABg.get();
                    hilt_GroupSettingsLayoutV1_EditGroupInfoDialogFragment.A03 = (C17080uV) r210.APK.get();
                    hilt_GroupSettingsLayoutV1_EditGroupInfoDialogFragment.A04 = (C14710pd) r210.A05.get();
                    hilt_GroupSettingsLayoutV1_EditGroupInfoDialogFragment.A02 = (AnonymousClass013) r210.AR8.get();
                    hilt_GroupSettingsLayoutV1_EditGroupInfoDialogFragment.A04 = (C16440t3) r210.AP2.get();
                    hilt_GroupSettingsLayoutV1_EditGroupInfoDialogFragment.A00 = (C14870pt) r210.AB3.get();
                    hilt_GroupSettingsLayoutV1_EditGroupInfoDialogFragment.A0B = (AnonymousClass124) r210.ALe.get();
                    hilt_GroupSettingsLayoutV1_EditGroupInfoDialogFragment.A01 = (C15900s5) r210.ALm.get();
                    hilt_GroupSettingsLayoutV1_EditGroupInfoDialogFragment.A03 = (C16000sG) r210.A4x.get();
                    hilt_GroupSettingsLayoutV1_EditGroupInfoDialogFragment.A06 = (C16460t6) r210.A5k.get();
                    hilt_GroupSettingsLayoutV1_EditGroupInfoDialogFragment.A09 = (C17240ul) r210.ABK.get();
                    hilt_GroupSettingsLayoutV1_EditGroupInfoDialogFragment.A0C = (AnonymousClass122) r210.AOe.get();
                    hilt_GroupSettingsLayoutV1_EditGroupInfoDialogFragment.A05 = (AnonymousClass11A) r210.A5U.get();
                    hilt_GroupSettingsLayoutV1_EditGroupInfoDialogFragment.A07 = (C16070sO) r210.ABY.get();
                    hilt_GroupSettingsLayoutV1_EditGroupInfoDialogFragment.A02 = (C18260wP) r210.A4p.get();
                }
            } else if (hilt_GroupSettingsLayoutV1_AdminSettingsDialogFragment instanceof Hilt_GroupSettingMembershipApprovalRowV1_MembershipApprovalModeDialogFragment) {
                Hilt_GroupSettingMembershipApprovalRowV1_MembershipApprovalModeDialogFragment hilt_GroupSettingMembershipApprovalRowV1_MembershipApprovalModeDialogFragment = (Hilt_GroupSettingMembershipApprovalRowV1_MembershipApprovalModeDialogFragment) hilt_GroupSettingsLayoutV1_AdminSettingsDialogFragment;
                if (!hilt_GroupSettingMembershipApprovalRowV1_MembershipApprovalModeDialogFragment.A02) {
                    hilt_GroupSettingMembershipApprovalRowV1_MembershipApprovalModeDialogFragment.A02 = true;
                    C16150sX r211 = ((C17050uS) ((C17060uT) hilt_GroupSettingMembershipApprovalRowV1_MembershipApprovalModeDialogFragment.generatedComponent())).A0b;
                    hilt_GroupSettingMembershipApprovalRowV1_MembershipApprovalModeDialogFragment.A01 = (C17070uU) r211.ABg.get();
                    hilt_GroupSettingMembershipApprovalRowV1_MembershipApprovalModeDialogFragment.A03 = (C17080uV) r211.APK.get();
                    hilt_GroupSettingMembershipApprovalRowV1_MembershipApprovalModeDialogFragment.A04 = (C14710pd) r211.A05.get();
                    hilt_GroupSettingMembershipApprovalRowV1_MembershipApprovalModeDialogFragment.A02 = (AnonymousClass013) r211.AR8.get();
                    hilt_GroupSettingMembershipApprovalRowV1_MembershipApprovalModeDialogFragment.A04 = (C16440t3) r211.AP2.get();
                    hilt_GroupSettingMembershipApprovalRowV1_MembershipApprovalModeDialogFragment.A00 = (C14870pt) r211.AB3.get();
                    hilt_GroupSettingMembershipApprovalRowV1_MembershipApprovalModeDialogFragment.A0B = (AnonymousClass124) r211.ALe.get();
                    hilt_GroupSettingMembershipApprovalRowV1_MembershipApprovalModeDialogFragment.A01 = (C15900s5) r211.ALm.get();
                    hilt_GroupSettingMembershipApprovalRowV1_MembershipApprovalModeDialogFragment.A03 = (C16000sG) r211.A4x.get();
                    hilt_GroupSettingMembershipApprovalRowV1_MembershipApprovalModeDialogFragment.A06 = (C16460t6) r211.A5k.get();
                    hilt_GroupSettingMembershipApprovalRowV1_MembershipApprovalModeDialogFragment.A09 = (C17240ul) r211.ABK.get();
                    hilt_GroupSettingMembershipApprovalRowV1_MembershipApprovalModeDialogFragment.A0C = (AnonymousClass122) r211.AOe.get();
                    hilt_GroupSettingMembershipApprovalRowV1_MembershipApprovalModeDialogFragment.A05 = (AnonymousClass11A) r211.A5U.get();
                    hilt_GroupSettingMembershipApprovalRowV1_MembershipApprovalModeDialogFragment.A07 = (C16070sO) r211.ABY.get();
                    hilt_GroupSettingMembershipApprovalRowV1_MembershipApprovalModeDialogFragment.A02 = (C18260wP) r211.A4p.get();
                }
            } else if (!hilt_GroupSettingsLayoutV1_AdminSettingsDialogFragment.A02) {
                hilt_GroupSettingsLayoutV1_AdminSettingsDialogFragment.A02 = true;
                GroupSettingsLayoutV1$AdminSettingsDialogFragment groupSettingsLayoutV1$AdminSettingsDialogFragment = (GroupSettingsLayoutV1$AdminSettingsDialogFragment) hilt_GroupSettingsLayoutV1_AdminSettingsDialogFragment;
                C16150sX r212 = ((C17050uS) ((C17060uT) hilt_GroupSettingsLayoutV1_AdminSettingsDialogFragment.generatedComponent())).A0b;
                groupSettingsLayoutV1$AdminSettingsDialogFragment.A01 = (C17070uU) r212.ABg.get();
                groupSettingsLayoutV1$AdminSettingsDialogFragment.A03 = (C17080uV) r212.APK.get();
                groupSettingsLayoutV1$AdminSettingsDialogFragment.A04 = (C14710pd) r212.A05.get();
                groupSettingsLayoutV1$AdminSettingsDialogFragment.A02 = (AnonymousClass013) r212.AR8.get();
                groupSettingsLayoutV1$AdminSettingsDialogFragment.A04 = (C16440t3) r212.AP2.get();
                groupSettingsLayoutV1$AdminSettingsDialogFragment.A00 = (C14870pt) r212.AB3.get();
                groupSettingsLayoutV1$AdminSettingsDialogFragment.A0B = (AnonymousClass124) r212.ALe.get();
                groupSettingsLayoutV1$AdminSettingsDialogFragment.A01 = (C15900s5) r212.ALm.get();
                groupSettingsLayoutV1$AdminSettingsDialogFragment.A03 = (C16000sG) r212.A4x.get();
                groupSettingsLayoutV1$AdminSettingsDialogFragment.A06 = (C16460t6) r212.A5k.get();
                groupSettingsLayoutV1$AdminSettingsDialogFragment.A09 = (C17240ul) r212.ABK.get();
                groupSettingsLayoutV1$AdminSettingsDialogFragment.A0C = (AnonymousClass122) r212.AOe.get();
                groupSettingsLayoutV1$AdminSettingsDialogFragment.A05 = (AnonymousClass11A) r212.A5U.get();
                groupSettingsLayoutV1$AdminSettingsDialogFragment.A07 = (C16070sO) r212.ABY.get();
                groupSettingsLayoutV1$AdminSettingsDialogFragment.A02 = (C18260wP) r212.A4p.get();
            }
        } else if (this instanceof Hilt_ViewOnceNUXDialog) {
            Hilt_ViewOnceNUXDialog hilt_ViewOnceNUXDialog = (Hilt_ViewOnceNUXDialog) this;
            if (!hilt_ViewOnceNUXDialog.A02) {
                hilt_ViewOnceNUXDialog.A02 = true;
                ViewOnceNUXDialog viewOnceNUXDialog = (ViewOnceNUXDialog) hilt_ViewOnceNUXDialog;
                C16150sX r213 = ((C17050uS) ((C17060uT) hilt_ViewOnceNUXDialog.generatedComponent())).A0b;
                viewOnceNUXDialog.A01 = (C17070uU) r213.ABg.get();
                viewOnceNUXDialog.A03 = (C17080uV) r213.APK.get();
                viewOnceNUXDialog.A04 = (C14710pd) r213.A05.get();
                viewOnceNUXDialog.A02 = (AnonymousClass013) r213.AR8.get();
                viewOnceNUXDialog.A02 = (C19980zJ) r213.A0P.get();
                viewOnceNUXDialog.A05 = (C17220uj) r213.A9x.get();
                viewOnceNUXDialog.A04 = C16150sX.A0x(r213);
                viewOnceNUXDialog.A03 = (C15860rz) r213.AQh.get();
            }
        } else if (this instanceof Hilt_EphemeralNUXDialog) {
            Hilt_EphemeralNUXDialog hilt_EphemeralNUXDialog = (Hilt_EphemeralNUXDialog) this;
            if (!hilt_EphemeralNUXDialog.A02) {
                hilt_EphemeralNUXDialog.A02 = true;
                EphemeralNUXDialog ephemeralNUXDialog = (EphemeralNUXDialog) hilt_EphemeralNUXDialog;
                C16150sX r214 = ((C17050uS) ((C17060uT) hilt_EphemeralNUXDialog.generatedComponent())).A0b;
                ephemeralNUXDialog.A01 = (C17070uU) r214.ABg.get();
                ephemeralNUXDialog.A03 = (C17080uV) r214.APK.get();
                ephemeralNUXDialog.A04 = (C14710pd) r214.A05.get();
                ephemeralNUXDialog.A02 = (AnonymousClass013) r214.AR8.get();
                ephemeralNUXDialog.A02 = (C19980zJ) r214.A0P.get();
                ephemeralNUXDialog.A05 = (C17220uj) r214.A9x.get();
                ephemeralNUXDialog.A04 = C16150sX.A0x(r214);
                ephemeralNUXDialog.A03 = (C15860rz) r214.AQh.get();
            }
        } else if (this instanceof Hilt_DocumentPickerActivity_SendDocumentsConfirmationDialogFragment) {
            Hilt_DocumentPickerActivity_SendDocumentsConfirmationDialogFragment hilt_DocumentPickerActivity_SendDocumentsConfirmationDialogFragment = (Hilt_DocumentPickerActivity_SendDocumentsConfirmationDialogFragment) this;
            if (!hilt_DocumentPickerActivity_SendDocumentsConfirmationDialogFragment.A02) {
                hilt_DocumentPickerActivity_SendDocumentsConfirmationDialogFragment.A02 = true;
                DocumentPickerActivity.SendDocumentsConfirmationDialogFragment sendDocumentsConfirmationDialogFragment = (DocumentPickerActivity.SendDocumentsConfirmationDialogFragment) hilt_DocumentPickerActivity_SendDocumentsConfirmationDialogFragment;
                C16150sX r215 = ((C17050uS) ((C17060uT) hilt_DocumentPickerActivity_SendDocumentsConfirmationDialogFragment.generatedComponent())).A0b;
                sendDocumentsConfirmationDialogFragment.A01 = (C17070uU) r215.ABg.get();
                sendDocumentsConfirmationDialogFragment.A03 = (C17080uV) r215.APK.get();
                sendDocumentsConfirmationDialogFragment.A04 = (C14710pd) r215.A05.get();
                sendDocumentsConfirmationDialogFragment.A02 = (AnonymousClass013) r215.AR8.get();
                sendDocumentsConfirmationDialogFragment.A04 = (C17250um) r215.A7e.get();
                sendDocumentsConfirmationDialogFragment.A01 = (C16000sG) r215.A4x.get();
                sendDocumentsConfirmationDialogFragment.A03 = (AnonymousClass01V) r215.AOi.get();
                sendDocumentsConfirmationDialogFragment.A02 = (C16080sP) r215.AQ9.get();
                sendDocumentsConfirmationDialogFragment.A00 = (C18260wP) r215.A4p.get();
            }
        } else if (this instanceof Hilt_ProgressDialogFragment) {
            Hilt_ProgressDialogFragment hilt_ProgressDialogFragment = (Hilt_ProgressDialogFragment) this;
            if (!hilt_ProgressDialogFragment.A02) {
                hilt_ProgressDialogFragment.A02 = true;
                C16150sX r121 = ((C17050uS) ((C17060uT) hilt_ProgressDialogFragment.generatedComponent())).A0b;
                hilt_ProgressDialogFragment.A01 = (C17070uU) r121.ABg.get();
                hilt_ProgressDialogFragment.A03 = (C17080uV) r121.APK.get();
                hilt_ProgressDialogFragment.A04 = (C14710pd) r121.A05.get();
                hilt_ProgressDialogFragment.A02 = (AnonymousClass013) r121.AR8.get();
            }
        } else if (this instanceof Hilt_LeaveGroupsDialogFragment) {
            Hilt_LeaveGroupsDialogFragment hilt_LeaveGroupsDialogFragment = (Hilt_LeaveGroupsDialogFragment) this;
            if (!hilt_LeaveGroupsDialogFragment.A02) {
                hilt_LeaveGroupsDialogFragment.A02 = true;
                LeaveGroupsDialogFragment leaveGroupsDialogFragment = (LeaveGroupsDialogFragment) hilt_LeaveGroupsDialogFragment;
                C16150sX r216 = ((C17050uS) ((C17060uT) hilt_LeaveGroupsDialogFragment.generatedComponent())).A0b;
                leaveGroupsDialogFragment.A01 = (C17070uU) r216.ABg.get();
                leaveGroupsDialogFragment.A03 = (C17080uV) r216.APK.get();
                leaveGroupsDialogFragment.A04 = (C14710pd) r216.A05.get();
                leaveGroupsDialogFragment.A02 = (AnonymousClass013) r216.AR8.get();
                leaveGroupsDialogFragment.A00 = (C14870pt) r216.AB3.get();
                leaveGroupsDialogFragment.A0G = (C16320sq) r216.ARB.get();
                leaveGroupsDialogFragment.A08 = (C15810rt) r216.A43.get();
                leaveGroupsDialogFragment.A07 = (C18910xS) r216.A3q.get();
                leaveGroupsDialogFragment.A0C = (C17250um) r216.A7e.get();
                leaveGroupsDialogFragment.A01 = (C15900s5) r216.ALm.get();
                leaveGroupsDialogFragment.A03 = (C16000sG) r216.A4x.get();
                leaveGroupsDialogFragment.A04 = (C16080sP) r216.AQ9.get();
                leaveGroupsDialogFragment.A0D = (C17240ul) r216.ABK.get();
                leaveGroupsDialogFragment.A0E = C16150sX.A0p(r216);
                leaveGroupsDialogFragment.A0F = (C16220sf) r216.A3y.get();
                leaveGroupsDialogFragment.A05 = (C25931Lr) r216.AMs.get();
                leaveGroupsDialogFragment.A06 = (C15860rz) r216.AQh.get();
                leaveGroupsDialogFragment.A09 = (AnonymousClass11A) r216.A5U.get();
                leaveGroupsDialogFragment.A0A = (C16070sO) r216.ABY.get();
                leaveGroupsDialogFragment.A0B = (AnonymousClass192) r216.AH1.get();
                leaveGroupsDialogFragment.A02 = (C18260wP) r216.A4p.get();
            }
        } else if (this instanceof Hilt_GoogleSearchDialogFragment) {
            Hilt_GoogleSearchDialogFragment hilt_GoogleSearchDialogFragment = (Hilt_GoogleSearchDialogFragment) this;
            if (!hilt_GoogleSearchDialogFragment.A02) {
                hilt_GoogleSearchDialogFragment.A02 = true;
                GoogleSearchDialogFragment googleSearchDialogFragment = (GoogleSearchDialogFragment) hilt_GoogleSearchDialogFragment;
                C16150sX r217 = ((C17050uS) ((C17060uT) hilt_GoogleSearchDialogFragment.generatedComponent())).A0b;
                googleSearchDialogFragment.A01 = (C17070uU) r217.ABg.get();
                googleSearchDialogFragment.A03 = (C17080uV) r217.APK.get();
                googleSearchDialogFragment.A04 = (C14710pd) r217.A05.get();
                googleSearchDialogFragment.A02 = (AnonymousClass013) r217.AR8.get();
                googleSearchDialogFragment.A01 = (C14870pt) r217.AB3.get();
                googleSearchDialogFragment.A05 = (C16320sq) r217.ARB.get();
                googleSearchDialogFragment.A03 = (C17130ua) r217.AN9.get();
                googleSearchDialogFragment.A04 = (C16490t9) r217.AQz.get();
                googleSearchDialogFragment.A02 = (C15900s5) r217.ALm.get();
                googleSearchDialogFragment.A00 = (C19980zJ) r217.A0P.get();
            }
        } else if (this instanceof Hilt_ConversationRow_ConversationRowDialogFragment) {
            Hilt_ConversationRow_ConversationRowDialogFragment hilt_ConversationRow_ConversationRowDialogFragment = (Hilt_ConversationRow_ConversationRowDialogFragment) this;
            if (!hilt_ConversationRow_ConversationRowDialogFragment.A02) {
                hilt_ConversationRow_ConversationRowDialogFragment.A02 = true;
                ConversationRow$ConversationRowDialogFragment conversationRow$ConversationRowDialogFragment = (ConversationRow$ConversationRowDialogFragment) hilt_ConversationRow_ConversationRowDialogFragment;
                C16150sX r218 = ((C17050uS) ((C17060uT) hilt_ConversationRow_ConversationRowDialogFragment.generatedComponent())).A0b;
                conversationRow$ConversationRowDialogFragment.A01 = (C17070uU) r218.ABg.get();
                conversationRow$ConversationRowDialogFragment.A03 = (C17080uV) r218.APK.get();
                conversationRow$ConversationRowDialogFragment.A04 = (C14710pd) r218.A05.get();
                conversationRow$ConversationRowDialogFragment.A02 = (AnonymousClass013) r218.AR8.get();
                conversationRow$ConversationRowDialogFragment.A00 = (C16040sK) r218.ADr.get();
                conversationRow$ConversationRowDialogFragment.A01 = (C16000sG) r218.A4x.get();
                conversationRow$ConversationRowDialogFragment.A02 = (C16080sP) r218.AQ9.get();
            }
        } else if (this instanceof Hilt_ConversationRowContact_MessageSharedContactDialogFragment) {
            Hilt_ConversationRowContact_MessageSharedContactDialogFragment hilt_ConversationRowContact_MessageSharedContactDialogFragment = (Hilt_ConversationRowContact_MessageSharedContactDialogFragment) this;
            if (!hilt_ConversationRowContact_MessageSharedContactDialogFragment.A02) {
                hilt_ConversationRowContact_MessageSharedContactDialogFragment.A02 = true;
                ConversationRowContact$MessageSharedContactDialogFragment conversationRowContact$MessageSharedContactDialogFragment = (ConversationRowContact$MessageSharedContactDialogFragment) hilt_ConversationRowContact_MessageSharedContactDialogFragment;
                C16150sX r122 = ((C17050uS) ((C17060uT) hilt_ConversationRowContact_MessageSharedContactDialogFragment.generatedComponent())).A0b;
                conversationRowContact$MessageSharedContactDialogFragment.A01 = (C17070uU) r122.ABg.get();
                conversationRowContact$MessageSharedContactDialogFragment.A03 = (C17080uV) r122.APK.get();
                conversationRowContact$MessageSharedContactDialogFragment.A04 = (C14710pd) r122.A05.get();
                conversationRowContact$MessageSharedContactDialogFragment.A02 = (AnonymousClass013) r122.AR8.get();
                conversationRowContact$MessageSharedContactDialogFragment.A00 = (AnonymousClass1L6) r122.AMC.get();
            }
        } else if (this instanceof Hilt_ChatWithBusinessInDirectoryDialogFragment) {
            Hilt_ChatWithBusinessInDirectoryDialogFragment hilt_ChatWithBusinessInDirectoryDialogFragment = (Hilt_ChatWithBusinessInDirectoryDialogFragment) this;
            if (!hilt_ChatWithBusinessInDirectoryDialogFragment.A02) {
                hilt_ChatWithBusinessInDirectoryDialogFragment.A02 = true;
                ChatWithBusinessInDirectoryDialogFragment chatWithBusinessInDirectoryDialogFragment = (ChatWithBusinessInDirectoryDialogFragment) hilt_ChatWithBusinessInDirectoryDialogFragment;
                C16150sX r219 = ((C17050uS) ((C17060uT) hilt_ChatWithBusinessInDirectoryDialogFragment.generatedComponent())).A0b;
                chatWithBusinessInDirectoryDialogFragment.A01 = (C17070uU) r219.ABg.get();
                chatWithBusinessInDirectoryDialogFragment.A03 = (C17080uV) r219.APK.get();
                chatWithBusinessInDirectoryDialogFragment.A04 = (C14710pd) r219.A05.get();
                chatWithBusinessInDirectoryDialogFragment.A02 = (AnonymousClass013) r219.AR8.get();
                chatWithBusinessInDirectoryDialogFragment.A00 = (C19980zJ) r219.A0P.get();
                chatWithBusinessInDirectoryDialogFragment.A03 = (C17220uj) r219.A9x.get();
                chatWithBusinessInDirectoryDialogFragment.A02 = (AnonymousClass15U) r219.A2p.get();
                chatWithBusinessInDirectoryDialogFragment.A01 = (C24961Hy) r219.A2l.get();
            }
        } else if (this instanceof Hilt_CapturePictureOrVideoDialogFragment) {
            Hilt_CapturePictureOrVideoDialogFragment hilt_CapturePictureOrVideoDialogFragment = (Hilt_CapturePictureOrVideoDialogFragment) this;
            if (!hilt_CapturePictureOrVideoDialogFragment.A02) {
                hilt_CapturePictureOrVideoDialogFragment.A02 = true;
                C16150sX r123 = ((C17050uS) ((C17060uT) hilt_CapturePictureOrVideoDialogFragment.generatedComponent())).A0b;
                hilt_CapturePictureOrVideoDialogFragment.A01 = (C17070uU) r123.ABg.get();
                hilt_CapturePictureOrVideoDialogFragment.A03 = (C17080uV) r123.APK.get();
                hilt_CapturePictureOrVideoDialogFragment.A04 = (C14710pd) r123.A05.get();
                hilt_CapturePictureOrVideoDialogFragment.A02 = (AnonymousClass013) r123.AR8.get();
            }
        } else if (this instanceof Hilt_PhoneNumberSelectionDialog) {
            Hilt_PhoneNumberSelectionDialog hilt_PhoneNumberSelectionDialog = (Hilt_PhoneNumberSelectionDialog) this;
            if (!hilt_PhoneNumberSelectionDialog.A02) {
                hilt_PhoneNumberSelectionDialog.A02 = true;
                PhoneNumberSelectionDialog phoneNumberSelectionDialog = (PhoneNumberSelectionDialog) hilt_PhoneNumberSelectionDialog;
                C16150sX r124 = ((C17050uS) ((C17060uT) hilt_PhoneNumberSelectionDialog.generatedComponent())).A0b;
                phoneNumberSelectionDialog.A01 = (C17070uU) r124.ABg.get();
                phoneNumberSelectionDialog.A03 = (C17080uV) r124.APK.get();
                phoneNumberSelectionDialog.A04 = (C14710pd) r124.A05.get();
                phoneNumberSelectionDialog.A02 = (AnonymousClass013) r124.AR8.get();
                phoneNumberSelectionDialog.A01 = (C16440t3) r124.AP2.get();
            }
        } else if (this instanceof Hilt_BaseSharedPreviewDialogFragment) {
            Hilt_BaseSharedPreviewDialogFragment hilt_BaseSharedPreviewDialogFragment = (Hilt_BaseSharedPreviewDialogFragment) this;
            if (hilt_BaseSharedPreviewDialogFragment instanceof Hilt_SharedTextPreviewDialogFragment) {
                Hilt_SharedTextPreviewDialogFragment hilt_SharedTextPreviewDialogFragment = (Hilt_SharedTextPreviewDialogFragment) hilt_BaseSharedPreviewDialogFragment;
                if (!hilt_SharedTextPreviewDialogFragment.A02) {
                    hilt_SharedTextPreviewDialogFragment.A02 = true;
                    SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = (SharedTextPreviewDialogFragment) hilt_SharedTextPreviewDialogFragment;
                    C16150sX r220 = ((C17050uS) ((C17060uT) hilt_SharedTextPreviewDialogFragment.generatedComponent())).A0b;
                    sharedTextPreviewDialogFragment.A01 = (C17070uU) r220.ABg.get();
                    sharedTextPreviewDialogFragment.A03 = (C17080uV) r220.APK.get();
                    sharedTextPreviewDialogFragment.A04 = (C14710pd) r220.A05.get();
                    sharedTextPreviewDialogFragment.A02 = (AnonymousClass013) r220.AR8.get();
                    sharedTextPreviewDialogFragment.A08 = (C14870pt) r220.AB3.get();
                    sharedTextPreviewDialogFragment.A07 = (C16180sb) r220.A8b.get();
                    sharedTextPreviewDialogFragment.A09 = (C16000sG) r220.A4x.get();
                    sharedTextPreviewDialogFragment.A0E = (AnonymousClass1A9) r220.AE7.get();
                    sharedTextPreviewDialogFragment.A0C = (AnonymousClass01V) r220.AOi.get();
                    sharedTextPreviewDialogFragment.A0A = (C16080sP) r220.AQ9.get();
                    sharedTextPreviewDialogFragment.A0H = (C23061Ai) r220.AC0.get();
                    sharedTextPreviewDialogFragment.A03 = (C16300so) r220.A5p.get();
                    sharedTextPreviewDialogFragment.A0I = (C16320sq) r220.ARB.get();
                    sharedTextPreviewDialogFragment.A04 = (C17130ua) r220.AN9.get();
                    sharedTextPreviewDialogFragment.A0B = (C17250um) r220.A7e.get();
                    sharedTextPreviewDialogFragment.A0A = (C206711d) r220.AKp.get();
                    sharedTextPreviewDialogFragment.A02 = (C19980zJ) r220.A0P.get();
                    sharedTextPreviewDialogFragment.A0C = (AnonymousClass1BQ) r220.A7f.get();
                    sharedTextPreviewDialogFragment.A08 = (C15860rz) r220.AQh.get();
                    sharedTextPreviewDialogFragment.A0F = C16150sX.A17(r220);
                    sharedTextPreviewDialogFragment.A06 = (C17230uk) r220.A4I.get();
                    sharedTextPreviewDialogFragment.A0G = (AnonymousClass1L1) r220.ANR.get();
                    sharedTextPreviewDialogFragment.A0E = (C17020u3) r220.AMG.get();
                }
            } else if (!hilt_BaseSharedPreviewDialogFragment.A02) {
                hilt_BaseSharedPreviewDialogFragment.A02 = true;
                BaseSharedPreviewDialogFragment baseSharedPreviewDialogFragment = (BaseSharedPreviewDialogFragment) hilt_BaseSharedPreviewDialogFragment;
                C16150sX r221 = ((C17050uS) ((C17060uT) hilt_BaseSharedPreviewDialogFragment.generatedComponent())).A0b;
                baseSharedPreviewDialogFragment.A01 = (C17070uU) r221.ABg.get();
                baseSharedPreviewDialogFragment.A03 = (C17080uV) r221.APK.get();
                baseSharedPreviewDialogFragment.A04 = (C14710pd) r221.A05.get();
                baseSharedPreviewDialogFragment.A02 = (AnonymousClass013) r221.AR8.get();
                baseSharedPreviewDialogFragment.A08 = (C14870pt) r221.AB3.get();
                baseSharedPreviewDialogFragment.A07 = (C16180sb) r221.A8b.get();
                baseSharedPreviewDialogFragment.A09 = (C16000sG) r221.A4x.get();
                baseSharedPreviewDialogFragment.A0E = (AnonymousClass1A9) r221.AE7.get();
                baseSharedPreviewDialogFragment.A0C = (AnonymousClass01V) r221.AOi.get();
                baseSharedPreviewDialogFragment.A0A = (C16080sP) r221.AQ9.get();
            }
        } else if (this instanceof Hilt_WifiSpeedBumpDialogFragment) {
            Hilt_WifiSpeedBumpDialogFragment hilt_WifiSpeedBumpDialogFragment = (Hilt_WifiSpeedBumpDialogFragment) this;
            if (!hilt_WifiSpeedBumpDialogFragment.A02) {
                hilt_WifiSpeedBumpDialogFragment.A02 = true;
                C16150sX r125 = ((C17050uS) ((C17060uT) hilt_WifiSpeedBumpDialogFragment.generatedComponent())).A0b;
                hilt_WifiSpeedBumpDialogFragment.A01 = (C17070uU) r125.ABg.get();
                hilt_WifiSpeedBumpDialogFragment.A03 = (C17080uV) r125.APK.get();
                hilt_WifiSpeedBumpDialogFragment.A04 = (C14710pd) r125.A05.get();
                hilt_WifiSpeedBumpDialogFragment.A02 = (AnonymousClass013) r125.AR8.get();
            }
        } else if (this instanceof Hilt_LinkedDevicesDetailDialogFragment) {
            Hilt_LinkedDevicesDetailDialogFragment hilt_LinkedDevicesDetailDialogFragment = (Hilt_LinkedDevicesDetailDialogFragment) this;
            if (!hilt_LinkedDevicesDetailDialogFragment.A02) {
                hilt_LinkedDevicesDetailDialogFragment.A02 = true;
                LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment = (LinkedDevicesDetailDialogFragment) hilt_LinkedDevicesDetailDialogFragment;
                C16150sX r222 = ((C17050uS) ((C17060uT) hilt_LinkedDevicesDetailDialogFragment.generatedComponent())).A0b;
                linkedDevicesDetailDialogFragment.A01 = (C17070uU) r222.ABg.get();
                linkedDevicesDetailDialogFragment.A03 = (C17080uV) r222.APK.get();
                linkedDevicesDetailDialogFragment.A04 = (C14710pd) r222.A05.get();
                linkedDevicesDetailDialogFragment.A02 = (AnonymousClass013) r222.AR8.get();
                linkedDevicesDetailDialogFragment.A06 = (C16440t3) r222.AP2.get();
                linkedDevicesDetailDialogFragment.A03 = (C14870pt) r222.AB3.get();
                linkedDevicesDetailDialogFragment.A02 = (C19980zJ) r222.A0P.get();
                linkedDevicesDetailDialogFragment.A0B = (C17220uj) r222.A9x.get();
                linkedDevicesDetailDialogFragment.A05 = (AnonymousClass01V) r222.AOi.get();
                linkedDevicesDetailDialogFragment.A08 = (C19410yO) r222.A4T.get();
                linkedDevicesDetailDialogFragment.A09 = (AnonymousClass1RS) r222.AF3.get();
            }
        } else if (this instanceof Hilt_CommunitySuspendDialogFragment) {
            Hilt_CommunitySuspendDialogFragment hilt_CommunitySuspendDialogFragment = (Hilt_CommunitySuspendDialogFragment) this;
            if (!hilt_CommunitySuspendDialogFragment.A02) {
                hilt_CommunitySuspendDialogFragment.A02 = true;
                CommunitySuspendDialogFragment communitySuspendDialogFragment = (CommunitySuspendDialogFragment) hilt_CommunitySuspendDialogFragment;
                C16150sX r126 = ((C17050uS) ((C17060uT) hilt_CommunitySuspendDialogFragment.generatedComponent())).A0b;
                communitySuspendDialogFragment.A01 = (C17070uU) r126.ABg.get();
                communitySuspendDialogFragment.A03 = (C17080uV) r126.APK.get();
                communitySuspendDialogFragment.A04 = (C14710pd) r126.A05.get();
                communitySuspendDialogFragment.A02 = (AnonymousClass013) r126.AR8.get();
                communitySuspendDialogFragment.A00 = (AnonymousClass1BZ) r126.A5N.get();
            }
        } else if (this instanceof Hilt_DeactivateCommunityConfirmationFragment) {
            Hilt_DeactivateCommunityConfirmationFragment hilt_DeactivateCommunityConfirmationFragment = (Hilt_DeactivateCommunityConfirmationFragment) this;
            if (!hilt_DeactivateCommunityConfirmationFragment.A02) {
                hilt_DeactivateCommunityConfirmationFragment.A02 = true;
                DeactivateCommunityConfirmationFragment deactivateCommunityConfirmationFragment = (DeactivateCommunityConfirmationFragment) hilt_DeactivateCommunityConfirmationFragment;
                C16150sX r127 = ((C17050uS) ((C17060uT) hilt_DeactivateCommunityConfirmationFragment.generatedComponent())).A0b;
                deactivateCommunityConfirmationFragment.A01 = (C17070uU) r127.ABg.get();
                deactivateCommunityConfirmationFragment.A03 = (C17080uV) r127.APK.get();
                deactivateCommunityConfirmationFragment.A04 = (C14710pd) r127.A05.get();
                deactivateCommunityConfirmationFragment.A02 = (AnonymousClass013) r127.AR8.get();
                deactivateCommunityConfirmationFragment.A01 = (C16000sG) r127.A4x.get();
                deactivateCommunityConfirmationFragment.A02 = (C16080sP) r127.AQ9.get();
            }
        } else if (this instanceof Hilt_CommunityExitDialogFragment) {
            Hilt_CommunityExitDialogFragment hilt_CommunityExitDialogFragment = (Hilt_CommunityExitDialogFragment) this;
            if (!hilt_CommunityExitDialogFragment.A02) {
                hilt_CommunityExitDialogFragment.A02 = true;
                CommunityExitDialogFragment communityExitDialogFragment = (CommunityExitDialogFragment) hilt_CommunityExitDialogFragment;
                C16150sX r223 = ((C17050uS) ((C17060uT) hilt_CommunityExitDialogFragment.generatedComponent())).A0b;
                communityExitDialogFragment.A01 = (C17070uU) r223.ABg.get();
                communityExitDialogFragment.A03 = (C17080uV) r223.APK.get();
                communityExitDialogFragment.A04 = (C14710pd) r223.A05.get();
                communityExitDialogFragment.A02 = (AnonymousClass013) r223.AR8.get();
                communityExitDialogFragment.A01 = (C14870pt) r223.AB3.get();
                communityExitDialogFragment.A07 = (C17110uY) r223.ADT.get();
                communityExitDialogFragment.A00 = (C19980zJ) r223.A0P.get();
                communityExitDialogFragment.A02 = (C16000sG) r223.A4x.get();
                communityExitDialogFragment.A06 = (C17220uj) r223.A9x.get();
                communityExitDialogFragment.A03 = (C16080sP) r223.AQ9.get();
                communityExitDialogFragment.A04 = (C16070sO) r223.ABY.get();
            }
        } else if (this instanceof Hilt_ViewPhotoOrStatusDialogFragment) {
            Hilt_ViewPhotoOrStatusDialogFragment hilt_ViewPhotoOrStatusDialogFragment = (Hilt_ViewPhotoOrStatusDialogFragment) this;
            if (!hilt_ViewPhotoOrStatusDialogFragment.A02) {
                hilt_ViewPhotoOrStatusDialogFragment.A02 = true;
                C16150sX r128 = ((C17050uS) ((C17060uT) hilt_ViewPhotoOrStatusDialogFragment.generatedComponent())).A0b;
                hilt_ViewPhotoOrStatusDialogFragment.A01 = (C17070uU) r128.ABg.get();
                hilt_ViewPhotoOrStatusDialogFragment.A03 = (C17080uV) r128.APK.get();
                hilt_ViewPhotoOrStatusDialogFragment.A04 = (C14710pd) r128.A05.get();
                hilt_ViewPhotoOrStatusDialogFragment.A02 = (AnonymousClass013) r128.AR8.get();
            }
        } else if (this instanceof Hilt_VoipContactPickerDialogFragment) {
            Hilt_VoipContactPickerDialogFragment hilt_VoipContactPickerDialogFragment = (Hilt_VoipContactPickerDialogFragment) this;
            if (!hilt_VoipContactPickerDialogFragment.A02) {
                hilt_VoipContactPickerDialogFragment.A02 = true;
                C16150sX r129 = ((C17050uS) ((C17060uT) hilt_VoipContactPickerDialogFragment.generatedComponent())).A0b;
                hilt_VoipContactPickerDialogFragment.A01 = (C17070uU) r129.ABg.get();
                hilt_VoipContactPickerDialogFragment.A03 = (C17080uV) r129.APK.get();
                hilt_VoipContactPickerDialogFragment.A04 = (C14710pd) r129.A05.get();
                hilt_VoipContactPickerDialogFragment.A02 = (AnonymousClass013) r129.AR8.get();
            }
        } else if (this instanceof Hilt_JoinableEducationDialogFragment) {
            Hilt_JoinableEducationDialogFragment hilt_JoinableEducationDialogFragment = (Hilt_JoinableEducationDialogFragment) this;
            if (!hilt_JoinableEducationDialogFragment.A02) {
                hilt_JoinableEducationDialogFragment.A02 = true;
                C16150sX r130 = ((C17050uS) ((C17060uT) hilt_JoinableEducationDialogFragment.generatedComponent())).A0b;
                hilt_JoinableEducationDialogFragment.A01 = (C17070uU) r130.ABg.get();
                hilt_JoinableEducationDialogFragment.A03 = (C17080uV) r130.APK.get();
                hilt_JoinableEducationDialogFragment.A04 = (C14710pd) r130.A05.get();
                hilt_JoinableEducationDialogFragment.A02 = (AnonymousClass013) r130.AR8.get();
            }
        } else if (this instanceof Hilt_MaximizedParticipantVideoDialogFragment) {
            Hilt_MaximizedParticipantVideoDialogFragment hilt_MaximizedParticipantVideoDialogFragment = (Hilt_MaximizedParticipantVideoDialogFragment) this;
            if (!hilt_MaximizedParticipantVideoDialogFragment.A02) {
                hilt_MaximizedParticipantVideoDialogFragment.A02 = true;
                MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = (MaximizedParticipantVideoDialogFragment) hilt_MaximizedParticipantVideoDialogFragment;
                C16150sX r224 = ((C17050uS) ((C17060uT) hilt_MaximizedParticipantVideoDialogFragment.generatedComponent())).A0b;
                maximizedParticipantVideoDialogFragment.A01 = (C17070uU) r224.ABg.get();
                maximizedParticipantVideoDialogFragment.A03 = (C17080uV) r224.APK.get();
                maximizedParticipantVideoDialogFragment.A04 = (C14710pd) r224.A05.get();
                maximizedParticipantVideoDialogFragment.A02 = (AnonymousClass013) r224.AR8.get();
                maximizedParticipantVideoDialogFragment.A0A = (C16000sG) r224.A4x.get();
                maximizedParticipantVideoDialogFragment.A09 = (C26801Pf) r224.APr.get();
                maximizedParticipantVideoDialogFragment.A0B = (C16080sP) r224.AQ9.get();
            }
        } else if (this instanceof Hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment) {
            Hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment = (Hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment) this;
            if (!hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment.A02) {
                hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment.A02 = true;
                CallSpamActivity.ReportSpamOrBlockDialogFragment reportSpamOrBlockDialogFragment = (CallSpamActivity.ReportSpamOrBlockDialogFragment) hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment;
                C16150sX r225 = ((C17050uS) ((C17060uT) hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment.generatedComponent())).A0b;
                reportSpamOrBlockDialogFragment.A01 = (C17070uU) r225.ABg.get();
                reportSpamOrBlockDialogFragment.A03 = (C17080uV) r225.APK.get();
                reportSpamOrBlockDialogFragment.A04 = (C14710pd) r225.A05.get();
                reportSpamOrBlockDialogFragment.A02 = (AnonymousClass013) r225.AR8.get();
                reportSpamOrBlockDialogFragment.A02 = (C14870pt) r225.AB3.get();
                reportSpamOrBlockDialogFragment.A0E = (C16320sq) r225.ARB.get();
                reportSpamOrBlockDialogFragment.A03 = (C16760tb) r225.APV.get();
                reportSpamOrBlockDialogFragment.A06 = (C16000sG) r225.A4x.get();
                reportSpamOrBlockDialogFragment.A07 = (C16080sP) r225.AQ9.get();
                reportSpamOrBlockDialogFragment.A04 = (AnonymousClass01Y) r225.A1w.get();
                reportSpamOrBlockDialogFragment.A09 = (C16460t6) r225.A5k.get();
                reportSpamOrBlockDialogFragment.A0D = (C14770pj) r225.AF9.get();
                reportSpamOrBlockDialogFragment.A08 = (AnonymousClass10Y) r225.A5X.get();
                reportSpamOrBlockDialogFragment.A05 = (C18260wP) r225.A4p.get();
            }
        } else if (this instanceof Hilt_CallsHistoryClearCallLogDialogFragment) {
            Hilt_CallsHistoryClearCallLogDialogFragment hilt_CallsHistoryClearCallLogDialogFragment = (Hilt_CallsHistoryClearCallLogDialogFragment) this;
            if (!hilt_CallsHistoryClearCallLogDialogFragment.A02) {
                hilt_CallsHistoryClearCallLogDialogFragment.A02 = true;
                CallsHistoryClearCallLogDialogFragment callsHistoryClearCallLogDialogFragment = (CallsHistoryClearCallLogDialogFragment) hilt_CallsHistoryClearCallLogDialogFragment;
                C16150sX r226 = ((C17050uS) ((C17060uT) hilt_CallsHistoryClearCallLogDialogFragment.generatedComponent())).A0b;
                callsHistoryClearCallLogDialogFragment.A01 = (C17070uU) r226.ABg.get();
                callsHistoryClearCallLogDialogFragment.A03 = (C17080uV) r226.APK.get();
                callsHistoryClearCallLogDialogFragment.A04 = (C14710pd) r226.A05.get();
                callsHistoryClearCallLogDialogFragment.A02 = (AnonymousClass013) r226.AR8.get();
                callsHistoryClearCallLogDialogFragment.A00 = (C14870pt) r226.AB3.get();
                callsHistoryClearCallLogDialogFragment.A04 = (C16320sq) r226.ARB.get();
                callsHistoryClearCallLogDialogFragment.A05 = (AnonymousClass1SP) r226.A3G.get();
                callsHistoryClearCallLogDialogFragment.A02 = (AnonymousClass1D0) r226.A3P.get();
                callsHistoryClearCallLogDialogFragment.A03 = (C14760pi) r226.AFo.get();
                callsHistoryClearCallLogDialogFragment.A01 = (C16440t3) r226.AP2.get();
            }
        } else if (this instanceof Hilt_CallsHistoryFragment_ClearCallLogDialogFragment) {
            Hilt_CallsHistoryFragment_ClearCallLogDialogFragment hilt_CallsHistoryFragment_ClearCallLogDialogFragment = (Hilt_CallsHistoryFragment_ClearCallLogDialogFragment) this;
            if (!hilt_CallsHistoryFragment_ClearCallLogDialogFragment.A02) {
                hilt_CallsHistoryFragment_ClearCallLogDialogFragment.A02 = true;
                CallsHistoryFragment.ClearCallLogDialogFragment clearCallLogDialogFragment = (CallsHistoryFragment.ClearCallLogDialogFragment) hilt_CallsHistoryFragment_ClearCallLogDialogFragment;
                C16150sX r227 = ((C17050uS) ((C17060uT) hilt_CallsHistoryFragment_ClearCallLogDialogFragment.generatedComponent())).A0b;
                clearCallLogDialogFragment.A01 = (C17070uU) r227.ABg.get();
                clearCallLogDialogFragment.A03 = (C17080uV) r227.APK.get();
                clearCallLogDialogFragment.A04 = (C14710pd) r227.A05.get();
                clearCallLogDialogFragment.A02 = (AnonymousClass013) r227.AR8.get();
                clearCallLogDialogFragment.A00 = (C14870pt) r227.AB3.get();
                clearCallLogDialogFragment.A03 = (C16320sq) r227.ARB.get();
                clearCallLogDialogFragment.A04 = (AnonymousClass1SP) r227.A3G.get();
                clearCallLogDialogFragment.A01 = (AnonymousClass1D0) r227.A3P.get();
                clearCallLogDialogFragment.A02 = (C14760pi) r227.AFo.get();
            }
        } else if (this instanceof Hilt_ClearLocationDialogFragment) {
            Hilt_ClearLocationDialogFragment hilt_ClearLocationDialogFragment = (Hilt_ClearLocationDialogFragment) this;
            if (!hilt_ClearLocationDialogFragment.A02) {
                hilt_ClearLocationDialogFragment.A02 = true;
                ClearLocationDialogFragment clearLocationDialogFragment = (ClearLocationDialogFragment) hilt_ClearLocationDialogFragment;
                C16150sX r131 = ((C17050uS) ((C17060uT) hilt_ClearLocationDialogFragment.generatedComponent())).A0b;
                clearLocationDialogFragment.A01 = (C17070uU) r131.ABg.get();
                clearLocationDialogFragment.A03 = (C17080uV) r131.APK.get();
                clearLocationDialogFragment.A04 = (C14710pd) r131.A05.get();
                clearLocationDialogFragment.A02 = (AnonymousClass013) r131.AR8.get();
                clearLocationDialogFragment.A00 = (AnonymousClass1PX) r131.A1l.get();
            }
        } else if (this instanceof Hilt_BlockConfirmationDialogFragment) {
            Hilt_BlockConfirmationDialogFragment hilt_BlockConfirmationDialogFragment = (Hilt_BlockConfirmationDialogFragment) this;
            if (!hilt_BlockConfirmationDialogFragment.A02) {
                hilt_BlockConfirmationDialogFragment.A02 = true;
                BlockConfirmationDialogFragment blockConfirmationDialogFragment = (BlockConfirmationDialogFragment) hilt_BlockConfirmationDialogFragment;
                C16150sX r228 = ((C17050uS) ((C17060uT) hilt_BlockConfirmationDialogFragment.generatedComponent())).A0b;
                blockConfirmationDialogFragment.A01 = (C17070uU) r228.ABg.get();
                blockConfirmationDialogFragment.A03 = (C17080uV) r228.APK.get();
                blockConfirmationDialogFragment.A04 = (C14710pd) r228.A05.get();
                blockConfirmationDialogFragment.A02 = (AnonymousClass013) r228.AR8.get();
                blockConfirmationDialogFragment.A08 = (C16440t3) r228.AP2.get();
                blockConfirmationDialogFragment.A00 = (C14870pt) r228.AB3.get();
                blockConfirmationDialogFragment.A0A = (C16320sq) r228.ARB.get();
                blockConfirmationDialogFragment.A09 = (C16490t9) r228.AQz.get();
                blockConfirmationDialogFragment.A01 = (C15900s5) r228.ALm.get();
                blockConfirmationDialogFragment.A02 = (C16760tb) r228.APV.get();
                blockConfirmationDialogFragment.A05 = (C16000sG) r228.A4x.get();
                blockConfirmationDialogFragment.A06 = (C16080sP) r228.AQ9.get();
                blockConfirmationDialogFragment.A04 = (AnonymousClass01Y) r228.A1w.get();
                blockConfirmationDialogFragment.A07 = (C25931Lr) r228.AMs.get();
            }
        } else if (this instanceof Hilt_BlockReasonListFragment) {
            Hilt_BlockReasonListFragment hilt_BlockReasonListFragment = (Hilt_BlockReasonListFragment) this;
            if (!hilt_BlockReasonListFragment.A02) {
                hilt_BlockReasonListFragment.A02 = true;
                BlockReasonListFragment blockReasonListFragment = (BlockReasonListFragment) hilt_BlockReasonListFragment;
                C17050uS r33 = (C17050uS) ((C17060uT) hilt_BlockReasonListFragment.generatedComponent());
                C16150sX r229 = r33.A0b;
                blockReasonListFragment.A01 = (C17070uU) r229.ABg.get();
                blockReasonListFragment.A03 = (C17080uV) r229.APK.get();
                blockReasonListFragment.A04 = (C14710pd) r229.A05.get();
                blockReasonListFragment.A02 = (AnonymousClass013) r229.AR8.get();
                blockReasonListFragment.A07 = (C17250um) r229.A7e.get();
                blockReasonListFragment.A04 = (C16000sG) r229.A4x.get();
                blockReasonListFragment.A08 = r33.A0Y.A0I();
                blockReasonListFragment.A06 = (AnonymousClass01V) r229.AOi.get();
                blockReasonListFragment.A05 = (C16080sP) r229.AQ9.get();
                blockReasonListFragment.A09 = (C17020u3) r229.AMG.get();
            }
        } else if (this instanceof Hilt_SingleChoiceListDialogFragment) {
            Hilt_SingleChoiceListDialogFragment hilt_SingleChoiceListDialogFragment = (Hilt_SingleChoiceListDialogFragment) this;
            if (!hilt_SingleChoiceListDialogFragment.A02) {
                hilt_SingleChoiceListDialogFragment.A02 = true;
                SingleChoiceListDialogFragment singleChoiceListDialogFragment = (SingleChoiceListDialogFragment) hilt_SingleChoiceListDialogFragment;
                C16150sX r132 = ((C17050uS) ((C17060uT) hilt_SingleChoiceListDialogFragment.generatedComponent())).A0b;
                singleChoiceListDialogFragment.A01 = (C17070uU) r132.ABg.get();
                singleChoiceListDialogFragment.A03 = (C17080uV) r132.APK.get();
                singleChoiceListDialogFragment.A04 = (C14710pd) r132.A05.get();
                singleChoiceListDialogFragment.A02 = (AnonymousClass013) r132.AR8.get();
                singleChoiceListDialogFragment.A00 = (C14870pt) r132.AB3.get();
            }
        } else if (this instanceof Hilt_SettingsGoogleDrive_AuthRequestDialogFragment) {
            Hilt_SettingsGoogleDrive_AuthRequestDialogFragment hilt_SettingsGoogleDrive_AuthRequestDialogFragment = (Hilt_SettingsGoogleDrive_AuthRequestDialogFragment) this;
            if (!hilt_SettingsGoogleDrive_AuthRequestDialogFragment.A02) {
                hilt_SettingsGoogleDrive_AuthRequestDialogFragment.A02 = true;
                C16150sX r133 = ((C17050uS) ((C17060uT) hilt_SettingsGoogleDrive_AuthRequestDialogFragment.generatedComponent())).A0b;
                hilt_SettingsGoogleDrive_AuthRequestDialogFragment.A01 = (C17070uU) r133.ABg.get();
                hilt_SettingsGoogleDrive_AuthRequestDialogFragment.A03 = (C17080uV) r133.APK.get();
                hilt_SettingsGoogleDrive_AuthRequestDialogFragment.A04 = (C14710pd) r133.A05.get();
                hilt_SettingsGoogleDrive_AuthRequestDialogFragment.A02 = (AnonymousClass013) r133.AR8.get();
            }
        } else if (this instanceof Hilt_PromptDialogFragment) {
            Hilt_PromptDialogFragment hilt_PromptDialogFragment = (Hilt_PromptDialogFragment) this;
            if (!hilt_PromptDialogFragment.A02) {
                hilt_PromptDialogFragment.A02 = true;
                PromptDialogFragment promptDialogFragment = (PromptDialogFragment) hilt_PromptDialogFragment;
                C16150sX r134 = ((C17050uS) ((C17060uT) hilt_PromptDialogFragment.generatedComponent())).A0b;
                promptDialogFragment.A01 = (C17070uU) r134.ABg.get();
                promptDialogFragment.A03 = (C17080uV) r134.APK.get();
                promptDialogFragment.A04 = (C14710pd) r134.A05.get();
                promptDialogFragment.A02 = (AnonymousClass013) r134.AR8.get();
                promptDialogFragment.A01 = (AnonymousClass01V) r134.AOi.get();
            }
        } else if (this instanceof Hilt_VerifyTwoFactorAuthCodeDialogFragment) {
            Hilt_VerifyTwoFactorAuthCodeDialogFragment hilt_VerifyTwoFactorAuthCodeDialogFragment = (Hilt_VerifyTwoFactorAuthCodeDialogFragment) this;
            if (!hilt_VerifyTwoFactorAuthCodeDialogFragment.A02) {
                hilt_VerifyTwoFactorAuthCodeDialogFragment.A02 = true;
                VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment = (VerifyTwoFactorAuthCodeDialogFragment) hilt_VerifyTwoFactorAuthCodeDialogFragment;
                C16150sX r230 = ((C17050uS) ((C17060uT) hilt_VerifyTwoFactorAuthCodeDialogFragment.generatedComponent())).A0b;
                verifyTwoFactorAuthCodeDialogFragment.A01 = (C17070uU) r230.ABg.get();
                verifyTwoFactorAuthCodeDialogFragment.A03 = (C17080uV) r230.APK.get();
                verifyTwoFactorAuthCodeDialogFragment.A04 = (C14710pd) r230.A05.get();
                verifyTwoFactorAuthCodeDialogFragment.A02 = (AnonymousClass013) r230.AR8.get();
                verifyTwoFactorAuthCodeDialogFragment.A04 = (C14870pt) r230.AB3.get();
                verifyTwoFactorAuthCodeDialogFragment.A07 = (C16320sq) r230.ARB.get();
                verifyTwoFactorAuthCodeDialogFragment.A05 = (AnonymousClass01V) r230.AOi.get();
                verifyTwoFactorAuthCodeDialogFragment.A06 = (C14860ps) r230.API.get();
            }
        } else if (this instanceof Hilt_OpenLinkDialogFragment) {
            Hilt_OpenLinkDialogFragment hilt_OpenLinkDialogFragment = (Hilt_OpenLinkDialogFragment) this;
            if (hilt_OpenLinkDialogFragment instanceof Hilt_OpenLinkConfirmationDialogFragment) {
                Hilt_OpenLinkConfirmationDialogFragment hilt_OpenLinkConfirmationDialogFragment = (Hilt_OpenLinkConfirmationDialogFragment) hilt_OpenLinkDialogFragment;
                if (!hilt_OpenLinkConfirmationDialogFragment.A02) {
                    hilt_OpenLinkConfirmationDialogFragment.A02 = true;
                    C16150sX r231 = ((C17050uS) ((C17060uT) hilt_OpenLinkConfirmationDialogFragment.generatedComponent())).A0b;
                    hilt_OpenLinkConfirmationDialogFragment.A01 = (C17070uU) r231.ABg.get();
                    hilt_OpenLinkConfirmationDialogFragment.A03 = (C17080uV) r231.APK.get();
                    hilt_OpenLinkConfirmationDialogFragment.A04 = (C14710pd) r231.A05.get();
                    hilt_OpenLinkConfirmationDialogFragment.A02 = (AnonymousClass013) r231.AR8.get();
                    hilt_OpenLinkConfirmationDialogFragment.A00 = (C14870pt) r231.AB3.get();
                    hilt_OpenLinkConfirmationDialogFragment.A05 = (C17220uj) r231.A9x.get();
                    hilt_OpenLinkConfirmationDialogFragment.A02 = (AnonymousClass01V) r231.AOi.get();
                    hilt_OpenLinkConfirmationDialogFragment.A01 = (C17090uW) r231.ADM.get();
                    hilt_OpenLinkConfirmationDialogFragment.A03 = (AnonymousClass1L1) r231.ANR.get();
                }
            } else if (hilt_OpenLinkDialogFragment instanceof Hilt_SuspiciousLinkWarningDialogFragment) {
                Hilt_SuspiciousLinkWarningDialogFragment hilt_SuspiciousLinkWarningDialogFragment = (Hilt_SuspiciousLinkWarningDialogFragment) hilt_OpenLinkDialogFragment;
                if (!hilt_SuspiciousLinkWarningDialogFragment.A02) {
                    hilt_SuspiciousLinkWarningDialogFragment.A02 = true;
                    C16150sX r232 = ((C17050uS) ((C17060uT) hilt_SuspiciousLinkWarningDialogFragment.generatedComponent())).A0b;
                    hilt_SuspiciousLinkWarningDialogFragment.A01 = (C17070uU) r232.ABg.get();
                    hilt_SuspiciousLinkWarningDialogFragment.A03 = (C17080uV) r232.APK.get();
                    hilt_SuspiciousLinkWarningDialogFragment.A04 = (C14710pd) r232.A05.get();
                    hilt_SuspiciousLinkWarningDialogFragment.A02 = (AnonymousClass013) r232.AR8.get();
                    hilt_SuspiciousLinkWarningDialogFragment.A00 = (C14870pt) r232.AB3.get();
                    hilt_SuspiciousLinkWarningDialogFragment.A05 = (C17220uj) r232.A9x.get();
                    hilt_SuspiciousLinkWarningDialogFragment.A02 = (AnonymousClass01V) r232.AOi.get();
                    hilt_SuspiciousLinkWarningDialogFragment.A01 = (C17090uW) r232.ADM.get();
                    hilt_SuspiciousLinkWarningDialogFragment.A03 = (AnonymousClass1L1) r232.ANR.get();
                }
            } else if (!hilt_OpenLinkDialogFragment.A02) {
                hilt_OpenLinkDialogFragment.A02 = true;
                OpenLinkDialogFragment openLinkDialogFragment = (OpenLinkDialogFragment) hilt_OpenLinkDialogFragment;
                C16150sX r233 = ((C17050uS) ((C17060uT) hilt_OpenLinkDialogFragment.generatedComponent())).A0b;
                openLinkDialogFragment.A01 = (C17070uU) r233.ABg.get();
                openLinkDialogFragment.A03 = (C17080uV) r233.APK.get();
                openLinkDialogFragment.A04 = (C14710pd) r233.A05.get();
                openLinkDialogFragment.A02 = (AnonymousClass013) r233.AR8.get();
                openLinkDialogFragment.A00 = (C14870pt) r233.AB3.get();
                openLinkDialogFragment.A05 = (C17220uj) r233.A9x.get();
                openLinkDialogFragment.A02 = (AnonymousClass01V) r233.AOi.get();
                openLinkDialogFragment.A01 = (C17090uW) r233.ADM.get();
                openLinkDialogFragment.A03 = (AnonymousClass1L1) r233.ANR.get();
            }
        } else if (this instanceof Hilt_MuteDialogFragment) {
            Hilt_MuteDialogFragment hilt_MuteDialogFragment = (Hilt_MuteDialogFragment) this;
            if (!hilt_MuteDialogFragment.A02) {
                hilt_MuteDialogFragment.A02 = true;
                MuteDialogFragment muteDialogFragment = (MuteDialogFragment) hilt_MuteDialogFragment;
                C16150sX r234 = ((C17050uS) ((C17060uT) hilt_MuteDialogFragment.generatedComponent())).A0b;
                muteDialogFragment.A01 = (C17070uU) r234.ABg.get();
                muteDialogFragment.A03 = (C17080uV) r234.APK.get();
                muteDialogFragment.A04 = (C14710pd) r234.A05.get();
                muteDialogFragment.A02 = (AnonymousClass013) r234.AR8.get();
                muteDialogFragment.A06 = (C16440t3) r234.AP2.get();
                muteDialogFragment.A01 = (C14870pt) r234.AB3.get();
                muteDialogFragment.A0A = (C16320sq) r234.ARB.get();
                muteDialogFragment.A03 = (C16760tb) r234.APV.get();
                muteDialogFragment.A02 = (C15900s5) r234.ALm.get();
                muteDialogFragment.A05 = (C16000sG) r234.A4x.get();
                muteDialogFragment.A09 = (C16220sf) r234.A3y.get();
                muteDialogFragment.A04 = (AnonymousClass127) r234.A3z.get();
                muteDialogFragment.A07 = (C15860rz) r234.AQh.get();
                muteDialogFragment.A08 = (AnonymousClass11A) r234.A5U.get();
            }
        } else if (this instanceof Hilt_DisplayExceptionDialogFactory_UnsupportedDeviceDialogFragment) {
            Hilt_DisplayExceptionDialogFactory_UnsupportedDeviceDialogFragment hilt_DisplayExceptionDialogFactory_UnsupportedDeviceDialogFragment = (Hilt_DisplayExceptionDialogFactory_UnsupportedDeviceDialogFragment) this;
            if (!hilt_DisplayExceptionDialogFactory_UnsupportedDeviceDialogFragment.A02) {
                hilt_DisplayExceptionDialogFactory_UnsupportedDeviceDialogFragment.A02 = true;
                C16150sX r135 = ((C17050uS) ((C17060uT) hilt_DisplayExceptionDialogFactory_UnsupportedDeviceDialogFragment.generatedComponent())).A0b;
                hilt_DisplayExceptionDialogFactory_UnsupportedDeviceDialogFragment.A01 = (C17070uU) r135.ABg.get();
                hilt_DisplayExceptionDialogFactory_UnsupportedDeviceDialogFragment.A03 = (C17080uV) r135.APK.get();
                hilt_DisplayExceptionDialogFactory_UnsupportedDeviceDialogFragment.A04 = (C14710pd) r135.A05.get();
                hilt_DisplayExceptionDialogFactory_UnsupportedDeviceDialogFragment.A02 = (AnonymousClass013) r135.AR8.get();
            }
        } else if (this instanceof Hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment) {
            Hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment = (Hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment) this;
            if (!hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment.A02) {
                hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment.A02 = true;
                DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment displayExceptionDialogFactory$SoftwareExpiredDialogFragment = (DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment) hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment;
                C16150sX r235 = ((C17050uS) ((C17060uT) hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment.generatedComponent())).A0b;
                displayExceptionDialogFactory$SoftwareExpiredDialogFragment.A01 = (C17070uU) r235.ABg.get();
                displayExceptionDialogFactory$SoftwareExpiredDialogFragment.A03 = (C17080uV) r235.APK.get();
                displayExceptionDialogFactory$SoftwareExpiredDialogFragment.A04 = (C14710pd) r235.A05.get();
                displayExceptionDialogFactory$SoftwareExpiredDialogFragment.A02 = (AnonymousClass013) r235.AR8.get();
                displayExceptionDialogFactory$SoftwareExpiredDialogFragment.A04 = (C16440t3) r235.AP2.get();
                displayExceptionDialogFactory$SoftwareExpiredDialogFragment.A02 = (C18890xQ) r235.APS.get();
                displayExceptionDialogFactory$SoftwareExpiredDialogFragment.A01 = (C18900xR) r235.ALD.get();
                displayExceptionDialogFactory$SoftwareExpiredDialogFragment.A00 = (C19980zJ) r235.A0P.get();
                displayExceptionDialogFactory$SoftwareExpiredDialogFragment.A03 = (AnonymousClass01V) r235.AOi.get();
            }
        } else if (this instanceof Hilt_DisplayExceptionDialogFactory_SoftwareAboutToExpireDialogFragment) {
            Hilt_DisplayExceptionDialogFactory_SoftwareAboutToExpireDialogFragment hilt_DisplayExceptionDialogFactory_SoftwareAboutToExpireDialogFragment = (Hilt_DisplayExceptionDialogFactory_SoftwareAboutToExpireDialogFragment) this;
            if (!hilt_DisplayExceptionDialogFactory_SoftwareAboutToExpireDialogFragment.A02) {
                hilt_DisplayExceptionDialogFactory_SoftwareAboutToExpireDialogFragment.A02 = true;
                DisplayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment displayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment = (DisplayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment) hilt_DisplayExceptionDialogFactory_SoftwareAboutToExpireDialogFragment;
                C16150sX r136 = ((C17050uS) ((C17060uT) hilt_DisplayExceptionDialogFactory_SoftwareAboutToExpireDialogFragment.generatedComponent())).A0b;
                displayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment.A01 = (C17070uU) r136.ABg.get();
                displayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment.A03 = (C17080uV) r136.APK.get();
                displayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment.A04 = (C14710pd) r136.A05.get();
                displayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment.A02 = (AnonymousClass013) r136.AR8.get();
                displayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment.A01 = (C18890xQ) r136.APS.get();
                displayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment.A00 = (C25951Lt) r136.AMp.get();
            }
        } else if (this instanceof Hilt_DisplayExceptionDialogFactory_LoginFailedDialogFragment) {
            Hilt_DisplayExceptionDialogFactory_LoginFailedDialogFragment hilt_DisplayExceptionDialogFactory_LoginFailedDialogFragment = (Hilt_DisplayExceptionDialogFactory_LoginFailedDialogFragment) this;
            if (!hilt_DisplayExceptionDialogFactory_LoginFailedDialogFragment.A02) {
                hilt_DisplayExceptionDialogFactory_LoginFailedDialogFragment.A02 = true;
                DisplayExceptionDialogFactory$LoginFailedDialogFragment displayExceptionDialogFactory$LoginFailedDialogFragment = (DisplayExceptionDialogFactory$LoginFailedDialogFragment) hilt_DisplayExceptionDialogFactory_LoginFailedDialogFragment;
                C16150sX r236 = ((C17050uS) ((C17060uT) hilt_DisplayExceptionDialogFactory_LoginFailedDialogFragment.generatedComponent())).A0b;
                displayExceptionDialogFactory$LoginFailedDialogFragment.A01 = (C17070uU) r236.ABg.get();
                displayExceptionDialogFactory$LoginFailedDialogFragment.A03 = (C17080uV) r236.APK.get();
                displayExceptionDialogFactory$LoginFailedDialogFragment.A04 = (C14710pd) r236.A05.get();
                displayExceptionDialogFactory$LoginFailedDialogFragment.A02 = (AnonymousClass013) r236.AR8.get();
                displayExceptionDialogFactory$LoginFailedDialogFragment.A00 = (C16440t3) r236.AP2.get();
                displayExceptionDialogFactory$LoginFailedDialogFragment.A01 = (C15860rz) r236.AQh.get();
                displayExceptionDialogFactory$LoginFailedDialogFragment.A02 = (C19760yx) r236.AKx.get();
            }
        } else if (this instanceof Hilt_DisplayExceptionDialogFactory_DoNotShareCodeDialogFragment) {
            Hilt_DisplayExceptionDialogFactory_DoNotShareCodeDialogFragment hilt_DisplayExceptionDialogFactory_DoNotShareCodeDialogFragment = (Hilt_DisplayExceptionDialogFactory_DoNotShareCodeDialogFragment) this;
            if (!hilt_DisplayExceptionDialogFactory_DoNotShareCodeDialogFragment.A02) {
                hilt_DisplayExceptionDialogFactory_DoNotShareCodeDialogFragment.A02 = true;
                DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment displayExceptionDialogFactory$DoNotShareCodeDialogFragment = (DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment) hilt_DisplayExceptionDialogFactory_DoNotShareCodeDialogFragment;
                C16150sX r137 = ((C17050uS) ((C17060uT) hilt_DisplayExceptionDialogFactory_DoNotShareCodeDialogFragment.generatedComponent())).A0b;
                displayExceptionDialogFactory$DoNotShareCodeDialogFragment.A01 = (C17070uU) r137.ABg.get();
                displayExceptionDialogFactory$DoNotShareCodeDialogFragment.A03 = (C17080uV) r137.APK.get();
                displayExceptionDialogFactory$DoNotShareCodeDialogFragment.A04 = (C14710pd) r137.A05.get();
                displayExceptionDialogFactory$DoNotShareCodeDialogFragment.A02 = (AnonymousClass013) r137.AR8.get();
                displayExceptionDialogFactory$DoNotShareCodeDialogFragment.A00 = (C19980zJ) r137.A0P.get();
                displayExceptionDialogFactory$DoNotShareCodeDialogFragment.A01 = (C17220uj) r137.A9x.get();
            }
        } else if (this instanceof Hilt_DisplayExceptionDialogFactory_ContactBlockedDialogFragment) {
            Hilt_DisplayExceptionDialogFactory_ContactBlockedDialogFragment hilt_DisplayExceptionDialogFactory_ContactBlockedDialogFragment = (Hilt_DisplayExceptionDialogFactory_ContactBlockedDialogFragment) this;
            if (!hilt_DisplayExceptionDialogFactory_ContactBlockedDialogFragment.A02) {
                hilt_DisplayExceptionDialogFactory_ContactBlockedDialogFragment.A02 = true;
                DisplayExceptionDialogFactory$ContactBlockedDialogFragment displayExceptionDialogFactory$ContactBlockedDialogFragment = (DisplayExceptionDialogFactory$ContactBlockedDialogFragment) hilt_DisplayExceptionDialogFactory_ContactBlockedDialogFragment;
                C16150sX r138 = ((C17050uS) ((C17060uT) hilt_DisplayExceptionDialogFactory_ContactBlockedDialogFragment.generatedComponent())).A0b;
                displayExceptionDialogFactory$ContactBlockedDialogFragment.A01 = (C17070uU) r138.ABg.get();
                displayExceptionDialogFactory$ContactBlockedDialogFragment.A03 = (C17080uV) r138.APK.get();
                displayExceptionDialogFactory$ContactBlockedDialogFragment.A04 = (C14710pd) r138.A05.get();
                displayExceptionDialogFactory$ContactBlockedDialogFragment.A02 = (AnonymousClass013) r138.AR8.get();
                displayExceptionDialogFactory$ContactBlockedDialogFragment.A00 = (AnonymousClass01Y) r138.A1w.get();
            }
        } else if (this instanceof Hilt_DisplayExceptionDialogFactory_CompanionModeIncorrectAccessFragment) {
            Hilt_DisplayExceptionDialogFactory_CompanionModeIncorrectAccessFragment hilt_DisplayExceptionDialogFactory_CompanionModeIncorrectAccessFragment = (Hilt_DisplayExceptionDialogFactory_CompanionModeIncorrectAccessFragment) this;
            if (!hilt_DisplayExceptionDialogFactory_CompanionModeIncorrectAccessFragment.A02) {
                hilt_DisplayExceptionDialogFactory_CompanionModeIncorrectAccessFragment.A02 = true;
                DisplayExceptionDialogFactory$CompanionModeIncorrectAccessFragment displayExceptionDialogFactory$CompanionModeIncorrectAccessFragment = (DisplayExceptionDialogFactory$CompanionModeIncorrectAccessFragment) hilt_DisplayExceptionDialogFactory_CompanionModeIncorrectAccessFragment;
                C17050uS r139 = (C17050uS) ((C17060uT) hilt_DisplayExceptionDialogFactory_CompanionModeIncorrectAccessFragment.generatedComponent());
                C16150sX r34 = r139.A0b;
                displayExceptionDialogFactory$CompanionModeIncorrectAccessFragment.A01 = (C17070uU) r34.ABg.get();
                displayExceptionDialogFactory$CompanionModeIncorrectAccessFragment.A03 = (C17080uV) r34.APK.get();
                displayExceptionDialogFactory$CompanionModeIncorrectAccessFragment.A04 = (C14710pd) r34.A05.get();
                displayExceptionDialogFactory$CompanionModeIncorrectAccessFragment.A02 = (AnonymousClass013) r34.AR8.get();
                displayExceptionDialogFactory$CompanionModeIncorrectAccessFragment.A00 = (C14870pt) r34.AB3.get();
                displayExceptionDialogFactory$CompanionModeIncorrectAccessFragment.A01 = (C16040sK) r34.ADr.get();
                displayExceptionDialogFactory$CompanionModeIncorrectAccessFragment.A05 = (C16320sq) r34.ARB.get();
                displayExceptionDialogFactory$CompanionModeIncorrectAccessFragment.A04 = (C19760yx) r34.AKx.get();
                displayExceptionDialogFactory$CompanionModeIncorrectAccessFragment.A02 = new C15480r5((C19110xm) r139.A0Y.A0E.get());
                displayExceptionDialogFactory$CompanionModeIncorrectAccessFragment.A03 = (C19710ys) r34.A4f.get();
            }
        } else if (this instanceof Hilt_DisplayExceptionDialogFactory_ClockWrongDialogFragment) {
            Hilt_DisplayExceptionDialogFactory_ClockWrongDialogFragment hilt_DisplayExceptionDialogFactory_ClockWrongDialogFragment = (Hilt_DisplayExceptionDialogFactory_ClockWrongDialogFragment) this;
            if (!hilt_DisplayExceptionDialogFactory_ClockWrongDialogFragment.A02) {
                hilt_DisplayExceptionDialogFactory_ClockWrongDialogFragment.A02 = true;
                DisplayExceptionDialogFactory$ClockWrongDialogFragment displayExceptionDialogFactory$ClockWrongDialogFragment = (DisplayExceptionDialogFactory$ClockWrongDialogFragment) hilt_DisplayExceptionDialogFactory_ClockWrongDialogFragment;
                C16150sX r237 = ((C17050uS) ((C17060uT) hilt_DisplayExceptionDialogFactory_ClockWrongDialogFragment.generatedComponent())).A0b;
                displayExceptionDialogFactory$ClockWrongDialogFragment.A01 = (C17070uU) r237.ABg.get();
                displayExceptionDialogFactory$ClockWrongDialogFragment.A03 = (C17080uV) r237.APK.get();
                displayExceptionDialogFactory$ClockWrongDialogFragment.A04 = (C14710pd) r237.A05.get();
                displayExceptionDialogFactory$ClockWrongDialogFragment.A02 = (AnonymousClass013) r237.AR8.get();
                displayExceptionDialogFactory$ClockWrongDialogFragment.A02 = (C16440t3) r237.AP2.get();
                displayExceptionDialogFactory$ClockWrongDialogFragment.A00 = (C18900xR) r237.ALD.get();
                displayExceptionDialogFactory$ClockWrongDialogFragment.A01 = (AnonymousClass01V) r237.AOi.get();
            }
        } else if (this instanceof Hilt_CallConfirmationFragment) {
            Hilt_CallConfirmationFragment hilt_CallConfirmationFragment = (Hilt_CallConfirmationFragment) this;
            if (!hilt_CallConfirmationFragment.A02) {
                hilt_CallConfirmationFragment.A02 = true;
                CallConfirmationFragment callConfirmationFragment = (CallConfirmationFragment) hilt_CallConfirmationFragment;
                C16150sX r238 = ((C17050uS) ((C17060uT) hilt_CallConfirmationFragment.generatedComponent())).A0b;
                callConfirmationFragment.A01 = (C17070uU) r238.ABg.get();
                callConfirmationFragment.A03 = (C17080uV) r238.APK.get();
                callConfirmationFragment.A04 = (C14710pd) r238.A05.get();
                callConfirmationFragment.A02 = (AnonymousClass013) r238.AR8.get();
                callConfirmationFragment.A00 = (C16040sK) r238.ADr.get();
                callConfirmationFragment.A01 = (C204310c) r238.A3O.get();
                callConfirmationFragment.A02 = (C16000sG) r238.A4x.get();
                callConfirmationFragment.A03 = (C15860rz) r238.AQh.get();
                callConfirmationFragment.A04 = (C16070sO) r238.ABY.get();
            }
        } else if (this instanceof Hilt_BaseMessageDialogFragment) {
            Hilt_BaseMessageDialogFragment hilt_BaseMessageDialogFragment = (Hilt_BaseMessageDialogFragment) this;
            if (hilt_BaseMessageDialogFragment instanceof Hilt_LegacyMessageDialogFragment) {
                Hilt_LegacyMessageDialogFragment hilt_LegacyMessageDialogFragment = (Hilt_LegacyMessageDialogFragment) hilt_BaseMessageDialogFragment;
                if (!hilt_LegacyMessageDialogFragment.A02) {
                    hilt_LegacyMessageDialogFragment.A02 = true;
                    LegacyMessageDialogFragment legacyMessageDialogFragment = (LegacyMessageDialogFragment) hilt_LegacyMessageDialogFragment;
                    C16150sX r140 = ((C17050uS) ((C17060uT) hilt_LegacyMessageDialogFragment.generatedComponent())).A0b;
                    legacyMessageDialogFragment.A01 = (C17070uU) r140.ABg.get();
                    legacyMessageDialogFragment.A03 = (C17080uV) r140.APK.get();
                    legacyMessageDialogFragment.A04 = (C14710pd) r140.A05.get();
                    legacyMessageDialogFragment.A02 = (AnonymousClass013) r140.AR8.get();
                    legacyMessageDialogFragment.A02 = (C17250um) r140.A7e.get();
                }
            } else if (!hilt_BaseMessageDialogFragment.A02) {
                hilt_BaseMessageDialogFragment.A02 = true;
                C16150sX r141 = ((C17050uS) ((C17060uT) hilt_BaseMessageDialogFragment.generatedComponent())).A0b;
                hilt_BaseMessageDialogFragment.A01 = (C17070uU) r141.ABg.get();
                hilt_BaseMessageDialogFragment.A03 = (C17080uV) r141.APK.get();
                hilt_BaseMessageDialogFragment.A04 = (C14710pd) r141.A05.get();
                hilt_BaseMessageDialogFragment.A02 = (AnonymousClass013) r141.AR8.get();
            }
        } else if (!this.A02) {
            this.A02 = true;
            WaDialogFragment waDialogFragment = (WaDialogFragment) this;
            C16150sX r142 = ((C17050uS) ((C17060uT) generatedComponent())).A0b;
            waDialogFragment.A01 = (C17070uU) r142.ABg.get();
            waDialogFragment.A03 = (C17080uV) r142.APK.get();
            waDialogFragment.A04 = (C14710pd) r142.A05.get();
            waDialogFragment.A02 = (AnonymousClass013) r142.AR8.get();
        }
    }

    public AnonymousClass04o ABj() {
        return AnonymousClass2TA.A01(this, super.ABj());
    }

    public final Object generatedComponent() {
        if (this.A04 == null) {
            synchronized (this.A03) {
                if (this.A04 == null) {
                    this.A04 = new C54442hW(this);
                }
            }
        }
        return this.A04.generatedComponent();
    }
}
