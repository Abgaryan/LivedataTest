package com.matso.livedatatest

import androidx.lifecycle.LiveData

fun <T> LiveData<T>.test(): LiveDataTestObserver<T> {
    return LiveDataTestObserver.test(this)
}
