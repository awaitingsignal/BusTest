package com.prokarma.bustest.bus;

import com.prokarma.bustest.model.DataItem;
import com.prokarma.bustest.model.PlayerResponse;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

public class PlayerResponseBus {

    private PublishSubject<List<DataItem>> subject = PublishSubject.create();

    public void setPlayerResponse(PlayerResponse playerResponse) {
        subject.onNext(playerResponse.getData());

    }

    public Observable<List<DataItem>> getPlayers() {
        return subject;
    }
}
