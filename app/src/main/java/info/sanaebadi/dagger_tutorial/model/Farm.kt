package info.sanaebadi.dagger_tutorial.model

import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class Farm @Inject constructor() {


    fun getBeans(): String {
        return "Beans"
    }
}