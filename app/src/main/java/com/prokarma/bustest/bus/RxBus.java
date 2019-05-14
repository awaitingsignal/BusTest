package com.prokarma.bustest.bus;

import com.prokarma.bustest.events.Events;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
@Singleton
public class RxBus {
    
    private static final  PublishSubject<Integer> bus = PublishSubject.create();

    @Inject
    RxBus() {
    }

    public void send(@Events Integer events) {
        bus.onNext(events);
    }

    public Observable<Integer> getObservable() {
        return bus;
    }
}
