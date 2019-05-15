package com.fbatista.rxjavapracticing

import io.reactivex.Observable

/**
 * Created by Fernando Batista on 14/05/19.
 */

object ObservablesCollection {

    fun StringObservable(): Observable<String> = Observable.just("This is a really simple event data")


}