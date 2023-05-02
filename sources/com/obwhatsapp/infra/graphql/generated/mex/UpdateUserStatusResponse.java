package com.obwhatsapp.infra.graphql.generated.mex;

import X.C34641kb;

public interface UpdateUserStatusResponse {

    public interface Xwa2UsersUpdatesSince {

        public interface Updates {

            public interface InlineXWA2UserStatusUpdate {
                String getDhash();

                String getText();
            }

            InlineXWA2UserStatusUpdate asInlineXWA2UserStatusUpdate();
        }

        String getJid();

        C34641kb getUpdates();
    }

    C34641kb getXwa2UsersUpdatesSince();
}
