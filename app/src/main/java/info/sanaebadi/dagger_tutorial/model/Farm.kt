package info.sanaebadi.dagger_tutorial.model

import javax.inject.Inject

class Farm @Inject constructor() {


    fun getBeans(): String {
        return "Beans"
    }
}