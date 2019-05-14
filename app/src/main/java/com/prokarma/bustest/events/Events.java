package com.prokarma.bustest.events;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({Events.INTENT, Events.CONFIGURATION, Events.REPORT, Events.ANALYTICS})
@Retention(RetentionPolicy.SOURCE)
public  @interface Events {
    int INTENT = 1;

    int CONFIGURATION = 2;

    int REPORT = 3;

    int ANALYTICS = 4;
}
